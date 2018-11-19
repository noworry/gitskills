package com.no.learn.javaskills.java8.features.language;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * The repeating annotations should be themselves annotated with @Repeatable annotation.
 * In fact, it is not a language change but more a compiler trick as underneath the technique stays the same.
 */
public class RepeatingAnnotations implements FeatureDemo {

    @Override
    public void run() {
        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter.value());
        }
        for (Annotation annotation : Filterable.class.getAnnotations()) {
            System.out.println(annotation.annotationType());
        }
        System.out.println(Filterable.class.getAnnotation(Filter.class));
        System.out.println(Filterable.class.getAnnotation(Filters.class));
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }

    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {

    }
}

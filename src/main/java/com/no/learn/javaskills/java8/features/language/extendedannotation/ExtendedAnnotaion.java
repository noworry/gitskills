package com.no.learn.javaskills.java8.features.language.extendedannotation;

import java.util.ArrayList;
import java.util.Collection;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/19.
 */
public class ExtendedAnnotaion implements FeatureDemo {
    @Override
    public void run() {
        // The ElementType.TYPE_USE and ElementType.TYPE_PARAMETER are two new element types to describe the
        // applicable annotation context. The Annotation Processing API also underwent some minor changes to
        // recognize those new type annotations in the Java programming language.
        final Holder<String> holder = new @NonEmpty Holder<String>();
        @NonEmpty Collection<@NonEmpty String> strings = new ArrayList<>();
    }

    public static class Holder<@NonEmpty T> extends @NonEmpty Object {
        public void method() throws @NonEmpty Exception {
        }
    }

}

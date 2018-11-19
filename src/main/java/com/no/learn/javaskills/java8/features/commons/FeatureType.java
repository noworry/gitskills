package com.no.learn.javaskills.java8.features.commons;

/**
 * @author zyr created on 2018/11/4.
 */
public enum FeatureType {
    LAMBDA(Aspect.LANGUAGE),
    FUNCTIONAL_INTERFACE(Aspect.LANGUAGE),
    INTERFACE_METHOD(Aspect.LANGUAGE),
    METHOD_REFERENCE(Aspect.LANGUAGE),
    REPEATING_ANNOTATION(Aspect.LANGUAGE),
    BETTER_TYPE_REFERENCE(Aspect.LANGUAGE),
    EXTENDED_ANNOTATION(Aspect.LANGUAGE),
    PARAMETER_NAME(Aspect.COMPILER),
    OPTIONAL_LIB(Aspect.LIBRARIES),
    STREAM_LIB(Aspect.LIBRARIES),
    DATETIME_LIB(Aspect.LIBRARIES),
    PARALLEL_ARRAY(Aspect.LIBRARIES);

    private Aspect aspect;

    public Aspect getAspect() {
        return aspect;
    }

    FeatureType(Aspect aspect) {
        this.aspect = aspect;
    }
}

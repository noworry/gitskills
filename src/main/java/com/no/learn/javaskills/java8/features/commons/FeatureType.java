package com.no.learn.javaskills.java8.features.commons;

/**
 * @author zyr created on 2018/11/4.
 */
public enum FeatureType {
    LAMBDA(Aspect.LANGUAGE),
    FUNCTIONAL_INTERFACE(Aspect.LANGUAGE);

    private Aspect aspect;

    public Aspect getAspect() {
        return aspect;
    }

    FeatureType(Aspect aspect) {
        this.aspect = aspect;
    }
}

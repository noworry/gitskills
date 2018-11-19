package com.no.learn.javaskills.java8.features;

import java.util.function.Supplier;

import com.no.learn.javaskills.java8.features.commons.Aspect;
import com.no.learn.javaskills.java8.features.commons.FeatureType;

/**
 * @author zyr created on 2018/11/4.
 */
public interface Feature {

    Aspect aspect();

    FeatureType type();

    void addDemo(Supplier<FeatureDemo> supplier);

    void runDemos();

}

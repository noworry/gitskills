package com.no.learn.javaskills.java8.features;

/**
 * @author zyr created on 2018/11/4.
 */
public interface FeatureDemo {

    default String identity() {
        return this.getClass().getSimpleName();
    }

    void run();
}

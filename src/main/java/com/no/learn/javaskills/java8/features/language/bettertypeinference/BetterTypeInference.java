package com.no.learn.javaskills.java8.features.language.bettertypeinference;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/19.
 */
public class BetterTypeInference implements FeatureDemo {
    @Override
    public void run() {
        // The type parameter of Value.defaultValue()is inferred and is not required to be provided. In Java 7, the
        // same example will not compile and should be rewritten to Value.< String >defaultValue().
        Value<String> value = new Value<>();
        System.out.println(value.getOrDefault("20181119", Value.defaultValue()));
    }
}

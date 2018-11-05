package com.no.learn.javaskills.java8.features.lambda;

import java.util.Arrays;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/4.
 */
public class LambdaConstruct implements FeatureDemo {

    @Override
    public void run() {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));
        Arrays.asList("a", "b", "d").forEach(e -> {
            System.out.println(e);
            System.out.println(e);
        });
    }
}

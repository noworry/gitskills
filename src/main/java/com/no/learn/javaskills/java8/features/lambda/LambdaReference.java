package com.no.learn.javaskills.java8.features.lambda;

import java.util.Arrays;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/5.
 */
public class LambdaReference implements FeatureDemo {

    @Override
    public void run() {
        String separator = ",";
        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.print(e + separator));

        System.out.println();

        // equals
        final String seperator2 = ";";
        Arrays.asList("a", "b", "d").forEach(e -> System.out.print(e + seperator2));

        System.out.println();
    }
}

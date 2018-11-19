package com.no.learn.javaskills.java8.features.language.lambda;

import java.util.Arrays;
import java.util.Comparator;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/5.
 */
public class LambdaReturns implements FeatureDemo {

    @Override
    public void run() {
        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));
        // equals
        Arrays.asList("a", "b", "d").sort(Comparator.naturalOrder());
        // equals
        Arrays.asList("a", "b", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });

    }
}

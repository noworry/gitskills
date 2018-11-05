package com.no.learn.javaskills.java8.features;

import java.util.Arrays;

import com.no.learn.javaskills.java8.features.commons.FeatureType;

/**
 * @author zyr created on 2018/11/4.
 */
public class Runner {

    public static void main(String[] args) {
        Arrays.stream(FeatureType.values()).forEach(featureType -> {
            Feature feature = FeatureFactory.build(featureType);
            feature.runDemos();
        });
    }
}

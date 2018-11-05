package com.no.learn.javaskills.java8.features;

import com.no.learn.javaskills.java8.features.commons.FeatureType;
import com.no.learn.javaskills.java8.features.functional.FunctionalInterface;
import com.no.learn.javaskills.java8.features.lambda.LambdaConstruct;
import com.no.learn.javaskills.java8.features.lambda.LambdaReference;
import com.no.learn.javaskills.java8.features.lambda.LambdaReturns;

/**
 * @author zyr created on 2018/11/5.
 */
public class FeatureFactory {

    public static Feature build(FeatureType featureType) {
        BaseFeature feature = new BaseFeature(featureType);
        if (featureType.equals(FeatureType.LAMBDA)) {
            feature.addDemos(new LambdaConstruct());
            feature.addDemos(new LambdaReference());
            feature.addDemos(new LambdaReturns());
        } else if (featureType.equals(FeatureType.FUNCTIONAL_INTERFACE)) {
            feature.addDemos(new FunctionalInterface());
        }
        return feature;
    }
}

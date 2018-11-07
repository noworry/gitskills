package com.no.learn.javaskills.java8.features;

import com.no.learn.javaskills.java8.features.commons.FeatureType;
import com.no.learn.javaskills.java8.features.functional.FunctionalInterface;
import com.no.learn.javaskills.java8.features.interfacemethod.DefaultMethod;
import com.no.learn.javaskills.java8.features.interfacemethod.StaticMethod;
import com.no.learn.javaskills.java8.features.lambda.LambdaConstruct;
import com.no.learn.javaskills.java8.features.lambda.LambdaReference;
import com.no.learn.javaskills.java8.features.lambda.LambdaReturns;

/**
 * @author zyr created on 2018/11/5.
 */
public interface FeatureFactory {

    static Feature build(FeatureType featureType) {
        BaseFeature feature = new BaseFeature(featureType);
        if (featureType.equals(FeatureType.LAMBDA)) {
            feature.addDemos(LambdaConstruct::new);
            feature.addDemos(LambdaReference::new);
            feature.addDemos(LambdaReturns::new);
        } else if (featureType.equals(FeatureType.FUNCTIONAL_INTERFACE)) {
            feature.addDemos(FunctionalInterface::new);
        } else if (featureType.equals(FeatureType.INTERFACE_METHOD)) {
            feature.addDemos(DefaultMethod::new);
            feature.addDemos(StaticMethod::new);
        }
        return feature;
    }
}

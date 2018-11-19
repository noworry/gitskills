package com.no.learn.javaskills.java8.features;

import com.no.learn.javaskills.java8.features.commons.FeatureType;
import com.no.learn.javaskills.java8.features.compiler.paramname.ParameterNames;
import com.no.learn.javaskills.java8.features.language.RepeatingAnnotations;
import com.no.learn.javaskills.java8.features.language.bettertypeinference.BetterTypeInference;
import com.no.learn.javaskills.java8.features.language.extendedannotation.ExtendedAnnotaion;
import com.no.learn.javaskills.java8.features.language.functional.FunctionalInterface;
import com.no.learn.javaskills.java8.features.language.interfacemethod.DefaultMethod;
import com.no.learn.javaskills.java8.features.language.interfacemethod.StaticMethod;
import com.no.learn.javaskills.java8.features.language.lambda.LambdaConstruct;
import com.no.learn.javaskills.java8.features.language.lambda.LambdaReference;
import com.no.learn.javaskills.java8.features.language.lambda.LambdaReturns;
import com.no.learn.javaskills.java8.features.language.methodreference.MethodReference;
import com.no.learn.javaskills.java8.features.library.DateTimeLib;
import com.no.learn.javaskills.java8.features.library.OptionalLib;
import com.no.learn.javaskills.java8.features.library.ParallelArrays;
import com.no.learn.javaskills.java8.features.library.StreamLib;

/**
 * @author zyr created on 2018/11/5.
 */
public interface FeatureFactory {

    static Feature build(FeatureType featureType) {
        BaseFeature feature = new BaseFeature(featureType);
        if (featureType.equals(FeatureType.LAMBDA)) {
            feature.addDemo(LambdaConstruct::new);
            feature.addDemo(LambdaReference::new);
            feature.addDemo(LambdaReturns::new);
        } else if (featureType.equals(FeatureType.FUNCTIONAL_INTERFACE)) {
            feature.addDemo(FunctionalInterface::new);
        } else if (featureType.equals(FeatureType.INTERFACE_METHOD)) {
            feature.addDemo(DefaultMethod::new);
            feature.addDemo(StaticMethod::new);
        } else if (featureType.equals(FeatureType.METHOD_REFERENCE)) {
            feature.addDemo(MethodReference::new);
        } else if (featureType.equals(FeatureType.REPEATING_ANNOTATION)) {
            feature.addDemo(RepeatingAnnotations::new);
        } else if (featureType.equals(FeatureType.BETTER_TYPE_REFERENCE)) {
            feature.addDemo(BetterTypeInference::new);
        } else if (featureType.equals(FeatureType.EXTENDED_ANNOTATION)) {
            feature.addDemo(ExtendedAnnotaion::new);
        } else if (featureType.equals(FeatureType.PARAMETER_NAME)) {
            feature.addDemo(ParameterNames::new);
        } else if (featureType.equals(FeatureType.OPTIONAL_LIB)) {
            feature.addDemo(OptionalLib::new);
        } else if (featureType.equals(FeatureType.STREAM_LIB)) {
            feature.addDemo(StreamLib::new);
        } else if (featureType.equals(FeatureType.DATETIME_LIB)) {
            feature.addDemo(DateTimeLib::new);
        } else if (featureType.equals(FeatureType.PARALLEL_ARRAY)) {
            feature.addDemo(ParallelArrays::new);
        }
        return feature;
    }
}

package com.no.learn.javaskills.java8.features;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.no.learn.javaskills.java8.features.commons.Aspect;
import com.no.learn.javaskills.java8.features.commons.FeatureType;

/**
 * @author zyr created on 2018/11/4.
 */
public class BaseFeature implements Feature {

    public BaseFeature(FeatureType featureType) {
        this.featureType = featureType;
    }

    protected FeatureType featureType;

    protected Map<String, FeatureDemo> demos = new LinkedHashMap<>();

    public void addDemos(Supplier<FeatureDemo> supplier) {
        FeatureDemo featureDemo = supplier.get();
        this.demos.put(featureDemo.identity(), featureDemo);
    }

    @Override

    public Aspect aspect() {
        return featureType.getAspect();
    }

    @Override
    public FeatureType type() {
        return featureType;
    }

    @Override
    public void runDemos() {
        System.out.println("Begin to run demos of feature " + aspect() + " " + type());
        demos.forEach((key, demo) -> {
            System.out.println("Enter demo " + demo.identity() + " >>>>>>>>>>");
            demo.run();
            System.out.println("End demo " + demo.identity() + " ==========");
        });
        System.out.println();
        System.out.println();
    }
}

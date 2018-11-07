package com.no.learn.javaskills.java8.features.interfacemethod;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/7.
 */
public class StaticMethod implements FeatureDemo {
    @Override
    public void run() {
        System.out.println(DefaultableFactory.create(DefaultableImpl::new));
        System.out.println(DefaultableFactory.create(OverridableImpl::new));
    }
}

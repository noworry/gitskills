package com.no.learn.javaskills.java8.features.interfacemethod;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/6.
 */
public class DefaultMethod implements FeatureDemo {

    @Override
    public void run() {
        System.out.println(new DefaultableImpl().notRequired());
        System.out.println(new OverridableImpl().notRequired());
    }
}

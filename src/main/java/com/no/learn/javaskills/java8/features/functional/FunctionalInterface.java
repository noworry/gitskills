package com.no.learn.javaskills.java8.features.functional;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/5.
 */

public class FunctionalInterface implements FeatureDemo {

    @Override
    public void run() {
        carryOutWork(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in anonymous class impl...");
            }
        });
        carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
    }

    private static void carryOutWork(SimpleFuncInterface sfi) {
        sfi.doWork();
    }

}

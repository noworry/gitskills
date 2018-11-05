package com.no.learn.javaskills.java8.features.functional;

/**
 * @author zyr created on 2018/11/5.
 */

/**
 * Single Abstract Method interfaces (SAM Interfaces)
 */
@java.lang.FunctionalInterface
public interface SimpleFuncInterface {

    void doWork();

    @Override
    String toString();

    @Override
    boolean equals(Object o);

    default void doDefaultWork() {
        System.out.println("do some default work");
    }

    static void doStaticWork() {
        System.out.println("do some static work");
    }
}

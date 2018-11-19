package com.no.learn.javaskills.java8.features.language.methodreference;

import java.util.function.Supplier;

/**
 * @author zyr created on 2018/11/7.
 */
public class Car {

    public static Car create(Supplier<Car> carSupplier) {
        return carSupplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collide " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Follow " + another.toString());
    }

    public void repair() {
        System.out.println("Repair " + this.toString());
    }
}

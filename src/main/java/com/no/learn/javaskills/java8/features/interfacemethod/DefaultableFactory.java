package com.no.learn.javaskills.java8.features.interfacemethod;

import java.util.function.Supplier;

/**
 * @author zyr created on 2018/11/7.
 */
public interface DefaultableFactory {

    static Defaultable create(Supplier<Defaultable> supplier) {
        return supplier.get();
    }

}

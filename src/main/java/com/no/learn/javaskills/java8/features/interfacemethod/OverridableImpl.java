package com.no.learn.javaskills.java8.features.interfacemethod;

/**
 * @author zyr created on 2018/11/6.
 */
public class OverridableImpl implements Defaultable {

    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}

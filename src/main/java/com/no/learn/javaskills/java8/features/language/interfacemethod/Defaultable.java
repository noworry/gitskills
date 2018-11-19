package com.no.learn.javaskills.java8.features.language.interfacemethod;

/**
 * @author zyr created on 2018/11/6.
 */
public interface Defaultable {
    /**
     * Interfaces now allow default methods, the implementer may or may not implement (override) them.
     */
    default String notRequired() {
        return "Default Implementation";
    }
}

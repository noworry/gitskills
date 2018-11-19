package com.no.learn.javaskills.java8.features.language.bettertypeinference;

/**
 * @author zyr created on 2018/11/19.
 */
public class Value<T> {

    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }
}

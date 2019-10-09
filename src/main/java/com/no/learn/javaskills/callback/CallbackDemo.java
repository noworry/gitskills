package com.no.learn.javaskills.callback;

import java.util.function.Function;

/**
 * @author zyr created on 2019/10/9.
 */
public class Callback {

    public static void main(String[] args) {
        int one = 1;
        Function<String, Integer> addOneFunc = it -> Integer.valueOf(it) + one;

        System.out.println(addOneFunc.apply("0"));
        System.out.println(addOneFunc.apply("-1"));
    }
}

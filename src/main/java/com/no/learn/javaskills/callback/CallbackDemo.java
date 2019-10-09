package com.no.learn.javaskills.callback;

import java.util.function.Function;

/**
 * @author zyr created on 2019/10/9.
 */
public class CallbackDemo {

    private static final int TOW = 2;

    public static void main(String[] args) {
        int ONE = 1;

        // 看生成的字节码，没有生成独立的class文件
        Function<String, Integer> addOneFunc = it -> Integer.valueOf(it) + ONE;
        System.out.println(addOneFunc.apply("-1"));
        System.out.println(addOneFunc.apply("0"));

        // 生成了独立的class文件 CallbackDemo$1 如果是one则是成员变量，是TWO则是iconst_2
        Increment addOneAnonymous = new Increment() {
            @Override
            public int add(String target) {
                return Integer.valueOf(target) + ONE;
            }
        };
        System.out.println(addOneAnonymous.add("1"));
        System.out.println(addOneAnonymous.add("2"));

    }

    /**
     * 生成了独立的class文件 CallbackDemo$Increment
     */
    interface Increment {
        int add(String target);
    }
}

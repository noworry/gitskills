package com.no.learn.javaskills.callback;

import java.util.function.Function;

/**
 * @author zyr created on 2019/10/9.
 */
public class CallbackDemo {

    private static final int TOW = 2;

    public static void main(String[] args) {
        int ONE = 1;

        // �����ɵ��ֽ��룬û�����ɶ�����class�ļ�
        Function<String, Integer> addOneFunc = it -> Integer.valueOf(it) + ONE;
        System.out.println(addOneFunc.apply("-1"));
        System.out.println(addOneFunc.apply("0"));

        // �����˶�����class�ļ� CallbackDemo$1 �����one���ǳ�Ա��������TWO����iconst_2
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
     * �����˶�����class�ļ� CallbackDemo$Increment
     */
    interface Increment {
        int add(String target);
    }
}

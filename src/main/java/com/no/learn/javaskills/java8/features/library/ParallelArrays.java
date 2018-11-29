package com.no.learn.javaskills.java8.features.library;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/19.
 */
public class ParallelArrays implements FeatureDemo {
    @Override
    public void run() {
        long[] arrayOfLong = new long[20000];
        // parallelSetAll() to fill up arrays with 20000 random values
        Arrays.parallelSetAll(arrayOfLong,
            index -> ThreadLocalRandom.current().nextInt(1000000));
        Arrays.stream(arrayOfLong).limit(10).forEach(
            i -> System.out.print(i + " "));
        System.out.println();


        Arrays.parallelSort(arrayOfLong);
        Arrays.stream(arrayOfLong).limit(10).forEach(
            i -> System.out.print(i + " "));
        System.out.println();

    }
}

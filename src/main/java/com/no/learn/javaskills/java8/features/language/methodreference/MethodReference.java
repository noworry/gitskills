package com.no.learn.javaskills.java8.features.language.methodreference;

import java.util.Collections;
import java.util.List;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/7.
 */
public class MethodReference implements FeatureDemo {

    @Override
    public void run() {
        // Class::new reference for constructor of none arguments
        final Car car = Car.create(Car::new);
        final List<Car> cars = Collections.singletonList(car);

        // Class::static_method
        cars.forEach(Car::collide);

        // Class::method no arguments are accepted by the method
        cars.forEach(Car::repair);

        // instance::method
        final Car police = Car.create( Car::new );
        cars.forEach(police::follow);
    }
}

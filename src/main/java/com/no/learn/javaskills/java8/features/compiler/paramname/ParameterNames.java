package com.no.learn.javaskills.java8.features.compiler.paramname;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.no.learn.javaskills.java8.features.FeatureDemo;

/**
 * @author zyr created on 2018/11/19.
 *         idea如何开启-parameters
 *         Settings->Build,Execution,Deployment->Compiler->Java Compiler
 *         在 Additional command line parameters: 后面填上 -parameters
 */
public class ParameterNames implements FeatureDemo {

    @Override
    public void run() {
        try {
            Method method1 = ParameterNames.class.getMethod("doInner");
            method1.invoke(this);
            methodParams(method1);

            Method method2 = ParameterNames.class.getMethod("doInner", String.class, Integer.class);
            method2.invoke(this, this.getClass().getSimpleName(),
                this.getClass().getMethods() == null ? 0 : this.getClass().getMethods().length);
            methodParams(method2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void methodParams(Method method) {
        System.out.println("Method: " + method.getName());
        if (method.getParameters() == null || method.getParameters().length == 0) {
            System.out.println("Empty params!");
            return;
        }
        for (final Parameter parameter : method.getParameters()) {
            System.out.println("Parameter: " + parameter.getName());
        }
    }

    public void doInner() {
        System.out.println(this.getClass().getSimpleName() + " execute doInner(String className)");
    }

    public void doInner(String className, Integer methodCount) {
        System.out.println(className + " execute doInner(String className, int methodCount)");
        System.out.println(className + " has " + methodCount + " method");
    }
}

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LevenbergMarquardtOptimizer_determineLMDirection_107049755261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31834;

    public LevenbergMarquardtOptimizer_determineLMDirection_107049755261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31834 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] term31547 = (int[]) newIntArray(32);
        double[] term31581 = (double[]) newDoubleArray(56);
        setIntField(term31834, term31834.getClass(), "solvedCols", 1);
        setIntElement(term31547, 0, 55);
        setIntElement(term31547, 1, 55);
        setIntElement(term31547, 2, 55);
        setIntElement(term31547, 3, 55);
        setIntElement(term31547, 4, 55);
        setIntElement(term31547, 5, 55);
        setIntElement(term31547, 6, 55);
        setIntElement(term31547, 7, 55);
        setIntElement(term31547, 8, 55);
        setIntElement(term31547, 9, 55);
        setIntElement(term31547, 10, 55);
        setIntElement(term31547, 11, 55);
        setIntElement(term31547, 12, 55);
        setIntElement(term31547, 13, 55);
        setIntElement(term31547, 14, 55);
        setIntElement(term31547, 15, 55);
        setIntElement(term31547, 16, 55);
        setIntElement(term31547, 17, 55);
        setIntElement(term31547, 18, 55);
        setIntElement(term31547, 19, 55);
        setIntElement(term31547, 20, 55);
        setIntElement(term31547, 21, 55);
        setIntElement(term31547, 22, 55);
        setIntElement(term31547, 23, 55);
        setIntElement(term31547, 24, 55);
        setIntElement(term31547, 25, 55);
        setIntElement(term31547, 26, 55);
        setIntElement(term31547, 27, 55);
        setIntElement(term31547, 28, 55);
        setIntElement(term31547, 29, 55);
        setIntElement(term31547, 30, 55);
        setIntElement(term31547, 31, 55);
        setField(term31834, term31834.getClass(), "permutation", term31547);
        setField(term31834, term31834.getClass(), "lmDir", null);
        setDoubleElement(term31581, 0, 55.0);
        setDoubleElement(term31581, 1, 55.0);
        setDoubleElement(term31581, 2, 55.0);
        setDoubleElement(term31581, 3, 55.0);
        setDoubleElement(term31581, 4, 55.0);
        setDoubleElement(term31581, 5, 55.0);
        setDoubleElement(term31581, 6, 55.0);
        setDoubleElement(term31581, 7, 55.0);
        setDoubleElement(term31581, 8, 55.0);
        setDoubleElement(term31581, 9, 55.0);
        setDoubleElement(term31581, 10, 55.0);
        setDoubleElement(term31581, 11, 55.0);
        setDoubleElement(term31581, 12, 55.0);
        setDoubleElement(term31581, 13, 55.0);
        setDoubleElement(term31581, 14, 55.0);
        setDoubleElement(term31581, 15, 55.0);
        setDoubleElement(term31581, 16, 55.0);
        setDoubleElement(term31581, 17, 55.0);
        setDoubleElement(term31581, 18, 55.0);
        setDoubleElement(term31581, 19, 55.0);
        setDoubleElement(term31581, 20, 55.0);
        setDoubleElement(term31581, 21, 55.0);
        setDoubleElement(term31581, 22, 55.0);
        setDoubleElement(term31581, 23, 55.0);
        setDoubleElement(term31581, 24, 55.0);
        setDoubleElement(term31581, 25, 55.0);
        setDoubleElement(term31581, 26, 55.0);
        setDoubleElement(term31581, 27, 55.0);
        setDoubleElement(term31581, 28, 55.0);
        setDoubleElement(term31581, 29, 55.0);
        setDoubleElement(term31581, 30, 55.0);
        setDoubleElement(term31581, 31, 55.0);
        setDoubleElement(term31581, 32, 55.0);
        setDoubleElement(term31581, 33, 55.0);
        setDoubleElement(term31581, 34, 55.0);
        setDoubleElement(term31581, 35, 55.0);
        setDoubleElement(term31581, 36, 55.0);
        setDoubleElement(term31581, 37, 55.0);
        setDoubleElement(term31581, 38, 55.0);
        setDoubleElement(term31581, 39, 55.0);
        setDoubleElement(term31581, 40, 55.0);
        setDoubleElement(term31581, 41, 55.0);
        setDoubleElement(term31581, 42, 55.0);
        setDoubleElement(term31581, 43, 55.0);
        setDoubleElement(term31581, 44, 55.0);
        setDoubleElement(term31581, 45, 55.0);
        setDoubleElement(term31581, 46, 55.0);
        setDoubleElement(term31581, 47, 55.0);
        setDoubleElement(term31581, 48, 55.0);
        setDoubleElement(term31581, 49, 55.0);
        setDoubleElement(term31581, 50, 55.0);
        setDoubleElement(term31581, 51, 55.0);
        setDoubleElement(term31581, 52, 55.0);
        setDoubleElement(term31581, 53, 55.0);
        setDoubleElement(term31581, 54, 55.0);
        setDoubleElement(term31581, 55, 55.0);
        setField(term31834, term31834.getClass(), "diagR", term31581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "determineLMDirection", argTypes, term31834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



package org.apache.commons.math.optimization.general;

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
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188516;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1188516 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1136189 = (int[]) newIntArray(489);
        Object[] term1136680 = (Object[]) newArray("[D", 102);
        double[] term1136681 = (double[]) newDoubleArray(489);
        double[] term1137171 = (double[]) newDoubleArray(233);
        setIntField(term1188516, term1188516.getClass(), "cols", 1);
        setField(term1188516, term1188516.getClass(), "permutation", term1136189);
        setElement(term1136680, 0, term1136681);
        setElement(term1136680, 1, term1136681);
        setElement(term1136680, 2, term1136681);
        setElement(term1136680, 3, term1136681);
        setElement(term1136680, 4, term1136681);
        setElement(term1136680, 5, term1136681);
        setElement(term1136680, 6, term1136681);
        setElement(term1136680, 7, term1136681);
        setElement(term1136680, 8, term1136681);
        setElement(term1136680, 9, term1136681);
        setElement(term1136680, 10, term1136681);
        setElement(term1136680, 11, term1136681);
        setElement(term1136680, 12, term1136681);
        setElement(term1136680, 13, term1136681);
        setElement(term1136680, 14, term1136681);
        setElement(term1136680, 15, term1136681);
        setElement(term1136680, 16, term1136681);
        setElement(term1136680, 17, term1136681);
        setElement(term1136680, 18, term1136681);
        setElement(term1136680, 19, term1136681);
        setElement(term1136680, 20, term1136681);
        setElement(term1136680, 21, term1136681);
        setElement(term1136680, 22, term1136681);
        setElement(term1136680, 23, term1136681);
        setElement(term1136680, 24, term1136681);
        setElement(term1136680, 25, term1136681);
        setElement(term1136680, 26, term1136681);
        setElement(term1136680, 27, term1137171);
        setElement(term1136680, 28, term1136681);
        setElement(term1136680, 29, term1136681);
        setElement(term1136680, 30, term1136681);
        setElement(term1136680, 31, term1136681);
        setElement(term1136680, 32, term1136681);
        setElement(term1136680, 33, term1136681);
        setElement(term1136680, 34, term1136681);
        setElement(term1136680, 35, term1136681);
        setElement(term1136680, 36, term1136681);
        setElement(term1136680, 37, term1136681);
        setElement(term1136680, 38, term1136681);
        setElement(term1136680, 39, term1136681);
        setElement(term1136680, 40, term1136681);
        setElement(term1136680, 41, term1136681);
        setElement(term1136680, 42, term1136681);
        setElement(term1136680, 43, term1136681);
        setElement(term1136680, 44, term1136681);
        setElement(term1136680, 45, term1136681);
        setElement(term1136680, 46, term1136681);
        setElement(term1136680, 47, term1136681);
        setElement(term1136680, 48, term1136681);
        setElement(term1136680, 49, term1136681);
        setElement(term1136680, 50, term1136681);
        setElement(term1136680, 51, term1136681);
        setElement(term1136680, 52, term1136681);
        setElement(term1136680, 53, term1136681);
        setElement(term1136680, 54, term1136681);
        setElement(term1136680, 55, term1136681);
        setElement(term1136680, 56, term1136681);
        setElement(term1136680, 57, term1136681);
        setElement(term1136680, 58, term1136681);
        setElement(term1136680, 59, term1136681);
        setElement(term1136680, 60, term1136681);
        setElement(term1136680, 61, term1136681);
        setElement(term1136680, 62, term1136681);
        setElement(term1136680, 63, term1136681);
        setElement(term1136680, 64, term1136681);
        setElement(term1136680, 65, term1136681);
        setElement(term1136680, 66, term1136681);
        setElement(term1136680, 67, term1136681);
        setElement(term1136680, 68, term1136681);
        setElement(term1136680, 69, term1136681);
        setElement(term1136680, 70, term1136681);
        setElement(term1136680, 71, term1136681);
        setElement(term1136680, 72, term1136681);
        setElement(term1136680, 73, term1136681);
        setElement(term1136680, 74, term1136681);
        setElement(term1136680, 75, term1136681);
        setElement(term1136680, 76, term1136681);
        setElement(term1136680, 77, term1136681);
        setElement(term1136680, 78, term1136681);
        setElement(term1136680, 79, term1136681);
        setElement(term1136680, 80, term1136681);
        setElement(term1136680, 81, term1136681);
        setElement(term1136680, 82, term1136681);
        setElement(term1136680, 83, term1136681);
        setElement(term1136680, 84, term1136681);
        setElement(term1136680, 85, term1136681);
        setElement(term1136680, 86, term1136681);
        setElement(term1136680, 87, term1136681);
        setElement(term1136680, 88, term1136681);
        setElement(term1136680, 89, term1136681);
        setElement(term1136680, 90, term1136681);
        setElement(term1136680, 91, term1136681);
        setElement(term1136680, 92, term1136681);
        setElement(term1136680, 93, term1136681);
        setElement(term1136680, 94, term1136681);
        setElement(term1136680, 95, term1136681);
        setElement(term1136680, 96, term1136681);
        setElement(term1136680, 97, term1136681);
        setElement(term1136680, 98, term1136681);
        setElement(term1136680, 99, term1136681);
        setElement(term1136680, 100, term1136681);
        setElement(term1136680, 101, term1136681);
        setField(term1188516, term1188516.getClass(), "jacobian", term1136680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1188516, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



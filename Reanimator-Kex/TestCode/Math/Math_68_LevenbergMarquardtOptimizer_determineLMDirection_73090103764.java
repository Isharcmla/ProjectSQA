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

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26854;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26854 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term26591 = (int[]) newIntArray(32);
        double[] term26625 = (double[]) newDoubleArray(56);
        setIntField(term26854, term26854.getClass(), "solvedCols", 1);
        setIntElement(term26591, 0, 55);
        setIntElement(term26591, 1, 55);
        setIntElement(term26591, 2, 55);
        setIntElement(term26591, 3, 55);
        setIntElement(term26591, 4, 55);
        setIntElement(term26591, 5, 55);
        setIntElement(term26591, 6, 55);
        setIntElement(term26591, 7, 55);
        setIntElement(term26591, 8, 55);
        setIntElement(term26591, 9, 55);
        setIntElement(term26591, 10, 55);
        setIntElement(term26591, 11, 55);
        setIntElement(term26591, 12, 55);
        setIntElement(term26591, 13, 55);
        setIntElement(term26591, 14, 55);
        setIntElement(term26591, 15, 55);
        setIntElement(term26591, 16, 55);
        setIntElement(term26591, 17, 55);
        setIntElement(term26591, 18, 55);
        setIntElement(term26591, 19, 55);
        setIntElement(term26591, 20, 55);
        setIntElement(term26591, 21, 55);
        setIntElement(term26591, 22, 55);
        setIntElement(term26591, 23, 55);
        setIntElement(term26591, 24, 55);
        setIntElement(term26591, 25, 55);
        setIntElement(term26591, 26, 55);
        setIntElement(term26591, 27, 55);
        setIntElement(term26591, 28, 55);
        setIntElement(term26591, 29, 55);
        setIntElement(term26591, 30, 55);
        setIntElement(term26591, 31, 55);
        setField(term26854, term26854.getClass(), "permutation", term26591);
        setField(term26854, term26854.getClass(), "lmDir", null);
        setDoubleElement(term26625, 0, 55.0);
        setDoubleElement(term26625, 1, 55.0);
        setDoubleElement(term26625, 2, 55.0);
        setDoubleElement(term26625, 3, 55.0);
        setDoubleElement(term26625, 4, 55.0);
        setDoubleElement(term26625, 5, 55.0);
        setDoubleElement(term26625, 6, 55.0);
        setDoubleElement(term26625, 7, 55.0);
        setDoubleElement(term26625, 8, 55.0);
        setDoubleElement(term26625, 9, 55.0);
        setDoubleElement(term26625, 10, 55.0);
        setDoubleElement(term26625, 11, 55.0);
        setDoubleElement(term26625, 12, 55.0);
        setDoubleElement(term26625, 13, 55.0);
        setDoubleElement(term26625, 14, 55.0);
        setDoubleElement(term26625, 15, 55.0);
        setDoubleElement(term26625, 16, 55.0);
        setDoubleElement(term26625, 17, 55.0);
        setDoubleElement(term26625, 18, 55.0);
        setDoubleElement(term26625, 19, 55.0);
        setDoubleElement(term26625, 20, 55.0);
        setDoubleElement(term26625, 21, 55.0);
        setDoubleElement(term26625, 22, 55.0);
        setDoubleElement(term26625, 23, 55.0);
        setDoubleElement(term26625, 24, 55.0);
        setDoubleElement(term26625, 25, 55.0);
        setDoubleElement(term26625, 26, 55.0);
        setDoubleElement(term26625, 27, 55.0);
        setDoubleElement(term26625, 28, 55.0);
        setDoubleElement(term26625, 29, 55.0);
        setDoubleElement(term26625, 30, 55.0);
        setDoubleElement(term26625, 31, 55.0);
        setDoubleElement(term26625, 32, 55.0);
        setDoubleElement(term26625, 33, 55.0);
        setDoubleElement(term26625, 34, 55.0);
        setDoubleElement(term26625, 35, 55.0);
        setDoubleElement(term26625, 36, 55.0);
        setDoubleElement(term26625, 37, 55.0);
        setDoubleElement(term26625, 38, 55.0);
        setDoubleElement(term26625, 39, 55.0);
        setDoubleElement(term26625, 40, 55.0);
        setDoubleElement(term26625, 41, 55.0);
        setDoubleElement(term26625, 42, 55.0);
        setDoubleElement(term26625, 43, 55.0);
        setDoubleElement(term26625, 44, 55.0);
        setDoubleElement(term26625, 45, 55.0);
        setDoubleElement(term26625, 46, 55.0);
        setDoubleElement(term26625, 47, 55.0);
        setDoubleElement(term26625, 48, 55.0);
        setDoubleElement(term26625, 49, 55.0);
        setDoubleElement(term26625, 50, 55.0);
        setDoubleElement(term26625, 51, 55.0);
        setDoubleElement(term26625, 52, 55.0);
        setDoubleElement(term26625, 53, 55.0);
        setDoubleElement(term26625, 54, 55.0);
        setDoubleElement(term26625, 55, 55.0);
        setField(term26854, term26854.getClass(), "diagR", term26625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
            callMethod(klass, "determineLMDirection", argTypes, term26854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



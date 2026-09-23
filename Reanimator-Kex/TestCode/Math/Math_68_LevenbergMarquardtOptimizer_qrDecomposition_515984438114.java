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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113674;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113674 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term88903 = (int[]) newIntArray(489);
        Object[] term89394 = (Object[]) newArray("[D", 48);
        double[] term89395 = (double[]) newDoubleArray(489);
        double[] term89885 = (double[]) newDoubleArray(9);
        setIntField(term113674, term113674.getClass(), "cols", 1);
        setField(term113674, term113674.getClass(), "permutation", term88903);
        setElement(term89394, 0, term89395);
        setElement(term89394, 1, term89395);
        setElement(term89394, 2, term89395);
        setElement(term89394, 3, term89395);
        setElement(term89394, 4, term89395);
        setElement(term89394, 5, term89395);
        setElement(term89394, 6, term89395);
        setElement(term89394, 7, term89395);
        setElement(term89394, 8, term89395);
        setElement(term89394, 9, term89395);
        setElement(term89394, 10, term89395);
        setElement(term89394, 11, term89395);
        setElement(term89394, 12, term89395);
        setElement(term89394, 13, term89395);
        setElement(term89394, 14, term89395);
        setElement(term89394, 15, term89395);
        setElement(term89394, 16, term89395);
        setElement(term89394, 17, term89395);
        setElement(term89394, 18, term89395);
        setElement(term89394, 19, term89395);
        setElement(term89394, 20, term89395);
        setElement(term89394, 21, term89395);
        setElement(term89394, 22, term89395);
        setElement(term89394, 23, term89395);
        setElement(term89394, 24, term89395);
        setElement(term89394, 25, term89395);
        setElement(term89394, 26, term89395);
        setElement(term89394, 27, term89395);
        setElement(term89394, 28, term89395);
        setElement(term89394, 29, term89395);
        setElement(term89394, 30, term89395);
        setElement(term89394, 31, term89395);
        setElement(term89394, 32, term89395);
        setElement(term89394, 33, term89395);
        setElement(term89394, 34, term89395);
        setElement(term89394, 35, term89395);
        setElement(term89394, 36, term89395);
        setElement(term89394, 37, term89395);
        setElement(term89394, 38, term89395);
        setElement(term89394, 39, term89395);
        setElement(term89394, 40, term89395);
        setElement(term89394, 41, term89395);
        setElement(term89394, 42, term89395);
        setElement(term89394, 43, term89885);
        setElement(term89394, 44, term89395);
        setElement(term89394, 45, term89395);
        setElement(term89394, 46, term89395);
        setElement(term89394, 47, term89395);
        setField(term113674, term113674.getClass(), "jacobian", term89394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term113674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



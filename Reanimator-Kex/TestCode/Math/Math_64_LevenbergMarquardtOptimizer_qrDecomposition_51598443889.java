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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2065234;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2065234 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term2023929 = (int[]) newIntArray(489);
        Object[] term2024420 = (Object[]) newArray("[D", 80);
        double[] term2024421 = (double[]) newDoubleArray(489);
        setIntField(term2065234, term2065234.getClass(), "cols", 1);
        setField(term2065234, term2065234.getClass(), "permutation", term2023929);
        setElement(term2024420, 0, term2024421);
        setElement(term2024420, 1, term2024421);
        setElement(term2024420, 2, term2024421);
        setElement(term2024420, 3, term2024421);
        setElement(term2024420, 4, term2024421);
        setElement(term2024420, 5, term2024421);
        setElement(term2024420, 6, term2024421);
        setElement(term2024420, 7, term2024421);
        setElement(term2024420, 8, term2024421);
        setElement(term2024420, 9, term2024421);
        setElement(term2024420, 10, term2024421);
        setElement(term2024420, 11, term2024421);
        setElement(term2024420, 12, term2024421);
        setElement(term2024420, 13, term2024421);
        setElement(term2024420, 14, term2024421);
        setElement(term2024420, 15, term2024421);
        setElement(term2024420, 16, term2024421);
        setElement(term2024420, 17, term2024421);
        setElement(term2024420, 18, term2024421);
        setElement(term2024420, 19, term2024421);
        setElement(term2024420, 20, term2024421);
        setElement(term2024420, 21, term2024421);
        setElement(term2024420, 22, term2024421);
        setElement(term2024420, 23, term2024421);
        setElement(term2024420, 24, term2024421);
        setElement(term2024420, 25, term2024421);
        setElement(term2024420, 26, term2024421);
        setElement(term2024420, 27, term2024421);
        setElement(term2024420, 28, term2024421);
        setElement(term2024420, 29, term2024421);
        setElement(term2024420, 30, term2024421);
        setElement(term2024420, 31, term2024421);
        setElement(term2024420, 32, term2024421);
        setElement(term2024420, 33, term2024421);
        setElement(term2024420, 34, term2024421);
        setElement(term2024420, 35, term2024421);
        setElement(term2024420, 36, term2024421);
        setElement(term2024420, 37, term2024421);
        setElement(term2024420, 38, term2024421);
        setElement(term2024420, 39, term2024421);
        setElement(term2024420, 40, term2024421);
        setElement(term2024420, 41, term2024421);
        setElement(term2024420, 42, term2024421);
        setElement(term2024420, 43, term2024421);
        setElement(term2024420, 44, term2024421);
        setElement(term2024420, 45, term2024421);
        setElement(term2024420, 46, term2024421);
        setElement(term2024420, 47, term2024421);
        setElement(term2024420, 48, term2024421);
        setElement(term2024420, 49, term2024421);
        setElement(term2024420, 50, term2024421);
        setElement(term2024420, 51, term2024421);
        setElement(term2024420, 52, term2024421);
        setElement(term2024420, 53, term2024421);
        setElement(term2024420, 54, term2024421);
        setElement(term2024420, 55, term2024421);
        setElement(term2024420, 56, term2024421);
        setElement(term2024420, 57, term2024421);
        setElement(term2024420, 58, term2024421);
        setElement(term2024420, 59, term2024421);
        setElement(term2024420, 60, term2024421);
        setElement(term2024420, 61, term2024421);
        setElement(term2024420, 62, term2024421);
        setElement(term2024420, 63, term2024421);
        setElement(term2024420, 64, term2024421);
        setElement(term2024420, 65, term2024421);
        setElement(term2024420, 66, term2024421);
        setElement(term2024420, 67, term2024421);
        setElement(term2024420, 68, term2024421);
        setElement(term2024420, 69, term2024421);
        setElement(term2024420, 70, term2024421);
        setElement(term2024420, 71, term2024421);
        setElement(term2024420, 72, term2024421);
        setElement(term2024420, 73, term2024421);
        setElement(term2024420, 74, term2024421);
        setElement(term2024420, 75, term2024421);
        setElement(term2024420, 76, term2024421);
        setElement(term2024420, 77, term2024421);
        setElement(term2024420, 78, term2024421);
        setElement(term2024420, 79, term2024421);
        setField(term2065234, term2065234.getClass(), "jacobian", term2024420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term2065234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



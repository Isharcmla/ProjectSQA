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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426554;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1426554 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1377719 = (int[]) newIntArray(489);
        Object[] term1378210 = (Object[]) newArray("[D", 95);
        double[] term1378211 = (double[]) newDoubleArray(489);
        setIntField(term1426554, term1426554.getClass(), "cols", 1);
        setField(term1426554, term1426554.getClass(), "permutation", term1377719);
        setElement(term1378210, 0, term1378211);
        setElement(term1378210, 1, term1378211);
        setElement(term1378210, 2, term1378211);
        setElement(term1378210, 3, term1378211);
        setElement(term1378210, 4, term1378211);
        setElement(term1378210, 5, term1378211);
        setElement(term1378210, 6, term1378211);
        setElement(term1378210, 7, term1378211);
        setElement(term1378210, 8, term1378211);
        setElement(term1378210, 9, term1378211);
        setElement(term1378210, 10, term1378211);
        setElement(term1378210, 11, term1378211);
        setElement(term1378210, 12, term1378211);
        setElement(term1378210, 13, term1378211);
        setElement(term1378210, 14, term1378211);
        setElement(term1378210, 15, term1378211);
        setElement(term1378210, 16, term1378211);
        setElement(term1378210, 17, term1378211);
        setElement(term1378210, 18, term1378211);
        setElement(term1378210, 19, term1378211);
        setElement(term1378210, 20, term1378211);
        setElement(term1378210, 21, term1378211);
        setElement(term1378210, 22, term1378211);
        setElement(term1378210, 23, term1378211);
        setElement(term1378210, 24, term1378211);
        setElement(term1378210, 25, term1378211);
        setElement(term1378210, 26, term1378211);
        setElement(term1378210, 27, term1378211);
        setElement(term1378210, 28, term1378211);
        setElement(term1378210, 29, term1378211);
        setElement(term1378210, 30, term1378211);
        setElement(term1378210, 31, term1378211);
        setElement(term1378210, 32, term1378211);
        setElement(term1378210, 33, term1378211);
        setElement(term1378210, 34, term1378211);
        setElement(term1378210, 35, term1378211);
        setElement(term1378210, 36, term1378211);
        setElement(term1378210, 37, term1378211);
        setElement(term1378210, 38, term1378211);
        setElement(term1378210, 39, term1378211);
        setElement(term1378210, 40, term1378211);
        setElement(term1378210, 41, term1378211);
        setElement(term1378210, 42, term1378211);
        setElement(term1378210, 43, term1378211);
        setElement(term1378210, 44, term1378211);
        setElement(term1378210, 45, term1378211);
        setElement(term1378210, 46, term1378211);
        setElement(term1378210, 47, term1378211);
        setElement(term1378210, 48, term1378211);
        setElement(term1378210, 49, term1378211);
        setElement(term1378210, 50, term1378211);
        setElement(term1378210, 51, term1378211);
        setElement(term1378210, 52, term1378211);
        setElement(term1378210, 53, term1378211);
        setElement(term1378210, 54, term1378211);
        setElement(term1378210, 55, term1378211);
        setElement(term1378210, 56, term1378211);
        setElement(term1378210, 57, term1378211);
        setElement(term1378210, 58, term1378211);
        setElement(term1378210, 59, term1378211);
        setElement(term1378210, 60, term1378211);
        setElement(term1378210, 61, term1378211);
        setElement(term1378210, 62, term1378211);
        setElement(term1378210, 63, term1378211);
        setElement(term1378210, 64, term1378211);
        setElement(term1378210, 65, term1378211);
        setElement(term1378210, 66, term1378211);
        setElement(term1378210, 67, term1378211);
        setElement(term1378210, 68, term1378211);
        setElement(term1378210, 69, term1378211);
        setElement(term1378210, 70, term1378211);
        setElement(term1378210, 71, term1378211);
        setElement(term1378210, 72, term1378211);
        setElement(term1378210, 73, term1378211);
        setElement(term1378210, 74, term1378211);
        setElement(term1378210, 75, term1378211);
        setElement(term1378210, 76, term1378211);
        setElement(term1378210, 77, term1378211);
        setElement(term1378210, 78, term1378211);
        setElement(term1378210, 79, term1378211);
        setElement(term1378210, 80, term1378211);
        setElement(term1378210, 81, term1378211);
        setElement(term1378210, 82, term1378211);
        setElement(term1378210, 83, term1378211);
        setElement(term1378210, 84, term1378211);
        setElement(term1378210, 85, term1378211);
        setElement(term1378210, 86, term1378211);
        setElement(term1378210, 87, term1378211);
        setElement(term1378210, 88, term1378211);
        setElement(term1378210, 89, term1378211);
        setElement(term1378210, 90, term1378211);
        setElement(term1378210, 91, term1378211);
        setElement(term1378210, 92, term1378211);
        setElement(term1378210, 93, term1378211);
        setElement(term1378210, 94, term1378211);
        setField(term1426554, term1426554.getClass(), "jacobian", term1378210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1426554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



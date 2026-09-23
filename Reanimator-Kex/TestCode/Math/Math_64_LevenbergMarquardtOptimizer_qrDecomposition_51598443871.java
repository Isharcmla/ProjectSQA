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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247130;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1247130 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1225905 = (int[]) newIntArray(489);
        Object[] term1226396 = (Object[]) newArray("[D", 40);
        double[] term1226397 = (double[]) newDoubleArray(489);
        setIntField(term1247130, term1247130.getClass(), "cols", 1);
        setField(term1247130, term1247130.getClass(), "permutation", term1225905);
        setElement(term1226396, 0, term1226397);
        setElement(term1226396, 1, term1226397);
        setElement(term1226396, 2, term1226397);
        setElement(term1226396, 3, term1226397);
        setElement(term1226396, 4, term1226397);
        setElement(term1226396, 5, term1226397);
        setElement(term1226396, 6, term1226397);
        setElement(term1226396, 7, term1226397);
        setElement(term1226396, 8, term1226397);
        setElement(term1226396, 9, term1226397);
        setElement(term1226396, 10, term1226397);
        setElement(term1226396, 11, term1226397);
        setElement(term1226396, 12, term1226397);
        setElement(term1226396, 13, term1226397);
        setElement(term1226396, 14, term1226397);
        setElement(term1226396, 15, term1226397);
        setElement(term1226396, 16, term1226397);
        setElement(term1226396, 17, term1226397);
        setElement(term1226396, 18, term1226397);
        setElement(term1226396, 19, term1226397);
        setElement(term1226396, 20, term1226397);
        setElement(term1226396, 21, term1226397);
        setElement(term1226396, 22, term1226397);
        setElement(term1226396, 23, term1226397);
        setElement(term1226396, 24, term1226397);
        setElement(term1226396, 25, term1226397);
        setElement(term1226396, 26, term1226397);
        setElement(term1226396, 27, term1226397);
        setElement(term1226396, 28, term1226397);
        setElement(term1226396, 29, term1226397);
        setElement(term1226396, 30, term1226397);
        setElement(term1226396, 31, term1226397);
        setElement(term1226396, 32, term1226397);
        setElement(term1226396, 33, term1226397);
        setElement(term1226396, 34, term1226397);
        setElement(term1226396, 35, term1226397);
        setElement(term1226396, 36, term1226397);
        setElement(term1226396, 37, term1226397);
        setElement(term1226396, 38, term1226397);
        setElement(term1226396, 39, term1226397);
        setField(term1247130, term1247130.getClass(), "jacobian", term1226396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1247130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



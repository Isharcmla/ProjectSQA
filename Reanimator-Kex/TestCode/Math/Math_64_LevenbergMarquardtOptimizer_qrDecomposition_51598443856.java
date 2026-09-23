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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511288;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511288 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term460947 = (int[]) newIntArray(489);
        Object[] term461438 = (Object[]) newArray("[D", 98);
        double[] term461439 = (double[]) newDoubleArray(489);
        setIntField(term511288, term511288.getClass(), "cols", 1);
        setField(term511288, term511288.getClass(), "permutation", term460947);
        setElement(term461438, 0, term461439);
        setElement(term461438, 1, term461439);
        setElement(term461438, 2, term461439);
        setElement(term461438, 3, term461439);
        setElement(term461438, 4, term461439);
        setElement(term461438, 5, term461439);
        setElement(term461438, 6, term461439);
        setElement(term461438, 7, term461439);
        setElement(term461438, 8, term461439);
        setElement(term461438, 9, term461439);
        setElement(term461438, 10, term461439);
        setElement(term461438, 11, term461439);
        setElement(term461438, 12, term461439);
        setElement(term461438, 13, term461439);
        setElement(term461438, 14, term461439);
        setElement(term461438, 15, term461439);
        setElement(term461438, 16, term461439);
        setElement(term461438, 17, term461439);
        setElement(term461438, 18, term461439);
        setElement(term461438, 19, term461439);
        setElement(term461438, 20, term461439);
        setElement(term461438, 21, term461439);
        setElement(term461438, 22, term461439);
        setElement(term461438, 23, term461439);
        setElement(term461438, 24, term461439);
        setElement(term461438, 25, term461439);
        setElement(term461438, 26, term461439);
        setElement(term461438, 27, term461439);
        setElement(term461438, 28, term461439);
        setElement(term461438, 29, term461439);
        setElement(term461438, 30, term461439);
        setElement(term461438, 31, term461439);
        setElement(term461438, 32, term461439);
        setElement(term461438, 33, term461439);
        setElement(term461438, 34, term461439);
        setElement(term461438, 35, term461439);
        setElement(term461438, 36, term461439);
        setElement(term461438, 37, term461439);
        setElement(term461438, 38, term461439);
        setElement(term461438, 39, term461439);
        setElement(term461438, 40, term461439);
        setElement(term461438, 41, term461439);
        setElement(term461438, 42, term461439);
        setElement(term461438, 43, term461439);
        setElement(term461438, 44, term461439);
        setElement(term461438, 45, term461439);
        setElement(term461438, 46, term461439);
        setElement(term461438, 47, term461439);
        setElement(term461438, 48, term461439);
        setElement(term461438, 49, term461439);
        setElement(term461438, 50, term461439);
        setElement(term461438, 51, term461439);
        setElement(term461438, 52, term461439);
        setElement(term461438, 53, term461439);
        setElement(term461438, 54, term461439);
        setElement(term461438, 55, term461439);
        setElement(term461438, 56, term461439);
        setElement(term461438, 57, term461439);
        setElement(term461438, 58, term461439);
        setElement(term461438, 59, term461439);
        setElement(term461438, 60, term461439);
        setElement(term461438, 61, term461439);
        setElement(term461438, 62, term461439);
        setElement(term461438, 63, term461439);
        setElement(term461438, 64, term461439);
        setElement(term461438, 65, term461439);
        setElement(term461438, 66, term461439);
        setElement(term461438, 67, term461439);
        setElement(term461438, 68, term461439);
        setElement(term461438, 69, term461439);
        setElement(term461438, 70, term461439);
        setElement(term461438, 71, term461439);
        setElement(term461438, 72, term461439);
        setElement(term461438, 73, term461439);
        setElement(term461438, 74, term461439);
        setElement(term461438, 75, term461439);
        setElement(term461438, 76, term461439);
        setElement(term461438, 77, term461439);
        setElement(term461438, 78, term461439);
        setElement(term461438, 79, term461439);
        setElement(term461438, 80, term461439);
        setElement(term461438, 81, term461439);
        setElement(term461438, 82, term461439);
        setElement(term461438, 83, term461439);
        setElement(term461438, 84, term461439);
        setElement(term461438, 85, term461439);
        setElement(term461438, 86, term461439);
        setElement(term461438, 87, term461439);
        setElement(term461438, 88, term461439);
        setElement(term461438, 89, term461439);
        setElement(term461438, 90, term461439);
        setElement(term461438, 91, term461439);
        setElement(term461438, 92, term461439);
        setElement(term461438, 93, term461439);
        setElement(term461438, 94, term461439);
        setElement(term461438, 95, term461439);
        setElement(term461438, 96, term461439);
        setElement(term461438, 97, term461439);
        setField(term511288, term511288.getClass(), "jacobian", term461438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term511288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



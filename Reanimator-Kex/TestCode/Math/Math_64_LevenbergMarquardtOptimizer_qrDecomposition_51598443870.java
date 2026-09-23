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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223505;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1223505 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1189730 = (int[]) newIntArray(489);
        Object[] term1190221 = (Object[]) newArray("[D", 65);
        double[] term1190222 = (double[]) newDoubleArray(489);
        setIntField(term1223505, term1223505.getClass(), "cols", 1);
        setField(term1223505, term1223505.getClass(), "permutation", term1189730);
        setElement(term1190221, 0, term1190222);
        setElement(term1190221, 1, term1190222);
        setElement(term1190221, 2, term1190222);
        setElement(term1190221, 3, term1190222);
        setElement(term1190221, 4, term1190222);
        setElement(term1190221, 5, term1190222);
        setElement(term1190221, 6, term1190222);
        setElement(term1190221, 7, term1190222);
        setElement(term1190221, 8, term1190222);
        setElement(term1190221, 9, term1190222);
        setElement(term1190221, 10, term1190222);
        setElement(term1190221, 11, term1190222);
        setElement(term1190221, 12, term1190222);
        setElement(term1190221, 13, term1190222);
        setElement(term1190221, 14, term1190222);
        setElement(term1190221, 15, term1190222);
        setElement(term1190221, 16, term1190222);
        setElement(term1190221, 17, term1190222);
        setElement(term1190221, 18, term1190222);
        setElement(term1190221, 19, term1190222);
        setElement(term1190221, 20, term1190222);
        setElement(term1190221, 21, term1190222);
        setElement(term1190221, 22, term1190222);
        setElement(term1190221, 23, term1190222);
        setElement(term1190221, 24, term1190222);
        setElement(term1190221, 25, term1190222);
        setElement(term1190221, 26, term1190222);
        setElement(term1190221, 27, term1190222);
        setElement(term1190221, 28, term1190222);
        setElement(term1190221, 29, term1190222);
        setElement(term1190221, 30, term1190222);
        setElement(term1190221, 31, term1190222);
        setElement(term1190221, 32, term1190222);
        setElement(term1190221, 33, term1190222);
        setElement(term1190221, 34, term1190222);
        setElement(term1190221, 35, term1190222);
        setElement(term1190221, 36, term1190222);
        setElement(term1190221, 37, term1190222);
        setElement(term1190221, 38, term1190222);
        setElement(term1190221, 39, term1190222);
        setElement(term1190221, 40, term1190222);
        setElement(term1190221, 41, term1190222);
        setElement(term1190221, 42, term1190222);
        setElement(term1190221, 43, term1190222);
        setElement(term1190221, 44, term1190222);
        setElement(term1190221, 45, term1190222);
        setElement(term1190221, 46, term1190222);
        setElement(term1190221, 47, term1190222);
        setElement(term1190221, 48, term1190222);
        setElement(term1190221, 49, term1190222);
        setElement(term1190221, 50, term1190222);
        setElement(term1190221, 51, term1190222);
        setElement(term1190221, 52, term1190222);
        setElement(term1190221, 53, term1190222);
        setElement(term1190221, 54, term1190222);
        setElement(term1190221, 55, term1190222);
        setElement(term1190221, 56, term1190222);
        setElement(term1190221, 57, term1190222);
        setElement(term1190221, 58, term1190222);
        setElement(term1190221, 59, term1190222);
        setElement(term1190221, 60, term1190222);
        setElement(term1190221, 61, term1190222);
        setElement(term1190221, 62, term1190222);
        setElement(term1190221, 63, term1190222);
        setElement(term1190221, 64, term1190222);
        setField(term1223505, term1223505.getClass(), "jacobian", term1190221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1223505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



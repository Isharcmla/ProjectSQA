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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381472;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381472 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1378817 = (int[]) newIntArray(489);
        Object[] term1379308 = (Object[]) newArray("[D", 3);
        double[] term1379309 = (double[]) newDoubleArray(489);
        setIntField(term1381472, term1381472.getClass(), "cols", 1);
        setField(term1381472, term1381472.getClass(), "permutation", term1378817);
        setElement(term1379308, 0, term1379309);
        setElement(term1379308, 1, term1379309);
        setElement(term1379308, 2, term1379309);
        setField(term1381472, term1381472.getClass(), "jacobian", term1379308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1381472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class LevenbergMarquardtOptimizer_determineLMDirection_730901037111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76232;
     Object term73936;

    public LevenbergMarquardtOptimizer_determineLMDirection_730901037111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76232 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term74043 = (int[]) newIntArray(2);
        Object[] term74047 = (Object[]) newArray("[D", 13);
        double[] term74048 = (double[]) newDoubleArray(490);
        double[] term74539 = (double[]) newDoubleArray(489);
        double[] term76013 = (double[]) newDoubleArray(9);
        double[] term76023 = (double[]) newDoubleArray(9);
        setIntField(term76232, term76232.getClass(), "solvedCols", 2);
        setField(term76232, term76232.getClass(), "permutation", term74043);
        setElement(term74047, 0, term74048);
        setElement(term74047, 1, term74539);
        setElement(term74047, 2, term74048);
        setElement(term74047, 3, term74048);
        setElement(term74047, 4, term74048);
        setElement(term74047, 5, term74048);
        setElement(term74047, 6, term74048);
        setElement(term74047, 7, term74048);
        setElement(term74047, 8, term74048);
        setElement(term74047, 9, term74048);
        setElement(term74047, 10, term74048);
        setElement(term74047, 11, term74048);
        setElement(term74047, 12, term74048);
        setField(term76232, term76232.getClass(), "jacobian", term74047);
        setField(term76232, term76232.getClass(), "lmDir", term76013);
        setField(term76232, term76232.getClass(), "diagR", term76023);
        term73936 = (double[]) newDoubleArray(105);
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
        args[0] = term73936;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "determineLMDirection", argTypes, term76232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



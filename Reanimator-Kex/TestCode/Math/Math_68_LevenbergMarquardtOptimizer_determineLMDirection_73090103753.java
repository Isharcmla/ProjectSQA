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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21716;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21716 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term21238 = (int[]) newIntArray(4);
        Object[] term21244 = (Object[]) newArray("[D", 2);
        double[] term21245 = (double[]) newDoubleArray(108);
        double[] term21354 = (double[]) newDoubleArray(1);
        double[] term21472 = (double[]) newDoubleArray(52);
        double[] term21525 = (double[]) newDoubleArray(0);
        setIntField(term21716, term21716.getClass(), "solvedCols", 2);
        setField(term21716, term21716.getClass(), "permutation", term21238);
        setElement(term21244, 0, term21245);
        setElement(term21244, 1, term21354);
        setField(term21716, term21716.getClass(), "jacobian", term21244);
        setField(term21716, term21716.getClass(), "lmDir", term21472);
        setField(term21716, term21716.getClass(), "diagR", term21525);
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
            callMethod(klass, "determineLMDirection", argTypes, term21716, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



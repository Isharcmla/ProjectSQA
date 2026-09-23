package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_determineLMParameter_169194525493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307313;
     Object term306077;

    public LevenbergMarquardtOptimizer_determineLMParameter_169194525493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307313 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object[] term306128 = (Object[]) newArray("[D", 56);
        double[] term306129 = (double[]) newDoubleArray(6);
        double[] term306143 = (double[]) newDoubleArray(44);
        int[] term306188 = (int[]) newIntArray(108);
        setDoubleElement(term306129, 0, 4194304.0);
        setDoubleElement(term306129, 1, 4194304.0);
        setDoubleElement(term306129, 2, 4194304.0);
        setDoubleElement(term306129, 3, 4194304.0);
        setDoubleElement(term306129, 4, 4194304.0);
        setDoubleElement(term306129, 5, 4194304.0);
        setElement(term306128, 0, term306129);
        setField(term307313, term307313.getClass(), "weightedJacobian", term306128);
        setIntField(term307313, term307313.getClass(), "rank", 1);
        setField(term307313, term307313.getClass(), "lmDir", term306143);
        setField(term307313, term307313.getClass(), "permutation", term306188);
        term306077 = (double[]) newDoubleArray(49);
        setDoubleElement(term306077, 0, 4194304.0);
        setDoubleElement(term306077, 1, 4194304.0);
        setDoubleElement(term306077, 2, 4194304.0);
        setDoubleElement(term306077, 3, 4194304.0);
        setDoubleElement(term306077, 4, 4194304.0);
        setDoubleElement(term306077, 5, 4194304.0);
        setDoubleElement(term306077, 6, 4194304.0);
        setDoubleElement(term306077, 7, 4194304.0);
        setDoubleElement(term306077, 8, 4194304.0);
        setDoubleElement(term306077, 9, 4194304.0);
        setDoubleElement(term306077, 10, 4194304.0);
        setDoubleElement(term306077, 11, 4194304.0);
        setDoubleElement(term306077, 12, 4194304.0);
        setDoubleElement(term306077, 13, 4194304.0);
        setDoubleElement(term306077, 14, 4194304.0);
        setDoubleElement(term306077, 15, 4194304.0);
        setDoubleElement(term306077, 16, 4194304.0);
        setDoubleElement(term306077, 17, 4194304.0);
        setDoubleElement(term306077, 18, 4194304.0);
        setDoubleElement(term306077, 19, 4194304.0);
        setDoubleElement(term306077, 20, 4194304.0);
        setDoubleElement(term306077, 21, 4194304.0);
        setDoubleElement(term306077, 22, 4194304.0);
        setDoubleElement(term306077, 23, 4194304.0);
        setDoubleElement(term306077, 24, 4194304.0);
        setDoubleElement(term306077, 25, 4194304.0);
        setDoubleElement(term306077, 26, 4194304.0);
        setDoubleElement(term306077, 27, 4194304.0);
        setDoubleElement(term306077, 28, 4194304.0);
        setDoubleElement(term306077, 29, 4194304.0);
        setDoubleElement(term306077, 30, 4194304.0);
        setDoubleElement(term306077, 31, 4194304.0);
        setDoubleElement(term306077, 32, 4194304.0);
        setDoubleElement(term306077, 33, 4194304.0);
        setDoubleElement(term306077, 34, 4194304.0);
        setDoubleElement(term306077, 35, 4194304.0);
        setDoubleElement(term306077, 36, 4194304.0);
        setDoubleElement(term306077, 37, 4194304.0);
        setDoubleElement(term306077, 38, 4194304.0);
        setDoubleElement(term306077, 39, 4194304.0);
        setDoubleElement(term306077, 40, 4194304.0);
        setDoubleElement(term306077, 41, 4194304.0);
        setDoubleElement(term306077, 42, 4194304.0);
        setDoubleElement(term306077, 43, 4194304.0);
        setDoubleElement(term306077, 44, 4194304.0);
        setDoubleElement(term306077, 45, 4194304.0);
        setDoubleElement(term306077, 46, 4194304.0);
        setDoubleElement(term306077, 47, 4194304.0);
        setDoubleElement(term306077, 48, 4194304.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term306077;
        args[1] = 0.0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term307313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



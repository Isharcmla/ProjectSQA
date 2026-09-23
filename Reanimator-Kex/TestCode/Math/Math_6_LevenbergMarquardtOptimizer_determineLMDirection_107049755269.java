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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LevenbergMarquardtOptimizer_determineLMDirection_107049755269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40158;

    public LevenbergMarquardtOptimizer_determineLMDirection_107049755269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40158 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term39443 = (double[]) newDoubleArray(256);
        int[] term39956 = (int[]) newIntArray(0);
        setIntField(term40158, term40158.getClass(), "solvedCols", 0);
        setField(term40158, term40158.getClass(), "lmDir", term39443);
        setField(term40158, term40158.getClass(), "permutation", term39956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
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
            callMethod(klass, "determineLMDirection", argTypes, term40158, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



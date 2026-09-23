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

public class LevenbergMarquardtOptimizer_determineLMDirection_107049755279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61185;

    public LevenbergMarquardtOptimizer_determineLMDirection_107049755279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61185 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] term59535 = (int[]) newIntArray(498);
        Object[] term60035 = (Object[]) newArray("[D", 234);
        double[] term60036 = (double[]) newDoubleArray(105);
        double[] term60142 = (double[]) newDoubleArray(113);
        setIntField(term61185, term61185.getClass(), "solvedCols", 6);
        setField(term61185, term61185.getClass(), "permutation", term59535);
        setElement(term60035, 0, term60036);
        setElement(term60035, 1, term60142);
        setField(term61185, term61185.getClass(), "weightedJacobian", term60035);
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
            callMethod(klass, "determineLMDirection", argTypes, term61185, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



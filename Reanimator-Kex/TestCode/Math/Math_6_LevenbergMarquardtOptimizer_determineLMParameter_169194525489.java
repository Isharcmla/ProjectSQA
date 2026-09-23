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

public class LevenbergMarquardtOptimizer_determineLMParameter_169194525489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265772;
     Object term249917;

    public LevenbergMarquardtOptimizer_determineLMParameter_169194525489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265772 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object[] term249921 = (Object[]) newArray("[D", 1);
        double[] term249922 = (double[]) newDoubleArray(25);
        double[] term249974 = (double[]) newDoubleArray(105);
        int[] term250080 = (int[]) newIntArray(509);
        setDoubleElement(term249922, 0, 16384.0);
        setDoubleElement(term249922, 1, 16384.0);
        setDoubleElement(term249922, 2, 16384.0);
        setDoubleElement(term249922, 3, 16384.0);
        setDoubleElement(term249922, 4, 16384.0);
        setDoubleElement(term249922, 5, 16384.0);
        setDoubleElement(term249922, 6, 16384.0);
        setDoubleElement(term249922, 7, 16384.0);
        setDoubleElement(term249922, 8, 16384.0);
        setDoubleElement(term249922, 9, 16384.0);
        setDoubleElement(term249922, 10, 16384.0);
        setDoubleElement(term249922, 11, 16384.0);
        setDoubleElement(term249922, 12, 16384.0);
        setDoubleElement(term249922, 13, 16384.0);
        setDoubleElement(term249922, 14, 16384.0);
        setDoubleElement(term249922, 15, 16384.0);
        setDoubleElement(term249922, 16, 16384.0);
        setDoubleElement(term249922, 17, 16384.0);
        setDoubleElement(term249922, 18, 16384.0);
        setDoubleElement(term249922, 19, 16384.0);
        setDoubleElement(term249922, 20, 16384.0);
        setDoubleElement(term249922, 21, 16384.0);
        setDoubleElement(term249922, 22, 16384.0);
        setDoubleElement(term249922, 23, 16384.0);
        setDoubleElement(term249922, 24, 16384.0);
        setElement(term249921, 0, term249922);
        setField(term265772, term265772.getClass(), "weightedJacobian", term249921);
        setIntField(term265772, term265772.getClass(), "rank", 1);
        setField(term265772, term265772.getClass(), "lmDir", term249974);
        setField(term265772, term265772.getClass(), "permutation", term250080);
        term249917 = (double[]) newDoubleArray(2);
        setDoubleElement(term249917, 0, 16384.0);
        setDoubleElement(term249917, 1, 16384.0);
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
        args[0] = term249917;
        args[1] = 0.0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term265772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



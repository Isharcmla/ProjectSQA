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

public class LevenbergMarquardtOptimizer_determineLMParameter_169194525495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337896;
     Object term307986;

    public LevenbergMarquardtOptimizer_determineLMParameter_169194525495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337896 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object[] term307998 = (Object[]) newArray("[D", 52);
        double[] term307999 = (double[]) newDoubleArray(110);
        double[] term308221 = (double[]) newDoubleArray(10);
        int[] term308232 = (int[]) newIntArray(248);
        setDoubleElement(term307999, 0, 16.0);
        setDoubleElement(term307999, 1, 16.0);
        setDoubleElement(term307999, 2, 16.0);
        setDoubleElement(term307999, 3, 16.0);
        setDoubleElement(term307999, 4, 16.0);
        setDoubleElement(term307999, 5, 16.0);
        setDoubleElement(term307999, 6, 16.0);
        setDoubleElement(term307999, 7, 16.0);
        setDoubleElement(term307999, 8, 16.0);
        setDoubleElement(term307999, 9, 16.0);
        setDoubleElement(term307999, 10, 16.0);
        setDoubleElement(term307999, 11, 16.0);
        setDoubleElement(term307999, 12, 16.0);
        setDoubleElement(term307999, 13, 16.0);
        setDoubleElement(term307999, 14, 16.0);
        setDoubleElement(term307999, 15, 16.0);
        setDoubleElement(term307999, 16, 16.0);
        setDoubleElement(term307999, 17, 16.0);
        setDoubleElement(term307999, 18, 16.0);
        setDoubleElement(term307999, 19, 16.0);
        setDoubleElement(term307999, 20, 16.0);
        setDoubleElement(term307999, 21, 16.0);
        setDoubleElement(term307999, 22, 16.0);
        setDoubleElement(term307999, 23, 16.0);
        setDoubleElement(term307999, 24, 16.0);
        setDoubleElement(term307999, 25, 16.0);
        setDoubleElement(term307999, 26, 16.0);
        setDoubleElement(term307999, 27, 16.0);
        setDoubleElement(term307999, 28, 16.0);
        setDoubleElement(term307999, 29, 16.0);
        setDoubleElement(term307999, 30, 16.0);
        setDoubleElement(term307999, 31, 16.0);
        setDoubleElement(term307999, 32, 16.0);
        setDoubleElement(term307999, 33, 16.0);
        setDoubleElement(term307999, 34, 16.0);
        setDoubleElement(term307999, 35, 16.0);
        setDoubleElement(term307999, 36, 16.0);
        setDoubleElement(term307999, 37, 16.0);
        setDoubleElement(term307999, 38, 16.0);
        setDoubleElement(term307999, 39, 16.0);
        setDoubleElement(term307999, 40, 16.0);
        setDoubleElement(term307999, 41, 16.0);
        setDoubleElement(term307999, 42, 16.0);
        setDoubleElement(term307999, 43, 16.0);
        setDoubleElement(term307999, 44, 16.0);
        setDoubleElement(term307999, 45, 16.0);
        setDoubleElement(term307999, 46, 16.0);
        setDoubleElement(term307999, 47, 16.0);
        setDoubleElement(term307999, 48, 16.0);
        setDoubleElement(term307999, 49, 16.0);
        setDoubleElement(term307999, 50, 16.0);
        setDoubleElement(term307999, 51, 16.0);
        setDoubleElement(term307999, 52, 16.0);
        setDoubleElement(term307999, 53, 16.0);
        setDoubleElement(term307999, 54, 16.0);
        setDoubleElement(term307999, 55, 16.0);
        setDoubleElement(term307999, 56, 16.0);
        setDoubleElement(term307999, 57, 16.0);
        setDoubleElement(term307999, 58, 16.0);
        setDoubleElement(term307999, 59, 16.0);
        setDoubleElement(term307999, 60, 16.0);
        setDoubleElement(term307999, 61, 16.0);
        setDoubleElement(term307999, 62, 16.0);
        setDoubleElement(term307999, 63, 16.0);
        setDoubleElement(term307999, 64, 16.0);
        setDoubleElement(term307999, 65, 16.0);
        setDoubleElement(term307999, 66, 16.0);
        setDoubleElement(term307999, 67, 16.0);
        setDoubleElement(term307999, 68, 16.0);
        setDoubleElement(term307999, 69, 16.0);
        setDoubleElement(term307999, 70, 16.0);
        setDoubleElement(term307999, 71, 16.0);
        setDoubleElement(term307999, 72, 16.0);
        setDoubleElement(term307999, 73, 16.0);
        setDoubleElement(term307999, 74, 16.0);
        setDoubleElement(term307999, 75, 16.0);
        setDoubleElement(term307999, 76, 16.0);
        setDoubleElement(term307999, 77, 16.0);
        setDoubleElement(term307999, 78, 16.0);
        setDoubleElement(term307999, 79, 16.0);
        setDoubleElement(term307999, 80, 16.0);
        setDoubleElement(term307999, 81, 16.0);
        setDoubleElement(term307999, 82, 16.0);
        setDoubleElement(term307999, 83, 16.0);
        setDoubleElement(term307999, 84, 16.0);
        setDoubleElement(term307999, 85, 16.0);
        setDoubleElement(term307999, 86, 16.0);
        setDoubleElement(term307999, 87, 16.0);
        setDoubleElement(term307999, 88, 16.0);
        setDoubleElement(term307999, 89, 16.0);
        setDoubleElement(term307999, 90, 16.0);
        setDoubleElement(term307999, 91, 16.0);
        setDoubleElement(term307999, 92, 16.0);
        setDoubleElement(term307999, 93, 16.0);
        setDoubleElement(term307999, 94, 16.0);
        setDoubleElement(term307999, 95, 16.0);
        setDoubleElement(term307999, 96, 16.0);
        setDoubleElement(term307999, 97, 16.0);
        setDoubleElement(term307999, 98, 16.0);
        setDoubleElement(term307999, 99, 16.0);
        setDoubleElement(term307999, 100, 16.0);
        setDoubleElement(term307999, 101, 16.0);
        setDoubleElement(term307999, 102, 16.0);
        setDoubleElement(term307999, 103, 16.0);
        setDoubleElement(term307999, 104, 16.0);
        setDoubleElement(term307999, 105, 16.0);
        setDoubleElement(term307999, 106, 16.0);
        setDoubleElement(term307999, 107, 16.0);
        setDoubleElement(term307999, 108, 16.0);
        setDoubleElement(term307999, 109, 16.0);
        setElement(term307998, 0, term307999);
        setField(term337896, term337896.getClass(), "weightedJacobian", term307998);
        setIntField(term337896, term337896.getClass(), "rank", 1);
        setField(term337896, term337896.getClass(), "lmDir", term308221);
        setField(term337896, term337896.getClass(), "permutation", term308232);
        term307986 = (double[]) newDoubleArray(10);
        setDoubleElement(term307986, 0, 16.0);
        setDoubleElement(term307986, 1, 16.0);
        setDoubleElement(term307986, 2, 16.0);
        setDoubleElement(term307986, 3, 16.0);
        setDoubleElement(term307986, 4, 16.0);
        setDoubleElement(term307986, 5, 16.0);
        setDoubleElement(term307986, 6, 16.0);
        setDoubleElement(term307986, 7, 16.0);
        setDoubleElement(term307986, 8, 16.0);
        setDoubleElement(term307986, 9, 16.0);
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
        args[0] = term307986;
        args[1] = 0.0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term337896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class LevenbergMarquardtOptimizer_determineLMDirection_730901037107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70126;

    public LevenbergMarquardtOptimizer_determineLMDirection_730901037107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70126 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term69793 = (int[]) newIntArray(20);
        Object[] term69815 = (Object[]) newArray("[D", 3);
        double[] term69816 = (double[]) newDoubleArray(10);
        double[] term69827 = (double[]) newDoubleArray(12);
        setIntField(term70126, term70126.getClass(), "solvedCols", 10);
        setIntElement(term69793, 3, 16);
        setIntElement(term69793, 4, 16);
        setIntElement(term69793, 5, 16);
        setIntElement(term69793, 6, 16);
        setIntElement(term69793, 7, 16);
        setIntElement(term69793, 8, 16);
        setIntElement(term69793, 9, 16);
        setIntElement(term69793, 10, 16);
        setIntElement(term69793, 11, 16);
        setIntElement(term69793, 12, 16);
        setIntElement(term69793, 13, 16);
        setIntElement(term69793, 14, 16);
        setIntElement(term69793, 15, 16);
        setIntElement(term69793, 16, 16);
        setIntElement(term69793, 17, 16);
        setIntElement(term69793, 18, 16);
        setIntElement(term69793, 19, 16);
        setField(term70126, term70126.getClass(), "permutation", term69793);
        setElement(term69815, 0, term69816);
        setElement(term69815, 1, term69816);
        setElement(term69815, 2, term69827);
        setField(term70126, term70126.getClass(), "jacobian", term69815);
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
            callMethod(klass, "determineLMDirection", argTypes, term70126, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



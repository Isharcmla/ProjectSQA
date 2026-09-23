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

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24739;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24739 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term23425 = (int[]) newIntArray(20);
        Object[] term23447 = (Object[]) newArray("[D", 129);
        double[] term23448 = (double[]) newDoubleArray(489);
        double[] term23938 = (double[]) newDoubleArray(50);
        setIntField(term24739, term24739.getClass(), "solvedCols", 3);
        setIntElement(term23425, 2, 1073741824);
        setIntElement(term23425, 3, 1073741824);
        setIntElement(term23425, 4, 1073741824);
        setIntElement(term23425, 5, 1073741824);
        setIntElement(term23425, 6, 1073741824);
        setIntElement(term23425, 7, 1073741824);
        setIntElement(term23425, 8, 1073741824);
        setIntElement(term23425, 9, 1073741824);
        setIntElement(term23425, 10, 1073741824);
        setIntElement(term23425, 11, 1073741824);
        setIntElement(term23425, 12, 1073741824);
        setIntElement(term23425, 13, 1073741824);
        setIntElement(term23425, 14, 1073741824);
        setIntElement(term23425, 15, 1073741824);
        setIntElement(term23425, 16, 1073741824);
        setIntElement(term23425, 17, 1073741824);
        setIntElement(term23425, 18, 1073741824);
        setIntElement(term23425, 19, 1073741824);
        setField(term24739, term24739.getClass(), "permutation", term23425);
        setElement(term23447, 0, term23448);
        setDoubleElement(term23938, 0, 1024.0);
        setElement(term23447, 1, term23938);
        setField(term24739, term24739.getClass(), "jacobian", term23447);
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
            callMethod(klass, "determineLMDirection", argTypes, term24739, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



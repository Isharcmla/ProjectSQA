package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_linearCombination_133804018070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2191;
     Object term2194;

    public MathArrays_linearCombination_133804018070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2191 = (double[]) newDoubleArray(2);
        setDoubleElement(term2191, 0, 0.2440697646709713);
        setDoubleElement(term2191, 1, 0.7977455176064363);
        term2194 = (double[]) newDoubleArray(9);
        setDoubleElement(term2194, 0, 0.5329919447422633);
        setDoubleElement(term2194, 1, 0.7046974927834232);
        setDoubleElement(term2194, 2, 0.6896952303224777);
        setDoubleElement(term2194, 3, 0.6693176553622628);
        setDoubleElement(term2194, 4, 0.2962868255626906);
        setDoubleElement(term2194, 5, 0.25474180574060834);
        setDoubleElement(term2194, 6, 0.9957585718901875);
        setDoubleElement(term2194, 7, 0.16755811343784477);
        setDoubleElement(term2194, 8, 0.9090793968999221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2191;
        args[1] = term2194;
        try {
            callMethod(klass, "linearCombination", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};



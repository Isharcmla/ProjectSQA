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

public class MathArrays_ebeDivide_38250127747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term83;

    public MathArrays_ebeDivide_38250127747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = (double[]) newDoubleArray(7);
        setDoubleElement(term75, 0, 0.6300849762307866);
        setDoubleElement(term75, 1, 0.9737083944266686);
        setDoubleElement(term75, 2, 0.0668892744806211);
        setDoubleElement(term75, 3, 0.3587267442738795);
        setDoubleElement(term75, 4, 0.07802449704920456);
        setDoubleElement(term75, 5, 0.5279279537140873);
        setDoubleElement(term75, 6, 0.3202192021706908);
        term83 = (double[]) newDoubleArray(1);
        setDoubleElement(term83, 0, 0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term75;
        args[1] = term83;
        try {
            callMethod(klass, "ebeDivide", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};



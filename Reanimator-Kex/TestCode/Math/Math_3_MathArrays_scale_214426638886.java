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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;
import java.lang.Double;

public class MathArrays_scale_214426638886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20409;
     Object term24479;
     Object term24468;

    public MathArrays_scale_214426638886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20409 = (double[]) newDoubleArray(4);
        term24479 = (double[]) newDoubleArray(4);
        term24468 = (double[]) newDoubleArray(4);
        setDoubleElement(term24468, 0, Double.NaN);
        setDoubleElement(term24468, 1, Double.NaN);
        setDoubleElement(term24468, 2, Double.NaN);
        setDoubleElement(term24468, 3, Double.NaN);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = Double.NaN;
        args[1] = term20409;
        Object retValue = callMethod(klass, "scale", argTypes, null, args);
        assertTrue(recursiveEquals(term20409, term24479));
        assertTrue(recursiveEquals(retValue, term24468));
    }

};



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

public class MathArrays_ebeAdd_9430874144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term29;

    public MathArrays_ebeAdd_9430874144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = (double[]) newDoubleArray(3);
        setDoubleElement(term25, 0, 0.5183269973490326);
        setDoubleElement(term25, 1, 0.7655020693602768);
        setDoubleElement(term25, 2, 0.1374549299694151);
        term29 = (double[]) newDoubleArray(4);
        setDoubleElement(term29, 0, 0.7031006357544823);
        setDoubleElement(term29, 1, 0.9527281779865117);
        setDoubleElement(term29, 2, 0.9828442029246764);
        setDoubleElement(term29, 3, 0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term25;
        args[1] = term29;
        try {
            callMethod(klass, "ebeAdd", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};



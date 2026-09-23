package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MathUtils_equals_176199458474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term81;
     Object term3064;
     Object term3065;

    public MathUtils_equals_176199458474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = (double[]) newDoubleArray(5);
        setDoubleElement(term75, 0, 0.5183269973490326);
        setDoubleElement(term75, 1, 0.7655020693602768);
        setDoubleElement(term75, 2, 0.1374549299694151);
        setDoubleElement(term75, 3, 0.7031006357544823);
        setDoubleElement(term75, 4, 0.9527281779865117);
        term81 = (double[]) newDoubleArray(4);
        setDoubleElement(term81, 0, 0.9828442029246764);
        setDoubleElement(term81, 1, 0.2779719046761513);
        setDoubleElement(term81, 2, 0.6436713023569729);
        setDoubleElement(term81, 3, 0.7332741045694002);
        term3064 = (double[]) newDoubleArray(5);
        setDoubleElement(term3064, 0, 0.5183269973490326);
        setDoubleElement(term3064, 1, 0.7655020693602768);
        setDoubleElement(term3064, 2, 0.1374549299694151);
        setDoubleElement(term3064, 3, 0.7031006357544823);
        setDoubleElement(term3064, 4, 0.9527281779865117);
        term3065 = (double[]) newDoubleArray(4);
        setDoubleElement(term3065, 0, 0.9828442029246764);
        setDoubleElement(term3065, 1, 0.2779719046761513);
        setDoubleElement(term3065, 2, 0.6436713023569729);
        setDoubleElement(term3065, 3, 0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term75;
        args[1] = term81;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term75, term3064));
        assertTrue(recursiveEquals(term81, term3065));
        assertTrue(recursiveEquals(retValue, false));
    }

};



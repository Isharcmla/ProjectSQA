package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1289675006256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;
     Object term931;
     Object term933;
     Object term935;
     Object term13586;

    public ArrayUtils_lastIndexOf_1289675006256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929 = (double[]) newDoubleArray(1);
        setDoubleElement(term929, 0, 0.20737514139742264);
        term931 = new Double(0.7919370314903882);
        term933 = new Integer(1375330971);
        term935 = new Double(0.2109867221632754);
        term13586 = (double[]) newDoubleArray(1);
        setDoubleElement(term13586, 0, 0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term929;
        args[1] = term931;
        args[2] = term933;
        args[3] = term935;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term929, term13586));
        assertTrue(recursiveEquals(term931, 0.7919370314903882));
        assertTrue(recursiveEquals(term933, 1375330971));
        assertTrue(recursiveEquals(term935, 0.2109867221632754));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



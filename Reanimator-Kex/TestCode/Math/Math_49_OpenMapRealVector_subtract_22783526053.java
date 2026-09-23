package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_subtract_22783526053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10320;
     Object term10427;

    public OpenMapRealVector_subtract_22783526053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10320 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10321 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10322 = (int[]) newIntArray(32);
        double[] term10355 = (double[]) newDoubleArray(32);
        byte[] term10388 = (byte[]) newByteArray(32);
        setField(term10321, term10321.getClass(), "keys", term10322);
        setField(term10321, term10321.getClass(), "values", term10355);
        setField(term10321, term10321.getClass(), "states", term10388);
        setDoubleField(term10321, term10321.getClass(), "missingEntries", 0.0);
        setIntField(term10321, term10321.getClass(), "size", 0);
        setIntField(term10321, term10321.getClass(), "mask", 31);
        setIntField(term10321, term10321.getClass(), "count", 0);
        setField(term10320, term10320.getClass(), "entries", term10321);
        setIntField(term10320, term10320.getClass(), "virtualSize", -2095575670);
        setDoubleField(term10320, term10320.getClass(), "epsilon", 1.0E-12);
        term10427 = (double[]) newDoubleArray(2);
        setDoubleElement(term10427, 0, 0.7919370314903882);
        setDoubleElement(term10427, 1, 0.2109867221632754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10427;
        callMethod(klass, "subtract", argTypes, term10320, args);
    }

};



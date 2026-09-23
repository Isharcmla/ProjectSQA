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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastMath_splitAdd_89338495687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term111;
     Object term113;

    public FastMath_splitAdd_89338495687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = (double[]) newDoubleArray(7);
        setDoubleElement(term103, 0, 0.2192450926212024);
        setDoubleElement(term103, 1, 0.7591353014991907);
        setDoubleElement(term103, 2, 0.791695029600875);
        setDoubleElement(term103, 3, 0.6862221294683138);
        setDoubleElement(term103, 4, 0.15917839663695388);
        setDoubleElement(term103, 5, 0.9374115574082594);
        setDoubleElement(term103, 6, 0.8454723071922143);
        term111 = (double[]) newDoubleArray(1);
        setDoubleElement(term111, 0, 0.8566567697571895);
        term113 = (double[]) newDoubleArray(6);
        setDoubleElement(term113, 0, 0.9203805380592256);
        setDoubleElement(term113, 1, 0.5804948995371725);
        setDoubleElement(term113, 2, 0.20737514139742264);
        setDoubleElement(term113, 3, 0.7919370314903882);
        setDoubleElement(term113, 4, 0.2109867221632754);
        setDoubleElement(term113, 5, 0.3227335400819148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term103;
        args[1] = term111;
        args[2] = term113;
        try {
            callMethod(klass, "splitAdd", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



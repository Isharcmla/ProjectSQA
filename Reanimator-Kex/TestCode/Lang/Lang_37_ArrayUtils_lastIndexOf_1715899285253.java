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

public class ArrayUtils_lastIndexOf_1715899285253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899;
     Object term907;
     Object term909;
     Object term13509;

    public ArrayUtils_lastIndexOf_1715899285253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899 = (double[]) newDoubleArray(7);
        setDoubleElement(term899, 0, 0.791695029600875);
        setDoubleElement(term899, 1, 0.6862221294683138);
        setDoubleElement(term899, 2, 0.15917839663695388);
        setDoubleElement(term899, 3, 0.9374115574082594);
        setDoubleElement(term899, 4, 0.8454723071922143);
        setDoubleElement(term899, 5, 0.8566567697571895);
        setDoubleElement(term899, 6, 0.9203805380592256);
        term907 = new Double(0.5804948995371725);
        term909 = new Integer(1063420942);
        term13509 = (double[]) newDoubleArray(7);
        setDoubleElement(term13509, 0, 0.791695029600875);
        setDoubleElement(term13509, 1, 0.6862221294683138);
        setDoubleElement(term13509, 2, 0.15917839663695388);
        setDoubleElement(term13509, 3, 0.9374115574082594);
        setDoubleElement(term13509, 4, 0.8454723071922143);
        setDoubleElement(term13509, 5, 0.8566567697571895);
        setDoubleElement(term13509, 6, 0.9203805380592256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term899;
        args[1] = term907;
        args[2] = term909;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term899, term13509));
        assertTrue(recursiveEquals(term907, 0.5804948995371725));
        assertTrue(recursiveEquals(term909, 1063420942));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



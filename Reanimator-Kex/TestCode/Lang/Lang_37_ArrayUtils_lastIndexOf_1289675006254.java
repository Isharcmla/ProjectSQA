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

public class ArrayUtils_lastIndexOf_1289675006254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;
     Object term920;
     Object term922;
     Object term924;
     Object term13540;

    public ArrayUtils_lastIndexOf_1289675006254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = (double[]) newDoubleArray(1);
        setDoubleElement(term918, 0, 0.20737514139742264);
        term920 = new Double(0.7919370314903882);
        term922 = new Integer(1375330971);
        term924 = new Double(0.2109867221632754);
        term13540 = (double[]) newDoubleArray(1);
        setDoubleElement(term13540, 0, 0.20737514139742264);
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
        args[0] = term918;
        args[1] = term920;
        args[2] = term922;
        args[3] = term924;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term918, term13540));
        assertTrue(recursiveEquals(term920, 0.7919370314903882));
        assertTrue(recursiveEquals(term922, 1375330971));
        assertTrue(recursiveEquals(term924, 0.2109867221632754));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



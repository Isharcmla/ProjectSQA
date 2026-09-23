package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class Node_newNumber_1394570311222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;
     Object term651;
     Object term653;
     Object term11716;

    public Node_newNumber_1394570311222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649 = new Double(0.3455959125047594);
        term651 = new Integer(477625804);
        term653 = new Integer(252575029);
        term11716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11716, term11716.getClass(), "number", 0.3455959125047594);
        setIntField(term11716, term11716.getClass(), "type", 39);
        setField(term11716, term11716.getClass(), "next", null);
        setField(term11716, term11716.getClass(), "first", null);
        setField(term11716, term11716.getClass(), "last", null);
        setField(term11716, term11716.getClass(), "propListHead", null);
        setIntField(term11716, term11716.getClass(), "sourcePosition", 2145177599);
        setField(term11716, term11716.getClass(), "jsType", null);
        setField(term11716, term11716.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term649;
        args[1] = term651;
        args[2] = term653;
        Object retValue = callMethod(klass, "newNumber", argTypes, null, args);
        assertTrue(recursiveEquals(term649, 477625804));
        assertTrue(recursiveEquals(term651, 252575029));
        assertTrue(recursiveEquals(term653, 0.3455959125047594));
        assertTrue(recursiveEquals(retValue, term11716));
    }

};



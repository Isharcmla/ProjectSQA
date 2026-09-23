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
import java.lang.Object;

public class Node_getSortedPropTypes_870419701501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39890;
     Object term40109;
     Object term40101;

    public Node_getSortedPropTypes_870419701501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39992 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term39890, term39890.getClass(), "propListHead", term39992);
        term40109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40110 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term40109, term40109.getClass(), "type", 0);
        setField(term40109, term40109.getClass(), "next", null);
        setField(term40109, term40109.getClass(), "first", null);
        setField(term40109, term40109.getClass(), "last", null);
        setIntField(term40110, term40110.getClass(), "intValue", 0);
        setField(term40110, term40110.getClass(), "next", null);
        setIntField(term40110, term40110.getClass(), "propType", 0);
        setField(term40109, term40109.getClass(), "propListHead", term40110);
        setIntField(term40109, term40109.getClass(), "sourcePosition", 0);
        setField(term40109, term40109.getClass(), "jsType", null);
        setField(term40109, term40109.getClass(), "parent", null);
        term40101 = (int[]) newIntArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSortedPropTypes", argTypes, term39890, args);
        assertTrue(recursiveEquals(term39890, term40109));
        assertTrue(recursiveEquals(retValue, term40101));
    }

};



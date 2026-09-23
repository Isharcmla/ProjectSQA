package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_arrayToString_1073419571401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48164;
     Object term48315;

    public NodeUtil_arrayToString_1073419571401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48234, term48234.getClass(), "type", 41);
        setField(term48164, term48164.getClass(), "first", term48234);
        term48315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48315, term48315.getClass(), "type", 0);
        setField(term48315, term48315.getClass(), "next", null);
        setIntField(term48316, term48316.getClass(), "type", 41);
        setField(term48316, term48316.getClass(), "next", null);
        setField(term48316, term48316.getClass(), "first", null);
        setField(term48316, term48316.getClass(), "last", null);
        setField(term48316, term48316.getClass(), "propListHead", null);
        setIntField(term48316, term48316.getClass(), "sourcePosition", 0);
        setField(term48316, term48316.getClass(), "jsType", null);
        setField(term48316, term48316.getClass(), "parent", null);
        setField(term48315, term48315.getClass(), "first", term48316);
        setField(term48315, term48315.getClass(), "last", null);
        setField(term48315, term48315.getClass(), "propListHead", null);
        setIntField(term48315, term48315.getClass(), "sourcePosition", 0);
        setField(term48315, term48315.getClass(), "jsType", null);
        setField(term48315, term48315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48164;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term48164, term48315));
        assertTrue(recursiveEquals(retValue, ""));
    }

};



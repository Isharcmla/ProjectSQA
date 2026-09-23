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

public class ReferenceCollectingCallback_isBlockBoundary_684698721967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246602;
     Object term246694;
     Object term246809;
     Object term246811;

    public ReferenceCollectingCallback_isBlockBoundary_684698721967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term246694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term246694, term246694.getClass(), "type", 108);
        setField(term246694, term246694.getClass(), "first", term246786);
        term246809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246810 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term246809, term246809.getClass(), "number", 0.0);
        setIntField(term246809, term246809.getClass(), "type", 108);
        setField(term246809, term246809.getClass(), "next", null);
        setDoubleField(term246810, term246810.getClass(), "number", 0.0);
        setIntField(term246810, term246810.getClass(), "type", 0);
        setField(term246810, term246810.getClass(), "next", null);
        setField(term246810, term246810.getClass(), "first", null);
        setField(term246810, term246810.getClass(), "last", null);
        setField(term246810, term246810.getClass(), "propListHead", null);
        setIntField(term246810, term246810.getClass(), "sourcePosition", 0);
        setField(term246810, term246810.getClass(), "jsType", null);
        setField(term246810, term246810.getClass(), "parent", null);
        setField(term246809, term246809.getClass(), "first", term246810);
        setField(term246809, term246809.getClass(), "last", null);
        setField(term246809, term246809.getClass(), "propListHead", null);
        setIntField(term246809, term246809.getClass(), "sourcePosition", 0);
        setField(term246809, term246809.getClass(), "jsType", null);
        setField(term246809, term246809.getClass(), "parent", null);
        term246811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term246811, term246811.getClass(), "number", 0.0);
        setIntField(term246811, term246811.getClass(), "type", 0);
        setField(term246811, term246811.getClass(), "next", null);
        setField(term246811, term246811.getClass(), "first", null);
        setField(term246811, term246811.getClass(), "last", null);
        setField(term246811, term246811.getClass(), "propListHead", null);
        setIntField(term246811, term246811.getClass(), "sourcePosition", 0);
        setField(term246811, term246811.getClass(), "jsType", null);
        setField(term246811, term246811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term246602;
        args[1] = term246694;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term246602, term246809));
        assertTrue(recursiveEquals(term246694, term246811));
        assertTrue(recursiveEquals(retValue, true));
    }

};



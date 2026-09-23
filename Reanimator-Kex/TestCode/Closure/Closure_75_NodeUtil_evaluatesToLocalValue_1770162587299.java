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
import java.lang.Object;

public class NodeUtil_evaluatesToLocalValue_1770162587299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4323;

    public NodeUtil_evaluatesToLocalValue_1770162587299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4336 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4346 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4323, term4323.getClass(), "type", 459471826);
        setIntField(term4325, term4325.getClass(), "type", -1343269854);
        setIntField(term4327, term4327.getClass(), "type", 0);
        setField(term4327, term4327.getClass(), "next", null);
        setField(term4327, term4327.getClass(), "first", null);
        setField(term4327, term4327.getClass(), "last", null);
        setField(term4327, term4327.getClass(), "propListHead", null);
        setIntField(term4327, term4327.getClass(), "sourcePosition", 0);
        setField(term4327, term4327.getClass(), "jsType", null);
        setField(term4327, term4327.getClass(), "parent", null);
        setField(term4325, term4325.getClass(), "next", term4327);
        setIntField(term4330, term4330.getClass(), "type", 0);
        setField(term4330, term4330.getClass(), "next", null);
        setField(term4330, term4330.getClass(), "first", null);
        setField(term4330, term4330.getClass(), "last", null);
        setField(term4330, term4330.getClass(), "propListHead", null);
        setIntField(term4330, term4330.getClass(), "sourcePosition", 0);
        setField(term4330, term4330.getClass(), "jsType", null);
        setField(term4330, term4330.getClass(), "parent", null);
        setField(term4325, term4325.getClass(), "first", term4330);
        setIntField(term4333, term4333.getClass(), "type", 0);
        setField(term4333, term4333.getClass(), "next", null);
        setField(term4333, term4333.getClass(), "first", null);
        setField(term4333, term4333.getClass(), "last", null);
        setField(term4333, term4333.getClass(), "propListHead", null);
        setIntField(term4333, term4333.getClass(), "sourcePosition", 0);
        setField(term4333, term4333.getClass(), "jsType", null);
        setField(term4333, term4333.getClass(), "parent", null);
        setField(term4325, term4325.getClass(), "last", term4333);
        setField(term4336, term4336.getClass(), "next", null);
        setIntField(term4336, term4336.getClass(), "type", 0);
        setIntField(term4336, term4336.getClass(), "intValue", 0);
        setField(term4336, term4336.getClass(), "objectValue", null);
        setField(term4325, term4325.getClass(), "propListHead", term4336);
        setIntField(term4325, term4325.getClass(), "sourcePosition", 38489871);
        setField(term4325, term4325.getClass(), "jsType", null);
        setField(term4325, term4325.getClass(), "parent", null);
        setField(term4323, term4323.getClass(), "next", term4325);
        setIntField(term4340, term4340.getClass(), "type", 0);
        setField(term4340, term4340.getClass(), "next", null);
        setField(term4340, term4340.getClass(), "first", null);
        setField(term4340, term4340.getClass(), "last", null);
        setField(term4340, term4340.getClass(), "propListHead", null);
        setIntField(term4340, term4340.getClass(), "sourcePosition", 0);
        setField(term4340, term4340.getClass(), "jsType", null);
        setField(term4340, term4340.getClass(), "parent", null);
        setField(term4323, term4323.getClass(), "first", term4340);
        setIntField(term4343, term4343.getClass(), "type", 0);
        setField(term4343, term4343.getClass(), "next", null);
        setField(term4343, term4343.getClass(), "first", null);
        setField(term4343, term4343.getClass(), "last", null);
        setField(term4343, term4343.getClass(), "propListHead", null);
        setIntField(term4343, term4343.getClass(), "sourcePosition", 0);
        setField(term4343, term4343.getClass(), "jsType", null);
        setField(term4343, term4343.getClass(), "parent", null);
        setField(term4323, term4323.getClass(), "last", term4343);
        setField(term4346, term4346.getClass(), "next", null);
        setIntField(term4346, term4346.getClass(), "type", 0);
        setIntField(term4346, term4346.getClass(), "intValue", 0);
        setField(term4346, term4346.getClass(), "objectValue", null);
        setField(term4323, term4323.getClass(), "propListHead", term4346);
        setIntField(term4323, term4323.getClass(), "sourcePosition", -1667787735);
        setField(term4323, term4323.getClass(), "jsType", null);
        setField(term4323, term4323.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term4323;
        args[1] = null;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



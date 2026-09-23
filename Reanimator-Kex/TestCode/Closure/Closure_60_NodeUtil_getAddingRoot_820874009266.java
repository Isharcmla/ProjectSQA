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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getAddingRoot_820874009266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;

    public NodeUtil_getAddingRoot_820874009266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2389, term2389.getClass(), "type", -761675396);
        setIntField(term2391, term2391.getClass(), "type", 1077647088);
        setIntField(term2393, term2393.getClass(), "type", 0);
        setField(term2393, term2393.getClass(), "next", null);
        setField(term2393, term2393.getClass(), "first", null);
        setField(term2393, term2393.getClass(), "last", null);
        setField(term2393, term2393.getClass(), "propListHead", null);
        setIntField(term2393, term2393.getClass(), "sourcePosition", 0);
        setField(term2393, term2393.getClass(), "jsType", null);
        setField(term2393, term2393.getClass(), "parent", null);
        setField(term2391, term2391.getClass(), "next", term2393);
        setIntField(term2396, term2396.getClass(), "type", 0);
        setField(term2396, term2396.getClass(), "next", null);
        setField(term2396, term2396.getClass(), "first", null);
        setField(term2396, term2396.getClass(), "last", null);
        setField(term2396, term2396.getClass(), "propListHead", null);
        setIntField(term2396, term2396.getClass(), "sourcePosition", 0);
        setField(term2396, term2396.getClass(), "jsType", null);
        setField(term2396, term2396.getClass(), "parent", null);
        setField(term2391, term2391.getClass(), "first", term2396);
        setIntField(term2399, term2399.getClass(), "type", 0);
        setField(term2399, term2399.getClass(), "next", null);
        setField(term2399, term2399.getClass(), "first", null);
        setField(term2399, term2399.getClass(), "last", null);
        setField(term2399, term2399.getClass(), "propListHead", null);
        setIntField(term2399, term2399.getClass(), "sourcePosition", 0);
        setField(term2399, term2399.getClass(), "jsType", null);
        setField(term2399, term2399.getClass(), "parent", null);
        setField(term2391, term2391.getClass(), "last", term2399);
        setField(term2391, term2391.getClass(), "propListHead", null);
        setIntField(term2391, term2391.getClass(), "sourcePosition", 0);
        setField(term2391, term2391.getClass(), "jsType", null);
        setField(term2391, term2391.getClass(), "parent", null);
        setField(term2389, term2389.getClass(), "next", term2391);
        setIntField(term2403, term2403.getClass(), "type", 0);
        setField(term2403, term2403.getClass(), "next", null);
        setField(term2403, term2403.getClass(), "first", null);
        setField(term2403, term2403.getClass(), "last", null);
        setField(term2403, term2403.getClass(), "propListHead", null);
        setIntField(term2403, term2403.getClass(), "sourcePosition", 0);
        setField(term2403, term2403.getClass(), "jsType", null);
        setField(term2403, term2403.getClass(), "parent", null);
        setField(term2389, term2389.getClass(), "first", term2403);
        setIntField(term2406, term2406.getClass(), "type", 0);
        setField(term2406, term2406.getClass(), "next", null);
        setField(term2406, term2406.getClass(), "first", null);
        setField(term2406, term2406.getClass(), "last", null);
        setField(term2406, term2406.getClass(), "propListHead", null);
        setIntField(term2406, term2406.getClass(), "sourcePosition", 0);
        setField(term2406, term2406.getClass(), "jsType", null);
        setField(term2406, term2406.getClass(), "parent", null);
        setField(term2389, term2389.getClass(), "last", term2406);
        setField(term2389, term2389.getClass(), "propListHead", null);
        setIntField(term2389, term2389.getClass(), "sourcePosition", 0);
        setField(term2389, term2389.getClass(), "jsType", null);
        setField(term2389, term2389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2389;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



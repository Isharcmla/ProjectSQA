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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasCatchHandler_1686917870294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3283;

    public NodeUtil_hasCatchHandler_1686917870294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3283, term3283.getClass(), "type", -1290093259);
        setIntField(term3285, term3285.getClass(), "type", -1443680397);
        setIntField(term3287, term3287.getClass(), "type", 0);
        setField(term3287, term3287.getClass(), "next", null);
        setField(term3287, term3287.getClass(), "first", null);
        setField(term3287, term3287.getClass(), "last", null);
        setField(term3287, term3287.getClass(), "propListHead", null);
        setIntField(term3287, term3287.getClass(), "sourcePosition", 0);
        setField(term3287, term3287.getClass(), "jsType", null);
        setField(term3287, term3287.getClass(), "parent", null);
        setField(term3285, term3285.getClass(), "next", term3287);
        setIntField(term3290, term3290.getClass(), "type", 0);
        setField(term3290, term3290.getClass(), "next", null);
        setField(term3290, term3290.getClass(), "first", null);
        setField(term3290, term3290.getClass(), "last", null);
        setField(term3290, term3290.getClass(), "propListHead", null);
        setIntField(term3290, term3290.getClass(), "sourcePosition", 0);
        setField(term3290, term3290.getClass(), "jsType", null);
        setField(term3290, term3290.getClass(), "parent", null);
        setField(term3285, term3285.getClass(), "first", term3290);
        setIntField(term3293, term3293.getClass(), "type", 0);
        setField(term3293, term3293.getClass(), "next", null);
        setField(term3293, term3293.getClass(), "first", null);
        setField(term3293, term3293.getClass(), "last", null);
        setField(term3293, term3293.getClass(), "propListHead", null);
        setIntField(term3293, term3293.getClass(), "sourcePosition", 0);
        setField(term3293, term3293.getClass(), "jsType", null);
        setField(term3293, term3293.getClass(), "parent", null);
        setField(term3285, term3285.getClass(), "last", term3293);
        setField(term3285, term3285.getClass(), "propListHead", null);
        setIntField(term3285, term3285.getClass(), "sourcePosition", 0);
        setField(term3285, term3285.getClass(), "jsType", null);
        setField(term3285, term3285.getClass(), "parent", null);
        setField(term3283, term3283.getClass(), "next", term3285);
        setIntField(term3297, term3297.getClass(), "type", 0);
        setField(term3297, term3297.getClass(), "next", null);
        setField(term3297, term3297.getClass(), "first", null);
        setField(term3297, term3297.getClass(), "last", null);
        setField(term3297, term3297.getClass(), "propListHead", null);
        setIntField(term3297, term3297.getClass(), "sourcePosition", 0);
        setField(term3297, term3297.getClass(), "jsType", null);
        setField(term3297, term3297.getClass(), "parent", null);
        setField(term3283, term3283.getClass(), "first", term3297);
        setIntField(term3300, term3300.getClass(), "type", 0);
        setField(term3300, term3300.getClass(), "next", null);
        setField(term3300, term3300.getClass(), "first", null);
        setField(term3300, term3300.getClass(), "last", null);
        setField(term3300, term3300.getClass(), "propListHead", null);
        setIntField(term3300, term3300.getClass(), "sourcePosition", 0);
        setField(term3300, term3300.getClass(), "jsType", null);
        setField(term3300, term3300.getClass(), "parent", null);
        setField(term3283, term3283.getClass(), "last", term3300);
        setField(term3283, term3283.getClass(), "propListHead", null);
        setIntField(term3283, term3283.getClass(), "sourcePosition", 0);
        setField(term3283, term3283.getClass(), "jsType", null);
        setField(term3283, term3283.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3283;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



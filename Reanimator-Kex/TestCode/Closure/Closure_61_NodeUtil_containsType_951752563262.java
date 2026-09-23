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
import java.lang.Integer;

public class NodeUtil_containsType_951752563262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2280;
     Object term2301;

    public NodeUtil_containsType_951752563262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2280, term2280.getClass(), "type", -2126539433);
        setIntField(term2282, term2282.getClass(), "type", -1514240086);
        setIntField(term2284, term2284.getClass(), "type", 0);
        setField(term2284, term2284.getClass(), "next", null);
        setField(term2284, term2284.getClass(), "first", null);
        setField(term2284, term2284.getClass(), "last", null);
        setField(term2284, term2284.getClass(), "propListHead", null);
        setIntField(term2284, term2284.getClass(), "sourcePosition", 0);
        setField(term2284, term2284.getClass(), "jsType", null);
        setField(term2284, term2284.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "next", term2284);
        setIntField(term2287, term2287.getClass(), "type", 0);
        setField(term2287, term2287.getClass(), "next", null);
        setField(term2287, term2287.getClass(), "first", null);
        setField(term2287, term2287.getClass(), "last", null);
        setField(term2287, term2287.getClass(), "propListHead", null);
        setIntField(term2287, term2287.getClass(), "sourcePosition", 0);
        setField(term2287, term2287.getClass(), "jsType", null);
        setField(term2287, term2287.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "first", term2287);
        setIntField(term2290, term2290.getClass(), "type", 0);
        setField(term2290, term2290.getClass(), "next", null);
        setField(term2290, term2290.getClass(), "first", null);
        setField(term2290, term2290.getClass(), "last", null);
        setField(term2290, term2290.getClass(), "propListHead", null);
        setIntField(term2290, term2290.getClass(), "sourcePosition", 0);
        setField(term2290, term2290.getClass(), "jsType", null);
        setField(term2290, term2290.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "last", term2290);
        setField(term2282, term2282.getClass(), "propListHead", null);
        setIntField(term2282, term2282.getClass(), "sourcePosition", 0);
        setField(term2282, term2282.getClass(), "jsType", null);
        setField(term2282, term2282.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "next", term2282);
        setIntField(term2294, term2294.getClass(), "type", 0);
        setField(term2294, term2294.getClass(), "next", null);
        setField(term2294, term2294.getClass(), "first", null);
        setField(term2294, term2294.getClass(), "last", null);
        setField(term2294, term2294.getClass(), "propListHead", null);
        setIntField(term2294, term2294.getClass(), "sourcePosition", 0);
        setField(term2294, term2294.getClass(), "jsType", null);
        setField(term2294, term2294.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "first", term2294);
        setIntField(term2297, term2297.getClass(), "type", 0);
        setField(term2297, term2297.getClass(), "next", null);
        setField(term2297, term2297.getClass(), "first", null);
        setField(term2297, term2297.getClass(), "last", null);
        setField(term2297, term2297.getClass(), "propListHead", null);
        setIntField(term2297, term2297.getClass(), "sourcePosition", 0);
        setField(term2297, term2297.getClass(), "jsType", null);
        setField(term2297, term2297.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "last", term2297);
        setField(term2280, term2280.getClass(), "propListHead", null);
        setIntField(term2280, term2280.getClass(), "sourcePosition", 0);
        setField(term2280, term2280.getClass(), "jsType", null);
        setField(term2280, term2280.getClass(), "parent", null);
        term2301 = new Integer(-1541297110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2280;
        args[1] = term2301;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



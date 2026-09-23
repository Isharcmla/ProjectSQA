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

public class NodeUtil_getFunctionBody_1855640240246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114;

    public NodeUtil_getFunctionBody_1855640240246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2114, term2114.getClass(), "type", 1409095253);
        setIntField(term2116, term2116.getClass(), "type", 315179039);
        setIntField(term2118, term2118.getClass(), "type", -1835923897);
        setIntField(term2120, term2120.getClass(), "type", -341287775);
        setIntField(term2122, term2122.getClass(), "type", -1651110911);
        setField(term2122, term2122.getClass(), "next", null);
        setField(term2122, term2122.getClass(), "first", null);
        setField(term2122, term2122.getClass(), "last", null);
        setField(term2122, term2122.getClass(), "propListHead", null);
        setIntField(term2122, term2122.getClass(), "sourcePosition", 0);
        setField(term2122, term2122.getClass(), "jsType", null);
        setField(term2122, term2122.getClass(), "parent", null);
        setField(term2120, term2120.getClass(), "next", term2122);
        setIntField(term2125, term2125.getClass(), "type", -1934033808);
        setField(term2125, term2125.getClass(), "next", null);
        setField(term2125, term2125.getClass(), "first", null);
        setField(term2125, term2125.getClass(), "last", term2122);
        setField(term2125, term2125.getClass(), "propListHead", null);
        setIntField(term2125, term2125.getClass(), "sourcePosition", 0);
        setField(term2125, term2125.getClass(), "jsType", null);
        setField(term2125, term2125.getClass(), "parent", null);
        setField(term2120, term2120.getClass(), "first", term2125);
        setField(term2120, term2120.getClass(), "last", term2118);
        setField(term2120, term2120.getClass(), "propListHead", null);
        setIntField(term2120, term2120.getClass(), "sourcePosition", 0);
        setField(term2120, term2120.getClass(), "jsType", null);
        setField(term2120, term2120.getClass(), "parent", null);
        setField(term2118, term2118.getClass(), "next", term2120);
        setField(term2118, term2118.getClass(), "first", term2122);
        setIntField(term2129, term2129.getClass(), "type", -2023791789);
        setIntField(term2131, term2131.getClass(), "type", 353974456);
        setField(term2131, term2131.getClass(), "next", null);
        setField(term2131, term2131.getClass(), "first", term2125);
        setField(term2131, term2131.getClass(), "last", term2120);
        setField(term2131, term2131.getClass(), "propListHead", null);
        setIntField(term2131, term2131.getClass(), "sourcePosition", 0);
        setField(term2131, term2131.getClass(), "jsType", null);
        setField(term2131, term2131.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "next", term2131);
        setField(term2129, term2129.getClass(), "first", term2116);
        setField(term2129, term2129.getClass(), "last", term2116);
        setField(term2129, term2129.getClass(), "propListHead", null);
        setIntField(term2129, term2129.getClass(), "sourcePosition", 0);
        setField(term2129, term2129.getClass(), "jsType", null);
        setField(term2129, term2129.getClass(), "parent", null);
        setField(term2118, term2118.getClass(), "last", term2129);
        setField(term2118, term2118.getClass(), "propListHead", null);
        setIntField(term2118, term2118.getClass(), "sourcePosition", 0);
        setField(term2118, term2118.getClass(), "jsType", null);
        setField(term2118, term2118.getClass(), "parent", null);
        setField(term2116, term2116.getClass(), "next", term2118);
        setIntField(term2136, term2136.getClass(), "type", -485108462);
        setField(term2136, term2136.getClass(), "next", term2129);
        setField(term2136, term2136.getClass(), "first", term2131);
        setField(term2136, term2136.getClass(), "last", term2114);
        setField(term2136, term2136.getClass(), "propListHead", null);
        setIntField(term2136, term2136.getClass(), "sourcePosition", 0);
        setField(term2136, term2136.getClass(), "jsType", null);
        setField(term2136, term2136.getClass(), "parent", null);
        setField(term2116, term2116.getClass(), "first", term2136);
        setField(term2116, term2116.getClass(), "last", term2136);
        setField(term2116, term2116.getClass(), "propListHead", null);
        setIntField(term2116, term2116.getClass(), "sourcePosition", 0);
        setField(term2116, term2116.getClass(), "jsType", null);
        setField(term2116, term2116.getClass(), "parent", null);
        setField(term2114, term2114.getClass(), "next", term2116);
        setField(term2114, term2114.getClass(), "first", term2120);
        setField(term2114, term2114.getClass(), "last", term2122);
        setField(term2114, term2114.getClass(), "propListHead", null);
        setIntField(term2114, term2114.getClass(), "sourcePosition", 0);
        setField(term2114, term2114.getClass(), "jsType", null);
        setField(term2114, term2114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2114;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



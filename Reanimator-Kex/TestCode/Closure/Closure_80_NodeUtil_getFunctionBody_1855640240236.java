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

public class NodeUtil_getFunctionBody_1855640240236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2243;

    public NodeUtil_getFunctionBody_1855640240236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2256 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2266 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2243, term2243.getClass(), "type", -1452324619);
        setIntField(term2245, term2245.getClass(), "type", 1737876343);
        setIntField(term2247, term2247.getClass(), "type", 0);
        setField(term2247, term2247.getClass(), "next", null);
        setField(term2247, term2247.getClass(), "first", null);
        setField(term2247, term2247.getClass(), "last", null);
        setField(term2247, term2247.getClass(), "propListHead", null);
        setIntField(term2247, term2247.getClass(), "sourcePosition", 0);
        setField(term2247, term2247.getClass(), "jsType", null);
        setField(term2247, term2247.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "next", term2247);
        setIntField(term2250, term2250.getClass(), "type", 0);
        setField(term2250, term2250.getClass(), "next", null);
        setField(term2250, term2250.getClass(), "first", null);
        setField(term2250, term2250.getClass(), "last", null);
        setField(term2250, term2250.getClass(), "propListHead", null);
        setIntField(term2250, term2250.getClass(), "sourcePosition", 0);
        setField(term2250, term2250.getClass(), "jsType", null);
        setField(term2250, term2250.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "first", term2250);
        setIntField(term2253, term2253.getClass(), "type", 0);
        setField(term2253, term2253.getClass(), "next", null);
        setField(term2253, term2253.getClass(), "first", null);
        setField(term2253, term2253.getClass(), "last", null);
        setField(term2253, term2253.getClass(), "propListHead", null);
        setIntField(term2253, term2253.getClass(), "sourcePosition", 0);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2245, term2245.getClass(), "last", term2253);
        setField(term2256, term2256.getClass(), "next", null);
        setIntField(term2256, term2256.getClass(), "type", 0);
        setIntField(term2256, term2256.getClass(), "intValue", 0);
        setField(term2256, term2256.getClass(), "objectValue", null);
        setField(term2245, term2245.getClass(), "propListHead", term2256);
        setIntField(term2245, term2245.getClass(), "sourcePosition", -428988337);
        setField(term2245, term2245.getClass(), "jsType", null);
        setField(term2245, term2245.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "next", term2245);
        setIntField(term2260, term2260.getClass(), "type", 0);
        setField(term2260, term2260.getClass(), "next", null);
        setField(term2260, term2260.getClass(), "first", null);
        setField(term2260, term2260.getClass(), "last", null);
        setField(term2260, term2260.getClass(), "propListHead", null);
        setIntField(term2260, term2260.getClass(), "sourcePosition", 0);
        setField(term2260, term2260.getClass(), "jsType", null);
        setField(term2260, term2260.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "first", term2260);
        setIntField(term2263, term2263.getClass(), "type", 0);
        setField(term2263, term2263.getClass(), "next", null);
        setField(term2263, term2263.getClass(), "first", null);
        setField(term2263, term2263.getClass(), "last", null);
        setField(term2263, term2263.getClass(), "propListHead", null);
        setIntField(term2263, term2263.getClass(), "sourcePosition", 0);
        setField(term2263, term2263.getClass(), "jsType", null);
        setField(term2263, term2263.getClass(), "parent", null);
        setField(term2243, term2243.getClass(), "last", term2263);
        setField(term2266, term2266.getClass(), "next", null);
        setIntField(term2266, term2266.getClass(), "type", 0);
        setIntField(term2266, term2266.getClass(), "intValue", 0);
        setField(term2266, term2266.getClass(), "objectValue", null);
        setField(term2243, term2243.getClass(), "propListHead", term2266);
        setIntField(term2243, term2243.getClass(), "sourcePosition", 48047085);
        setField(term2243, term2243.getClass(), "jsType", null);
        setField(term2243, term2243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2243;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



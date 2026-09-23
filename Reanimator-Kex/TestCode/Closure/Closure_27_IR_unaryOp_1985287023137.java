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
import java.lang.Integer;
import java.lang.Object;

public class IR_unaryOp_1985287023137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;
     Object term2369;

    public IR_unaryOp_1985287023137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2367 = new Integer(1190753616);
        term2369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2369, term2369.getClass(), "type", -752378450);
        setIntField(term2371, term2371.getClass(), "type", 848907965);
        setIntField(term2373, term2373.getClass(), "type", 1865070548);
        setIntField(term2375, term2375.getClass(), "type", 1904515443);
        setIntField(term2377, term2377.getClass(), "type", 1361126430);
        setField(term2377, term2377.getClass(), "next", null);
        setField(term2377, term2377.getClass(), "first", null);
        setField(term2377, term2377.getClass(), "last", null);
        setField(term2377, term2377.getClass(), "propListHead", null);
        setIntField(term2377, term2377.getClass(), "sourcePosition", 0);
        setField(term2377, term2377.getClass(), "jsType", null);
        setField(term2377, term2377.getClass(), "parent", null);
        setField(term2375, term2375.getClass(), "next", term2377);
        setIntField(term2380, term2380.getClass(), "type", 1728588701);
        setField(term2380, term2380.getClass(), "next", null);
        setField(term2380, term2380.getClass(), "first", null);
        setField(term2380, term2380.getClass(), "last", term2377);
        setField(term2380, term2380.getClass(), "propListHead", null);
        setIntField(term2380, term2380.getClass(), "sourcePosition", 0);
        setField(term2380, term2380.getClass(), "jsType", null);
        setField(term2380, term2380.getClass(), "parent", null);
        setField(term2375, term2375.getClass(), "first", term2380);
        setField(term2375, term2375.getClass(), "last", term2373);
        setField(term2375, term2375.getClass(), "propListHead", null);
        setIntField(term2375, term2375.getClass(), "sourcePosition", 0);
        setField(term2375, term2375.getClass(), "jsType", null);
        setField(term2375, term2375.getClass(), "parent", null);
        setField(term2373, term2373.getClass(), "next", term2375);
        setField(term2373, term2373.getClass(), "first", term2377);
        setIntField(term2384, term2384.getClass(), "type", -114460662);
        setIntField(term2386, term2386.getClass(), "type", -355376034);
        setField(term2386, term2386.getClass(), "next", null);
        setField(term2386, term2386.getClass(), "first", term2380);
        setField(term2386, term2386.getClass(), "last", term2375);
        setField(term2386, term2386.getClass(), "propListHead", null);
        setIntField(term2386, term2386.getClass(), "sourcePosition", 0);
        setField(term2386, term2386.getClass(), "jsType", null);
        setField(term2386, term2386.getClass(), "parent", null);
        setField(term2384, term2384.getClass(), "next", term2386);
        setField(term2384, term2384.getClass(), "first", term2371);
        setField(term2384, term2384.getClass(), "last", term2371);
        setField(term2384, term2384.getClass(), "propListHead", null);
        setIntField(term2384, term2384.getClass(), "sourcePosition", 0);
        setField(term2384, term2384.getClass(), "jsType", null);
        setField(term2384, term2384.getClass(), "parent", null);
        setField(term2373, term2373.getClass(), "last", term2384);
        setField(term2373, term2373.getClass(), "propListHead", null);
        setIntField(term2373, term2373.getClass(), "sourcePosition", 0);
        setField(term2373, term2373.getClass(), "jsType", null);
        setField(term2373, term2373.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "next", term2373);
        setIntField(term2391, term2391.getClass(), "type", 588390599);
        setField(term2391, term2391.getClass(), "next", term2384);
        setField(term2391, term2391.getClass(), "first", term2386);
        setField(term2391, term2391.getClass(), "last", term2369);
        setField(term2391, term2391.getClass(), "propListHead", null);
        setIntField(term2391, term2391.getClass(), "sourcePosition", 0);
        setField(term2391, term2391.getClass(), "jsType", null);
        setField(term2391, term2391.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "first", term2391);
        setField(term2371, term2371.getClass(), "last", term2391);
        setField(term2371, term2371.getClass(), "propListHead", null);
        setIntField(term2371, term2371.getClass(), "sourcePosition", 0);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2369, term2369.getClass(), "next", term2371);
        setField(term2369, term2369.getClass(), "first", term2375);
        setField(term2369, term2369.getClass(), "last", term2377);
        setField(term2369, term2369.getClass(), "propListHead", null);
        setIntField(term2369, term2369.getClass(), "sourcePosition", 0);
        setField(term2369, term2369.getClass(), "jsType", null);
        setField(term2369, term2369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2367;
        args[1] = term2369;
        try {
            callMethod(klass, "unaryOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



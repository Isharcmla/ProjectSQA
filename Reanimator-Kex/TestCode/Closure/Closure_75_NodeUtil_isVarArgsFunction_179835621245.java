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

public class NodeUtil_isVarArgsFunction_179835621245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2486;

    public NodeUtil_isVarArgsFunction_179835621245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2499 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2509 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2486, term2486.getClass(), "type", 157967613);
        setIntField(term2488, term2488.getClass(), "type", -1549952664);
        setIntField(term2490, term2490.getClass(), "type", 0);
        setField(term2490, term2490.getClass(), "next", null);
        setField(term2490, term2490.getClass(), "first", null);
        setField(term2490, term2490.getClass(), "last", null);
        setField(term2490, term2490.getClass(), "propListHead", null);
        setIntField(term2490, term2490.getClass(), "sourcePosition", 0);
        setField(term2490, term2490.getClass(), "jsType", null);
        setField(term2490, term2490.getClass(), "parent", null);
        setField(term2488, term2488.getClass(), "next", term2490);
        setIntField(term2493, term2493.getClass(), "type", 0);
        setField(term2493, term2493.getClass(), "next", null);
        setField(term2493, term2493.getClass(), "first", null);
        setField(term2493, term2493.getClass(), "last", null);
        setField(term2493, term2493.getClass(), "propListHead", null);
        setIntField(term2493, term2493.getClass(), "sourcePosition", 0);
        setField(term2493, term2493.getClass(), "jsType", null);
        setField(term2493, term2493.getClass(), "parent", null);
        setField(term2488, term2488.getClass(), "first", term2493);
        setIntField(term2496, term2496.getClass(), "type", 0);
        setField(term2496, term2496.getClass(), "next", null);
        setField(term2496, term2496.getClass(), "first", null);
        setField(term2496, term2496.getClass(), "last", null);
        setField(term2496, term2496.getClass(), "propListHead", null);
        setIntField(term2496, term2496.getClass(), "sourcePosition", 0);
        setField(term2496, term2496.getClass(), "jsType", null);
        setField(term2496, term2496.getClass(), "parent", null);
        setField(term2488, term2488.getClass(), "last", term2496);
        setField(term2499, term2499.getClass(), "next", null);
        setIntField(term2499, term2499.getClass(), "type", 0);
        setIntField(term2499, term2499.getClass(), "intValue", 0);
        setField(term2499, term2499.getClass(), "objectValue", null);
        setField(term2488, term2488.getClass(), "propListHead", term2499);
        setIntField(term2488, term2488.getClass(), "sourcePosition", 1835568392);
        setField(term2488, term2488.getClass(), "jsType", null);
        setField(term2488, term2488.getClass(), "parent", null);
        setField(term2486, term2486.getClass(), "next", term2488);
        setIntField(term2503, term2503.getClass(), "type", 0);
        setField(term2503, term2503.getClass(), "next", null);
        setField(term2503, term2503.getClass(), "first", null);
        setField(term2503, term2503.getClass(), "last", null);
        setField(term2503, term2503.getClass(), "propListHead", null);
        setIntField(term2503, term2503.getClass(), "sourcePosition", 0);
        setField(term2503, term2503.getClass(), "jsType", null);
        setField(term2503, term2503.getClass(), "parent", null);
        setField(term2486, term2486.getClass(), "first", term2503);
        setIntField(term2506, term2506.getClass(), "type", 0);
        setField(term2506, term2506.getClass(), "next", null);
        setField(term2506, term2506.getClass(), "first", null);
        setField(term2506, term2506.getClass(), "last", null);
        setField(term2506, term2506.getClass(), "propListHead", null);
        setIntField(term2506, term2506.getClass(), "sourcePosition", 0);
        setField(term2506, term2506.getClass(), "jsType", null);
        setField(term2506, term2506.getClass(), "parent", null);
        setField(term2486, term2486.getClass(), "last", term2506);
        setField(term2509, term2509.getClass(), "next", null);
        setIntField(term2509, term2509.getClass(), "type", 0);
        setIntField(term2509, term2509.getClass(), "intValue", 0);
        setField(term2509, term2509.getClass(), "objectValue", null);
        setField(term2486, term2486.getClass(), "propListHead", term2509);
        setIntField(term2486, term2486.getClass(), "sourcePosition", 457470807);
        setField(term2486, term2486.getClass(), "jsType", null);
        setField(term2486, term2486.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2486;
        try {
            callMethod(klass, "isVarArgsFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class NodeUtil_canBeSideEffected_1382575805410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50863;
     Object term51239;

    public NodeUtil_canBeSideEffected_1382575805410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51095 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term50863, term50863.getClass(), "type", 2);
        setIntField(term50933, term50933.getClass(), "type", 1);
        setIntField(term51003, term51003.getClass(), "type", 0);
        setField(term51003, term51003.getClass(), "first", null);
        setField(term51003, term51003.getClass(), "next", null);
        setField(term50933, term50933.getClass(), "first", term51003);
        setField(term50933, term50933.getClass(), "next", term51095);
        setField(term50863, term50863.getClass(), "first", term50933);
        term51239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51239, term51239.getClass(), "type", 2);
        setField(term51239, term51239.getClass(), "next", null);
        setIntField(term51240, term51240.getClass(), "type", 1);
        setDoubleField(term51241, term51241.getClass(), "number", 0.0);
        setIntField(term51241, term51241.getClass(), "type", 0);
        setField(term51241, term51241.getClass(), "next", null);
        setField(term51241, term51241.getClass(), "first", null);
        setField(term51241, term51241.getClass(), "last", null);
        setField(term51241, term51241.getClass(), "propListHead", null);
        setIntField(term51241, term51241.getClass(), "sourcePosition", 0);
        setField(term51241, term51241.getClass(), "jsType", null);
        setField(term51241, term51241.getClass(), "parent", null);
        setField(term51240, term51240.getClass(), "next", term51241);
        setIntField(term51242, term51242.getClass(), "type", 0);
        setField(term51242, term51242.getClass(), "next", null);
        setField(term51242, term51242.getClass(), "first", null);
        setField(term51242, term51242.getClass(), "last", null);
        setField(term51242, term51242.getClass(), "propListHead", null);
        setIntField(term51242, term51242.getClass(), "sourcePosition", 0);
        setField(term51242, term51242.getClass(), "jsType", null);
        setField(term51242, term51242.getClass(), "parent", null);
        setField(term51240, term51240.getClass(), "first", term51242);
        setField(term51240, term51240.getClass(), "last", null);
        setField(term51240, term51240.getClass(), "propListHead", null);
        setIntField(term51240, term51240.getClass(), "sourcePosition", 0);
        setField(term51240, term51240.getClass(), "jsType", null);
        setField(term51240, term51240.getClass(), "parent", null);
        setField(term51239, term51239.getClass(), "first", term51240);
        setField(term51239, term51239.getClass(), "last", null);
        setField(term51239, term51239.getClass(), "propListHead", null);
        setIntField(term51239, term51239.getClass(), "sourcePosition", 0);
        setField(term51239, term51239.getClass(), "jsType", null);
        setField(term51239, term51239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50863;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term50863, term51239));
    }

};



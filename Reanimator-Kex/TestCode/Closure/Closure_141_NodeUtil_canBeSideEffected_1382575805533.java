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

public class NodeUtil_canBeSideEffected_1382575805533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45826;
     Object term45917;

    public NodeUtil_canBeSideEffected_1382575805533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45826, term45826.getClass(), "type", -506958186);
        setIntField(term45896, term45896.getClass(), "type", 33);
        setField(term45826, term45826.getClass(), "first", term45896);
        term45917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45917, term45917.getClass(), "type", -506958186);
        setField(term45917, term45917.getClass(), "next", null);
        setIntField(term45918, term45918.getClass(), "type", 33);
        setField(term45918, term45918.getClass(), "next", null);
        setField(term45918, term45918.getClass(), "first", null);
        setField(term45918, term45918.getClass(), "last", null);
        setField(term45918, term45918.getClass(), "propListHead", null);
        setIntField(term45918, term45918.getClass(), "sourcePosition", 0);
        setField(term45918, term45918.getClass(), "jsType", null);
        setField(term45918, term45918.getClass(), "parent", null);
        setField(term45917, term45917.getClass(), "first", term45918);
        setField(term45917, term45917.getClass(), "last", null);
        setField(term45917, term45917.getClass(), "propListHead", null);
        setIntField(term45917, term45917.getClass(), "sourcePosition", 0);
        setField(term45917, term45917.getClass(), "jsType", null);
        setField(term45917, term45917.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45826;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term45826, term45917));
    }

};



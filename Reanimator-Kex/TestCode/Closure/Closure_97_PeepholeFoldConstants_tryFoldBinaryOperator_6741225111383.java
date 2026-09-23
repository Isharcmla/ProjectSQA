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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472279;
     Object term472371;
     Object term518431;
     Object term518432;
     Object term518399;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term472371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term472463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term472555 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term472463, term472463.getClass(), "next", term472555);
        setIntField(term472463, term472463.getClass(), "type", 39);
        setField(term472371, term472371.getClass(), "first", term472463);
        setIntField(term472371, term472371.getClass(), "type", 18);
        term518431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518431, term518431.getClass(), "currentTraversal", null);
        term518432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term518432, term518432.getClass(), "str", null);
        setIntField(term518432, term518432.getClass(), "type", 18);
        setField(term518432, term518432.getClass(), "next", null);
        setField(term518433, term518433.getClass(), "str", null);
        setIntField(term518433, term518433.getClass(), "type", 39);
        setDoubleField(term518434, term518434.getClass(), "number", 0.0);
        setIntField(term518434, term518434.getClass(), "type", 0);
        setField(term518434, term518434.getClass(), "next", null);
        setField(term518434, term518434.getClass(), "first", null);
        setField(term518434, term518434.getClass(), "last", null);
        setField(term518434, term518434.getClass(), "propListHead", null);
        setIntField(term518434, term518434.getClass(), "sourcePosition", 0);
        setField(term518434, term518434.getClass(), "jsType", null);
        setField(term518434, term518434.getClass(), "parent", null);
        setField(term518433, term518433.getClass(), "next", term518434);
        setField(term518433, term518433.getClass(), "first", null);
        setField(term518433, term518433.getClass(), "last", null);
        setField(term518433, term518433.getClass(), "propListHead", null);
        setIntField(term518433, term518433.getClass(), "sourcePosition", 0);
        setField(term518433, term518433.getClass(), "jsType", null);
        setField(term518433, term518433.getClass(), "parent", null);
        setField(term518432, term518432.getClass(), "first", term518433);
        setField(term518432, term518432.getClass(), "last", null);
        setField(term518432, term518432.getClass(), "propListHead", null);
        setIntField(term518432, term518432.getClass(), "sourcePosition", 0);
        setField(term518432, term518432.getClass(), "jsType", null);
        setField(term518432, term518432.getClass(), "parent", null);
        term518399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term518399, term518399.getClass(), "str", null);
        setIntField(term518399, term518399.getClass(), "type", 18);
        setField(term518399, term518399.getClass(), "next", null);
        setField(term518401, term518401.getClass(), "str", null);
        setIntField(term518401, term518401.getClass(), "type", 39);
        setDoubleField(term518403, term518403.getClass(), "number", 0.0);
        setIntField(term518403, term518403.getClass(), "type", 0);
        setField(term518403, term518403.getClass(), "next", null);
        setField(term518403, term518403.getClass(), "first", null);
        setField(term518403, term518403.getClass(), "last", null);
        setField(term518403, term518403.getClass(), "propListHead", null);
        setIntField(term518403, term518403.getClass(), "sourcePosition", 0);
        setField(term518403, term518403.getClass(), "jsType", null);
        setField(term518403, term518403.getClass(), "parent", null);
        setField(term518401, term518401.getClass(), "next", term518403);
        setField(term518401, term518401.getClass(), "first", null);
        setField(term518401, term518401.getClass(), "last", null);
        setField(term518401, term518401.getClass(), "propListHead", null);
        setIntField(term518401, term518401.getClass(), "sourcePosition", 0);
        setField(term518401, term518401.getClass(), "jsType", null);
        setField(term518401, term518401.getClass(), "parent", null);
        setField(term518399, term518399.getClass(), "first", term518401);
        setField(term518399, term518399.getClass(), "last", null);
        setField(term518399, term518399.getClass(), "propListHead", null);
        setIntField(term518399, term518399.getClass(), "sourcePosition", 0);
        setField(term518399, term518399.getClass(), "jsType", null);
        setField(term518399, term518399.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term472371;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term472279, args);
        assertTrue(recursiveEquals(term472279, term518431));
        assertTrue(recursiveEquals(term472371, term518432));
        assertTrue(recursiveEquals(retValue, term518399));
    }

};



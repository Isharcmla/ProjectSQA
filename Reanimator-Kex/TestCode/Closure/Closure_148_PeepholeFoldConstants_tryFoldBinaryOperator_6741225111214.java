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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288183;
     Object term288275;
     Object term288600;
     Object term288601;
     Object term288567;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term288275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term288367, term288367.getClass(), "next", term288459);
        setIntField(term288367, term288367.getClass(), "type", 39);
        setField(term288275, term288275.getClass(), "first", term288367);
        setIntField(term288275, term288275.getClass(), "type", 18);
        term288600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term288600, term288600.getClass(), "currentTraversal", null);
        term288601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term288601, term288601.getClass(), "number", 0.0);
        setIntField(term288601, term288601.getClass(), "type", 18);
        setField(term288601, term288601.getClass(), "next", null);
        setDoubleField(term288602, term288602.getClass(), "number", 0.0);
        setIntField(term288602, term288602.getClass(), "type", 39);
        setField(term288603, term288603.getClass(), "str", null);
        setIntField(term288603, term288603.getClass(), "type", 0);
        setField(term288603, term288603.getClass(), "next", null);
        setField(term288603, term288603.getClass(), "first", null);
        setField(term288603, term288603.getClass(), "last", null);
        setField(term288603, term288603.getClass(), "propListHead", null);
        setIntField(term288603, term288603.getClass(), "sourcePosition", 0);
        setField(term288603, term288603.getClass(), "jsType", null);
        setField(term288603, term288603.getClass(), "parent", null);
        setField(term288602, term288602.getClass(), "next", term288603);
        setField(term288602, term288602.getClass(), "first", null);
        setField(term288602, term288602.getClass(), "last", null);
        setField(term288602, term288602.getClass(), "propListHead", null);
        setIntField(term288602, term288602.getClass(), "sourcePosition", 0);
        setField(term288602, term288602.getClass(), "jsType", null);
        setField(term288602, term288602.getClass(), "parent", null);
        setField(term288601, term288601.getClass(), "first", term288602);
        setField(term288601, term288601.getClass(), "last", null);
        setField(term288601, term288601.getClass(), "propListHead", null);
        setIntField(term288601, term288601.getClass(), "sourcePosition", 0);
        setField(term288601, term288601.getClass(), "jsType", null);
        setField(term288601, term288601.getClass(), "parent", null);
        term288567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term288573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term288567, term288567.getClass(), "number", 0.0);
        setIntField(term288567, term288567.getClass(), "type", 18);
        setField(term288567, term288567.getClass(), "next", null);
        setDoubleField(term288570, term288570.getClass(), "number", 0.0);
        setIntField(term288570, term288570.getClass(), "type", 39);
        setField(term288573, term288573.getClass(), "str", null);
        setIntField(term288573, term288573.getClass(), "type", 0);
        setField(term288573, term288573.getClass(), "next", null);
        setField(term288573, term288573.getClass(), "first", null);
        setField(term288573, term288573.getClass(), "last", null);
        setField(term288573, term288573.getClass(), "propListHead", null);
        setIntField(term288573, term288573.getClass(), "sourcePosition", 0);
        setField(term288573, term288573.getClass(), "jsType", null);
        setField(term288573, term288573.getClass(), "parent", null);
        setField(term288570, term288570.getClass(), "next", term288573);
        setField(term288570, term288570.getClass(), "first", null);
        setField(term288570, term288570.getClass(), "last", null);
        setField(term288570, term288570.getClass(), "propListHead", null);
        setIntField(term288570, term288570.getClass(), "sourcePosition", 0);
        setField(term288570, term288570.getClass(), "jsType", null);
        setField(term288570, term288570.getClass(), "parent", null);
        setField(term288567, term288567.getClass(), "first", term288570);
        setField(term288567, term288567.getClass(), "last", null);
        setField(term288567, term288567.getClass(), "propListHead", null);
        setIntField(term288567, term288567.getClass(), "sourcePosition", 0);
        setField(term288567, term288567.getClass(), "jsType", null);
        setField(term288567, term288567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term288275;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term288183, args);
        assertTrue(recursiveEquals(term288183, term288600));
        assertTrue(recursiveEquals(term288275, term288601));
        assertTrue(recursiveEquals(retValue, term288567));
    }

};



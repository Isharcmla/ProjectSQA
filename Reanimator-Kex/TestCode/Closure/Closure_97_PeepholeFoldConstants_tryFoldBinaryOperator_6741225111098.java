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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339465;
     Object term339557;
     Object term340461;
     Object term340462;
     Object term340434;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339465 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term339557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term339627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term339557, term339557.getClass(), "first", term339557);
        setField(term339557, term339557.getClass(), "next", term339627);
        setIntField(term339557, term339557.getClass(), "type", 11);
        term340461 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term340461, term340461.getClass(), "currentTraversal", null);
        term340462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term340463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term340462, term340462.getClass(), "number", 0.0);
        setIntField(term340462, term340462.getClass(), "type", 11);
        setIntField(term340463, term340463.getClass(), "type", 0);
        setField(term340463, term340463.getClass(), "next", null);
        setField(term340463, term340463.getClass(), "first", null);
        setField(term340463, term340463.getClass(), "last", null);
        setField(term340463, term340463.getClass(), "propListHead", null);
        setIntField(term340463, term340463.getClass(), "sourcePosition", 0);
        setField(term340463, term340463.getClass(), "jsType", null);
        setField(term340463, term340463.getClass(), "parent", null);
        setField(term340462, term340462.getClass(), "next", term340463);
        setField(term340462, term340462.getClass(), "first", term340462);
        setField(term340462, term340462.getClass(), "last", null);
        setField(term340462, term340462.getClass(), "propListHead", null);
        setIntField(term340462, term340462.getClass(), "sourcePosition", 0);
        setField(term340462, term340462.getClass(), "jsType", null);
        setField(term340462, term340462.getClass(), "parent", null);
        term340434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term340437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term340434, term340434.getClass(), "number", 0.0);
        setIntField(term340434, term340434.getClass(), "type", 11);
        setIntField(term340437, term340437.getClass(), "type", 0);
        setField(term340437, term340437.getClass(), "next", null);
        setField(term340437, term340437.getClass(), "first", null);
        setField(term340437, term340437.getClass(), "last", null);
        setField(term340437, term340437.getClass(), "propListHead", null);
        setIntField(term340437, term340437.getClass(), "sourcePosition", 0);
        setField(term340437, term340437.getClass(), "jsType", null);
        setField(term340437, term340437.getClass(), "parent", null);
        setField(term340434, term340434.getClass(), "next", term340437);
        setField(term340434, term340434.getClass(), "first", term340434);
        setField(term340434, term340434.getClass(), "last", null);
        setField(term340434, term340434.getClass(), "propListHead", null);
        setIntField(term340434, term340434.getClass(), "sourcePosition", 0);
        setField(term340434, term340434.getClass(), "jsType", null);
        setField(term340434, term340434.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term339557;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term339465, args);
        assertTrue(recursiveEquals(term339465, term340461));
        assertTrue(recursiveEquals(term339557, term340462));
        assertTrue(recursiveEquals(retValue, term340434));
    }

};



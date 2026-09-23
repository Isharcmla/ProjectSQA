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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240373;
     Object term240465;
     Object term240570;
     Object term240571;
     Object term240542;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240373 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term240465 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240465, term240465.getClass(), "first", term240465);
        setField(term240465, term240465.getClass(), "next", term240535);
        setIntField(term240465, term240465.getClass(), "type", 52);
        term240570 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term240570, term240570.getClass(), "currentTraversal", null);
        term240571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240571, term240571.getClass(), "str", null);
        setIntField(term240571, term240571.getClass(), "type", 52);
        setIntField(term240572, term240572.getClass(), "type", 0);
        setField(term240572, term240572.getClass(), "next", null);
        setField(term240572, term240572.getClass(), "first", null);
        setField(term240572, term240572.getClass(), "last", null);
        setField(term240572, term240572.getClass(), "propListHead", null);
        setIntField(term240572, term240572.getClass(), "sourcePosition", 0);
        setField(term240572, term240572.getClass(), "jsType", null);
        setField(term240572, term240572.getClass(), "parent", null);
        setField(term240571, term240571.getClass(), "next", term240572);
        setField(term240571, term240571.getClass(), "first", term240571);
        setField(term240571, term240571.getClass(), "last", null);
        setField(term240571, term240571.getClass(), "propListHead", null);
        setIntField(term240571, term240571.getClass(), "sourcePosition", 0);
        setField(term240571, term240571.getClass(), "jsType", null);
        setField(term240571, term240571.getClass(), "parent", null);
        term240542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240542, term240542.getClass(), "str", null);
        setIntField(term240542, term240542.getClass(), "type", 52);
        setIntField(term240544, term240544.getClass(), "type", 0);
        setField(term240544, term240544.getClass(), "next", null);
        setField(term240544, term240544.getClass(), "first", null);
        setField(term240544, term240544.getClass(), "last", null);
        setField(term240544, term240544.getClass(), "propListHead", null);
        setIntField(term240544, term240544.getClass(), "sourcePosition", 0);
        setField(term240544, term240544.getClass(), "jsType", null);
        setField(term240544, term240544.getClass(), "parent", null);
        setField(term240542, term240542.getClass(), "next", term240544);
        setField(term240542, term240542.getClass(), "first", term240542);
        setField(term240542, term240542.getClass(), "last", null);
        setField(term240542, term240542.getClass(), "propListHead", null);
        setIntField(term240542, term240542.getClass(), "sourcePosition", 0);
        setField(term240542, term240542.getClass(), "jsType", null);
        setField(term240542, term240542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term240465;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term240373, args);
        assertTrue(recursiveEquals(term240373, term240570));
        assertTrue(recursiveEquals(term240465, term240571));
        assertTrue(recursiveEquals(retValue, term240542));
    }

};



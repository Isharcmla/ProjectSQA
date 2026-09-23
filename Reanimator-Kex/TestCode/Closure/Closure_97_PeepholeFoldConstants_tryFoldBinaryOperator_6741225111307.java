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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433984;
     Object term434054;
     Object term434636;
     Object term434637;
     Object term434592;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term434054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term434194, term434194.getClass(), "type", 42);
        setField(term434124, term434124.getClass(), "next", term434194);
        setIntField(term434124, term434124.getClass(), "type", 42);
        setField(term434054, term434054.getClass(), "first", term434124);
        setIntField(term434054, term434054.getClass(), "type", 16);
        term434636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term434636, term434636.getClass(), "currentTraversal", null);
        term434637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term434637, term434637.getClass(), "type", 16);
        setField(term434637, term434637.getClass(), "next", null);
        setIntField(term434638, term434638.getClass(), "type", 42);
        setIntField(term434639, term434639.getClass(), "type", 42);
        setField(term434639, term434639.getClass(), "next", null);
        setField(term434639, term434639.getClass(), "first", null);
        setField(term434639, term434639.getClass(), "last", null);
        setField(term434639, term434639.getClass(), "propListHead", null);
        setIntField(term434639, term434639.getClass(), "sourcePosition", 0);
        setField(term434639, term434639.getClass(), "jsType", null);
        setField(term434639, term434639.getClass(), "parent", null);
        setField(term434638, term434638.getClass(), "next", term434639);
        setField(term434638, term434638.getClass(), "first", null);
        setField(term434638, term434638.getClass(), "last", null);
        setField(term434638, term434638.getClass(), "propListHead", null);
        setIntField(term434638, term434638.getClass(), "sourcePosition", 0);
        setField(term434638, term434638.getClass(), "jsType", null);
        setField(term434638, term434638.getClass(), "parent", null);
        setField(term434637, term434637.getClass(), "first", term434638);
        setField(term434637, term434637.getClass(), "last", null);
        setField(term434637, term434637.getClass(), "propListHead", null);
        setIntField(term434637, term434637.getClass(), "sourcePosition", 0);
        setField(term434637, term434637.getClass(), "jsType", null);
        setField(term434637, term434637.getClass(), "parent", null);
        term434592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term434592, term434592.getClass(), "type", 16);
        setField(term434592, term434592.getClass(), "next", null);
        setIntField(term434594, term434594.getClass(), "type", 42);
        setIntField(term434596, term434596.getClass(), "type", 42);
        setField(term434596, term434596.getClass(), "next", null);
        setField(term434596, term434596.getClass(), "first", null);
        setField(term434596, term434596.getClass(), "last", null);
        setField(term434596, term434596.getClass(), "propListHead", null);
        setIntField(term434596, term434596.getClass(), "sourcePosition", 0);
        setField(term434596, term434596.getClass(), "jsType", null);
        setField(term434596, term434596.getClass(), "parent", null);
        setField(term434594, term434594.getClass(), "next", term434596);
        setField(term434594, term434594.getClass(), "first", null);
        setField(term434594, term434594.getClass(), "last", null);
        setField(term434594, term434594.getClass(), "propListHead", null);
        setIntField(term434594, term434594.getClass(), "sourcePosition", 0);
        setField(term434594, term434594.getClass(), "jsType", null);
        setField(term434594, term434594.getClass(), "parent", null);
        setField(term434592, term434592.getClass(), "first", term434594);
        setField(term434592, term434592.getClass(), "last", null);
        setField(term434592, term434592.getClass(), "propListHead", null);
        setIntField(term434592, term434592.getClass(), "sourcePosition", 0);
        setField(term434592, term434592.getClass(), "jsType", null);
        setField(term434592, term434592.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term434054;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term433984, args);
        assertTrue(recursiveEquals(term433984, term434636));
        assertTrue(recursiveEquals(term434054, term434637));
        assertTrue(recursiveEquals(retValue, term434592));
    }

};



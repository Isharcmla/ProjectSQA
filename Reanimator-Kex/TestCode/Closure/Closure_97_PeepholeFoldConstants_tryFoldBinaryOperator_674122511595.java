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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156030;
     Object term156122;
     Object term156798;
     Object term156799;
     Object term156749;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term156122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term156306, term156306.getClass(), "type", 14);
        setField(term156214, term156214.getClass(), "next", term156306);
        setIntField(term156214, term156214.getClass(), "type", 42);
        setField(term156122, term156122.getClass(), "first", term156214);
        setIntField(term156122, term156122.getClass(), "type", 14);
        term156798 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term156798, term156798.getClass(), "currentTraversal", null);
        term156799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156799, term156799.getClass(), "str", null);
        setIntField(term156799, term156799.getClass(), "type", 14);
        setField(term156799, term156799.getClass(), "next", null);
        setField(term156800, term156800.getClass(), "str", null);
        setIntField(term156800, term156800.getClass(), "type", 42);
        setField(term156801, term156801.getClass(), "str", null);
        setIntField(term156801, term156801.getClass(), "type", 14);
        setField(term156801, term156801.getClass(), "next", null);
        setField(term156801, term156801.getClass(), "first", null);
        setField(term156801, term156801.getClass(), "last", null);
        setField(term156801, term156801.getClass(), "propListHead", null);
        setIntField(term156801, term156801.getClass(), "sourcePosition", 0);
        setField(term156801, term156801.getClass(), "jsType", null);
        setField(term156801, term156801.getClass(), "parent", null);
        setField(term156800, term156800.getClass(), "next", term156801);
        setField(term156800, term156800.getClass(), "first", null);
        setField(term156800, term156800.getClass(), "last", null);
        setField(term156800, term156800.getClass(), "propListHead", null);
        setIntField(term156800, term156800.getClass(), "sourcePosition", 0);
        setField(term156800, term156800.getClass(), "jsType", null);
        setField(term156800, term156800.getClass(), "parent", null);
        setField(term156799, term156799.getClass(), "first", term156800);
        setField(term156799, term156799.getClass(), "last", null);
        setField(term156799, term156799.getClass(), "propListHead", null);
        setIntField(term156799, term156799.getClass(), "sourcePosition", 0);
        setField(term156799, term156799.getClass(), "jsType", null);
        setField(term156799, term156799.getClass(), "parent", null);
        term156749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156751 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156749, term156749.getClass(), "str", null);
        setIntField(term156749, term156749.getClass(), "type", 14);
        setField(term156749, term156749.getClass(), "next", null);
        setField(term156751, term156751.getClass(), "str", null);
        setIntField(term156751, term156751.getClass(), "type", 42);
        setField(term156753, term156753.getClass(), "str", null);
        setIntField(term156753, term156753.getClass(), "type", 14);
        setField(term156753, term156753.getClass(), "next", null);
        setField(term156753, term156753.getClass(), "first", null);
        setField(term156753, term156753.getClass(), "last", null);
        setField(term156753, term156753.getClass(), "propListHead", null);
        setIntField(term156753, term156753.getClass(), "sourcePosition", 0);
        setField(term156753, term156753.getClass(), "jsType", null);
        setField(term156753, term156753.getClass(), "parent", null);
        setField(term156751, term156751.getClass(), "next", term156753);
        setField(term156751, term156751.getClass(), "first", null);
        setField(term156751, term156751.getClass(), "last", null);
        setField(term156751, term156751.getClass(), "propListHead", null);
        setIntField(term156751, term156751.getClass(), "sourcePosition", 0);
        setField(term156751, term156751.getClass(), "jsType", null);
        setField(term156751, term156751.getClass(), "parent", null);
        setField(term156749, term156749.getClass(), "first", term156751);
        setField(term156749, term156749.getClass(), "last", null);
        setField(term156749, term156749.getClass(), "propListHead", null);
        setIntField(term156749, term156749.getClass(), "sourcePosition", 0);
        setField(term156749, term156749.getClass(), "jsType", null);
        setField(term156749, term156749.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156122;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term156030, args);
        assertTrue(recursiveEquals(term156030, term156798));
        assertTrue(recursiveEquals(term156122, term156799));
        assertTrue(recursiveEquals(retValue, term156749));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179573;
     Object term179665;
     Object term180353;
     Object term180354;
     Object term180309;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term179665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term179849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term179757, term179757.getClass(), "next", term179849);
        setIntField(term179757, term179757.getClass(), "type", 14);
        setField(term179665, term179665.getClass(), "first", term179757);
        setIntField(term179665, term179665.getClass(), "type", 14);
        term180353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term180353, term180353.getClass(), "currentTraversal", null);
        term180354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180354, term180354.getClass(), "str", null);
        setIntField(term180354, term180354.getClass(), "type", 14);
        setField(term180354, term180354.getClass(), "next", null);
        setField(term180355, term180355.getClass(), "str", null);
        setIntField(term180355, term180355.getClass(), "type", 14);
        setField(term180356, term180356.getClass(), "str", null);
        setIntField(term180356, term180356.getClass(), "type", 0);
        setField(term180356, term180356.getClass(), "next", null);
        setField(term180356, term180356.getClass(), "first", null);
        setField(term180356, term180356.getClass(), "last", null);
        setField(term180356, term180356.getClass(), "propListHead", null);
        setIntField(term180356, term180356.getClass(), "sourcePosition", 0);
        setField(term180356, term180356.getClass(), "jsType", null);
        setField(term180356, term180356.getClass(), "parent", null);
        setField(term180355, term180355.getClass(), "next", term180356);
        setField(term180355, term180355.getClass(), "first", null);
        setField(term180355, term180355.getClass(), "last", null);
        setField(term180355, term180355.getClass(), "propListHead", null);
        setIntField(term180355, term180355.getClass(), "sourcePosition", 0);
        setField(term180355, term180355.getClass(), "jsType", null);
        setField(term180355, term180355.getClass(), "parent", null);
        setField(term180354, term180354.getClass(), "first", term180355);
        setField(term180354, term180354.getClass(), "last", null);
        setField(term180354, term180354.getClass(), "propListHead", null);
        setIntField(term180354, term180354.getClass(), "sourcePosition", 0);
        setField(term180354, term180354.getClass(), "jsType", null);
        setField(term180354, term180354.getClass(), "parent", null);
        term180309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180309, term180309.getClass(), "str", null);
        setIntField(term180309, term180309.getClass(), "type", 14);
        setField(term180309, term180309.getClass(), "next", null);
        setField(term180311, term180311.getClass(), "str", null);
        setIntField(term180311, term180311.getClass(), "type", 14);
        setField(term180313, term180313.getClass(), "str", null);
        setIntField(term180313, term180313.getClass(), "type", 0);
        setField(term180313, term180313.getClass(), "next", null);
        setField(term180313, term180313.getClass(), "first", null);
        setField(term180313, term180313.getClass(), "last", null);
        setField(term180313, term180313.getClass(), "propListHead", null);
        setIntField(term180313, term180313.getClass(), "sourcePosition", 0);
        setField(term180313, term180313.getClass(), "jsType", null);
        setField(term180313, term180313.getClass(), "parent", null);
        setField(term180311, term180311.getClass(), "next", term180313);
        setField(term180311, term180311.getClass(), "first", null);
        setField(term180311, term180311.getClass(), "last", null);
        setField(term180311, term180311.getClass(), "propListHead", null);
        setIntField(term180311, term180311.getClass(), "sourcePosition", 0);
        setField(term180311, term180311.getClass(), "jsType", null);
        setField(term180311, term180311.getClass(), "parent", null);
        setField(term180309, term180309.getClass(), "first", term180311);
        setField(term180309, term180309.getClass(), "last", null);
        setField(term180309, term180309.getClass(), "propListHead", null);
        setIntField(term180309, term180309.getClass(), "sourcePosition", 0);
        setField(term180309, term180309.getClass(), "jsType", null);
        setField(term180309, term180309.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term179665;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term179573, args);
        assertTrue(recursiveEquals(term179573, term180353));
        assertTrue(recursiveEquals(term179665, term180354));
        assertTrue(recursiveEquals(retValue, term180309));
    }

};



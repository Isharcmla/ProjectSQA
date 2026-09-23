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

public class PeepholeFoldConstants_tryFoldComparison_848443179931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216657;
     Object term216749;
     Object term216841;
     Object term216933;
     Object term217376;
     Object term217377;
     Object term217378;
     Object term217379;
     Object term217354;

    public PeepholeFoldConstants_tryFoldComparison_848443179931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term216749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term216749, term216749.getClass(), "type", 14);
        term216841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term216841, term216841.getClass(), "type", 42);
        term216933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term216933, term216933.getClass(), "type", 42);
        term217376 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term217376, term217376.getClass(), "currentTraversal", null);
        term217377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term217377, term217377.getClass(), "str", null);
        setIntField(term217377, term217377.getClass(), "type", 42);
        setField(term217377, term217377.getClass(), "next", null);
        setField(term217377, term217377.getClass(), "first", null);
        setField(term217377, term217377.getClass(), "last", null);
        setField(term217377, term217377.getClass(), "propListHead", null);
        setIntField(term217377, term217377.getClass(), "sourcePosition", 0);
        setField(term217377, term217377.getClass(), "jsType", null);
        setField(term217377, term217377.getClass(), "parent", null);
        term217378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term217378, term217378.getClass(), "str", null);
        setIntField(term217378, term217378.getClass(), "type", 14);
        setField(term217378, term217378.getClass(), "next", null);
        setField(term217378, term217378.getClass(), "first", null);
        setField(term217378, term217378.getClass(), "last", null);
        setField(term217378, term217378.getClass(), "propListHead", null);
        setIntField(term217378, term217378.getClass(), "sourcePosition", 0);
        setField(term217378, term217378.getClass(), "jsType", null);
        setField(term217378, term217378.getClass(), "parent", null);
        term217379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term217379, term217379.getClass(), "str", null);
        setIntField(term217379, term217379.getClass(), "type", 42);
        setField(term217379, term217379.getClass(), "next", null);
        setField(term217379, term217379.getClass(), "first", null);
        setField(term217379, term217379.getClass(), "last", null);
        setField(term217379, term217379.getClass(), "propListHead", null);
        setIntField(term217379, term217379.getClass(), "sourcePosition", 0);
        setField(term217379, term217379.getClass(), "jsType", null);
        setField(term217379, term217379.getClass(), "parent", null);
        term217354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term217354, term217354.getClass(), "str", null);
        setIntField(term217354, term217354.getClass(), "type", 14);
        setField(term217354, term217354.getClass(), "next", null);
        setField(term217354, term217354.getClass(), "first", null);
        setField(term217354, term217354.getClass(), "last", null);
        setField(term217354, term217354.getClass(), "propListHead", null);
        setIntField(term217354, term217354.getClass(), "sourcePosition", 0);
        setField(term217354, term217354.getClass(), "jsType", null);
        setField(term217354, term217354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term216749;
        args[1] = term216841;
        args[2] = term216933;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term216657, args);
        assertTrue(recursiveEquals(term216657, term217376));
        assertTrue(recursiveEquals(term216749, term217377));
        assertTrue(recursiveEquals(term216841, term217378));
        assertTrue(recursiveEquals(term216933, term217379));
        assertTrue(recursiveEquals(retValue, term217354));
    }

};



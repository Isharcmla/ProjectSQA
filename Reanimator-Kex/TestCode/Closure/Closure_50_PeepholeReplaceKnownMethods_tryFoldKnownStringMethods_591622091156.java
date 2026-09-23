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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41136;
     Object term41228;
     Object term41381;
     Object term41382;
     Object term41357;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term41228 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41320 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term41228, term41228.getClass(), "type", 37);
        setField(term41228, term41228.getClass(), "first", term41320);
        term41381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term41381, term41381.getClass(), "currentTraversal", null);
        term41382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term41382, term41382.getClass(), "number", 0.0);
        setIntField(term41382, term41382.getClass(), "type", 37);
        setField(term41382, term41382.getClass(), "next", null);
        setField(term41383, term41383.getClass(), "str", null);
        setIntField(term41383, term41383.getClass(), "type", 0);
        setField(term41383, term41383.getClass(), "next", null);
        setField(term41383, term41383.getClass(), "first", null);
        setField(term41383, term41383.getClass(), "last", null);
        setField(term41383, term41383.getClass(), "propListHead", null);
        setIntField(term41383, term41383.getClass(), "sourcePosition", 0);
        setField(term41383, term41383.getClass(), "jsType", null);
        setField(term41383, term41383.getClass(), "parent", null);
        setField(term41382, term41382.getClass(), "first", term41383);
        setField(term41382, term41382.getClass(), "last", null);
        setField(term41382, term41382.getClass(), "propListHead", null);
        setIntField(term41382, term41382.getClass(), "sourcePosition", 0);
        setField(term41382, term41382.getClass(), "jsType", null);
        setField(term41382, term41382.getClass(), "parent", null);
        term41357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term41357, term41357.getClass(), "number", 0.0);
        setIntField(term41357, term41357.getClass(), "type", 37);
        setField(term41357, term41357.getClass(), "next", null);
        setField(term41360, term41360.getClass(), "str", null);
        setIntField(term41360, term41360.getClass(), "type", 0);
        setField(term41360, term41360.getClass(), "next", null);
        setField(term41360, term41360.getClass(), "first", null);
        setField(term41360, term41360.getClass(), "last", null);
        setField(term41360, term41360.getClass(), "propListHead", null);
        setIntField(term41360, term41360.getClass(), "sourcePosition", 0);
        setField(term41360, term41360.getClass(), "jsType", null);
        setField(term41360, term41360.getClass(), "parent", null);
        setField(term41357, term41357.getClass(), "first", term41360);
        setField(term41357, term41357.getClass(), "last", null);
        setField(term41357, term41357.getClass(), "propListHead", null);
        setIntField(term41357, term41357.getClass(), "sourcePosition", 0);
        setField(term41357, term41357.getClass(), "jsType", null);
        setField(term41357, term41357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41228;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term41136, args);
        assertTrue(recursiveEquals(term41136, term41381));
        assertTrue(recursiveEquals(term41228, term41382));
        assertTrue(recursiveEquals(retValue, term41357));
    }

};



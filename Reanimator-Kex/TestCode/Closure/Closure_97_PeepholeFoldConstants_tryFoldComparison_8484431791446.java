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

public class PeepholeFoldConstants_tryFoldComparison_8484431791446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541881;
     Object term541973;
     Object term542065;
     Object term542157;
     Object term542252;
     Object term542253;
     Object term542254;
     Object term542255;
     Object term542231;

    public PeepholeFoldConstants_tryFoldComparison_8484431791446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541881 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term541973 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term541973, term541973.getClass(), "type", 16);
        term542065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term542065, term542065.getClass(), "type", 42);
        term542157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term542157, term542157.getClass(), "type", 42);
        term542252 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term542252, term542252.getClass(), "currentTraversal", null);
        term542253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term542253, term542253.getClass(), "number", 0.0);
        setIntField(term542253, term542253.getClass(), "type", 42);
        setField(term542253, term542253.getClass(), "next", null);
        setField(term542253, term542253.getClass(), "first", null);
        setField(term542253, term542253.getClass(), "last", null);
        setField(term542253, term542253.getClass(), "propListHead", null);
        setIntField(term542253, term542253.getClass(), "sourcePosition", 0);
        setField(term542253, term542253.getClass(), "jsType", null);
        setField(term542253, term542253.getClass(), "parent", null);
        term542254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term542254, term542254.getClass(), "number", 0.0);
        setIntField(term542254, term542254.getClass(), "type", 16);
        setField(term542254, term542254.getClass(), "next", null);
        setField(term542254, term542254.getClass(), "first", null);
        setField(term542254, term542254.getClass(), "last", null);
        setField(term542254, term542254.getClass(), "propListHead", null);
        setIntField(term542254, term542254.getClass(), "sourcePosition", 0);
        setField(term542254, term542254.getClass(), "jsType", null);
        setField(term542254, term542254.getClass(), "parent", null);
        term542255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term542255, term542255.getClass(), "str", null);
        setIntField(term542255, term542255.getClass(), "type", 42);
        setField(term542255, term542255.getClass(), "next", null);
        setField(term542255, term542255.getClass(), "first", null);
        setField(term542255, term542255.getClass(), "last", null);
        setField(term542255, term542255.getClass(), "propListHead", null);
        setIntField(term542255, term542255.getClass(), "sourcePosition", 0);
        setField(term542255, term542255.getClass(), "jsType", null);
        setField(term542255, term542255.getClass(), "parent", null);
        term542231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term542231, term542231.getClass(), "number", 0.0);
        setIntField(term542231, term542231.getClass(), "type", 16);
        setField(term542231, term542231.getClass(), "next", null);
        setField(term542231, term542231.getClass(), "first", null);
        setField(term542231, term542231.getClass(), "last", null);
        setField(term542231, term542231.getClass(), "propListHead", null);
        setIntField(term542231, term542231.getClass(), "sourcePosition", 0);
        setField(term542231, term542231.getClass(), "jsType", null);
        setField(term542231, term542231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term541973;
        args[1] = term542065;
        args[2] = term542157;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term541881, args);
        assertTrue(recursiveEquals(term541881, term542252));
        assertTrue(recursiveEquals(term541973, term542253));
        assertTrue(recursiveEquals(term542065, term542254));
        assertTrue(recursiveEquals(term542157, term542255));
        assertTrue(recursiveEquals(retValue, term542231));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238105;
     Object term238197;
     Object term238415;
     Object term238416;
     Object term238388;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term238197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238289, term238289.getClass(), "next", term238381);
        setField(term238197, term238197.getClass(), "first", term238289);
        setIntField(term238197, term238197.getClass(), "type", 20);
        term238415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term238415, term238415.getClass(), "currentTraversal", null);
        term238416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238416, term238416.getClass(), "str", null);
        setIntField(term238416, term238416.getClass(), "type", 20);
        setField(term238416, term238416.getClass(), "next", null);
        setField(term238417, term238417.getClass(), "str", null);
        setIntField(term238417, term238417.getClass(), "type", 0);
        setField(term238418, term238418.getClass(), "str", null);
        setIntField(term238418, term238418.getClass(), "type", 0);
        setField(term238418, term238418.getClass(), "next", null);
        setField(term238418, term238418.getClass(), "first", null);
        setField(term238418, term238418.getClass(), "last", null);
        setField(term238418, term238418.getClass(), "propListHead", null);
        setIntField(term238418, term238418.getClass(), "sourcePosition", 0);
        setField(term238418, term238418.getClass(), "jsType", null);
        setField(term238418, term238418.getClass(), "parent", null);
        setField(term238417, term238417.getClass(), "next", term238418);
        setField(term238417, term238417.getClass(), "first", null);
        setField(term238417, term238417.getClass(), "last", null);
        setField(term238417, term238417.getClass(), "propListHead", null);
        setIntField(term238417, term238417.getClass(), "sourcePosition", 0);
        setField(term238417, term238417.getClass(), "jsType", null);
        setField(term238417, term238417.getClass(), "parent", null);
        setField(term238416, term238416.getClass(), "first", term238417);
        setField(term238416, term238416.getClass(), "last", null);
        setField(term238416, term238416.getClass(), "propListHead", null);
        setIntField(term238416, term238416.getClass(), "sourcePosition", 0);
        setField(term238416, term238416.getClass(), "jsType", null);
        setField(term238416, term238416.getClass(), "parent", null);
        term238388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238392 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238388, term238388.getClass(), "str", null);
        setIntField(term238388, term238388.getClass(), "type", 20);
        setField(term238388, term238388.getClass(), "next", null);
        setField(term238390, term238390.getClass(), "str", null);
        setIntField(term238390, term238390.getClass(), "type", 0);
        setField(term238392, term238392.getClass(), "str", null);
        setIntField(term238392, term238392.getClass(), "type", 0);
        setField(term238392, term238392.getClass(), "next", null);
        setField(term238392, term238392.getClass(), "first", null);
        setField(term238392, term238392.getClass(), "last", null);
        setField(term238392, term238392.getClass(), "propListHead", null);
        setIntField(term238392, term238392.getClass(), "sourcePosition", 0);
        setField(term238392, term238392.getClass(), "jsType", null);
        setField(term238392, term238392.getClass(), "parent", null);
        setField(term238390, term238390.getClass(), "next", term238392);
        setField(term238390, term238390.getClass(), "first", null);
        setField(term238390, term238390.getClass(), "last", null);
        setField(term238390, term238390.getClass(), "propListHead", null);
        setIntField(term238390, term238390.getClass(), "sourcePosition", 0);
        setField(term238390, term238390.getClass(), "jsType", null);
        setField(term238390, term238390.getClass(), "parent", null);
        setField(term238388, term238388.getClass(), "first", term238390);
        setField(term238388, term238388.getClass(), "last", null);
        setField(term238388, term238388.getClass(), "propListHead", null);
        setIntField(term238388, term238388.getClass(), "sourcePosition", 0);
        setField(term238388, term238388.getClass(), "jsType", null);
        setField(term238388, term238388.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term238197;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term238105, args);
        assertTrue(recursiveEquals(term238105, term238415));
        assertTrue(recursiveEquals(term238197, term238416));
        assertTrue(recursiveEquals(retValue, term238388));
    }

};



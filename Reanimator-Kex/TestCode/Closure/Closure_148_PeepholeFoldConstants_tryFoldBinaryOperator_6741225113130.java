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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926104;
     Object term926196;
     Object term926812;
     Object term926813;
     Object term926723;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term926104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term926196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926472 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term926380, term926380.getClass(), "type", 64);
        setField(term926288, term926288.getClass(), "next", term926380);
        setIntField(term926288, term926288.getClass(), "type", 0);
        setField(term926196, term926196.getClass(), "first", term926288);
        setIntField(term926196, term926196.getClass(), "type", 100);
        setIntField(term926472, term926472.getClass(), "type", 108);
        setField(term926196, term926196.getClass(), "parent", term926472);
        term926812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term926812, term926812.getClass(), "currentTraversal", null);
        term926813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term926813, term926813.getClass(), "str", null);
        setIntField(term926813, term926813.getClass(), "type", 100);
        setField(term926813, term926813.getClass(), "next", null);
        setField(term926814, term926814.getClass(), "str", null);
        setIntField(term926814, term926814.getClass(), "type", 0);
        setField(term926815, term926815.getClass(), "str", null);
        setIntField(term926815, term926815.getClass(), "type", 64);
        setField(term926815, term926815.getClass(), "next", null);
        setField(term926815, term926815.getClass(), "first", null);
        setField(term926815, term926815.getClass(), "last", null);
        setField(term926815, term926815.getClass(), "propListHead", null);
        setIntField(term926815, term926815.getClass(), "sourcePosition", 0);
        setField(term926815, term926815.getClass(), "jsType", null);
        setField(term926815, term926815.getClass(), "parent", null);
        setField(term926814, term926814.getClass(), "next", term926815);
        setField(term926814, term926814.getClass(), "first", null);
        setField(term926814, term926814.getClass(), "last", null);
        setField(term926814, term926814.getClass(), "propListHead", null);
        setIntField(term926814, term926814.getClass(), "sourcePosition", 0);
        setField(term926814, term926814.getClass(), "jsType", null);
        setField(term926814, term926814.getClass(), "parent", null);
        setField(term926813, term926813.getClass(), "first", term926814);
        setField(term926813, term926813.getClass(), "last", null);
        setField(term926813, term926813.getClass(), "propListHead", null);
        setIntField(term926813, term926813.getClass(), "sourcePosition", 0);
        setField(term926813, term926813.getClass(), "jsType", null);
        setField(term926816, term926816.getClass(), "str", null);
        setIntField(term926816, term926816.getClass(), "type", 108);
        setField(term926816, term926816.getClass(), "next", null);
        setField(term926816, term926816.getClass(), "first", null);
        setField(term926816, term926816.getClass(), "last", null);
        setField(term926816, term926816.getClass(), "propListHead", null);
        setIntField(term926816, term926816.getClass(), "sourcePosition", 0);
        setField(term926816, term926816.getClass(), "jsType", null);
        setField(term926816, term926816.getClass(), "parent", null);
        setField(term926813, term926813.getClass(), "parent", term926816);
        term926723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term926732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term926723, term926723.getClass(), "str", null);
        setIntField(term926723, term926723.getClass(), "type", 100);
        setField(term926723, term926723.getClass(), "next", null);
        setField(term926725, term926725.getClass(), "str", null);
        setIntField(term926725, term926725.getClass(), "type", 0);
        setField(term926727, term926727.getClass(), "str", null);
        setIntField(term926727, term926727.getClass(), "type", 64);
        setField(term926727, term926727.getClass(), "next", null);
        setField(term926727, term926727.getClass(), "first", null);
        setField(term926727, term926727.getClass(), "last", null);
        setField(term926727, term926727.getClass(), "propListHead", null);
        setIntField(term926727, term926727.getClass(), "sourcePosition", 0);
        setField(term926727, term926727.getClass(), "jsType", null);
        setField(term926727, term926727.getClass(), "parent", null);
        setField(term926725, term926725.getClass(), "next", term926727);
        setField(term926725, term926725.getClass(), "first", null);
        setField(term926725, term926725.getClass(), "last", null);
        setField(term926725, term926725.getClass(), "propListHead", null);
        setIntField(term926725, term926725.getClass(), "sourcePosition", 0);
        setField(term926725, term926725.getClass(), "jsType", null);
        setField(term926725, term926725.getClass(), "parent", null);
        setField(term926723, term926723.getClass(), "first", term926725);
        setField(term926723, term926723.getClass(), "last", null);
        setField(term926723, term926723.getClass(), "propListHead", null);
        setIntField(term926723, term926723.getClass(), "sourcePosition", 0);
        setField(term926723, term926723.getClass(), "jsType", null);
        setField(term926732, term926732.getClass(), "str", null);
        setIntField(term926732, term926732.getClass(), "type", 108);
        setField(term926732, term926732.getClass(), "next", null);
        setField(term926732, term926732.getClass(), "first", null);
        setField(term926732, term926732.getClass(), "last", null);
        setField(term926732, term926732.getClass(), "propListHead", null);
        setIntField(term926732, term926732.getClass(), "sourcePosition", 0);
        setField(term926732, term926732.getClass(), "jsType", null);
        setField(term926732, term926732.getClass(), "parent", null);
        setField(term926723, term926723.getClass(), "parent", term926732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term926196;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term926104, args);
        assertTrue(recursiveEquals(term926104, term926812));
        assertTrue(recursiveEquals(term926196, term926813));
        assertTrue(recursiveEquals(retValue, term926723));
    }

};



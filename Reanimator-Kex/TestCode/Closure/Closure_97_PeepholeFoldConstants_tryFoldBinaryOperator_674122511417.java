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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96718;
     Object term96810;
     Object term97406;
     Object term97407;
     Object term97372;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term96810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term96902, term96902.getClass(), "next", term96994);
        setField(term96810, term96810.getClass(), "first", term96902);
        setIntField(term96810, term96810.getClass(), "type", 13);
        term97406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term97406, term97406.getClass(), "currentTraversal", null);
        term97407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term97407, term97407.getClass(), "str", null);
        setIntField(term97407, term97407.getClass(), "type", 13);
        setField(term97407, term97407.getClass(), "next", null);
        setField(term97408, term97408.getClass(), "str", null);
        setIntField(term97408, term97408.getClass(), "type", 0);
        setField(term97409, term97409.getClass(), "str", null);
        setIntField(term97409, term97409.getClass(), "type", 0);
        setField(term97409, term97409.getClass(), "next", null);
        setField(term97409, term97409.getClass(), "first", null);
        setField(term97409, term97409.getClass(), "last", null);
        setField(term97409, term97409.getClass(), "propListHead", null);
        setIntField(term97409, term97409.getClass(), "sourcePosition", 0);
        setField(term97409, term97409.getClass(), "jsType", null);
        setField(term97409, term97409.getClass(), "parent", null);
        setField(term97408, term97408.getClass(), "next", term97409);
        setField(term97408, term97408.getClass(), "first", null);
        setField(term97408, term97408.getClass(), "last", null);
        setField(term97408, term97408.getClass(), "propListHead", null);
        setIntField(term97408, term97408.getClass(), "sourcePosition", 0);
        setField(term97408, term97408.getClass(), "jsType", null);
        setField(term97408, term97408.getClass(), "parent", null);
        setField(term97407, term97407.getClass(), "first", term97408);
        setField(term97407, term97407.getClass(), "last", null);
        setField(term97407, term97407.getClass(), "propListHead", null);
        setIntField(term97407, term97407.getClass(), "sourcePosition", 0);
        setField(term97407, term97407.getClass(), "jsType", null);
        setField(term97407, term97407.getClass(), "parent", null);
        term97372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term97376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term97372, term97372.getClass(), "str", null);
        setIntField(term97372, term97372.getClass(), "type", 13);
        setField(term97372, term97372.getClass(), "next", null);
        setField(term97374, term97374.getClass(), "str", null);
        setIntField(term97374, term97374.getClass(), "type", 0);
        setField(term97376, term97376.getClass(), "str", null);
        setIntField(term97376, term97376.getClass(), "type", 0);
        setField(term97376, term97376.getClass(), "next", null);
        setField(term97376, term97376.getClass(), "first", null);
        setField(term97376, term97376.getClass(), "last", null);
        setField(term97376, term97376.getClass(), "propListHead", null);
        setIntField(term97376, term97376.getClass(), "sourcePosition", 0);
        setField(term97376, term97376.getClass(), "jsType", null);
        setField(term97376, term97376.getClass(), "parent", null);
        setField(term97374, term97374.getClass(), "next", term97376);
        setField(term97374, term97374.getClass(), "first", null);
        setField(term97374, term97374.getClass(), "last", null);
        setField(term97374, term97374.getClass(), "propListHead", null);
        setIntField(term97374, term97374.getClass(), "sourcePosition", 0);
        setField(term97374, term97374.getClass(), "jsType", null);
        setField(term97374, term97374.getClass(), "parent", null);
        setField(term97372, term97372.getClass(), "first", term97374);
        setField(term97372, term97372.getClass(), "last", null);
        setField(term97372, term97372.getClass(), "propListHead", null);
        setIntField(term97372, term97372.getClass(), "sourcePosition", 0);
        setField(term97372, term97372.getClass(), "jsType", null);
        setField(term97372, term97372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96810;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term96718, args);
        assertTrue(recursiveEquals(term96718, term97406));
        assertTrue(recursiveEquals(term96810, term97407));
        assertTrue(recursiveEquals(retValue, term97372));
    }

};



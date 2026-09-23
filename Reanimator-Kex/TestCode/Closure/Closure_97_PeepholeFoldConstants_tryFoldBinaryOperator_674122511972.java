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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308280;
     Object term308372;
     Object term308668;
     Object term308669;
     Object term308636;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term308372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term308464, term308464.getClass(), "next", term308556);
        setIntField(term308464, term308464.getClass(), "type", 39);
        setField(term308372, term308372.getClass(), "first", term308464);
        setIntField(term308372, term308372.getClass(), "type", 24);
        term308668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term308668, term308668.getClass(), "currentTraversal", null);
        term308669 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term308669, term308669.getClass(), "str", null);
        setIntField(term308669, term308669.getClass(), "type", 24);
        setField(term308669, term308669.getClass(), "next", null);
        setField(term308670, term308670.getClass(), "str", null);
        setIntField(term308670, term308670.getClass(), "type", 39);
        setDoubleField(term308671, term308671.getClass(), "number", 0.0);
        setIntField(term308671, term308671.getClass(), "type", 0);
        setField(term308671, term308671.getClass(), "next", null);
        setField(term308671, term308671.getClass(), "first", null);
        setField(term308671, term308671.getClass(), "last", null);
        setField(term308671, term308671.getClass(), "propListHead", null);
        setIntField(term308671, term308671.getClass(), "sourcePosition", 0);
        setField(term308671, term308671.getClass(), "jsType", null);
        setField(term308671, term308671.getClass(), "parent", null);
        setField(term308670, term308670.getClass(), "next", term308671);
        setField(term308670, term308670.getClass(), "first", null);
        setField(term308670, term308670.getClass(), "last", null);
        setField(term308670, term308670.getClass(), "propListHead", null);
        setIntField(term308670, term308670.getClass(), "sourcePosition", 0);
        setField(term308670, term308670.getClass(), "jsType", null);
        setField(term308670, term308670.getClass(), "parent", null);
        setField(term308669, term308669.getClass(), "first", term308670);
        setField(term308669, term308669.getClass(), "last", null);
        setField(term308669, term308669.getClass(), "propListHead", null);
        setIntField(term308669, term308669.getClass(), "sourcePosition", 0);
        setField(term308669, term308669.getClass(), "jsType", null);
        setField(term308669, term308669.getClass(), "parent", null);
        term308636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term308640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term308636, term308636.getClass(), "str", null);
        setIntField(term308636, term308636.getClass(), "type", 24);
        setField(term308636, term308636.getClass(), "next", null);
        setField(term308638, term308638.getClass(), "str", null);
        setIntField(term308638, term308638.getClass(), "type", 39);
        setDoubleField(term308640, term308640.getClass(), "number", 0.0);
        setIntField(term308640, term308640.getClass(), "type", 0);
        setField(term308640, term308640.getClass(), "next", null);
        setField(term308640, term308640.getClass(), "first", null);
        setField(term308640, term308640.getClass(), "last", null);
        setField(term308640, term308640.getClass(), "propListHead", null);
        setIntField(term308640, term308640.getClass(), "sourcePosition", 0);
        setField(term308640, term308640.getClass(), "jsType", null);
        setField(term308640, term308640.getClass(), "parent", null);
        setField(term308638, term308638.getClass(), "next", term308640);
        setField(term308638, term308638.getClass(), "first", null);
        setField(term308638, term308638.getClass(), "last", null);
        setField(term308638, term308638.getClass(), "propListHead", null);
        setIntField(term308638, term308638.getClass(), "sourcePosition", 0);
        setField(term308638, term308638.getClass(), "jsType", null);
        setField(term308638, term308638.getClass(), "parent", null);
        setField(term308636, term308636.getClass(), "first", term308638);
        setField(term308636, term308636.getClass(), "last", null);
        setField(term308636, term308636.getClass(), "propListHead", null);
        setIntField(term308636, term308636.getClass(), "sourcePosition", 0);
        setField(term308636, term308636.getClass(), "jsType", null);
        setField(term308636, term308636.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term308372;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term308280, args);
        assertTrue(recursiveEquals(term308280, term308668));
        assertTrue(recursiveEquals(term308372, term308669));
        assertTrue(recursiveEquals(retValue, term308636));
    }

};



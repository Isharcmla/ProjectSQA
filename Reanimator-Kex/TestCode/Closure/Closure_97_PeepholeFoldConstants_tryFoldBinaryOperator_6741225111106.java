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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341974;
     Object term342066;
     Object term342422;
     Object term342423;
     Object term342354;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341974 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term342066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342250 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term342250, term342250.getClass(), "first", term342342);
        setField(term342158, term342158.getClass(), "next", term342250);
        setField(term342066, term342066.getClass(), "first", term342158);
        setIntField(term342066, term342066.getClass(), "type", 86);
        term342422 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term342422, term342422.getClass(), "currentTraversal", null);
        term342423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term342423, term342423.getClass(), "number", 0.0);
        setIntField(term342423, term342423.getClass(), "type", 86);
        setField(term342423, term342423.getClass(), "next", null);
        setDoubleField(term342424, term342424.getClass(), "number", 0.0);
        setIntField(term342424, term342424.getClass(), "type", 0);
        setDoubleField(term342425, term342425.getClass(), "number", 0.0);
        setIntField(term342425, term342425.getClass(), "type", 0);
        setField(term342425, term342425.getClass(), "next", null);
        setField(term342426, term342426.getClass(), "str", null);
        setIntField(term342426, term342426.getClass(), "type", 0);
        setField(term342426, term342426.getClass(), "next", null);
        setField(term342426, term342426.getClass(), "first", null);
        setField(term342426, term342426.getClass(), "last", null);
        setField(term342426, term342426.getClass(), "propListHead", null);
        setIntField(term342426, term342426.getClass(), "sourcePosition", 0);
        setField(term342426, term342426.getClass(), "jsType", null);
        setField(term342426, term342426.getClass(), "parent", null);
        setField(term342425, term342425.getClass(), "first", term342426);
        setField(term342425, term342425.getClass(), "last", null);
        setField(term342425, term342425.getClass(), "propListHead", null);
        setIntField(term342425, term342425.getClass(), "sourcePosition", 0);
        setField(term342425, term342425.getClass(), "jsType", null);
        setField(term342425, term342425.getClass(), "parent", null);
        setField(term342424, term342424.getClass(), "next", term342425);
        setField(term342424, term342424.getClass(), "first", null);
        setField(term342424, term342424.getClass(), "last", null);
        setField(term342424, term342424.getClass(), "propListHead", null);
        setIntField(term342424, term342424.getClass(), "sourcePosition", 0);
        setField(term342424, term342424.getClass(), "jsType", null);
        setField(term342424, term342424.getClass(), "parent", null);
        setField(term342423, term342423.getClass(), "first", term342424);
        setField(term342423, term342423.getClass(), "last", null);
        setField(term342423, term342423.getClass(), "propListHead", null);
        setIntField(term342423, term342423.getClass(), "sourcePosition", 0);
        setField(term342423, term342423.getClass(), "jsType", null);
        setField(term342423, term342423.getClass(), "parent", null);
        term342354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term342354, term342354.getClass(), "number", 0.0);
        setIntField(term342354, term342354.getClass(), "type", 86);
        setField(term342354, term342354.getClass(), "next", null);
        setDoubleField(term342357, term342357.getClass(), "number", 0.0);
        setIntField(term342357, term342357.getClass(), "type", 0);
        setDoubleField(term342360, term342360.getClass(), "number", 0.0);
        setIntField(term342360, term342360.getClass(), "type", 0);
        setField(term342360, term342360.getClass(), "next", null);
        setField(term342363, term342363.getClass(), "str", null);
        setIntField(term342363, term342363.getClass(), "type", 0);
        setField(term342363, term342363.getClass(), "next", null);
        setField(term342363, term342363.getClass(), "first", null);
        setField(term342363, term342363.getClass(), "last", null);
        setField(term342363, term342363.getClass(), "propListHead", null);
        setIntField(term342363, term342363.getClass(), "sourcePosition", 0);
        setField(term342363, term342363.getClass(), "jsType", null);
        setField(term342363, term342363.getClass(), "parent", null);
        setField(term342360, term342360.getClass(), "first", term342363);
        setField(term342360, term342360.getClass(), "last", null);
        setField(term342360, term342360.getClass(), "propListHead", null);
        setIntField(term342360, term342360.getClass(), "sourcePosition", 0);
        setField(term342360, term342360.getClass(), "jsType", null);
        setField(term342360, term342360.getClass(), "parent", null);
        setField(term342357, term342357.getClass(), "next", term342360);
        setField(term342357, term342357.getClass(), "first", null);
        setField(term342357, term342357.getClass(), "last", null);
        setField(term342357, term342357.getClass(), "propListHead", null);
        setIntField(term342357, term342357.getClass(), "sourcePosition", 0);
        setField(term342357, term342357.getClass(), "jsType", null);
        setField(term342357, term342357.getClass(), "parent", null);
        setField(term342354, term342354.getClass(), "first", term342357);
        setField(term342354, term342354.getClass(), "last", null);
        setField(term342354, term342354.getClass(), "propListHead", null);
        setIntField(term342354, term342354.getClass(), "sourcePosition", 0);
        setField(term342354, term342354.getClass(), "jsType", null);
        setField(term342354, term342354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term342066;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term341974, args);
        assertTrue(recursiveEquals(term341974, term342422));
        assertTrue(recursiveEquals(term342066, term342423));
        assertTrue(recursiveEquals(retValue, term342354));
    }

};



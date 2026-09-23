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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360794;
     Object term360886;
     Object term361111;
     Object term361112;
     Object term361077;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360794 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term360886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term360978, term360978.getClass(), "next", term361070);
        setField(term360886, term360886.getClass(), "first", term360978);
        setIntField(term360886, term360886.getClass(), "type", 17);
        term361111 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term361111, term361111.getClass(), "currentTraversal", null);
        term361112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term361112, term361112.getClass(), "str", null);
        setIntField(term361112, term361112.getClass(), "type", 17);
        setField(term361112, term361112.getClass(), "next", null);
        setField(term361113, term361113.getClass(), "str", null);
        setIntField(term361113, term361113.getClass(), "type", 0);
        setField(term361114, term361114.getClass(), "str", null);
        setIntField(term361114, term361114.getClass(), "type", 0);
        setField(term361114, term361114.getClass(), "next", null);
        setField(term361114, term361114.getClass(), "first", null);
        setField(term361114, term361114.getClass(), "last", null);
        setField(term361114, term361114.getClass(), "propListHead", null);
        setIntField(term361114, term361114.getClass(), "sourcePosition", 0);
        setField(term361114, term361114.getClass(), "jsType", null);
        setField(term361114, term361114.getClass(), "parent", null);
        setField(term361113, term361113.getClass(), "next", term361114);
        setField(term361113, term361113.getClass(), "first", null);
        setField(term361113, term361113.getClass(), "last", null);
        setField(term361113, term361113.getClass(), "propListHead", null);
        setIntField(term361113, term361113.getClass(), "sourcePosition", 0);
        setField(term361113, term361113.getClass(), "jsType", null);
        setField(term361113, term361113.getClass(), "parent", null);
        setField(term361112, term361112.getClass(), "first", term361113);
        setField(term361112, term361112.getClass(), "last", null);
        setField(term361112, term361112.getClass(), "propListHead", null);
        setIntField(term361112, term361112.getClass(), "sourcePosition", 0);
        setField(term361112, term361112.getClass(), "jsType", null);
        setField(term361112, term361112.getClass(), "parent", null);
        term361077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term361077, term361077.getClass(), "str", null);
        setIntField(term361077, term361077.getClass(), "type", 17);
        setField(term361077, term361077.getClass(), "next", null);
        setField(term361079, term361079.getClass(), "str", null);
        setIntField(term361079, term361079.getClass(), "type", 0);
        setField(term361081, term361081.getClass(), "str", null);
        setIntField(term361081, term361081.getClass(), "type", 0);
        setField(term361081, term361081.getClass(), "next", null);
        setField(term361081, term361081.getClass(), "first", null);
        setField(term361081, term361081.getClass(), "last", null);
        setField(term361081, term361081.getClass(), "propListHead", null);
        setIntField(term361081, term361081.getClass(), "sourcePosition", 0);
        setField(term361081, term361081.getClass(), "jsType", null);
        setField(term361081, term361081.getClass(), "parent", null);
        setField(term361079, term361079.getClass(), "next", term361081);
        setField(term361079, term361079.getClass(), "first", null);
        setField(term361079, term361079.getClass(), "last", null);
        setField(term361079, term361079.getClass(), "propListHead", null);
        setIntField(term361079, term361079.getClass(), "sourcePosition", 0);
        setField(term361079, term361079.getClass(), "jsType", null);
        setField(term361079, term361079.getClass(), "parent", null);
        setField(term361077, term361077.getClass(), "first", term361079);
        setField(term361077, term361077.getClass(), "last", null);
        setField(term361077, term361077.getClass(), "propListHead", null);
        setIntField(term361077, term361077.getClass(), "sourcePosition", 0);
        setField(term361077, term361077.getClass(), "jsType", null);
        setField(term361077, term361077.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term360886;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term360794, args);
        assertTrue(recursiveEquals(term360794, term361111));
        assertTrue(recursiveEquals(term360886, term361112));
        assertTrue(recursiveEquals(retValue, term361077));
    }

};



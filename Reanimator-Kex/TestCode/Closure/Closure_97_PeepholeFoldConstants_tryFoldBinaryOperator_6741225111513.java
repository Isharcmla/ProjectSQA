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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558855;
     Object term558947;
     Object term559489;
     Object term559490;
     Object term559453;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term558947 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term559039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term558947, term558947.getClass(), "first", term558947);
        setField(term558947, term558947.getClass(), "next", term559039);
        setIntField(term558947, term558947.getClass(), "type", 16);
        term559489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term559489, term559489.getClass(), "currentTraversal", null);
        term559490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term559491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term559490, term559490.getClass(), "str", null);
        setIntField(term559490, term559490.getClass(), "type", 16);
        setField(term559491, term559491.getClass(), "str", null);
        setIntField(term559491, term559491.getClass(), "type", 0);
        setField(term559491, term559491.getClass(), "next", null);
        setField(term559491, term559491.getClass(), "first", null);
        setField(term559491, term559491.getClass(), "last", null);
        setField(term559491, term559491.getClass(), "propListHead", null);
        setIntField(term559491, term559491.getClass(), "sourcePosition", 0);
        setField(term559491, term559491.getClass(), "jsType", null);
        setField(term559491, term559491.getClass(), "parent", null);
        setField(term559490, term559490.getClass(), "next", term559491);
        setField(term559490, term559490.getClass(), "first", term559490);
        setField(term559490, term559490.getClass(), "last", null);
        setField(term559490, term559490.getClass(), "propListHead", null);
        setIntField(term559490, term559490.getClass(), "sourcePosition", 0);
        setField(term559490, term559490.getClass(), "jsType", null);
        setField(term559490, term559490.getClass(), "parent", null);
        term559453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term559455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term559453, term559453.getClass(), "str", null);
        setIntField(term559453, term559453.getClass(), "type", 16);
        setField(term559455, term559455.getClass(), "str", null);
        setIntField(term559455, term559455.getClass(), "type", 0);
        setField(term559455, term559455.getClass(), "next", null);
        setField(term559455, term559455.getClass(), "first", null);
        setField(term559455, term559455.getClass(), "last", null);
        setField(term559455, term559455.getClass(), "propListHead", null);
        setIntField(term559455, term559455.getClass(), "sourcePosition", 0);
        setField(term559455, term559455.getClass(), "jsType", null);
        setField(term559455, term559455.getClass(), "parent", null);
        setField(term559453, term559453.getClass(), "next", term559455);
        setField(term559453, term559453.getClass(), "first", term559453);
        setField(term559453, term559453.getClass(), "last", null);
        setField(term559453, term559453.getClass(), "propListHead", null);
        setIntField(term559453, term559453.getClass(), "sourcePosition", 0);
        setField(term559453, term559453.getClass(), "jsType", null);
        setField(term559453, term559453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term558947;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term558855, args);
        assertTrue(recursiveEquals(term558855, term559489));
        assertTrue(recursiveEquals(term558947, term559490));
        assertTrue(recursiveEquals(retValue, term559453));
    }

};



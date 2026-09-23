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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172224;
     Object term172316;
     Object term172424;
     Object term172425;
     Object term172399;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term172316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term172316, term172316.getClass(), "first", term172316);
        setField(term172316, term172316.getClass(), "next", term172386);
        setIntField(term172316, term172316.getClass(), "type", 11);
        term172424 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172424, term172424.getClass(), "currentTraversal", null);
        term172425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term172425, term172425.getClass(), "str", null);
        setIntField(term172425, term172425.getClass(), "type", 11);
        setIntField(term172426, term172426.getClass(), "type", 0);
        setField(term172426, term172426.getClass(), "next", null);
        setField(term172426, term172426.getClass(), "first", null);
        setField(term172426, term172426.getClass(), "last", null);
        setField(term172426, term172426.getClass(), "propListHead", null);
        setIntField(term172426, term172426.getClass(), "sourcePosition", 0);
        setField(term172426, term172426.getClass(), "jsType", null);
        setField(term172426, term172426.getClass(), "parent", null);
        setField(term172425, term172425.getClass(), "next", term172426);
        setField(term172425, term172425.getClass(), "first", term172425);
        setField(term172425, term172425.getClass(), "last", null);
        setField(term172425, term172425.getClass(), "propListHead", null);
        setIntField(term172425, term172425.getClass(), "sourcePosition", 0);
        setField(term172425, term172425.getClass(), "jsType", null);
        setField(term172425, term172425.getClass(), "parent", null);
        term172399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term172399, term172399.getClass(), "str", null);
        setIntField(term172399, term172399.getClass(), "type", 11);
        setIntField(term172401, term172401.getClass(), "type", 0);
        setField(term172401, term172401.getClass(), "next", null);
        setField(term172401, term172401.getClass(), "first", null);
        setField(term172401, term172401.getClass(), "last", null);
        setField(term172401, term172401.getClass(), "propListHead", null);
        setIntField(term172401, term172401.getClass(), "sourcePosition", 0);
        setField(term172401, term172401.getClass(), "jsType", null);
        setField(term172401, term172401.getClass(), "parent", null);
        setField(term172399, term172399.getClass(), "next", term172401);
        setField(term172399, term172399.getClass(), "first", term172399);
        setField(term172399, term172399.getClass(), "last", null);
        setField(term172399, term172399.getClass(), "propListHead", null);
        setIntField(term172399, term172399.getClass(), "sourcePosition", 0);
        setField(term172399, term172399.getClass(), "jsType", null);
        setField(term172399, term172399.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term172316;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term172224, args);
        assertTrue(recursiveEquals(term172224, term172424));
        assertTrue(recursiveEquals(term172316, term172425));
        assertTrue(recursiveEquals(retValue, term172399));
    }

};



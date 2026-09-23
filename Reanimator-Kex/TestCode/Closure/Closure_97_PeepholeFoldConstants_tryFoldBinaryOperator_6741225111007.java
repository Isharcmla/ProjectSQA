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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315874;
     Object term315966;
     Object term316498;
     Object term316499;
     Object term316463;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315874 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term315966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term316058, term316058.getClass(), "next", term316150);
        setIntField(term316058, term316058.getClass(), "type", 39);
        setField(term315966, term315966.getClass(), "first", term316058);
        setIntField(term315966, term315966.getClass(), "type", 9);
        term316498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term316498, term316498.getClass(), "currentTraversal", null);
        term316499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316501 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term316499, term316499.getClass(), "str", null);
        setIntField(term316499, term316499.getClass(), "type", 9);
        setField(term316499, term316499.getClass(), "next", null);
        setField(term316500, term316500.getClass(), "str", null);
        setIntField(term316500, term316500.getClass(), "type", 39);
        setField(term316501, term316501.getClass(), "str", null);
        setIntField(term316501, term316501.getClass(), "type", 0);
        setField(term316501, term316501.getClass(), "next", null);
        setField(term316501, term316501.getClass(), "first", null);
        setField(term316501, term316501.getClass(), "last", null);
        setField(term316501, term316501.getClass(), "propListHead", null);
        setIntField(term316501, term316501.getClass(), "sourcePosition", 0);
        setField(term316501, term316501.getClass(), "jsType", null);
        setField(term316501, term316501.getClass(), "parent", null);
        setField(term316500, term316500.getClass(), "next", term316501);
        setField(term316500, term316500.getClass(), "first", null);
        setField(term316500, term316500.getClass(), "last", null);
        setField(term316500, term316500.getClass(), "propListHead", null);
        setIntField(term316500, term316500.getClass(), "sourcePosition", 0);
        setField(term316500, term316500.getClass(), "jsType", null);
        setField(term316500, term316500.getClass(), "parent", null);
        setField(term316499, term316499.getClass(), "first", term316500);
        setField(term316499, term316499.getClass(), "last", null);
        setField(term316499, term316499.getClass(), "propListHead", null);
        setIntField(term316499, term316499.getClass(), "sourcePosition", 0);
        setField(term316499, term316499.getClass(), "jsType", null);
        setField(term316499, term316499.getClass(), "parent", null);
        term316463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316465 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term316467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term316463, term316463.getClass(), "str", null);
        setIntField(term316463, term316463.getClass(), "type", 9);
        setField(term316463, term316463.getClass(), "next", null);
        setField(term316465, term316465.getClass(), "str", null);
        setIntField(term316465, term316465.getClass(), "type", 39);
        setField(term316467, term316467.getClass(), "str", null);
        setIntField(term316467, term316467.getClass(), "type", 0);
        setField(term316467, term316467.getClass(), "next", null);
        setField(term316467, term316467.getClass(), "first", null);
        setField(term316467, term316467.getClass(), "last", null);
        setField(term316467, term316467.getClass(), "propListHead", null);
        setIntField(term316467, term316467.getClass(), "sourcePosition", 0);
        setField(term316467, term316467.getClass(), "jsType", null);
        setField(term316467, term316467.getClass(), "parent", null);
        setField(term316465, term316465.getClass(), "next", term316467);
        setField(term316465, term316465.getClass(), "first", null);
        setField(term316465, term316465.getClass(), "last", null);
        setField(term316465, term316465.getClass(), "propListHead", null);
        setIntField(term316465, term316465.getClass(), "sourcePosition", 0);
        setField(term316465, term316465.getClass(), "jsType", null);
        setField(term316465, term316465.getClass(), "parent", null);
        setField(term316463, term316463.getClass(), "first", term316465);
        setField(term316463, term316463.getClass(), "last", null);
        setField(term316463, term316463.getClass(), "propListHead", null);
        setIntField(term316463, term316463.getClass(), "sourcePosition", 0);
        setField(term316463, term316463.getClass(), "jsType", null);
        setField(term316463, term316463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term315966;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term315874, args);
        assertTrue(recursiveEquals(term315874, term316498));
        assertTrue(recursiveEquals(term315966, term316499));
        assertTrue(recursiveEquals(retValue, term316463));
    }

};



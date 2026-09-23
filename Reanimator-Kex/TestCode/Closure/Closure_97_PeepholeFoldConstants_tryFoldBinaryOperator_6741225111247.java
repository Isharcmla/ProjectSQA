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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403492;
     Object term403584;
     Object term421088;
     Object term421089;
     Object term421059;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term403584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term403676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term403768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term403676, term403676.getClass(), "next", term403768);
        setIntField(term403676, term403676.getClass(), "type", 39);
        setField(term403584, term403584.getClass(), "first", term403676);
        setIntField(term403584, term403584.getClass(), "type", 18);
        term421088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421088, term421088.getClass(), "currentTraversal", null);
        term421089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term421089, term421089.getClass(), "str", null);
        setIntField(term421089, term421089.getClass(), "type", 18);
        setField(term421089, term421089.getClass(), "next", null);
        setField(term421090, term421090.getClass(), "str", null);
        setIntField(term421090, term421090.getClass(), "type", 39);
        setField(term421091, term421091.getClass(), "str", null);
        setIntField(term421091, term421091.getClass(), "type", 0);
        setField(term421091, term421091.getClass(), "next", null);
        setField(term421091, term421091.getClass(), "first", null);
        setField(term421091, term421091.getClass(), "last", null);
        setField(term421091, term421091.getClass(), "propListHead", null);
        setIntField(term421091, term421091.getClass(), "sourcePosition", 0);
        setField(term421091, term421091.getClass(), "jsType", null);
        setField(term421091, term421091.getClass(), "parent", null);
        setField(term421090, term421090.getClass(), "next", term421091);
        setField(term421090, term421090.getClass(), "first", null);
        setField(term421090, term421090.getClass(), "last", null);
        setField(term421090, term421090.getClass(), "propListHead", null);
        setIntField(term421090, term421090.getClass(), "sourcePosition", 0);
        setField(term421090, term421090.getClass(), "jsType", null);
        setField(term421090, term421090.getClass(), "parent", null);
        setField(term421089, term421089.getClass(), "first", term421090);
        setField(term421089, term421089.getClass(), "last", null);
        setField(term421089, term421089.getClass(), "propListHead", null);
        setIntField(term421089, term421089.getClass(), "sourcePosition", 0);
        setField(term421089, term421089.getClass(), "jsType", null);
        setField(term421089, term421089.getClass(), "parent", null);
        term421059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term421059, term421059.getClass(), "str", null);
        setIntField(term421059, term421059.getClass(), "type", 18);
        setField(term421059, term421059.getClass(), "next", null);
        setField(term421061, term421061.getClass(), "str", null);
        setIntField(term421061, term421061.getClass(), "type", 39);
        setField(term421063, term421063.getClass(), "str", null);
        setIntField(term421063, term421063.getClass(), "type", 0);
        setField(term421063, term421063.getClass(), "next", null);
        setField(term421063, term421063.getClass(), "first", null);
        setField(term421063, term421063.getClass(), "last", null);
        setField(term421063, term421063.getClass(), "propListHead", null);
        setIntField(term421063, term421063.getClass(), "sourcePosition", 0);
        setField(term421063, term421063.getClass(), "jsType", null);
        setField(term421063, term421063.getClass(), "parent", null);
        setField(term421061, term421061.getClass(), "next", term421063);
        setField(term421061, term421061.getClass(), "first", null);
        setField(term421061, term421061.getClass(), "last", null);
        setField(term421061, term421061.getClass(), "propListHead", null);
        setIntField(term421061, term421061.getClass(), "sourcePosition", 0);
        setField(term421061, term421061.getClass(), "jsType", null);
        setField(term421061, term421061.getClass(), "parent", null);
        setField(term421059, term421059.getClass(), "first", term421061);
        setField(term421059, term421059.getClass(), "last", null);
        setField(term421059, term421059.getClass(), "propListHead", null);
        setIntField(term421059, term421059.getClass(), "sourcePosition", 0);
        setField(term421059, term421059.getClass(), "jsType", null);
        setField(term421059, term421059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term403584;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term403492, args);
        assertTrue(recursiveEquals(term403492, term421088));
        assertTrue(recursiveEquals(term403584, term421089));
        assertTrue(recursiveEquals(retValue, term421059));
    }

};



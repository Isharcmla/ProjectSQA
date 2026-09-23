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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176914;
     Object term177006;
     Object term177234;
     Object term177235;
     Object term177203;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176914 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term177006 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177098, term177098.getClass(), "next", term177190);
        setField(term177006, term177006.getClass(), "first", term177098);
        setIntField(term177006, term177006.getClass(), "type", 11);
        term177234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term177234, term177234.getClass(), "currentTraversal", null);
        term177235 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177235, term177235.getClass(), "str", null);
        setIntField(term177235, term177235.getClass(), "type", 11);
        setField(term177235, term177235.getClass(), "next", null);
        setField(term177236, term177236.getClass(), "str", null);
        setIntField(term177236, term177236.getClass(), "type", 0);
        setField(term177237, term177237.getClass(), "str", null);
        setIntField(term177237, term177237.getClass(), "type", 0);
        setField(term177237, term177237.getClass(), "next", null);
        setField(term177237, term177237.getClass(), "first", null);
        setField(term177237, term177237.getClass(), "last", null);
        setField(term177237, term177237.getClass(), "propListHead", null);
        setIntField(term177237, term177237.getClass(), "sourcePosition", 0);
        setField(term177237, term177237.getClass(), "jsType", null);
        setField(term177237, term177237.getClass(), "parent", null);
        setField(term177236, term177236.getClass(), "next", term177237);
        setField(term177236, term177236.getClass(), "first", null);
        setField(term177236, term177236.getClass(), "last", null);
        setField(term177236, term177236.getClass(), "propListHead", null);
        setIntField(term177236, term177236.getClass(), "sourcePosition", 0);
        setField(term177236, term177236.getClass(), "jsType", null);
        setField(term177236, term177236.getClass(), "parent", null);
        setField(term177235, term177235.getClass(), "first", term177236);
        setField(term177235, term177235.getClass(), "last", null);
        setField(term177235, term177235.getClass(), "propListHead", null);
        setIntField(term177235, term177235.getClass(), "sourcePosition", 0);
        setField(term177235, term177235.getClass(), "jsType", null);
        setField(term177235, term177235.getClass(), "parent", null);
        term177203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177203, term177203.getClass(), "str", null);
        setIntField(term177203, term177203.getClass(), "type", 11);
        setField(term177203, term177203.getClass(), "next", null);
        setField(term177205, term177205.getClass(), "str", null);
        setIntField(term177205, term177205.getClass(), "type", 0);
        setField(term177207, term177207.getClass(), "str", null);
        setIntField(term177207, term177207.getClass(), "type", 0);
        setField(term177207, term177207.getClass(), "next", null);
        setField(term177207, term177207.getClass(), "first", null);
        setField(term177207, term177207.getClass(), "last", null);
        setField(term177207, term177207.getClass(), "propListHead", null);
        setIntField(term177207, term177207.getClass(), "sourcePosition", 0);
        setField(term177207, term177207.getClass(), "jsType", null);
        setField(term177207, term177207.getClass(), "parent", null);
        setField(term177205, term177205.getClass(), "next", term177207);
        setField(term177205, term177205.getClass(), "first", null);
        setField(term177205, term177205.getClass(), "last", null);
        setField(term177205, term177205.getClass(), "propListHead", null);
        setIntField(term177205, term177205.getClass(), "sourcePosition", 0);
        setField(term177205, term177205.getClass(), "jsType", null);
        setField(term177205, term177205.getClass(), "parent", null);
        setField(term177203, term177203.getClass(), "first", term177205);
        setField(term177203, term177203.getClass(), "last", null);
        setField(term177203, term177203.getClass(), "propListHead", null);
        setIntField(term177203, term177203.getClass(), "sourcePosition", 0);
        setField(term177203, term177203.getClass(), "jsType", null);
        setField(term177203, term177203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term177006;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term176914, args);
        assertTrue(recursiveEquals(term176914, term177234));
        assertTrue(recursiveEquals(term177006, term177235));
        assertTrue(recursiveEquals(retValue, term177203));
    }

};



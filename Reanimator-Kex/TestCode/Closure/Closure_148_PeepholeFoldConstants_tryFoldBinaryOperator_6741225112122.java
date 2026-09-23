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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577246;
     Object term577338;
     Object term577443;
     Object term577444;
     Object term577415;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term577338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term577408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term577338, term577338.getClass(), "first", term577338);
        setField(term577338, term577338.getClass(), "next", term577408);
        setIntField(term577338, term577338.getClass(), "type", 12);
        term577443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term577443, term577443.getClass(), "currentTraversal", null);
        term577444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term577445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term577444, term577444.getClass(), "str", null);
        setIntField(term577444, term577444.getClass(), "type", 12);
        setIntField(term577445, term577445.getClass(), "type", 0);
        setField(term577445, term577445.getClass(), "next", null);
        setField(term577445, term577445.getClass(), "first", null);
        setField(term577445, term577445.getClass(), "last", null);
        setField(term577445, term577445.getClass(), "propListHead", null);
        setIntField(term577445, term577445.getClass(), "sourcePosition", 0);
        setField(term577445, term577445.getClass(), "jsType", null);
        setField(term577445, term577445.getClass(), "parent", null);
        setField(term577444, term577444.getClass(), "next", term577445);
        setField(term577444, term577444.getClass(), "first", term577444);
        setField(term577444, term577444.getClass(), "last", null);
        setField(term577444, term577444.getClass(), "propListHead", null);
        setIntField(term577444, term577444.getClass(), "sourcePosition", 0);
        setField(term577444, term577444.getClass(), "jsType", null);
        setField(term577444, term577444.getClass(), "parent", null);
        term577415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term577417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term577415, term577415.getClass(), "str", null);
        setIntField(term577415, term577415.getClass(), "type", 12);
        setIntField(term577417, term577417.getClass(), "type", 0);
        setField(term577417, term577417.getClass(), "next", null);
        setField(term577417, term577417.getClass(), "first", null);
        setField(term577417, term577417.getClass(), "last", null);
        setField(term577417, term577417.getClass(), "propListHead", null);
        setIntField(term577417, term577417.getClass(), "sourcePosition", 0);
        setField(term577417, term577417.getClass(), "jsType", null);
        setField(term577417, term577417.getClass(), "parent", null);
        setField(term577415, term577415.getClass(), "next", term577417);
        setField(term577415, term577415.getClass(), "first", term577415);
        setField(term577415, term577415.getClass(), "last", null);
        setField(term577415, term577415.getClass(), "propListHead", null);
        setIntField(term577415, term577415.getClass(), "sourcePosition", 0);
        setField(term577415, term577415.getClass(), "jsType", null);
        setField(term577415, term577415.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term577338;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term577246, args);
        assertTrue(recursiveEquals(term577246, term577443));
        assertTrue(recursiveEquals(term577338, term577444));
        assertTrue(recursiveEquals(retValue, term577415));
    }

};



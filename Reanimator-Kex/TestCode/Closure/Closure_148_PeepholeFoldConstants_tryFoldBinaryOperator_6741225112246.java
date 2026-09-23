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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615845;
     Object term615937;
     Object term616900;
     Object term616901;
     Object term616860;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615845 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term615937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616121 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term616121, term616121.getClass(), "type", 40);
        setField(term616121, term616121.getClass(), "str", "");
        setField(term616029, term616029.getClass(), "next", term616121);
        setField(term615937, term615937.getClass(), "first", term616029);
        setIntField(term615937, term615937.getClass(), "type", 33);
        term616900 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term616900, term616900.getClass(), "currentTraversal", null);
        term616901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term616901, term616901.getClass(), "str", null);
        setIntField(term616901, term616901.getClass(), "type", 33);
        setField(term616901, term616901.getClass(), "next", null);
        setField(term616902, term616902.getClass(), "str", null);
        setIntField(term616902, term616902.getClass(), "type", 0);
        setField(term616903, term616903.getClass(), "str", "");
        setIntField(term616903, term616903.getClass(), "type", 40);
        setField(term616903, term616903.getClass(), "next", null);
        setField(term616903, term616903.getClass(), "first", null);
        setField(term616903, term616903.getClass(), "last", null);
        setField(term616903, term616903.getClass(), "propListHead", null);
        setIntField(term616903, term616903.getClass(), "sourcePosition", 0);
        setField(term616903, term616903.getClass(), "jsType", null);
        setField(term616903, term616903.getClass(), "parent", null);
        setField(term616902, term616902.getClass(), "next", term616903);
        setField(term616902, term616902.getClass(), "first", null);
        setField(term616902, term616902.getClass(), "last", null);
        setField(term616902, term616902.getClass(), "propListHead", null);
        setIntField(term616902, term616902.getClass(), "sourcePosition", 0);
        setField(term616902, term616902.getClass(), "jsType", null);
        setField(term616902, term616902.getClass(), "parent", null);
        setField(term616901, term616901.getClass(), "first", term616902);
        setField(term616901, term616901.getClass(), "last", null);
        setField(term616901, term616901.getClass(), "propListHead", null);
        setIntField(term616901, term616901.getClass(), "sourcePosition", 0);
        setField(term616901, term616901.getClass(), "jsType", null);
        setField(term616901, term616901.getClass(), "parent", null);
        term616860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term616864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term616860, term616860.getClass(), "str", null);
        setIntField(term616860, term616860.getClass(), "type", 33);
        setField(term616860, term616860.getClass(), "next", null);
        setField(term616862, term616862.getClass(), "str", null);
        setIntField(term616862, term616862.getClass(), "type", 0);
        setField(term616864, term616864.getClass(), "str", "");
        setIntField(term616864, term616864.getClass(), "type", 40);
        setField(term616864, term616864.getClass(), "next", null);
        setField(term616864, term616864.getClass(), "first", null);
        setField(term616864, term616864.getClass(), "last", null);
        setField(term616864, term616864.getClass(), "propListHead", null);
        setIntField(term616864, term616864.getClass(), "sourcePosition", 0);
        setField(term616864, term616864.getClass(), "jsType", null);
        setField(term616864, term616864.getClass(), "parent", null);
        setField(term616862, term616862.getClass(), "next", term616864);
        setField(term616862, term616862.getClass(), "first", null);
        setField(term616862, term616862.getClass(), "last", null);
        setField(term616862, term616862.getClass(), "propListHead", null);
        setIntField(term616862, term616862.getClass(), "sourcePosition", 0);
        setField(term616862, term616862.getClass(), "jsType", null);
        setField(term616862, term616862.getClass(), "parent", null);
        setField(term616860, term616860.getClass(), "first", term616862);
        setField(term616860, term616860.getClass(), "last", null);
        setField(term616860, term616860.getClass(), "propListHead", null);
        setIntField(term616860, term616860.getClass(), "sourcePosition", 0);
        setField(term616860, term616860.getClass(), "jsType", null);
        setField(term616860, term616860.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term615937;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term615845, args);
        assertTrue(recursiveEquals(term615845, term616900));
        assertTrue(recursiveEquals(term615937, term616901));
        assertTrue(recursiveEquals(retValue, term616860));
    }

};



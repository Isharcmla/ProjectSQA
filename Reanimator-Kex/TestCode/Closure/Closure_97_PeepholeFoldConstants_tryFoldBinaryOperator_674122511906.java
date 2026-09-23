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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255555;
     Object term255647;
     Object term255867;
     Object term255868;
     Object term255838;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term255647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255739, term255739.getClass(), "next", term255831);
        setIntField(term255739, term255739.getClass(), "type", 39);
        setField(term255647, term255647.getClass(), "first", term255739);
        setIntField(term255647, term255647.getClass(), "type", 23);
        term255867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term255867, term255867.getClass(), "currentTraversal", null);
        term255868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255868, term255868.getClass(), "str", null);
        setIntField(term255868, term255868.getClass(), "type", 23);
        setField(term255868, term255868.getClass(), "next", null);
        setField(term255869, term255869.getClass(), "str", null);
        setIntField(term255869, term255869.getClass(), "type", 39);
        setField(term255870, term255870.getClass(), "str", null);
        setIntField(term255870, term255870.getClass(), "type", 0);
        setField(term255870, term255870.getClass(), "next", null);
        setField(term255870, term255870.getClass(), "first", null);
        setField(term255870, term255870.getClass(), "last", null);
        setField(term255870, term255870.getClass(), "propListHead", null);
        setIntField(term255870, term255870.getClass(), "sourcePosition", 0);
        setField(term255870, term255870.getClass(), "jsType", null);
        setField(term255870, term255870.getClass(), "parent", null);
        setField(term255869, term255869.getClass(), "next", term255870);
        setField(term255869, term255869.getClass(), "first", null);
        setField(term255869, term255869.getClass(), "last", null);
        setField(term255869, term255869.getClass(), "propListHead", null);
        setIntField(term255869, term255869.getClass(), "sourcePosition", 0);
        setField(term255869, term255869.getClass(), "jsType", null);
        setField(term255869, term255869.getClass(), "parent", null);
        setField(term255868, term255868.getClass(), "first", term255869);
        setField(term255868, term255868.getClass(), "last", null);
        setField(term255868, term255868.getClass(), "propListHead", null);
        setIntField(term255868, term255868.getClass(), "sourcePosition", 0);
        setField(term255868, term255868.getClass(), "jsType", null);
        setField(term255868, term255868.getClass(), "parent", null);
        term255838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term255842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term255838, term255838.getClass(), "str", null);
        setIntField(term255838, term255838.getClass(), "type", 23);
        setField(term255838, term255838.getClass(), "next", null);
        setField(term255840, term255840.getClass(), "str", null);
        setIntField(term255840, term255840.getClass(), "type", 39);
        setField(term255842, term255842.getClass(), "str", null);
        setIntField(term255842, term255842.getClass(), "type", 0);
        setField(term255842, term255842.getClass(), "next", null);
        setField(term255842, term255842.getClass(), "first", null);
        setField(term255842, term255842.getClass(), "last", null);
        setField(term255842, term255842.getClass(), "propListHead", null);
        setIntField(term255842, term255842.getClass(), "sourcePosition", 0);
        setField(term255842, term255842.getClass(), "jsType", null);
        setField(term255842, term255842.getClass(), "parent", null);
        setField(term255840, term255840.getClass(), "next", term255842);
        setField(term255840, term255840.getClass(), "first", null);
        setField(term255840, term255840.getClass(), "last", null);
        setField(term255840, term255840.getClass(), "propListHead", null);
        setIntField(term255840, term255840.getClass(), "sourcePosition", 0);
        setField(term255840, term255840.getClass(), "jsType", null);
        setField(term255840, term255840.getClass(), "parent", null);
        setField(term255838, term255838.getClass(), "first", term255840);
        setField(term255838, term255838.getClass(), "last", null);
        setField(term255838, term255838.getClass(), "propListHead", null);
        setIntField(term255838, term255838.getClass(), "sourcePosition", 0);
        setField(term255838, term255838.getClass(), "jsType", null);
        setField(term255838, term255838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term255647;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term255555, args);
        assertTrue(recursiveEquals(term255555, term255867));
        assertTrue(recursiveEquals(term255647, term255868));
        assertTrue(recursiveEquals(retValue, term255838));
    }

};



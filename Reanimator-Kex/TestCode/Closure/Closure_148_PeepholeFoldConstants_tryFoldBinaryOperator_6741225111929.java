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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512531;
     Object term512623;
     Object term513261;
     Object term513262;
     Object term513212;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term512623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term512715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term512807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term512807, term512807.getClass(), "type", 14);
        setField(term512715, term512715.getClass(), "next", term512807);
        setIntField(term512715, term512715.getClass(), "type", 42);
        setField(term512623, term512623.getClass(), "first", term512715);
        setIntField(term512623, term512623.getClass(), "type", 14);
        term513261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term513261, term513261.getClass(), "currentTraversal", null);
        term513262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term513263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term513264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term513262, term513262.getClass(), "str", null);
        setIntField(term513262, term513262.getClass(), "type", 14);
        setField(term513262, term513262.getClass(), "next", null);
        setField(term513263, term513263.getClass(), "str", null);
        setIntField(term513263, term513263.getClass(), "type", 42);
        setField(term513264, term513264.getClass(), "str", null);
        setIntField(term513264, term513264.getClass(), "type", 14);
        setField(term513264, term513264.getClass(), "next", null);
        setField(term513264, term513264.getClass(), "first", null);
        setField(term513264, term513264.getClass(), "last", null);
        setField(term513264, term513264.getClass(), "propListHead", null);
        setIntField(term513264, term513264.getClass(), "sourcePosition", 0);
        setField(term513264, term513264.getClass(), "jsType", null);
        setField(term513264, term513264.getClass(), "parent", null);
        setField(term513263, term513263.getClass(), "next", term513264);
        setField(term513263, term513263.getClass(), "first", null);
        setField(term513263, term513263.getClass(), "last", null);
        setField(term513263, term513263.getClass(), "propListHead", null);
        setIntField(term513263, term513263.getClass(), "sourcePosition", 0);
        setField(term513263, term513263.getClass(), "jsType", null);
        setField(term513263, term513263.getClass(), "parent", null);
        setField(term513262, term513262.getClass(), "first", term513263);
        setField(term513262, term513262.getClass(), "last", null);
        setField(term513262, term513262.getClass(), "propListHead", null);
        setIntField(term513262, term513262.getClass(), "sourcePosition", 0);
        setField(term513262, term513262.getClass(), "jsType", null);
        setField(term513262, term513262.getClass(), "parent", null);
        term513212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term513214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term513216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term513212, term513212.getClass(), "str", null);
        setIntField(term513212, term513212.getClass(), "type", 14);
        setField(term513212, term513212.getClass(), "next", null);
        setField(term513214, term513214.getClass(), "str", null);
        setIntField(term513214, term513214.getClass(), "type", 42);
        setField(term513216, term513216.getClass(), "str", null);
        setIntField(term513216, term513216.getClass(), "type", 14);
        setField(term513216, term513216.getClass(), "next", null);
        setField(term513216, term513216.getClass(), "first", null);
        setField(term513216, term513216.getClass(), "last", null);
        setField(term513216, term513216.getClass(), "propListHead", null);
        setIntField(term513216, term513216.getClass(), "sourcePosition", 0);
        setField(term513216, term513216.getClass(), "jsType", null);
        setField(term513216, term513216.getClass(), "parent", null);
        setField(term513214, term513214.getClass(), "next", term513216);
        setField(term513214, term513214.getClass(), "first", null);
        setField(term513214, term513214.getClass(), "last", null);
        setField(term513214, term513214.getClass(), "propListHead", null);
        setIntField(term513214, term513214.getClass(), "sourcePosition", 0);
        setField(term513214, term513214.getClass(), "jsType", null);
        setField(term513214, term513214.getClass(), "parent", null);
        setField(term513212, term513212.getClass(), "first", term513214);
        setField(term513212, term513212.getClass(), "last", null);
        setField(term513212, term513212.getClass(), "propListHead", null);
        setIntField(term513212, term513212.getClass(), "sourcePosition", 0);
        setField(term513212, term513212.getClass(), "jsType", null);
        setField(term513212, term513212.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term512623;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term512531, args);
        assertTrue(recursiveEquals(term512531, term513261));
        assertTrue(recursiveEquals(term512623, term513262));
        assertTrue(recursiveEquals(retValue, term513212));
    }

};



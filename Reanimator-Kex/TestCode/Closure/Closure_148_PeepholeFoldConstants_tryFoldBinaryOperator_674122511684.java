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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151875;
     Object term151967;
     Object term152302;
     Object term152303;
     Object term152273;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term151967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term152059, term152059.getClass(), "next", term152151);
        setIntField(term152059, term152059.getClass(), "type", 39);
        setField(term151967, term151967.getClass(), "first", term152059);
        setIntField(term151967, term151967.getClass(), "type", 24);
        term152302 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term152302, term152302.getClass(), "currentTraversal", null);
        term152303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152304 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term152303, term152303.getClass(), "str", null);
        setIntField(term152303, term152303.getClass(), "type", 24);
        setField(term152303, term152303.getClass(), "next", null);
        setField(term152304, term152304.getClass(), "str", null);
        setIntField(term152304, term152304.getClass(), "type", 39);
        setField(term152305, term152305.getClass(), "str", null);
        setIntField(term152305, term152305.getClass(), "type", 0);
        setField(term152305, term152305.getClass(), "next", null);
        setField(term152305, term152305.getClass(), "first", null);
        setField(term152305, term152305.getClass(), "last", null);
        setField(term152305, term152305.getClass(), "propListHead", null);
        setIntField(term152305, term152305.getClass(), "sourcePosition", 0);
        setField(term152305, term152305.getClass(), "jsType", null);
        setField(term152305, term152305.getClass(), "parent", null);
        setField(term152304, term152304.getClass(), "next", term152305);
        setField(term152304, term152304.getClass(), "first", null);
        setField(term152304, term152304.getClass(), "last", null);
        setField(term152304, term152304.getClass(), "propListHead", null);
        setIntField(term152304, term152304.getClass(), "sourcePosition", 0);
        setField(term152304, term152304.getClass(), "jsType", null);
        setField(term152304, term152304.getClass(), "parent", null);
        setField(term152303, term152303.getClass(), "first", term152304);
        setField(term152303, term152303.getClass(), "last", null);
        setField(term152303, term152303.getClass(), "propListHead", null);
        setIntField(term152303, term152303.getClass(), "sourcePosition", 0);
        setField(term152303, term152303.getClass(), "jsType", null);
        setField(term152303, term152303.getClass(), "parent", null);
        term152273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term152273, term152273.getClass(), "str", null);
        setIntField(term152273, term152273.getClass(), "type", 24);
        setField(term152273, term152273.getClass(), "next", null);
        setField(term152275, term152275.getClass(), "str", null);
        setIntField(term152275, term152275.getClass(), "type", 39);
        setField(term152277, term152277.getClass(), "str", null);
        setIntField(term152277, term152277.getClass(), "type", 0);
        setField(term152277, term152277.getClass(), "next", null);
        setField(term152277, term152277.getClass(), "first", null);
        setField(term152277, term152277.getClass(), "last", null);
        setField(term152277, term152277.getClass(), "propListHead", null);
        setIntField(term152277, term152277.getClass(), "sourcePosition", 0);
        setField(term152277, term152277.getClass(), "jsType", null);
        setField(term152277, term152277.getClass(), "parent", null);
        setField(term152275, term152275.getClass(), "next", term152277);
        setField(term152275, term152275.getClass(), "first", null);
        setField(term152275, term152275.getClass(), "last", null);
        setField(term152275, term152275.getClass(), "propListHead", null);
        setIntField(term152275, term152275.getClass(), "sourcePosition", 0);
        setField(term152275, term152275.getClass(), "jsType", null);
        setField(term152275, term152275.getClass(), "parent", null);
        setField(term152273, term152273.getClass(), "first", term152275);
        setField(term152273, term152273.getClass(), "last", null);
        setField(term152273, term152273.getClass(), "propListHead", null);
        setIntField(term152273, term152273.getClass(), "sourcePosition", 0);
        setField(term152273, term152273.getClass(), "jsType", null);
        setField(term152273, term152273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term151967;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term151875, args);
        assertTrue(recursiveEquals(term151875, term152302));
        assertTrue(recursiveEquals(term151967, term152303));
        assertTrue(recursiveEquals(retValue, term152273));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732667;
     Object term732759;
     Object term733063;
     Object term733064;
     Object term733026;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732667 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term732759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term732851 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term732943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term732851, term732851.getClass(), "next", term732943);
        setIntField(term732851, term732851.getClass(), "type", 39);
        setField(term732759, term732759.getClass(), "first", term732851);
        setIntField(term732759, term732759.getClass(), "type", 11);
        term733063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term733063, term733063.getClass(), "currentTraversal", null);
        term733064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term733064, term733064.getClass(), "number", 0.0);
        setIntField(term733064, term733064.getClass(), "type", 11);
        setField(term733064, term733064.getClass(), "next", null);
        setDoubleField(term733065, term733065.getClass(), "number", 0.0);
        setIntField(term733065, term733065.getClass(), "type", 39);
        setField(term733066, term733066.getClass(), "str", null);
        setIntField(term733066, term733066.getClass(), "type", 0);
        setField(term733066, term733066.getClass(), "next", null);
        setField(term733066, term733066.getClass(), "first", null);
        setField(term733066, term733066.getClass(), "last", null);
        setField(term733066, term733066.getClass(), "propListHead", null);
        setIntField(term733066, term733066.getClass(), "sourcePosition", 0);
        setField(term733066, term733066.getClass(), "jsType", null);
        setField(term733066, term733066.getClass(), "parent", null);
        setField(term733065, term733065.getClass(), "next", term733066);
        setField(term733065, term733065.getClass(), "first", null);
        setField(term733065, term733065.getClass(), "last", null);
        setField(term733065, term733065.getClass(), "propListHead", null);
        setIntField(term733065, term733065.getClass(), "sourcePosition", 0);
        setField(term733065, term733065.getClass(), "jsType", null);
        setField(term733065, term733065.getClass(), "parent", null);
        setField(term733064, term733064.getClass(), "first", term733065);
        setField(term733064, term733064.getClass(), "last", null);
        setField(term733064, term733064.getClass(), "propListHead", null);
        setIntField(term733064, term733064.getClass(), "sourcePosition", 0);
        setField(term733064, term733064.getClass(), "jsType", null);
        setField(term733064, term733064.getClass(), "parent", null);
        term733026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term733032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term733026, term733026.getClass(), "number", 0.0);
        setIntField(term733026, term733026.getClass(), "type", 11);
        setField(term733026, term733026.getClass(), "next", null);
        setDoubleField(term733029, term733029.getClass(), "number", 0.0);
        setIntField(term733029, term733029.getClass(), "type", 39);
        setField(term733032, term733032.getClass(), "str", null);
        setIntField(term733032, term733032.getClass(), "type", 0);
        setField(term733032, term733032.getClass(), "next", null);
        setField(term733032, term733032.getClass(), "first", null);
        setField(term733032, term733032.getClass(), "last", null);
        setField(term733032, term733032.getClass(), "propListHead", null);
        setIntField(term733032, term733032.getClass(), "sourcePosition", 0);
        setField(term733032, term733032.getClass(), "jsType", null);
        setField(term733032, term733032.getClass(), "parent", null);
        setField(term733029, term733029.getClass(), "next", term733032);
        setField(term733029, term733029.getClass(), "first", null);
        setField(term733029, term733029.getClass(), "last", null);
        setField(term733029, term733029.getClass(), "propListHead", null);
        setIntField(term733029, term733029.getClass(), "sourcePosition", 0);
        setField(term733029, term733029.getClass(), "jsType", null);
        setField(term733029, term733029.getClass(), "parent", null);
        setField(term733026, term733026.getClass(), "first", term733029);
        setField(term733026, term733026.getClass(), "last", null);
        setField(term733026, term733026.getClass(), "propListHead", null);
        setIntField(term733026, term733026.getClass(), "sourcePosition", 0);
        setField(term733026, term733026.getClass(), "jsType", null);
        setField(term733026, term733026.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term732759;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term732667, args);
        assertTrue(recursiveEquals(term732667, term733063));
        assertTrue(recursiveEquals(term732759, term733064));
        assertTrue(recursiveEquals(retValue, term733026));
    }

};



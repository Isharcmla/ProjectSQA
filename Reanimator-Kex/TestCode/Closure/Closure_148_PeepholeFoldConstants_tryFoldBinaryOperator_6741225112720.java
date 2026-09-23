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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781108;
     Object term781200;
     Object term781574;
     Object term781575;
     Object term781483;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term781200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781476 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term781384, term781384.getClass(), "type", 64);
        setField(term781292, term781292.getClass(), "next", term781384);
        setIntField(term781292, term781292.getClass(), "type", 109);
        setField(term781200, term781200.getClass(), "first", term781292);
        setIntField(term781200, term781200.getClass(), "type", 100);
        setIntField(term781476, term781476.getClass(), "type", 114);
        setField(term781200, term781200.getClass(), "parent", term781476);
        term781574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term781574, term781574.getClass(), "currentTraversal", null);
        term781575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781577 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term781575, term781575.getClass(), "str", null);
        setIntField(term781575, term781575.getClass(), "type", 100);
        setField(term781575, term781575.getClass(), "next", null);
        setField(term781576, term781576.getClass(), "str", null);
        setIntField(term781576, term781576.getClass(), "type", 109);
        setField(term781577, term781577.getClass(), "str", null);
        setIntField(term781577, term781577.getClass(), "type", 64);
        setField(term781577, term781577.getClass(), "next", null);
        setField(term781577, term781577.getClass(), "first", null);
        setField(term781577, term781577.getClass(), "last", null);
        setField(term781577, term781577.getClass(), "propListHead", null);
        setIntField(term781577, term781577.getClass(), "sourcePosition", 0);
        setField(term781577, term781577.getClass(), "jsType", null);
        setField(term781577, term781577.getClass(), "parent", null);
        setField(term781576, term781576.getClass(), "next", term781577);
        setField(term781576, term781576.getClass(), "first", null);
        setField(term781576, term781576.getClass(), "last", null);
        setField(term781576, term781576.getClass(), "propListHead", null);
        setIntField(term781576, term781576.getClass(), "sourcePosition", 0);
        setField(term781576, term781576.getClass(), "jsType", null);
        setField(term781576, term781576.getClass(), "parent", null);
        setField(term781575, term781575.getClass(), "first", term781576);
        setField(term781575, term781575.getClass(), "last", null);
        setField(term781575, term781575.getClass(), "propListHead", null);
        setIntField(term781575, term781575.getClass(), "sourcePosition", 0);
        setField(term781575, term781575.getClass(), "jsType", null);
        setField(term781578, term781578.getClass(), "str", null);
        setIntField(term781578, term781578.getClass(), "type", 114);
        setField(term781578, term781578.getClass(), "next", null);
        setField(term781578, term781578.getClass(), "first", null);
        setField(term781578, term781578.getClass(), "last", null);
        setField(term781578, term781578.getClass(), "propListHead", null);
        setIntField(term781578, term781578.getClass(), "sourcePosition", 0);
        setField(term781578, term781578.getClass(), "jsType", null);
        setField(term781578, term781578.getClass(), "parent", null);
        setField(term781575, term781575.getClass(), "parent", term781578);
        term781483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term781492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term781483, term781483.getClass(), "str", null);
        setIntField(term781483, term781483.getClass(), "type", 100);
        setField(term781483, term781483.getClass(), "next", null);
        setField(term781485, term781485.getClass(), "str", null);
        setIntField(term781485, term781485.getClass(), "type", 109);
        setField(term781487, term781487.getClass(), "str", null);
        setIntField(term781487, term781487.getClass(), "type", 64);
        setField(term781487, term781487.getClass(), "next", null);
        setField(term781487, term781487.getClass(), "first", null);
        setField(term781487, term781487.getClass(), "last", null);
        setField(term781487, term781487.getClass(), "propListHead", null);
        setIntField(term781487, term781487.getClass(), "sourcePosition", 0);
        setField(term781487, term781487.getClass(), "jsType", null);
        setField(term781487, term781487.getClass(), "parent", null);
        setField(term781485, term781485.getClass(), "next", term781487);
        setField(term781485, term781485.getClass(), "first", null);
        setField(term781485, term781485.getClass(), "last", null);
        setField(term781485, term781485.getClass(), "propListHead", null);
        setIntField(term781485, term781485.getClass(), "sourcePosition", 0);
        setField(term781485, term781485.getClass(), "jsType", null);
        setField(term781485, term781485.getClass(), "parent", null);
        setField(term781483, term781483.getClass(), "first", term781485);
        setField(term781483, term781483.getClass(), "last", null);
        setField(term781483, term781483.getClass(), "propListHead", null);
        setIntField(term781483, term781483.getClass(), "sourcePosition", 0);
        setField(term781483, term781483.getClass(), "jsType", null);
        setField(term781492, term781492.getClass(), "str", null);
        setIntField(term781492, term781492.getClass(), "type", 114);
        setField(term781492, term781492.getClass(), "next", null);
        setField(term781492, term781492.getClass(), "first", null);
        setField(term781492, term781492.getClass(), "last", null);
        setField(term781492, term781492.getClass(), "propListHead", null);
        setIntField(term781492, term781492.getClass(), "sourcePosition", 0);
        setField(term781492, term781492.getClass(), "jsType", null);
        setField(term781492, term781492.getClass(), "parent", null);
        setField(term781483, term781483.getClass(), "parent", term781492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term781200;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term781108, args);
        assertTrue(recursiveEquals(term781108, term781574));
        assertTrue(recursiveEquals(term781200, term781575));
        assertTrue(recursiveEquals(retValue, term781483));
    }

};



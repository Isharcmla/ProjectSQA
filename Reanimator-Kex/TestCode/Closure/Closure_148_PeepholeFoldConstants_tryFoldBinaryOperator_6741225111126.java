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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264846;
     Object term264938;
     Object term265158;
     Object term265159;
     Object term265129;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264846 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term264938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term265030, term265030.getClass(), "next", term265122);
        setIntField(term265030, term265030.getClass(), "type", 39);
        setField(term264938, term264938.getClass(), "first", term265030);
        setIntField(term264938, term264938.getClass(), "type", 19);
        term265158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term265158, term265158.getClass(), "currentTraversal", null);
        term265159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term265159, term265159.getClass(), "str", null);
        setIntField(term265159, term265159.getClass(), "type", 19);
        setField(term265159, term265159.getClass(), "next", null);
        setField(term265160, term265160.getClass(), "str", null);
        setIntField(term265160, term265160.getClass(), "type", 39);
        setField(term265161, term265161.getClass(), "str", null);
        setIntField(term265161, term265161.getClass(), "type", 0);
        setField(term265161, term265161.getClass(), "next", null);
        setField(term265161, term265161.getClass(), "first", null);
        setField(term265161, term265161.getClass(), "last", null);
        setField(term265161, term265161.getClass(), "propListHead", null);
        setIntField(term265161, term265161.getClass(), "sourcePosition", 0);
        setField(term265161, term265161.getClass(), "jsType", null);
        setField(term265161, term265161.getClass(), "parent", null);
        setField(term265160, term265160.getClass(), "next", term265161);
        setField(term265160, term265160.getClass(), "first", null);
        setField(term265160, term265160.getClass(), "last", null);
        setField(term265160, term265160.getClass(), "propListHead", null);
        setIntField(term265160, term265160.getClass(), "sourcePosition", 0);
        setField(term265160, term265160.getClass(), "jsType", null);
        setField(term265160, term265160.getClass(), "parent", null);
        setField(term265159, term265159.getClass(), "first", term265160);
        setField(term265159, term265159.getClass(), "last", null);
        setField(term265159, term265159.getClass(), "propListHead", null);
        setIntField(term265159, term265159.getClass(), "sourcePosition", 0);
        setField(term265159, term265159.getClass(), "jsType", null);
        setField(term265159, term265159.getClass(), "parent", null);
        term265129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term265129, term265129.getClass(), "str", null);
        setIntField(term265129, term265129.getClass(), "type", 19);
        setField(term265129, term265129.getClass(), "next", null);
        setField(term265131, term265131.getClass(), "str", null);
        setIntField(term265131, term265131.getClass(), "type", 39);
        setField(term265133, term265133.getClass(), "str", null);
        setIntField(term265133, term265133.getClass(), "type", 0);
        setField(term265133, term265133.getClass(), "next", null);
        setField(term265133, term265133.getClass(), "first", null);
        setField(term265133, term265133.getClass(), "last", null);
        setField(term265133, term265133.getClass(), "propListHead", null);
        setIntField(term265133, term265133.getClass(), "sourcePosition", 0);
        setField(term265133, term265133.getClass(), "jsType", null);
        setField(term265133, term265133.getClass(), "parent", null);
        setField(term265131, term265131.getClass(), "next", term265133);
        setField(term265131, term265131.getClass(), "first", null);
        setField(term265131, term265131.getClass(), "last", null);
        setField(term265131, term265131.getClass(), "propListHead", null);
        setIntField(term265131, term265131.getClass(), "sourcePosition", 0);
        setField(term265131, term265131.getClass(), "jsType", null);
        setField(term265131, term265131.getClass(), "parent", null);
        setField(term265129, term265129.getClass(), "first", term265131);
        setField(term265129, term265129.getClass(), "last", null);
        setField(term265129, term265129.getClass(), "propListHead", null);
        setIntField(term265129, term265129.getClass(), "sourcePosition", 0);
        setField(term265129, term265129.getClass(), "jsType", null);
        setField(term265129, term265129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term264938;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term264846, args);
        assertTrue(recursiveEquals(term264846, term265158));
        assertTrue(recursiveEquals(term264938, term265159));
        assertTrue(recursiveEquals(retValue, term265129));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355876;
     Object term355968;
     Object term356186;
     Object term356187;
     Object term356159;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term355968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356152 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356060, term356060.getClass(), "next", term356152);
        setField(term355968, term355968.getClass(), "first", term356060);
        setIntField(term355968, term355968.getClass(), "type", 22);
        term356186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term356186, term356186.getClass(), "currentTraversal", null);
        term356187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356187, term356187.getClass(), "str", null);
        setIntField(term356187, term356187.getClass(), "type", 22);
        setField(term356187, term356187.getClass(), "next", null);
        setField(term356188, term356188.getClass(), "str", null);
        setIntField(term356188, term356188.getClass(), "type", 0);
        setField(term356189, term356189.getClass(), "str", null);
        setIntField(term356189, term356189.getClass(), "type", 0);
        setField(term356189, term356189.getClass(), "next", null);
        setField(term356189, term356189.getClass(), "first", null);
        setField(term356189, term356189.getClass(), "last", null);
        setField(term356189, term356189.getClass(), "propListHead", null);
        setIntField(term356189, term356189.getClass(), "sourcePosition", 0);
        setField(term356189, term356189.getClass(), "jsType", null);
        setField(term356189, term356189.getClass(), "parent", null);
        setField(term356188, term356188.getClass(), "next", term356189);
        setField(term356188, term356188.getClass(), "first", null);
        setField(term356188, term356188.getClass(), "last", null);
        setField(term356188, term356188.getClass(), "propListHead", null);
        setIntField(term356188, term356188.getClass(), "sourcePosition", 0);
        setField(term356188, term356188.getClass(), "jsType", null);
        setField(term356188, term356188.getClass(), "parent", null);
        setField(term356187, term356187.getClass(), "first", term356188);
        setField(term356187, term356187.getClass(), "last", null);
        setField(term356187, term356187.getClass(), "propListHead", null);
        setIntField(term356187, term356187.getClass(), "sourcePosition", 0);
        setField(term356187, term356187.getClass(), "jsType", null);
        setField(term356187, term356187.getClass(), "parent", null);
        term356159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356163 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356159, term356159.getClass(), "str", null);
        setIntField(term356159, term356159.getClass(), "type", 22);
        setField(term356159, term356159.getClass(), "next", null);
        setField(term356161, term356161.getClass(), "str", null);
        setIntField(term356161, term356161.getClass(), "type", 0);
        setField(term356163, term356163.getClass(), "str", null);
        setIntField(term356163, term356163.getClass(), "type", 0);
        setField(term356163, term356163.getClass(), "next", null);
        setField(term356163, term356163.getClass(), "first", null);
        setField(term356163, term356163.getClass(), "last", null);
        setField(term356163, term356163.getClass(), "propListHead", null);
        setIntField(term356163, term356163.getClass(), "sourcePosition", 0);
        setField(term356163, term356163.getClass(), "jsType", null);
        setField(term356163, term356163.getClass(), "parent", null);
        setField(term356161, term356161.getClass(), "next", term356163);
        setField(term356161, term356161.getClass(), "first", null);
        setField(term356161, term356161.getClass(), "last", null);
        setField(term356161, term356161.getClass(), "propListHead", null);
        setIntField(term356161, term356161.getClass(), "sourcePosition", 0);
        setField(term356161, term356161.getClass(), "jsType", null);
        setField(term356161, term356161.getClass(), "parent", null);
        setField(term356159, term356159.getClass(), "first", term356161);
        setField(term356159, term356159.getClass(), "last", null);
        setField(term356159, term356159.getClass(), "propListHead", null);
        setIntField(term356159, term356159.getClass(), "sourcePosition", 0);
        setField(term356159, term356159.getClass(), "jsType", null);
        setField(term356159, term356159.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term355968;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term355876, args);
        assertTrue(recursiveEquals(term355876, term356186));
        assertTrue(recursiveEquals(term355968, term356187));
        assertTrue(recursiveEquals(retValue, term356159));
    }

};



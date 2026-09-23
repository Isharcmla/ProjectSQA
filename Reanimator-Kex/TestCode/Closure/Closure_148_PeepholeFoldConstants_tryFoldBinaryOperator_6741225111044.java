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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244595;
     Object term244687;
     Object term245060;
     Object term245061;
     Object term245031;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244595 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term244687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term244779, term244779.getClass(), "next", term244871);
        setIntField(term244779, term244779.getClass(), "type", 39);
        setField(term244687, term244687.getClass(), "first", term244779);
        setIntField(term244687, term244687.getClass(), "type", 24);
        term245060 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term245060, term245060.getClass(), "currentTraversal", null);
        term245061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245061, term245061.getClass(), "str", null);
        setIntField(term245061, term245061.getClass(), "type", 24);
        setField(term245061, term245061.getClass(), "next", null);
        setField(term245062, term245062.getClass(), "str", null);
        setIntField(term245062, term245062.getClass(), "type", 39);
        setField(term245063, term245063.getClass(), "str", null);
        setIntField(term245063, term245063.getClass(), "type", 0);
        setField(term245063, term245063.getClass(), "next", null);
        setField(term245063, term245063.getClass(), "first", null);
        setField(term245063, term245063.getClass(), "last", null);
        setField(term245063, term245063.getClass(), "propListHead", null);
        setIntField(term245063, term245063.getClass(), "sourcePosition", 0);
        setField(term245063, term245063.getClass(), "jsType", null);
        setField(term245063, term245063.getClass(), "parent", null);
        setField(term245062, term245062.getClass(), "next", term245063);
        setField(term245062, term245062.getClass(), "first", null);
        setField(term245062, term245062.getClass(), "last", null);
        setField(term245062, term245062.getClass(), "propListHead", null);
        setIntField(term245062, term245062.getClass(), "sourcePosition", 0);
        setField(term245062, term245062.getClass(), "jsType", null);
        setField(term245062, term245062.getClass(), "parent", null);
        setField(term245061, term245061.getClass(), "first", term245062);
        setField(term245061, term245061.getClass(), "last", null);
        setField(term245061, term245061.getClass(), "propListHead", null);
        setIntField(term245061, term245061.getClass(), "sourcePosition", 0);
        setField(term245061, term245061.getClass(), "jsType", null);
        setField(term245061, term245061.getClass(), "parent", null);
        term245031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245031, term245031.getClass(), "str", null);
        setIntField(term245031, term245031.getClass(), "type", 24);
        setField(term245031, term245031.getClass(), "next", null);
        setField(term245033, term245033.getClass(), "str", null);
        setIntField(term245033, term245033.getClass(), "type", 39);
        setField(term245035, term245035.getClass(), "str", null);
        setIntField(term245035, term245035.getClass(), "type", 0);
        setField(term245035, term245035.getClass(), "next", null);
        setField(term245035, term245035.getClass(), "first", null);
        setField(term245035, term245035.getClass(), "last", null);
        setField(term245035, term245035.getClass(), "propListHead", null);
        setIntField(term245035, term245035.getClass(), "sourcePosition", 0);
        setField(term245035, term245035.getClass(), "jsType", null);
        setField(term245035, term245035.getClass(), "parent", null);
        setField(term245033, term245033.getClass(), "next", term245035);
        setField(term245033, term245033.getClass(), "first", null);
        setField(term245033, term245033.getClass(), "last", null);
        setField(term245033, term245033.getClass(), "propListHead", null);
        setIntField(term245033, term245033.getClass(), "sourcePosition", 0);
        setField(term245033, term245033.getClass(), "jsType", null);
        setField(term245033, term245033.getClass(), "parent", null);
        setField(term245031, term245031.getClass(), "first", term245033);
        setField(term245031, term245031.getClass(), "last", null);
        setField(term245031, term245031.getClass(), "propListHead", null);
        setIntField(term245031, term245031.getClass(), "sourcePosition", 0);
        setField(term245031, term245031.getClass(), "jsType", null);
        setField(term245031, term245031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term244687;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term244595, args);
        assertTrue(recursiveEquals(term244595, term245060));
        assertTrue(recursiveEquals(term244687, term245061));
        assertTrue(recursiveEquals(retValue, term245031));
    }

};



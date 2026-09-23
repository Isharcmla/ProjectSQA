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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626732;
     Object term626824;
     Object term651729;
     Object term651730;
     Object term651691;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term626824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term626916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term627008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term626916, term626916.getClass(), "next", term627008);
        setIntField(term626916, term626916.getClass(), "type", 39);
        setField(term626824, term626824.getClass(), "first", term626916);
        setIntField(term626824, term626824.getClass(), "type", 9);
        term651729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651729, term651729.getClass(), "currentTraversal", null);
        term651730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651730, term651730.getClass(), "str", null);
        setIntField(term651730, term651730.getClass(), "type", 9);
        setField(term651730, term651730.getClass(), "next", null);
        setField(term651731, term651731.getClass(), "str", null);
        setIntField(term651731, term651731.getClass(), "type", 39);
        setField(term651732, term651732.getClass(), "str", null);
        setIntField(term651732, term651732.getClass(), "type", 0);
        setField(term651732, term651732.getClass(), "next", null);
        setField(term651732, term651732.getClass(), "first", null);
        setField(term651732, term651732.getClass(), "last", null);
        setField(term651732, term651732.getClass(), "propListHead", null);
        setIntField(term651732, term651732.getClass(), "sourcePosition", 0);
        setField(term651732, term651732.getClass(), "jsType", null);
        setField(term651732, term651732.getClass(), "parent", null);
        setField(term651731, term651731.getClass(), "next", term651732);
        setField(term651731, term651731.getClass(), "first", null);
        setField(term651731, term651731.getClass(), "last", null);
        setField(term651731, term651731.getClass(), "propListHead", null);
        setIntField(term651731, term651731.getClass(), "sourcePosition", 0);
        setField(term651731, term651731.getClass(), "jsType", null);
        setField(term651731, term651731.getClass(), "parent", null);
        setField(term651730, term651730.getClass(), "first", term651731);
        setField(term651730, term651730.getClass(), "last", null);
        setField(term651730, term651730.getClass(), "propListHead", null);
        setIntField(term651730, term651730.getClass(), "sourcePosition", 0);
        setField(term651730, term651730.getClass(), "jsType", null);
        setField(term651730, term651730.getClass(), "parent", null);
        term651691 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651691, term651691.getClass(), "str", null);
        setIntField(term651691, term651691.getClass(), "type", 9);
        setField(term651691, term651691.getClass(), "next", null);
        setField(term651693, term651693.getClass(), "str", null);
        setIntField(term651693, term651693.getClass(), "type", 39);
        setField(term651695, term651695.getClass(), "str", null);
        setIntField(term651695, term651695.getClass(), "type", 0);
        setField(term651695, term651695.getClass(), "next", null);
        setField(term651695, term651695.getClass(), "first", null);
        setField(term651695, term651695.getClass(), "last", null);
        setField(term651695, term651695.getClass(), "propListHead", null);
        setIntField(term651695, term651695.getClass(), "sourcePosition", 0);
        setField(term651695, term651695.getClass(), "jsType", null);
        setField(term651695, term651695.getClass(), "parent", null);
        setField(term651693, term651693.getClass(), "next", term651695);
        setField(term651693, term651693.getClass(), "first", null);
        setField(term651693, term651693.getClass(), "last", null);
        setField(term651693, term651693.getClass(), "propListHead", null);
        setIntField(term651693, term651693.getClass(), "sourcePosition", 0);
        setField(term651693, term651693.getClass(), "jsType", null);
        setField(term651693, term651693.getClass(), "parent", null);
        setField(term651691, term651691.getClass(), "first", term651693);
        setField(term651691, term651691.getClass(), "last", null);
        setField(term651691, term651691.getClass(), "propListHead", null);
        setIntField(term651691, term651691.getClass(), "sourcePosition", 0);
        setField(term651691, term651691.getClass(), "jsType", null);
        setField(term651691, term651691.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term626824;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term626732, args);
        assertTrue(recursiveEquals(term626732, term651729));
        assertTrue(recursiveEquals(term626824, term651730));
        assertTrue(recursiveEquals(retValue, term651691));
    }

};



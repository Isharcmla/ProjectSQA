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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545240;
     Object term545332;
     Object term545901;
     Object term545902;
     Object term545848;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term545332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term545424, term545424.getClass(), "next", term545516);
        setIntField(term545424, term545424.getClass(), "type", 0);
        setField(term545332, term545332.getClass(), "first", term545424);
        setIntField(term545332, term545332.getClass(), "type", 100);
        setField(term545332, term545332.getClass(), "parent", null);
        term545901 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term545901, term545901.getClass(), "currentTraversal", null);
        term545902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term545902, term545902.getClass(), "str", null);
        setIntField(term545902, term545902.getClass(), "type", 100);
        setField(term545902, term545902.getClass(), "next", null);
        setField(term545903, term545903.getClass(), "str", null);
        setIntField(term545903, term545903.getClass(), "type", 0);
        setField(term545904, term545904.getClass(), "str", null);
        setIntField(term545904, term545904.getClass(), "type", 0);
        setField(term545904, term545904.getClass(), "next", null);
        setField(term545904, term545904.getClass(), "first", null);
        setField(term545904, term545904.getClass(), "last", null);
        setField(term545904, term545904.getClass(), "propListHead", null);
        setIntField(term545904, term545904.getClass(), "sourcePosition", 0);
        setField(term545904, term545904.getClass(), "jsType", null);
        setField(term545904, term545904.getClass(), "parent", null);
        setField(term545903, term545903.getClass(), "next", term545904);
        setField(term545903, term545903.getClass(), "first", null);
        setField(term545903, term545903.getClass(), "last", null);
        setField(term545903, term545903.getClass(), "propListHead", null);
        setIntField(term545903, term545903.getClass(), "sourcePosition", 0);
        setField(term545903, term545903.getClass(), "jsType", null);
        setField(term545903, term545903.getClass(), "parent", null);
        setField(term545902, term545902.getClass(), "first", term545903);
        setField(term545902, term545902.getClass(), "last", null);
        setField(term545902, term545902.getClass(), "propListHead", null);
        setIntField(term545902, term545902.getClass(), "sourcePosition", 0);
        setField(term545902, term545902.getClass(), "jsType", null);
        setField(term545902, term545902.getClass(), "parent", null);
        term545848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term545848, term545848.getClass(), "str", null);
        setIntField(term545848, term545848.getClass(), "type", 100);
        setField(term545848, term545848.getClass(), "next", null);
        setField(term545850, term545850.getClass(), "str", null);
        setIntField(term545850, term545850.getClass(), "type", 0);
        setField(term545852, term545852.getClass(), "str", null);
        setIntField(term545852, term545852.getClass(), "type", 0);
        setField(term545852, term545852.getClass(), "next", null);
        setField(term545852, term545852.getClass(), "first", null);
        setField(term545852, term545852.getClass(), "last", null);
        setField(term545852, term545852.getClass(), "propListHead", null);
        setIntField(term545852, term545852.getClass(), "sourcePosition", 0);
        setField(term545852, term545852.getClass(), "jsType", null);
        setField(term545852, term545852.getClass(), "parent", null);
        setField(term545850, term545850.getClass(), "next", term545852);
        setField(term545850, term545850.getClass(), "first", null);
        setField(term545850, term545850.getClass(), "last", null);
        setField(term545850, term545850.getClass(), "propListHead", null);
        setIntField(term545850, term545850.getClass(), "sourcePosition", 0);
        setField(term545850, term545850.getClass(), "jsType", null);
        setField(term545850, term545850.getClass(), "parent", null);
        setField(term545848, term545848.getClass(), "first", term545850);
        setField(term545848, term545848.getClass(), "last", null);
        setField(term545848, term545848.getClass(), "propListHead", null);
        setIntField(term545848, term545848.getClass(), "sourcePosition", 0);
        setField(term545848, term545848.getClass(), "jsType", null);
        setField(term545848, term545848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term545332;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term545240, args);
        assertTrue(recursiveEquals(term545240, term545901));
        assertTrue(recursiveEquals(term545332, term545902));
        assertTrue(recursiveEquals(retValue, term545848));
    }

};



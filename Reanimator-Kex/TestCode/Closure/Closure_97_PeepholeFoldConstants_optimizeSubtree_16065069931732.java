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

public class PeepholeFoldConstants_optimizeSubtree_16065069931732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682238;
     Object term682330;
     Object term682514;
     Object term682515;
     Object term682485;

    public PeepholeFoldConstants_optimizeSubtree_16065069931732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term682330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term682330, term682330.getClass(), "type", 32);
        setField(term682330, term682330.getClass(), "first", term682422);
        term682514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term682514, term682514.getClass(), "currentTraversal", null);
        term682515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term682515, term682515.getClass(), "str", null);
        setIntField(term682515, term682515.getClass(), "type", 32);
        setField(term682515, term682515.getClass(), "next", null);
        setField(term682516, term682516.getClass(), "str", null);
        setIntField(term682516, term682516.getClass(), "type", 0);
        setField(term682516, term682516.getClass(), "next", null);
        setField(term682516, term682516.getClass(), "first", null);
        setField(term682516, term682516.getClass(), "last", null);
        setField(term682516, term682516.getClass(), "propListHead", null);
        setIntField(term682516, term682516.getClass(), "sourcePosition", 0);
        setField(term682516, term682516.getClass(), "jsType", null);
        setField(term682516, term682516.getClass(), "parent", null);
        setField(term682515, term682515.getClass(), "first", term682516);
        setField(term682515, term682515.getClass(), "last", null);
        setField(term682515, term682515.getClass(), "propListHead", null);
        setIntField(term682515, term682515.getClass(), "sourcePosition", 0);
        setField(term682515, term682515.getClass(), "jsType", null);
        setField(term682515, term682515.getClass(), "parent", null);
        term682485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term682487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term682485, term682485.getClass(), "str", null);
        setIntField(term682485, term682485.getClass(), "type", 32);
        setField(term682485, term682485.getClass(), "next", null);
        setField(term682487, term682487.getClass(), "str", null);
        setIntField(term682487, term682487.getClass(), "type", 0);
        setField(term682487, term682487.getClass(), "next", null);
        setField(term682487, term682487.getClass(), "first", null);
        setField(term682487, term682487.getClass(), "last", null);
        setField(term682487, term682487.getClass(), "propListHead", null);
        setIntField(term682487, term682487.getClass(), "sourcePosition", 0);
        setField(term682487, term682487.getClass(), "jsType", null);
        setField(term682487, term682487.getClass(), "parent", null);
        setField(term682485, term682485.getClass(), "first", term682487);
        setField(term682485, term682485.getClass(), "last", null);
        setField(term682485, term682485.getClass(), "propListHead", null);
        setIntField(term682485, term682485.getClass(), "sourcePosition", 0);
        setField(term682485, term682485.getClass(), "jsType", null);
        setField(term682485, term682485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term682330;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term682238, args);
        assertTrue(recursiveEquals(term682238, term682514));
        assertTrue(recursiveEquals(term682330, term682515));
        assertTrue(recursiveEquals(retValue, term682485));
    }

};



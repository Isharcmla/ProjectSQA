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

public class PeepholeFoldConstants_optimizeSubtree_16065069931150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271319;
     Object term271411;
     Object term271709;
     Object term271710;
     Object term271651;

    public PeepholeFoldConstants_optimizeSubtree_16065069931150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271319 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term271411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term271411, term271411.getClass(), "type", 33);
        setField(term271503, term271503.getClass(), "next", term271595);
        setField(term271411, term271411.getClass(), "first", term271503);
        term271709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term271709, term271709.getClass(), "currentTraversal", null);
        term271710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term271710, term271710.getClass(), "number", 0.0);
        setIntField(term271710, term271710.getClass(), "type", 33);
        setField(term271710, term271710.getClass(), "next", null);
        setDoubleField(term271711, term271711.getClass(), "number", 0.0);
        setIntField(term271711, term271711.getClass(), "type", 0);
        setDoubleField(term271712, term271712.getClass(), "number", 0.0);
        setIntField(term271712, term271712.getClass(), "type", 0);
        setField(term271712, term271712.getClass(), "next", null);
        setField(term271712, term271712.getClass(), "first", null);
        setField(term271712, term271712.getClass(), "last", null);
        setField(term271712, term271712.getClass(), "propListHead", null);
        setIntField(term271712, term271712.getClass(), "sourcePosition", 0);
        setField(term271712, term271712.getClass(), "jsType", null);
        setField(term271712, term271712.getClass(), "parent", null);
        setField(term271711, term271711.getClass(), "next", term271712);
        setField(term271711, term271711.getClass(), "first", null);
        setField(term271711, term271711.getClass(), "last", null);
        setField(term271711, term271711.getClass(), "propListHead", null);
        setIntField(term271711, term271711.getClass(), "sourcePosition", 0);
        setField(term271711, term271711.getClass(), "jsType", null);
        setField(term271711, term271711.getClass(), "parent", null);
        setField(term271710, term271710.getClass(), "first", term271711);
        setField(term271710, term271710.getClass(), "last", null);
        setField(term271710, term271710.getClass(), "propListHead", null);
        setIntField(term271710, term271710.getClass(), "sourcePosition", 0);
        setField(term271710, term271710.getClass(), "jsType", null);
        setField(term271710, term271710.getClass(), "parent", null);
        term271651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term271651, term271651.getClass(), "number", 0.0);
        setIntField(term271651, term271651.getClass(), "type", 33);
        setField(term271651, term271651.getClass(), "next", null);
        setDoubleField(term271654, term271654.getClass(), "number", 0.0);
        setIntField(term271654, term271654.getClass(), "type", 0);
        setDoubleField(term271657, term271657.getClass(), "number", 0.0);
        setIntField(term271657, term271657.getClass(), "type", 0);
        setField(term271657, term271657.getClass(), "next", null);
        setField(term271657, term271657.getClass(), "first", null);
        setField(term271657, term271657.getClass(), "last", null);
        setField(term271657, term271657.getClass(), "propListHead", null);
        setIntField(term271657, term271657.getClass(), "sourcePosition", 0);
        setField(term271657, term271657.getClass(), "jsType", null);
        setField(term271657, term271657.getClass(), "parent", null);
        setField(term271654, term271654.getClass(), "next", term271657);
        setField(term271654, term271654.getClass(), "first", null);
        setField(term271654, term271654.getClass(), "last", null);
        setField(term271654, term271654.getClass(), "propListHead", null);
        setIntField(term271654, term271654.getClass(), "sourcePosition", 0);
        setField(term271654, term271654.getClass(), "jsType", null);
        setField(term271654, term271654.getClass(), "parent", null);
        setField(term271651, term271651.getClass(), "first", term271654);
        setField(term271651, term271651.getClass(), "last", null);
        setField(term271651, term271651.getClass(), "propListHead", null);
        setIntField(term271651, term271651.getClass(), "sourcePosition", 0);
        setField(term271651, term271651.getClass(), "jsType", null);
        setField(term271651, term271651.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term271411;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term271319, args);
        assertTrue(recursiveEquals(term271319, term271709));
        assertTrue(recursiveEquals(term271411, term271710));
        assertTrue(recursiveEquals(retValue, term271651));
    }

};



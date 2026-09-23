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

public class PeepholeFoldConstants_optimizeSubtree_16065069932466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691126;
     Object term691218;
     Object term691452;
     Object term691453;
     Object term691410;

    public PeepholeFoldConstants_optimizeSubtree_16065069932466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term691218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term691218, term691218.getClass(), "type", 33);
        setField(term691218, term691218.getClass(), "first", term691218);
        setField(term691218, term691218.getClass(), "next", term691310);
        term691452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term691452, term691452.getClass(), "currentTraversal", null);
        term691453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term691453, term691453.getClass(), "str", null);
        setIntField(term691453, term691453.getClass(), "type", 33);
        setDoubleField(term691454, term691454.getClass(), "number", 0.0);
        setIntField(term691454, term691454.getClass(), "type", 0);
        setField(term691454, term691454.getClass(), "next", null);
        setField(term691454, term691454.getClass(), "first", null);
        setField(term691454, term691454.getClass(), "last", null);
        setField(term691454, term691454.getClass(), "propListHead", null);
        setIntField(term691454, term691454.getClass(), "sourcePosition", 0);
        setField(term691454, term691454.getClass(), "jsType", null);
        setField(term691454, term691454.getClass(), "parent", null);
        setField(term691453, term691453.getClass(), "next", term691454);
        setField(term691453, term691453.getClass(), "first", term691453);
        setField(term691453, term691453.getClass(), "last", null);
        setField(term691453, term691453.getClass(), "propListHead", null);
        setIntField(term691453, term691453.getClass(), "sourcePosition", 0);
        setField(term691453, term691453.getClass(), "jsType", null);
        setField(term691453, term691453.getClass(), "parent", null);
        term691410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691412 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term691410, term691410.getClass(), "str", null);
        setIntField(term691410, term691410.getClass(), "type", 33);
        setDoubleField(term691412, term691412.getClass(), "number", 0.0);
        setIntField(term691412, term691412.getClass(), "type", 0);
        setField(term691412, term691412.getClass(), "next", null);
        setField(term691412, term691412.getClass(), "first", null);
        setField(term691412, term691412.getClass(), "last", null);
        setField(term691412, term691412.getClass(), "propListHead", null);
        setIntField(term691412, term691412.getClass(), "sourcePosition", 0);
        setField(term691412, term691412.getClass(), "jsType", null);
        setField(term691412, term691412.getClass(), "parent", null);
        setField(term691410, term691410.getClass(), "next", term691412);
        setField(term691410, term691410.getClass(), "first", term691410);
        setField(term691410, term691410.getClass(), "last", null);
        setField(term691410, term691410.getClass(), "propListHead", null);
        setIntField(term691410, term691410.getClass(), "sourcePosition", 0);
        setField(term691410, term691410.getClass(), "jsType", null);
        setField(term691410, term691410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term691218;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term691126, args);
        assertTrue(recursiveEquals(term691126, term691452));
        assertTrue(recursiveEquals(term691218, term691453));
        assertTrue(recursiveEquals(retValue, term691410));
    }

};



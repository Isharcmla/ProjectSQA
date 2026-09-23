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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475004;
     Object term475096;
     Object term475325;
     Object term475326;
     Object term475289;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term475096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term475188, term475188.getClass(), "next", term475280);
        setIntField(term475188, term475188.getClass(), "type", 39);
        setField(term475096, term475096.getClass(), "first", term475188);
        setIntField(term475096, term475096.getClass(), "type", 19);
        term475325 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term475325, term475325.getClass(), "currentTraversal", null);
        term475326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term475326, term475326.getClass(), "number", 0.0);
        setIntField(term475326, term475326.getClass(), "type", 19);
        setField(term475326, term475326.getClass(), "next", null);
        setDoubleField(term475327, term475327.getClass(), "number", 0.0);
        setIntField(term475327, term475327.getClass(), "type", 39);
        setDoubleField(term475328, term475328.getClass(), "number", 0.0);
        setIntField(term475328, term475328.getClass(), "type", 0);
        setField(term475328, term475328.getClass(), "next", null);
        setField(term475328, term475328.getClass(), "first", null);
        setField(term475328, term475328.getClass(), "last", null);
        setField(term475328, term475328.getClass(), "propListHead", null);
        setIntField(term475328, term475328.getClass(), "sourcePosition", 0);
        setField(term475328, term475328.getClass(), "jsType", null);
        setField(term475328, term475328.getClass(), "parent", null);
        setField(term475327, term475327.getClass(), "next", term475328);
        setField(term475327, term475327.getClass(), "first", null);
        setField(term475327, term475327.getClass(), "last", null);
        setField(term475327, term475327.getClass(), "propListHead", null);
        setIntField(term475327, term475327.getClass(), "sourcePosition", 0);
        setField(term475327, term475327.getClass(), "jsType", null);
        setField(term475327, term475327.getClass(), "parent", null);
        setField(term475326, term475326.getClass(), "first", term475327);
        setField(term475326, term475326.getClass(), "last", null);
        setField(term475326, term475326.getClass(), "propListHead", null);
        setIntField(term475326, term475326.getClass(), "sourcePosition", 0);
        setField(term475326, term475326.getClass(), "jsType", null);
        setField(term475326, term475326.getClass(), "parent", null);
        term475289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term475289, term475289.getClass(), "number", 0.0);
        setIntField(term475289, term475289.getClass(), "type", 19);
        setField(term475289, term475289.getClass(), "next", null);
        setDoubleField(term475292, term475292.getClass(), "number", 0.0);
        setIntField(term475292, term475292.getClass(), "type", 39);
        setDoubleField(term475295, term475295.getClass(), "number", 0.0);
        setIntField(term475295, term475295.getClass(), "type", 0);
        setField(term475295, term475295.getClass(), "next", null);
        setField(term475295, term475295.getClass(), "first", null);
        setField(term475295, term475295.getClass(), "last", null);
        setField(term475295, term475295.getClass(), "propListHead", null);
        setIntField(term475295, term475295.getClass(), "sourcePosition", 0);
        setField(term475295, term475295.getClass(), "jsType", null);
        setField(term475295, term475295.getClass(), "parent", null);
        setField(term475292, term475292.getClass(), "next", term475295);
        setField(term475292, term475292.getClass(), "first", null);
        setField(term475292, term475292.getClass(), "last", null);
        setField(term475292, term475292.getClass(), "propListHead", null);
        setIntField(term475292, term475292.getClass(), "sourcePosition", 0);
        setField(term475292, term475292.getClass(), "jsType", null);
        setField(term475292, term475292.getClass(), "parent", null);
        setField(term475289, term475289.getClass(), "first", term475292);
        setField(term475289, term475289.getClass(), "last", null);
        setField(term475289, term475289.getClass(), "propListHead", null);
        setIntField(term475289, term475289.getClass(), "sourcePosition", 0);
        setField(term475289, term475289.getClass(), "jsType", null);
        setField(term475289, term475289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term475096;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term475004, args);
        assertTrue(recursiveEquals(term475004, term475325));
        assertTrue(recursiveEquals(term475096, term475326));
        assertTrue(recursiveEquals(retValue, term475289));
    }

};



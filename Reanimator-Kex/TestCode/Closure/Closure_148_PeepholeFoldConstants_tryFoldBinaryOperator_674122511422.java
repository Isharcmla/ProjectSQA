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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85603;
     Object term85695;
     Object term86001;
     Object term86002;
     Object term85967;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term85695 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85787 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term85787, term85787.getClass(), "next", term85879);
        setField(term85695, term85695.getClass(), "first", term85787);
        setIntField(term85695, term85695.getClass(), "type", 20);
        term86001 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term86001, term86001.getClass(), "currentTraversal", null);
        term86002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term86002, term86002.getClass(), "number", 0.0);
        setIntField(term86002, term86002.getClass(), "type", 20);
        setField(term86002, term86002.getClass(), "next", null);
        setDoubleField(term86003, term86003.getClass(), "number", 0.0);
        setIntField(term86003, term86003.getClass(), "type", 0);
        setDoubleField(term86004, term86004.getClass(), "number", 0.0);
        setIntField(term86004, term86004.getClass(), "type", 0);
        setField(term86004, term86004.getClass(), "next", null);
        setField(term86004, term86004.getClass(), "first", null);
        setField(term86004, term86004.getClass(), "last", null);
        setField(term86004, term86004.getClass(), "propListHead", null);
        setIntField(term86004, term86004.getClass(), "sourcePosition", 0);
        setField(term86004, term86004.getClass(), "jsType", null);
        setField(term86004, term86004.getClass(), "parent", null);
        setField(term86003, term86003.getClass(), "next", term86004);
        setField(term86003, term86003.getClass(), "first", null);
        setField(term86003, term86003.getClass(), "last", null);
        setField(term86003, term86003.getClass(), "propListHead", null);
        setIntField(term86003, term86003.getClass(), "sourcePosition", 0);
        setField(term86003, term86003.getClass(), "jsType", null);
        setField(term86003, term86003.getClass(), "parent", null);
        setField(term86002, term86002.getClass(), "first", term86003);
        setField(term86002, term86002.getClass(), "last", null);
        setField(term86002, term86002.getClass(), "propListHead", null);
        setIntField(term86002, term86002.getClass(), "sourcePosition", 0);
        setField(term86002, term86002.getClass(), "jsType", null);
        setField(term86002, term86002.getClass(), "parent", null);
        term85967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85973 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term85967, term85967.getClass(), "number", 0.0);
        setIntField(term85967, term85967.getClass(), "type", 20);
        setField(term85967, term85967.getClass(), "next", null);
        setDoubleField(term85970, term85970.getClass(), "number", 0.0);
        setIntField(term85970, term85970.getClass(), "type", 0);
        setDoubleField(term85973, term85973.getClass(), "number", 0.0);
        setIntField(term85973, term85973.getClass(), "type", 0);
        setField(term85973, term85973.getClass(), "next", null);
        setField(term85973, term85973.getClass(), "first", null);
        setField(term85973, term85973.getClass(), "last", null);
        setField(term85973, term85973.getClass(), "propListHead", null);
        setIntField(term85973, term85973.getClass(), "sourcePosition", 0);
        setField(term85973, term85973.getClass(), "jsType", null);
        setField(term85973, term85973.getClass(), "parent", null);
        setField(term85970, term85970.getClass(), "next", term85973);
        setField(term85970, term85970.getClass(), "first", null);
        setField(term85970, term85970.getClass(), "last", null);
        setField(term85970, term85970.getClass(), "propListHead", null);
        setIntField(term85970, term85970.getClass(), "sourcePosition", 0);
        setField(term85970, term85970.getClass(), "jsType", null);
        setField(term85970, term85970.getClass(), "parent", null);
        setField(term85967, term85967.getClass(), "first", term85970);
        setField(term85967, term85967.getClass(), "last", null);
        setField(term85967, term85967.getClass(), "propListHead", null);
        setIntField(term85967, term85967.getClass(), "sourcePosition", 0);
        setField(term85967, term85967.getClass(), "jsType", null);
        setField(term85967, term85967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85695;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term85603, args);
        assertTrue(recursiveEquals(term85603, term86001));
        assertTrue(recursiveEquals(term85695, term86002));
        assertTrue(recursiveEquals(retValue, term85967));
    }

};



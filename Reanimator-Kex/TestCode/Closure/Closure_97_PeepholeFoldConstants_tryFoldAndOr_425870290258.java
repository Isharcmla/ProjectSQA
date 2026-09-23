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

public class PeepholeFoldConstants_tryFoldAndOr_425870290258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51008;
     Object term51100;
     Object term51192;
     Object term51284;
     Object term51343;
     Object term51344;
     Object term51345;
     Object term51346;
     Object term51302;

    public PeepholeFoldConstants_tryFoldAndOr_425870290258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term51100, term51100.getClass(), "parent", null);
        setIntField(term51100, term51100.getClass(), "type", 0);
        term51192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51192, term51192.getClass(), "type", 0);
        term51284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term51343 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term51343, term51343.getClass(), "currentTraversal", null);
        term51344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51344, term51344.getClass(), "number", 0.0);
        setIntField(term51344, term51344.getClass(), "type", 0);
        setField(term51344, term51344.getClass(), "next", null);
        setField(term51344, term51344.getClass(), "first", null);
        setField(term51344, term51344.getClass(), "last", null);
        setField(term51344, term51344.getClass(), "propListHead", null);
        setIntField(term51344, term51344.getClass(), "sourcePosition", 0);
        setField(term51344, term51344.getClass(), "jsType", null);
        setField(term51344, term51344.getClass(), "parent", null);
        term51345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51345, term51345.getClass(), "number", 0.0);
        setIntField(term51345, term51345.getClass(), "type", 0);
        setField(term51345, term51345.getClass(), "next", null);
        setField(term51345, term51345.getClass(), "first", null);
        setField(term51345, term51345.getClass(), "last", null);
        setField(term51345, term51345.getClass(), "propListHead", null);
        setIntField(term51345, term51345.getClass(), "sourcePosition", 0);
        setField(term51345, term51345.getClass(), "jsType", null);
        setField(term51345, term51345.getClass(), "parent", null);
        term51346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51346, term51346.getClass(), "number", 0.0);
        setIntField(term51346, term51346.getClass(), "type", 0);
        setField(term51346, term51346.getClass(), "next", null);
        setField(term51346, term51346.getClass(), "first", null);
        setField(term51346, term51346.getClass(), "last", null);
        setField(term51346, term51346.getClass(), "propListHead", null);
        setIntField(term51346, term51346.getClass(), "sourcePosition", 0);
        setField(term51346, term51346.getClass(), "jsType", null);
        setField(term51346, term51346.getClass(), "parent", null);
        term51302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51302, term51302.getClass(), "number", 0.0);
        setIntField(term51302, term51302.getClass(), "type", 0);
        setField(term51302, term51302.getClass(), "next", null);
        setField(term51302, term51302.getClass(), "first", null);
        setField(term51302, term51302.getClass(), "last", null);
        setField(term51302, term51302.getClass(), "propListHead", null);
        setIntField(term51302, term51302.getClass(), "sourcePosition", 0);
        setField(term51302, term51302.getClass(), "jsType", null);
        setField(term51302, term51302.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term51100;
        args[1] = term51192;
        args[2] = term51284;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term51008, args);
        assertTrue(recursiveEquals(term51008, term51343));
        assertTrue(recursiveEquals(term51100, term51344));
        assertTrue(recursiveEquals(term51192, term51345));
        assertTrue(recursiveEquals(term51284, term51346));
        assertTrue(recursiveEquals(retValue, term51302));
    }

};



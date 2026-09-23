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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38176;
     Object term38268;
     Object term39339;
     Object term39340;
     Object term39303;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term38268 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term38360, term38360.getClass(), "next", term38452);
        setIntField(term38360, term38360.getClass(), "type", 39);
        setField(term38268, term38268.getClass(), "first", term38360);
        setIntField(term38268, term38268.getClass(), "type", 22);
        term39339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39339, term39339.getClass(), "currentTraversal", null);
        term39340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39340, term39340.getClass(), "number", 0.0);
        setIntField(term39340, term39340.getClass(), "type", 22);
        setField(term39340, term39340.getClass(), "next", null);
        setDoubleField(term39341, term39341.getClass(), "number", 0.0);
        setIntField(term39341, term39341.getClass(), "type", 39);
        setDoubleField(term39342, term39342.getClass(), "number", 0.0);
        setIntField(term39342, term39342.getClass(), "type", 0);
        setField(term39342, term39342.getClass(), "next", null);
        setField(term39342, term39342.getClass(), "first", null);
        setField(term39342, term39342.getClass(), "last", null);
        setField(term39342, term39342.getClass(), "propListHead", null);
        setIntField(term39342, term39342.getClass(), "sourcePosition", 0);
        setField(term39342, term39342.getClass(), "jsType", null);
        setField(term39342, term39342.getClass(), "parent", null);
        setField(term39341, term39341.getClass(), "next", term39342);
        setField(term39341, term39341.getClass(), "first", null);
        setField(term39341, term39341.getClass(), "last", null);
        setField(term39341, term39341.getClass(), "propListHead", null);
        setIntField(term39341, term39341.getClass(), "sourcePosition", 0);
        setField(term39341, term39341.getClass(), "jsType", null);
        setField(term39341, term39341.getClass(), "parent", null);
        setField(term39340, term39340.getClass(), "first", term39341);
        setField(term39340, term39340.getClass(), "last", null);
        setField(term39340, term39340.getClass(), "propListHead", null);
        setIntField(term39340, term39340.getClass(), "sourcePosition", 0);
        setField(term39340, term39340.getClass(), "jsType", null);
        setField(term39340, term39340.getClass(), "parent", null);
        term39303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39303, term39303.getClass(), "number", 0.0);
        setIntField(term39303, term39303.getClass(), "type", 22);
        setField(term39303, term39303.getClass(), "next", null);
        setDoubleField(term39306, term39306.getClass(), "number", 0.0);
        setIntField(term39306, term39306.getClass(), "type", 39);
        setDoubleField(term39309, term39309.getClass(), "number", 0.0);
        setIntField(term39309, term39309.getClass(), "type", 0);
        setField(term39309, term39309.getClass(), "next", null);
        setField(term39309, term39309.getClass(), "first", null);
        setField(term39309, term39309.getClass(), "last", null);
        setField(term39309, term39309.getClass(), "propListHead", null);
        setIntField(term39309, term39309.getClass(), "sourcePosition", 0);
        setField(term39309, term39309.getClass(), "jsType", null);
        setField(term39309, term39309.getClass(), "parent", null);
        setField(term39306, term39306.getClass(), "next", term39309);
        setField(term39306, term39306.getClass(), "first", null);
        setField(term39306, term39306.getClass(), "last", null);
        setField(term39306, term39306.getClass(), "propListHead", null);
        setIntField(term39306, term39306.getClass(), "sourcePosition", 0);
        setField(term39306, term39306.getClass(), "jsType", null);
        setField(term39306, term39306.getClass(), "parent", null);
        setField(term39303, term39303.getClass(), "first", term39306);
        setField(term39303, term39303.getClass(), "last", null);
        setField(term39303, term39303.getClass(), "propListHead", null);
        setIntField(term39303, term39303.getClass(), "sourcePosition", 0);
        setField(term39303, term39303.getClass(), "jsType", null);
        setField(term39303, term39303.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38268;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term38176, args);
        assertTrue(recursiveEquals(term38176, term39339));
        assertTrue(recursiveEquals(term38268, term39340));
        assertTrue(recursiveEquals(retValue, term39303));
    }

};



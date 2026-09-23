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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317545;
     Object term317637;
     Object term318318;
     Object term318319;
     Object term318278;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term317637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term317729, term317729.getClass(), "next", term317821);
        setIntField(term317729, term317729.getClass(), "type", 39);
        setField(term317637, term317637.getClass(), "first", term317729);
        setIntField(term317637, term317637.getClass(), "type", 11);
        term318318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term318318, term318318.getClass(), "currentTraversal", null);
        term318319 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318320 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318319, term318319.getClass(), "number", 0.0);
        setIntField(term318319, term318319.getClass(), "type", 11);
        setField(term318319, term318319.getClass(), "next", null);
        setDoubleField(term318320, term318320.getClass(), "number", 0.0);
        setIntField(term318320, term318320.getClass(), "type", 39);
        setDoubleField(term318321, term318321.getClass(), "number", 0.0);
        setIntField(term318321, term318321.getClass(), "type", 0);
        setField(term318321, term318321.getClass(), "next", null);
        setField(term318321, term318321.getClass(), "first", null);
        setField(term318321, term318321.getClass(), "last", null);
        setField(term318321, term318321.getClass(), "propListHead", null);
        setIntField(term318321, term318321.getClass(), "sourcePosition", 0);
        setField(term318321, term318321.getClass(), "jsType", null);
        setField(term318321, term318321.getClass(), "parent", null);
        setField(term318320, term318320.getClass(), "next", term318321);
        setField(term318320, term318320.getClass(), "first", null);
        setField(term318320, term318320.getClass(), "last", null);
        setField(term318320, term318320.getClass(), "propListHead", null);
        setIntField(term318320, term318320.getClass(), "sourcePosition", 0);
        setField(term318320, term318320.getClass(), "jsType", null);
        setField(term318320, term318320.getClass(), "parent", null);
        setField(term318319, term318319.getClass(), "first", term318320);
        setField(term318319, term318319.getClass(), "last", null);
        setField(term318319, term318319.getClass(), "propListHead", null);
        setIntField(term318319, term318319.getClass(), "sourcePosition", 0);
        setField(term318319, term318319.getClass(), "jsType", null);
        setField(term318319, term318319.getClass(), "parent", null);
        term318278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318278, term318278.getClass(), "number", 0.0);
        setIntField(term318278, term318278.getClass(), "type", 11);
        setField(term318278, term318278.getClass(), "next", null);
        setDoubleField(term318281, term318281.getClass(), "number", 0.0);
        setIntField(term318281, term318281.getClass(), "type", 39);
        setDoubleField(term318284, term318284.getClass(), "number", 0.0);
        setIntField(term318284, term318284.getClass(), "type", 0);
        setField(term318284, term318284.getClass(), "next", null);
        setField(term318284, term318284.getClass(), "first", null);
        setField(term318284, term318284.getClass(), "last", null);
        setField(term318284, term318284.getClass(), "propListHead", null);
        setIntField(term318284, term318284.getClass(), "sourcePosition", 0);
        setField(term318284, term318284.getClass(), "jsType", null);
        setField(term318284, term318284.getClass(), "parent", null);
        setField(term318281, term318281.getClass(), "next", term318284);
        setField(term318281, term318281.getClass(), "first", null);
        setField(term318281, term318281.getClass(), "last", null);
        setField(term318281, term318281.getClass(), "propListHead", null);
        setIntField(term318281, term318281.getClass(), "sourcePosition", 0);
        setField(term318281, term318281.getClass(), "jsType", null);
        setField(term318281, term318281.getClass(), "parent", null);
        setField(term318278, term318278.getClass(), "first", term318281);
        setField(term318278, term318278.getClass(), "last", null);
        setField(term318278, term318278.getClass(), "propListHead", null);
        setIntField(term318278, term318278.getClass(), "sourcePosition", 0);
        setField(term318278, term318278.getClass(), "jsType", null);
        setField(term318278, term318278.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term317637;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term317545, args);
        assertTrue(recursiveEquals(term317545, term318318));
        assertTrue(recursiveEquals(term317637, term318319));
        assertTrue(recursiveEquals(retValue, term318278));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853438;
     Object term853530;
     Object term854871;
     Object term854872;
     Object term854791;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term853438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term853530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term853622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term853714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term853806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term853714, term853714.getClass(), "type", 47);
        setField(term853622, term853622.getClass(), "next", term853714);
        setIntField(term853622, term853622.getClass(), "type", 0);
        setField(term853530, term853530.getClass(), "first", term853622);
        setIntField(term853530, term853530.getClass(), "type", 101);
        setIntField(term853806, term853806.getClass(), "type", 98);
        setField(term853530, term853530.getClass(), "parent", term853806);
        term854871 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term854871, term854871.getClass(), "currentTraversal", null);
        term854872 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term854872, term854872.getClass(), "number", 0.0);
        setIntField(term854872, term854872.getClass(), "type", 101);
        setField(term854872, term854872.getClass(), "next", null);
        setDoubleField(term854873, term854873.getClass(), "number", 0.0);
        setIntField(term854873, term854873.getClass(), "type", 0);
        setDoubleField(term854874, term854874.getClass(), "number", 0.0);
        setIntField(term854874, term854874.getClass(), "type", 47);
        setField(term854874, term854874.getClass(), "next", null);
        setField(term854874, term854874.getClass(), "first", null);
        setField(term854874, term854874.getClass(), "last", null);
        setField(term854874, term854874.getClass(), "propListHead", null);
        setIntField(term854874, term854874.getClass(), "sourcePosition", 0);
        setField(term854874, term854874.getClass(), "jsType", null);
        setField(term854874, term854874.getClass(), "parent", null);
        setField(term854873, term854873.getClass(), "next", term854874);
        setField(term854873, term854873.getClass(), "first", null);
        setField(term854873, term854873.getClass(), "last", null);
        setField(term854873, term854873.getClass(), "propListHead", null);
        setIntField(term854873, term854873.getClass(), "sourcePosition", 0);
        setField(term854873, term854873.getClass(), "jsType", null);
        setField(term854873, term854873.getClass(), "parent", null);
        setField(term854872, term854872.getClass(), "first", term854873);
        setField(term854872, term854872.getClass(), "last", null);
        setField(term854872, term854872.getClass(), "propListHead", null);
        setIntField(term854872, term854872.getClass(), "sourcePosition", 0);
        setField(term854872, term854872.getClass(), "jsType", null);
        setDoubleField(term854875, term854875.getClass(), "number", 0.0);
        setIntField(term854875, term854875.getClass(), "type", 98);
        setField(term854875, term854875.getClass(), "next", null);
        setField(term854875, term854875.getClass(), "first", null);
        setField(term854875, term854875.getClass(), "last", null);
        setField(term854875, term854875.getClass(), "propListHead", null);
        setIntField(term854875, term854875.getClass(), "sourcePosition", 0);
        setField(term854875, term854875.getClass(), "jsType", null);
        setField(term854875, term854875.getClass(), "parent", null);
        setField(term854872, term854872.getClass(), "parent", term854875);
        term854791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854794 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term854803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term854791, term854791.getClass(), "number", 0.0);
        setIntField(term854791, term854791.getClass(), "type", 101);
        setField(term854791, term854791.getClass(), "next", null);
        setDoubleField(term854794, term854794.getClass(), "number", 0.0);
        setIntField(term854794, term854794.getClass(), "type", 0);
        setDoubleField(term854797, term854797.getClass(), "number", 0.0);
        setIntField(term854797, term854797.getClass(), "type", 47);
        setField(term854797, term854797.getClass(), "next", null);
        setField(term854797, term854797.getClass(), "first", null);
        setField(term854797, term854797.getClass(), "last", null);
        setField(term854797, term854797.getClass(), "propListHead", null);
        setIntField(term854797, term854797.getClass(), "sourcePosition", 0);
        setField(term854797, term854797.getClass(), "jsType", null);
        setField(term854797, term854797.getClass(), "parent", null);
        setField(term854794, term854794.getClass(), "next", term854797);
        setField(term854794, term854794.getClass(), "first", null);
        setField(term854794, term854794.getClass(), "last", null);
        setField(term854794, term854794.getClass(), "propListHead", null);
        setIntField(term854794, term854794.getClass(), "sourcePosition", 0);
        setField(term854794, term854794.getClass(), "jsType", null);
        setField(term854794, term854794.getClass(), "parent", null);
        setField(term854791, term854791.getClass(), "first", term854794);
        setField(term854791, term854791.getClass(), "last", null);
        setField(term854791, term854791.getClass(), "propListHead", null);
        setIntField(term854791, term854791.getClass(), "sourcePosition", 0);
        setField(term854791, term854791.getClass(), "jsType", null);
        setDoubleField(term854803, term854803.getClass(), "number", 0.0);
        setIntField(term854803, term854803.getClass(), "type", 98);
        setField(term854803, term854803.getClass(), "next", null);
        setField(term854803, term854803.getClass(), "first", null);
        setField(term854803, term854803.getClass(), "last", null);
        setField(term854803, term854803.getClass(), "propListHead", null);
        setIntField(term854803, term854803.getClass(), "sourcePosition", 0);
        setField(term854803, term854803.getClass(), "jsType", null);
        setField(term854803, term854803.getClass(), "parent", null);
        setField(term854791, term854791.getClass(), "parent", term854803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term853530;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term853438, args);
        assertTrue(recursiveEquals(term853438, term854871));
        assertTrue(recursiveEquals(term853530, term854872));
        assertTrue(recursiveEquals(retValue, term854791));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70139;
     Object term70231;
     Object term70829;
     Object term70830;
     Object term70795;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term70231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term70323, term70323.getClass(), "next", term70415);
        setField(term70231, term70231.getClass(), "first", term70323);
        setIntField(term70231, term70231.getClass(), "type", 23);
        term70829 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term70829, term70829.getClass(), "currentTraversal", null);
        term70830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term70830, term70830.getClass(), "number", 0.0);
        setIntField(term70830, term70830.getClass(), "type", 23);
        setField(term70830, term70830.getClass(), "next", null);
        setDoubleField(term70831, term70831.getClass(), "number", 0.0);
        setIntField(term70831, term70831.getClass(), "type", 0);
        setDoubleField(term70832, term70832.getClass(), "number", 0.0);
        setIntField(term70832, term70832.getClass(), "type", 0);
        setField(term70832, term70832.getClass(), "next", null);
        setField(term70832, term70832.getClass(), "first", null);
        setField(term70832, term70832.getClass(), "last", null);
        setField(term70832, term70832.getClass(), "propListHead", null);
        setIntField(term70832, term70832.getClass(), "sourcePosition", 0);
        setField(term70832, term70832.getClass(), "jsType", null);
        setField(term70832, term70832.getClass(), "parent", null);
        setField(term70831, term70831.getClass(), "next", term70832);
        setField(term70831, term70831.getClass(), "first", null);
        setField(term70831, term70831.getClass(), "last", null);
        setField(term70831, term70831.getClass(), "propListHead", null);
        setIntField(term70831, term70831.getClass(), "sourcePosition", 0);
        setField(term70831, term70831.getClass(), "jsType", null);
        setField(term70831, term70831.getClass(), "parent", null);
        setField(term70830, term70830.getClass(), "first", term70831);
        setField(term70830, term70830.getClass(), "last", null);
        setField(term70830, term70830.getClass(), "propListHead", null);
        setIntField(term70830, term70830.getClass(), "sourcePosition", 0);
        setField(term70830, term70830.getClass(), "jsType", null);
        setField(term70830, term70830.getClass(), "parent", null);
        term70795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term70795, term70795.getClass(), "number", 0.0);
        setIntField(term70795, term70795.getClass(), "type", 23);
        setField(term70795, term70795.getClass(), "next", null);
        setDoubleField(term70798, term70798.getClass(), "number", 0.0);
        setIntField(term70798, term70798.getClass(), "type", 0);
        setDoubleField(term70801, term70801.getClass(), "number", 0.0);
        setIntField(term70801, term70801.getClass(), "type", 0);
        setField(term70801, term70801.getClass(), "next", null);
        setField(term70801, term70801.getClass(), "first", null);
        setField(term70801, term70801.getClass(), "last", null);
        setField(term70801, term70801.getClass(), "propListHead", null);
        setIntField(term70801, term70801.getClass(), "sourcePosition", 0);
        setField(term70801, term70801.getClass(), "jsType", null);
        setField(term70801, term70801.getClass(), "parent", null);
        setField(term70798, term70798.getClass(), "next", term70801);
        setField(term70798, term70798.getClass(), "first", null);
        setField(term70798, term70798.getClass(), "last", null);
        setField(term70798, term70798.getClass(), "propListHead", null);
        setIntField(term70798, term70798.getClass(), "sourcePosition", 0);
        setField(term70798, term70798.getClass(), "jsType", null);
        setField(term70798, term70798.getClass(), "parent", null);
        setField(term70795, term70795.getClass(), "first", term70798);
        setField(term70795, term70795.getClass(), "last", null);
        setField(term70795, term70795.getClass(), "propListHead", null);
        setIntField(term70795, term70795.getClass(), "sourcePosition", 0);
        setField(term70795, term70795.getClass(), "jsType", null);
        setField(term70795, term70795.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term70231;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term70139, args);
        assertTrue(recursiveEquals(term70139, term70829));
        assertTrue(recursiveEquals(term70231, term70830));
        assertTrue(recursiveEquals(retValue, term70795));
    }

};



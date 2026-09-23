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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313731;
     Object term313823;
     Object term314139;
     Object term314140;
     Object term314105;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term313823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term313915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term313915, term313915.getClass(), "next", term314007);
        setField(term313823, term313823.getClass(), "first", term313915);
        setIntField(term313823, term313823.getClass(), "type", 24);
        term314139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term314139, term314139.getClass(), "currentTraversal", null);
        term314140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term314140, term314140.getClass(), "number", 0.0);
        setIntField(term314140, term314140.getClass(), "type", 24);
        setField(term314140, term314140.getClass(), "next", null);
        setDoubleField(term314141, term314141.getClass(), "number", 0.0);
        setIntField(term314141, term314141.getClass(), "type", 0);
        setDoubleField(term314142, term314142.getClass(), "number", 0.0);
        setIntField(term314142, term314142.getClass(), "type", 0);
        setField(term314142, term314142.getClass(), "next", null);
        setField(term314142, term314142.getClass(), "first", null);
        setField(term314142, term314142.getClass(), "last", null);
        setField(term314142, term314142.getClass(), "propListHead", null);
        setIntField(term314142, term314142.getClass(), "sourcePosition", 0);
        setField(term314142, term314142.getClass(), "jsType", null);
        setField(term314142, term314142.getClass(), "parent", null);
        setField(term314141, term314141.getClass(), "next", term314142);
        setField(term314141, term314141.getClass(), "first", null);
        setField(term314141, term314141.getClass(), "last", null);
        setField(term314141, term314141.getClass(), "propListHead", null);
        setIntField(term314141, term314141.getClass(), "sourcePosition", 0);
        setField(term314141, term314141.getClass(), "jsType", null);
        setField(term314141, term314141.getClass(), "parent", null);
        setField(term314140, term314140.getClass(), "first", term314141);
        setField(term314140, term314140.getClass(), "last", null);
        setField(term314140, term314140.getClass(), "propListHead", null);
        setIntField(term314140, term314140.getClass(), "sourcePosition", 0);
        setField(term314140, term314140.getClass(), "jsType", null);
        setField(term314140, term314140.getClass(), "parent", null);
        term314105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term314105, term314105.getClass(), "number", 0.0);
        setIntField(term314105, term314105.getClass(), "type", 24);
        setField(term314105, term314105.getClass(), "next", null);
        setDoubleField(term314108, term314108.getClass(), "number", 0.0);
        setIntField(term314108, term314108.getClass(), "type", 0);
        setDoubleField(term314111, term314111.getClass(), "number", 0.0);
        setIntField(term314111, term314111.getClass(), "type", 0);
        setField(term314111, term314111.getClass(), "next", null);
        setField(term314111, term314111.getClass(), "first", null);
        setField(term314111, term314111.getClass(), "last", null);
        setField(term314111, term314111.getClass(), "propListHead", null);
        setIntField(term314111, term314111.getClass(), "sourcePosition", 0);
        setField(term314111, term314111.getClass(), "jsType", null);
        setField(term314111, term314111.getClass(), "parent", null);
        setField(term314108, term314108.getClass(), "next", term314111);
        setField(term314108, term314108.getClass(), "first", null);
        setField(term314108, term314108.getClass(), "last", null);
        setField(term314108, term314108.getClass(), "propListHead", null);
        setIntField(term314108, term314108.getClass(), "sourcePosition", 0);
        setField(term314108, term314108.getClass(), "jsType", null);
        setField(term314108, term314108.getClass(), "parent", null);
        setField(term314105, term314105.getClass(), "first", term314108);
        setField(term314105, term314105.getClass(), "last", null);
        setField(term314105, term314105.getClass(), "propListHead", null);
        setIntField(term314105, term314105.getClass(), "sourcePosition", 0);
        setField(term314105, term314105.getClass(), "jsType", null);
        setField(term314105, term314105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term313823;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term313731, args);
        assertTrue(recursiveEquals(term313731, term314139));
        assertTrue(recursiveEquals(term313823, term314140));
        assertTrue(recursiveEquals(retValue, term314105));
    }

};



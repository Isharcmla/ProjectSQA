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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60208;
     Object term60278;
     Object term60460;
     Object term60461;
     Object term60425;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term60278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60348, term60348.getClass(), "next", term60418);
        setIntField(term60348, term60348.getClass(), "type", 39);
        setField(term60278, term60278.getClass(), "first", term60348);
        setIntField(term60278, term60278.getClass(), "type", 9);
        term60460 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term60460, term60460.getClass(), "currentTraversal", null);
        term60461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60461, term60461.getClass(), "type", 9);
        setField(term60461, term60461.getClass(), "next", null);
        setIntField(term60462, term60462.getClass(), "type", 39);
        setIntField(term60463, term60463.getClass(), "type", 0);
        setField(term60463, term60463.getClass(), "next", null);
        setField(term60463, term60463.getClass(), "first", null);
        setField(term60463, term60463.getClass(), "last", null);
        setField(term60463, term60463.getClass(), "propListHead", null);
        setIntField(term60463, term60463.getClass(), "sourcePosition", 0);
        setField(term60463, term60463.getClass(), "jsType", null);
        setField(term60463, term60463.getClass(), "parent", null);
        setField(term60462, term60462.getClass(), "next", term60463);
        setField(term60462, term60462.getClass(), "first", null);
        setField(term60462, term60462.getClass(), "last", null);
        setField(term60462, term60462.getClass(), "propListHead", null);
        setIntField(term60462, term60462.getClass(), "sourcePosition", 0);
        setField(term60462, term60462.getClass(), "jsType", null);
        setField(term60462, term60462.getClass(), "parent", null);
        setField(term60461, term60461.getClass(), "first", term60462);
        setField(term60461, term60461.getClass(), "last", null);
        setField(term60461, term60461.getClass(), "propListHead", null);
        setIntField(term60461, term60461.getClass(), "sourcePosition", 0);
        setField(term60461, term60461.getClass(), "jsType", null);
        setField(term60461, term60461.getClass(), "parent", null);
        term60425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60425, term60425.getClass(), "type", 9);
        setField(term60425, term60425.getClass(), "next", null);
        setIntField(term60427, term60427.getClass(), "type", 39);
        setIntField(term60429, term60429.getClass(), "type", 0);
        setField(term60429, term60429.getClass(), "next", null);
        setField(term60429, term60429.getClass(), "first", null);
        setField(term60429, term60429.getClass(), "last", null);
        setField(term60429, term60429.getClass(), "propListHead", null);
        setIntField(term60429, term60429.getClass(), "sourcePosition", 0);
        setField(term60429, term60429.getClass(), "jsType", null);
        setField(term60429, term60429.getClass(), "parent", null);
        setField(term60427, term60427.getClass(), "next", term60429);
        setField(term60427, term60427.getClass(), "first", null);
        setField(term60427, term60427.getClass(), "last", null);
        setField(term60427, term60427.getClass(), "propListHead", null);
        setIntField(term60427, term60427.getClass(), "sourcePosition", 0);
        setField(term60427, term60427.getClass(), "jsType", null);
        setField(term60427, term60427.getClass(), "parent", null);
        setField(term60425, term60425.getClass(), "first", term60427);
        setField(term60425, term60425.getClass(), "last", null);
        setField(term60425, term60425.getClass(), "propListHead", null);
        setIntField(term60425, term60425.getClass(), "sourcePosition", 0);
        setField(term60425, term60425.getClass(), "jsType", null);
        setField(term60425, term60425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term60278;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term60208, args);
        assertTrue(recursiveEquals(term60208, term60460));
        assertTrue(recursiveEquals(term60278, term60461));
        assertTrue(recursiveEquals(retValue, term60425));
    }

};



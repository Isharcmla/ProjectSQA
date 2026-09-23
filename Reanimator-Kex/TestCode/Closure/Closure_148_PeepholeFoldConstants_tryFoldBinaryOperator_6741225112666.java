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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761812;
     Object term761904;
     Object term762148;
     Object term762149;
     Object term762097;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term761904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term761996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term762088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term761996, term761996.getClass(), "next", term762088);
        setIntField(term761996, term761996.getClass(), "type", 14);
        setField(term761904, term761904.getClass(), "first", term761996);
        setIntField(term761904, term761904.getClass(), "type", 14);
        term762148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term762148, term762148.getClass(), "currentTraversal", null);
        term762149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term762150 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term762151 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term762149, term762149.getClass(), "number", 0.0);
        setIntField(term762149, term762149.getClass(), "type", 14);
        setField(term762149, term762149.getClass(), "next", null);
        setDoubleField(term762150, term762150.getClass(), "number", 0.0);
        setIntField(term762150, term762150.getClass(), "type", 14);
        setDoubleField(term762151, term762151.getClass(), "number", 0.0);
        setIntField(term762151, term762151.getClass(), "type", 0);
        setField(term762151, term762151.getClass(), "next", null);
        setField(term762151, term762151.getClass(), "first", null);
        setField(term762151, term762151.getClass(), "last", null);
        setField(term762151, term762151.getClass(), "propListHead", null);
        setIntField(term762151, term762151.getClass(), "sourcePosition", 0);
        setField(term762151, term762151.getClass(), "jsType", null);
        setField(term762151, term762151.getClass(), "parent", null);
        setField(term762150, term762150.getClass(), "next", term762151);
        setField(term762150, term762150.getClass(), "first", null);
        setField(term762150, term762150.getClass(), "last", null);
        setField(term762150, term762150.getClass(), "propListHead", null);
        setIntField(term762150, term762150.getClass(), "sourcePosition", 0);
        setField(term762150, term762150.getClass(), "jsType", null);
        setField(term762150, term762150.getClass(), "parent", null);
        setField(term762149, term762149.getClass(), "first", term762150);
        setField(term762149, term762149.getClass(), "last", null);
        setField(term762149, term762149.getClass(), "propListHead", null);
        setIntField(term762149, term762149.getClass(), "sourcePosition", 0);
        setField(term762149, term762149.getClass(), "jsType", null);
        setField(term762149, term762149.getClass(), "parent", null);
        term762097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term762100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term762103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term762097, term762097.getClass(), "number", 0.0);
        setIntField(term762097, term762097.getClass(), "type", 14);
        setField(term762097, term762097.getClass(), "next", null);
        setDoubleField(term762100, term762100.getClass(), "number", 0.0);
        setIntField(term762100, term762100.getClass(), "type", 14);
        setDoubleField(term762103, term762103.getClass(), "number", 0.0);
        setIntField(term762103, term762103.getClass(), "type", 0);
        setField(term762103, term762103.getClass(), "next", null);
        setField(term762103, term762103.getClass(), "first", null);
        setField(term762103, term762103.getClass(), "last", null);
        setField(term762103, term762103.getClass(), "propListHead", null);
        setIntField(term762103, term762103.getClass(), "sourcePosition", 0);
        setField(term762103, term762103.getClass(), "jsType", null);
        setField(term762103, term762103.getClass(), "parent", null);
        setField(term762100, term762100.getClass(), "next", term762103);
        setField(term762100, term762100.getClass(), "first", null);
        setField(term762100, term762100.getClass(), "last", null);
        setField(term762100, term762100.getClass(), "propListHead", null);
        setIntField(term762100, term762100.getClass(), "sourcePosition", 0);
        setField(term762100, term762100.getClass(), "jsType", null);
        setField(term762100, term762100.getClass(), "parent", null);
        setField(term762097, term762097.getClass(), "first", term762100);
        setField(term762097, term762097.getClass(), "last", null);
        setField(term762097, term762097.getClass(), "propListHead", null);
        setIntField(term762097, term762097.getClass(), "sourcePosition", 0);
        setField(term762097, term762097.getClass(), "jsType", null);
        setField(term762097, term762097.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term761904;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term761812, args);
        assertTrue(recursiveEquals(term761812, term762148));
        assertTrue(recursiveEquals(term761904, term762149));
        assertTrue(recursiveEquals(retValue, term762097));
    }

};



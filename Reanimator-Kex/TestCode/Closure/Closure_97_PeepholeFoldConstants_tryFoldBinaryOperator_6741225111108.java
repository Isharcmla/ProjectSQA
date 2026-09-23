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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342554;
     Object term342646;
     Object term342880;
     Object term342881;
     Object term342839;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term342646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term342738, term342738.getClass(), "next", term342830);
        setField(term342646, term342646.getClass(), "first", term342738);
        setIntField(term342646, term342646.getClass(), "type", 45);
        term342880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term342880, term342880.getClass(), "currentTraversal", null);
        term342881 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term342881, term342881.getClass(), "number", 0.0);
        setIntField(term342881, term342881.getClass(), "type", 45);
        setField(term342881, term342881.getClass(), "next", null);
        setDoubleField(term342882, term342882.getClass(), "number", 0.0);
        setIntField(term342882, term342882.getClass(), "type", 0);
        setDoubleField(term342883, term342883.getClass(), "number", 0.0);
        setIntField(term342883, term342883.getClass(), "type", 0);
        setField(term342883, term342883.getClass(), "next", null);
        setField(term342883, term342883.getClass(), "first", null);
        setField(term342883, term342883.getClass(), "last", null);
        setField(term342883, term342883.getClass(), "propListHead", null);
        setIntField(term342883, term342883.getClass(), "sourcePosition", 0);
        setField(term342883, term342883.getClass(), "jsType", null);
        setField(term342883, term342883.getClass(), "parent", null);
        setField(term342882, term342882.getClass(), "next", term342883);
        setField(term342882, term342882.getClass(), "first", null);
        setField(term342882, term342882.getClass(), "last", null);
        setField(term342882, term342882.getClass(), "propListHead", null);
        setIntField(term342882, term342882.getClass(), "sourcePosition", 0);
        setField(term342882, term342882.getClass(), "jsType", null);
        setField(term342882, term342882.getClass(), "parent", null);
        setField(term342881, term342881.getClass(), "first", term342882);
        setField(term342881, term342881.getClass(), "last", null);
        setField(term342881, term342881.getClass(), "propListHead", null);
        setIntField(term342881, term342881.getClass(), "sourcePosition", 0);
        setField(term342881, term342881.getClass(), "jsType", null);
        setField(term342881, term342881.getClass(), "parent", null);
        term342839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term342845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term342839, term342839.getClass(), "number", 0.0);
        setIntField(term342839, term342839.getClass(), "type", 45);
        setField(term342839, term342839.getClass(), "next", null);
        setDoubleField(term342842, term342842.getClass(), "number", 0.0);
        setIntField(term342842, term342842.getClass(), "type", 0);
        setDoubleField(term342845, term342845.getClass(), "number", 0.0);
        setIntField(term342845, term342845.getClass(), "type", 0);
        setField(term342845, term342845.getClass(), "next", null);
        setField(term342845, term342845.getClass(), "first", null);
        setField(term342845, term342845.getClass(), "last", null);
        setField(term342845, term342845.getClass(), "propListHead", null);
        setIntField(term342845, term342845.getClass(), "sourcePosition", 0);
        setField(term342845, term342845.getClass(), "jsType", null);
        setField(term342845, term342845.getClass(), "parent", null);
        setField(term342842, term342842.getClass(), "next", term342845);
        setField(term342842, term342842.getClass(), "first", null);
        setField(term342842, term342842.getClass(), "last", null);
        setField(term342842, term342842.getClass(), "propListHead", null);
        setIntField(term342842, term342842.getClass(), "sourcePosition", 0);
        setField(term342842, term342842.getClass(), "jsType", null);
        setField(term342842, term342842.getClass(), "parent", null);
        setField(term342839, term342839.getClass(), "first", term342842);
        setField(term342839, term342839.getClass(), "last", null);
        setField(term342839, term342839.getClass(), "propListHead", null);
        setIntField(term342839, term342839.getClass(), "sourcePosition", 0);
        setField(term342839, term342839.getClass(), "jsType", null);
        setField(term342839, term342839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term342646;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term342554, args);
        assertTrue(recursiveEquals(term342554, term342880));
        assertTrue(recursiveEquals(term342646, term342881));
        assertTrue(recursiveEquals(retValue, term342839));
    }

};



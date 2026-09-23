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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314268;
     Object term314360;
     Object term314487;
     Object term314488;
     Object term314438;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term314360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term314360, term314360.getClass(), "first", term314360);
        setField(term314360, term314360.getClass(), "next", term314430);
        setIntField(term314360, term314360.getClass(), "type", 100);
        term314487 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term314487, term314487.getClass(), "currentTraversal", null);
        term314488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term314488, term314488.getClass(), "number", 0.0);
        setIntField(term314488, term314488.getClass(), "type", 100);
        setIntField(term314489, term314489.getClass(), "type", 0);
        setField(term314489, term314489.getClass(), "next", null);
        setField(term314489, term314489.getClass(), "first", null);
        setField(term314489, term314489.getClass(), "last", null);
        setField(term314489, term314489.getClass(), "propListHead", null);
        setIntField(term314489, term314489.getClass(), "sourcePosition", 0);
        setField(term314489, term314489.getClass(), "jsType", null);
        setField(term314489, term314489.getClass(), "parent", null);
        setField(term314488, term314488.getClass(), "next", term314489);
        setField(term314488, term314488.getClass(), "first", term314488);
        setField(term314488, term314488.getClass(), "last", null);
        setField(term314488, term314488.getClass(), "propListHead", null);
        setIntField(term314488, term314488.getClass(), "sourcePosition", 0);
        setField(term314488, term314488.getClass(), "jsType", null);
        setField(term314488, term314488.getClass(), "parent", null);
        term314438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term314438, term314438.getClass(), "number", 0.0);
        setIntField(term314438, term314438.getClass(), "type", 100);
        setIntField(term314441, term314441.getClass(), "type", 0);
        setField(term314441, term314441.getClass(), "next", null);
        setField(term314441, term314441.getClass(), "first", null);
        setField(term314441, term314441.getClass(), "last", null);
        setField(term314441, term314441.getClass(), "propListHead", null);
        setIntField(term314441, term314441.getClass(), "sourcePosition", 0);
        setField(term314441, term314441.getClass(), "jsType", null);
        setField(term314441, term314441.getClass(), "parent", null);
        setField(term314438, term314438.getClass(), "next", term314441);
        setField(term314438, term314438.getClass(), "first", term314438);
        setField(term314438, term314438.getClass(), "last", null);
        setField(term314438, term314438.getClass(), "propListHead", null);
        setIntField(term314438, term314438.getClass(), "sourcePosition", 0);
        setField(term314438, term314438.getClass(), "jsType", null);
        setField(term314438, term314438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term314360;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term314268, args);
        assertTrue(recursiveEquals(term314268, term314487));
        assertTrue(recursiveEquals(term314360, term314488));
        assertTrue(recursiveEquals(retValue, term314438));
    }

};



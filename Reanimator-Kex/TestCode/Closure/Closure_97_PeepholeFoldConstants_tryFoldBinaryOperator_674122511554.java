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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146275;
     Object term146367;
     Object term147427;
     Object term147428;
     Object term147389;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146275 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term146367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term146551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term146459, term146459.getClass(), "next", term146551);
        setField(term146367, term146367.getClass(), "first", term146459);
        setIntField(term146367, term146367.getClass(), "type", 33);
        term147427 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term147427, term147427.getClass(), "currentTraversal", null);
        term147428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147428, term147428.getClass(), "number", 0.0);
        setIntField(term147428, term147428.getClass(), "type", 33);
        setField(term147428, term147428.getClass(), "next", null);
        setDoubleField(term147429, term147429.getClass(), "number", 0.0);
        setIntField(term147429, term147429.getClass(), "type", 0);
        setDoubleField(term147430, term147430.getClass(), "number", 0.0);
        setIntField(term147430, term147430.getClass(), "type", 0);
        setField(term147430, term147430.getClass(), "next", null);
        setField(term147430, term147430.getClass(), "first", null);
        setField(term147430, term147430.getClass(), "last", null);
        setField(term147430, term147430.getClass(), "propListHead", null);
        setIntField(term147430, term147430.getClass(), "sourcePosition", 0);
        setField(term147430, term147430.getClass(), "jsType", null);
        setField(term147430, term147430.getClass(), "parent", null);
        setField(term147429, term147429.getClass(), "next", term147430);
        setField(term147429, term147429.getClass(), "first", null);
        setField(term147429, term147429.getClass(), "last", null);
        setField(term147429, term147429.getClass(), "propListHead", null);
        setIntField(term147429, term147429.getClass(), "sourcePosition", 0);
        setField(term147429, term147429.getClass(), "jsType", null);
        setField(term147429, term147429.getClass(), "parent", null);
        setField(term147428, term147428.getClass(), "first", term147429);
        setField(term147428, term147428.getClass(), "last", null);
        setField(term147428, term147428.getClass(), "propListHead", null);
        setIntField(term147428, term147428.getClass(), "sourcePosition", 0);
        setField(term147428, term147428.getClass(), "jsType", null);
        setField(term147428, term147428.getClass(), "parent", null);
        term147389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147389, term147389.getClass(), "number", 0.0);
        setIntField(term147389, term147389.getClass(), "type", 33);
        setField(term147389, term147389.getClass(), "next", null);
        setDoubleField(term147392, term147392.getClass(), "number", 0.0);
        setIntField(term147392, term147392.getClass(), "type", 0);
        setDoubleField(term147395, term147395.getClass(), "number", 0.0);
        setIntField(term147395, term147395.getClass(), "type", 0);
        setField(term147395, term147395.getClass(), "next", null);
        setField(term147395, term147395.getClass(), "first", null);
        setField(term147395, term147395.getClass(), "last", null);
        setField(term147395, term147395.getClass(), "propListHead", null);
        setIntField(term147395, term147395.getClass(), "sourcePosition", 0);
        setField(term147395, term147395.getClass(), "jsType", null);
        setField(term147395, term147395.getClass(), "parent", null);
        setField(term147392, term147392.getClass(), "next", term147395);
        setField(term147392, term147392.getClass(), "first", null);
        setField(term147392, term147392.getClass(), "last", null);
        setField(term147392, term147392.getClass(), "propListHead", null);
        setIntField(term147392, term147392.getClass(), "sourcePosition", 0);
        setField(term147392, term147392.getClass(), "jsType", null);
        setField(term147392, term147392.getClass(), "parent", null);
        setField(term147389, term147389.getClass(), "first", term147392);
        setField(term147389, term147389.getClass(), "last", null);
        setField(term147389, term147389.getClass(), "propListHead", null);
        setIntField(term147389, term147389.getClass(), "sourcePosition", 0);
        setField(term147389, term147389.getClass(), "jsType", null);
        setField(term147389, term147389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term146367;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term146275, args);
        assertTrue(recursiveEquals(term146275, term147427));
        assertTrue(recursiveEquals(term146367, term147428));
        assertTrue(recursiveEquals(retValue, term147389));
    }

};



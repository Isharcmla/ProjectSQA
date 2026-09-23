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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626231;
     Object term626323;
     Object term627078;
     Object term627079;
     Object term627045;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term626323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term626415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term626507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term626415, term626415.getClass(), "next", term626507);
        setIntField(term626415, term626415.getClass(), "type", 39);
        setField(term626323, term626323.getClass(), "first", term626415);
        setIntField(term626323, term626323.getClass(), "type", 24);
        term627078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term627078, term627078.getClass(), "currentTraversal", null);
        term627079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term627080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term627081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term627079, term627079.getClass(), "number", 0.0);
        setIntField(term627079, term627079.getClass(), "type", 24);
        setField(term627079, term627079.getClass(), "next", null);
        setDoubleField(term627080, term627080.getClass(), "number", 0.0);
        setIntField(term627080, term627080.getClass(), "type", 39);
        setField(term627081, term627081.getClass(), "str", null);
        setIntField(term627081, term627081.getClass(), "type", 0);
        setField(term627081, term627081.getClass(), "next", null);
        setField(term627081, term627081.getClass(), "first", null);
        setField(term627081, term627081.getClass(), "last", null);
        setField(term627081, term627081.getClass(), "propListHead", null);
        setIntField(term627081, term627081.getClass(), "sourcePosition", 0);
        setField(term627081, term627081.getClass(), "jsType", null);
        setField(term627081, term627081.getClass(), "parent", null);
        setField(term627080, term627080.getClass(), "next", term627081);
        setField(term627080, term627080.getClass(), "first", null);
        setField(term627080, term627080.getClass(), "last", null);
        setField(term627080, term627080.getClass(), "propListHead", null);
        setIntField(term627080, term627080.getClass(), "sourcePosition", 0);
        setField(term627080, term627080.getClass(), "jsType", null);
        setField(term627080, term627080.getClass(), "parent", null);
        setField(term627079, term627079.getClass(), "first", term627080);
        setField(term627079, term627079.getClass(), "last", null);
        setField(term627079, term627079.getClass(), "propListHead", null);
        setIntField(term627079, term627079.getClass(), "sourcePosition", 0);
        setField(term627079, term627079.getClass(), "jsType", null);
        setField(term627079, term627079.getClass(), "parent", null);
        term627045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term627048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term627051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term627045, term627045.getClass(), "number", 0.0);
        setIntField(term627045, term627045.getClass(), "type", 24);
        setField(term627045, term627045.getClass(), "next", null);
        setDoubleField(term627048, term627048.getClass(), "number", 0.0);
        setIntField(term627048, term627048.getClass(), "type", 39);
        setField(term627051, term627051.getClass(), "str", null);
        setIntField(term627051, term627051.getClass(), "type", 0);
        setField(term627051, term627051.getClass(), "next", null);
        setField(term627051, term627051.getClass(), "first", null);
        setField(term627051, term627051.getClass(), "last", null);
        setField(term627051, term627051.getClass(), "propListHead", null);
        setIntField(term627051, term627051.getClass(), "sourcePosition", 0);
        setField(term627051, term627051.getClass(), "jsType", null);
        setField(term627051, term627051.getClass(), "parent", null);
        setField(term627048, term627048.getClass(), "next", term627051);
        setField(term627048, term627048.getClass(), "first", null);
        setField(term627048, term627048.getClass(), "last", null);
        setField(term627048, term627048.getClass(), "propListHead", null);
        setIntField(term627048, term627048.getClass(), "sourcePosition", 0);
        setField(term627048, term627048.getClass(), "jsType", null);
        setField(term627048, term627048.getClass(), "parent", null);
        setField(term627045, term627045.getClass(), "first", term627048);
        setField(term627045, term627045.getClass(), "last", null);
        setField(term627045, term627045.getClass(), "propListHead", null);
        setIntField(term627045, term627045.getClass(), "sourcePosition", 0);
        setField(term627045, term627045.getClass(), "jsType", null);
        setField(term627045, term627045.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term626323;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term626231, args);
        assertTrue(recursiveEquals(term626231, term627078));
        assertTrue(recursiveEquals(term626323, term627079));
        assertTrue(recursiveEquals(retValue, term627045));
    }

};



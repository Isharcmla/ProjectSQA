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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317663;
     Object term317755;
     Object term318404;
     Object term318405;
     Object term318353;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term317755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term317847, term317847.getClass(), "next", term317939);
        setIntField(term317847, term317847.getClass(), "type", 14);
        setField(term317755, term317755.getClass(), "first", term317847);
        setIntField(term317755, term317755.getClass(), "type", 14);
        term318404 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term318404, term318404.getClass(), "currentTraversal", null);
        term318405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318405, term318405.getClass(), "number", 0.0);
        setIntField(term318405, term318405.getClass(), "type", 14);
        setField(term318405, term318405.getClass(), "next", null);
        setDoubleField(term318406, term318406.getClass(), "number", 0.0);
        setIntField(term318406, term318406.getClass(), "type", 14);
        setDoubleField(term318407, term318407.getClass(), "number", 0.0);
        setIntField(term318407, term318407.getClass(), "type", 0);
        setField(term318407, term318407.getClass(), "next", null);
        setField(term318407, term318407.getClass(), "first", null);
        setField(term318407, term318407.getClass(), "last", null);
        setField(term318407, term318407.getClass(), "propListHead", null);
        setIntField(term318407, term318407.getClass(), "sourcePosition", 0);
        setField(term318407, term318407.getClass(), "jsType", null);
        setField(term318407, term318407.getClass(), "parent", null);
        setField(term318406, term318406.getClass(), "next", term318407);
        setField(term318406, term318406.getClass(), "first", null);
        setField(term318406, term318406.getClass(), "last", null);
        setField(term318406, term318406.getClass(), "propListHead", null);
        setIntField(term318406, term318406.getClass(), "sourcePosition", 0);
        setField(term318406, term318406.getClass(), "jsType", null);
        setField(term318406, term318406.getClass(), "parent", null);
        setField(term318405, term318405.getClass(), "first", term318406);
        setField(term318405, term318405.getClass(), "last", null);
        setField(term318405, term318405.getClass(), "propListHead", null);
        setIntField(term318405, term318405.getClass(), "sourcePosition", 0);
        setField(term318405, term318405.getClass(), "jsType", null);
        setField(term318405, term318405.getClass(), "parent", null);
        term318353 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term318359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318353, term318353.getClass(), "number", 0.0);
        setIntField(term318353, term318353.getClass(), "type", 14);
        setField(term318353, term318353.getClass(), "next", null);
        setDoubleField(term318356, term318356.getClass(), "number", 0.0);
        setIntField(term318356, term318356.getClass(), "type", 14);
        setDoubleField(term318359, term318359.getClass(), "number", 0.0);
        setIntField(term318359, term318359.getClass(), "type", 0);
        setField(term318359, term318359.getClass(), "next", null);
        setField(term318359, term318359.getClass(), "first", null);
        setField(term318359, term318359.getClass(), "last", null);
        setField(term318359, term318359.getClass(), "propListHead", null);
        setIntField(term318359, term318359.getClass(), "sourcePosition", 0);
        setField(term318359, term318359.getClass(), "jsType", null);
        setField(term318359, term318359.getClass(), "parent", null);
        setField(term318356, term318356.getClass(), "next", term318359);
        setField(term318356, term318356.getClass(), "first", null);
        setField(term318356, term318356.getClass(), "last", null);
        setField(term318356, term318356.getClass(), "propListHead", null);
        setIntField(term318356, term318356.getClass(), "sourcePosition", 0);
        setField(term318356, term318356.getClass(), "jsType", null);
        setField(term318356, term318356.getClass(), "parent", null);
        setField(term318353, term318353.getClass(), "first", term318356);
        setField(term318353, term318353.getClass(), "last", null);
        setField(term318353, term318353.getClass(), "propListHead", null);
        setIntField(term318353, term318353.getClass(), "sourcePosition", 0);
        setField(term318353, term318353.getClass(), "jsType", null);
        setField(term318353, term318353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term317755;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term317663, args);
        assertTrue(recursiveEquals(term317663, term318404));
        assertTrue(recursiveEquals(term317755, term318405));
        assertTrue(recursiveEquals(retValue, term318353));
    }

};



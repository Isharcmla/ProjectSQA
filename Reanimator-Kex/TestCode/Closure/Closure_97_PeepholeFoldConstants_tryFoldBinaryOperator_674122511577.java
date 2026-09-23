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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151348;
     Object term151440;
     Object term151933;
     Object term151934;
     Object term151910;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term151440 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term151440, term151440.getClass(), "first", term151440);
        setField(term151440, term151440.getClass(), "next", term151510);
        setIntField(term151440, term151440.getClass(), "type", 20);
        term151933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term151933, term151933.getClass(), "currentTraversal", null);
        term151934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term151934, term151934.getClass(), "number", 0.0);
        setIntField(term151934, term151934.getClass(), "type", 20);
        setIntField(term151935, term151935.getClass(), "type", 0);
        setField(term151935, term151935.getClass(), "next", null);
        setField(term151935, term151935.getClass(), "first", null);
        setField(term151935, term151935.getClass(), "last", null);
        setField(term151935, term151935.getClass(), "propListHead", null);
        setIntField(term151935, term151935.getClass(), "sourcePosition", 0);
        setField(term151935, term151935.getClass(), "jsType", null);
        setField(term151935, term151935.getClass(), "parent", null);
        setField(term151934, term151934.getClass(), "next", term151935);
        setField(term151934, term151934.getClass(), "first", term151934);
        setField(term151934, term151934.getClass(), "last", null);
        setField(term151934, term151934.getClass(), "propListHead", null);
        setIntField(term151934, term151934.getClass(), "sourcePosition", 0);
        setField(term151934, term151934.getClass(), "jsType", null);
        setField(term151934, term151934.getClass(), "parent", null);
        term151910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term151910, term151910.getClass(), "number", 0.0);
        setIntField(term151910, term151910.getClass(), "type", 20);
        setIntField(term151913, term151913.getClass(), "type", 0);
        setField(term151913, term151913.getClass(), "next", null);
        setField(term151913, term151913.getClass(), "first", null);
        setField(term151913, term151913.getClass(), "last", null);
        setField(term151913, term151913.getClass(), "propListHead", null);
        setIntField(term151913, term151913.getClass(), "sourcePosition", 0);
        setField(term151913, term151913.getClass(), "jsType", null);
        setField(term151913, term151913.getClass(), "parent", null);
        setField(term151910, term151910.getClass(), "next", term151913);
        setField(term151910, term151910.getClass(), "first", term151910);
        setField(term151910, term151910.getClass(), "last", null);
        setField(term151910, term151910.getClass(), "propListHead", null);
        setIntField(term151910, term151910.getClass(), "sourcePosition", 0);
        setField(term151910, term151910.getClass(), "jsType", null);
        setField(term151910, term151910.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term151440;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term151348, args);
        assertTrue(recursiveEquals(term151348, term151933));
        assertTrue(recursiveEquals(term151440, term151934));
        assertTrue(recursiveEquals(retValue, term151910));
    }

};



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
import java.lang.Object;

public class NodeUtil_constructorCallHasSideEffects_1705978240180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;

    public NodeUtil_constructorCallHasSideEffects_1705978240180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term499, term499.getClass(), "type", -1310015129);
        setIntField(term501, term501.getClass(), "type", -165587447);
        setIntField(term503, term503.getClass(), "type", 0);
        setField(term503, term503.getClass(), "next", null);
        setField(term503, term503.getClass(), "first", null);
        setField(term503, term503.getClass(), "last", null);
        setField(term503, term503.getClass(), "propListHead", null);
        setIntField(term503, term503.getClass(), "sourcePosition", 0);
        setField(term503, term503.getClass(), "jsType", null);
        setField(term503, term503.getClass(), "parent", null);
        setField(term501, term501.getClass(), "next", term503);
        setIntField(term506, term506.getClass(), "type", 0);
        setField(term506, term506.getClass(), "next", null);
        setField(term506, term506.getClass(), "first", null);
        setField(term506, term506.getClass(), "last", null);
        setField(term506, term506.getClass(), "propListHead", null);
        setIntField(term506, term506.getClass(), "sourcePosition", 0);
        setField(term506, term506.getClass(), "jsType", null);
        setField(term506, term506.getClass(), "parent", null);
        setField(term501, term501.getClass(), "first", term506);
        setIntField(term509, term509.getClass(), "type", 0);
        setField(term509, term509.getClass(), "next", null);
        setField(term509, term509.getClass(), "first", null);
        setField(term509, term509.getClass(), "last", null);
        setField(term509, term509.getClass(), "propListHead", null);
        setIntField(term509, term509.getClass(), "sourcePosition", 0);
        setField(term509, term509.getClass(), "jsType", null);
        setField(term509, term509.getClass(), "parent", null);
        setField(term501, term501.getClass(), "last", term509);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term499, term499.getClass(), "next", term501);
        setIntField(term513, term513.getClass(), "type", 0);
        setField(term513, term513.getClass(), "next", null);
        setField(term513, term513.getClass(), "first", null);
        setField(term513, term513.getClass(), "last", null);
        setField(term513, term513.getClass(), "propListHead", null);
        setIntField(term513, term513.getClass(), "sourcePosition", 0);
        setField(term513, term513.getClass(), "jsType", null);
        setField(term513, term513.getClass(), "parent", null);
        setField(term499, term499.getClass(), "first", term513);
        setIntField(term516, term516.getClass(), "type", 0);
        setField(term516, term516.getClass(), "next", null);
        setField(term516, term516.getClass(), "first", null);
        setField(term516, term516.getClass(), "last", null);
        setField(term516, term516.getClass(), "propListHead", null);
        setIntField(term516, term516.getClass(), "sourcePosition", 0);
        setField(term516, term516.getClass(), "jsType", null);
        setField(term516, term516.getClass(), "parent", null);
        setField(term499, term499.getClass(), "last", term516);
        setField(term499, term499.getClass(), "propListHead", null);
        setIntField(term499, term499.getClass(), "sourcePosition", 0);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term499;
        args[1] = null;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



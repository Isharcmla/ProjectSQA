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

public class NodeUtil_containsFunctionDeclaration_1851756716597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51991;
     Object term52355;

    public NodeUtil_containsFunctionDeclaration_1851756716597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51991, term51991.getClass(), "type", 1);
        setIntField(term52061, term52061.getClass(), "type", 1);
        setIntField(term52131, term52131.getClass(), "type", 0);
        setField(term52131, term52131.getClass(), "first", null);
        setField(term52131, term52131.getClass(), "next", term52201);
        setField(term52061, term52061.getClass(), "first", term52131);
        setField(term51991, term51991.getClass(), "first", term52061);
        term52355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52355, term52355.getClass(), "type", 1);
        setField(term52355, term52355.getClass(), "next", null);
        setIntField(term52356, term52356.getClass(), "type", 1);
        setField(term52356, term52356.getClass(), "next", null);
        setIntField(term52357, term52357.getClass(), "type", 0);
        setIntField(term52358, term52358.getClass(), "type", 0);
        setField(term52358, term52358.getClass(), "next", null);
        setField(term52358, term52358.getClass(), "first", null);
        setField(term52358, term52358.getClass(), "last", null);
        setField(term52358, term52358.getClass(), "propListHead", null);
        setIntField(term52358, term52358.getClass(), "sourcePosition", 0);
        setField(term52358, term52358.getClass(), "jsType", null);
        setField(term52358, term52358.getClass(), "parent", null);
        setField(term52357, term52357.getClass(), "next", term52358);
        setField(term52357, term52357.getClass(), "first", null);
        setField(term52357, term52357.getClass(), "last", null);
        setField(term52357, term52357.getClass(), "propListHead", null);
        setIntField(term52357, term52357.getClass(), "sourcePosition", 0);
        setField(term52357, term52357.getClass(), "jsType", null);
        setField(term52357, term52357.getClass(), "parent", null);
        setField(term52356, term52356.getClass(), "first", term52357);
        setField(term52356, term52356.getClass(), "last", null);
        setField(term52356, term52356.getClass(), "propListHead", null);
        setIntField(term52356, term52356.getClass(), "sourcePosition", 0);
        setField(term52356, term52356.getClass(), "jsType", null);
        setField(term52356, term52356.getClass(), "parent", null);
        setField(term52355, term52355.getClass(), "first", term52356);
        setField(term52355, term52355.getClass(), "last", null);
        setField(term52355, term52355.getClass(), "propListHead", null);
        setIntField(term52355, term52355.getClass(), "sourcePosition", 0);
        setField(term52355, term52355.getClass(), "jsType", null);
        setField(term52355, term52355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51991;
        callMethod(klass, "containsFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term51991, term52355));
    }

};



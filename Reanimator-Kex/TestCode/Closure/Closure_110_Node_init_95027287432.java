package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_init_95027287432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30358;
     Object term30565;
     Object term30567;

    public Node_init_95027287432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30358, term30358.getClass(), "parent", null);
        setField(term30358, term30358.getClass(), "next", null);
        term30565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30565, term30565.getClass(), "type", 0);
        setField(term30565, term30565.getClass(), "next", null);
        setIntField(term30566, term30566.getClass(), "type", 0);
        setField(term30566, term30566.getClass(), "next", null);
        setField(term30566, term30566.getClass(), "first", null);
        setField(term30566, term30566.getClass(), "last", null);
        setField(term30566, term30566.getClass(), "propListHead", null);
        setIntField(term30566, term30566.getClass(), "sourcePosition", 0);
        setField(term30566, term30566.getClass(), "jsType", null);
        setField(term30566, term30566.getClass(), "parent", term30565);
        setField(term30565, term30565.getClass(), "first", term30566);
        setField(term30565, term30565.getClass(), "last", term30566);
        setField(term30565, term30565.getClass(), "propListHead", null);
        setIntField(term30565, term30565.getClass(), "sourcePosition", 0);
        setField(term30565, term30565.getClass(), "jsType", null);
        setField(term30565, term30565.getClass(), "parent", null);
        term30567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30567, term30567.getClass(), "type", 0);
        setField(term30567, term30567.getClass(), "next", null);
        setField(term30567, term30567.getClass(), "first", null);
        setField(term30567, term30567.getClass(), "last", null);
        setField(term30567, term30567.getClass(), "propListHead", null);
        setIntField(term30567, term30567.getClass(), "sourcePosition", 0);
        setField(term30567, term30567.getClass(), "jsType", null);
        setIntField(term30568, term30568.getClass(), "type", 0);
        setField(term30568, term30568.getClass(), "next", null);
        setField(term30568, term30568.getClass(), "first", term30567);
        setField(term30568, term30568.getClass(), "last", term30567);
        setField(term30568, term30568.getClass(), "propListHead", null);
        setIntField(term30568, term30568.getClass(), "sourcePosition", 0);
        setField(term30568, term30568.getClass(), "jsType", null);
        setField(term30568, term30568.getClass(), "parent", null);
        setField(term30567, term30567.getClass(), "parent", term30568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = term30358;
        args[2] = 0;
        args[3] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30565));
        assertTrue(recursiveEquals(term30358, term30567));
    }

};



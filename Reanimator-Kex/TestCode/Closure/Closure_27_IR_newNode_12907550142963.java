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

public class IR_newNode_12907550142963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563262;
     Object term563171;
     Object term563341;
     Object term563343;
     Object term563332;

    public IR_newNode_12907550142963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term563262, term563262.getClass(), "parent", null);
        setField(term563262, term563262.getClass(), "next", null);
        term563171 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term563341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term563341, term563341.getClass(), "type", 0);
        setField(term563341, term563341.getClass(), "next", null);
        setField(term563341, term563341.getClass(), "first", null);
        setField(term563341, term563341.getClass(), "last", null);
        setField(term563341, term563341.getClass(), "propListHead", null);
        setIntField(term563341, term563341.getClass(), "sourcePosition", 0);
        setField(term563341, term563341.getClass(), "jsType", null);
        setIntField(term563342, term563342.getClass(), "type", 30);
        setField(term563342, term563342.getClass(), "next", null);
        setField(term563342, term563342.getClass(), "first", term563341);
        setField(term563342, term563342.getClass(), "last", term563341);
        setField(term563342, term563342.getClass(), "propListHead", null);
        setIntField(term563342, term563342.getClass(), "sourcePosition", -1);
        setField(term563342, term563342.getClass(), "jsType", null);
        setField(term563342, term563342.getClass(), "parent", null);
        setField(term563341, term563341.getClass(), "parent", term563342);
        term563343 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term563332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term563332, term563332.getClass(), "type", 30);
        setField(term563332, term563332.getClass(), "next", null);
        setIntField(term563334, term563334.getClass(), "type", 0);
        setField(term563334, term563334.getClass(), "next", null);
        setField(term563334, term563334.getClass(), "first", null);
        setField(term563334, term563334.getClass(), "last", null);
        setField(term563334, term563334.getClass(), "propListHead", null);
        setIntField(term563334, term563334.getClass(), "sourcePosition", 0);
        setField(term563334, term563334.getClass(), "jsType", null);
        setField(term563334, term563334.getClass(), "parent", term563332);
        setField(term563332, term563332.getClass(), "first", term563334);
        setField(term563332, term563332.getClass(), "last", term563334);
        setField(term563332, term563332.getClass(), "propListHead", null);
        setIntField(term563332, term563332.getClass(), "sourcePosition", -1);
        setField(term563332, term563332.getClass(), "jsType", null);
        setField(term563332, term563332.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term563262;
        args[1] = term563171;
        Object retValue = callMethod(klass, "newNode", argTypes, null, args);
        assertTrue(recursiveEquals(term563262, term563341));
        assertTrue(recursiveEquals(term563171, term563343));
        assertTrue(recursiveEquals(retValue, term563332));
    }

};



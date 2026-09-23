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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743731;
     Object term743823;
     Object term744061;
     Object term744062;
     Object term744014;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term743823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term743915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744007 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term744007, term744007.getClass(), "type", 16);
        setField(term743915, term743915.getClass(), "next", term744007);
        setIntField(term743915, term743915.getClass(), "type", 42);
        setField(term743823, term743823.getClass(), "first", term743915);
        setIntField(term743823, term743823.getClass(), "type", 16);
        term744061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term744061, term744061.getClass(), "currentTraversal", null);
        term744062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term744062, term744062.getClass(), "str", null);
        setIntField(term744062, term744062.getClass(), "type", 16);
        setField(term744062, term744062.getClass(), "next", null);
        setField(term744063, term744063.getClass(), "str", null);
        setIntField(term744063, term744063.getClass(), "type", 42);
        setField(term744064, term744064.getClass(), "str", null);
        setIntField(term744064, term744064.getClass(), "type", 16);
        setField(term744064, term744064.getClass(), "next", null);
        setField(term744064, term744064.getClass(), "first", null);
        setField(term744064, term744064.getClass(), "last", null);
        setField(term744064, term744064.getClass(), "propListHead", null);
        setIntField(term744064, term744064.getClass(), "sourcePosition", 0);
        setField(term744064, term744064.getClass(), "jsType", null);
        setField(term744064, term744064.getClass(), "parent", null);
        setField(term744063, term744063.getClass(), "next", term744064);
        setField(term744063, term744063.getClass(), "first", null);
        setField(term744063, term744063.getClass(), "last", null);
        setField(term744063, term744063.getClass(), "propListHead", null);
        setIntField(term744063, term744063.getClass(), "sourcePosition", 0);
        setField(term744063, term744063.getClass(), "jsType", null);
        setField(term744063, term744063.getClass(), "parent", null);
        setField(term744062, term744062.getClass(), "first", term744063);
        setField(term744062, term744062.getClass(), "last", null);
        setField(term744062, term744062.getClass(), "propListHead", null);
        setIntField(term744062, term744062.getClass(), "sourcePosition", 0);
        setField(term744062, term744062.getClass(), "jsType", null);
        setField(term744062, term744062.getClass(), "parent", null);
        term744014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term744014, term744014.getClass(), "str", null);
        setIntField(term744014, term744014.getClass(), "type", 16);
        setField(term744014, term744014.getClass(), "next", null);
        setField(term744016, term744016.getClass(), "str", null);
        setIntField(term744016, term744016.getClass(), "type", 42);
        setField(term744018, term744018.getClass(), "str", null);
        setIntField(term744018, term744018.getClass(), "type", 16);
        setField(term744018, term744018.getClass(), "next", null);
        setField(term744018, term744018.getClass(), "first", null);
        setField(term744018, term744018.getClass(), "last", null);
        setField(term744018, term744018.getClass(), "propListHead", null);
        setIntField(term744018, term744018.getClass(), "sourcePosition", 0);
        setField(term744018, term744018.getClass(), "jsType", null);
        setField(term744018, term744018.getClass(), "parent", null);
        setField(term744016, term744016.getClass(), "next", term744018);
        setField(term744016, term744016.getClass(), "first", null);
        setField(term744016, term744016.getClass(), "last", null);
        setField(term744016, term744016.getClass(), "propListHead", null);
        setIntField(term744016, term744016.getClass(), "sourcePosition", 0);
        setField(term744016, term744016.getClass(), "jsType", null);
        setField(term744016, term744016.getClass(), "parent", null);
        setField(term744014, term744014.getClass(), "first", term744016);
        setField(term744014, term744014.getClass(), "last", null);
        setField(term744014, term744014.getClass(), "propListHead", null);
        setIntField(term744014, term744014.getClass(), "sourcePosition", 0);
        setField(term744014, term744014.getClass(), "jsType", null);
        setField(term744014, term744014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term743823;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term743731, args);
        assertTrue(recursiveEquals(term743731, term744061));
        assertTrue(recursiveEquals(term743823, term744062));
        assertTrue(recursiveEquals(retValue, term744014));
    }

};



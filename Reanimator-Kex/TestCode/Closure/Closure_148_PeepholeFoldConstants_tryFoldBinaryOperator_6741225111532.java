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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383475;
     Object term383567;
     Object term384075;
     Object term384076;
     Object term384040;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term383567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term383659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term383751 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term383659, term383659.getClass(), "next", term383751);
        setIntField(term383659, term383659.getClass(), "type", 39);
        setField(term383567, term383567.getClass(), "first", term383659);
        setIntField(term383567, term383567.getClass(), "type", 9);
        term384075 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term384075, term384075.getClass(), "currentTraversal", null);
        term384076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term384077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term384078 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term384076, term384076.getClass(), "str", null);
        setIntField(term384076, term384076.getClass(), "type", 9);
        setField(term384076, term384076.getClass(), "next", null);
        setField(term384077, term384077.getClass(), "str", null);
        setIntField(term384077, term384077.getClass(), "type", 39);
        setField(term384078, term384078.getClass(), "str", null);
        setIntField(term384078, term384078.getClass(), "type", 0);
        setField(term384078, term384078.getClass(), "next", null);
        setField(term384078, term384078.getClass(), "first", null);
        setField(term384078, term384078.getClass(), "last", null);
        setField(term384078, term384078.getClass(), "propListHead", null);
        setIntField(term384078, term384078.getClass(), "sourcePosition", 0);
        setField(term384078, term384078.getClass(), "jsType", null);
        setField(term384078, term384078.getClass(), "parent", null);
        setField(term384077, term384077.getClass(), "next", term384078);
        setField(term384077, term384077.getClass(), "first", null);
        setField(term384077, term384077.getClass(), "last", null);
        setField(term384077, term384077.getClass(), "propListHead", null);
        setIntField(term384077, term384077.getClass(), "sourcePosition", 0);
        setField(term384077, term384077.getClass(), "jsType", null);
        setField(term384077, term384077.getClass(), "parent", null);
        setField(term384076, term384076.getClass(), "first", term384077);
        setField(term384076, term384076.getClass(), "last", null);
        setField(term384076, term384076.getClass(), "propListHead", null);
        setIntField(term384076, term384076.getClass(), "sourcePosition", 0);
        setField(term384076, term384076.getClass(), "jsType", null);
        setField(term384076, term384076.getClass(), "parent", null);
        term384040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term384042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term384044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term384040, term384040.getClass(), "str", null);
        setIntField(term384040, term384040.getClass(), "type", 9);
        setField(term384040, term384040.getClass(), "next", null);
        setField(term384042, term384042.getClass(), "str", null);
        setIntField(term384042, term384042.getClass(), "type", 39);
        setField(term384044, term384044.getClass(), "str", null);
        setIntField(term384044, term384044.getClass(), "type", 0);
        setField(term384044, term384044.getClass(), "next", null);
        setField(term384044, term384044.getClass(), "first", null);
        setField(term384044, term384044.getClass(), "last", null);
        setField(term384044, term384044.getClass(), "propListHead", null);
        setIntField(term384044, term384044.getClass(), "sourcePosition", 0);
        setField(term384044, term384044.getClass(), "jsType", null);
        setField(term384044, term384044.getClass(), "parent", null);
        setField(term384042, term384042.getClass(), "next", term384044);
        setField(term384042, term384042.getClass(), "first", null);
        setField(term384042, term384042.getClass(), "last", null);
        setField(term384042, term384042.getClass(), "propListHead", null);
        setIntField(term384042, term384042.getClass(), "sourcePosition", 0);
        setField(term384042, term384042.getClass(), "jsType", null);
        setField(term384042, term384042.getClass(), "parent", null);
        setField(term384040, term384040.getClass(), "first", term384042);
        setField(term384040, term384040.getClass(), "last", null);
        setField(term384040, term384040.getClass(), "propListHead", null);
        setIntField(term384040, term384040.getClass(), "sourcePosition", 0);
        setField(term384040, term384040.getClass(), "jsType", null);
        setField(term384040, term384040.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term383567;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term383475, args);
        assertTrue(recursiveEquals(term383475, term384075));
        assertTrue(recursiveEquals(term383567, term384076));
        assertTrue(recursiveEquals(retValue, term384040));
    }

};



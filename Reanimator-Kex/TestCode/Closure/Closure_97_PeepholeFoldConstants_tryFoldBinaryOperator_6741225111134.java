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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349733;
     Object term349825;
     Object term350074;
     Object term350075;
     Object term350017;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349733 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term349825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term349917 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term349917, term349917.getClass(), "next", term350009);
        setIntField(term349917, term349917.getClass(), "type", 0);
        setField(term349825, term349825.getClass(), "first", term349917);
        setIntField(term349825, term349825.getClass(), "type", 101);
        setField(term349825, term349825.getClass(), "parent", null);
        term350074 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term350074, term350074.getClass(), "currentTraversal", null);
        term350075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350076 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term350075, term350075.getClass(), "number", 0.0);
        setIntField(term350075, term350075.getClass(), "type", 101);
        setField(term350075, term350075.getClass(), "next", null);
        setDoubleField(term350076, term350076.getClass(), "number", 0.0);
        setIntField(term350076, term350076.getClass(), "type", 0);
        setField(term350077, term350077.getClass(), "str", null);
        setIntField(term350077, term350077.getClass(), "type", 0);
        setField(term350077, term350077.getClass(), "next", null);
        setField(term350077, term350077.getClass(), "first", null);
        setField(term350077, term350077.getClass(), "last", null);
        setField(term350077, term350077.getClass(), "propListHead", null);
        setIntField(term350077, term350077.getClass(), "sourcePosition", 0);
        setField(term350077, term350077.getClass(), "jsType", null);
        setField(term350077, term350077.getClass(), "parent", null);
        setField(term350076, term350076.getClass(), "next", term350077);
        setField(term350076, term350076.getClass(), "first", null);
        setField(term350076, term350076.getClass(), "last", null);
        setField(term350076, term350076.getClass(), "propListHead", null);
        setIntField(term350076, term350076.getClass(), "sourcePosition", 0);
        setField(term350076, term350076.getClass(), "jsType", null);
        setField(term350076, term350076.getClass(), "parent", null);
        setField(term350075, term350075.getClass(), "first", term350076);
        setField(term350075, term350075.getClass(), "last", null);
        setField(term350075, term350075.getClass(), "propListHead", null);
        setIntField(term350075, term350075.getClass(), "sourcePosition", 0);
        setField(term350075, term350075.getClass(), "jsType", null);
        setField(term350075, term350075.getClass(), "parent", null);
        term350017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term350023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term350017, term350017.getClass(), "number", 0.0);
        setIntField(term350017, term350017.getClass(), "type", 101);
        setField(term350017, term350017.getClass(), "next", null);
        setDoubleField(term350020, term350020.getClass(), "number", 0.0);
        setIntField(term350020, term350020.getClass(), "type", 0);
        setField(term350023, term350023.getClass(), "str", null);
        setIntField(term350023, term350023.getClass(), "type", 0);
        setField(term350023, term350023.getClass(), "next", null);
        setField(term350023, term350023.getClass(), "first", null);
        setField(term350023, term350023.getClass(), "last", null);
        setField(term350023, term350023.getClass(), "propListHead", null);
        setIntField(term350023, term350023.getClass(), "sourcePosition", 0);
        setField(term350023, term350023.getClass(), "jsType", null);
        setField(term350023, term350023.getClass(), "parent", null);
        setField(term350020, term350020.getClass(), "next", term350023);
        setField(term350020, term350020.getClass(), "first", null);
        setField(term350020, term350020.getClass(), "last", null);
        setField(term350020, term350020.getClass(), "propListHead", null);
        setIntField(term350020, term350020.getClass(), "sourcePosition", 0);
        setField(term350020, term350020.getClass(), "jsType", null);
        setField(term350020, term350020.getClass(), "parent", null);
        setField(term350017, term350017.getClass(), "first", term350020);
        setField(term350017, term350017.getClass(), "last", null);
        setField(term350017, term350017.getClass(), "propListHead", null);
        setIntField(term350017, term350017.getClass(), "sourcePosition", 0);
        setField(term350017, term350017.getClass(), "jsType", null);
        setField(term350017, term350017.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term349825;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term349733, args);
        assertTrue(recursiveEquals(term349733, term350074));
        assertTrue(recursiveEquals(term349825, term350075));
        assertTrue(recursiveEquals(retValue, term350017));
    }

};



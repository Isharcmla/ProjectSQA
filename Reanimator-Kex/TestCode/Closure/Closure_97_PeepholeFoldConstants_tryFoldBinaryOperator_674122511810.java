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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232652;
     Object term232744;
     Object term233069;
     Object term233070;
     Object term233027;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232652 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term232744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term232836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term232928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term232836, term232836.getClass(), "next", term232928);
        setIntField(term232836, term232836.getClass(), "type", 39);
        setField(term232744, term232744.getClass(), "first", term232836);
        setIntField(term232744, term232744.getClass(), "type", 9);
        term233069 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term233069, term233069.getClass(), "currentTraversal", null);
        term233070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term233070, term233070.getClass(), "number", 0.0);
        setIntField(term233070, term233070.getClass(), "type", 9);
        setField(term233070, term233070.getClass(), "next", null);
        setDoubleField(term233071, term233071.getClass(), "number", 0.0);
        setIntField(term233071, term233071.getClass(), "type", 39);
        setDoubleField(term233072, term233072.getClass(), "number", 0.0);
        setIntField(term233072, term233072.getClass(), "type", 0);
        setField(term233072, term233072.getClass(), "next", null);
        setField(term233072, term233072.getClass(), "first", null);
        setField(term233072, term233072.getClass(), "last", null);
        setField(term233072, term233072.getClass(), "propListHead", null);
        setIntField(term233072, term233072.getClass(), "sourcePosition", 0);
        setField(term233072, term233072.getClass(), "jsType", null);
        setField(term233072, term233072.getClass(), "parent", null);
        setField(term233071, term233071.getClass(), "next", term233072);
        setField(term233071, term233071.getClass(), "first", null);
        setField(term233071, term233071.getClass(), "last", null);
        setField(term233071, term233071.getClass(), "propListHead", null);
        setIntField(term233071, term233071.getClass(), "sourcePosition", 0);
        setField(term233071, term233071.getClass(), "jsType", null);
        setField(term233071, term233071.getClass(), "parent", null);
        setField(term233070, term233070.getClass(), "first", term233071);
        setField(term233070, term233070.getClass(), "last", null);
        setField(term233070, term233070.getClass(), "propListHead", null);
        setIntField(term233070, term233070.getClass(), "sourcePosition", 0);
        setField(term233070, term233070.getClass(), "jsType", null);
        setField(term233070, term233070.getClass(), "parent", null);
        term233027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term233027, term233027.getClass(), "number", 0.0);
        setIntField(term233027, term233027.getClass(), "type", 9);
        setField(term233027, term233027.getClass(), "next", null);
        setDoubleField(term233030, term233030.getClass(), "number", 0.0);
        setIntField(term233030, term233030.getClass(), "type", 39);
        setDoubleField(term233033, term233033.getClass(), "number", 0.0);
        setIntField(term233033, term233033.getClass(), "type", 0);
        setField(term233033, term233033.getClass(), "next", null);
        setField(term233033, term233033.getClass(), "first", null);
        setField(term233033, term233033.getClass(), "last", null);
        setField(term233033, term233033.getClass(), "propListHead", null);
        setIntField(term233033, term233033.getClass(), "sourcePosition", 0);
        setField(term233033, term233033.getClass(), "jsType", null);
        setField(term233033, term233033.getClass(), "parent", null);
        setField(term233030, term233030.getClass(), "next", term233033);
        setField(term233030, term233030.getClass(), "first", null);
        setField(term233030, term233030.getClass(), "last", null);
        setField(term233030, term233030.getClass(), "propListHead", null);
        setIntField(term233030, term233030.getClass(), "sourcePosition", 0);
        setField(term233030, term233030.getClass(), "jsType", null);
        setField(term233030, term233030.getClass(), "parent", null);
        setField(term233027, term233027.getClass(), "first", term233030);
        setField(term233027, term233027.getClass(), "last", null);
        setField(term233027, term233027.getClass(), "propListHead", null);
        setIntField(term233027, term233027.getClass(), "sourcePosition", 0);
        setField(term233027, term233027.getClass(), "jsType", null);
        setField(term233027, term233027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term232744;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term232652, args);
        assertTrue(recursiveEquals(term232652, term233069));
        assertTrue(recursiveEquals(term232744, term233070));
        assertTrue(recursiveEquals(retValue, term233027));
    }

};



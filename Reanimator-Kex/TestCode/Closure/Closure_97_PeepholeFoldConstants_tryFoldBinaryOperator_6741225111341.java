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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441898;
     Object term441990;
     Object term442657;
     Object term442658;
     Object term442616;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term441990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term441990, term441990.getClass(), "first", term441990);
        setField(term441990, term441990.getClass(), "next", term442082);
        setIntField(term441990, term441990.getClass(), "type", 16);
        term442657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term442657, term442657.getClass(), "currentTraversal", null);
        term442658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term442658, term442658.getClass(), "number", 0.0);
        setIntField(term442658, term442658.getClass(), "type", 16);
        setDoubleField(term442659, term442659.getClass(), "number", 0.0);
        setIntField(term442659, term442659.getClass(), "type", 0);
        setField(term442659, term442659.getClass(), "next", null);
        setField(term442659, term442659.getClass(), "first", null);
        setField(term442659, term442659.getClass(), "last", null);
        setField(term442659, term442659.getClass(), "propListHead", null);
        setIntField(term442659, term442659.getClass(), "sourcePosition", 0);
        setField(term442659, term442659.getClass(), "jsType", null);
        setField(term442659, term442659.getClass(), "parent", null);
        setField(term442658, term442658.getClass(), "next", term442659);
        setField(term442658, term442658.getClass(), "first", term442658);
        setField(term442658, term442658.getClass(), "last", null);
        setField(term442658, term442658.getClass(), "propListHead", null);
        setIntField(term442658, term442658.getClass(), "sourcePosition", 0);
        setField(term442658, term442658.getClass(), "jsType", null);
        setField(term442658, term442658.getClass(), "parent", null);
        term442616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term442619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term442616, term442616.getClass(), "number", 0.0);
        setIntField(term442616, term442616.getClass(), "type", 16);
        setDoubleField(term442619, term442619.getClass(), "number", 0.0);
        setIntField(term442619, term442619.getClass(), "type", 0);
        setField(term442619, term442619.getClass(), "next", null);
        setField(term442619, term442619.getClass(), "first", null);
        setField(term442619, term442619.getClass(), "last", null);
        setField(term442619, term442619.getClass(), "propListHead", null);
        setIntField(term442619, term442619.getClass(), "sourcePosition", 0);
        setField(term442619, term442619.getClass(), "jsType", null);
        setField(term442619, term442619.getClass(), "parent", null);
        setField(term442616, term442616.getClass(), "next", term442619);
        setField(term442616, term442616.getClass(), "first", term442616);
        setField(term442616, term442616.getClass(), "last", null);
        setField(term442616, term442616.getClass(), "propListHead", null);
        setIntField(term442616, term442616.getClass(), "sourcePosition", 0);
        setField(term442616, term442616.getClass(), "jsType", null);
        setField(term442616, term442616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term441990;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term441898, args);
        assertTrue(recursiveEquals(term441898, term442657));
        assertTrue(recursiveEquals(term441990, term442658));
        assertTrue(recursiveEquals(retValue, term442616));
    }

};



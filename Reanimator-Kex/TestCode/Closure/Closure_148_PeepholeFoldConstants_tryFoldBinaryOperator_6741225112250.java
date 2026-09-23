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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617438;
     Object term617530;
     Object term617781;
     Object term617782;
     Object term617728;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term617530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term617714, term617714.getClass(), "type", 106);
        setField(term617622, term617622.getClass(), "next", term617714);
        setIntField(term617622, term617622.getClass(), "type", 42);
        setField(term617530, term617530.getClass(), "first", term617622);
        setIntField(term617530, term617530.getClass(), "type", 14);
        term617781 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term617781, term617781.getClass(), "currentTraversal", null);
        term617782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term617782, term617782.getClass(), "number", 0.0);
        setIntField(term617782, term617782.getClass(), "type", 14);
        setField(term617782, term617782.getClass(), "next", null);
        setDoubleField(term617783, term617783.getClass(), "number", 0.0);
        setIntField(term617783, term617783.getClass(), "type", 42);
        setField(term617784, term617784.getClass(), "str", null);
        setIntField(term617784, term617784.getClass(), "type", 106);
        setField(term617784, term617784.getClass(), "next", null);
        setField(term617784, term617784.getClass(), "first", null);
        setField(term617784, term617784.getClass(), "last", null);
        setField(term617784, term617784.getClass(), "propListHead", null);
        setIntField(term617784, term617784.getClass(), "sourcePosition", 0);
        setField(term617784, term617784.getClass(), "jsType", null);
        setField(term617784, term617784.getClass(), "parent", null);
        setField(term617783, term617783.getClass(), "next", term617784);
        setField(term617783, term617783.getClass(), "first", null);
        setField(term617783, term617783.getClass(), "last", null);
        setField(term617783, term617783.getClass(), "propListHead", null);
        setIntField(term617783, term617783.getClass(), "sourcePosition", 0);
        setField(term617783, term617783.getClass(), "jsType", null);
        setField(term617783, term617783.getClass(), "parent", null);
        setField(term617782, term617782.getClass(), "first", term617783);
        setField(term617782, term617782.getClass(), "last", null);
        setField(term617782, term617782.getClass(), "propListHead", null);
        setIntField(term617782, term617782.getClass(), "sourcePosition", 0);
        setField(term617782, term617782.getClass(), "jsType", null);
        setField(term617782, term617782.getClass(), "parent", null);
        term617728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term617734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term617728, term617728.getClass(), "number", 0.0);
        setIntField(term617728, term617728.getClass(), "type", 14);
        setField(term617728, term617728.getClass(), "next", null);
        setDoubleField(term617731, term617731.getClass(), "number", 0.0);
        setIntField(term617731, term617731.getClass(), "type", 42);
        setField(term617734, term617734.getClass(), "str", null);
        setIntField(term617734, term617734.getClass(), "type", 106);
        setField(term617734, term617734.getClass(), "next", null);
        setField(term617734, term617734.getClass(), "first", null);
        setField(term617734, term617734.getClass(), "last", null);
        setField(term617734, term617734.getClass(), "propListHead", null);
        setIntField(term617734, term617734.getClass(), "sourcePosition", 0);
        setField(term617734, term617734.getClass(), "jsType", null);
        setField(term617734, term617734.getClass(), "parent", null);
        setField(term617731, term617731.getClass(), "next", term617734);
        setField(term617731, term617731.getClass(), "first", null);
        setField(term617731, term617731.getClass(), "last", null);
        setField(term617731, term617731.getClass(), "propListHead", null);
        setIntField(term617731, term617731.getClass(), "sourcePosition", 0);
        setField(term617731, term617731.getClass(), "jsType", null);
        setField(term617731, term617731.getClass(), "parent", null);
        setField(term617728, term617728.getClass(), "first", term617731);
        setField(term617728, term617728.getClass(), "last", null);
        setField(term617728, term617728.getClass(), "propListHead", null);
        setIntField(term617728, term617728.getClass(), "sourcePosition", 0);
        setField(term617728, term617728.getClass(), "jsType", null);
        setField(term617728, term617728.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term617530;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term617438, args);
        assertTrue(recursiveEquals(term617438, term617781));
        assertTrue(recursiveEquals(term617530, term617782));
        assertTrue(recursiveEquals(retValue, term617728));
    }

};



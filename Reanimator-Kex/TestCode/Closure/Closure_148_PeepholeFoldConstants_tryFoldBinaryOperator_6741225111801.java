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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469380;
     Object term469472;
     Object term470173;
     Object term470174;
     Object term470113;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469380 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term469472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term469564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term469656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term469564, term469564.getClass(), "next", term469656);
        setIntField(term469564, term469564.getClass(), "type", 0);
        setField(term469472, term469472.getClass(), "first", term469564);
        setIntField(term469472, term469472.getClass(), "type", 101);
        setField(term469472, term469472.getClass(), "parent", null);
        term470173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term470173, term470173.getClass(), "currentTraversal", null);
        term470174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term470174, term470174.getClass(), "number", 0.0);
        setIntField(term470174, term470174.getClass(), "type", 101);
        setField(term470174, term470174.getClass(), "next", null);
        setDoubleField(term470175, term470175.getClass(), "number", 0.0);
        setIntField(term470175, term470175.getClass(), "type", 0);
        setDoubleField(term470176, term470176.getClass(), "number", 0.0);
        setIntField(term470176, term470176.getClass(), "type", 0);
        setField(term470176, term470176.getClass(), "next", null);
        setField(term470176, term470176.getClass(), "first", null);
        setField(term470176, term470176.getClass(), "last", null);
        setField(term470176, term470176.getClass(), "propListHead", null);
        setIntField(term470176, term470176.getClass(), "sourcePosition", 0);
        setField(term470176, term470176.getClass(), "jsType", null);
        setField(term470176, term470176.getClass(), "parent", null);
        setField(term470175, term470175.getClass(), "next", term470176);
        setField(term470175, term470175.getClass(), "first", null);
        setField(term470175, term470175.getClass(), "last", null);
        setField(term470175, term470175.getClass(), "propListHead", null);
        setIntField(term470175, term470175.getClass(), "sourcePosition", 0);
        setField(term470175, term470175.getClass(), "jsType", null);
        setField(term470175, term470175.getClass(), "parent", null);
        setField(term470174, term470174.getClass(), "first", term470175);
        setField(term470174, term470174.getClass(), "last", null);
        setField(term470174, term470174.getClass(), "propListHead", null);
        setIntField(term470174, term470174.getClass(), "sourcePosition", 0);
        setField(term470174, term470174.getClass(), "jsType", null);
        setField(term470174, term470174.getClass(), "parent", null);
        term470113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term470113, term470113.getClass(), "number", 0.0);
        setIntField(term470113, term470113.getClass(), "type", 101);
        setField(term470113, term470113.getClass(), "next", null);
        setDoubleField(term470116, term470116.getClass(), "number", 0.0);
        setIntField(term470116, term470116.getClass(), "type", 0);
        setDoubleField(term470119, term470119.getClass(), "number", 0.0);
        setIntField(term470119, term470119.getClass(), "type", 0);
        setField(term470119, term470119.getClass(), "next", null);
        setField(term470119, term470119.getClass(), "first", null);
        setField(term470119, term470119.getClass(), "last", null);
        setField(term470119, term470119.getClass(), "propListHead", null);
        setIntField(term470119, term470119.getClass(), "sourcePosition", 0);
        setField(term470119, term470119.getClass(), "jsType", null);
        setField(term470119, term470119.getClass(), "parent", null);
        setField(term470116, term470116.getClass(), "next", term470119);
        setField(term470116, term470116.getClass(), "first", null);
        setField(term470116, term470116.getClass(), "last", null);
        setField(term470116, term470116.getClass(), "propListHead", null);
        setIntField(term470116, term470116.getClass(), "sourcePosition", 0);
        setField(term470116, term470116.getClass(), "jsType", null);
        setField(term470116, term470116.getClass(), "parent", null);
        setField(term470113, term470113.getClass(), "first", term470116);
        setField(term470113, term470113.getClass(), "last", null);
        setField(term470113, term470113.getClass(), "propListHead", null);
        setIntField(term470113, term470113.getClass(), "sourcePosition", 0);
        setField(term470113, term470113.getClass(), "jsType", null);
        setField(term470113, term470113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term469472;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term469380, args);
        assertTrue(recursiveEquals(term469380, term470173));
        assertTrue(recursiveEquals(term469472, term470174));
        assertTrue(recursiveEquals(retValue, term470113));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174837;
     Object term174929;
     Object term175173;
     Object term175174;
     Object term175120;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174837 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term174929 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term175021, term175021.getClass(), "next", term175113);
        setIntField(term175021, term175021.getClass(), "type", 0);
        setField(term174929, term174929.getClass(), "first", term175021);
        setIntField(term174929, term174929.getClass(), "type", 100);
        setField(term174929, term174929.getClass(), "parent", null);
        term175173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term175173, term175173.getClass(), "currentTraversal", null);
        term175174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175176 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term175174, term175174.getClass(), "str", null);
        setIntField(term175174, term175174.getClass(), "type", 100);
        setField(term175174, term175174.getClass(), "next", null);
        setField(term175175, term175175.getClass(), "str", null);
        setIntField(term175175, term175175.getClass(), "type", 0);
        setField(term175176, term175176.getClass(), "str", null);
        setIntField(term175176, term175176.getClass(), "type", 0);
        setField(term175176, term175176.getClass(), "next", null);
        setField(term175176, term175176.getClass(), "first", null);
        setField(term175176, term175176.getClass(), "last", null);
        setField(term175176, term175176.getClass(), "propListHead", null);
        setIntField(term175176, term175176.getClass(), "sourcePosition", 0);
        setField(term175176, term175176.getClass(), "jsType", null);
        setField(term175176, term175176.getClass(), "parent", null);
        setField(term175175, term175175.getClass(), "next", term175176);
        setField(term175175, term175175.getClass(), "first", null);
        setField(term175175, term175175.getClass(), "last", null);
        setField(term175175, term175175.getClass(), "propListHead", null);
        setIntField(term175175, term175175.getClass(), "sourcePosition", 0);
        setField(term175175, term175175.getClass(), "jsType", null);
        setField(term175175, term175175.getClass(), "parent", null);
        setField(term175174, term175174.getClass(), "first", term175175);
        setField(term175174, term175174.getClass(), "last", null);
        setField(term175174, term175174.getClass(), "propListHead", null);
        setIntField(term175174, term175174.getClass(), "sourcePosition", 0);
        setField(term175174, term175174.getClass(), "jsType", null);
        setField(term175174, term175174.getClass(), "parent", null);
        term175120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term175120, term175120.getClass(), "str", null);
        setIntField(term175120, term175120.getClass(), "type", 100);
        setField(term175120, term175120.getClass(), "next", null);
        setField(term175122, term175122.getClass(), "str", null);
        setIntField(term175122, term175122.getClass(), "type", 0);
        setField(term175124, term175124.getClass(), "str", null);
        setIntField(term175124, term175124.getClass(), "type", 0);
        setField(term175124, term175124.getClass(), "next", null);
        setField(term175124, term175124.getClass(), "first", null);
        setField(term175124, term175124.getClass(), "last", null);
        setField(term175124, term175124.getClass(), "propListHead", null);
        setIntField(term175124, term175124.getClass(), "sourcePosition", 0);
        setField(term175124, term175124.getClass(), "jsType", null);
        setField(term175124, term175124.getClass(), "parent", null);
        setField(term175122, term175122.getClass(), "next", term175124);
        setField(term175122, term175122.getClass(), "first", null);
        setField(term175122, term175122.getClass(), "last", null);
        setField(term175122, term175122.getClass(), "propListHead", null);
        setIntField(term175122, term175122.getClass(), "sourcePosition", 0);
        setField(term175122, term175122.getClass(), "jsType", null);
        setField(term175122, term175122.getClass(), "parent", null);
        setField(term175120, term175120.getClass(), "first", term175122);
        setField(term175120, term175120.getClass(), "last", null);
        setField(term175120, term175120.getClass(), "propListHead", null);
        setIntField(term175120, term175120.getClass(), "sourcePosition", 0);
        setField(term175120, term175120.getClass(), "jsType", null);
        setField(term175120, term175120.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term174929;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term174837, args);
        assertTrue(recursiveEquals(term174837, term175173));
        assertTrue(recursiveEquals(term174929, term175174));
        assertTrue(recursiveEquals(retValue, term175120));
    }

};



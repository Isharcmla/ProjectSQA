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

public class PeepholeFoldConstants_tryFoldComparison_848443179140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26922;
     Object term27014;
     Object term27106;
     Object term27198;
     Object term27495;
     Object term27496;
     Object term27497;
     Object term27498;
     Object term27477;

    public PeepholeFoldConstants_tryFoldComparison_848443179140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26922 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term27014, term27014.getClass(), "type", 16);
        term27106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term27106, term27106.getClass(), "type", 16);
        term27198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term27495 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27495, term27495.getClass(), "currentTraversal", null);
        term27496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27496, term27496.getClass(), "str", null);
        setIntField(term27496, term27496.getClass(), "type", 16);
        setField(term27496, term27496.getClass(), "next", null);
        setField(term27496, term27496.getClass(), "first", null);
        setField(term27496, term27496.getClass(), "last", null);
        setField(term27496, term27496.getClass(), "propListHead", null);
        setIntField(term27496, term27496.getClass(), "sourcePosition", 0);
        setField(term27496, term27496.getClass(), "jsType", null);
        setField(term27496, term27496.getClass(), "parent", null);
        term27497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27497, term27497.getClass(), "str", null);
        setIntField(term27497, term27497.getClass(), "type", 16);
        setField(term27497, term27497.getClass(), "next", null);
        setField(term27497, term27497.getClass(), "first", null);
        setField(term27497, term27497.getClass(), "last", null);
        setField(term27497, term27497.getClass(), "propListHead", null);
        setIntField(term27497, term27497.getClass(), "sourcePosition", 0);
        setField(term27497, term27497.getClass(), "jsType", null);
        setField(term27497, term27497.getClass(), "parent", null);
        term27498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27498, term27498.getClass(), "str", null);
        setIntField(term27498, term27498.getClass(), "type", 0);
        setField(term27498, term27498.getClass(), "next", null);
        setField(term27498, term27498.getClass(), "first", null);
        setField(term27498, term27498.getClass(), "last", null);
        setField(term27498, term27498.getClass(), "propListHead", null);
        setIntField(term27498, term27498.getClass(), "sourcePosition", 0);
        setField(term27498, term27498.getClass(), "jsType", null);
        setField(term27498, term27498.getClass(), "parent", null);
        term27477 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27477, term27477.getClass(), "str", null);
        setIntField(term27477, term27477.getClass(), "type", 16);
        setField(term27477, term27477.getClass(), "next", null);
        setField(term27477, term27477.getClass(), "first", null);
        setField(term27477, term27477.getClass(), "last", null);
        setField(term27477, term27477.getClass(), "propListHead", null);
        setIntField(term27477, term27477.getClass(), "sourcePosition", 0);
        setField(term27477, term27477.getClass(), "jsType", null);
        setField(term27477, term27477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term27014;
        args[1] = term27106;
        args[2] = term27198;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term26922, args);
        assertTrue(recursiveEquals(term26922, term27495));
        assertTrue(recursiveEquals(term27014, term27496));
        assertTrue(recursiveEquals(term27106, term27497));
        assertTrue(recursiveEquals(term27198, term27498));
        assertTrue(recursiveEquals(retValue, term27477));
    }

};



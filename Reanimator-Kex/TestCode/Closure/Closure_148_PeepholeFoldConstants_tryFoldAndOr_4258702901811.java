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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472280;
     Object term472372;
     Object term472464;
     Object term472556;
     Object term473153;
     Object term473154;
     Object term473155;
     Object term473156;
     Object term473114;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term472372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term472372, term472372.getClass(), "parent", null);
        setIntField(term472372, term472372.getClass(), "type", 0);
        term472464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term472464, term472464.getClass(), "type", 0);
        term472556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term473153 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term473153, term473153.getClass(), "currentTraversal", null);
        term473154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term473154, term473154.getClass(), "str", null);
        setIntField(term473154, term473154.getClass(), "type", 0);
        setField(term473154, term473154.getClass(), "next", null);
        setField(term473154, term473154.getClass(), "first", null);
        setField(term473154, term473154.getClass(), "last", null);
        setField(term473154, term473154.getClass(), "propListHead", null);
        setIntField(term473154, term473154.getClass(), "sourcePosition", 0);
        setField(term473154, term473154.getClass(), "jsType", null);
        setField(term473154, term473154.getClass(), "parent", null);
        term473155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term473155, term473155.getClass(), "number", 0.0);
        setIntField(term473155, term473155.getClass(), "type", 0);
        setField(term473155, term473155.getClass(), "next", null);
        setField(term473155, term473155.getClass(), "first", null);
        setField(term473155, term473155.getClass(), "last", null);
        setField(term473155, term473155.getClass(), "propListHead", null);
        setIntField(term473155, term473155.getClass(), "sourcePosition", 0);
        setField(term473155, term473155.getClass(), "jsType", null);
        setField(term473155, term473155.getClass(), "parent", null);
        term473156 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term473156, term473156.getClass(), "str", null);
        setIntField(term473156, term473156.getClass(), "type", 0);
        setField(term473156, term473156.getClass(), "next", null);
        setField(term473156, term473156.getClass(), "first", null);
        setField(term473156, term473156.getClass(), "last", null);
        setField(term473156, term473156.getClass(), "propListHead", null);
        setIntField(term473156, term473156.getClass(), "sourcePosition", 0);
        setField(term473156, term473156.getClass(), "jsType", null);
        setField(term473156, term473156.getClass(), "parent", null);
        term473114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term473114, term473114.getClass(), "str", null);
        setIntField(term473114, term473114.getClass(), "type", 0);
        setField(term473114, term473114.getClass(), "next", null);
        setField(term473114, term473114.getClass(), "first", null);
        setField(term473114, term473114.getClass(), "last", null);
        setField(term473114, term473114.getClass(), "propListHead", null);
        setIntField(term473114, term473114.getClass(), "sourcePosition", 0);
        setField(term473114, term473114.getClass(), "jsType", null);
        setField(term473114, term473114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term472372;
        args[1] = term472464;
        args[2] = term472556;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term472280, args);
        assertTrue(recursiveEquals(term472280, term473153));
        assertTrue(recursiveEquals(term472372, term473154));
        assertTrue(recursiveEquals(term472464, term473155));
        assertTrue(recursiveEquals(term472556, term473156));
        assertTrue(recursiveEquals(retValue, term473114));
    }

};



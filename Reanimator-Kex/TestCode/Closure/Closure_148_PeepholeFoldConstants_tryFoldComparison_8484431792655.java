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

public class PeepholeFoldConstants_tryFoldComparison_8484431792655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757982;
     Object term758074;
     Object term758166;
     Object term758258;
     Object term758933;
     Object term758934;
     Object term758935;
     Object term758936;
     Object term758909;

    public PeepholeFoldConstants_tryFoldComparison_8484431792655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757982 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term758074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term758074, term758074.getClass(), "type", 16);
        term758166 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term758166, term758166.getClass(), "type", 42);
        term758258 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term758258, term758258.getClass(), "type", 16);
        term758933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term758933, term758933.getClass(), "currentTraversal", null);
        term758934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term758934, term758934.getClass(), "str", null);
        setIntField(term758934, term758934.getClass(), "type", 42);
        setField(term758934, term758934.getClass(), "next", null);
        setField(term758934, term758934.getClass(), "first", null);
        setField(term758934, term758934.getClass(), "last", null);
        setField(term758934, term758934.getClass(), "propListHead", null);
        setIntField(term758934, term758934.getClass(), "sourcePosition", 0);
        setField(term758934, term758934.getClass(), "jsType", null);
        setField(term758934, term758934.getClass(), "parent", null);
        term758935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term758935, term758935.getClass(), "str", null);
        setIntField(term758935, term758935.getClass(), "type", 16);
        setField(term758935, term758935.getClass(), "next", null);
        setField(term758935, term758935.getClass(), "first", null);
        setField(term758935, term758935.getClass(), "last", null);
        setField(term758935, term758935.getClass(), "propListHead", null);
        setIntField(term758935, term758935.getClass(), "sourcePosition", 0);
        setField(term758935, term758935.getClass(), "jsType", null);
        setField(term758935, term758935.getClass(), "parent", null);
        term758936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term758936, term758936.getClass(), "number", 0.0);
        setIntField(term758936, term758936.getClass(), "type", 16);
        setField(term758936, term758936.getClass(), "next", null);
        setField(term758936, term758936.getClass(), "first", null);
        setField(term758936, term758936.getClass(), "last", null);
        setField(term758936, term758936.getClass(), "propListHead", null);
        setIntField(term758936, term758936.getClass(), "sourcePosition", 0);
        setField(term758936, term758936.getClass(), "jsType", null);
        setField(term758936, term758936.getClass(), "parent", null);
        term758909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term758909, term758909.getClass(), "str", null);
        setIntField(term758909, term758909.getClass(), "type", 16);
        setField(term758909, term758909.getClass(), "next", null);
        setField(term758909, term758909.getClass(), "first", null);
        setField(term758909, term758909.getClass(), "last", null);
        setField(term758909, term758909.getClass(), "propListHead", null);
        setIntField(term758909, term758909.getClass(), "sourcePosition", 0);
        setField(term758909, term758909.getClass(), "jsType", null);
        setField(term758909, term758909.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term758074;
        args[1] = term758166;
        args[2] = term758258;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term757982, args);
        assertTrue(recursiveEquals(term757982, term758933));
        assertTrue(recursiveEquals(term758074, term758934));
        assertTrue(recursiveEquals(term758166, term758935));
        assertTrue(recursiveEquals(term758258, term758936));
        assertTrue(recursiveEquals(retValue, term758909));
    }

};



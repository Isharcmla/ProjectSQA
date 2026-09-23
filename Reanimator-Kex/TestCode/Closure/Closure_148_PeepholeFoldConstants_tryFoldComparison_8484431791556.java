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

public class PeepholeFoldConstants_tryFoldComparison_8484431791556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391697;
     Object term391789;
     Object term391881;
     Object term391973;
     Object term392126;
     Object term392127;
     Object term392128;
     Object term392129;
     Object term392100;

    public PeepholeFoldConstants_tryFoldComparison_8484431791556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391697 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term391789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term391789, term391789.getClass(), "type", 14);
        term391881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term391881, term391881.getClass(), "type", 42);
        term391973 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term391973, term391973.getClass(), "type", 14);
        term392126 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term392126, term392126.getClass(), "currentTraversal", null);
        term392127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term392127, term392127.getClass(), "str", null);
        setIntField(term392127, term392127.getClass(), "type", 42);
        setField(term392127, term392127.getClass(), "next", null);
        setField(term392127, term392127.getClass(), "first", null);
        setField(term392127, term392127.getClass(), "last", null);
        setField(term392127, term392127.getClass(), "propListHead", null);
        setIntField(term392127, term392127.getClass(), "sourcePosition", 0);
        setField(term392127, term392127.getClass(), "jsType", null);
        setField(term392127, term392127.getClass(), "parent", null);
        term392128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term392128, term392128.getClass(), "str", null);
        setIntField(term392128, term392128.getClass(), "type", 14);
        setField(term392128, term392128.getClass(), "next", null);
        setField(term392128, term392128.getClass(), "first", null);
        setField(term392128, term392128.getClass(), "last", null);
        setField(term392128, term392128.getClass(), "propListHead", null);
        setIntField(term392128, term392128.getClass(), "sourcePosition", 0);
        setField(term392128, term392128.getClass(), "jsType", null);
        setField(term392128, term392128.getClass(), "parent", null);
        term392129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term392129, term392129.getClass(), "number", 0.0);
        setIntField(term392129, term392129.getClass(), "type", 14);
        setField(term392129, term392129.getClass(), "next", null);
        setField(term392129, term392129.getClass(), "first", null);
        setField(term392129, term392129.getClass(), "last", null);
        setField(term392129, term392129.getClass(), "propListHead", null);
        setIntField(term392129, term392129.getClass(), "sourcePosition", 0);
        setField(term392129, term392129.getClass(), "jsType", null);
        setField(term392129, term392129.getClass(), "parent", null);
        term392100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term392100, term392100.getClass(), "str", null);
        setIntField(term392100, term392100.getClass(), "type", 14);
        setField(term392100, term392100.getClass(), "next", null);
        setField(term392100, term392100.getClass(), "first", null);
        setField(term392100, term392100.getClass(), "last", null);
        setField(term392100, term392100.getClass(), "propListHead", null);
        setIntField(term392100, term392100.getClass(), "sourcePosition", 0);
        setField(term392100, term392100.getClass(), "jsType", null);
        setField(term392100, term392100.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term391789;
        args[1] = term391881;
        args[2] = term391973;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term391697, args);
        assertTrue(recursiveEquals(term391697, term392126));
        assertTrue(recursiveEquals(term391789, term392127));
        assertTrue(recursiveEquals(term391881, term392128));
        assertTrue(recursiveEquals(term391973, term392129));
        assertTrue(recursiveEquals(retValue, term392100));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563200;
     Object term563292;
     Object term563924;
     Object term563925;
     Object term563890;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term563292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term563384, term563384.getClass(), "next", term563476);
        setField(term563292, term563292.getClass(), "first", term563384);
        setIntField(term563292, term563292.getClass(), "type", 20);
        term563924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term563924, term563924.getClass(), "currentTraversal", null);
        term563925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term563925, term563925.getClass(), "number", 0.0);
        setIntField(term563925, term563925.getClass(), "type", 20);
        setField(term563925, term563925.getClass(), "next", null);
        setDoubleField(term563926, term563926.getClass(), "number", 0.0);
        setIntField(term563926, term563926.getClass(), "type", 0);
        setDoubleField(term563927, term563927.getClass(), "number", 0.0);
        setIntField(term563927, term563927.getClass(), "type", 0);
        setField(term563927, term563927.getClass(), "next", null);
        setField(term563927, term563927.getClass(), "first", null);
        setField(term563927, term563927.getClass(), "last", null);
        setField(term563927, term563927.getClass(), "propListHead", null);
        setIntField(term563927, term563927.getClass(), "sourcePosition", 0);
        setField(term563927, term563927.getClass(), "jsType", null);
        setField(term563927, term563927.getClass(), "parent", null);
        setField(term563926, term563926.getClass(), "next", term563927);
        setField(term563926, term563926.getClass(), "first", null);
        setField(term563926, term563926.getClass(), "last", null);
        setField(term563926, term563926.getClass(), "propListHead", null);
        setIntField(term563926, term563926.getClass(), "sourcePosition", 0);
        setField(term563926, term563926.getClass(), "jsType", null);
        setField(term563926, term563926.getClass(), "parent", null);
        setField(term563925, term563925.getClass(), "first", term563926);
        setField(term563925, term563925.getClass(), "last", null);
        setField(term563925, term563925.getClass(), "propListHead", null);
        setIntField(term563925, term563925.getClass(), "sourcePosition", 0);
        setField(term563925, term563925.getClass(), "jsType", null);
        setField(term563925, term563925.getClass(), "parent", null);
        term563890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term563896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term563890, term563890.getClass(), "number", 0.0);
        setIntField(term563890, term563890.getClass(), "type", 20);
        setField(term563890, term563890.getClass(), "next", null);
        setDoubleField(term563893, term563893.getClass(), "number", 0.0);
        setIntField(term563893, term563893.getClass(), "type", 0);
        setDoubleField(term563896, term563896.getClass(), "number", 0.0);
        setIntField(term563896, term563896.getClass(), "type", 0);
        setField(term563896, term563896.getClass(), "next", null);
        setField(term563896, term563896.getClass(), "first", null);
        setField(term563896, term563896.getClass(), "last", null);
        setField(term563896, term563896.getClass(), "propListHead", null);
        setIntField(term563896, term563896.getClass(), "sourcePosition", 0);
        setField(term563896, term563896.getClass(), "jsType", null);
        setField(term563896, term563896.getClass(), "parent", null);
        setField(term563893, term563893.getClass(), "next", term563896);
        setField(term563893, term563893.getClass(), "first", null);
        setField(term563893, term563893.getClass(), "last", null);
        setField(term563893, term563893.getClass(), "propListHead", null);
        setIntField(term563893, term563893.getClass(), "sourcePosition", 0);
        setField(term563893, term563893.getClass(), "jsType", null);
        setField(term563893, term563893.getClass(), "parent", null);
        setField(term563890, term563890.getClass(), "first", term563893);
        setField(term563890, term563890.getClass(), "last", null);
        setField(term563890, term563890.getClass(), "propListHead", null);
        setIntField(term563890, term563890.getClass(), "sourcePosition", 0);
        setField(term563890, term563890.getClass(), "jsType", null);
        setField(term563890, term563890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term563292;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term563200, args);
        assertTrue(recursiveEquals(term563200, term563924));
        assertTrue(recursiveEquals(term563292, term563925));
        assertTrue(recursiveEquals(retValue, term563890));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98160;
     Object term98252;
     Object term98948;
     Object term98949;
     Object term98921;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98160 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term98252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98344, term98344.getClass(), "next", term98436);
        setField(term98252, term98252.getClass(), "first", term98344);
        setIntField(term98252, term98252.getClass(), "type", 24);
        term98948 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term98948, term98948.getClass(), "currentTraversal", null);
        term98949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98949, term98949.getClass(), "str", null);
        setIntField(term98949, term98949.getClass(), "type", 24);
        setField(term98949, term98949.getClass(), "next", null);
        setField(term98950, term98950.getClass(), "str", null);
        setIntField(term98950, term98950.getClass(), "type", 0);
        setField(term98951, term98951.getClass(), "str", null);
        setIntField(term98951, term98951.getClass(), "type", 0);
        setField(term98951, term98951.getClass(), "next", null);
        setField(term98951, term98951.getClass(), "first", null);
        setField(term98951, term98951.getClass(), "last", null);
        setField(term98951, term98951.getClass(), "propListHead", null);
        setIntField(term98951, term98951.getClass(), "sourcePosition", 0);
        setField(term98951, term98951.getClass(), "jsType", null);
        setField(term98951, term98951.getClass(), "parent", null);
        setField(term98950, term98950.getClass(), "next", term98951);
        setField(term98950, term98950.getClass(), "first", null);
        setField(term98950, term98950.getClass(), "last", null);
        setField(term98950, term98950.getClass(), "propListHead", null);
        setIntField(term98950, term98950.getClass(), "sourcePosition", 0);
        setField(term98950, term98950.getClass(), "jsType", null);
        setField(term98950, term98950.getClass(), "parent", null);
        setField(term98949, term98949.getClass(), "first", term98950);
        setField(term98949, term98949.getClass(), "last", null);
        setField(term98949, term98949.getClass(), "propListHead", null);
        setIntField(term98949, term98949.getClass(), "sourcePosition", 0);
        setField(term98949, term98949.getClass(), "jsType", null);
        setField(term98949, term98949.getClass(), "parent", null);
        term98921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98923 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98921, term98921.getClass(), "str", null);
        setIntField(term98921, term98921.getClass(), "type", 24);
        setField(term98921, term98921.getClass(), "next", null);
        setField(term98923, term98923.getClass(), "str", null);
        setIntField(term98923, term98923.getClass(), "type", 0);
        setField(term98925, term98925.getClass(), "str", null);
        setIntField(term98925, term98925.getClass(), "type", 0);
        setField(term98925, term98925.getClass(), "next", null);
        setField(term98925, term98925.getClass(), "first", null);
        setField(term98925, term98925.getClass(), "last", null);
        setField(term98925, term98925.getClass(), "propListHead", null);
        setIntField(term98925, term98925.getClass(), "sourcePosition", 0);
        setField(term98925, term98925.getClass(), "jsType", null);
        setField(term98925, term98925.getClass(), "parent", null);
        setField(term98923, term98923.getClass(), "next", term98925);
        setField(term98923, term98923.getClass(), "first", null);
        setField(term98923, term98923.getClass(), "last", null);
        setField(term98923, term98923.getClass(), "propListHead", null);
        setIntField(term98923, term98923.getClass(), "sourcePosition", 0);
        setField(term98923, term98923.getClass(), "jsType", null);
        setField(term98923, term98923.getClass(), "parent", null);
        setField(term98921, term98921.getClass(), "first", term98923);
        setField(term98921, term98921.getClass(), "last", null);
        setField(term98921, term98921.getClass(), "propListHead", null);
        setIntField(term98921, term98921.getClass(), "sourcePosition", 0);
        setField(term98921, term98921.getClass(), "jsType", null);
        setField(term98921, term98921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term98252;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term98160, args);
        assertTrue(recursiveEquals(term98160, term98948));
        assertTrue(recursiveEquals(term98252, term98949));
        assertTrue(recursiveEquals(retValue, term98921));
    }

};



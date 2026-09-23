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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145315;
     Object term145407;
     Object term146024;
     Object term146025;
     Object term145989;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term145407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145591 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145499, term145499.getClass(), "next", term145591);
        setIntField(term145499, term145499.getClass(), "type", 39);
        setField(term145407, term145407.getClass(), "first", term145499);
        setIntField(term145407, term145407.getClass(), "type", 9);
        term146024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term146024, term146024.getClass(), "currentTraversal", null);
        term146025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term146026 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term146027 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146025, term146025.getClass(), "str", null);
        setIntField(term146025, term146025.getClass(), "type", 9);
        setField(term146025, term146025.getClass(), "next", null);
        setField(term146026, term146026.getClass(), "str", null);
        setIntField(term146026, term146026.getClass(), "type", 39);
        setField(term146027, term146027.getClass(), "str", null);
        setIntField(term146027, term146027.getClass(), "type", 0);
        setField(term146027, term146027.getClass(), "next", null);
        setField(term146027, term146027.getClass(), "first", null);
        setField(term146027, term146027.getClass(), "last", null);
        setField(term146027, term146027.getClass(), "propListHead", null);
        setIntField(term146027, term146027.getClass(), "sourcePosition", 0);
        setField(term146027, term146027.getClass(), "jsType", null);
        setField(term146027, term146027.getClass(), "parent", null);
        setField(term146026, term146026.getClass(), "next", term146027);
        setField(term146026, term146026.getClass(), "first", null);
        setField(term146026, term146026.getClass(), "last", null);
        setField(term146026, term146026.getClass(), "propListHead", null);
        setIntField(term146026, term146026.getClass(), "sourcePosition", 0);
        setField(term146026, term146026.getClass(), "jsType", null);
        setField(term146026, term146026.getClass(), "parent", null);
        setField(term146025, term146025.getClass(), "first", term146026);
        setField(term146025, term146025.getClass(), "last", null);
        setField(term146025, term146025.getClass(), "propListHead", null);
        setIntField(term146025, term146025.getClass(), "sourcePosition", 0);
        setField(term146025, term146025.getClass(), "jsType", null);
        setField(term146025, term146025.getClass(), "parent", null);
        term145989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term145993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term145989, term145989.getClass(), "str", null);
        setIntField(term145989, term145989.getClass(), "type", 9);
        setField(term145989, term145989.getClass(), "next", null);
        setField(term145991, term145991.getClass(), "str", null);
        setIntField(term145991, term145991.getClass(), "type", 39);
        setField(term145993, term145993.getClass(), "str", null);
        setIntField(term145993, term145993.getClass(), "type", 0);
        setField(term145993, term145993.getClass(), "next", null);
        setField(term145993, term145993.getClass(), "first", null);
        setField(term145993, term145993.getClass(), "last", null);
        setField(term145993, term145993.getClass(), "propListHead", null);
        setIntField(term145993, term145993.getClass(), "sourcePosition", 0);
        setField(term145993, term145993.getClass(), "jsType", null);
        setField(term145993, term145993.getClass(), "parent", null);
        setField(term145991, term145991.getClass(), "next", term145993);
        setField(term145991, term145991.getClass(), "first", null);
        setField(term145991, term145991.getClass(), "last", null);
        setField(term145991, term145991.getClass(), "propListHead", null);
        setIntField(term145991, term145991.getClass(), "sourcePosition", 0);
        setField(term145991, term145991.getClass(), "jsType", null);
        setField(term145991, term145991.getClass(), "parent", null);
        setField(term145989, term145989.getClass(), "first", term145991);
        setField(term145989, term145989.getClass(), "last", null);
        setField(term145989, term145989.getClass(), "propListHead", null);
        setIntField(term145989, term145989.getClass(), "sourcePosition", 0);
        setField(term145989, term145989.getClass(), "jsType", null);
        setField(term145989, term145989.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term145407;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term145315, args);
        assertTrue(recursiveEquals(term145315, term146024));
        assertTrue(recursiveEquals(term145407, term146025));
        assertTrue(recursiveEquals(retValue, term145989));
    }

};



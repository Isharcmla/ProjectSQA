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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54194;
     Object term54286;
     Object term55215;
     Object term55216;
     Object term55179;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54194 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term54286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54378 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term54286, term54286.getClass(), "first", term54286);
        setField(term54286, term54286.getClass(), "next", term54378);
        setIntField(term54286, term54286.getClass(), "type", 16);
        term55215 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term55215, term55215.getClass(), "currentTraversal", null);
        term55216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55216, term55216.getClass(), "str", null);
        setIntField(term55216, term55216.getClass(), "type", 16);
        setField(term55217, term55217.getClass(), "str", null);
        setIntField(term55217, term55217.getClass(), "type", 0);
        setField(term55217, term55217.getClass(), "next", null);
        setField(term55217, term55217.getClass(), "first", null);
        setField(term55217, term55217.getClass(), "last", null);
        setField(term55217, term55217.getClass(), "propListHead", null);
        setIntField(term55217, term55217.getClass(), "sourcePosition", 0);
        setField(term55217, term55217.getClass(), "jsType", null);
        setField(term55217, term55217.getClass(), "parent", null);
        setField(term55216, term55216.getClass(), "next", term55217);
        setField(term55216, term55216.getClass(), "first", term55216);
        setField(term55216, term55216.getClass(), "last", null);
        setField(term55216, term55216.getClass(), "propListHead", null);
        setIntField(term55216, term55216.getClass(), "sourcePosition", 0);
        setField(term55216, term55216.getClass(), "jsType", null);
        setField(term55216, term55216.getClass(), "parent", null);
        term55179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55179, term55179.getClass(), "str", null);
        setIntField(term55179, term55179.getClass(), "type", 16);
        setField(term55181, term55181.getClass(), "str", null);
        setIntField(term55181, term55181.getClass(), "type", 0);
        setField(term55181, term55181.getClass(), "next", null);
        setField(term55181, term55181.getClass(), "first", null);
        setField(term55181, term55181.getClass(), "last", null);
        setField(term55181, term55181.getClass(), "propListHead", null);
        setIntField(term55181, term55181.getClass(), "sourcePosition", 0);
        setField(term55181, term55181.getClass(), "jsType", null);
        setField(term55181, term55181.getClass(), "parent", null);
        setField(term55179, term55179.getClass(), "next", term55181);
        setField(term55179, term55179.getClass(), "first", term55179);
        setField(term55179, term55179.getClass(), "last", null);
        setField(term55179, term55179.getClass(), "propListHead", null);
        setIntField(term55179, term55179.getClass(), "sourcePosition", 0);
        setField(term55179, term55179.getClass(), "jsType", null);
        setField(term55179, term55179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54286;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term54194, args);
        assertTrue(recursiveEquals(term54194, term55215));
        assertTrue(recursiveEquals(term54286, term55216));
        assertTrue(recursiveEquals(retValue, term55179));
    }

};



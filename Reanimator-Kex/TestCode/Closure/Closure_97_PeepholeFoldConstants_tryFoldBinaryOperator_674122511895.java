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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252580;
     Object term252672;
     Object term253232;
     Object term253233;
     Object term253203;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252580 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term252672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term252742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term252672, term252672.getClass(), "first", term252672);
        setField(term252672, term252672.getClass(), "next", term252742);
        setIntField(term252672, term252672.getClass(), "type", 9);
        term253232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253232, term253232.getClass(), "currentTraversal", null);
        term253233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term253233, term253233.getClass(), "number", 0.0);
        setIntField(term253233, term253233.getClass(), "type", 9);
        setIntField(term253234, term253234.getClass(), "type", 0);
        setField(term253234, term253234.getClass(), "next", null);
        setField(term253234, term253234.getClass(), "first", null);
        setField(term253234, term253234.getClass(), "last", null);
        setField(term253234, term253234.getClass(), "propListHead", null);
        setIntField(term253234, term253234.getClass(), "sourcePosition", 0);
        setField(term253234, term253234.getClass(), "jsType", null);
        setField(term253234, term253234.getClass(), "parent", null);
        setField(term253233, term253233.getClass(), "next", term253234);
        setField(term253233, term253233.getClass(), "first", term253233);
        setField(term253233, term253233.getClass(), "last", null);
        setField(term253233, term253233.getClass(), "propListHead", null);
        setIntField(term253233, term253233.getClass(), "sourcePosition", 0);
        setField(term253233, term253233.getClass(), "jsType", null);
        setField(term253233, term253233.getClass(), "parent", null);
        term253203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term253203, term253203.getClass(), "number", 0.0);
        setIntField(term253203, term253203.getClass(), "type", 9);
        setIntField(term253206, term253206.getClass(), "type", 0);
        setField(term253206, term253206.getClass(), "next", null);
        setField(term253206, term253206.getClass(), "first", null);
        setField(term253206, term253206.getClass(), "last", null);
        setField(term253206, term253206.getClass(), "propListHead", null);
        setIntField(term253206, term253206.getClass(), "sourcePosition", 0);
        setField(term253206, term253206.getClass(), "jsType", null);
        setField(term253206, term253206.getClass(), "parent", null);
        setField(term253203, term253203.getClass(), "next", term253206);
        setField(term253203, term253203.getClass(), "first", term253203);
        setField(term253203, term253203.getClass(), "last", null);
        setField(term253203, term253203.getClass(), "propListHead", null);
        setIntField(term253203, term253203.getClass(), "sourcePosition", 0);
        setField(term253203, term253203.getClass(), "jsType", null);
        setField(term253203, term253203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term252672;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term252580, args);
        assertTrue(recursiveEquals(term252580, term253232));
        assertTrue(recursiveEquals(term252672, term253233));
        assertTrue(recursiveEquals(retValue, term253203));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82856;
     Object term82948;
     Object term83080;
     Object term83081;
     Object term83052;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term82948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82948, term82948.getClass(), "first", term82948);
        setField(term82948, term82948.getClass(), "next", term83018);
        setIntField(term82948, term82948.getClass(), "type", 13);
        term83080 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term83080, term83080.getClass(), "currentTraversal", null);
        term83081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83081, term83081.getClass(), "str", null);
        setIntField(term83081, term83081.getClass(), "type", 13);
        setIntField(term83082, term83082.getClass(), "type", 0);
        setField(term83082, term83082.getClass(), "next", null);
        setField(term83082, term83082.getClass(), "first", null);
        setField(term83082, term83082.getClass(), "last", null);
        setField(term83082, term83082.getClass(), "propListHead", null);
        setIntField(term83082, term83082.getClass(), "sourcePosition", 0);
        setField(term83082, term83082.getClass(), "jsType", null);
        setField(term83082, term83082.getClass(), "parent", null);
        setField(term83081, term83081.getClass(), "next", term83082);
        setField(term83081, term83081.getClass(), "first", term83081);
        setField(term83081, term83081.getClass(), "last", null);
        setField(term83081, term83081.getClass(), "propListHead", null);
        setIntField(term83081, term83081.getClass(), "sourcePosition", 0);
        setField(term83081, term83081.getClass(), "jsType", null);
        setField(term83081, term83081.getClass(), "parent", null);
        term83052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83052, term83052.getClass(), "str", null);
        setIntField(term83052, term83052.getClass(), "type", 13);
        setIntField(term83054, term83054.getClass(), "type", 0);
        setField(term83054, term83054.getClass(), "next", null);
        setField(term83054, term83054.getClass(), "first", null);
        setField(term83054, term83054.getClass(), "last", null);
        setField(term83054, term83054.getClass(), "propListHead", null);
        setIntField(term83054, term83054.getClass(), "sourcePosition", 0);
        setField(term83054, term83054.getClass(), "jsType", null);
        setField(term83054, term83054.getClass(), "parent", null);
        setField(term83052, term83052.getClass(), "next", term83054);
        setField(term83052, term83052.getClass(), "first", term83052);
        setField(term83052, term83052.getClass(), "last", null);
        setField(term83052, term83052.getClass(), "propListHead", null);
        setIntField(term83052, term83052.getClass(), "sourcePosition", 0);
        setField(term83052, term83052.getClass(), "jsType", null);
        setField(term83052, term83052.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82948;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term82856, args);
        assertTrue(recursiveEquals(term82856, term83080));
        assertTrue(recursiveEquals(term82948, term83081));
        assertTrue(recursiveEquals(retValue, term83052));
    }

};



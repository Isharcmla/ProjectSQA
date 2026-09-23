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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334551;
     Object term334643;
     Object term334989;
     Object term334990;
     Object term334948;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334551 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term334643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term334735, term334735.getClass(), "next", term334827);
        setField(term334643, term334643.getClass(), "first", term334735);
        setIntField(term334643, term334643.getClass(), "type", 46);
        term334989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term334989, term334989.getClass(), "currentTraversal", null);
        term334990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334990, term334990.getClass(), "number", 0.0);
        setIntField(term334990, term334990.getClass(), "type", 46);
        setField(term334990, term334990.getClass(), "next", null);
        setDoubleField(term334991, term334991.getClass(), "number", 0.0);
        setIntField(term334991, term334991.getClass(), "type", 0);
        setDoubleField(term334992, term334992.getClass(), "number", 0.0);
        setIntField(term334992, term334992.getClass(), "type", 0);
        setField(term334992, term334992.getClass(), "next", null);
        setField(term334992, term334992.getClass(), "first", null);
        setField(term334992, term334992.getClass(), "last", null);
        setField(term334992, term334992.getClass(), "propListHead", null);
        setIntField(term334992, term334992.getClass(), "sourcePosition", 0);
        setField(term334992, term334992.getClass(), "jsType", null);
        setField(term334992, term334992.getClass(), "parent", null);
        setField(term334991, term334991.getClass(), "next", term334992);
        setField(term334991, term334991.getClass(), "first", null);
        setField(term334991, term334991.getClass(), "last", null);
        setField(term334991, term334991.getClass(), "propListHead", null);
        setIntField(term334991, term334991.getClass(), "sourcePosition", 0);
        setField(term334991, term334991.getClass(), "jsType", null);
        setField(term334991, term334991.getClass(), "parent", null);
        setField(term334990, term334990.getClass(), "first", term334991);
        setField(term334990, term334990.getClass(), "last", null);
        setField(term334990, term334990.getClass(), "propListHead", null);
        setIntField(term334990, term334990.getClass(), "sourcePosition", 0);
        setField(term334990, term334990.getClass(), "jsType", null);
        setField(term334990, term334990.getClass(), "parent", null);
        term334948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term334954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term334948, term334948.getClass(), "number", 0.0);
        setIntField(term334948, term334948.getClass(), "type", 46);
        setField(term334948, term334948.getClass(), "next", null);
        setDoubleField(term334951, term334951.getClass(), "number", 0.0);
        setIntField(term334951, term334951.getClass(), "type", 0);
        setDoubleField(term334954, term334954.getClass(), "number", 0.0);
        setIntField(term334954, term334954.getClass(), "type", 0);
        setField(term334954, term334954.getClass(), "next", null);
        setField(term334954, term334954.getClass(), "first", null);
        setField(term334954, term334954.getClass(), "last", null);
        setField(term334954, term334954.getClass(), "propListHead", null);
        setIntField(term334954, term334954.getClass(), "sourcePosition", 0);
        setField(term334954, term334954.getClass(), "jsType", null);
        setField(term334954, term334954.getClass(), "parent", null);
        setField(term334951, term334951.getClass(), "next", term334954);
        setField(term334951, term334951.getClass(), "first", null);
        setField(term334951, term334951.getClass(), "last", null);
        setField(term334951, term334951.getClass(), "propListHead", null);
        setIntField(term334951, term334951.getClass(), "sourcePosition", 0);
        setField(term334951, term334951.getClass(), "jsType", null);
        setField(term334951, term334951.getClass(), "parent", null);
        setField(term334948, term334948.getClass(), "first", term334951);
        setField(term334948, term334948.getClass(), "last", null);
        setField(term334948, term334948.getClass(), "propListHead", null);
        setIntField(term334948, term334948.getClass(), "sourcePosition", 0);
        setField(term334948, term334948.getClass(), "jsType", null);
        setField(term334948, term334948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term334643;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term334551, args);
        assertTrue(recursiveEquals(term334551, term334989));
        assertTrue(recursiveEquals(term334643, term334990));
        assertTrue(recursiveEquals(retValue, term334948));
    }

};



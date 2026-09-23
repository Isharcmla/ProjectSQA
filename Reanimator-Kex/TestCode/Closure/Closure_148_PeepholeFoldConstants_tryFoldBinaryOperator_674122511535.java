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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114342;
     Object term114434;
     Object term115052;
     Object term115053;
     Object term115024;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114342 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term114434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term114504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114434, term114434.getClass(), "first", term114434);
        setField(term114434, term114434.getClass(), "next", term114504);
        setIntField(term114434, term114434.getClass(), "type", 17);
        term115052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term115052, term115052.getClass(), "currentTraversal", null);
        term115053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term115053, term115053.getClass(), "str", null);
        setIntField(term115053, term115053.getClass(), "type", 17);
        setIntField(term115054, term115054.getClass(), "type", 0);
        setField(term115054, term115054.getClass(), "next", null);
        setField(term115054, term115054.getClass(), "first", null);
        setField(term115054, term115054.getClass(), "last", null);
        setField(term115054, term115054.getClass(), "propListHead", null);
        setIntField(term115054, term115054.getClass(), "sourcePosition", 0);
        setField(term115054, term115054.getClass(), "jsType", null);
        setField(term115054, term115054.getClass(), "parent", null);
        setField(term115053, term115053.getClass(), "next", term115054);
        setField(term115053, term115053.getClass(), "first", term115053);
        setField(term115053, term115053.getClass(), "last", null);
        setField(term115053, term115053.getClass(), "propListHead", null);
        setIntField(term115053, term115053.getClass(), "sourcePosition", 0);
        setField(term115053, term115053.getClass(), "jsType", null);
        setField(term115053, term115053.getClass(), "parent", null);
        term115024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term115024, term115024.getClass(), "str", null);
        setIntField(term115024, term115024.getClass(), "type", 17);
        setIntField(term115026, term115026.getClass(), "type", 0);
        setField(term115026, term115026.getClass(), "next", null);
        setField(term115026, term115026.getClass(), "first", null);
        setField(term115026, term115026.getClass(), "last", null);
        setField(term115026, term115026.getClass(), "propListHead", null);
        setIntField(term115026, term115026.getClass(), "sourcePosition", 0);
        setField(term115026, term115026.getClass(), "jsType", null);
        setField(term115026, term115026.getClass(), "parent", null);
        setField(term115024, term115024.getClass(), "next", term115026);
        setField(term115024, term115024.getClass(), "first", term115024);
        setField(term115024, term115024.getClass(), "last", null);
        setField(term115024, term115024.getClass(), "propListHead", null);
        setIntField(term115024, term115024.getClass(), "sourcePosition", 0);
        setField(term115024, term115024.getClass(), "jsType", null);
        setField(term115024, term115024.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term114434;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term114342, args);
        assertTrue(recursiveEquals(term114342, term115052));
        assertTrue(recursiveEquals(term114434, term115053));
        assertTrue(recursiveEquals(retValue, term115024));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18540;
     Object term18610;
     Object term18848;
     Object term18849;
     Object term18833;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18610, term18610.getClass(), "first", term18610);
        setField(term18610, term18610.getClass(), "next", term18610);
        setIntField(term18610, term18610.getClass(), "type", 22);
        term18848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18848, term18848.getClass(), "currentTraversal", null);
        term18849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18849, term18849.getClass(), "type", 22);
        setField(term18849, term18849.getClass(), "next", term18849);
        setField(term18849, term18849.getClass(), "first", term18849);
        setField(term18849, term18849.getClass(), "last", null);
        setField(term18849, term18849.getClass(), "propListHead", null);
        setIntField(term18849, term18849.getClass(), "sourcePosition", 0);
        setField(term18849, term18849.getClass(), "jsType", null);
        setField(term18849, term18849.getClass(), "parent", null);
        term18833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18833, term18833.getClass(), "type", 22);
        setField(term18833, term18833.getClass(), "next", term18833);
        setField(term18833, term18833.getClass(), "first", term18833);
        setField(term18833, term18833.getClass(), "last", null);
        setField(term18833, term18833.getClass(), "propListHead", null);
        setIntField(term18833, term18833.getClass(), "sourcePosition", 0);
        setField(term18833, term18833.getClass(), "jsType", null);
        setField(term18833, term18833.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18610;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term18540, args);
        assertTrue(recursiveEquals(term18540, term18848));
        assertTrue(recursiveEquals(term18610, term18849));
        assertTrue(recursiveEquals(retValue, term18833));
    }

};



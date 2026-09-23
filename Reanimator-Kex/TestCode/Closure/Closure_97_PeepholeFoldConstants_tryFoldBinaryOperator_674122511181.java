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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34554;
     Object term34624;
     Object term35378;
     Object term35379;
     Object term35359;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34624, term34624.getClass(), "first", term34624);
        setField(term34624, term34624.getClass(), "next", term34624);
        setIntField(term34624, term34624.getClass(), "type", 35);
        term35378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35378, term35378.getClass(), "currentTraversal", null);
        term35379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35379, term35379.getClass(), "type", 35);
        setField(term35379, term35379.getClass(), "next", term35379);
        setField(term35379, term35379.getClass(), "first", term35379);
        setField(term35379, term35379.getClass(), "last", null);
        setField(term35379, term35379.getClass(), "propListHead", null);
        setIntField(term35379, term35379.getClass(), "sourcePosition", 0);
        setField(term35379, term35379.getClass(), "jsType", null);
        setField(term35379, term35379.getClass(), "parent", null);
        term35359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35359, term35359.getClass(), "type", 35);
        setField(term35359, term35359.getClass(), "next", term35359);
        setField(term35359, term35359.getClass(), "first", term35359);
        setField(term35359, term35359.getClass(), "last", null);
        setField(term35359, term35359.getClass(), "propListHead", null);
        setIntField(term35359, term35359.getClass(), "sourcePosition", 0);
        setField(term35359, term35359.getClass(), "jsType", null);
        setField(term35359, term35359.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34624;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term34554, args);
        assertTrue(recursiveEquals(term34554, term35378));
        assertTrue(recursiveEquals(term34624, term35379));
        assertTrue(recursiveEquals(retValue, term35359));
    }

};



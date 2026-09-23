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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88834;
     Object term88926;
     Object term89831;
     Object term89832;
     Object term89804;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term88926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term88996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88926, term88926.getClass(), "first", term88926);
        setField(term88926, term88926.getClass(), "next", term88996);
        setIntField(term88926, term88926.getClass(), "type", 9);
        term89831 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term89831, term89831.getClass(), "currentTraversal", null);
        term89832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89832, term89832.getClass(), "str", null);
        setIntField(term89832, term89832.getClass(), "type", 9);
        setIntField(term89833, term89833.getClass(), "type", 0);
        setField(term89833, term89833.getClass(), "next", null);
        setField(term89833, term89833.getClass(), "first", null);
        setField(term89833, term89833.getClass(), "last", null);
        setField(term89833, term89833.getClass(), "propListHead", null);
        setIntField(term89833, term89833.getClass(), "sourcePosition", 0);
        setField(term89833, term89833.getClass(), "jsType", null);
        setField(term89833, term89833.getClass(), "parent", null);
        setField(term89832, term89832.getClass(), "next", term89833);
        setField(term89832, term89832.getClass(), "first", term89832);
        setField(term89832, term89832.getClass(), "last", null);
        setField(term89832, term89832.getClass(), "propListHead", null);
        setIntField(term89832, term89832.getClass(), "sourcePosition", 0);
        setField(term89832, term89832.getClass(), "jsType", null);
        setField(term89832, term89832.getClass(), "parent", null);
        term89804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term89806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89804, term89804.getClass(), "str", null);
        setIntField(term89804, term89804.getClass(), "type", 9);
        setIntField(term89806, term89806.getClass(), "type", 0);
        setField(term89806, term89806.getClass(), "next", null);
        setField(term89806, term89806.getClass(), "first", null);
        setField(term89806, term89806.getClass(), "last", null);
        setField(term89806, term89806.getClass(), "propListHead", null);
        setIntField(term89806, term89806.getClass(), "sourcePosition", 0);
        setField(term89806, term89806.getClass(), "jsType", null);
        setField(term89806, term89806.getClass(), "parent", null);
        setField(term89804, term89804.getClass(), "next", term89806);
        setField(term89804, term89804.getClass(), "first", term89804);
        setField(term89804, term89804.getClass(), "last", null);
        setField(term89804, term89804.getClass(), "propListHead", null);
        setIntField(term89804, term89804.getClass(), "sourcePosition", 0);
        setField(term89804, term89804.getClass(), "jsType", null);
        setField(term89804, term89804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term88926;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term88834, args);
        assertTrue(recursiveEquals(term88834, term89831));
        assertTrue(recursiveEquals(term88926, term89832));
        assertTrue(recursiveEquals(retValue, term89804));
    }

};



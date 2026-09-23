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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73377;
     Object term73469;
     Object term73977;
     Object term73978;
     Object term73938;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73377 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term73469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73469, term73469.getClass(), "first", term73469);
        setField(term73469, term73469.getClass(), "next", term73539);
        setIntField(term73469, term73469.getClass(), "type", 21);
        term73977 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term73977, term73977.getClass(), "currentTraversal", null);
        term73978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73978, term73978.getClass(), "str", null);
        setIntField(term73978, term73978.getClass(), "type", 21);
        setIntField(term73979, term73979.getClass(), "type", 0);
        setField(term73979, term73979.getClass(), "next", null);
        setField(term73979, term73979.getClass(), "first", null);
        setField(term73979, term73979.getClass(), "last", null);
        setField(term73979, term73979.getClass(), "propListHead", null);
        setIntField(term73979, term73979.getClass(), "sourcePosition", 0);
        setField(term73979, term73979.getClass(), "jsType", null);
        setField(term73979, term73979.getClass(), "parent", null);
        setField(term73978, term73978.getClass(), "next", term73979);
        setField(term73978, term73978.getClass(), "first", term73978);
        setField(term73978, term73978.getClass(), "last", null);
        setField(term73978, term73978.getClass(), "propListHead", null);
        setIntField(term73978, term73978.getClass(), "sourcePosition", 0);
        setField(term73978, term73978.getClass(), "jsType", null);
        setField(term73978, term73978.getClass(), "parent", null);
        term73938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73938, term73938.getClass(), "str", null);
        setIntField(term73938, term73938.getClass(), "type", 21);
        setIntField(term73940, term73940.getClass(), "type", 0);
        setField(term73940, term73940.getClass(), "next", null);
        setField(term73940, term73940.getClass(), "first", null);
        setField(term73940, term73940.getClass(), "last", null);
        setField(term73940, term73940.getClass(), "propListHead", null);
        setIntField(term73940, term73940.getClass(), "sourcePosition", 0);
        setField(term73940, term73940.getClass(), "jsType", null);
        setField(term73940, term73940.getClass(), "parent", null);
        setField(term73938, term73938.getClass(), "next", term73940);
        setField(term73938, term73938.getClass(), "first", term73938);
        setField(term73938, term73938.getClass(), "last", null);
        setField(term73938, term73938.getClass(), "propListHead", null);
        setIntField(term73938, term73938.getClass(), "sourcePosition", 0);
        setField(term73938, term73938.getClass(), "jsType", null);
        setField(term73938, term73938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term73469;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term73377, args);
        assertTrue(recursiveEquals(term73377, term73977));
        assertTrue(recursiveEquals(term73469, term73978));
        assertTrue(recursiveEquals(retValue, term73938));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52294;
     Object term52386;
     Object term52938;
     Object term52939;
     Object term52897;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term52386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term52386, term52386.getClass(), "first", term52386);
        setField(term52386, term52386.getClass(), "next", term52478);
        setIntField(term52386, term52386.getClass(), "type", 16);
        term52938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term52938, term52938.getClass(), "currentTraversal", null);
        term52939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term52939, term52939.getClass(), "number", 0.0);
        setIntField(term52939, term52939.getClass(), "type", 16);
        setDoubleField(term52940, term52940.getClass(), "number", 0.0);
        setIntField(term52940, term52940.getClass(), "type", 0);
        setField(term52940, term52940.getClass(), "next", null);
        setField(term52940, term52940.getClass(), "first", null);
        setField(term52940, term52940.getClass(), "last", null);
        setField(term52940, term52940.getClass(), "propListHead", null);
        setIntField(term52940, term52940.getClass(), "sourcePosition", 0);
        setField(term52940, term52940.getClass(), "jsType", null);
        setField(term52940, term52940.getClass(), "parent", null);
        setField(term52939, term52939.getClass(), "next", term52940);
        setField(term52939, term52939.getClass(), "first", term52939);
        setField(term52939, term52939.getClass(), "last", null);
        setField(term52939, term52939.getClass(), "propListHead", null);
        setIntField(term52939, term52939.getClass(), "sourcePosition", 0);
        setField(term52939, term52939.getClass(), "jsType", null);
        setField(term52939, term52939.getClass(), "parent", null);
        term52897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term52897, term52897.getClass(), "number", 0.0);
        setIntField(term52897, term52897.getClass(), "type", 16);
        setDoubleField(term52900, term52900.getClass(), "number", 0.0);
        setIntField(term52900, term52900.getClass(), "type", 0);
        setField(term52900, term52900.getClass(), "next", null);
        setField(term52900, term52900.getClass(), "first", null);
        setField(term52900, term52900.getClass(), "last", null);
        setField(term52900, term52900.getClass(), "propListHead", null);
        setIntField(term52900, term52900.getClass(), "sourcePosition", 0);
        setField(term52900, term52900.getClass(), "jsType", null);
        setField(term52900, term52900.getClass(), "parent", null);
        setField(term52897, term52897.getClass(), "next", term52900);
        setField(term52897, term52897.getClass(), "first", term52897);
        setField(term52897, term52897.getClass(), "last", null);
        setField(term52897, term52897.getClass(), "propListHead", null);
        setIntField(term52897, term52897.getClass(), "sourcePosition", 0);
        setField(term52897, term52897.getClass(), "jsType", null);
        setField(term52897, term52897.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52386;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term52294, args);
        assertTrue(recursiveEquals(term52294, term52938));
        assertTrue(recursiveEquals(term52386, term52939));
        assertTrue(recursiveEquals(retValue, term52897));
    }

};



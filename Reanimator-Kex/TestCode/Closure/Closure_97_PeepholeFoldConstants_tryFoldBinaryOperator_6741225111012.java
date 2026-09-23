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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317013;
     Object term317105;
     Object term317520;
     Object term317521;
     Object term317447;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term317105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term317289, term317289.getClass(), "first", term317381);
        setField(term317197, term317197.getClass(), "next", term317289);
        setField(term317105, term317105.getClass(), "first", term317197);
        setIntField(term317105, term317105.getClass(), "type", 86);
        term317520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term317520, term317520.getClass(), "currentTraversal", null);
        term317521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term317521, term317521.getClass(), "number", 0.0);
        setIntField(term317521, term317521.getClass(), "type", 86);
        setField(term317521, term317521.getClass(), "next", null);
        setDoubleField(term317522, term317522.getClass(), "number", 0.0);
        setIntField(term317522, term317522.getClass(), "type", 0);
        setDoubleField(term317523, term317523.getClass(), "number", 0.0);
        setIntField(term317523, term317523.getClass(), "type", 0);
        setField(term317523, term317523.getClass(), "next", null);
        setDoubleField(term317524, term317524.getClass(), "number", 0.0);
        setIntField(term317524, term317524.getClass(), "type", 0);
        setField(term317524, term317524.getClass(), "next", null);
        setField(term317524, term317524.getClass(), "first", null);
        setField(term317524, term317524.getClass(), "last", null);
        setField(term317524, term317524.getClass(), "propListHead", null);
        setIntField(term317524, term317524.getClass(), "sourcePosition", 0);
        setField(term317524, term317524.getClass(), "jsType", null);
        setField(term317524, term317524.getClass(), "parent", null);
        setField(term317523, term317523.getClass(), "first", term317524);
        setField(term317523, term317523.getClass(), "last", null);
        setField(term317523, term317523.getClass(), "propListHead", null);
        setIntField(term317523, term317523.getClass(), "sourcePosition", 0);
        setField(term317523, term317523.getClass(), "jsType", null);
        setField(term317523, term317523.getClass(), "parent", null);
        setField(term317522, term317522.getClass(), "next", term317523);
        setField(term317522, term317522.getClass(), "first", null);
        setField(term317522, term317522.getClass(), "last", null);
        setField(term317522, term317522.getClass(), "propListHead", null);
        setIntField(term317522, term317522.getClass(), "sourcePosition", 0);
        setField(term317522, term317522.getClass(), "jsType", null);
        setField(term317522, term317522.getClass(), "parent", null);
        setField(term317521, term317521.getClass(), "first", term317522);
        setField(term317521, term317521.getClass(), "last", null);
        setField(term317521, term317521.getClass(), "propListHead", null);
        setIntField(term317521, term317521.getClass(), "sourcePosition", 0);
        setField(term317521, term317521.getClass(), "jsType", null);
        setField(term317521, term317521.getClass(), "parent", null);
        term317447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term317456 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term317447, term317447.getClass(), "number", 0.0);
        setIntField(term317447, term317447.getClass(), "type", 86);
        setField(term317447, term317447.getClass(), "next", null);
        setDoubleField(term317450, term317450.getClass(), "number", 0.0);
        setIntField(term317450, term317450.getClass(), "type", 0);
        setDoubleField(term317453, term317453.getClass(), "number", 0.0);
        setIntField(term317453, term317453.getClass(), "type", 0);
        setField(term317453, term317453.getClass(), "next", null);
        setDoubleField(term317456, term317456.getClass(), "number", 0.0);
        setIntField(term317456, term317456.getClass(), "type", 0);
        setField(term317456, term317456.getClass(), "next", null);
        setField(term317456, term317456.getClass(), "first", null);
        setField(term317456, term317456.getClass(), "last", null);
        setField(term317456, term317456.getClass(), "propListHead", null);
        setIntField(term317456, term317456.getClass(), "sourcePosition", 0);
        setField(term317456, term317456.getClass(), "jsType", null);
        setField(term317456, term317456.getClass(), "parent", null);
        setField(term317453, term317453.getClass(), "first", term317456);
        setField(term317453, term317453.getClass(), "last", null);
        setField(term317453, term317453.getClass(), "propListHead", null);
        setIntField(term317453, term317453.getClass(), "sourcePosition", 0);
        setField(term317453, term317453.getClass(), "jsType", null);
        setField(term317453, term317453.getClass(), "parent", null);
        setField(term317450, term317450.getClass(), "next", term317453);
        setField(term317450, term317450.getClass(), "first", null);
        setField(term317450, term317450.getClass(), "last", null);
        setField(term317450, term317450.getClass(), "propListHead", null);
        setIntField(term317450, term317450.getClass(), "sourcePosition", 0);
        setField(term317450, term317450.getClass(), "jsType", null);
        setField(term317450, term317450.getClass(), "parent", null);
        setField(term317447, term317447.getClass(), "first", term317450);
        setField(term317447, term317447.getClass(), "last", null);
        setField(term317447, term317447.getClass(), "propListHead", null);
        setIntField(term317447, term317447.getClass(), "sourcePosition", 0);
        setField(term317447, term317447.getClass(), "jsType", null);
        setField(term317447, term317447.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term317105;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term317013, args);
        assertTrue(recursiveEquals(term317013, term317520));
        assertTrue(recursiveEquals(term317105, term317521));
        assertTrue(recursiveEquals(retValue, term317447));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58761;
     Object term58853;
     Object term59261;
     Object term59262;
     Object term59240;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term58853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term58923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58853, term58853.getClass(), "first", term58853);
        setField(term58853, term58853.getClass(), "next", term58923);
        setIntField(term58853, term58853.getClass(), "type", 22);
        term59261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term59261, term59261.getClass(), "currentTraversal", null);
        term59262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59262, term59262.getClass(), "str", null);
        setIntField(term59262, term59262.getClass(), "type", 22);
        setIntField(term59263, term59263.getClass(), "type", 0);
        setField(term59263, term59263.getClass(), "next", null);
        setField(term59263, term59263.getClass(), "first", null);
        setField(term59263, term59263.getClass(), "last", null);
        setField(term59263, term59263.getClass(), "propListHead", null);
        setIntField(term59263, term59263.getClass(), "sourcePosition", 0);
        setField(term59263, term59263.getClass(), "jsType", null);
        setField(term59263, term59263.getClass(), "parent", null);
        setField(term59262, term59262.getClass(), "next", term59263);
        setField(term59262, term59262.getClass(), "first", term59262);
        setField(term59262, term59262.getClass(), "last", null);
        setField(term59262, term59262.getClass(), "propListHead", null);
        setIntField(term59262, term59262.getClass(), "sourcePosition", 0);
        setField(term59262, term59262.getClass(), "jsType", null);
        setField(term59262, term59262.getClass(), "parent", null);
        term59240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term59242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59240, term59240.getClass(), "str", null);
        setIntField(term59240, term59240.getClass(), "type", 22);
        setIntField(term59242, term59242.getClass(), "type", 0);
        setField(term59242, term59242.getClass(), "next", null);
        setField(term59242, term59242.getClass(), "first", null);
        setField(term59242, term59242.getClass(), "last", null);
        setField(term59242, term59242.getClass(), "propListHead", null);
        setIntField(term59242, term59242.getClass(), "sourcePosition", 0);
        setField(term59242, term59242.getClass(), "jsType", null);
        setField(term59242, term59242.getClass(), "parent", null);
        setField(term59240, term59240.getClass(), "next", term59242);
        setField(term59240, term59240.getClass(), "first", term59240);
        setField(term59240, term59240.getClass(), "last", null);
        setField(term59240, term59240.getClass(), "propListHead", null);
        setIntField(term59240, term59240.getClass(), "sourcePosition", 0);
        setField(term59240, term59240.getClass(), "jsType", null);
        setField(term59240, term59240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58853;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term58761, args);
        assertTrue(recursiveEquals(term58761, term59261));
        assertTrue(recursiveEquals(term58853, term59262));
        assertTrue(recursiveEquals(retValue, term59240));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154280;
     Object term154372;
     Object term154395;
     Object term154396;
     Object term154376;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term154372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term154372, term154372.getClass(), "first", term154372);
        setField(term154372, term154372.getClass(), "next", term154372);
        setIntField(term154372, term154372.getClass(), "type", 33);
        term154395 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term154395, term154395.getClass(), "currentTraversal", null);
        term154396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term154396, term154396.getClass(), "str", null);
        setIntField(term154396, term154396.getClass(), "type", 33);
        setField(term154396, term154396.getClass(), "next", term154396);
        setField(term154396, term154396.getClass(), "first", term154396);
        setField(term154396, term154396.getClass(), "last", null);
        setField(term154396, term154396.getClass(), "propListHead", null);
        setIntField(term154396, term154396.getClass(), "sourcePosition", 0);
        setField(term154396, term154396.getClass(), "jsType", null);
        setField(term154396, term154396.getClass(), "parent", null);
        term154376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term154376, term154376.getClass(), "str", null);
        setIntField(term154376, term154376.getClass(), "type", 33);
        setField(term154376, term154376.getClass(), "next", term154376);
        setField(term154376, term154376.getClass(), "first", term154376);
        setField(term154376, term154376.getClass(), "last", null);
        setField(term154376, term154376.getClass(), "propListHead", null);
        setIntField(term154376, term154376.getClass(), "sourcePosition", 0);
        setField(term154376, term154376.getClass(), "jsType", null);
        setField(term154376, term154376.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term154372;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term154280, args);
        assertTrue(recursiveEquals(term154280, term154395));
        assertTrue(recursiveEquals(term154372, term154396));
        assertTrue(recursiveEquals(retValue, term154376));
    }

};



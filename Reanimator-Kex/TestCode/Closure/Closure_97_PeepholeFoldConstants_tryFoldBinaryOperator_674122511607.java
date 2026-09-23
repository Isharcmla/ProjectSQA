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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158772;
     Object term158864;
     Object term159539;
     Object term159540;
     Object term159491;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term158864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term158956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158956, term158956.getClass(), "next", term159048);
        setField(term158864, term158864.getClass(), "first", term158956);
        setIntField(term158864, term158864.getClass(), "type", 21);
        term159539 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term159539, term159539.getClass(), "currentTraversal", null);
        term159540 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159541 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159542 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term159540, term159540.getClass(), "str", null);
        setIntField(term159540, term159540.getClass(), "type", 21);
        setField(term159540, term159540.getClass(), "next", null);
        setField(term159541, term159541.getClass(), "str", null);
        setIntField(term159541, term159541.getClass(), "type", 0);
        setField(term159542, term159542.getClass(), "str", null);
        setIntField(term159542, term159542.getClass(), "type", 0);
        setField(term159542, term159542.getClass(), "next", null);
        setField(term159542, term159542.getClass(), "first", null);
        setField(term159542, term159542.getClass(), "last", null);
        setField(term159542, term159542.getClass(), "propListHead", null);
        setIntField(term159542, term159542.getClass(), "sourcePosition", 0);
        setField(term159542, term159542.getClass(), "jsType", null);
        setField(term159542, term159542.getClass(), "parent", null);
        setField(term159541, term159541.getClass(), "next", term159542);
        setField(term159541, term159541.getClass(), "first", null);
        setField(term159541, term159541.getClass(), "last", null);
        setField(term159541, term159541.getClass(), "propListHead", null);
        setIntField(term159541, term159541.getClass(), "sourcePosition", 0);
        setField(term159541, term159541.getClass(), "jsType", null);
        setField(term159541, term159541.getClass(), "parent", null);
        setField(term159540, term159540.getClass(), "first", term159541);
        setField(term159540, term159540.getClass(), "last", null);
        setField(term159540, term159540.getClass(), "propListHead", null);
        setIntField(term159540, term159540.getClass(), "sourcePosition", 0);
        setField(term159540, term159540.getClass(), "jsType", null);
        setField(term159540, term159540.getClass(), "parent", null);
        term159491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term159491, term159491.getClass(), "str", null);
        setIntField(term159491, term159491.getClass(), "type", 21);
        setField(term159491, term159491.getClass(), "next", null);
        setField(term159493, term159493.getClass(), "str", null);
        setIntField(term159493, term159493.getClass(), "type", 0);
        setField(term159495, term159495.getClass(), "str", null);
        setIntField(term159495, term159495.getClass(), "type", 0);
        setField(term159495, term159495.getClass(), "next", null);
        setField(term159495, term159495.getClass(), "first", null);
        setField(term159495, term159495.getClass(), "last", null);
        setField(term159495, term159495.getClass(), "propListHead", null);
        setIntField(term159495, term159495.getClass(), "sourcePosition", 0);
        setField(term159495, term159495.getClass(), "jsType", null);
        setField(term159495, term159495.getClass(), "parent", null);
        setField(term159493, term159493.getClass(), "next", term159495);
        setField(term159493, term159493.getClass(), "first", null);
        setField(term159493, term159493.getClass(), "last", null);
        setField(term159493, term159493.getClass(), "propListHead", null);
        setIntField(term159493, term159493.getClass(), "sourcePosition", 0);
        setField(term159493, term159493.getClass(), "jsType", null);
        setField(term159493, term159493.getClass(), "parent", null);
        setField(term159491, term159491.getClass(), "first", term159493);
        setField(term159491, term159491.getClass(), "last", null);
        setField(term159491, term159491.getClass(), "propListHead", null);
        setIntField(term159491, term159491.getClass(), "sourcePosition", 0);
        setField(term159491, term159491.getClass(), "jsType", null);
        setField(term159491, term159491.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term158864;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term158772, args);
        assertTrue(recursiveEquals(term158772, term159539));
        assertTrue(recursiveEquals(term158864, term159540));
        assertTrue(recursiveEquals(retValue, term159491));
    }

};



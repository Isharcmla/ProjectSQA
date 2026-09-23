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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212768;
     Object term212860;
     Object term213091;
     Object term213092;
     Object term213053;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term212860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term212952, term212952.getClass(), "next", term213044);
        setField(term212860, term212860.getClass(), "first", term212952);
        setIntField(term212860, term212860.getClass(), "type", 11);
        term213091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term213091, term213091.getClass(), "currentTraversal", null);
        term213092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213093 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term213092, term213092.getClass(), "number", 0.0);
        setIntField(term213092, term213092.getClass(), "type", 11);
        setField(term213092, term213092.getClass(), "next", null);
        setDoubleField(term213093, term213093.getClass(), "number", 0.0);
        setIntField(term213093, term213093.getClass(), "type", 0);
        setDoubleField(term213094, term213094.getClass(), "number", 0.0);
        setIntField(term213094, term213094.getClass(), "type", 0);
        setField(term213094, term213094.getClass(), "next", null);
        setField(term213094, term213094.getClass(), "first", null);
        setField(term213094, term213094.getClass(), "last", null);
        setField(term213094, term213094.getClass(), "propListHead", null);
        setIntField(term213094, term213094.getClass(), "sourcePosition", 0);
        setField(term213094, term213094.getClass(), "jsType", null);
        setField(term213094, term213094.getClass(), "parent", null);
        setField(term213093, term213093.getClass(), "next", term213094);
        setField(term213093, term213093.getClass(), "first", null);
        setField(term213093, term213093.getClass(), "last", null);
        setField(term213093, term213093.getClass(), "propListHead", null);
        setIntField(term213093, term213093.getClass(), "sourcePosition", 0);
        setField(term213093, term213093.getClass(), "jsType", null);
        setField(term213093, term213093.getClass(), "parent", null);
        setField(term213092, term213092.getClass(), "first", term213093);
        setField(term213092, term213092.getClass(), "last", null);
        setField(term213092, term213092.getClass(), "propListHead", null);
        setIntField(term213092, term213092.getClass(), "sourcePosition", 0);
        setField(term213092, term213092.getClass(), "jsType", null);
        setField(term213092, term213092.getClass(), "parent", null);
        term213053 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213056 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term213053, term213053.getClass(), "number", 0.0);
        setIntField(term213053, term213053.getClass(), "type", 11);
        setField(term213053, term213053.getClass(), "next", null);
        setDoubleField(term213056, term213056.getClass(), "number", 0.0);
        setIntField(term213056, term213056.getClass(), "type", 0);
        setDoubleField(term213059, term213059.getClass(), "number", 0.0);
        setIntField(term213059, term213059.getClass(), "type", 0);
        setField(term213059, term213059.getClass(), "next", null);
        setField(term213059, term213059.getClass(), "first", null);
        setField(term213059, term213059.getClass(), "last", null);
        setField(term213059, term213059.getClass(), "propListHead", null);
        setIntField(term213059, term213059.getClass(), "sourcePosition", 0);
        setField(term213059, term213059.getClass(), "jsType", null);
        setField(term213059, term213059.getClass(), "parent", null);
        setField(term213056, term213056.getClass(), "next", term213059);
        setField(term213056, term213056.getClass(), "first", null);
        setField(term213056, term213056.getClass(), "last", null);
        setField(term213056, term213056.getClass(), "propListHead", null);
        setIntField(term213056, term213056.getClass(), "sourcePosition", 0);
        setField(term213056, term213056.getClass(), "jsType", null);
        setField(term213056, term213056.getClass(), "parent", null);
        setField(term213053, term213053.getClass(), "first", term213056);
        setField(term213053, term213053.getClass(), "last", null);
        setField(term213053, term213053.getClass(), "propListHead", null);
        setIntField(term213053, term213053.getClass(), "sourcePosition", 0);
        setField(term213053, term213053.getClass(), "jsType", null);
        setField(term213053, term213053.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term212860;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term212768, args);
        assertTrue(recursiveEquals(term212768, term213091));
        assertTrue(recursiveEquals(term212860, term213092));
        assertTrue(recursiveEquals(retValue, term213053));
    }

};



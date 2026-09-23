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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662574;
     Object term662666;
     Object term663079;
     Object term663080;
     Object term663023;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term662666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term662758 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term662850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term662850, term662850.getClass(), "type", 14);
        setField(term662758, term662758.getClass(), "next", term662850);
        setIntField(term662758, term662758.getClass(), "type", 42);
        setField(term662666, term662666.getClass(), "first", term662758);
        setIntField(term662666, term662666.getClass(), "type", 14);
        term663079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term663079, term663079.getClass(), "currentTraversal", null);
        term663080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term663080, term663080.getClass(), "number", 0.0);
        setIntField(term663080, term663080.getClass(), "type", 14);
        setField(term663080, term663080.getClass(), "next", null);
        setDoubleField(term663081, term663081.getClass(), "number", 0.0);
        setIntField(term663081, term663081.getClass(), "type", 42);
        setDoubleField(term663082, term663082.getClass(), "number", 0.0);
        setIntField(term663082, term663082.getClass(), "type", 14);
        setField(term663082, term663082.getClass(), "next", null);
        setField(term663082, term663082.getClass(), "first", null);
        setField(term663082, term663082.getClass(), "last", null);
        setField(term663082, term663082.getClass(), "propListHead", null);
        setIntField(term663082, term663082.getClass(), "sourcePosition", 0);
        setField(term663082, term663082.getClass(), "jsType", null);
        setField(term663082, term663082.getClass(), "parent", null);
        setField(term663081, term663081.getClass(), "next", term663082);
        setField(term663081, term663081.getClass(), "first", null);
        setField(term663081, term663081.getClass(), "last", null);
        setField(term663081, term663081.getClass(), "propListHead", null);
        setIntField(term663081, term663081.getClass(), "sourcePosition", 0);
        setField(term663081, term663081.getClass(), "jsType", null);
        setField(term663081, term663081.getClass(), "parent", null);
        setField(term663080, term663080.getClass(), "first", term663081);
        setField(term663080, term663080.getClass(), "last", null);
        setField(term663080, term663080.getClass(), "propListHead", null);
        setIntField(term663080, term663080.getClass(), "sourcePosition", 0);
        setField(term663080, term663080.getClass(), "jsType", null);
        setField(term663080, term663080.getClass(), "parent", null);
        term663023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term663029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term663023, term663023.getClass(), "number", 0.0);
        setIntField(term663023, term663023.getClass(), "type", 14);
        setField(term663023, term663023.getClass(), "next", null);
        setDoubleField(term663026, term663026.getClass(), "number", 0.0);
        setIntField(term663026, term663026.getClass(), "type", 42);
        setDoubleField(term663029, term663029.getClass(), "number", 0.0);
        setIntField(term663029, term663029.getClass(), "type", 14);
        setField(term663029, term663029.getClass(), "next", null);
        setField(term663029, term663029.getClass(), "first", null);
        setField(term663029, term663029.getClass(), "last", null);
        setField(term663029, term663029.getClass(), "propListHead", null);
        setIntField(term663029, term663029.getClass(), "sourcePosition", 0);
        setField(term663029, term663029.getClass(), "jsType", null);
        setField(term663029, term663029.getClass(), "parent", null);
        setField(term663026, term663026.getClass(), "next", term663029);
        setField(term663026, term663026.getClass(), "first", null);
        setField(term663026, term663026.getClass(), "last", null);
        setField(term663026, term663026.getClass(), "propListHead", null);
        setIntField(term663026, term663026.getClass(), "sourcePosition", 0);
        setField(term663026, term663026.getClass(), "jsType", null);
        setField(term663026, term663026.getClass(), "parent", null);
        setField(term663023, term663023.getClass(), "first", term663026);
        setField(term663023, term663023.getClass(), "last", null);
        setField(term663023, term663023.getClass(), "propListHead", null);
        setIntField(term663023, term663023.getClass(), "sourcePosition", 0);
        setField(term663023, term663023.getClass(), "jsType", null);
        setField(term663023, term663023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term662666;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term662574, args);
        assertTrue(recursiveEquals(term662574, term663079));
        assertTrue(recursiveEquals(term662666, term663080));
        assertTrue(recursiveEquals(retValue, term663023));
    }

};



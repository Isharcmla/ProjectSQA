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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175450;
     Object term175542;
     Object term176064;
     Object term176065;
     Object term176023;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175450 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term175542 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175726 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term175634, term175634.getClass(), "next", term175726);
        setField(term175542, term175542.getClass(), "first", term175634);
        setIntField(term175542, term175542.getClass(), "type", 46);
        term176064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176064, term176064.getClass(), "currentTraversal", null);
        term176065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term176065, term176065.getClass(), "number", 0.0);
        setIntField(term176065, term176065.getClass(), "type", 46);
        setField(term176065, term176065.getClass(), "next", null);
        setDoubleField(term176066, term176066.getClass(), "number", 0.0);
        setIntField(term176066, term176066.getClass(), "type", 0);
        setDoubleField(term176067, term176067.getClass(), "number", 0.0);
        setIntField(term176067, term176067.getClass(), "type", 0);
        setField(term176067, term176067.getClass(), "next", null);
        setField(term176067, term176067.getClass(), "first", null);
        setField(term176067, term176067.getClass(), "last", null);
        setField(term176067, term176067.getClass(), "propListHead", null);
        setIntField(term176067, term176067.getClass(), "sourcePosition", 0);
        setField(term176067, term176067.getClass(), "jsType", null);
        setField(term176067, term176067.getClass(), "parent", null);
        setField(term176066, term176066.getClass(), "next", term176067);
        setField(term176066, term176066.getClass(), "first", null);
        setField(term176066, term176066.getClass(), "last", null);
        setField(term176066, term176066.getClass(), "propListHead", null);
        setIntField(term176066, term176066.getClass(), "sourcePosition", 0);
        setField(term176066, term176066.getClass(), "jsType", null);
        setField(term176066, term176066.getClass(), "parent", null);
        setField(term176065, term176065.getClass(), "first", term176066);
        setField(term176065, term176065.getClass(), "last", null);
        setField(term176065, term176065.getClass(), "propListHead", null);
        setIntField(term176065, term176065.getClass(), "sourcePosition", 0);
        setField(term176065, term176065.getClass(), "jsType", null);
        setField(term176065, term176065.getClass(), "parent", null);
        term176023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term176023, term176023.getClass(), "number", 0.0);
        setIntField(term176023, term176023.getClass(), "type", 46);
        setField(term176023, term176023.getClass(), "next", null);
        setDoubleField(term176026, term176026.getClass(), "number", 0.0);
        setIntField(term176026, term176026.getClass(), "type", 0);
        setDoubleField(term176029, term176029.getClass(), "number", 0.0);
        setIntField(term176029, term176029.getClass(), "type", 0);
        setField(term176029, term176029.getClass(), "next", null);
        setField(term176029, term176029.getClass(), "first", null);
        setField(term176029, term176029.getClass(), "last", null);
        setField(term176029, term176029.getClass(), "propListHead", null);
        setIntField(term176029, term176029.getClass(), "sourcePosition", 0);
        setField(term176029, term176029.getClass(), "jsType", null);
        setField(term176029, term176029.getClass(), "parent", null);
        setField(term176026, term176026.getClass(), "next", term176029);
        setField(term176026, term176026.getClass(), "first", null);
        setField(term176026, term176026.getClass(), "last", null);
        setField(term176026, term176026.getClass(), "propListHead", null);
        setIntField(term176026, term176026.getClass(), "sourcePosition", 0);
        setField(term176026, term176026.getClass(), "jsType", null);
        setField(term176026, term176026.getClass(), "parent", null);
        setField(term176023, term176023.getClass(), "first", term176026);
        setField(term176023, term176023.getClass(), "last", null);
        setField(term176023, term176023.getClass(), "propListHead", null);
        setIntField(term176023, term176023.getClass(), "sourcePosition", 0);
        setField(term176023, term176023.getClass(), "jsType", null);
        setField(term176023, term176023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term175542;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term175450, args);
        assertTrue(recursiveEquals(term175450, term176064));
        assertTrue(recursiveEquals(term175542, term176065));
        assertTrue(recursiveEquals(retValue, term176023));
    }

};



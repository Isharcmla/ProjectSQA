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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208391;
     Object term208483;
     Object term208708;
     Object term208709;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208391 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term208483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term208575, term208575.getClass(), "type", 33);
        setField(term208575, term208575.getClass(), "first", term208667);
        setField(term208483, term208483.getClass(), "first", term208575);
        term208708 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term208708, term208708.getClass(), "propertyTestFunctions", null);
        term208709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term208711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term208709, term208709.getClass(), "str", null);
        setIntField(term208709, term208709.getClass(), "type", 0);
        setField(term208709, term208709.getClass(), "next", null);
        setField(term208710, term208710.getClass(), "str", null);
        setIntField(term208710, term208710.getClass(), "type", 33);
        setField(term208710, term208710.getClass(), "next", null);
        setDoubleField(term208711, term208711.getClass(), "number", 0.0);
        setIntField(term208711, term208711.getClass(), "type", 0);
        setField(term208711, term208711.getClass(), "next", null);
        setField(term208711, term208711.getClass(), "first", null);
        setField(term208711, term208711.getClass(), "last", null);
        setField(term208711, term208711.getClass(), "propListHead", null);
        setIntField(term208711, term208711.getClass(), "sourcePosition", 0);
        setField(term208711, term208711.getClass(), "jsType", null);
        setField(term208711, term208711.getClass(), "parent", null);
        setField(term208710, term208710.getClass(), "first", term208711);
        setField(term208710, term208710.getClass(), "last", null);
        setField(term208710, term208710.getClass(), "propListHead", null);
        setIntField(term208710, term208710.getClass(), "sourcePosition", 0);
        setField(term208710, term208710.getClass(), "jsType", null);
        setField(term208710, term208710.getClass(), "parent", null);
        setField(term208709, term208709.getClass(), "first", term208710);
        setField(term208709, term208709.getClass(), "last", null);
        setField(term208709, term208709.getClass(), "propListHead", null);
        setIntField(term208709, term208709.getClass(), "sourcePosition", 0);
        setField(term208709, term208709.getClass(), "jsType", null);
        setField(term208709, term208709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term208483;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term208391, args);
        assertTrue(recursiveEquals(term208391, term208708));
        assertTrue(recursiveEquals(term208483, term208709));
        assertTrue(recursiveEquals(retValue, null));
    }

};



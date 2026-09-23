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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167590;
     Object term167682;
     Object term178123;
     Object term178124;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167590 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term167682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term167774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167774, term167774.getClass(), "type", 42);
        setField(term167682, term167682.getClass(), "first", term167774);
        term178123 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term178123, term178123.getClass(), "propertyTestFunctions", null);
        term178124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term178125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term178124, term178124.getClass(), "str", null);
        setIntField(term178124, term178124.getClass(), "type", 0);
        setField(term178124, term178124.getClass(), "next", null);
        setDoubleField(term178125, term178125.getClass(), "number", 0.0);
        setIntField(term178125, term178125.getClass(), "type", 42);
        setField(term178125, term178125.getClass(), "next", null);
        setField(term178125, term178125.getClass(), "first", null);
        setField(term178125, term178125.getClass(), "last", null);
        setField(term178125, term178125.getClass(), "propListHead", null);
        setIntField(term178125, term178125.getClass(), "sourcePosition", 0);
        setField(term178125, term178125.getClass(), "jsType", null);
        setField(term178125, term178125.getClass(), "parent", null);
        setField(term178124, term178124.getClass(), "first", term178125);
        setField(term178124, term178124.getClass(), "last", null);
        setField(term178124, term178124.getClass(), "propListHead", null);
        setIntField(term178124, term178124.getClass(), "sourcePosition", 0);
        setField(term178124, term178124.getClass(), "jsType", null);
        setField(term178124, term178124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term167682;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term167590, args);
        assertTrue(recursiveEquals(term167590, term178123));
        assertTrue(recursiveEquals(term167682, term178124));
        assertTrue(recursiveEquals(retValue, null));
    }

};



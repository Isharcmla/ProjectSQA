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

public class CheckAccessControls_getClassOfMethod_1679898606195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54362;
     Object term54454;
     Object term54546;
     Object term54859;
     Object term54860;
     Object term54861;

    public CheckAccessControls_getClassOfMethod_1679898606195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54362 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term54454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term54546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54546, term54546.getClass(), "type", -87);
        term54859 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term54859, term54859.getClass(), "compiler", null);
        setField(term54859, term54859.getClass(), "validator", null);
        setIntField(term54859, term54859.getClass(), "deprecatedDepth", 0);
        setIntField(term54859, term54859.getClass(), "methodDepth", 0);
        setField(term54859, term54859.getClass(), "currentClass", null);
        setField(term54859, term54859.getClass(), "initializedConstantProperties", null);
        term54860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term54860, term54860.getClass(), "number", 0.0);
        setIntField(term54860, term54860.getClass(), "type", -87);
        setField(term54860, term54860.getClass(), "next", null);
        setField(term54860, term54860.getClass(), "first", null);
        setField(term54860, term54860.getClass(), "last", null);
        setField(term54860, term54860.getClass(), "propListHead", null);
        setIntField(term54860, term54860.getClass(), "sourcePosition", 0);
        setField(term54860, term54860.getClass(), "jsType", null);
        setField(term54860, term54860.getClass(), "parent", null);
        term54861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term54861, term54861.getClass(), "str", null);
        setIntField(term54861, term54861.getClass(), "type", 0);
        setField(term54861, term54861.getClass(), "next", null);
        setField(term54861, term54861.getClass(), "first", null);
        setField(term54861, term54861.getClass(), "last", null);
        setField(term54861, term54861.getClass(), "propListHead", null);
        setIntField(term54861, term54861.getClass(), "sourcePosition", 0);
        setField(term54861, term54861.getClass(), "jsType", null);
        setField(term54861, term54861.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term54454;
        args[1] = term54546;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term54362, args);
        assertTrue(recursiveEquals(term54362, term54859));
        assertTrue(recursiveEquals(term54454, term54860));
        assertTrue(recursiveEquals(term54546, term54861));
        assertTrue(recursiveEquals(retValue, null));
    }

};



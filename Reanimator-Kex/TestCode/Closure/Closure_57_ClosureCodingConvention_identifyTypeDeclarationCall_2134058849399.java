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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143367;
     Object term143459;
     Object term143480;
     Object term143481;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143367 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term143459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term143459, term143459.getClass(), "first", term143459);
        setIntField(term143459, term143459.getClass(), "type", 42);
        term143480 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term143480, term143480.getClass(), "propertyTestFunctions", null);
        term143481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term143481, term143481.getClass(), "str", null);
        setIntField(term143481, term143481.getClass(), "type", 42);
        setField(term143481, term143481.getClass(), "next", null);
        setField(term143481, term143481.getClass(), "first", term143481);
        setField(term143481, term143481.getClass(), "last", null);
        setField(term143481, term143481.getClass(), "propListHead", null);
        setIntField(term143481, term143481.getClass(), "sourcePosition", 0);
        setField(term143481, term143481.getClass(), "jsType", null);
        setField(term143481, term143481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143459;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term143367, args);
        assertTrue(recursiveEquals(term143367, term143480));
        assertTrue(recursiveEquals(term143459, term143481));
        assertTrue(recursiveEquals(retValue, null));
    }

};



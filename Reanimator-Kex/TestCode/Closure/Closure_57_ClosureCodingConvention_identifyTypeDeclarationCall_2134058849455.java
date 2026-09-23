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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152294;
     Object term152386;
     Object term152503;
     Object term152504;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152294 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term152386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term152478, term152478.getClass(), "type", 42);
        setField(term152386, term152386.getClass(), "first", term152478);
        term152503 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term152503, term152503.getClass(), "propertyTestFunctions", null);
        term152504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term152504, term152504.getClass(), "number", 0.0);
        setIntField(term152504, term152504.getClass(), "type", 0);
        setField(term152504, term152504.getClass(), "next", null);
        setField(term152505, term152505.getClass(), "str", null);
        setIntField(term152505, term152505.getClass(), "type", 42);
        setField(term152505, term152505.getClass(), "next", null);
        setField(term152505, term152505.getClass(), "first", null);
        setField(term152505, term152505.getClass(), "last", null);
        setField(term152505, term152505.getClass(), "propListHead", null);
        setIntField(term152505, term152505.getClass(), "sourcePosition", 0);
        setField(term152505, term152505.getClass(), "jsType", null);
        setField(term152505, term152505.getClass(), "parent", null);
        setField(term152504, term152504.getClass(), "first", term152505);
        setField(term152504, term152504.getClass(), "last", null);
        setField(term152504, term152504.getClass(), "propListHead", null);
        setIntField(term152504, term152504.getClass(), "sourcePosition", 0);
        setField(term152504, term152504.getClass(), "jsType", null);
        setField(term152504, term152504.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term152386;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term152294, args);
        assertTrue(recursiveEquals(term152294, term152503));
        assertTrue(recursiveEquals(term152386, term152504));
        assertTrue(recursiveEquals(retValue, null));
    }

};



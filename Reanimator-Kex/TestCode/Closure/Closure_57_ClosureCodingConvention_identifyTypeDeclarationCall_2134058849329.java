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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129070;
     Object term129162;
     Object term129316;
     Object term129317;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129070 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term129162 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term129162, term129162.getClass(), "first", term129254);
        term129316 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term129316, term129316.getClass(), "propertyTestFunctions", null);
        term129317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term129317, term129317.getClass(), "number", 0.0);
        setIntField(term129317, term129317.getClass(), "type", 0);
        setField(term129317, term129317.getClass(), "next", null);
        setDoubleField(term129318, term129318.getClass(), "number", 0.0);
        setIntField(term129318, term129318.getClass(), "type", 0);
        setField(term129318, term129318.getClass(), "next", null);
        setField(term129318, term129318.getClass(), "first", null);
        setField(term129318, term129318.getClass(), "last", null);
        setField(term129318, term129318.getClass(), "propListHead", null);
        setIntField(term129318, term129318.getClass(), "sourcePosition", 0);
        setField(term129318, term129318.getClass(), "jsType", null);
        setField(term129318, term129318.getClass(), "parent", null);
        setField(term129317, term129317.getClass(), "first", term129318);
        setField(term129317, term129317.getClass(), "last", null);
        setField(term129317, term129317.getClass(), "propListHead", null);
        setIntField(term129317, term129317.getClass(), "sourcePosition", 0);
        setField(term129317, term129317.getClass(), "jsType", null);
        setField(term129317, term129317.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129162;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term129070, args);
        assertTrue(recursiveEquals(term129070, term129316));
        assertTrue(recursiveEquals(term129162, term129317));
        assertTrue(recursiveEquals(retValue, null));
    }

};



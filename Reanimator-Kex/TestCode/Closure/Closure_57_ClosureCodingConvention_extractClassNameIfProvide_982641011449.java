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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151072;
     Object term151164;
     Object term151314;
     Object term151315;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151072 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term151164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term151164, term151164.getClass(), "type", 130);
        setField(term151164, term151164.getClass(), "first", term151256);
        term151314 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term151314, term151314.getClass(), "propertyTestFunctions", null);
        term151315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term151316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term151315, term151315.getClass(), "number", 0.0);
        setIntField(term151315, term151315.getClass(), "type", 130);
        setField(term151315, term151315.getClass(), "next", null);
        setDoubleField(term151316, term151316.getClass(), "number", 0.0);
        setIntField(term151316, term151316.getClass(), "type", 0);
        setField(term151316, term151316.getClass(), "next", null);
        setField(term151316, term151316.getClass(), "first", null);
        setField(term151316, term151316.getClass(), "last", null);
        setField(term151316, term151316.getClass(), "propListHead", null);
        setIntField(term151316, term151316.getClass(), "sourcePosition", 0);
        setField(term151316, term151316.getClass(), "jsType", null);
        setField(term151316, term151316.getClass(), "parent", null);
        setField(term151315, term151315.getClass(), "first", term151316);
        setField(term151315, term151315.getClass(), "last", null);
        setField(term151315, term151315.getClass(), "propListHead", null);
        setIntField(term151315, term151315.getClass(), "sourcePosition", 0);
        setField(term151315, term151315.getClass(), "jsType", null);
        setField(term151315, term151315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term151164;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term151072, args);
        assertTrue(recursiveEquals(term151072, term151314));
        assertTrue(recursiveEquals(term151164, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



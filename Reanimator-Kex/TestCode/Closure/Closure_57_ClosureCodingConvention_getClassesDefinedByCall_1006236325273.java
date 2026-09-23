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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118730;
     Object term118822;
     Object term118938;
     Object term118939;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118730 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term118822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term118822, term118822.getClass(), "first", term118914);
        term118938 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term118938, term118938.getClass(), "propertyTestFunctions", null);
        term118939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term118939, term118939.getClass(), "number", 0.0);
        setIntField(term118939, term118939.getClass(), "type", 0);
        setField(term118939, term118939.getClass(), "next", null);
        setDoubleField(term118940, term118940.getClass(), "number", 0.0);
        setIntField(term118940, term118940.getClass(), "type", 0);
        setField(term118940, term118940.getClass(), "next", null);
        setField(term118940, term118940.getClass(), "first", null);
        setField(term118940, term118940.getClass(), "last", null);
        setField(term118940, term118940.getClass(), "propListHead", null);
        setIntField(term118940, term118940.getClass(), "sourcePosition", 0);
        setField(term118940, term118940.getClass(), "jsType", null);
        setField(term118940, term118940.getClass(), "parent", null);
        setField(term118939, term118939.getClass(), "first", term118940);
        setField(term118939, term118939.getClass(), "last", null);
        setField(term118939, term118939.getClass(), "propListHead", null);
        setIntField(term118939, term118939.getClass(), "sourcePosition", 0);
        setField(term118939, term118939.getClass(), "jsType", null);
        setField(term118939, term118939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term118822;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term118730, args);
        assertTrue(recursiveEquals(term118730, term118938));
        assertTrue(recursiveEquals(term118822, term118939));
        assertTrue(recursiveEquals(retValue, null));
    }

};



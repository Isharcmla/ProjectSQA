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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122017;
     Object term122109;
     Object term122235;
     Object term122236;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122017 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term122109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term122109, term122109.getClass(), "type", 130);
        setField(term122109, term122109.getClass(), "first", term122201);
        term122235 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term122235, term122235.getClass(), "propertyTestFunctions", null);
        term122236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term122236, term122236.getClass(), "str", null);
        setIntField(term122236, term122236.getClass(), "type", 130);
        setField(term122236, term122236.getClass(), "next", null);
        setField(term122237, term122237.getClass(), "str", null);
        setIntField(term122237, term122237.getClass(), "type", 0);
        setField(term122237, term122237.getClass(), "next", null);
        setField(term122237, term122237.getClass(), "first", null);
        setField(term122237, term122237.getClass(), "last", null);
        setField(term122237, term122237.getClass(), "propListHead", null);
        setIntField(term122237, term122237.getClass(), "sourcePosition", 0);
        setField(term122237, term122237.getClass(), "jsType", null);
        setField(term122237, term122237.getClass(), "parent", null);
        setField(term122236, term122236.getClass(), "first", term122237);
        setField(term122236, term122236.getClass(), "last", null);
        setField(term122236, term122236.getClass(), "propListHead", null);
        setIntField(term122236, term122236.getClass(), "sourcePosition", 0);
        setField(term122236, term122236.getClass(), "jsType", null);
        setField(term122236, term122236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term122109;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term122017, args);
        assertTrue(recursiveEquals(term122017, term122235));
        assertTrue(recursiveEquals(term122109, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



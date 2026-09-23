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

public class ClosureCodingConvention_extractClassNameIfGoog_1998914631448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150852;
     Object term151275;

    public ClosureCodingConvention_extractClassNameIfGoog_1998914631448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term150852, term150852.getClass(), "type", 130);
        setField(term150852, term150852.getClass(), "first", term150944);
        term151275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term151276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term151275, term151275.getClass(), "str", null);
        setIntField(term151275, term151275.getClass(), "type", 130);
        setField(term151275, term151275.getClass(), "next", null);
        setField(term151276, term151276.getClass(), "str", null);
        setIntField(term151276, term151276.getClass(), "type", 0);
        setField(term151276, term151276.getClass(), "next", null);
        setField(term151276, term151276.getClass(), "first", null);
        setField(term151276, term151276.getClass(), "last", null);
        setField(term151276, term151276.getClass(), "propListHead", null);
        setIntField(term151276, term151276.getClass(), "sourcePosition", 0);
        setField(term151276, term151276.getClass(), "jsType", null);
        setField(term151276, term151276.getClass(), "parent", null);
        setField(term151275, term151275.getClass(), "first", term151276);
        setField(term151275, term151275.getClass(), "last", null);
        setField(term151275, term151275.getClass(), "propListHead", null);
        setIntField(term151275, term151275.getClass(), "sourcePosition", 0);
        setField(term151275, term151275.getClass(), "jsType", null);
        setField(term151275, term151275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term150852;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term150852, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



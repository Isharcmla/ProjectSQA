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

public class ScopedAliases_process_8406553139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2831;
     Object term2901;
     Object term3288;
     Object term3289;

    public ScopedAliases_process_8406553139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2831 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term2831, term2831.getClass(), "compiler", null);
        term2901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2901, term2901.getClass(), "type", 0);
        setField(term2901, term2901.getClass(), "parent", null);
        setField(term2971, term2971.getClass(), "next", null);
        setIntField(term2971, term2971.getClass(), "type", 0);
        setField(term2971, term2971.getClass(), "first", null);
        setField(term2901, term2901.getClass(), "first", term2971);
        term3288 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term3288, term3288.getClass(), "compiler", null);
        setField(term3288, term3288.getClass(), "preprocessorSymbolTable", null);
        setField(term3288, term3288.getClass(), "transformationHandler", null);
        term3289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3289, term3289.getClass(), "type", 0);
        setField(term3289, term3289.getClass(), "next", null);
        setIntField(term3290, term3290.getClass(), "type", 0);
        setField(term3290, term3290.getClass(), "next", null);
        setField(term3290, term3290.getClass(), "first", null);
        setField(term3290, term3290.getClass(), "last", null);
        setField(term3290, term3290.getClass(), "propListHead", null);
        setIntField(term3290, term3290.getClass(), "sourcePosition", 0);
        setField(term3290, term3290.getClass(), "jsType", null);
        setField(term3290, term3290.getClass(), "parent", null);
        setField(term3289, term3289.getClass(), "first", term3290);
        setField(term3289, term3289.getClass(), "last", null);
        setField(term3289, term3289.getClass(), "propListHead", null);
        setIntField(term3289, term3289.getClass(), "sourcePosition", 0);
        setField(term3289, term3289.getClass(), "jsType", null);
        setField(term3289, term3289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2901;
        callMethod(klass, "process", argTypes, term2831, args);
        assertTrue(recursiveEquals(term2831, term3288));
        assertTrue(recursiveEquals(term2901, null));
    }

};



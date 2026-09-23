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

public class ScopedAliases_hotSwapScript_8834170911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3737;
     Object term3807;
     Object term4232;
     Object term4233;

    public ScopedAliases_hotSwapScript_8834170911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3737 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term3737, term3737.getClass(), "compiler", null);
        term3807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3807, term3807.getClass(), "type", 0);
        setField(term3807, term3807.getClass(), "parent", null);
        setField(term3877, term3877.getClass(), "next", null);
        setIntField(term3877, term3877.getClass(), "type", 0);
        setField(term3877, term3877.getClass(), "first", null);
        setField(term3807, term3807.getClass(), "first", term3877);
        term4232 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term4232, term4232.getClass(), "compiler", null);
        setField(term4232, term4232.getClass(), "preprocessorSymbolTable", null);
        setField(term4232, term4232.getClass(), "transformationHandler", null);
        term4233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4233, term4233.getClass(), "type", 0);
        setField(term4233, term4233.getClass(), "next", null);
        setIntField(term4234, term4234.getClass(), "type", 0);
        setField(term4234, term4234.getClass(), "next", null);
        setField(term4234, term4234.getClass(), "first", null);
        setField(term4234, term4234.getClass(), "last", null);
        setField(term4234, term4234.getClass(), "propListHead", null);
        setIntField(term4234, term4234.getClass(), "sourcePosition", 0);
        setField(term4234, term4234.getClass(), "jsType", null);
        setField(term4234, term4234.getClass(), "parent", null);
        setField(term4233, term4233.getClass(), "first", term4234);
        setField(term4233, term4233.getClass(), "last", null);
        setField(term4233, term4233.getClass(), "propListHead", null);
        setIntField(term4233, term4233.getClass(), "sourcePosition", 0);
        setField(term4233, term4233.getClass(), "jsType", null);
        setField(term4233, term4233.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3807;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term3737, args);
        assertTrue(recursiveEquals(term3737, term4232));
        assertTrue(recursiveEquals(term3807, term4233));
    }

};



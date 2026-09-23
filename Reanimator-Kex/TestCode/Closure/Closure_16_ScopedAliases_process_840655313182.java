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

public class ScopedAliases_process_840655313182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109681;
     Object term109773;
     Object term110931;
     Object term110932;

    public ScopedAliases_process_840655313182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109681 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term109681, term109681.getClass(), "compiler", null);
        term109773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term109773, term109773.getClass(), "type", 105);
        setIntField(term109865, term109865.getClass(), "type", 0);
        setField(term109865, term109865.getClass(), "parent", null);
        setField(term109773, term109773.getClass(), "parent", term109865);
        term110931 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term110931, term110931.getClass(), "compiler", null);
        setField(term110931, term110931.getClass(), "preprocessorSymbolTable", null);
        setField(term110931, term110931.getClass(), "transformationHandler", null);
        term110932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term110932, term110932.getClass(), "str", null);
        setIntField(term110932, term110932.getClass(), "type", 105);
        setField(term110932, term110932.getClass(), "next", null);
        setField(term110932, term110932.getClass(), "first", null);
        setField(term110932, term110932.getClass(), "last", null);
        setField(term110932, term110932.getClass(), "propListHead", null);
        setIntField(term110932, term110932.getClass(), "sourcePosition", 0);
        setField(term110932, term110932.getClass(), "jsType", null);
        setField(term110933, term110933.getClass(), "str", null);
        setIntField(term110933, term110933.getClass(), "type", 0);
        setField(term110933, term110933.getClass(), "next", null);
        setField(term110933, term110933.getClass(), "first", null);
        setField(term110933, term110933.getClass(), "last", null);
        setField(term110933, term110933.getClass(), "propListHead", null);
        setIntField(term110933, term110933.getClass(), "sourcePosition", 0);
        setField(term110933, term110933.getClass(), "jsType", null);
        setField(term110933, term110933.getClass(), "parent", null);
        setField(term110932, term110932.getClass(), "parent", term110933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term109773;
        callMethod(klass, "process", argTypes, term109681, args);
        assertTrue(recursiveEquals(term109681, term110931));
        assertTrue(recursiveEquals(term109773, null));
    }

};



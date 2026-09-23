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

public class ScopedAliases_process_84065531355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58803;
     Object term58873;
     Object term59093;
     Object term59094;

    public ScopedAliases_process_84065531355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58803 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term58803, term58803.getClass(), "compiler", null);
        term58873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58873, term58873.getClass(), "type", 105);
        setField(term58873, term58873.getClass(), "parent", null);
        term59093 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term59093, term59093.getClass(), "compiler", null);
        setField(term59093, term59093.getClass(), "preprocessorSymbolTable", null);
        setField(term59093, term59093.getClass(), "transformationHandler", null);
        term59094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59094, term59094.getClass(), "type", 105);
        setField(term59094, term59094.getClass(), "next", null);
        setField(term59094, term59094.getClass(), "first", null);
        setField(term59094, term59094.getClass(), "last", null);
        setField(term59094, term59094.getClass(), "propListHead", null);
        setIntField(term59094, term59094.getClass(), "sourcePosition", 0);
        setField(term59094, term59094.getClass(), "jsType", null);
        setField(term59094, term59094.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term58873;
        callMethod(klass, "process", argTypes, term58803, args);
        assertTrue(recursiveEquals(term58803, term59093));
        assertTrue(recursiveEquals(term58873, null));
    }

};



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

public class ScopedAliases_process_84065531337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17797;
     Object term17867;
     Object term18270;
     Object term18271;

    public ScopedAliases_process_84065531337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17797 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term17797, term17797.getClass(), "compiler", null);
        term17867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17867, term17867.getClass(), "type", 37);
        setField(term17867, term17867.getClass(), "parent", null);
        setField(term17937, term17937.getClass(), "next", null);
        setIntField(term17937, term17937.getClass(), "type", 42);
        setField(term17937, term17937.getClass(), "first", null);
        setField(term17867, term17867.getClass(), "first", term17937);
        term18270 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term18270, term18270.getClass(), "compiler", null);
        setField(term18270, term18270.getClass(), "preprocessorSymbolTable", null);
        setField(term18270, term18270.getClass(), "transformationHandler", null);
        term18271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18271, term18271.getClass(), "type", 37);
        setField(term18271, term18271.getClass(), "next", null);
        setIntField(term18272, term18272.getClass(), "type", 42);
        setField(term18272, term18272.getClass(), "next", null);
        setField(term18272, term18272.getClass(), "first", null);
        setField(term18272, term18272.getClass(), "last", null);
        setField(term18272, term18272.getClass(), "propListHead", null);
        setIntField(term18272, term18272.getClass(), "sourcePosition", 0);
        setField(term18272, term18272.getClass(), "jsType", null);
        setField(term18272, term18272.getClass(), "parent", null);
        setField(term18271, term18271.getClass(), "first", term18272);
        setField(term18271, term18271.getClass(), "last", null);
        setField(term18271, term18271.getClass(), "propListHead", null);
        setIntField(term18271, term18271.getClass(), "sourcePosition", 0);
        setField(term18271, term18271.getClass(), "jsType", null);
        setField(term18271, term18271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17867;
        callMethod(klass, "process", argTypes, term17797, args);
        assertTrue(recursiveEquals(term17797, term18270));
        assertTrue(recursiveEquals(term17867, null));
    }

};



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

public class ScopedAliases_process_84065531324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14368;
     Object term14438;
     Object term15370;
     Object term15371;

    public ScopedAliases_process_84065531324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14368 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term14368, term14368.getClass(), "compiler", null);
        term14438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14438, term14438.getClass(), "type", 0);
        setIntField(term14508, term14508.getClass(), "type", 0);
        setField(term14508, term14508.getClass(), "parent", null);
        setField(term14438, term14438.getClass(), "parent", term14508);
        setField(term14438, term14438.getClass(), "first", null);
        term15370 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term15370, term15370.getClass(), "compiler", null);
        setField(term15370, term15370.getClass(), "preprocessorSymbolTable", null);
        setField(term15370, term15370.getClass(), "transformationHandler", null);
        term15371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15371, term15371.getClass(), "type", 0);
        setField(term15371, term15371.getClass(), "next", null);
        setField(term15371, term15371.getClass(), "first", null);
        setField(term15371, term15371.getClass(), "last", null);
        setField(term15371, term15371.getClass(), "propListHead", null);
        setIntField(term15371, term15371.getClass(), "sourcePosition", 0);
        setField(term15371, term15371.getClass(), "jsType", null);
        setIntField(term15372, term15372.getClass(), "type", 0);
        setField(term15372, term15372.getClass(), "next", null);
        setField(term15372, term15372.getClass(), "first", null);
        setField(term15372, term15372.getClass(), "last", null);
        setField(term15372, term15372.getClass(), "propListHead", null);
        setIntField(term15372, term15372.getClass(), "sourcePosition", 0);
        setField(term15372, term15372.getClass(), "jsType", null);
        setField(term15372, term15372.getClass(), "parent", null);
        setField(term15371, term15371.getClass(), "parent", term15372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14438;
        callMethod(klass, "process", argTypes, term14368, args);
        assertTrue(recursiveEquals(term14368, term15370));
        assertTrue(recursiveEquals(term14438, null));
    }

};



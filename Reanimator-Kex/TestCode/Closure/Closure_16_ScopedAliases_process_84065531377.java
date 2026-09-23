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

public class ScopedAliases_process_84065531377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45406;
     Object term45476;
     Object term46096;
     Object term46097;

    public ScopedAliases_process_84065531377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45406 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term45406, term45406.getClass(), "compiler", null);
        term45476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45476, term45476.getClass(), "type", 0);
        setIntField(term45546, term45546.getClass(), "type", 0);
        setField(term45546, term45546.getClass(), "parent", null);
        setField(term45476, term45476.getClass(), "parent", term45546);
        setField(term45616, term45616.getClass(), "next", null);
        setIntField(term45616, term45616.getClass(), "type", 0);
        setField(term45616, term45616.getClass(), "first", null);
        setField(term45476, term45476.getClass(), "first", term45616);
        term46096 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term46096, term46096.getClass(), "compiler", null);
        setField(term46096, term46096.getClass(), "preprocessorSymbolTable", null);
        setField(term46096, term46096.getClass(), "transformationHandler", null);
        term46097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46097, term46097.getClass(), "type", 0);
        setField(term46097, term46097.getClass(), "next", null);
        setIntField(term46098, term46098.getClass(), "type", 0);
        setField(term46098, term46098.getClass(), "next", null);
        setField(term46098, term46098.getClass(), "first", null);
        setField(term46098, term46098.getClass(), "last", null);
        setField(term46098, term46098.getClass(), "propListHead", null);
        setIntField(term46098, term46098.getClass(), "sourcePosition", 0);
        setField(term46098, term46098.getClass(), "jsType", null);
        setField(term46098, term46098.getClass(), "parent", null);
        setField(term46097, term46097.getClass(), "first", term46098);
        setField(term46097, term46097.getClass(), "last", null);
        setField(term46097, term46097.getClass(), "propListHead", null);
        setIntField(term46097, term46097.getClass(), "sourcePosition", 0);
        setField(term46097, term46097.getClass(), "jsType", null);
        setIntField(term46099, term46099.getClass(), "type", 0);
        setField(term46099, term46099.getClass(), "next", null);
        setField(term46099, term46099.getClass(), "first", null);
        setField(term46099, term46099.getClass(), "last", null);
        setField(term46099, term46099.getClass(), "propListHead", null);
        setIntField(term46099, term46099.getClass(), "sourcePosition", 0);
        setField(term46099, term46099.getClass(), "jsType", null);
        setField(term46099, term46099.getClass(), "parent", null);
        setField(term46097, term46097.getClass(), "parent", term46099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term45476;
        callMethod(klass, "process", argTypes, term45406, args);
        assertTrue(recursiveEquals(term45406, term46096));
        assertTrue(recursiveEquals(term45476, null));
    }

};



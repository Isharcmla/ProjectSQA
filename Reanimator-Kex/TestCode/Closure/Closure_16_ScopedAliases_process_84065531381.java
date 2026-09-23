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

public class ScopedAliases_process_84065531381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47507;
     Object term47577;
     Object term47942;
     Object term47943;

    public ScopedAliases_process_84065531381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47507 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term47507, term47507.getClass(), "compiler", null);
        term47577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47577, term47577.getClass(), "type", 105);
        setIntField(term47647, term47647.getClass(), "type", 0);
        setField(term47647, term47647.getClass(), "parent", null);
        setField(term47577, term47577.getClass(), "parent", term47647);
        term47942 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term47942, term47942.getClass(), "compiler", null);
        setField(term47942, term47942.getClass(), "preprocessorSymbolTable", null);
        setField(term47942, term47942.getClass(), "transformationHandler", null);
        term47943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47943, term47943.getClass(), "type", 105);
        setField(term47943, term47943.getClass(), "next", null);
        setField(term47943, term47943.getClass(), "first", null);
        setField(term47943, term47943.getClass(), "last", null);
        setField(term47943, term47943.getClass(), "propListHead", null);
        setIntField(term47943, term47943.getClass(), "sourcePosition", 0);
        setField(term47943, term47943.getClass(), "jsType", null);
        setIntField(term47944, term47944.getClass(), "type", 0);
        setField(term47944, term47944.getClass(), "next", null);
        setField(term47944, term47944.getClass(), "first", null);
        setField(term47944, term47944.getClass(), "last", null);
        setField(term47944, term47944.getClass(), "propListHead", null);
        setIntField(term47944, term47944.getClass(), "sourcePosition", 0);
        setField(term47944, term47944.getClass(), "jsType", null);
        setField(term47944, term47944.getClass(), "parent", null);
        setField(term47943, term47943.getClass(), "parent", term47944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47577;
        callMethod(klass, "process", argTypes, term47507, args);
        assertTrue(recursiveEquals(term47507, term47942));
        assertTrue(recursiveEquals(term47577, null));
    }

};



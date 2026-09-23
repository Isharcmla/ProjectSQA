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

public class ScopedAliases_process_84065531343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53956;
     Object term54026;
     Object term54348;
     Object term54349;

    public ScopedAliases_process_84065531343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53956 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term53956, term53956.getClass(), "compiler", null);
        term54026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54026, term54026.getClass(), "type", 105);
        setIntField(term54096, term54096.getClass(), "type", 0);
        setField(term54096, term54096.getClass(), "parent", null);
        setField(term54026, term54026.getClass(), "parent", term54096);
        term54348 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term54348, term54348.getClass(), "compiler", null);
        setField(term54348, term54348.getClass(), "preprocessorSymbolTable", null);
        setField(term54348, term54348.getClass(), "transformationHandler", null);
        term54349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54349, term54349.getClass(), "type", 105);
        setField(term54349, term54349.getClass(), "next", null);
        setField(term54349, term54349.getClass(), "first", null);
        setField(term54349, term54349.getClass(), "last", null);
        setField(term54349, term54349.getClass(), "propListHead", null);
        setIntField(term54349, term54349.getClass(), "sourcePosition", 0);
        setField(term54349, term54349.getClass(), "jsType", null);
        setIntField(term54350, term54350.getClass(), "type", 0);
        setField(term54350, term54350.getClass(), "next", null);
        setField(term54350, term54350.getClass(), "first", null);
        setField(term54350, term54350.getClass(), "last", null);
        setField(term54350, term54350.getClass(), "propListHead", null);
        setIntField(term54350, term54350.getClass(), "sourcePosition", 0);
        setField(term54350, term54350.getClass(), "jsType", null);
        setField(term54350, term54350.getClass(), "parent", null);
        setField(term54349, term54349.getClass(), "parent", term54350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54026;
        callMethod(klass, "process", argTypes, term53956, args);
        assertTrue(recursiveEquals(term53956, term54348));
        assertTrue(recursiveEquals(term54026, null));
    }

};



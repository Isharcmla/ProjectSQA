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

public class ScopedAliases_process_840655313241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151839;
     Object term151931;
     Object term152330;
     Object term152331;

    public ScopedAliases_process_840655313241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151839 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term151839, term151839.getClass(), "compiler", null);
        term151931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term151931, term151931.getClass(), "type", 105);
        setIntField(term152023, term152023.getClass(), "type", 0);
        setField(term152023, term152023.getClass(), "parent", null);
        setField(term151931, term151931.getClass(), "parent", term152023);
        term152330 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term152330, term152330.getClass(), "compiler", null);
        setField(term152330, term152330.getClass(), "preprocessorSymbolTable", null);
        setField(term152330, term152330.getClass(), "transformationHandler", null);
        term152331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term152331, term152331.getClass(), "number", 0.0);
        setIntField(term152331, term152331.getClass(), "type", 105);
        setField(term152331, term152331.getClass(), "next", null);
        setField(term152331, term152331.getClass(), "first", null);
        setField(term152331, term152331.getClass(), "last", null);
        setField(term152331, term152331.getClass(), "propListHead", null);
        setIntField(term152331, term152331.getClass(), "sourcePosition", 0);
        setField(term152331, term152331.getClass(), "jsType", null);
        setDoubleField(term152332, term152332.getClass(), "number", 0.0);
        setIntField(term152332, term152332.getClass(), "type", 0);
        setField(term152332, term152332.getClass(), "next", null);
        setField(term152332, term152332.getClass(), "first", null);
        setField(term152332, term152332.getClass(), "last", null);
        setField(term152332, term152332.getClass(), "propListHead", null);
        setIntField(term152332, term152332.getClass(), "sourcePosition", 0);
        setField(term152332, term152332.getClass(), "jsType", null);
        setField(term152332, term152332.getClass(), "parent", null);
        setField(term152331, term152331.getClass(), "parent", term152332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term151931;
        callMethod(klass, "process", argTypes, term151839, args);
        assertTrue(recursiveEquals(term151839, term152330));
        assertTrue(recursiveEquals(term151931, null));
    }

};



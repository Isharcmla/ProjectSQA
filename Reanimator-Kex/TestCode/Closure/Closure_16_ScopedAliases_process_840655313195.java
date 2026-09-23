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

public class ScopedAliases_process_840655313195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119367;
     Object term119459;
     Object term119858;
     Object term119859;

    public ScopedAliases_process_840655313195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119367 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term119367, term119367.getClass(), "compiler", null);
        term119459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119551 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term119459, term119459.getClass(), "type", 105);
        setIntField(term119551, term119551.getClass(), "type", 0);
        setField(term119551, term119551.getClass(), "parent", null);
        setField(term119459, term119459.getClass(), "parent", term119551);
        term119858 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term119858, term119858.getClass(), "compiler", null);
        setField(term119858, term119858.getClass(), "preprocessorSymbolTable", null);
        setField(term119858, term119858.getClass(), "transformationHandler", null);
        term119859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term119859, term119859.getClass(), "number", 0.0);
        setIntField(term119859, term119859.getClass(), "type", 105);
        setField(term119859, term119859.getClass(), "next", null);
        setField(term119859, term119859.getClass(), "first", null);
        setField(term119859, term119859.getClass(), "last", null);
        setField(term119859, term119859.getClass(), "propListHead", null);
        setIntField(term119859, term119859.getClass(), "sourcePosition", 0);
        setField(term119859, term119859.getClass(), "jsType", null);
        setDoubleField(term119860, term119860.getClass(), "number", 0.0);
        setIntField(term119860, term119860.getClass(), "type", 0);
        setField(term119860, term119860.getClass(), "next", null);
        setField(term119860, term119860.getClass(), "first", null);
        setField(term119860, term119860.getClass(), "last", null);
        setField(term119860, term119860.getClass(), "propListHead", null);
        setIntField(term119860, term119860.getClass(), "sourcePosition", 0);
        setField(term119860, term119860.getClass(), "jsType", null);
        setField(term119860, term119860.getClass(), "parent", null);
        setField(term119859, term119859.getClass(), "parent", term119860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term119459;
        callMethod(klass, "process", argTypes, term119367, args);
        assertTrue(recursiveEquals(term119367, term119858));
        assertTrue(recursiveEquals(term119459, null));
    }

};



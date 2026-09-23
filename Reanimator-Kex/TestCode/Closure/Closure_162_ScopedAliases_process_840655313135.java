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

public class ScopedAliases_process_840655313135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73010;
     Object term73080;
     Object term74320;
     Object term74321;

    public ScopedAliases_process_840655313135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73010 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term73010, term73010.getClass(), "compiler", null);
        term73080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73080, term73080.getClass(), "type", 37);
        setField(term73080, term73080.getClass(), "parent", null);
        setField(term73150, term73150.getClass(), "next", null);
        setIntField(term73150, term73150.getClass(), "type", 105);
        setField(term73080, term73080.getClass(), "first", term73150);
        term74320 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term74320, term74320.getClass(), "compiler", null);
        setField(term74320, term74320.getClass(), "preprocessorSymbolTable", null);
        setField(term74320, term74320.getClass(), "transformationHandler", null);
        term74321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74321, term74321.getClass(), "type", 37);
        setField(term74321, term74321.getClass(), "next", null);
        setIntField(term74322, term74322.getClass(), "type", 105);
        setField(term74322, term74322.getClass(), "next", null);
        setField(term74322, term74322.getClass(), "first", null);
        setField(term74322, term74322.getClass(), "last", null);
        setField(term74322, term74322.getClass(), "propListHead", null);
        setIntField(term74322, term74322.getClass(), "sourcePosition", 0);
        setField(term74322, term74322.getClass(), "jsType", null);
        setField(term74322, term74322.getClass(), "parent", null);
        setField(term74321, term74321.getClass(), "first", term74322);
        setField(term74321, term74321.getClass(), "last", null);
        setField(term74321, term74321.getClass(), "propListHead", null);
        setIntField(term74321, term74321.getClass(), "sourcePosition", 0);
        setField(term74321, term74321.getClass(), "jsType", null);
        setField(term74321, term74321.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73080;
        callMethod(klass, "process", argTypes, term73010, args);
        assertTrue(recursiveEquals(term73010, term74320));
        assertTrue(recursiveEquals(term73080, null));
    }

};



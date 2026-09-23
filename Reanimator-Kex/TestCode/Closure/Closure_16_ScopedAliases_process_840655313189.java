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

public class ScopedAliases_process_840655313189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115423;
     Object term115515;
     Object term115902;
     Object term115903;

    public ScopedAliases_process_840655313189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115423 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term115423, term115423.getClass(), "compiler", null);
        term115515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115607 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term115515, term115515.getClass(), "type", 105);
        setIntField(term115607, term115607.getClass(), "type", 0);
        setField(term115607, term115607.getClass(), "parent", null);
        setField(term115515, term115515.getClass(), "parent", term115607);
        term115902 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term115902, term115902.getClass(), "compiler", null);
        setField(term115902, term115902.getClass(), "preprocessorSymbolTable", null);
        setField(term115902, term115902.getClass(), "transformationHandler", null);
        term115903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term115904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term115903, term115903.getClass(), "str", null);
        setIntField(term115903, term115903.getClass(), "type", 105);
        setField(term115903, term115903.getClass(), "next", null);
        setField(term115903, term115903.getClass(), "first", null);
        setField(term115903, term115903.getClass(), "last", null);
        setField(term115903, term115903.getClass(), "propListHead", null);
        setIntField(term115903, term115903.getClass(), "sourcePosition", 0);
        setField(term115903, term115903.getClass(), "jsType", null);
        setField(term115904, term115904.getClass(), "str", null);
        setIntField(term115904, term115904.getClass(), "type", 0);
        setField(term115904, term115904.getClass(), "next", null);
        setField(term115904, term115904.getClass(), "first", null);
        setField(term115904, term115904.getClass(), "last", null);
        setField(term115904, term115904.getClass(), "propListHead", null);
        setIntField(term115904, term115904.getClass(), "sourcePosition", 0);
        setField(term115904, term115904.getClass(), "jsType", null);
        setField(term115904, term115904.getClass(), "parent", null);
        setField(term115903, term115903.getClass(), "parent", term115904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term115515;
        callMethod(klass, "process", argTypes, term115423, args);
        assertTrue(recursiveEquals(term115423, term115902));
        assertTrue(recursiveEquals(term115515, null));
    }

};



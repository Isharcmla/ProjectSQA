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

public class ScopedAliases_process_840655313235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147333;
     Object term147425;
     Object term147812;
     Object term147813;

    public ScopedAliases_process_840655313235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147333 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term147333, term147333.getClass(), "compiler", null);
        term147425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term147425, term147425.getClass(), "type", 105);
        setIntField(term147517, term147517.getClass(), "type", 0);
        setField(term147517, term147517.getClass(), "parent", null);
        setField(term147425, term147425.getClass(), "parent", term147517);
        term147812 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term147812, term147812.getClass(), "compiler", null);
        setField(term147812, term147812.getClass(), "preprocessorSymbolTable", null);
        setField(term147812, term147812.getClass(), "transformationHandler", null);
        term147813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term147814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147813, term147813.getClass(), "str", null);
        setIntField(term147813, term147813.getClass(), "type", 105);
        setField(term147813, term147813.getClass(), "next", null);
        setField(term147813, term147813.getClass(), "first", null);
        setField(term147813, term147813.getClass(), "last", null);
        setField(term147813, term147813.getClass(), "propListHead", null);
        setIntField(term147813, term147813.getClass(), "sourcePosition", 0);
        setField(term147813, term147813.getClass(), "jsType", null);
        setField(term147814, term147814.getClass(), "str", null);
        setIntField(term147814, term147814.getClass(), "type", 0);
        setField(term147814, term147814.getClass(), "next", null);
        setField(term147814, term147814.getClass(), "first", null);
        setField(term147814, term147814.getClass(), "last", null);
        setField(term147814, term147814.getClass(), "propListHead", null);
        setIntField(term147814, term147814.getClass(), "sourcePosition", 0);
        setField(term147814, term147814.getClass(), "jsType", null);
        setField(term147814, term147814.getClass(), "parent", null);
        setField(term147813, term147813.getClass(), "parent", term147814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term147425;
        callMethod(klass, "process", argTypes, term147333, args);
        assertTrue(recursiveEquals(term147333, term147812));
        assertTrue(recursiveEquals(term147425, null));
    }

};



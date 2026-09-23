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

public class ScopedAliases_process_840655313301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197058;
     Object term197150;
     Object term197575;
     Object term197576;

    public ScopedAliases_process_840655313301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197058 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term197058, term197058.getClass(), "compiler", null);
        term197150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term197242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term197150, term197150.getClass(), "type", 0);
        setIntField(term197242, term197242.getClass(), "type", 0);
        setField(term197242, term197242.getClass(), "parent", null);
        setField(term197150, term197150.getClass(), "parent", term197242);
        setField(term197150, term197150.getClass(), "first", null);
        term197575 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term197575, term197575.getClass(), "compiler", null);
        setField(term197575, term197575.getClass(), "preprocessorSymbolTable", null);
        setField(term197575, term197575.getClass(), "transformationHandler", null);
        term197576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term197577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term197576, term197576.getClass(), "str", null);
        setIntField(term197576, term197576.getClass(), "type", 0);
        setField(term197576, term197576.getClass(), "next", null);
        setField(term197576, term197576.getClass(), "first", null);
        setField(term197576, term197576.getClass(), "last", null);
        setField(term197576, term197576.getClass(), "propListHead", null);
        setIntField(term197576, term197576.getClass(), "sourcePosition", 0);
        setField(term197576, term197576.getClass(), "jsType", null);
        setDoubleField(term197577, term197577.getClass(), "number", 0.0);
        setIntField(term197577, term197577.getClass(), "type", 0);
        setField(term197577, term197577.getClass(), "next", null);
        setField(term197577, term197577.getClass(), "first", null);
        setField(term197577, term197577.getClass(), "last", null);
        setField(term197577, term197577.getClass(), "propListHead", null);
        setIntField(term197577, term197577.getClass(), "sourcePosition", 0);
        setField(term197577, term197577.getClass(), "jsType", null);
        setField(term197577, term197577.getClass(), "parent", null);
        setField(term197576, term197576.getClass(), "parent", term197577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term197150;
        callMethod(klass, "process", argTypes, term197058, args);
        assertTrue(recursiveEquals(term197058, term197575));
        assertTrue(recursiveEquals(term197150, null));
    }

};



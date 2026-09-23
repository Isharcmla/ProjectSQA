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

public class ScopedAliases_process_840655313253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159428;
     Object term159520;
     Object term160501;
     Object term160502;

    public ScopedAliases_process_840655313253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159428 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term159428, term159428.getClass(), "compiler", null);
        term159520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term159704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term159520, term159520.getClass(), "type", 0);
        setIntField(term159612, term159612.getClass(), "type", 0);
        setField(term159612, term159612.getClass(), "parent", null);
        setField(term159520, term159520.getClass(), "parent", term159612);
        setField(term159704, term159704.getClass(), "next", null);
        setIntField(term159704, term159704.getClass(), "type", 0);
        setField(term159704, term159704.getClass(), "first", null);
        setField(term159520, term159520.getClass(), "first", term159704);
        term160501 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term160501, term160501.getClass(), "compiler", null);
        setField(term160501, term160501.getClass(), "preprocessorSymbolTable", null);
        setField(term160501, term160501.getClass(), "transformationHandler", null);
        term160502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term160503 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term160504 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term160502, term160502.getClass(), "str", null);
        setIntField(term160502, term160502.getClass(), "type", 0);
        setField(term160502, term160502.getClass(), "next", null);
        setField(term160503, term160503.getClass(), "str", null);
        setIntField(term160503, term160503.getClass(), "type", 0);
        setField(term160503, term160503.getClass(), "next", null);
        setField(term160503, term160503.getClass(), "first", null);
        setField(term160503, term160503.getClass(), "last", null);
        setField(term160503, term160503.getClass(), "propListHead", null);
        setIntField(term160503, term160503.getClass(), "sourcePosition", 0);
        setField(term160503, term160503.getClass(), "jsType", null);
        setField(term160503, term160503.getClass(), "parent", null);
        setField(term160502, term160502.getClass(), "first", term160503);
        setField(term160502, term160502.getClass(), "last", null);
        setField(term160502, term160502.getClass(), "propListHead", null);
        setIntField(term160502, term160502.getClass(), "sourcePosition", 0);
        setField(term160502, term160502.getClass(), "jsType", null);
        setField(term160504, term160504.getClass(), "str", null);
        setIntField(term160504, term160504.getClass(), "type", 0);
        setField(term160504, term160504.getClass(), "next", null);
        setField(term160504, term160504.getClass(), "first", null);
        setField(term160504, term160504.getClass(), "last", null);
        setField(term160504, term160504.getClass(), "propListHead", null);
        setIntField(term160504, term160504.getClass(), "sourcePosition", 0);
        setField(term160504, term160504.getClass(), "jsType", null);
        setField(term160504, term160504.getClass(), "parent", null);
        setField(term160502, term160502.getClass(), "parent", term160504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term159520;
        callMethod(klass, "process", argTypes, term159428, args);
        assertTrue(recursiveEquals(term159428, term160501));
        assertTrue(recursiveEquals(term159520, null));
    }

};



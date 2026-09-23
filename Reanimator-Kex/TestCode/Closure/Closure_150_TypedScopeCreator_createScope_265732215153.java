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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99945;
     Object term100095;
     Object term100403;

    public TypedScopeCreator_createScope_265732215153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99945 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term100025 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term99945, term99945.getClass(), "compiler", term100025);
        term100095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term100095, term100095.getClass(), "jsType", null);
        setIntField(term100095, term100095.getClass(), "type", 0);
        setField(term100235, term100235.getClass(), "next", term100235);
        setIntField(term100235, term100235.getClass(), "type", 118);
        setField(term100235, term100235.getClass(), "first", null);
        setField(term100165, term100165.getClass(), "next", term100235);
        setIntField(term100165, term100165.getClass(), "type", 64);
        setField(term100165, term100165.getClass(), "first", null);
        setField(term100165, term100165.getClass(), "jsType", term100329);
        setField(term100095, term100095.getClass(), "first", term100165);
        term100403 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term100521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term100403, term100403.getClass(), "rootNode", null);
        setField(term100403, term100403.getClass(), "thisType", term100521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term100095;
        args[1] = term100403;
        try {
            callMethod(klass, "createScope", argTypes, term99945, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



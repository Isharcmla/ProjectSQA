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

public class TypedScopeCreator_createScope_265732215149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105637;
     Object term105787;
     Object term106001;

    public TypedScopeCreator_createScope_265732215149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105637 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term105717 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105637, term105637.getClass(), "compiler", term105717);
        term105787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105787, term105787.getClass(), "jsType", null);
        setIntField(term105787, term105787.getClass(), "type", 0);
        setField(term105857, term105857.getClass(), "next", null);
        setIntField(term105857, term105857.getClass(), "type", 41);
        setField(term105927, term105927.getClass(), "next", null);
        setIntField(term105927, term105927.getClass(), "type", 0);
        setField(term105927, term105927.getClass(), "first", null);
        setField(term105857, term105857.getClass(), "first", term105927);
        setField(term105787, term105787.getClass(), "first", term105857);
        term106001 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term106071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term106001, term106001.getClass(), "rootNode", term106071);
        setField(term106001, term106001.getClass(), "thisType", term106165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term105787;
        args[1] = term106001;
        try {
            callMethod(klass, "createScope", argTypes, term105637, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



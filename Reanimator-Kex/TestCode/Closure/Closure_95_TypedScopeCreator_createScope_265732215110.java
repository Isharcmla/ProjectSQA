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

public class TypedScopeCreator_createScope_265732215110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70100;
     Object term70250;
     Object term70562;

    public TypedScopeCreator_createScope_265732215110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70100 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term70180 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70100, term70100.getClass(), "compiler", term70180);
        term70250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term70250, term70250.getClass(), "jsType", null);
        setIntField(term70250, term70250.getClass(), "type", 0);
        setField(term70390, term70390.getClass(), "next", null);
        setIntField(term70390, term70390.getClass(), "type", 47);
        setField(term70390, term70390.getClass(), "first", null);
        setField(term70320, term70320.getClass(), "next", term70390);
        setIntField(term70320, term70320.getClass(), "type", 64);
        setField(term70320, term70320.getClass(), "first", null);
        setField(term70320, term70320.getClass(), "jsType", term70488);
        setField(term70250, term70250.getClass(), "first", term70320);
        term70562 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term70632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70562, term70562.getClass(), "rootNode", term70632);
        setField(term70562, term70562.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term70250;
        args[1] = term70562;
        try {
            callMethod(klass, "createScope", argTypes, term70100, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



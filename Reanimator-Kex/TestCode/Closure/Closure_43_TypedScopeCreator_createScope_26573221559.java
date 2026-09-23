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

public class TypedScopeCreator_createScope_26573221559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28440;
     Object term28590;
     Object term28804;

    public TypedScopeCreator_createScope_26573221559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28440 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term28520 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term28440, term28440.getClass(), "compiler", term28520);
        term28590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28590, term28590.getClass(), "jsType", null);
        setIntField(term28590, term28590.getClass(), "type", 0);
        setField(term28590, term28590.getClass(), "parent", null);
        setField(term28660, term28660.getClass(), "next", null);
        setIntField(term28660, term28660.getClass(), "type", 41);
        setField(term28730, term28730.getClass(), "next", null);
        setIntField(term28730, term28730.getClass(), "type", 0);
        setField(term28730, term28730.getClass(), "first", null);
        setField(term28660, term28660.getClass(), "first", term28730);
        setField(term28590, term28590.getClass(), "first", term28660);
        term28804 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term28804, term28804.getClass(), "rootNode", null);
        setField(term28804, term28804.getClass(), "thisType", null);
        setIntField(term28804, term28804.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term28590;
        args[1] = term28804;
        try {
            callMethod(klass, "createScope", argTypes, term28440, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



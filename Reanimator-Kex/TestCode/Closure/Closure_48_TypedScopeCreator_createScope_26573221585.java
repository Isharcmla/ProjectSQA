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
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51025;
     Object term51095;
     Object term51379;

    public TypedScopeCreator_createScope_26573221585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51025 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term51025, term51025.getClass(), "compiler", null);
        term51095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51095, term51095.getClass(), "jsType", null);
        setIntField(term51095, term51095.getClass(), "type", 0);
        setField(term51095, term51095.getClass(), "parent", null);
        setField(term51165, term51165.getClass(), "next", term51235);
        setIntField(term51165, term51165.getClass(), "type", 83);
        setField(term51305, term51305.getClass(), "next", null);
        setIntField(term51305, term51305.getClass(), "type", 125);
        setField(term51305, term51305.getClass(), "first", null);
        setField(term51165, term51165.getClass(), "first", term51305);
        setField(term51095, term51095.getClass(), "first", term51165);
        term51379 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term51379, term51379.getClass(), "rootNode", null);
        setField(term51379, term51379.getClass(), "thisType", null);
        setIntField(term51379, term51379.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term51095;
        args[1] = term51379;
        callMethod(klass, "createScope", argTypes, term51025, args);
    }

};



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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64024;
     Object term64094;
     Object term64378;

    public TypedScopeCreator_createScope_26573221597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64024 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term64024, term64024.getClass(), "compiler", null);
        term64094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64094, term64094.getClass(), "jsType", null);
        setIntField(term64094, term64094.getClass(), "type", 0);
        setField(term64094, term64094.getClass(), "parent", null);
        setField(term64234, term64234.getClass(), "next", null);
        setIntField(term64234, term64234.getClass(), "type", 122);
        setField(term64234, term64234.getClass(), "first", null);
        setField(term64164, term64164.getClass(), "next", term64234);
        setIntField(term64164, term64164.getClass(), "type", 0);
        setField(term64304, term64304.getClass(), "next", null);
        setIntField(term64304, term64304.getClass(), "type", 0);
        setField(term64304, term64304.getClass(), "first", null);
        setField(term64164, term64164.getClass(), "first", term64304);
        setField(term64094, term64094.getClass(), "first", term64164);
        term64378 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term64448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64378, term64378.getClass(), "rootNode", term64448);
        setField(term64378, term64378.getClass(), "thisType", null);
        setIntField(term64378, term64378.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term64094;
        args[1] = term64378;
        try {
            callMethod(klass, "createScope", argTypes, term64024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



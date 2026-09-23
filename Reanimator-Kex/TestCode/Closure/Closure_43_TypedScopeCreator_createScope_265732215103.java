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

public class TypedScopeCreator_createScope_265732215103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70689;
     Object term70759;
     Object term70973;

    public TypedScopeCreator_createScope_265732215103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70689 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term70689, term70689.getClass(), "compiler", null);
        term70759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70759, term70759.getClass(), "jsType", null);
        setIntField(term70759, term70759.getClass(), "type", 0);
        setField(term70759, term70759.getClass(), "parent", null);
        setField(term70829, term70829.getClass(), "next", null);
        setIntField(term70829, term70829.getClass(), "type", 83);
        setField(term70899, term70899.getClass(), "next", null);
        setIntField(term70899, term70899.getClass(), "type", 83);
        setField(term70899, term70899.getClass(), "first", null);
        setField(term70829, term70829.getClass(), "first", term70899);
        setField(term70759, term70759.getClass(), "first", term70829);
        term70973 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term70973, term70973.getClass(), "rootNode", null);
        setField(term70973, term70973.getClass(), "thisType", null);
        setIntField(term70973, term70973.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term70759;
        args[1] = term70973;
        try {
            callMethod(klass, "createScope", argTypes, term70689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_26573221554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26901;
     Object term27051;
     Object term27405;

    public TypedScopeCreator_createScope_26573221554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26901 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term26981 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26901, term26901.getClass(), "compiler", term26981);
        term27051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27051, term27051.getClass(), "jsType", null);
        setIntField(term27051, term27051.getClass(), "type", 0);
        setField(term27051, term27051.getClass(), "parent", null);
        setField(term27121, term27121.getClass(), "next", term27191);
        setIntField(term27121, term27121.getClass(), "type", 0);
        setField(term27261, term27261.getClass(), "next", term27331);
        setIntField(term27261, term27261.getClass(), "type", 43);
        setField(term27261, term27261.getClass(), "first", null);
        setField(term27121, term27121.getClass(), "first", term27261);
        setField(term27051, term27051.getClass(), "first", term27121);
        term27405 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term27405, term27405.getClass(), "rootNode", null);
        setField(term27405, term27405.getClass(), "thisType", null);
        setIntField(term27405, term27405.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27051;
        args[1] = term27405;
        try {
            callMethod(klass, "createScope", argTypes, term26901, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



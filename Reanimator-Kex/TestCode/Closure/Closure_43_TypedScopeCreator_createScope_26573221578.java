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

public class TypedScopeCreator_createScope_26573221578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44826;
     Object term44896;
     Object term45250;

    public TypedScopeCreator_createScope_26573221578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44826 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term44826, term44826.getClass(), "compiler", null);
        term44896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44896, term44896.getClass(), "jsType", null);
        setIntField(term44896, term44896.getClass(), "type", 0);
        setField(term44896, term44896.getClass(), "parent", null);
        setField(term45036, term45036.getClass(), "next", term45106);
        setIntField(term45036, term45036.getClass(), "type", 83);
        setField(term45036, term45036.getClass(), "first", null);
        setField(term44966, term44966.getClass(), "next", term45036);
        setIntField(term44966, term44966.getClass(), "type", 0);
        setField(term45176, term45176.getClass(), "next", null);
        setIntField(term45176, term45176.getClass(), "type", 0);
        setField(term45176, term45176.getClass(), "first", null);
        setField(term44966, term44966.getClass(), "first", term45176);
        setField(term44896, term44896.getClass(), "first", term44966);
        term45250 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term45320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45250, term45250.getClass(), "rootNode", term45320);
        setField(term45250, term45250.getClass(), "thisType", null);
        setIntField(term45250, term45250.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term44896;
        args[1] = term45250;
        try {
            callMethod(klass, "createScope", argTypes, term44826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



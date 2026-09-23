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

public class TypedScopeCreator_createScope_265732215105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77149;
     Object term77219;
     Object term77643;

    public TypedScopeCreator_createScope_265732215105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77149 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term77149, term77149.getClass(), "compiler", null);
        term77219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77219, term77219.getClass(), "jsType", null);
        setIntField(term77219, term77219.getClass(), "type", 0);
        setField(term77219, term77219.getClass(), "parent", null);
        setField(term77429, term77429.getClass(), "next", term77499);
        setIntField(term77429, term77429.getClass(), "type", 83);
        setField(term77429, term77429.getClass(), "first", null);
        setField(term77359, term77359.getClass(), "next", term77429);
        setIntField(term77359, term77359.getClass(), "type", 125);
        setField(term77359, term77359.getClass(), "first", null);
        setField(term77359, term77359.getClass(), "parent", null);
        setField(term77289, term77289.getClass(), "next", term77359);
        setIntField(term77289, term77289.getClass(), "type", 0);
        setField(term77569, term77569.getClass(), "next", null);
        setIntField(term77569, term77569.getClass(), "type", 0);
        setField(term77569, term77569.getClass(), "first", null);
        setField(term77569, term77569.getClass(), "parent", null);
        setField(term77289, term77289.getClass(), "first", term77569);
        setField(term77289, term77289.getClass(), "parent", null);
        setField(term77219, term77219.getClass(), "first", term77289);
        term77643 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term77643, term77643.getClass(), "rootNode", null);
        setField(term77643, term77643.getClass(), "thisType", null);
        setIntField(term77643, term77643.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term77219;
        args[1] = term77643;
        try {
            callMethod(klass, "createScope", argTypes, term77149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



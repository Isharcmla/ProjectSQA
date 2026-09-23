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

public class TypedScopeCreator_createScope_265732215154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73163;
     Object term73255;
     Object term73491;

    public TypedScopeCreator_createScope_265732215154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73163 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term73163, term73163.getClass(), "compiler", null);
        term73255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term73325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term73255, term73255.getClass(), "jsType", null);
        setIntField(term73255, term73255.getClass(), "type", 0);
        setField(term73325, term73325.getClass(), "next", term73417);
        setIntField(term73325, term73325.getClass(), "type", 132);
        setField(term73325, term73325.getClass(), "propListHead", null);
        setField(term73325, term73325.getClass(), "first", null);
        setField(term73255, term73255.getClass(), "first", term73325);
        term73491 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term73583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term73491, term73491.getClass(), "rootNode", term73583);
        setField(term73491, term73491.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term73255;
        args[1] = term73491;
        try {
            callMethod(klass, "createScope", argTypes, term73163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



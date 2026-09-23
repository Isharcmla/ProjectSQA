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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypedScopeCreator_createScope_26573221545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12711;
     Object term12803;
     Object term12877;

    public TypedScopeCreator_createScope_26573221545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12711 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term12711, term12711.getClass(), "compiler", null);
        term12803 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12803, term12803.getClass(), "jsType", null);
        setIntField(term12803, term12803.getClass(), "type", 0);
        setField(term12803, term12803.getClass(), "parent", null);
        setField(term12803, term12803.getClass(), "first", term12803);
        term12877 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term12877, term12877.getClass(), "rootNode", null);
        setField(term12877, term12877.getClass(), "thisType", null);
        setIntField(term12877, term12877.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term12803;
        args[1] = term12877;
        try {
            callMethod(klass, "createScope", argTypes, term12711, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};



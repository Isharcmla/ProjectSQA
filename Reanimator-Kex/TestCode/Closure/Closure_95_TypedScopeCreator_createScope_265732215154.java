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

public class TypedScopeCreator_createScope_265732215154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109378;
     Object term109528;
     Object term109742;

    public TypedScopeCreator_createScope_265732215154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109378 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term109458 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term109378, term109378.getClass(), "compiler", term109458);
        term109528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109528, term109528.getClass(), "jsType", null);
        setIntField(term109528, term109528.getClass(), "type", 0);
        setField(term109598, term109598.getClass(), "next", null);
        setIntField(term109598, term109598.getClass(), "type", 122);
        setField(term109668, term109668.getClass(), "next", null);
        setIntField(term109668, term109668.getClass(), "type", 0);
        setField(term109668, term109668.getClass(), "first", null);
        setField(term109598, term109598.getClass(), "first", term109668);
        setField(term109528, term109528.getClass(), "first", term109598);
        term109742 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term109812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109742, term109742.getClass(), "rootNode", term109812);
        setField(term109742, term109742.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term109528;
        args[1] = term109742;
        try {
            callMethod(klass, "createScope", argTypes, term109378, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



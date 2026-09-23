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

public class TypedScopeCreator_createScope_265732215177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119867;
     Object term119937;
     Object term120331;

    public TypedScopeCreator_createScope_265732215177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119867 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term119867, term119867.getClass(), "compiler", null);
        term119937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term119937, term119937.getClass(), "jsType", null);
        setIntField(term119937, term119937.getClass(), "type", 0);
        setField(term120147, term120147.getClass(), "next", term120007);
        setIntField(term120147, term120147.getClass(), "type", 64);
        setField(term120147, term120147.getClass(), "first", null);
        setField(term120077, term120077.getClass(), "next", term120147);
        setIntField(term120077, term120077.getClass(), "type", 0);
        setField(term120077, term120077.getClass(), "first", null);
        setField(term120007, term120007.getClass(), "next", term120077);
        setIntField(term120007, term120007.getClass(), "type", 64);
        setField(term120007, term120007.getClass(), "first", null);
        setField(term120007, term120007.getClass(), "jsType", term120257);
        setField(term119937, term119937.getClass(), "first", term120007);
        term120331 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term120331, term120331.getClass(), "rootNode", null);
        setField(term120331, term120331.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term119937;
        args[1] = term120331;
        try {
            callMethod(klass, "createScope", argTypes, term119867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



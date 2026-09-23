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

public class TypedScopeCreator_createScope_26573221562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31955;
     Object term32025;
     Object term32309;

    public TypedScopeCreator_createScope_26573221562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31955 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term31955, term31955.getClass(), "compiler", null);
        term32025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32025, term32025.getClass(), "jsType", null);
        setIntField(term32025, term32025.getClass(), "type", 0);
        setField(term32025, term32025.getClass(), "parent", null);
        setField(term32165, term32165.getClass(), "next", null);
        setIntField(term32165, term32165.getClass(), "type", 83);
        setField(term32165, term32165.getClass(), "first", null);
        setField(term32095, term32095.getClass(), "next", term32165);
        setIntField(term32095, term32095.getClass(), "type", 0);
        setField(term32235, term32235.getClass(), "next", null);
        setIntField(term32235, term32235.getClass(), "type", 0);
        setField(term32235, term32235.getClass(), "first", null);
        setField(term32095, term32095.getClass(), "first", term32235);
        setField(term32025, term32025.getClass(), "first", term32095);
        term32309 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term32379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term32309, term32309.getClass(), "rootNode", term32379);
        setField(term32309, term32309.getClass(), "thisType", term32479);
        setIntField(term32309, term32309.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term32025;
        args[1] = term32309;
        try {
            callMethod(klass, "createScope", argTypes, term31955, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



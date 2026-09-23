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

public class TypedScopeCreator_createScope_26573221565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36043;
     Object term36113;
     Object term36327;

    public TypedScopeCreator_createScope_26573221565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36043 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term36043, term36043.getClass(), "compiler", null);
        term36113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36113, term36113.getClass(), "jsType", null);
        setIntField(term36113, term36113.getClass(), "type", 0);
        setField(term36113, term36113.getClass(), "parent", null);
        setField(term36183, term36183.getClass(), "next", null);
        setIntField(term36183, term36183.getClass(), "type", 0);
        setField(term36253, term36253.getClass(), "next", null);
        setIntField(term36253, term36253.getClass(), "type", 83);
        setField(term36253, term36253.getClass(), "first", null);
        setField(term36183, term36183.getClass(), "first", term36253);
        setField(term36113, term36113.getClass(), "first", term36183);
        term36327 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term36327, term36327.getClass(), "rootNode", null);
        setField(term36327, term36327.getClass(), "thisType", null);
        setIntField(term36327, term36327.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term36113;
        args[1] = term36327;
        try {
            callMethod(klass, "createScope", argTypes, term36043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



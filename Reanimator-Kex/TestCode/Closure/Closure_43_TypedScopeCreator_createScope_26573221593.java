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

public class TypedScopeCreator_createScope_26573221593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59527;
     Object term59597;
     Object term59811;

    public TypedScopeCreator_createScope_26573221593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59527 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term59527, term59527.getClass(), "compiler", null);
        term59597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59597, term59597.getClass(), "jsType", null);
        setIntField(term59597, term59597.getClass(), "type", 0);
        setField(term59597, term59597.getClass(), "parent", null);
        setField(term59667, term59667.getClass(), "next", null);
        setIntField(term59667, term59667.getClass(), "type", 83);
        setField(term59737, term59737.getClass(), "next", null);
        setIntField(term59737, term59737.getClass(), "type", 83);
        setField(term59737, term59737.getClass(), "first", null);
        setField(term59667, term59667.getClass(), "first", term59737);
        setField(term59597, term59597.getClass(), "first", term59667);
        term59811 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term59811, term59811.getClass(), "rootNode", null);
        setField(term59811, term59811.getClass(), "thisType", null);
        setIntField(term59811, term59811.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term59597;
        args[1] = term59811;
        try {
            callMethod(klass, "createScope", argTypes, term59527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



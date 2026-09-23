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

public class TypedScopeCreator_createScope_26573221575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42384;
     Object term42534;
     Object term42678;

    public TypedScopeCreator_createScope_26573221575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42384 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42464 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42384, term42384.getClass(), "compiler", term42464);
        term42534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42534, term42534.getClass(), "jsType", null);
        setIntField(term42534, term42534.getClass(), "type", 0);
        setField(term42604, term42604.getClass(), "next", null);
        setIntField(term42604, term42604.getClass(), "type", 40);
        setField(term42604, term42604.getClass(), "first", null);
        setField(term42534, term42534.getClass(), "first", term42604);
        term42678 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term42678, term42678.getClass(), "rootNode", null);
        setField(term42678, term42678.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42534;
        args[1] = term42678;
        try {
            callMethod(klass, "createScope", argTypes, term42384, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



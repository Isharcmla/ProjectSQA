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

public class TypedScopeCreator_createScope_26573221567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35258;
     Object term35408;
     Object term35692;

    public TypedScopeCreator_createScope_26573221567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35258 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term35338 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term35258, term35258.getClass(), "compiler", term35338);
        term35408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35408, term35408.getClass(), "jsType", null);
        setIntField(term35408, term35408.getClass(), "type", 0);
        setField(term35408, term35408.getClass(), "parent", null);
        setField(term35548, term35548.getClass(), "next", null);
        setIntField(term35548, term35548.getClass(), "type", 40);
        setField(term35548, term35548.getClass(), "first", null);
        setField(term35478, term35478.getClass(), "next", term35548);
        setIntField(term35478, term35478.getClass(), "type", 0);
        setField(term35618, term35618.getClass(), "next", null);
        setIntField(term35618, term35618.getClass(), "type", 0);
        setField(term35618, term35618.getClass(), "first", null);
        setField(term35478, term35478.getClass(), "first", term35618);
        setField(term35408, term35408.getClass(), "first", term35478);
        term35692 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term35692, term35692.getClass(), "rootNode", null);
        setField(term35692, term35692.getClass(), "thisType", null);
        setIntField(term35692, term35692.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term35408;
        args[1] = term35692;
        try {
            callMethod(klass, "createScope", argTypes, term35258, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



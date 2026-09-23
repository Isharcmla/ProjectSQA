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

public class TypedScopeCreator_createScope_26573221553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24114;
     Object term24264;
     Object term24618;

    public TypedScopeCreator_createScope_26573221553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24114 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term24194 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24114, term24114.getClass(), "compiler", term24194);
        term24264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24264, term24264.getClass(), "jsType", null);
        setIntField(term24264, term24264.getClass(), "type", 0);
        setField(term24264, term24264.getClass(), "parent", null);
        setField(term24474, term24474.getClass(), "next", null);
        setIntField(term24474, term24474.getClass(), "type", 40);
        setField(term24474, term24474.getClass(), "first", null);
        setField(term24404, term24404.getClass(), "next", term24474);
        setIntField(term24404, term24404.getClass(), "type", 125);
        setField(term24404, term24404.getClass(), "first", null);
        setField(term24334, term24334.getClass(), "next", term24404);
        setIntField(term24334, term24334.getClass(), "type", 0);
        setField(term24544, term24544.getClass(), "next", null);
        setIntField(term24544, term24544.getClass(), "type", 0);
        setField(term24544, term24544.getClass(), "first", null);
        setField(term24334, term24334.getClass(), "first", term24544);
        setField(term24264, term24264.getClass(), "first", term24334);
        term24618 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term24688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24618, term24618.getClass(), "rootNode", term24688);
        setField(term24618, term24618.getClass(), "thisType", null);
        setIntField(term24618, term24618.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term24264;
        args[1] = term24618;
        try {
            callMethod(klass, "createScope", argTypes, term24114, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



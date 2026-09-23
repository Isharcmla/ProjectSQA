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

public class TypedScopeCreator_createScope_26573221548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19494;
     Object term19644;
     Object term19928;

    public TypedScopeCreator_createScope_26573221548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19494 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term19574 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19494, term19494.getClass(), "compiler", term19574);
        term19644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19644, term19644.getClass(), "jsType", null);
        setIntField(term19644, term19644.getClass(), "type", 0);
        setField(term19644, term19644.getClass(), "parent", null);
        setField(term19784, term19784.getClass(), "next", term19714);
        setIntField(term19784, term19784.getClass(), "type", 105);
        setField(term19714, term19714.getClass(), "next", term19784);
        setIntField(term19714, term19714.getClass(), "type", 0);
        setField(term19854, term19854.getClass(), "next", null);
        setIntField(term19854, term19854.getClass(), "type", 0);
        setField(term19854, term19854.getClass(), "first", null);
        setField(term19854, term19854.getClass(), "parent", null);
        setField(term19714, term19714.getClass(), "first", term19854);
        setField(term19714, term19714.getClass(), "parent", null);
        setField(term19644, term19644.getClass(), "first", term19714);
        term19928 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term20026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term19928, term19928.getClass(), "rootNode", null);
        setField(term19928, term19928.getClass(), "thisType", term20026);
        setIntField(term19928, term19928.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term19644;
        args[1] = term19928;
        try {
            callMethod(klass, "createScope", argTypes, term19494, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123215;
     Object term123285;
     Object term123663;

    public TypedScopeCreator_createScope_265732215181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123215 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term123215, term123215.getClass(), "compiler", null);
        term123285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term123285, term123285.getClass(), "jsType", null);
        setIntField(term123285, term123285.getClass(), "type", 0);
        setField(term123495, term123495.getClass(), "next", null);
        setIntField(term123495, term123495.getClass(), "type", 43);
        setField(term123495, term123495.getClass(), "first", null);
        setField(term123425, term123425.getClass(), "next", term123495);
        setIntField(term123425, term123425.getClass(), "type", 0);
        setField(term123425, term123425.getClass(), "first", null);
        setField(term123355, term123355.getClass(), "next", term123425);
        setIntField(term123355, term123355.getClass(), "type", 64);
        setField(term123355, term123355.getClass(), "first", null);
        setField(term123355, term123355.getClass(), "jsType", term123589);
        setField(term123285, term123285.getClass(), "first", term123355);
        term123663 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term123733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term123663, term123663.getClass(), "rootNode", term123733);
        setField(term123663, term123663.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term123285;
        args[1] = term123663;
        try {
            callMethod(klass, "createScope", argTypes, term123215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



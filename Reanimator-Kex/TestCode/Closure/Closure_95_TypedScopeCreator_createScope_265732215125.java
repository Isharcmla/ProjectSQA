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

public class TypedScopeCreator_createScope_265732215125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84119;
     Object term84189;
     Object term84429;

    public TypedScopeCreator_createScope_265732215125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84119 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term84119, term84119.getClass(), "compiler", null);
        term84189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term84189, term84189.getClass(), "jsType", null);
        setIntField(term84189, term84189.getClass(), "type", 0);
        setField(term84259, term84259.getClass(), "next", null);
        setIntField(term84259, term84259.getClass(), "type", 64);
        setField(term84259, term84259.getClass(), "first", null);
        setField(term84259, term84259.getClass(), "jsType", term84355);
        setField(term84189, term84189.getClass(), "first", term84259);
        term84429 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term84499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84429, term84429.getClass(), "rootNode", term84499);
        setField(term84429, term84429.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term84189;
        args[1] = term84429;
        try {
            callMethod(klass, "createScope", argTypes, term84119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



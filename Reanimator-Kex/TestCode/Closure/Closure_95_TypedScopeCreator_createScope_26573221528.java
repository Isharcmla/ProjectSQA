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

public class TypedScopeCreator_createScope_26573221528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14730;
     Object term14880;
     Object term15024;

    public TypedScopeCreator_createScope_26573221528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14730 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term14810 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14730, term14730.getClass(), "compiler", term14810);
        term14880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14880, term14880.getClass(), "jsType", null);
        setIntField(term14880, term14880.getClass(), "type", 0);
        setField(term14950, term14950.getClass(), "next", null);
        setIntField(term14950, term14950.getClass(), "type", 40);
        setField(term14950, term14950.getClass(), "first", null);
        setField(term14880, term14880.getClass(), "first", term14950);
        term15024 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15024, term15024.getClass(), "rootNode", null);
        setField(term15024, term15024.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term14880;
        args[1] = term15024;
        try {
            callMethod(klass, "createScope", argTypes, term14730, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



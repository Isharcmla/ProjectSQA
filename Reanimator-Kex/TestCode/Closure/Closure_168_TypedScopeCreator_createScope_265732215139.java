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

public class TypedScopeCreator_createScope_265732215139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88559;
     Object term88731;
     Object term88805;

    public TypedScopeCreator_createScope_265732215139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88559 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term88639 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term88559, term88559.getClass(), "compiler", term88639);
        term88731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term88731, term88731.getClass(), "jsType", null);
        term88805 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term88875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88805, term88805.getClass(), "rootNode", term88875);
        setField(term88805, term88805.getClass(), "thisType", null);
        setIntField(term88805, term88805.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term88731;
        args[1] = term88805;
        try {
            callMethod(klass, "createScope", argTypes, term88559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



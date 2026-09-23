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

public class TypedScopeCreator_createScope_26573221599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66269;
     Object term66419;
     Object term66773;

    public TypedScopeCreator_createScope_26573221599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66269 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term66349 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66269, term66269.getClass(), "compiler", term66349);
        term66419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66419, term66419.getClass(), "jsType", null);
        setIntField(term66419, term66419.getClass(), "type", 0);
        setField(term66419, term66419.getClass(), "parent", null);
        setField(term66559, term66559.getClass(), "next", term66629);
        setIntField(term66559, term66559.getClass(), "type", 39);
        setField(term66559, term66559.getClass(), "first", null);
        setField(term66489, term66489.getClass(), "next", term66559);
        setIntField(term66489, term66489.getClass(), "type", 0);
        setField(term66699, term66699.getClass(), "next", null);
        setIntField(term66699, term66699.getClass(), "type", 0);
        setField(term66699, term66699.getClass(), "first", null);
        setField(term66489, term66489.getClass(), "first", term66699);
        setField(term66419, term66419.getClass(), "first", term66489);
        term66773 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term66773, term66773.getClass(), "rootNode", null);
        setField(term66773, term66773.getClass(), "thisType", null);
        setIntField(term66773, term66773.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term66419;
        args[1] = term66773;
        try {
            callMethod(klass, "createScope", argTypes, term66269, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



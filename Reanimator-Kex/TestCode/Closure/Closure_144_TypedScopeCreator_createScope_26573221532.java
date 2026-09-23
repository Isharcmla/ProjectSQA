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

public class TypedScopeCreator_createScope_26573221532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15263;
     Object term15413;
     Object term15557;

    public TypedScopeCreator_createScope_26573221532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15263 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term15343 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15263, term15263.getClass(), "compiler", term15343);
        term15413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15413, term15413.getClass(), "jsType", null);
        setIntField(term15413, term15413.getClass(), "type", 0);
        setField(term15483, term15483.getClass(), "next", null);
        setIntField(term15483, term15483.getClass(), "type", 83);
        setField(term15483, term15483.getClass(), "first", null);
        setField(term15413, term15413.getClass(), "first", term15483);
        term15557 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term15627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term15557, term15557.getClass(), "rootNode", term15627);
        setField(term15557, term15557.getClass(), "thisType", term15727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term15413;
        args[1] = term15557;
        try {
            callMethod(klass, "createScope", argTypes, term15263, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



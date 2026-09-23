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

public class TypedScopeCreator_createScope_265732215115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81815;
     Object term81885;
     Object term82099;

    public TypedScopeCreator_createScope_265732215115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81815 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term81815, term81815.getClass(), "compiler", null);
        term81885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81885, term81885.getClass(), "jsType", null);
        setIntField(term81885, term81885.getClass(), "type", 0);
        setField(term81885, term81885.getClass(), "parent", null);
        setField(term82025, term82025.getClass(), "next", null);
        setIntField(term82025, term82025.getClass(), "type", 41);
        setField(term82025, term82025.getClass(), "first", null);
        setField(term81955, term81955.getClass(), "next", term82025);
        setIntField(term81955, term81955.getClass(), "type", 0);
        setField(term81955, term81955.getClass(), "first", null);
        setField(term81885, term81885.getClass(), "first", term81955);
        term82099 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term82169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82099, term82099.getClass(), "rootNode", term82169);
        setField(term82099, term82099.getClass(), "thisType", null);
        setIntField(term82099, term82099.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term81885;
        args[1] = term82099;
        try {
            callMethod(klass, "createScope", argTypes, term81815, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107893;
     Object term107963;
     Object term108177;

    public TypedScopeCreator_createScope_265732215151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107893 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term107893, term107893.getClass(), "compiler", null);
        term107963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term107963, term107963.getClass(), "jsType", null);
        setIntField(term107963, term107963.getClass(), "type", 0);
        setField(term108033, term108033.getClass(), "next", null);
        setIntField(term108033, term108033.getClass(), "type", 0);
        setField(term108103, term108103.getClass(), "next", null);
        setIntField(term108103, term108103.getClass(), "type", 44);
        setField(term108103, term108103.getClass(), "first", null);
        setField(term108033, term108033.getClass(), "first", term108103);
        setField(term107963, term107963.getClass(), "first", term108033);
        term108177 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term108177, term108177.getClass(), "rootNode", null);
        setField(term108177, term108177.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term107963;
        args[1] = term108177;
        try {
            callMethod(klass, "createScope", argTypes, term107893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



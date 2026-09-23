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

public class TypedScopeCreator_createScope_26573221546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26023;
     Object term26173;
     Object term26387;

    public TypedScopeCreator_createScope_26573221546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26023 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term26103 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26023, term26023.getClass(), "compiler", term26103);
        term26173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26173, term26173.getClass(), "jsType", null);
        setIntField(term26173, term26173.getClass(), "type", 0);
        setField(term26243, term26243.getClass(), "next", term26313);
        setIntField(term26243, term26243.getClass(), "type", 44);
        setField(term26243, term26243.getClass(), "first", null);
        setField(term26173, term26173.getClass(), "first", term26243);
        term26387 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term26387, term26387.getClass(), "rootNode", null);
        setField(term26387, term26387.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term26173;
        args[1] = term26387;
        try {
            callMethod(klass, "createScope", argTypes, term26023, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26430;
     Object term26500;
     Object term26644;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26430 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term26430, term26430.getClass(), "compiler", null);
        term26500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26500, term26500.getClass(), "jsType", null);
        setIntField(term26500, term26500.getClass(), "type", 0);
        setField(term26570, term26570.getClass(), "next", null);
        setIntField(term26570, term26570.getClass(), "type", 47);
        setField(term26570, term26570.getClass(), "first", null);
        setField(term26500, term26500.getClass(), "first", term26570);
        term26644 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term26714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26644, term26644.getClass(), "rootNode", term26714);
        setField(term26644, term26644.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term26500;
        args[1] = term26644;
        try {
            callMethod(klass, "createScope", argTypes, term26430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



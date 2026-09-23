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

public class TypedScopeCreator_createScope_26573221573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40824;
     Object term40894;
     Object term41038;

    public TypedScopeCreator_createScope_26573221573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40824 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term40824, term40824.getClass(), "compiler", null);
        term40894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40894, term40894.getClass(), "jsType", null);
        setIntField(term40894, term40894.getClass(), "type", 0);
        setField(term40964, term40964.getClass(), "next", null);
        setIntField(term40964, term40964.getClass(), "type", 64);
        setField(term40964, term40964.getClass(), "first", null);
        setField(term40894, term40894.getClass(), "first", term40964);
        term41038 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term41148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term41038, term41038.getClass(), "rootNode", null);
        setField(term41038, term41038.getClass(), "thisType", term41148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term40894;
        args[1] = term41038;
        try {
            callMethod(klass, "createScope", argTypes, term40824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



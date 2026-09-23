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

public class TypedScopeCreator_createScope_26573221554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25744;
     Object term25894;
     Object term26038;

    public TypedScopeCreator_createScope_26573221554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25744 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term25824 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25744, term25744.getClass(), "compiler", term25824);
        term25894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25894, term25894.getClass(), "jsType", null);
        setIntField(term25894, term25894.getClass(), "type", 0);
        setField(term25964, term25964.getClass(), "next", null);
        setIntField(term25964, term25964.getClass(), "type", 122);
        setField(term25964, term25964.getClass(), "first", null);
        setField(term25894, term25894.getClass(), "first", term25964);
        term26038 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term26132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term26038, term26038.getClass(), "rootNode", null);
        setField(term26038, term26038.getClass(), "thisType", term26132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term25894;
        args[1] = term26038;
        try {
            callMethod(klass, "createScope", argTypes, term25744, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



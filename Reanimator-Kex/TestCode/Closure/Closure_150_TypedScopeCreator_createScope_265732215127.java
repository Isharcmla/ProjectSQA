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

public class TypedScopeCreator_createScope_265732215127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79157;
     Object term79227;
     Object term79609;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79157 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term79157, term79157.getClass(), "compiler", null);
        term79227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term79227, term79227.getClass(), "jsType", null);
        setIntField(term79227, term79227.getClass(), "type", 0);
        setField(term79367, term79367.getClass(), "next", term79437);
        setIntField(term79367, term79367.getClass(), "type", 39);
        setField(term79367, term79367.getClass(), "first", null);
        setField(term79297, term79297.getClass(), "next", term79367);
        setIntField(term79297, term79297.getClass(), "type", 64);
        setField(term79297, term79297.getClass(), "first", null);
        setField(term79297, term79297.getClass(), "jsType", term79535);
        setField(term79227, term79227.getClass(), "first", term79297);
        term79609 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term79609, term79609.getClass(), "rootNode", null);
        setField(term79609, term79609.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term79227;
        args[1] = term79609;
        try {
            callMethod(klass, "createScope", argTypes, term79157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



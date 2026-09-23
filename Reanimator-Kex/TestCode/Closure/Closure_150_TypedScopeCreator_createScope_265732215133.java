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

public class TypedScopeCreator_createScope_265732215133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83975;
     Object term84045;
     Object term84357;

    public TypedScopeCreator_createScope_265732215133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83975 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term83975, term83975.getClass(), "compiler", null);
        term84045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term84045, term84045.getClass(), "jsType", null);
        setIntField(term84045, term84045.getClass(), "type", 0);
        setField(term84185, term84185.getClass(), "next", null);
        setIntField(term84185, term84185.getClass(), "type", 44);
        setField(term84185, term84185.getClass(), "first", null);
        setField(term84115, term84115.getClass(), "next", term84185);
        setIntField(term84115, term84115.getClass(), "type", 64);
        setField(term84115, term84115.getClass(), "first", null);
        setField(term84115, term84115.getClass(), "jsType", term84283);
        setField(term84045, term84045.getClass(), "first", term84115);
        term84357 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term84427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84357, term84357.getClass(), "rootNode", term84427);
        setField(term84357, term84357.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term84045;
        args[1] = term84357;
        try {
            callMethod(klass, "createScope", argTypes, term83975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



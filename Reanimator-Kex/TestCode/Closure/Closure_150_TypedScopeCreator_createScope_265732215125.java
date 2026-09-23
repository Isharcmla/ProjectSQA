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

public class TypedScopeCreator_createScope_265732215125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76937;
     Object term77087;
     Object term77409;

    public TypedScopeCreator_createScope_265732215125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76937 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term77017 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76937, term76937.getClass(), "compiler", term77017);
        term77087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term77087, term77087.getClass(), "jsType", null);
        setIntField(term77087, term77087.getClass(), "type", 0);
        setField(term77227, term77227.getClass(), "next", null);
        setIntField(term77227, term77227.getClass(), "type", 122);
        setField(term77227, term77227.getClass(), "first", null);
        setField(term77157, term77157.getClass(), "next", term77227);
        setIntField(term77157, term77157.getClass(), "type", 64);
        setField(term77157, term77157.getClass(), "first", null);
        setField(term77157, term77157.getClass(), "jsType", term77335);
        setField(term77087, term77087.getClass(), "first", term77157);
        term77409 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term77479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77409, term77409.getClass(), "rootNode", term77479);
        setField(term77409, term77409.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term77087;
        args[1] = term77409;
        try {
            callMethod(klass, "createScope", argTypes, term76937, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63642;
     Object term63792;
     Object term64102;

    public TypedScopeCreator_createScope_265732215101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63642 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term63722 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63642, term63642.getClass(), "compiler", term63722);
        term63792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term63792, term63792.getClass(), "jsType", null);
        setIntField(term63792, term63792.getClass(), "type", 0);
        setField(term63932, term63932.getClass(), "next", null);
        setIntField(term63932, term63932.getClass(), "type", 122);
        setField(term63932, term63932.getClass(), "first", null);
        setField(term63862, term63862.getClass(), "next", term63932);
        setIntField(term63862, term63862.getClass(), "type", 64);
        setField(term63862, term63862.getClass(), "first", null);
        setField(term63862, term63862.getClass(), "jsType", term64028);
        setField(term63792, term63792.getClass(), "first", term63862);
        term64102 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term64172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64102, term64102.getClass(), "rootNode", term64172);
        setField(term64102, term64102.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term63792;
        args[1] = term64102;
        try {
            callMethod(klass, "createScope", argTypes, term63642, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



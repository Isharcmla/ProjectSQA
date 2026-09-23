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

public class TypedScopeCreator_createScope_265732215143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99429;
     Object term99579;
     Object term99793;

    public TypedScopeCreator_createScope_265732215143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99429 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term99509 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term99429, term99429.getClass(), "compiler", term99509);
        term99579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99579, term99579.getClass(), "jsType", null);
        setIntField(term99579, term99579.getClass(), "type", 0);
        setField(term99649, term99649.getClass(), "next", null);
        setIntField(term99649, term99649.getClass(), "type", 39);
        setField(term99719, term99719.getClass(), "next", null);
        setIntField(term99719, term99719.getClass(), "type", 0);
        setField(term99719, term99719.getClass(), "first", null);
        setField(term99649, term99649.getClass(), "first", term99719);
        setField(term99579, term99579.getClass(), "first", term99649);
        term99793 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term99863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99793, term99793.getClass(), "rootNode", term99863);
        setField(term99793, term99793.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term99579;
        args[1] = term99793;
        try {
            callMethod(klass, "createScope", argTypes, term99429, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



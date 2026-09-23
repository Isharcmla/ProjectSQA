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
import java.util.ArrayList;

public class TypedScopeCreator_init_85329935424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9230;

    public TypedScopeCreator_init_85329935424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9070 = new ArrayList();
        Object term9018 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term9150 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9018, term9018.getClass(), "delegateProxyPrototypes", term9070);
        setField(term9018, term9018.getClass(), "delegateCallingConventions", null);
        setField(term9018, term9018.getClass(), "functionAnalysisResults", null);
        setField(term9018, term9018.getClass(), "compiler", term9150);
        term9230 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term9230;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.util.HashMap;

public class TypedScopeCreator_init_85329935480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31680;

    public TypedScopeCreator_init_85329935480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31600 = new HashMap();
        Object term31552 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term31552, term31552.getClass(), "delegateProxyPrototypes", null);
        setField(term31552, term31552.getClass(), "delegateCallingConventions", null);
        setField(term31552, term31552.getClass(), "functionAnalysisResults", term31600);
        setField(term31552, term31552.getClass(), "compiler", null);
        term31680 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term31770 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term31680, term31680.getClass(), "typeValidator", term31770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term31680;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



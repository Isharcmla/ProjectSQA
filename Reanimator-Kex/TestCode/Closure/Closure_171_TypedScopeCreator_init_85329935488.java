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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class TypedScopeCreator_init_85329935488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36750;

    public TypedScopeCreator_init_85329935488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term36670 = new HashMap();
        Object term36622 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term36622, term36622.getClass(), "delegateProxyPrototypes", null);
        setField(term36622, term36622.getClass(), "delegateCallingConventions", null);
        setField(term36622, term36622.getClass(), "functionAnalysisResults", term36670);
        setField(term36622, term36622.getClass(), "compiler", null);
        term36750 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term36840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term36750, term36750.getClass(), "typeValidator", term36840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term36750;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



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

public class TypedScopeCreator_init_85329935487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34086;

    public TypedScopeCreator_init_85329935487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term33916 = new ArrayList();
        Object term33864 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term34006 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term33864, term33864.getClass(), "delegateProxyPrototypes", term33916);
        setField(term33864, term33864.getClass(), "delegateCallingConventions", null);
        setField(term33864, term33864.getClass(), "functionAnalysisResults", null);
        setField(term33864, term33864.getClass(), "compiler", null);
        setField(term33864, term33864.getClass(), "validator", term34006);
        setField(term33864, term33864.getClass(), "codingConvention", null);
        term34086 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term34176 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term34280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term34086, term34086.getClass(), "typeValidator", term34176);
        setField(term34086, term34086.getClass(), "typeRegistry", term34280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term34086;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



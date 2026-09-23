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
import java.util.ArrayList;
import java.util.HashMap;

public class TypedScopeCreator_init_85329935447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15693;

    public TypedScopeCreator_init_85329935447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15485 = new ArrayList();
        HashMap term15533 = new HashMap();
        Object term15433 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term15613 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15433, term15433.getClass(), "delegateProxyPrototypes", term15485);
        setField(term15433, term15433.getClass(), "delegateCallingConventions", term15533);
        setField(term15433, term15433.getClass(), "functionAnalysisResults", null);
        setField(term15433, term15433.getClass(), "compiler", term15613);
        term15693 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term15837 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
        Object term15931 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term15693, term15693.getClass(), "typeValidator", null);
        setField(term15693, term15693.getClass(), "typeRegistry", null);
        setField(term15693, term15693.getClass(), "oldErrorReporter", term15837);
        setField(term15693, term15693.getClass(), "options", term15931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term15693;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



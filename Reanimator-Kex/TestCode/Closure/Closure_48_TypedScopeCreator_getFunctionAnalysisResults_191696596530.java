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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypedScopeCreator_getFunctionAnalysisResults_191696596530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9828;
     Object term10931;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9828 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term10931 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10931, term10931.getClass(), "compiler", null);
        setField(term10931, term10931.getClass(), "typeParsingErrorReporter", null);
        setField(term10931, term10931.getClass(), "validator", null);
        setField(term10931, term10931.getClass(), "codingConvention", null);
        setField(term10931, term10931.getClass(), "typeRegistry", null);
        setField(term10931, term10931.getClass(), "delegateProxyPrototypes", null);
        setField(term10931, term10931.getClass(), "delegateCallingConventions", null);
        setField(term10931, term10931.getClass(), "functionAnalysisResults", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term9828, args);
        assertTrue(recursiveEquals(term9828, term10931));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12576;
     Object term14216;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12576 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term14216 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term14216, term14216.getClass(), "compiler", null);
        setField(term14216, term14216.getClass(), "typeParsingErrorReporter", null);
        setField(term14216, term14216.getClass(), "validator", null);
        setField(term14216, term14216.getClass(), "codingConvention", null);
        setField(term14216, term14216.getClass(), "typeRegistry", null);
        setField(term14216, term14216.getClass(), "delegateProxyPrototypes", null);
        setField(term14216, term14216.getClass(), "delegateCallingConventions", null);
        setField(term14216, term14216.getClass(), "functionAnalysisResults", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term12576, args);
        assertTrue(recursiveEquals(term12576, term14216));
        assertTrue(recursiveEquals(retValue, null));
    }

};



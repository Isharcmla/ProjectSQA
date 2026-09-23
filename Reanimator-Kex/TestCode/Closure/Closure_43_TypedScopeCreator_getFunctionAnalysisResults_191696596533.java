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
import java.util.HashMap;

public class TypedScopeCreator_getFunctionAnalysisResults_191696596533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11403;
     Object term11521;
     Object term11782;
     Object term11784;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11451 = new HashMap();
        term11403 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term11403, term11403.getClass(), "functionAnalysisResults", term11451);
        term11521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term11783 = new HashMap();
        term11782 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term11782, term11782.getClass(), "compiler", null);
        setField(term11782, term11782.getClass(), "typeParsingErrorReporter", null);
        setField(term11782, term11782.getClass(), "validator", null);
        setField(term11782, term11782.getClass(), "codingConvention", null);
        setField(term11782, term11782.getClass(), "typeRegistry", null);
        setField(term11782, term11782.getClass(), "delegateProxyPrototypes", null);
        setField(term11782, term11782.getClass(), "delegateCallingConventions", null);
        setField(term11782, term11782.getClass(), "functionAnalysisResults", term11783);
        term11784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11784, term11784.getClass(), "type", 0);
        setField(term11784, term11784.getClass(), "next", null);
        setField(term11784, term11784.getClass(), "first", null);
        setField(term11784, term11784.getClass(), "last", null);
        setField(term11784, term11784.getClass(), "propListHead", null);
        setIntField(term11784, term11784.getClass(), "sourcePosition", 0);
        setField(term11784, term11784.getClass(), "jsType", null);
        setField(term11784, term11784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11521;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term11403, args);
        assertTrue(recursiveEquals(term11403, term11782));
        assertTrue(recursiveEquals(term11521, term11784));
        assertTrue(recursiveEquals(retValue, null));
    }

};



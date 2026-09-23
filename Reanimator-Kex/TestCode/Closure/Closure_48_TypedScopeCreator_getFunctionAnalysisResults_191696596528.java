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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9394;
     Object term9512;
     Object term10676;
     Object term10678;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9442 = new HashMap();
        term9394 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term9394, term9394.getClass(), "functionAnalysisResults", term9442);
        term9512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term10677 = new HashMap();
        term10676 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10676, term10676.getClass(), "compiler", null);
        setField(term10676, term10676.getClass(), "typeParsingErrorReporter", null);
        setField(term10676, term10676.getClass(), "validator", null);
        setField(term10676, term10676.getClass(), "codingConvention", null);
        setField(term10676, term10676.getClass(), "typeRegistry", null);
        setField(term10676, term10676.getClass(), "delegateProxyPrototypes", null);
        setField(term10676, term10676.getClass(), "delegateCallingConventions", null);
        setField(term10676, term10676.getClass(), "functionAnalysisResults", term10677);
        term10678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10678, term10678.getClass(), "type", 0);
        setField(term10678, term10678.getClass(), "next", null);
        setField(term10678, term10678.getClass(), "first", null);
        setField(term10678, term10678.getClass(), "last", null);
        setField(term10678, term10678.getClass(), "propListHead", null);
        setIntField(term10678, term10678.getClass(), "sourcePosition", 0);
        setField(term10678, term10678.getClass(), "jsType", null);
        setField(term10678, term10678.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9512;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term9394, args);
        assertTrue(recursiveEquals(term9394, term10676));
        assertTrue(recursiveEquals(term9512, term10678));
        assertTrue(recursiveEquals(retValue, null));
    }

};



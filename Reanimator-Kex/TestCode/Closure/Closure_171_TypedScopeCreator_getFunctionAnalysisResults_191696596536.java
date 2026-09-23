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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10965;
     Object term11083;
     Object term11309;
     Object term11311;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11013 = new HashMap();
        term10965 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10965, term10965.getClass(), "functionAnalysisResults", term11013);
        term11083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term11310 = new HashMap();
        term11309 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term11309, term11309.getClass(), "compiler", null);
        setField(term11309, term11309.getClass(), "typeParsingErrorReporter", null);
        setField(term11309, term11309.getClass(), "validator", null);
        setField(term11309, term11309.getClass(), "codingConvention", null);
        setField(term11309, term11309.getClass(), "typeRegistry", null);
        setField(term11309, term11309.getClass(), "delegateProxyPrototypes", null);
        setField(term11309, term11309.getClass(), "delegateCallingConventions", null);
        setField(term11309, term11309.getClass(), "functionAnalysisResults", term11310);
        setField(term11309, term11309.getClass(), "unknownType", null);
        term11311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11311, term11311.getClass(), "type", 0);
        setField(term11311, term11311.getClass(), "next", null);
        setField(term11311, term11311.getClass(), "first", null);
        setField(term11311, term11311.getClass(), "last", null);
        setField(term11311, term11311.getClass(), "propListHead", null);
        setIntField(term11311, term11311.getClass(), "sourcePosition", 0);
        setField(term11311, term11311.getClass(), "jsType", null);
        setField(term11311, term11311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11083;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term10965, args);
        assertTrue(recursiveEquals(term10965, term11309));
        assertTrue(recursiveEquals(term11083, term11311));
        assertTrue(recursiveEquals(retValue, null));
    }

};



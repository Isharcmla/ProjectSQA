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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14349;
     Object term14467;
     Object term14485;
     Object term14487;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14397 = new HashMap();
        term14349 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term14349, term14349.getClass(), "functionAnalysisResults", term14397);
        term14467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term14486 = new HashMap();
        term14485 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term14485, term14485.getClass(), "compiler", null);
        setField(term14485, term14485.getClass(), "typeParsingErrorReporter", null);
        setField(term14485, term14485.getClass(), "validator", null);
        setField(term14485, term14485.getClass(), "codingConvention", null);
        setField(term14485, term14485.getClass(), "typeRegistry", null);
        setField(term14485, term14485.getClass(), "delegateProxyPrototypes", null);
        setField(term14485, term14485.getClass(), "delegateCallingConventions", null);
        setField(term14485, term14485.getClass(), "functionAnalysisResults", term14486);
        term14487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14487, term14487.getClass(), "type", 0);
        setField(term14487, term14487.getClass(), "next", null);
        setField(term14487, term14487.getClass(), "first", null);
        setField(term14487, term14487.getClass(), "last", null);
        setField(term14487, term14487.getClass(), "propListHead", null);
        setIntField(term14487, term14487.getClass(), "sourcePosition", 0);
        setField(term14487, term14487.getClass(), "jsType", null);
        setField(term14487, term14487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14467;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term14349, args);
        assertTrue(recursiveEquals(term14349, term14485));
        assertTrue(recursiveEquals(term14467, term14487));
        assertTrue(recursiveEquals(retValue, null));
    }

};



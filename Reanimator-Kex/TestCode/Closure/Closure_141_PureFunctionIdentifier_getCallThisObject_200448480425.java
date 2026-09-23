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
import java.lang.Object;

public class PureFunctionIdentifier_getCallThisObject_200448480425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15355;
     Object term15485;

    public PureFunctionIdentifier_getCallThisObject_200448480425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15355 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term15445 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term15355, term15355.getClass(), "first", term15445);
        term15485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term15486 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term15485, term15485.getClass(), "functionName", null);
        setBooleanField(term15485, term15485.getClass(), "itsNeedsActivation", false);
        setIntField(term15485, term15485.getClass(), "itsFunctionType", 0);
        setBooleanField(term15485, term15485.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15485, term15485.getClass(), "encodedSourceStart", 0);
        setIntField(term15485, term15485.getClass(), "encodedSourceEnd", 0);
        setField(term15485, term15485.getClass(), "sourceName", null);
        setIntField(term15485, term15485.getClass(), "baseLineno", 0);
        setIntField(term15485, term15485.getClass(), "endLineno", 0);
        setField(term15485, term15485.getClass(), "functions", null);
        setField(term15485, term15485.getClass(), "regexps", null);
        setField(term15485, term15485.getClass(), "itsVariables", null);
        setField(term15485, term15485.getClass(), "itsConst", null);
        setField(term15485, term15485.getClass(), "itsVariableNames", null);
        setIntField(term15485, term15485.getClass(), "varStart", 0);
        setField(term15485, term15485.getClass(), "compilerData", null);
        setIntField(term15485, term15485.getClass(), "type", 0);
        setField(term15485, term15485.getClass(), "next", null);
        setIntField(term15486, term15486.getClass(), "encodedSourceStart", 0);
        setIntField(term15486, term15486.getClass(), "encodedSourceEnd", 0);
        setField(term15486, term15486.getClass(), "sourceName", null);
        setIntField(term15486, term15486.getClass(), "baseLineno", 0);
        setIntField(term15486, term15486.getClass(), "endLineno", 0);
        setField(term15486, term15486.getClass(), "functions", null);
        setField(term15486, term15486.getClass(), "regexps", null);
        setField(term15486, term15486.getClass(), "itsVariables", null);
        setField(term15486, term15486.getClass(), "itsConst", null);
        setField(term15486, term15486.getClass(), "itsVariableNames", null);
        setIntField(term15486, term15486.getClass(), "varStart", 0);
        setField(term15486, term15486.getClass(), "compilerData", null);
        setIntField(term15486, term15486.getClass(), "type", 0);
        setField(term15486, term15486.getClass(), "next", null);
        setField(term15486, term15486.getClass(), "first", null);
        setField(term15486, term15486.getClass(), "last", null);
        setField(term15486, term15486.getClass(), "propListHead", null);
        setIntField(term15486, term15486.getClass(), "sourcePosition", 0);
        setField(term15486, term15486.getClass(), "jsType", null);
        setField(term15486, term15486.getClass(), "parent", null);
        setField(term15485, term15485.getClass(), "first", term15486);
        setField(term15485, term15485.getClass(), "last", null);
        setField(term15485, term15485.getClass(), "propListHead", null);
        setIntField(term15485, term15485.getClass(), "sourcePosition", 0);
        setField(term15485, term15485.getClass(), "jsType", null);
        setField(term15485, term15485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15355;
        Object retValue = callMethod(klass, "getCallThisObject", argTypes, null, args);
        assertTrue(recursiveEquals(term15355, term15485));
        assertTrue(recursiveEquals(retValue, null));
    }

};



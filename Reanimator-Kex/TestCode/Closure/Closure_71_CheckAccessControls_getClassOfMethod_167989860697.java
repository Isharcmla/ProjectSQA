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

public class CheckAccessControls_getClassOfMethod_167989860697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26232;
     Object term26318;
     Object term26404;
     Object term26446;
     Object term26447;
     Object term26448;

    public CheckAccessControls_getClassOfMethod_167989860697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26232 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term26318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term26404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term26404, term26404.getClass(), "type", -87);
        term26446 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term26446, term26446.getClass(), "compiler", null);
        setField(term26446, term26446.getClass(), "validator", null);
        setIntField(term26446, term26446.getClass(), "deprecatedDepth", 0);
        setIntField(term26446, term26446.getClass(), "methodDepth", 0);
        setField(term26446, term26446.getClass(), "currentClass", null);
        setField(term26446, term26446.getClass(), "initializedConstantProperties", null);
        term26447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term26447, term26447.getClass(), "functionName", null);
        setBooleanField(term26447, term26447.getClass(), "itsNeedsActivation", false);
        setIntField(term26447, term26447.getClass(), "itsFunctionType", 0);
        setBooleanField(term26447, term26447.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term26447, term26447.getClass(), "encodedSourceStart", 0);
        setIntField(term26447, term26447.getClass(), "encodedSourceEnd", 0);
        setField(term26447, term26447.getClass(), "sourceName", null);
        setIntField(term26447, term26447.getClass(), "baseLineno", 0);
        setIntField(term26447, term26447.getClass(), "endLineno", 0);
        setField(term26447, term26447.getClass(), "functions", null);
        setField(term26447, term26447.getClass(), "regexps", null);
        setField(term26447, term26447.getClass(), "itsVariables", null);
        setField(term26447, term26447.getClass(), "itsConst", null);
        setField(term26447, term26447.getClass(), "itsVariableNames", null);
        setIntField(term26447, term26447.getClass(), "varStart", 0);
        setField(term26447, term26447.getClass(), "compilerData", null);
        setIntField(term26447, term26447.getClass(), "type", -87);
        setField(term26447, term26447.getClass(), "next", null);
        setField(term26447, term26447.getClass(), "first", null);
        setField(term26447, term26447.getClass(), "last", null);
        setField(term26447, term26447.getClass(), "propListHead", null);
        setIntField(term26447, term26447.getClass(), "sourcePosition", 0);
        setField(term26447, term26447.getClass(), "jsType", null);
        setField(term26447, term26447.getClass(), "parent", null);
        term26448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term26448, term26448.getClass(), "functionName", null);
        setBooleanField(term26448, term26448.getClass(), "itsNeedsActivation", false);
        setIntField(term26448, term26448.getClass(), "itsFunctionType", 0);
        setBooleanField(term26448, term26448.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term26448, term26448.getClass(), "encodedSourceStart", 0);
        setIntField(term26448, term26448.getClass(), "encodedSourceEnd", 0);
        setField(term26448, term26448.getClass(), "sourceName", null);
        setIntField(term26448, term26448.getClass(), "baseLineno", 0);
        setIntField(term26448, term26448.getClass(), "endLineno", 0);
        setField(term26448, term26448.getClass(), "functions", null);
        setField(term26448, term26448.getClass(), "regexps", null);
        setField(term26448, term26448.getClass(), "itsVariables", null);
        setField(term26448, term26448.getClass(), "itsConst", null);
        setField(term26448, term26448.getClass(), "itsVariableNames", null);
        setIntField(term26448, term26448.getClass(), "varStart", 0);
        setField(term26448, term26448.getClass(), "compilerData", null);
        setIntField(term26448, term26448.getClass(), "type", 0);
        setField(term26448, term26448.getClass(), "next", null);
        setField(term26448, term26448.getClass(), "first", null);
        setField(term26448, term26448.getClass(), "last", null);
        setField(term26448, term26448.getClass(), "propListHead", null);
        setIntField(term26448, term26448.getClass(), "sourcePosition", 0);
        setField(term26448, term26448.getClass(), "jsType", null);
        setField(term26448, term26448.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term26318;
        args[1] = term26404;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term26232, args);
        assertTrue(recursiveEquals(term26232, term26446));
        assertTrue(recursiveEquals(term26318, term26447));
        assertTrue(recursiveEquals(term26404, term26448));
        assertTrue(recursiveEquals(retValue, null));
    }

};



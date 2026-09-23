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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145380;
     Object term145466;
     Object term145602;
     Object term145603;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145380 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term145466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145552 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term145466, term145466.getClass(), "first", term145552);
        term145602 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term145602, term145602.getClass(), "propertyTestFunctions", null);
        term145603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145604 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term145603, term145603.getClass(), "functionName", null);
        setBooleanField(term145603, term145603.getClass(), "itsNeedsActivation", false);
        setIntField(term145603, term145603.getClass(), "itsFunctionType", 0);
        setBooleanField(term145603, term145603.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145603, term145603.getClass(), "encodedSourceStart", 0);
        setIntField(term145603, term145603.getClass(), "encodedSourceEnd", 0);
        setField(term145603, term145603.getClass(), "sourceName", null);
        setIntField(term145603, term145603.getClass(), "baseLineno", 0);
        setIntField(term145603, term145603.getClass(), "endLineno", 0);
        setField(term145603, term145603.getClass(), "functions", null);
        setField(term145603, term145603.getClass(), "regexps", null);
        setField(term145603, term145603.getClass(), "itsVariables", null);
        setField(term145603, term145603.getClass(), "itsConst", null);
        setField(term145603, term145603.getClass(), "itsVariableNames", null);
        setIntField(term145603, term145603.getClass(), "varStart", 0);
        setField(term145603, term145603.getClass(), "compilerData", null);
        setIntField(term145603, term145603.getClass(), "type", 0);
        setField(term145603, term145603.getClass(), "next", null);
        setField(term145604, term145604.getClass(), "functionName", null);
        setBooleanField(term145604, term145604.getClass(), "itsNeedsActivation", false);
        setIntField(term145604, term145604.getClass(), "itsFunctionType", 0);
        setBooleanField(term145604, term145604.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145604, term145604.getClass(), "encodedSourceStart", 0);
        setIntField(term145604, term145604.getClass(), "encodedSourceEnd", 0);
        setField(term145604, term145604.getClass(), "sourceName", null);
        setIntField(term145604, term145604.getClass(), "baseLineno", 0);
        setIntField(term145604, term145604.getClass(), "endLineno", 0);
        setField(term145604, term145604.getClass(), "functions", null);
        setField(term145604, term145604.getClass(), "regexps", null);
        setField(term145604, term145604.getClass(), "itsVariables", null);
        setField(term145604, term145604.getClass(), "itsConst", null);
        setField(term145604, term145604.getClass(), "itsVariableNames", null);
        setIntField(term145604, term145604.getClass(), "varStart", 0);
        setField(term145604, term145604.getClass(), "compilerData", null);
        setIntField(term145604, term145604.getClass(), "type", 0);
        setField(term145604, term145604.getClass(), "next", null);
        setField(term145604, term145604.getClass(), "first", null);
        setField(term145604, term145604.getClass(), "last", null);
        setField(term145604, term145604.getClass(), "propListHead", null);
        setIntField(term145604, term145604.getClass(), "sourcePosition", 0);
        setField(term145604, term145604.getClass(), "jsType", null);
        setField(term145604, term145604.getClass(), "parent", null);
        setField(term145603, term145603.getClass(), "first", term145604);
        setField(term145603, term145603.getClass(), "last", null);
        setField(term145603, term145603.getClass(), "propListHead", null);
        setIntField(term145603, term145603.getClass(), "sourcePosition", 0);
        setField(term145603, term145603.getClass(), "jsType", null);
        setField(term145603, term145603.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term145466;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term145380, args);
        assertTrue(recursiveEquals(term145380, term145602));
        assertTrue(recursiveEquals(term145466, term145603));
        assertTrue(recursiveEquals(retValue, null));
    }

};



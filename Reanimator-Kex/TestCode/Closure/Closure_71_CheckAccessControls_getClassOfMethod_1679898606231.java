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

public class CheckAccessControls_getClassOfMethod_1679898606231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66645;
     Object term66731;
     Object term66817;
     Object term67524;
     Object term67525;
     Object term67526;

    public CheckAccessControls_getClassOfMethod_1679898606231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66645 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term66731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term66817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term66817, term66817.getClass(), "type", -87);
        term67524 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term67524, term67524.getClass(), "compiler", null);
        setField(term67524, term67524.getClass(), "validator", null);
        setIntField(term67524, term67524.getClass(), "deprecatedDepth", 0);
        setIntField(term67524, term67524.getClass(), "methodDepth", 0);
        setField(term67524, term67524.getClass(), "currentClass", null);
        setField(term67524, term67524.getClass(), "initializedConstantProperties", null);
        term67525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term67525, term67525.getClass(), "functionName", null);
        setBooleanField(term67525, term67525.getClass(), "itsNeedsActivation", false);
        setIntField(term67525, term67525.getClass(), "itsFunctionType", 0);
        setBooleanField(term67525, term67525.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term67525, term67525.getClass(), "encodedSourceStart", 0);
        setIntField(term67525, term67525.getClass(), "encodedSourceEnd", 0);
        setField(term67525, term67525.getClass(), "sourceName", null);
        setIntField(term67525, term67525.getClass(), "baseLineno", 0);
        setIntField(term67525, term67525.getClass(), "endLineno", 0);
        setField(term67525, term67525.getClass(), "functions", null);
        setField(term67525, term67525.getClass(), "regexps", null);
        setField(term67525, term67525.getClass(), "itsVariables", null);
        setField(term67525, term67525.getClass(), "itsConst", null);
        setField(term67525, term67525.getClass(), "itsVariableNames", null);
        setIntField(term67525, term67525.getClass(), "varStart", 0);
        setField(term67525, term67525.getClass(), "compilerData", null);
        setIntField(term67525, term67525.getClass(), "type", -87);
        setField(term67525, term67525.getClass(), "next", null);
        setField(term67525, term67525.getClass(), "first", null);
        setField(term67525, term67525.getClass(), "last", null);
        setField(term67525, term67525.getClass(), "propListHead", null);
        setIntField(term67525, term67525.getClass(), "sourcePosition", 0);
        setField(term67525, term67525.getClass(), "jsType", null);
        setField(term67525, term67525.getClass(), "parent", null);
        term67526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term67526, term67526.getClass(), "functionName", null);
        setBooleanField(term67526, term67526.getClass(), "itsNeedsActivation", false);
        setIntField(term67526, term67526.getClass(), "itsFunctionType", 0);
        setBooleanField(term67526, term67526.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term67526, term67526.getClass(), "encodedSourceStart", 0);
        setIntField(term67526, term67526.getClass(), "encodedSourceEnd", 0);
        setField(term67526, term67526.getClass(), "sourceName", null);
        setIntField(term67526, term67526.getClass(), "baseLineno", 0);
        setIntField(term67526, term67526.getClass(), "endLineno", 0);
        setField(term67526, term67526.getClass(), "functions", null);
        setField(term67526, term67526.getClass(), "regexps", null);
        setField(term67526, term67526.getClass(), "itsVariables", null);
        setField(term67526, term67526.getClass(), "itsConst", null);
        setField(term67526, term67526.getClass(), "itsVariableNames", null);
        setIntField(term67526, term67526.getClass(), "varStart", 0);
        setField(term67526, term67526.getClass(), "compilerData", null);
        setIntField(term67526, term67526.getClass(), "type", 0);
        setField(term67526, term67526.getClass(), "next", null);
        setField(term67526, term67526.getClass(), "first", null);
        setField(term67526, term67526.getClass(), "last", null);
        setField(term67526, term67526.getClass(), "propListHead", null);
        setIntField(term67526, term67526.getClass(), "sourcePosition", 0);
        setField(term67526, term67526.getClass(), "jsType", null);
        setField(term67526, term67526.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term66731;
        args[1] = term66817;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term66645, args);
        assertTrue(recursiveEquals(term66645, term67524));
        assertTrue(recursiveEquals(term66731, term67525));
        assertTrue(recursiveEquals(term66817, term67526));
        assertTrue(recursiveEquals(retValue, null));
    }

};



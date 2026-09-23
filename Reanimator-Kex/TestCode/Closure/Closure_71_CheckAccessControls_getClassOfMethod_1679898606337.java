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

public class CheckAccessControls_getClassOfMethod_1679898606337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107767;
     Object term107853;
     Object term108432;
     Object term108433;

    public CheckAccessControls_getClassOfMethod_1679898606337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107767 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term107853 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term107939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term107853, term107853.getClass(), "type", 86);
        setField(term107853, term107853.getClass(), "first", term107939);
        term108432 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term108432, term108432.getClass(), "compiler", null);
        setField(term108432, term108432.getClass(), "validator", null);
        setIntField(term108432, term108432.getClass(), "deprecatedDepth", 0);
        setIntField(term108432, term108432.getClass(), "methodDepth", 0);
        setField(term108432, term108432.getClass(), "currentClass", null);
        setField(term108432, term108432.getClass(), "initializedConstantProperties", null);
        term108433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108433, term108433.getClass(), "functionName", null);
        setBooleanField(term108433, term108433.getClass(), "itsNeedsActivation", false);
        setIntField(term108433, term108433.getClass(), "itsFunctionType", 0);
        setBooleanField(term108433, term108433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108433, term108433.getClass(), "encodedSourceStart", 0);
        setIntField(term108433, term108433.getClass(), "encodedSourceEnd", 0);
        setField(term108433, term108433.getClass(), "sourceName", null);
        setIntField(term108433, term108433.getClass(), "baseLineno", 0);
        setIntField(term108433, term108433.getClass(), "endLineno", 0);
        setField(term108433, term108433.getClass(), "functions", null);
        setField(term108433, term108433.getClass(), "regexps", null);
        setField(term108433, term108433.getClass(), "itsVariables", null);
        setField(term108433, term108433.getClass(), "itsConst", null);
        setField(term108433, term108433.getClass(), "itsVariableNames", null);
        setIntField(term108433, term108433.getClass(), "varStart", 0);
        setField(term108433, term108433.getClass(), "compilerData", null);
        setIntField(term108433, term108433.getClass(), "type", 86);
        setField(term108433, term108433.getClass(), "next", null);
        setField(term108434, term108434.getClass(), "functionName", null);
        setBooleanField(term108434, term108434.getClass(), "itsNeedsActivation", false);
        setIntField(term108434, term108434.getClass(), "itsFunctionType", 0);
        setBooleanField(term108434, term108434.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108434, term108434.getClass(), "encodedSourceStart", 0);
        setIntField(term108434, term108434.getClass(), "encodedSourceEnd", 0);
        setField(term108434, term108434.getClass(), "sourceName", null);
        setIntField(term108434, term108434.getClass(), "baseLineno", 0);
        setIntField(term108434, term108434.getClass(), "endLineno", 0);
        setField(term108434, term108434.getClass(), "functions", null);
        setField(term108434, term108434.getClass(), "regexps", null);
        setField(term108434, term108434.getClass(), "itsVariables", null);
        setField(term108434, term108434.getClass(), "itsConst", null);
        setField(term108434, term108434.getClass(), "itsVariableNames", null);
        setIntField(term108434, term108434.getClass(), "varStart", 0);
        setField(term108434, term108434.getClass(), "compilerData", null);
        setIntField(term108434, term108434.getClass(), "type", 0);
        setField(term108434, term108434.getClass(), "next", null);
        setField(term108434, term108434.getClass(), "first", null);
        setField(term108434, term108434.getClass(), "last", null);
        setField(term108434, term108434.getClass(), "propListHead", null);
        setIntField(term108434, term108434.getClass(), "sourcePosition", 0);
        setField(term108434, term108434.getClass(), "jsType", null);
        setField(term108434, term108434.getClass(), "parent", null);
        setField(term108433, term108433.getClass(), "first", term108434);
        setField(term108433, term108433.getClass(), "last", null);
        setField(term108433, term108433.getClass(), "propListHead", null);
        setIntField(term108433, term108433.getClass(), "sourcePosition", 0);
        setField(term108433, term108433.getClass(), "jsType", null);
        setField(term108433, term108433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term107853;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term107767, args);
        assertTrue(recursiveEquals(term107767, term108432));
        assertTrue(recursiveEquals(term107853, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



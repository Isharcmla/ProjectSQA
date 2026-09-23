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

public class ClosureCodingConvention_getObjectLiteralCast_148496234133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63146;
     Object term63232;
     Object term63372;
     Object term63373;

    public ClosureCodingConvention_getObjectLiteralCast_148496234133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63146 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term63232 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term63318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term63232, term63232.getClass(), "type", 37);
        setField(term63232, term63232.getClass(), "first", term63318);
        term63372 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term63372, term63372.getClass(), "propertyTestFunctions", null);
        term63373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term63374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term63373, term63373.getClass(), "functionName", null);
        setBooleanField(term63373, term63373.getClass(), "itsNeedsActivation", false);
        setIntField(term63373, term63373.getClass(), "itsFunctionType", 0);
        setBooleanField(term63373, term63373.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term63373, term63373.getClass(), "encodedSourceStart", 0);
        setIntField(term63373, term63373.getClass(), "encodedSourceEnd", 0);
        setField(term63373, term63373.getClass(), "sourceName", null);
        setIntField(term63373, term63373.getClass(), "baseLineno", 0);
        setIntField(term63373, term63373.getClass(), "endLineno", 0);
        setField(term63373, term63373.getClass(), "functions", null);
        setField(term63373, term63373.getClass(), "regexps", null);
        setField(term63373, term63373.getClass(), "itsVariables", null);
        setField(term63373, term63373.getClass(), "itsConst", null);
        setField(term63373, term63373.getClass(), "itsVariableNames", null);
        setIntField(term63373, term63373.getClass(), "varStart", 0);
        setField(term63373, term63373.getClass(), "compilerData", null);
        setIntField(term63373, term63373.getClass(), "type", 37);
        setField(term63373, term63373.getClass(), "next", null);
        setField(term63374, term63374.getClass(), "functionName", null);
        setBooleanField(term63374, term63374.getClass(), "itsNeedsActivation", false);
        setIntField(term63374, term63374.getClass(), "itsFunctionType", 0);
        setBooleanField(term63374, term63374.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term63374, term63374.getClass(), "encodedSourceStart", 0);
        setIntField(term63374, term63374.getClass(), "encodedSourceEnd", 0);
        setField(term63374, term63374.getClass(), "sourceName", null);
        setIntField(term63374, term63374.getClass(), "baseLineno", 0);
        setIntField(term63374, term63374.getClass(), "endLineno", 0);
        setField(term63374, term63374.getClass(), "functions", null);
        setField(term63374, term63374.getClass(), "regexps", null);
        setField(term63374, term63374.getClass(), "itsVariables", null);
        setField(term63374, term63374.getClass(), "itsConst", null);
        setField(term63374, term63374.getClass(), "itsVariableNames", null);
        setIntField(term63374, term63374.getClass(), "varStart", 0);
        setField(term63374, term63374.getClass(), "compilerData", null);
        setIntField(term63374, term63374.getClass(), "type", 0);
        setField(term63374, term63374.getClass(), "next", null);
        setField(term63374, term63374.getClass(), "first", null);
        setField(term63374, term63374.getClass(), "last", null);
        setField(term63374, term63374.getClass(), "propListHead", null);
        setIntField(term63374, term63374.getClass(), "sourcePosition", 0);
        setField(term63374, term63374.getClass(), "jsType", null);
        setField(term63374, term63374.getClass(), "parent", null);
        setField(term63373, term63373.getClass(), "first", term63374);
        setField(term63373, term63373.getClass(), "last", null);
        setField(term63373, term63373.getClass(), "propListHead", null);
        setIntField(term63373, term63373.getClass(), "sourcePosition", 0);
        setField(term63373, term63373.getClass(), "jsType", null);
        setField(term63373, term63373.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term63232;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term63146, args);
        assertTrue(recursiveEquals(term63146, term63372));
        assertTrue(recursiveEquals(term63232, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143007;
     Object term143093;
     Object term143235;
     Object term143236;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143007 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term143093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term143179, term143179.getClass(), "type", 42);
        setField(term143093, term143093.getClass(), "first", term143179);
        term143235 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term143235, term143235.getClass(), "propertyTestFunctions", null);
        term143236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term143237 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term143236, term143236.getClass(), "functionName", null);
        setBooleanField(term143236, term143236.getClass(), "itsNeedsActivation", false);
        setIntField(term143236, term143236.getClass(), "itsFunctionType", 0);
        setBooleanField(term143236, term143236.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143236, term143236.getClass(), "encodedSourceStart", 0);
        setIntField(term143236, term143236.getClass(), "encodedSourceEnd", 0);
        setField(term143236, term143236.getClass(), "sourceName", null);
        setIntField(term143236, term143236.getClass(), "baseLineno", 0);
        setIntField(term143236, term143236.getClass(), "endLineno", 0);
        setField(term143236, term143236.getClass(), "functions", null);
        setField(term143236, term143236.getClass(), "regexps", null);
        setField(term143236, term143236.getClass(), "itsVariables", null);
        setField(term143236, term143236.getClass(), "itsConst", null);
        setField(term143236, term143236.getClass(), "itsVariableNames", null);
        setIntField(term143236, term143236.getClass(), "varStart", 0);
        setField(term143236, term143236.getClass(), "compilerData", null);
        setIntField(term143236, term143236.getClass(), "type", 0);
        setField(term143236, term143236.getClass(), "next", null);
        setField(term143237, term143237.getClass(), "functionName", null);
        setBooleanField(term143237, term143237.getClass(), "itsNeedsActivation", false);
        setIntField(term143237, term143237.getClass(), "itsFunctionType", 0);
        setBooleanField(term143237, term143237.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143237, term143237.getClass(), "encodedSourceStart", 0);
        setIntField(term143237, term143237.getClass(), "encodedSourceEnd", 0);
        setField(term143237, term143237.getClass(), "sourceName", null);
        setIntField(term143237, term143237.getClass(), "baseLineno", 0);
        setIntField(term143237, term143237.getClass(), "endLineno", 0);
        setField(term143237, term143237.getClass(), "functions", null);
        setField(term143237, term143237.getClass(), "regexps", null);
        setField(term143237, term143237.getClass(), "itsVariables", null);
        setField(term143237, term143237.getClass(), "itsConst", null);
        setField(term143237, term143237.getClass(), "itsVariableNames", null);
        setIntField(term143237, term143237.getClass(), "varStart", 0);
        setField(term143237, term143237.getClass(), "compilerData", null);
        setIntField(term143237, term143237.getClass(), "type", 42);
        setField(term143237, term143237.getClass(), "next", null);
        setField(term143237, term143237.getClass(), "first", null);
        setField(term143237, term143237.getClass(), "last", null);
        setField(term143237, term143237.getClass(), "propListHead", null);
        setIntField(term143237, term143237.getClass(), "sourcePosition", 0);
        setField(term143237, term143237.getClass(), "jsType", null);
        setField(term143237, term143237.getClass(), "parent", null);
        setField(term143236, term143236.getClass(), "first", term143237);
        setField(term143236, term143236.getClass(), "last", null);
        setField(term143236, term143236.getClass(), "propListHead", null);
        setIntField(term143236, term143236.getClass(), "sourcePosition", 0);
        setField(term143236, term143236.getClass(), "jsType", null);
        setField(term143236, term143236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143093;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term143007, args);
        assertTrue(recursiveEquals(term143007, term143235));
        assertTrue(recursiveEquals(term143093, term143236));
        assertTrue(recursiveEquals(retValue, null));
    }

};



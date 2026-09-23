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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141115;
     Object term141207;
     Object term141342;
     Object term141343;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141115 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term141207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term141293, term141293.getClass(), "type", 42);
        setField(term141207, term141207.getClass(), "first", term141293);
        term141342 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term141342, term141342.getClass(), "propertyTestFunctions", null);
        term141343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141344 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term141343, term141343.getClass(), "number", 0.0);
        setIntField(term141343, term141343.getClass(), "type", 0);
        setField(term141343, term141343.getClass(), "next", null);
        setField(term141344, term141344.getClass(), "functionName", null);
        setBooleanField(term141344, term141344.getClass(), "itsNeedsActivation", false);
        setIntField(term141344, term141344.getClass(), "itsFunctionType", 0);
        setBooleanField(term141344, term141344.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141344, term141344.getClass(), "encodedSourceStart", 0);
        setIntField(term141344, term141344.getClass(), "encodedSourceEnd", 0);
        setField(term141344, term141344.getClass(), "sourceName", null);
        setIntField(term141344, term141344.getClass(), "baseLineno", 0);
        setIntField(term141344, term141344.getClass(), "endLineno", 0);
        setField(term141344, term141344.getClass(), "functions", null);
        setField(term141344, term141344.getClass(), "regexps", null);
        setField(term141344, term141344.getClass(), "itsVariables", null);
        setField(term141344, term141344.getClass(), "itsConst", null);
        setField(term141344, term141344.getClass(), "itsVariableNames", null);
        setIntField(term141344, term141344.getClass(), "varStart", 0);
        setField(term141344, term141344.getClass(), "compilerData", null);
        setIntField(term141344, term141344.getClass(), "type", 42);
        setField(term141344, term141344.getClass(), "next", null);
        setField(term141344, term141344.getClass(), "first", null);
        setField(term141344, term141344.getClass(), "last", null);
        setField(term141344, term141344.getClass(), "propListHead", null);
        setIntField(term141344, term141344.getClass(), "sourcePosition", 0);
        setField(term141344, term141344.getClass(), "jsType", null);
        setField(term141344, term141344.getClass(), "parent", null);
        setField(term141343, term141343.getClass(), "first", term141344);
        setField(term141343, term141343.getClass(), "last", null);
        setField(term141343, term141343.getClass(), "propListHead", null);
        setIntField(term141343, term141343.getClass(), "sourcePosition", 0);
        setField(term141343, term141343.getClass(), "jsType", null);
        setField(term141343, term141343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term141207;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term141115, args);
        assertTrue(recursiveEquals(term141115, term141342));
        assertTrue(recursiveEquals(term141207, term141343));
        assertTrue(recursiveEquals(retValue, null));
    }

};



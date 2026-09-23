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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124839;
     Object term124931;
     Object term125116;
     Object term125117;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124839 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term124931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term124931, term124931.getClass(), "first", term125017);
        term125116 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term125116, term125116.getClass(), "propertyTestFunctions", null);
        term125117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term125117, term125117.getClass(), "number", 0.0);
        setIntField(term125117, term125117.getClass(), "type", 0);
        setField(term125117, term125117.getClass(), "next", null);
        setField(term125118, term125118.getClass(), "functionName", null);
        setBooleanField(term125118, term125118.getClass(), "itsNeedsActivation", false);
        setIntField(term125118, term125118.getClass(), "itsFunctionType", 0);
        setBooleanField(term125118, term125118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term125118, term125118.getClass(), "encodedSourceStart", 0);
        setIntField(term125118, term125118.getClass(), "encodedSourceEnd", 0);
        setField(term125118, term125118.getClass(), "sourceName", null);
        setIntField(term125118, term125118.getClass(), "baseLineno", 0);
        setIntField(term125118, term125118.getClass(), "endLineno", 0);
        setField(term125118, term125118.getClass(), "functions", null);
        setField(term125118, term125118.getClass(), "regexps", null);
        setField(term125118, term125118.getClass(), "itsVariables", null);
        setField(term125118, term125118.getClass(), "itsConst", null);
        setField(term125118, term125118.getClass(), "itsVariableNames", null);
        setIntField(term125118, term125118.getClass(), "varStart", 0);
        setField(term125118, term125118.getClass(), "compilerData", null);
        setIntField(term125118, term125118.getClass(), "type", 0);
        setField(term125118, term125118.getClass(), "next", null);
        setField(term125118, term125118.getClass(), "first", null);
        setField(term125118, term125118.getClass(), "last", null);
        setField(term125118, term125118.getClass(), "propListHead", null);
        setIntField(term125118, term125118.getClass(), "sourcePosition", 0);
        setField(term125118, term125118.getClass(), "jsType", null);
        setField(term125118, term125118.getClass(), "parent", null);
        setField(term125117, term125117.getClass(), "first", term125118);
        setField(term125117, term125117.getClass(), "last", null);
        setField(term125117, term125117.getClass(), "propListHead", null);
        setIntField(term125117, term125117.getClass(), "sourcePosition", 0);
        setField(term125117, term125117.getClass(), "jsType", null);
        setField(term125117, term125117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term124931;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term124839, args);
        assertTrue(recursiveEquals(term124839, term125116));
        assertTrue(recursiveEquals(term124931, term125117));
        assertTrue(recursiveEquals(retValue, null));
    }

};



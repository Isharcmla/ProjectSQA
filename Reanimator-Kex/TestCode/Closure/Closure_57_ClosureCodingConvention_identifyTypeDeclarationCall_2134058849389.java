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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141469;
     Object term141555;
     Object term141676;
     Object term141677;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141469 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term141555 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term141555, term141555.getClass(), "first", term141647);
        term141676 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term141676, term141676.getClass(), "propertyTestFunctions", null);
        term141677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term141677, term141677.getClass(), "functionName", null);
        setBooleanField(term141677, term141677.getClass(), "itsNeedsActivation", false);
        setIntField(term141677, term141677.getClass(), "itsFunctionType", 0);
        setBooleanField(term141677, term141677.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141677, term141677.getClass(), "encodedSourceStart", 0);
        setIntField(term141677, term141677.getClass(), "encodedSourceEnd", 0);
        setField(term141677, term141677.getClass(), "sourceName", null);
        setIntField(term141677, term141677.getClass(), "baseLineno", 0);
        setIntField(term141677, term141677.getClass(), "endLineno", 0);
        setField(term141677, term141677.getClass(), "functions", null);
        setField(term141677, term141677.getClass(), "regexps", null);
        setField(term141677, term141677.getClass(), "itsVariables", null);
        setField(term141677, term141677.getClass(), "itsConst", null);
        setField(term141677, term141677.getClass(), "itsVariableNames", null);
        setIntField(term141677, term141677.getClass(), "varStart", 0);
        setField(term141677, term141677.getClass(), "compilerData", null);
        setIntField(term141677, term141677.getClass(), "type", 0);
        setField(term141677, term141677.getClass(), "next", null);
        setDoubleField(term141678, term141678.getClass(), "number", 0.0);
        setIntField(term141678, term141678.getClass(), "type", 0);
        setField(term141678, term141678.getClass(), "next", null);
        setField(term141678, term141678.getClass(), "first", null);
        setField(term141678, term141678.getClass(), "last", null);
        setField(term141678, term141678.getClass(), "propListHead", null);
        setIntField(term141678, term141678.getClass(), "sourcePosition", 0);
        setField(term141678, term141678.getClass(), "jsType", null);
        setField(term141678, term141678.getClass(), "parent", null);
        setField(term141677, term141677.getClass(), "first", term141678);
        setField(term141677, term141677.getClass(), "last", null);
        setField(term141677, term141677.getClass(), "propListHead", null);
        setIntField(term141677, term141677.getClass(), "sourcePosition", 0);
        setField(term141677, term141677.getClass(), "jsType", null);
        setField(term141677, term141677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term141555;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term141469, args);
        assertTrue(recursiveEquals(term141469, term141676));
        assertTrue(recursiveEquals(term141555, term141677));
        assertTrue(recursiveEquals(retValue, null));
    }

};



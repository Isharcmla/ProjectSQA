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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164632;
     Object term164718;
     Object term176524;
     Object term176525;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164632 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term164718 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term164810 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term164810, term164810.getClass(), "type", 42);
        setField(term164718, term164718.getClass(), "first", term164810);
        term176524 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term176524, term176524.getClass(), "propertyTestFunctions", null);
        term176525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term176526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term176525, term176525.getClass(), "functionName", null);
        setBooleanField(term176525, term176525.getClass(), "itsNeedsActivation", false);
        setIntField(term176525, term176525.getClass(), "itsFunctionType", 0);
        setBooleanField(term176525, term176525.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term176525, term176525.getClass(), "encodedSourceStart", 0);
        setIntField(term176525, term176525.getClass(), "encodedSourceEnd", 0);
        setField(term176525, term176525.getClass(), "sourceName", null);
        setIntField(term176525, term176525.getClass(), "baseLineno", 0);
        setIntField(term176525, term176525.getClass(), "endLineno", 0);
        setField(term176525, term176525.getClass(), "functions", null);
        setField(term176525, term176525.getClass(), "regexps", null);
        setField(term176525, term176525.getClass(), "itsVariables", null);
        setField(term176525, term176525.getClass(), "itsConst", null);
        setField(term176525, term176525.getClass(), "itsVariableNames", null);
        setIntField(term176525, term176525.getClass(), "varStart", 0);
        setField(term176525, term176525.getClass(), "compilerData", null);
        setIntField(term176525, term176525.getClass(), "type", 0);
        setField(term176525, term176525.getClass(), "next", null);
        setDoubleField(term176526, term176526.getClass(), "number", 0.0);
        setIntField(term176526, term176526.getClass(), "type", 42);
        setField(term176526, term176526.getClass(), "next", null);
        setField(term176526, term176526.getClass(), "first", null);
        setField(term176526, term176526.getClass(), "last", null);
        setField(term176526, term176526.getClass(), "propListHead", null);
        setIntField(term176526, term176526.getClass(), "sourcePosition", 0);
        setField(term176526, term176526.getClass(), "jsType", null);
        setField(term176526, term176526.getClass(), "parent", null);
        setField(term176525, term176525.getClass(), "first", term176526);
        setField(term176525, term176525.getClass(), "last", null);
        setField(term176525, term176525.getClass(), "propListHead", null);
        setIntField(term176525, term176525.getClass(), "sourcePosition", 0);
        setField(term176525, term176525.getClass(), "jsType", null);
        setField(term176525, term176525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term164718;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term164632, args);
        assertTrue(recursiveEquals(term164632, term176524));
        assertTrue(recursiveEquals(term164718, term176525));
        assertTrue(recursiveEquals(retValue, null));
    }

};



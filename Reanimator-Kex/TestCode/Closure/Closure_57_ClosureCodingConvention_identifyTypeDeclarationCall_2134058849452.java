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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151440;
     Object term151526;
     Object term151880;
     Object term151881;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151440 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term151526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151612 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term151526, term151526.getClass(), "first", term151612);
        term151880 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term151880, term151880.getClass(), "propertyTestFunctions", null);
        term151881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term151882 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term151881, term151881.getClass(), "functionName", null);
        setBooleanField(term151881, term151881.getClass(), "itsNeedsActivation", false);
        setIntField(term151881, term151881.getClass(), "itsFunctionType", 0);
        setBooleanField(term151881, term151881.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151881, term151881.getClass(), "encodedSourceStart", 0);
        setIntField(term151881, term151881.getClass(), "encodedSourceEnd", 0);
        setField(term151881, term151881.getClass(), "sourceName", null);
        setIntField(term151881, term151881.getClass(), "baseLineno", 0);
        setIntField(term151881, term151881.getClass(), "endLineno", 0);
        setField(term151881, term151881.getClass(), "functions", null);
        setField(term151881, term151881.getClass(), "regexps", null);
        setField(term151881, term151881.getClass(), "itsVariables", null);
        setField(term151881, term151881.getClass(), "itsConst", null);
        setField(term151881, term151881.getClass(), "itsVariableNames", null);
        setIntField(term151881, term151881.getClass(), "varStart", 0);
        setField(term151881, term151881.getClass(), "compilerData", null);
        setIntField(term151881, term151881.getClass(), "type", 0);
        setField(term151881, term151881.getClass(), "next", null);
        setField(term151882, term151882.getClass(), "functionName", null);
        setBooleanField(term151882, term151882.getClass(), "itsNeedsActivation", false);
        setIntField(term151882, term151882.getClass(), "itsFunctionType", 0);
        setBooleanField(term151882, term151882.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term151882, term151882.getClass(), "encodedSourceStart", 0);
        setIntField(term151882, term151882.getClass(), "encodedSourceEnd", 0);
        setField(term151882, term151882.getClass(), "sourceName", null);
        setIntField(term151882, term151882.getClass(), "baseLineno", 0);
        setIntField(term151882, term151882.getClass(), "endLineno", 0);
        setField(term151882, term151882.getClass(), "functions", null);
        setField(term151882, term151882.getClass(), "regexps", null);
        setField(term151882, term151882.getClass(), "itsVariables", null);
        setField(term151882, term151882.getClass(), "itsConst", null);
        setField(term151882, term151882.getClass(), "itsVariableNames", null);
        setIntField(term151882, term151882.getClass(), "varStart", 0);
        setField(term151882, term151882.getClass(), "compilerData", null);
        setIntField(term151882, term151882.getClass(), "type", 0);
        setField(term151882, term151882.getClass(), "next", null);
        setField(term151882, term151882.getClass(), "first", null);
        setField(term151882, term151882.getClass(), "last", null);
        setField(term151882, term151882.getClass(), "propListHead", null);
        setIntField(term151882, term151882.getClass(), "sourcePosition", 0);
        setField(term151882, term151882.getClass(), "jsType", null);
        setField(term151882, term151882.getClass(), "parent", null);
        setField(term151881, term151881.getClass(), "first", term151882);
        setField(term151881, term151881.getClass(), "last", null);
        setField(term151881, term151881.getClass(), "propListHead", null);
        setIntField(term151881, term151881.getClass(), "sourcePosition", 0);
        setField(term151881, term151881.getClass(), "jsType", null);
        setField(term151881, term151881.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term151526;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term151440, args);
        assertTrue(recursiveEquals(term151440, term151880));
        assertTrue(recursiveEquals(term151526, term151881));
        assertTrue(recursiveEquals(retValue, null));
    }

};



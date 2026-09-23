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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119064;
     Object term119150;
     Object term119288;
     Object term119289;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119064 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term119150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term119150, term119150.getClass(), "first", term119236);
        term119288 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term119288, term119288.getClass(), "propertyTestFunctions", null);
        term119289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term119290 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term119289, term119289.getClass(), "functionName", null);
        setBooleanField(term119289, term119289.getClass(), "itsNeedsActivation", false);
        setIntField(term119289, term119289.getClass(), "itsFunctionType", 0);
        setBooleanField(term119289, term119289.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term119289, term119289.getClass(), "encodedSourceStart", 0);
        setIntField(term119289, term119289.getClass(), "encodedSourceEnd", 0);
        setField(term119289, term119289.getClass(), "sourceName", null);
        setIntField(term119289, term119289.getClass(), "baseLineno", 0);
        setIntField(term119289, term119289.getClass(), "endLineno", 0);
        setField(term119289, term119289.getClass(), "functions", null);
        setField(term119289, term119289.getClass(), "regexps", null);
        setField(term119289, term119289.getClass(), "itsVariables", null);
        setField(term119289, term119289.getClass(), "itsConst", null);
        setField(term119289, term119289.getClass(), "itsVariableNames", null);
        setIntField(term119289, term119289.getClass(), "varStart", 0);
        setField(term119289, term119289.getClass(), "compilerData", null);
        setIntField(term119289, term119289.getClass(), "type", 0);
        setField(term119289, term119289.getClass(), "next", null);
        setField(term119290, term119290.getClass(), "functionName", null);
        setBooleanField(term119290, term119290.getClass(), "itsNeedsActivation", false);
        setIntField(term119290, term119290.getClass(), "itsFunctionType", 0);
        setBooleanField(term119290, term119290.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term119290, term119290.getClass(), "encodedSourceStart", 0);
        setIntField(term119290, term119290.getClass(), "encodedSourceEnd", 0);
        setField(term119290, term119290.getClass(), "sourceName", null);
        setIntField(term119290, term119290.getClass(), "baseLineno", 0);
        setIntField(term119290, term119290.getClass(), "endLineno", 0);
        setField(term119290, term119290.getClass(), "functions", null);
        setField(term119290, term119290.getClass(), "regexps", null);
        setField(term119290, term119290.getClass(), "itsVariables", null);
        setField(term119290, term119290.getClass(), "itsConst", null);
        setField(term119290, term119290.getClass(), "itsVariableNames", null);
        setIntField(term119290, term119290.getClass(), "varStart", 0);
        setField(term119290, term119290.getClass(), "compilerData", null);
        setIntField(term119290, term119290.getClass(), "type", 0);
        setField(term119290, term119290.getClass(), "next", null);
        setField(term119290, term119290.getClass(), "first", null);
        setField(term119290, term119290.getClass(), "last", null);
        setField(term119290, term119290.getClass(), "propListHead", null);
        setIntField(term119290, term119290.getClass(), "sourcePosition", 0);
        setField(term119290, term119290.getClass(), "jsType", null);
        setField(term119290, term119290.getClass(), "parent", null);
        setField(term119289, term119289.getClass(), "first", term119290);
        setField(term119289, term119289.getClass(), "last", null);
        setField(term119289, term119289.getClass(), "propListHead", null);
        setIntField(term119289, term119289.getClass(), "sourcePosition", 0);
        setField(term119289, term119289.getClass(), "jsType", null);
        setField(term119289, term119289.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term119150;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term119064, args);
        assertTrue(recursiveEquals(term119064, term119288));
        assertTrue(recursiveEquals(term119150, term119289));
        assertTrue(recursiveEquals(retValue, null));
    }

};



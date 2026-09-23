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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149888;
     Object term149974;
     Object term150148;
     Object term150149;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149888 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term149974 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150060 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term149974, term149974.getClass(), "first", term150060);
        term150148 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term150148, term150148.getClass(), "propertyTestFunctions", null);
        term150149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term150149, term150149.getClass(), "functionName", null);
        setBooleanField(term150149, term150149.getClass(), "itsNeedsActivation", false);
        setIntField(term150149, term150149.getClass(), "itsFunctionType", 0);
        setBooleanField(term150149, term150149.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150149, term150149.getClass(), "encodedSourceStart", 0);
        setIntField(term150149, term150149.getClass(), "encodedSourceEnd", 0);
        setField(term150149, term150149.getClass(), "sourceName", null);
        setIntField(term150149, term150149.getClass(), "baseLineno", 0);
        setIntField(term150149, term150149.getClass(), "endLineno", 0);
        setField(term150149, term150149.getClass(), "functions", null);
        setField(term150149, term150149.getClass(), "regexps", null);
        setField(term150149, term150149.getClass(), "itsVariables", null);
        setField(term150149, term150149.getClass(), "itsConst", null);
        setField(term150149, term150149.getClass(), "itsVariableNames", null);
        setIntField(term150149, term150149.getClass(), "varStart", 0);
        setField(term150149, term150149.getClass(), "compilerData", null);
        setIntField(term150149, term150149.getClass(), "type", 0);
        setField(term150149, term150149.getClass(), "next", null);
        setField(term150150, term150150.getClass(), "functionName", null);
        setBooleanField(term150150, term150150.getClass(), "itsNeedsActivation", false);
        setIntField(term150150, term150150.getClass(), "itsFunctionType", 0);
        setBooleanField(term150150, term150150.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150150, term150150.getClass(), "encodedSourceStart", 0);
        setIntField(term150150, term150150.getClass(), "encodedSourceEnd", 0);
        setField(term150150, term150150.getClass(), "sourceName", null);
        setIntField(term150150, term150150.getClass(), "baseLineno", 0);
        setIntField(term150150, term150150.getClass(), "endLineno", 0);
        setField(term150150, term150150.getClass(), "functions", null);
        setField(term150150, term150150.getClass(), "regexps", null);
        setField(term150150, term150150.getClass(), "itsVariables", null);
        setField(term150150, term150150.getClass(), "itsConst", null);
        setField(term150150, term150150.getClass(), "itsVariableNames", null);
        setIntField(term150150, term150150.getClass(), "varStart", 0);
        setField(term150150, term150150.getClass(), "compilerData", null);
        setIntField(term150150, term150150.getClass(), "type", 0);
        setField(term150150, term150150.getClass(), "next", null);
        setField(term150150, term150150.getClass(), "first", null);
        setField(term150150, term150150.getClass(), "last", null);
        setField(term150150, term150150.getClass(), "propListHead", null);
        setIntField(term150150, term150150.getClass(), "sourcePosition", 0);
        setField(term150150, term150150.getClass(), "jsType", null);
        setField(term150150, term150150.getClass(), "parent", null);
        setField(term150149, term150149.getClass(), "first", term150150);
        setField(term150149, term150149.getClass(), "last", null);
        setField(term150149, term150149.getClass(), "propListHead", null);
        setIntField(term150149, term150149.getClass(), "sourcePosition", 0);
        setField(term150149, term150149.getClass(), "jsType", null);
        setField(term150149, term150149.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149974;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term149888, args);
        assertTrue(recursiveEquals(term149888, term150148));
        assertTrue(recursiveEquals(term149974, term150149));
        assertTrue(recursiveEquals(retValue, null));
    }

};



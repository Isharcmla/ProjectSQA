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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140375;
     Object term140461;
     Object term140604;
     Object term140605;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140375 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term140461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term140547, term140547.getClass(), "type", 42);
        setField(term140461, term140461.getClass(), "first", term140547);
        term140604 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term140604, term140604.getClass(), "propertyTestFunctions", null);
        term140605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140605, term140605.getClass(), "functionName", null);
        setBooleanField(term140605, term140605.getClass(), "itsNeedsActivation", false);
        setIntField(term140605, term140605.getClass(), "itsFunctionType", 0);
        setBooleanField(term140605, term140605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140605, term140605.getClass(), "encodedSourceStart", 0);
        setIntField(term140605, term140605.getClass(), "encodedSourceEnd", 0);
        setField(term140605, term140605.getClass(), "sourceName", null);
        setIntField(term140605, term140605.getClass(), "baseLineno", 0);
        setIntField(term140605, term140605.getClass(), "endLineno", 0);
        setField(term140605, term140605.getClass(), "functions", null);
        setField(term140605, term140605.getClass(), "regexps", null);
        setField(term140605, term140605.getClass(), "itsVariables", null);
        setField(term140605, term140605.getClass(), "itsConst", null);
        setField(term140605, term140605.getClass(), "itsVariableNames", null);
        setIntField(term140605, term140605.getClass(), "varStart", 0);
        setField(term140605, term140605.getClass(), "compilerData", null);
        setIntField(term140605, term140605.getClass(), "type", 0);
        setField(term140605, term140605.getClass(), "next", null);
        setField(term140606, term140606.getClass(), "functionName", null);
        setBooleanField(term140606, term140606.getClass(), "itsNeedsActivation", false);
        setIntField(term140606, term140606.getClass(), "itsFunctionType", 0);
        setBooleanField(term140606, term140606.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140606, term140606.getClass(), "encodedSourceStart", 0);
        setIntField(term140606, term140606.getClass(), "encodedSourceEnd", 0);
        setField(term140606, term140606.getClass(), "sourceName", null);
        setIntField(term140606, term140606.getClass(), "baseLineno", 0);
        setIntField(term140606, term140606.getClass(), "endLineno", 0);
        setField(term140606, term140606.getClass(), "functions", null);
        setField(term140606, term140606.getClass(), "regexps", null);
        setField(term140606, term140606.getClass(), "itsVariables", null);
        setField(term140606, term140606.getClass(), "itsConst", null);
        setField(term140606, term140606.getClass(), "itsVariableNames", null);
        setIntField(term140606, term140606.getClass(), "varStart", 0);
        setField(term140606, term140606.getClass(), "compilerData", null);
        setIntField(term140606, term140606.getClass(), "type", 42);
        setField(term140606, term140606.getClass(), "next", null);
        setField(term140606, term140606.getClass(), "first", null);
        setField(term140606, term140606.getClass(), "last", null);
        setField(term140606, term140606.getClass(), "propListHead", null);
        setIntField(term140606, term140606.getClass(), "sourcePosition", 0);
        setField(term140606, term140606.getClass(), "jsType", null);
        setField(term140606, term140606.getClass(), "parent", null);
        setField(term140605, term140605.getClass(), "first", term140606);
        setField(term140605, term140605.getClass(), "last", null);
        setField(term140605, term140605.getClass(), "propListHead", null);
        setIntField(term140605, term140605.getClass(), "sourcePosition", 0);
        setField(term140605, term140605.getClass(), "jsType", null);
        setField(term140605, term140605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term140461;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term140375, args);
        assertTrue(recursiveEquals(term140375, term140604));
        assertTrue(recursiveEquals(term140461, term140605));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154008;
     Object term154094;
     Object term154284;
     Object term154285;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154008 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term154094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term154180 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term154094, term154094.getClass(), "first", term154180);
        term154284 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term154284, term154284.getClass(), "propertyTestFunctions", null);
        term154285 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term154286 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term154285, term154285.getClass(), "functionName", null);
        setBooleanField(term154285, term154285.getClass(), "itsNeedsActivation", false);
        setIntField(term154285, term154285.getClass(), "itsFunctionType", 0);
        setBooleanField(term154285, term154285.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term154285, term154285.getClass(), "encodedSourceStart", 0);
        setIntField(term154285, term154285.getClass(), "encodedSourceEnd", 0);
        setField(term154285, term154285.getClass(), "sourceName", null);
        setIntField(term154285, term154285.getClass(), "baseLineno", 0);
        setIntField(term154285, term154285.getClass(), "endLineno", 0);
        setField(term154285, term154285.getClass(), "functions", null);
        setField(term154285, term154285.getClass(), "regexps", null);
        setField(term154285, term154285.getClass(), "itsVariables", null);
        setField(term154285, term154285.getClass(), "itsConst", null);
        setField(term154285, term154285.getClass(), "itsVariableNames", null);
        setIntField(term154285, term154285.getClass(), "varStart", 0);
        setField(term154285, term154285.getClass(), "compilerData", null);
        setIntField(term154285, term154285.getClass(), "type", 0);
        setField(term154285, term154285.getClass(), "next", null);
        setField(term154286, term154286.getClass(), "functionName", null);
        setBooleanField(term154286, term154286.getClass(), "itsNeedsActivation", false);
        setIntField(term154286, term154286.getClass(), "itsFunctionType", 0);
        setBooleanField(term154286, term154286.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term154286, term154286.getClass(), "encodedSourceStart", 0);
        setIntField(term154286, term154286.getClass(), "encodedSourceEnd", 0);
        setField(term154286, term154286.getClass(), "sourceName", null);
        setIntField(term154286, term154286.getClass(), "baseLineno", 0);
        setIntField(term154286, term154286.getClass(), "endLineno", 0);
        setField(term154286, term154286.getClass(), "functions", null);
        setField(term154286, term154286.getClass(), "regexps", null);
        setField(term154286, term154286.getClass(), "itsVariables", null);
        setField(term154286, term154286.getClass(), "itsConst", null);
        setField(term154286, term154286.getClass(), "itsVariableNames", null);
        setIntField(term154286, term154286.getClass(), "varStart", 0);
        setField(term154286, term154286.getClass(), "compilerData", null);
        setIntField(term154286, term154286.getClass(), "type", 0);
        setField(term154286, term154286.getClass(), "next", null);
        setField(term154286, term154286.getClass(), "first", null);
        setField(term154286, term154286.getClass(), "last", null);
        setField(term154286, term154286.getClass(), "propListHead", null);
        setIntField(term154286, term154286.getClass(), "sourcePosition", 0);
        setField(term154286, term154286.getClass(), "jsType", null);
        setField(term154286, term154286.getClass(), "parent", null);
        setField(term154285, term154285.getClass(), "first", term154286);
        setField(term154285, term154285.getClass(), "last", null);
        setField(term154285, term154285.getClass(), "propListHead", null);
        setIntField(term154285, term154285.getClass(), "sourcePosition", 0);
        setField(term154285, term154285.getClass(), "jsType", null);
        setField(term154285, term154285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term154094;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term154008, args);
        assertTrue(recursiveEquals(term154008, term154284));
        assertTrue(recursiveEquals(term154094, term154285));
        assertTrue(recursiveEquals(retValue, null));
    }

};



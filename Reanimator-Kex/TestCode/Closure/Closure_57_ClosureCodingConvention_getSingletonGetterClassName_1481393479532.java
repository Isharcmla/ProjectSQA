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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167908;
     Object term168000;
     Object term178175;
     Object term178176;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167908 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term168000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term168086 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term168086, term168086.getClass(), "type", 42);
        setField(term168000, term168000.getClass(), "first", term168086);
        term178175 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term178175, term178175.getClass(), "propertyTestFunctions", null);
        term178176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term178177 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term178176, term178176.getClass(), "number", 0.0);
        setIntField(term178176, term178176.getClass(), "type", 0);
        setField(term178176, term178176.getClass(), "next", null);
        setField(term178177, term178177.getClass(), "functionName", null);
        setBooleanField(term178177, term178177.getClass(), "itsNeedsActivation", false);
        setIntField(term178177, term178177.getClass(), "itsFunctionType", 0);
        setBooleanField(term178177, term178177.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178177, term178177.getClass(), "encodedSourceStart", 0);
        setIntField(term178177, term178177.getClass(), "encodedSourceEnd", 0);
        setField(term178177, term178177.getClass(), "sourceName", null);
        setIntField(term178177, term178177.getClass(), "baseLineno", 0);
        setIntField(term178177, term178177.getClass(), "endLineno", 0);
        setField(term178177, term178177.getClass(), "functions", null);
        setField(term178177, term178177.getClass(), "regexps", null);
        setField(term178177, term178177.getClass(), "itsVariables", null);
        setField(term178177, term178177.getClass(), "itsConst", null);
        setField(term178177, term178177.getClass(), "itsVariableNames", null);
        setIntField(term178177, term178177.getClass(), "varStart", 0);
        setField(term178177, term178177.getClass(), "compilerData", null);
        setIntField(term178177, term178177.getClass(), "type", 42);
        setField(term178177, term178177.getClass(), "next", null);
        setField(term178177, term178177.getClass(), "first", null);
        setField(term178177, term178177.getClass(), "last", null);
        setField(term178177, term178177.getClass(), "propListHead", null);
        setIntField(term178177, term178177.getClass(), "sourcePosition", 0);
        setField(term178177, term178177.getClass(), "jsType", null);
        setField(term178177, term178177.getClass(), "parent", null);
        setField(term178176, term178176.getClass(), "first", term178177);
        setField(term178176, term178176.getClass(), "last", null);
        setField(term178176, term178176.getClass(), "propListHead", null);
        setIntField(term178176, term178176.getClass(), "sourcePosition", 0);
        setField(term178176, term178176.getClass(), "jsType", null);
        setField(term178176, term178176.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168000;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term167908, args);
        assertTrue(recursiveEquals(term167908, term178175));
        assertTrue(recursiveEquals(term168000, term178176));
        assertTrue(recursiveEquals(retValue, null));
    }

};



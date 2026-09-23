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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207595;
     Object term207681;
     Object term207809;
     Object term207810;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207595 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term207681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term207773, term207773.getClass(), "type", 42);
        setField(term207681, term207681.getClass(), "first", term207773);
        term207809 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term207809, term207809.getClass(), "propertyTestFunctions", null);
        term207810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term207810, term207810.getClass(), "functionName", null);
        setBooleanField(term207810, term207810.getClass(), "itsNeedsActivation", false);
        setIntField(term207810, term207810.getClass(), "itsFunctionType", 0);
        setBooleanField(term207810, term207810.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term207810, term207810.getClass(), "encodedSourceStart", 0);
        setIntField(term207810, term207810.getClass(), "encodedSourceEnd", 0);
        setField(term207810, term207810.getClass(), "sourceName", null);
        setIntField(term207810, term207810.getClass(), "baseLineno", 0);
        setIntField(term207810, term207810.getClass(), "endLineno", 0);
        setField(term207810, term207810.getClass(), "functions", null);
        setField(term207810, term207810.getClass(), "regexps", null);
        setField(term207810, term207810.getClass(), "itsVariables", null);
        setField(term207810, term207810.getClass(), "itsConst", null);
        setField(term207810, term207810.getClass(), "itsVariableNames", null);
        setIntField(term207810, term207810.getClass(), "varStart", 0);
        setField(term207810, term207810.getClass(), "compilerData", null);
        setIntField(term207810, term207810.getClass(), "type", 0);
        setField(term207810, term207810.getClass(), "next", null);
        setDoubleField(term207811, term207811.getClass(), "number", 0.0);
        setIntField(term207811, term207811.getClass(), "type", 42);
        setField(term207811, term207811.getClass(), "next", null);
        setField(term207811, term207811.getClass(), "first", null);
        setField(term207811, term207811.getClass(), "last", null);
        setField(term207811, term207811.getClass(), "propListHead", null);
        setIntField(term207811, term207811.getClass(), "sourcePosition", 0);
        setField(term207811, term207811.getClass(), "jsType", null);
        setField(term207811, term207811.getClass(), "parent", null);
        setField(term207810, term207810.getClass(), "first", term207811);
        setField(term207810, term207810.getClass(), "last", null);
        setField(term207810, term207810.getClass(), "propListHead", null);
        setIntField(term207810, term207810.getClass(), "sourcePosition", 0);
        setField(term207810, term207810.getClass(), "jsType", null);
        setField(term207810, term207810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term207681;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term207595, args);
        assertTrue(recursiveEquals(term207595, term207809));
        assertTrue(recursiveEquals(term207681, term207810));
        assertTrue(recursiveEquals(retValue, null));
    }

};



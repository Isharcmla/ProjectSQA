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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120004;
     Object term120090;
     Object term120544;
     Object term120545;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120004 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term120090 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term120090, term120090.getClass(), "first", term120176);
        term120544 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term120544, term120544.getClass(), "propertyTestFunctions", null);
        term120545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120546 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term120545, term120545.getClass(), "functionName", null);
        setBooleanField(term120545, term120545.getClass(), "itsNeedsActivation", false);
        setIntField(term120545, term120545.getClass(), "itsFunctionType", 0);
        setBooleanField(term120545, term120545.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term120545, term120545.getClass(), "encodedSourceStart", 0);
        setIntField(term120545, term120545.getClass(), "encodedSourceEnd", 0);
        setField(term120545, term120545.getClass(), "sourceName", null);
        setIntField(term120545, term120545.getClass(), "baseLineno", 0);
        setIntField(term120545, term120545.getClass(), "endLineno", 0);
        setField(term120545, term120545.getClass(), "functions", null);
        setField(term120545, term120545.getClass(), "regexps", null);
        setField(term120545, term120545.getClass(), "itsVariables", null);
        setField(term120545, term120545.getClass(), "itsConst", null);
        setField(term120545, term120545.getClass(), "itsVariableNames", null);
        setIntField(term120545, term120545.getClass(), "varStart", 0);
        setField(term120545, term120545.getClass(), "compilerData", null);
        setIntField(term120545, term120545.getClass(), "type", 0);
        setField(term120545, term120545.getClass(), "next", null);
        setField(term120546, term120546.getClass(), "functionName", null);
        setBooleanField(term120546, term120546.getClass(), "itsNeedsActivation", false);
        setIntField(term120546, term120546.getClass(), "itsFunctionType", 0);
        setBooleanField(term120546, term120546.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term120546, term120546.getClass(), "encodedSourceStart", 0);
        setIntField(term120546, term120546.getClass(), "encodedSourceEnd", 0);
        setField(term120546, term120546.getClass(), "sourceName", null);
        setIntField(term120546, term120546.getClass(), "baseLineno", 0);
        setIntField(term120546, term120546.getClass(), "endLineno", 0);
        setField(term120546, term120546.getClass(), "functions", null);
        setField(term120546, term120546.getClass(), "regexps", null);
        setField(term120546, term120546.getClass(), "itsVariables", null);
        setField(term120546, term120546.getClass(), "itsConst", null);
        setField(term120546, term120546.getClass(), "itsVariableNames", null);
        setIntField(term120546, term120546.getClass(), "varStart", 0);
        setField(term120546, term120546.getClass(), "compilerData", null);
        setIntField(term120546, term120546.getClass(), "type", 0);
        setField(term120546, term120546.getClass(), "next", null);
        setField(term120546, term120546.getClass(), "first", null);
        setField(term120546, term120546.getClass(), "last", null);
        setField(term120546, term120546.getClass(), "propListHead", null);
        setIntField(term120546, term120546.getClass(), "sourcePosition", 0);
        setField(term120546, term120546.getClass(), "jsType", null);
        setField(term120546, term120546.getClass(), "parent", null);
        setField(term120545, term120545.getClass(), "first", term120546);
        setField(term120545, term120545.getClass(), "last", null);
        setField(term120545, term120545.getClass(), "propListHead", null);
        setIntField(term120545, term120545.getClass(), "sourcePosition", 0);
        setField(term120545, term120545.getClass(), "jsType", null);
        setField(term120545, term120545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term120090;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term120004, args);
        assertTrue(recursiveEquals(term120004, term120544));
        assertTrue(recursiveEquals(term120090, term120545));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77633;
     Object term77719;
     Object term77857;
     Object term77858;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77633 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term77719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term77805, term77805.getClass(), "type", -34);
        setField(term77719, term77719.getClass(), "first", term77805);
        term77857 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term77857, term77857.getClass(), "propertyTestFunctions", null);
        term77858 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term77859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77858, term77858.getClass(), "functionName", null);
        setBooleanField(term77858, term77858.getClass(), "itsNeedsActivation", false);
        setIntField(term77858, term77858.getClass(), "itsFunctionType", 0);
        setBooleanField(term77858, term77858.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77858, term77858.getClass(), "encodedSourceStart", 0);
        setIntField(term77858, term77858.getClass(), "encodedSourceEnd", 0);
        setField(term77858, term77858.getClass(), "sourceName", null);
        setIntField(term77858, term77858.getClass(), "baseLineno", 0);
        setIntField(term77858, term77858.getClass(), "endLineno", 0);
        setField(term77858, term77858.getClass(), "functions", null);
        setField(term77858, term77858.getClass(), "regexps", null);
        setField(term77858, term77858.getClass(), "itsVariables", null);
        setField(term77858, term77858.getClass(), "itsConst", null);
        setField(term77858, term77858.getClass(), "itsVariableNames", null);
        setIntField(term77858, term77858.getClass(), "varStart", 0);
        setField(term77858, term77858.getClass(), "compilerData", null);
        setIntField(term77858, term77858.getClass(), "type", 0);
        setField(term77858, term77858.getClass(), "next", null);
        setField(term77859, term77859.getClass(), "functionName", null);
        setBooleanField(term77859, term77859.getClass(), "itsNeedsActivation", false);
        setIntField(term77859, term77859.getClass(), "itsFunctionType", 0);
        setBooleanField(term77859, term77859.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77859, term77859.getClass(), "encodedSourceStart", 0);
        setIntField(term77859, term77859.getClass(), "encodedSourceEnd", 0);
        setField(term77859, term77859.getClass(), "sourceName", null);
        setIntField(term77859, term77859.getClass(), "baseLineno", 0);
        setIntField(term77859, term77859.getClass(), "endLineno", 0);
        setField(term77859, term77859.getClass(), "functions", null);
        setField(term77859, term77859.getClass(), "regexps", null);
        setField(term77859, term77859.getClass(), "itsVariables", null);
        setField(term77859, term77859.getClass(), "itsConst", null);
        setField(term77859, term77859.getClass(), "itsVariableNames", null);
        setIntField(term77859, term77859.getClass(), "varStart", 0);
        setField(term77859, term77859.getClass(), "compilerData", null);
        setIntField(term77859, term77859.getClass(), "type", -34);
        setField(term77859, term77859.getClass(), "next", null);
        setField(term77859, term77859.getClass(), "first", null);
        setField(term77859, term77859.getClass(), "last", null);
        setField(term77859, term77859.getClass(), "propListHead", null);
        setIntField(term77859, term77859.getClass(), "sourcePosition", 0);
        setField(term77859, term77859.getClass(), "jsType", null);
        setField(term77859, term77859.getClass(), "parent", null);
        setField(term77858, term77858.getClass(), "first", term77859);
        setField(term77858, term77858.getClass(), "last", null);
        setField(term77858, term77858.getClass(), "propListHead", null);
        setIntField(term77858, term77858.getClass(), "sourcePosition", 0);
        setField(term77858, term77858.getClass(), "jsType", null);
        setField(term77858, term77858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77719;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term77633, args);
        assertTrue(recursiveEquals(term77633, term77857));
        assertTrue(recursiveEquals(term77719, term77858));
        assertTrue(recursiveEquals(retValue, null));
    }

};



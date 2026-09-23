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

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211015;
     Object term211101;
     Object term229921;
     Object term229922;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211015 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term211101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term211187 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term211279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211187, term211187.getClass(), "type", 33);
        setField(term211279, term211279.getClass(), "str", "inherits");
        setField(term211187, term211187.getClass(), "last", term211279);
        setField(term211187, term211187.getClass(), "next", term211387);
        setField(term211101, term211101.getClass(), "first", term211187);
        setField(term211101, term211101.getClass(), "last", null);
        term229921 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term229921, term229921.getClass(), "propertyTestFunctions", null);
        term229922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term229924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term229922, term229922.getClass(), "functionName", null);
        setBooleanField(term229922, term229922.getClass(), "itsNeedsActivation", false);
        setIntField(term229922, term229922.getClass(), "itsFunctionType", 0);
        setBooleanField(term229922, term229922.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229922, term229922.getClass(), "encodedSourceStart", 0);
        setIntField(term229922, term229922.getClass(), "encodedSourceEnd", 0);
        setField(term229922, term229922.getClass(), "sourceName", null);
        setIntField(term229922, term229922.getClass(), "baseLineno", 0);
        setIntField(term229922, term229922.getClass(), "endLineno", 0);
        setField(term229922, term229922.getClass(), "functions", null);
        setField(term229922, term229922.getClass(), "regexps", null);
        setField(term229922, term229922.getClass(), "itsVariables", null);
        setField(term229922, term229922.getClass(), "itsConst", null);
        setField(term229922, term229922.getClass(), "itsVariableNames", null);
        setIntField(term229922, term229922.getClass(), "varStart", 0);
        setField(term229922, term229922.getClass(), "compilerData", null);
        setIntField(term229922, term229922.getClass(), "type", 0);
        setField(term229922, term229922.getClass(), "next", null);
        setField(term229923, term229923.getClass(), "functionName", null);
        setBooleanField(term229923, term229923.getClass(), "itsNeedsActivation", false);
        setIntField(term229923, term229923.getClass(), "itsFunctionType", 0);
        setBooleanField(term229923, term229923.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229923, term229923.getClass(), "encodedSourceStart", 0);
        setIntField(term229923, term229923.getClass(), "encodedSourceEnd", 0);
        setField(term229923, term229923.getClass(), "sourceName", null);
        setIntField(term229923, term229923.getClass(), "baseLineno", 0);
        setIntField(term229923, term229923.getClass(), "endLineno", 0);
        setField(term229923, term229923.getClass(), "functions", null);
        setField(term229923, term229923.getClass(), "regexps", null);
        setField(term229923, term229923.getClass(), "itsVariables", null);
        setField(term229923, term229923.getClass(), "itsConst", null);
        setField(term229923, term229923.getClass(), "itsVariableNames", null);
        setIntField(term229923, term229923.getClass(), "varStart", 0);
        setField(term229923, term229923.getClass(), "compilerData", null);
        setIntField(term229923, term229923.getClass(), "type", 33);
        setIntField(term229924, term229924.getClass(), "type", 0);
        setField(term229924, term229924.getClass(), "next", null);
        setField(term229924, term229924.getClass(), "first", null);
        setField(term229924, term229924.getClass(), "last", null);
        setField(term229924, term229924.getClass(), "propListHead", null);
        setIntField(term229924, term229924.getClass(), "sourcePosition", 0);
        setField(term229924, term229924.getClass(), "jsType", null);
        setField(term229924, term229924.getClass(), "parent", null);
        setField(term229923, term229923.getClass(), "next", term229924);
        setField(term229923, term229923.getClass(), "first", null);
        setField(term229925, term229925.getClass(), "str", "inherits");
        setIntField(term229925, term229925.getClass(), "type", 0);
        setField(term229925, term229925.getClass(), "next", null);
        setField(term229925, term229925.getClass(), "first", null);
        setField(term229925, term229925.getClass(), "last", null);
        setField(term229925, term229925.getClass(), "propListHead", null);
        setIntField(term229925, term229925.getClass(), "sourcePosition", 0);
        setField(term229925, term229925.getClass(), "jsType", null);
        setField(term229925, term229925.getClass(), "parent", null);
        setField(term229923, term229923.getClass(), "last", term229925);
        setField(term229923, term229923.getClass(), "propListHead", null);
        setIntField(term229923, term229923.getClass(), "sourcePosition", 0);
        setField(term229923, term229923.getClass(), "jsType", null);
        setField(term229923, term229923.getClass(), "parent", null);
        setField(term229922, term229922.getClass(), "first", term229923);
        setField(term229922, term229922.getClass(), "last", null);
        setField(term229922, term229922.getClass(), "propListHead", null);
        setIntField(term229922, term229922.getClass(), "sourcePosition", 0);
        setField(term229922, term229922.getClass(), "jsType", null);
        setField(term229922, term229922.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term211101;
        Object retValue = callMethod(klass, "getClassesDefinedByCall", argTypes, term211015, args);
        assertTrue(recursiveEquals(term211015, term229921));
        assertTrue(recursiveEquals(term211101, term229922));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146975;
     Object term147061;
     Object term147212;
     Object term147213;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146975 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term147061 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147061, term147061.getClass(), "first", term147153);
        term147212 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term147212, term147212.getClass(), "propertyTestFunctions", null);
        term147213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147213, term147213.getClass(), "functionName", null);
        setBooleanField(term147213, term147213.getClass(), "itsNeedsActivation", false);
        setIntField(term147213, term147213.getClass(), "itsFunctionType", 0);
        setBooleanField(term147213, term147213.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147213, term147213.getClass(), "encodedSourceStart", 0);
        setIntField(term147213, term147213.getClass(), "encodedSourceEnd", 0);
        setField(term147213, term147213.getClass(), "sourceName", null);
        setIntField(term147213, term147213.getClass(), "baseLineno", 0);
        setIntField(term147213, term147213.getClass(), "endLineno", 0);
        setField(term147213, term147213.getClass(), "functions", null);
        setField(term147213, term147213.getClass(), "regexps", null);
        setField(term147213, term147213.getClass(), "itsVariables", null);
        setField(term147213, term147213.getClass(), "itsConst", null);
        setField(term147213, term147213.getClass(), "itsVariableNames", null);
        setIntField(term147213, term147213.getClass(), "varStart", 0);
        setField(term147213, term147213.getClass(), "compilerData", null);
        setIntField(term147213, term147213.getClass(), "type", 0);
        setField(term147213, term147213.getClass(), "next", null);
        setField(term147214, term147214.getClass(), "str", null);
        setIntField(term147214, term147214.getClass(), "type", 0);
        setField(term147214, term147214.getClass(), "next", null);
        setField(term147214, term147214.getClass(), "first", null);
        setField(term147214, term147214.getClass(), "last", null);
        setField(term147214, term147214.getClass(), "propListHead", null);
        setIntField(term147214, term147214.getClass(), "sourcePosition", 0);
        setField(term147214, term147214.getClass(), "jsType", null);
        setField(term147214, term147214.getClass(), "parent", null);
        setField(term147213, term147213.getClass(), "first", term147214);
        setField(term147213, term147213.getClass(), "last", null);
        setField(term147213, term147213.getClass(), "propListHead", null);
        setIntField(term147213, term147213.getClass(), "sourcePosition", 0);
        setField(term147213, term147213.getClass(), "jsType", null);
        setField(term147213, term147213.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term147061;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term146975, args);
        assertTrue(recursiveEquals(term146975, term147212));
        assertTrue(recursiveEquals(term147061, term147213));
        assertTrue(recursiveEquals(retValue, null));
    }

};



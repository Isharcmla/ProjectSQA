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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140735;
     Object term140821;
     Object term140943;
     Object term140944;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140735 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term140821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term140821, term140821.getClass(), "first", term140913);
        term140943 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term140943, term140943.getClass(), "propertyTestFunctions", null);
        term140944 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term140944, term140944.getClass(), "functionName", null);
        setBooleanField(term140944, term140944.getClass(), "itsNeedsActivation", false);
        setIntField(term140944, term140944.getClass(), "itsFunctionType", 0);
        setBooleanField(term140944, term140944.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term140944, term140944.getClass(), "encodedSourceStart", 0);
        setIntField(term140944, term140944.getClass(), "encodedSourceEnd", 0);
        setField(term140944, term140944.getClass(), "sourceName", null);
        setIntField(term140944, term140944.getClass(), "baseLineno", 0);
        setIntField(term140944, term140944.getClass(), "endLineno", 0);
        setField(term140944, term140944.getClass(), "functions", null);
        setField(term140944, term140944.getClass(), "regexps", null);
        setField(term140944, term140944.getClass(), "itsVariables", null);
        setField(term140944, term140944.getClass(), "itsConst", null);
        setField(term140944, term140944.getClass(), "itsVariableNames", null);
        setIntField(term140944, term140944.getClass(), "varStart", 0);
        setField(term140944, term140944.getClass(), "compilerData", null);
        setIntField(term140944, term140944.getClass(), "type", 0);
        setField(term140944, term140944.getClass(), "next", null);
        setDoubleField(term140945, term140945.getClass(), "number", 0.0);
        setIntField(term140945, term140945.getClass(), "type", 0);
        setField(term140945, term140945.getClass(), "next", null);
        setField(term140945, term140945.getClass(), "first", null);
        setField(term140945, term140945.getClass(), "last", null);
        setField(term140945, term140945.getClass(), "propListHead", null);
        setIntField(term140945, term140945.getClass(), "sourcePosition", 0);
        setField(term140945, term140945.getClass(), "jsType", null);
        setField(term140945, term140945.getClass(), "parent", null);
        setField(term140944, term140944.getClass(), "first", term140945);
        setField(term140944, term140944.getClass(), "last", null);
        setField(term140944, term140944.getClass(), "propListHead", null);
        setIntField(term140944, term140944.getClass(), "sourcePosition", 0);
        setField(term140944, term140944.getClass(), "jsType", null);
        setField(term140944, term140944.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term140821;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term140735, args);
        assertTrue(recursiveEquals(term140735, term140943));
        assertTrue(recursiveEquals(term140821, term140944));
        assertTrue(recursiveEquals(retValue, null));
    }

};



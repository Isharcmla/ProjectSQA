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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156592;
     Object term156684;
     Object term157121;
     Object term157122;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156592 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term156684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term156684, term156684.getClass(), "first", term156770);
        term157121 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term157121, term157121.getClass(), "propertyTestFunctions", null);
        term157122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157123 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term157122, term157122.getClass(), "str", null);
        setIntField(term157122, term157122.getClass(), "type", 0);
        setField(term157122, term157122.getClass(), "next", null);
        setField(term157123, term157123.getClass(), "functionName", null);
        setBooleanField(term157123, term157123.getClass(), "itsNeedsActivation", false);
        setIntField(term157123, term157123.getClass(), "itsFunctionType", 0);
        setBooleanField(term157123, term157123.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term157123, term157123.getClass(), "encodedSourceStart", 0);
        setIntField(term157123, term157123.getClass(), "encodedSourceEnd", 0);
        setField(term157123, term157123.getClass(), "sourceName", null);
        setIntField(term157123, term157123.getClass(), "baseLineno", 0);
        setIntField(term157123, term157123.getClass(), "endLineno", 0);
        setField(term157123, term157123.getClass(), "functions", null);
        setField(term157123, term157123.getClass(), "regexps", null);
        setField(term157123, term157123.getClass(), "itsVariables", null);
        setField(term157123, term157123.getClass(), "itsConst", null);
        setField(term157123, term157123.getClass(), "itsVariableNames", null);
        setIntField(term157123, term157123.getClass(), "varStart", 0);
        setField(term157123, term157123.getClass(), "compilerData", null);
        setIntField(term157123, term157123.getClass(), "type", 0);
        setField(term157123, term157123.getClass(), "next", null);
        setField(term157123, term157123.getClass(), "first", null);
        setField(term157123, term157123.getClass(), "last", null);
        setField(term157123, term157123.getClass(), "propListHead", null);
        setIntField(term157123, term157123.getClass(), "sourcePosition", 0);
        setField(term157123, term157123.getClass(), "jsType", null);
        setField(term157123, term157123.getClass(), "parent", null);
        setField(term157122, term157122.getClass(), "first", term157123);
        setField(term157122, term157122.getClass(), "last", null);
        setField(term157122, term157122.getClass(), "propListHead", null);
        setIntField(term157122, term157122.getClass(), "sourcePosition", 0);
        setField(term157122, term157122.getClass(), "jsType", null);
        setField(term157122, term157122.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156684;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term156592, args);
        assertTrue(recursiveEquals(term156592, term157121));
        assertTrue(recursiveEquals(term156684, term157122));
        assertTrue(recursiveEquals(retValue, null));
    }

};



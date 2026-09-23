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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148304;
     Object term148390;
     Object term148743;
     Object term148744;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148304 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term148390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148390, term148390.getClass(), "first", term148390);
        setIntField(term148390, term148390.getClass(), "type", 42);
        term148743 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term148743, term148743.getClass(), "propertyTestFunctions", null);
        term148744 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term148744, term148744.getClass(), "functionName", null);
        setBooleanField(term148744, term148744.getClass(), "itsNeedsActivation", false);
        setIntField(term148744, term148744.getClass(), "itsFunctionType", 0);
        setBooleanField(term148744, term148744.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148744, term148744.getClass(), "encodedSourceStart", 0);
        setIntField(term148744, term148744.getClass(), "encodedSourceEnd", 0);
        setField(term148744, term148744.getClass(), "sourceName", null);
        setIntField(term148744, term148744.getClass(), "baseLineno", 0);
        setIntField(term148744, term148744.getClass(), "endLineno", 0);
        setField(term148744, term148744.getClass(), "functions", null);
        setField(term148744, term148744.getClass(), "regexps", null);
        setField(term148744, term148744.getClass(), "itsVariables", null);
        setField(term148744, term148744.getClass(), "itsConst", null);
        setField(term148744, term148744.getClass(), "itsVariableNames", null);
        setIntField(term148744, term148744.getClass(), "varStart", 0);
        setField(term148744, term148744.getClass(), "compilerData", null);
        setIntField(term148744, term148744.getClass(), "type", 42);
        setField(term148744, term148744.getClass(), "next", null);
        setField(term148744, term148744.getClass(), "first", term148744);
        setField(term148744, term148744.getClass(), "last", null);
        setField(term148744, term148744.getClass(), "propListHead", null);
        setIntField(term148744, term148744.getClass(), "sourcePosition", 0);
        setField(term148744, term148744.getClass(), "jsType", null);
        setField(term148744, term148744.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148390;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term148304, args);
        assertTrue(recursiveEquals(term148304, term148743));
        assertTrue(recursiveEquals(term148390, term148744));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153712;
     Object term153798;
     Object term154231;
     Object term154232;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153712 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term153798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term153884 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term153798, term153798.getClass(), "first", term153884);
        term154231 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term154231, term154231.getClass(), "propertyTestFunctions", null);
        term154232 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term154233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term154232, term154232.getClass(), "functionName", null);
        setBooleanField(term154232, term154232.getClass(), "itsNeedsActivation", false);
        setIntField(term154232, term154232.getClass(), "itsFunctionType", 0);
        setBooleanField(term154232, term154232.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term154232, term154232.getClass(), "encodedSourceStart", 0);
        setIntField(term154232, term154232.getClass(), "encodedSourceEnd", 0);
        setField(term154232, term154232.getClass(), "sourceName", null);
        setIntField(term154232, term154232.getClass(), "baseLineno", 0);
        setIntField(term154232, term154232.getClass(), "endLineno", 0);
        setField(term154232, term154232.getClass(), "functions", null);
        setField(term154232, term154232.getClass(), "regexps", null);
        setField(term154232, term154232.getClass(), "itsVariables", null);
        setField(term154232, term154232.getClass(), "itsConst", null);
        setField(term154232, term154232.getClass(), "itsVariableNames", null);
        setIntField(term154232, term154232.getClass(), "varStart", 0);
        setField(term154232, term154232.getClass(), "compilerData", null);
        setIntField(term154232, term154232.getClass(), "type", 0);
        setField(term154232, term154232.getClass(), "next", null);
        setField(term154233, term154233.getClass(), "functionName", null);
        setBooleanField(term154233, term154233.getClass(), "itsNeedsActivation", false);
        setIntField(term154233, term154233.getClass(), "itsFunctionType", 0);
        setBooleanField(term154233, term154233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term154233, term154233.getClass(), "encodedSourceStart", 0);
        setIntField(term154233, term154233.getClass(), "encodedSourceEnd", 0);
        setField(term154233, term154233.getClass(), "sourceName", null);
        setIntField(term154233, term154233.getClass(), "baseLineno", 0);
        setIntField(term154233, term154233.getClass(), "endLineno", 0);
        setField(term154233, term154233.getClass(), "functions", null);
        setField(term154233, term154233.getClass(), "regexps", null);
        setField(term154233, term154233.getClass(), "itsVariables", null);
        setField(term154233, term154233.getClass(), "itsConst", null);
        setField(term154233, term154233.getClass(), "itsVariableNames", null);
        setIntField(term154233, term154233.getClass(), "varStart", 0);
        setField(term154233, term154233.getClass(), "compilerData", null);
        setIntField(term154233, term154233.getClass(), "type", 0);
        setField(term154233, term154233.getClass(), "next", null);
        setField(term154233, term154233.getClass(), "first", null);
        setField(term154233, term154233.getClass(), "last", null);
        setField(term154233, term154233.getClass(), "propListHead", null);
        setIntField(term154233, term154233.getClass(), "sourcePosition", 0);
        setField(term154233, term154233.getClass(), "jsType", null);
        setField(term154233, term154233.getClass(), "parent", null);
        setField(term154232, term154232.getClass(), "first", term154233);
        setField(term154232, term154232.getClass(), "last", null);
        setField(term154232, term154232.getClass(), "propListHead", null);
        setIntField(term154232, term154232.getClass(), "sourcePosition", 0);
        setField(term154232, term154232.getClass(), "jsType", null);
        setField(term154232, term154232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term153798;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term153712, args);
        assertTrue(recursiveEquals(term153712, term154231));
        assertTrue(recursiveEquals(term153798, term154232));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152647;
     Object term152739;
     Object term152868;
     Object term152869;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152647 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term152739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152825 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term152739, term152739.getClass(), "first", term152825);
        term152868 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term152868, term152868.getClass(), "propertyTestFunctions", null);
        term152869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term152870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term152869, term152869.getClass(), "str", null);
        setIntField(term152869, term152869.getClass(), "type", 0);
        setField(term152869, term152869.getClass(), "next", null);
        setField(term152870, term152870.getClass(), "functionName", null);
        setBooleanField(term152870, term152870.getClass(), "itsNeedsActivation", false);
        setIntField(term152870, term152870.getClass(), "itsFunctionType", 0);
        setBooleanField(term152870, term152870.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term152870, term152870.getClass(), "encodedSourceStart", 0);
        setIntField(term152870, term152870.getClass(), "encodedSourceEnd", 0);
        setField(term152870, term152870.getClass(), "sourceName", null);
        setIntField(term152870, term152870.getClass(), "baseLineno", 0);
        setIntField(term152870, term152870.getClass(), "endLineno", 0);
        setField(term152870, term152870.getClass(), "functions", null);
        setField(term152870, term152870.getClass(), "regexps", null);
        setField(term152870, term152870.getClass(), "itsVariables", null);
        setField(term152870, term152870.getClass(), "itsConst", null);
        setField(term152870, term152870.getClass(), "itsVariableNames", null);
        setIntField(term152870, term152870.getClass(), "varStart", 0);
        setField(term152870, term152870.getClass(), "compilerData", null);
        setIntField(term152870, term152870.getClass(), "type", 0);
        setField(term152870, term152870.getClass(), "next", null);
        setField(term152870, term152870.getClass(), "first", null);
        setField(term152870, term152870.getClass(), "last", null);
        setField(term152870, term152870.getClass(), "propListHead", null);
        setIntField(term152870, term152870.getClass(), "sourcePosition", 0);
        setField(term152870, term152870.getClass(), "jsType", null);
        setField(term152870, term152870.getClass(), "parent", null);
        setField(term152869, term152869.getClass(), "first", term152870);
        setField(term152869, term152869.getClass(), "last", null);
        setField(term152869, term152869.getClass(), "propListHead", null);
        setIntField(term152869, term152869.getClass(), "sourcePosition", 0);
        setField(term152869, term152869.getClass(), "jsType", null);
        setField(term152869, term152869.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term152739;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term152647, args);
        assertTrue(recursiveEquals(term152647, term152868));
        assertTrue(recursiveEquals(term152739, term152869));
        assertTrue(recursiveEquals(retValue, null));
    }

};



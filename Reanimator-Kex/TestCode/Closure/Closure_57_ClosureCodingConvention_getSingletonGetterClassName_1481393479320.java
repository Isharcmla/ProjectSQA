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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127348;
     Object term127434;
     Object term127878;
     Object term127879;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127348 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term127434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term127520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term127434, term127434.getClass(), "first", term127520);
        term127878 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term127878, term127878.getClass(), "propertyTestFunctions", null);
        term127879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term127880 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term127879, term127879.getClass(), "functionName", null);
        setBooleanField(term127879, term127879.getClass(), "itsNeedsActivation", false);
        setIntField(term127879, term127879.getClass(), "itsFunctionType", 0);
        setBooleanField(term127879, term127879.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127879, term127879.getClass(), "encodedSourceStart", 0);
        setIntField(term127879, term127879.getClass(), "encodedSourceEnd", 0);
        setField(term127879, term127879.getClass(), "sourceName", null);
        setIntField(term127879, term127879.getClass(), "baseLineno", 0);
        setIntField(term127879, term127879.getClass(), "endLineno", 0);
        setField(term127879, term127879.getClass(), "functions", null);
        setField(term127879, term127879.getClass(), "regexps", null);
        setField(term127879, term127879.getClass(), "itsVariables", null);
        setField(term127879, term127879.getClass(), "itsConst", null);
        setField(term127879, term127879.getClass(), "itsVariableNames", null);
        setIntField(term127879, term127879.getClass(), "varStart", 0);
        setField(term127879, term127879.getClass(), "compilerData", null);
        setIntField(term127879, term127879.getClass(), "type", 0);
        setField(term127879, term127879.getClass(), "next", null);
        setField(term127880, term127880.getClass(), "functionName", null);
        setBooleanField(term127880, term127880.getClass(), "itsNeedsActivation", false);
        setIntField(term127880, term127880.getClass(), "itsFunctionType", 0);
        setBooleanField(term127880, term127880.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127880, term127880.getClass(), "encodedSourceStart", 0);
        setIntField(term127880, term127880.getClass(), "encodedSourceEnd", 0);
        setField(term127880, term127880.getClass(), "sourceName", null);
        setIntField(term127880, term127880.getClass(), "baseLineno", 0);
        setIntField(term127880, term127880.getClass(), "endLineno", 0);
        setField(term127880, term127880.getClass(), "functions", null);
        setField(term127880, term127880.getClass(), "regexps", null);
        setField(term127880, term127880.getClass(), "itsVariables", null);
        setField(term127880, term127880.getClass(), "itsConst", null);
        setField(term127880, term127880.getClass(), "itsVariableNames", null);
        setIntField(term127880, term127880.getClass(), "varStart", 0);
        setField(term127880, term127880.getClass(), "compilerData", null);
        setIntField(term127880, term127880.getClass(), "type", 0);
        setField(term127880, term127880.getClass(), "next", null);
        setField(term127880, term127880.getClass(), "first", null);
        setField(term127880, term127880.getClass(), "last", null);
        setField(term127880, term127880.getClass(), "propListHead", null);
        setIntField(term127880, term127880.getClass(), "sourcePosition", 0);
        setField(term127880, term127880.getClass(), "jsType", null);
        setField(term127880, term127880.getClass(), "parent", null);
        setField(term127879, term127879.getClass(), "first", term127880);
        setField(term127879, term127879.getClass(), "last", null);
        setField(term127879, term127879.getClass(), "propListHead", null);
        setIntField(term127879, term127879.getClass(), "sourcePosition", 0);
        setField(term127879, term127879.getClass(), "jsType", null);
        setField(term127879, term127879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127434;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term127348, args);
        assertTrue(recursiveEquals(term127348, term127878));
        assertTrue(recursiveEquals(term127434, term127879));
        assertTrue(recursiveEquals(retValue, null));
    }

};



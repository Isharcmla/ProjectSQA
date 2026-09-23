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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168854;
     Object term168940;
     Object term178770;
     Object term178771;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168854 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term168940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term169032, term169032.getClass(), "type", 42);
        setField(term168940, term168940.getClass(), "first", term169032);
        term178770 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term178770, term178770.getClass(), "propertyTestFunctions", null);
        term178771 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term178772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178771, term178771.getClass(), "functionName", null);
        setBooleanField(term178771, term178771.getClass(), "itsNeedsActivation", false);
        setIntField(term178771, term178771.getClass(), "itsFunctionType", 0);
        setBooleanField(term178771, term178771.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term178771, term178771.getClass(), "encodedSourceStart", 0);
        setIntField(term178771, term178771.getClass(), "encodedSourceEnd", 0);
        setField(term178771, term178771.getClass(), "sourceName", null);
        setIntField(term178771, term178771.getClass(), "baseLineno", 0);
        setIntField(term178771, term178771.getClass(), "endLineno", 0);
        setField(term178771, term178771.getClass(), "functions", null);
        setField(term178771, term178771.getClass(), "regexps", null);
        setField(term178771, term178771.getClass(), "itsVariables", null);
        setField(term178771, term178771.getClass(), "itsConst", null);
        setField(term178771, term178771.getClass(), "itsVariableNames", null);
        setIntField(term178771, term178771.getClass(), "varStart", 0);
        setField(term178771, term178771.getClass(), "compilerData", null);
        setIntField(term178771, term178771.getClass(), "type", 0);
        setField(term178771, term178771.getClass(), "next", null);
        setField(term178772, term178772.getClass(), "str", null);
        setIntField(term178772, term178772.getClass(), "type", 42);
        setField(term178772, term178772.getClass(), "next", null);
        setField(term178772, term178772.getClass(), "first", null);
        setField(term178772, term178772.getClass(), "last", null);
        setField(term178772, term178772.getClass(), "propListHead", null);
        setIntField(term178772, term178772.getClass(), "sourcePosition", 0);
        setField(term178772, term178772.getClass(), "jsType", null);
        setField(term178772, term178772.getClass(), "parent", null);
        setField(term178771, term178771.getClass(), "first", term178772);
        setField(term178771, term178771.getClass(), "last", null);
        setField(term178771, term178771.getClass(), "propListHead", null);
        setIntField(term178771, term178771.getClass(), "sourcePosition", 0);
        setField(term178771, term178771.getClass(), "jsType", null);
        setField(term178771, term178771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168940;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term168854, args);
        assertTrue(recursiveEquals(term168854, term178770));
        assertTrue(recursiveEquals(term168940, term178771));
        assertTrue(recursiveEquals(retValue, null));
    }

};



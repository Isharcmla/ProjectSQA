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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142663;
     Object term142749;
     Object term142871;
     Object term142872;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142663 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term142749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term142841 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term142749, term142749.getClass(), "first", term142841);
        term142871 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term142871, term142871.getClass(), "propertyTestFunctions", null);
        term142872 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term142873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term142872, term142872.getClass(), "functionName", null);
        setBooleanField(term142872, term142872.getClass(), "itsNeedsActivation", false);
        setIntField(term142872, term142872.getClass(), "itsFunctionType", 0);
        setBooleanField(term142872, term142872.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term142872, term142872.getClass(), "encodedSourceStart", 0);
        setIntField(term142872, term142872.getClass(), "encodedSourceEnd", 0);
        setField(term142872, term142872.getClass(), "sourceName", null);
        setIntField(term142872, term142872.getClass(), "baseLineno", 0);
        setIntField(term142872, term142872.getClass(), "endLineno", 0);
        setField(term142872, term142872.getClass(), "functions", null);
        setField(term142872, term142872.getClass(), "regexps", null);
        setField(term142872, term142872.getClass(), "itsVariables", null);
        setField(term142872, term142872.getClass(), "itsConst", null);
        setField(term142872, term142872.getClass(), "itsVariableNames", null);
        setIntField(term142872, term142872.getClass(), "varStart", 0);
        setField(term142872, term142872.getClass(), "compilerData", null);
        setIntField(term142872, term142872.getClass(), "type", 0);
        setField(term142872, term142872.getClass(), "next", null);
        setDoubleField(term142873, term142873.getClass(), "number", 0.0);
        setIntField(term142873, term142873.getClass(), "type", 0);
        setField(term142873, term142873.getClass(), "next", null);
        setField(term142873, term142873.getClass(), "first", null);
        setField(term142873, term142873.getClass(), "last", null);
        setField(term142873, term142873.getClass(), "propListHead", null);
        setIntField(term142873, term142873.getClass(), "sourcePosition", 0);
        setField(term142873, term142873.getClass(), "jsType", null);
        setField(term142873, term142873.getClass(), "parent", null);
        setField(term142872, term142872.getClass(), "first", term142873);
        setField(term142872, term142872.getClass(), "last", null);
        setField(term142872, term142872.getClass(), "propListHead", null);
        setIntField(term142872, term142872.getClass(), "sourcePosition", 0);
        setField(term142872, term142872.getClass(), "jsType", null);
        setField(term142872, term142872.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term142749;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term142663, args);
        assertTrue(recursiveEquals(term142663, term142871));
        assertTrue(recursiveEquals(term142749, term142872));
        assertTrue(recursiveEquals(retValue, null));
    }

};



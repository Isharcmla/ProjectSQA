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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158393;
     Object term158479;
     Object term158893;
     Object term158894;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158393 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term158479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158479, term158479.getClass(), "first", term158571);
        term158893 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term158893, term158893.getClass(), "propertyTestFunctions", null);
        term158894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term158895 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158894, term158894.getClass(), "functionName", null);
        setBooleanField(term158894, term158894.getClass(), "itsNeedsActivation", false);
        setIntField(term158894, term158894.getClass(), "itsFunctionType", 0);
        setBooleanField(term158894, term158894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term158894, term158894.getClass(), "encodedSourceStart", 0);
        setIntField(term158894, term158894.getClass(), "encodedSourceEnd", 0);
        setField(term158894, term158894.getClass(), "sourceName", null);
        setIntField(term158894, term158894.getClass(), "baseLineno", 0);
        setIntField(term158894, term158894.getClass(), "endLineno", 0);
        setField(term158894, term158894.getClass(), "functions", null);
        setField(term158894, term158894.getClass(), "regexps", null);
        setField(term158894, term158894.getClass(), "itsVariables", null);
        setField(term158894, term158894.getClass(), "itsConst", null);
        setField(term158894, term158894.getClass(), "itsVariableNames", null);
        setIntField(term158894, term158894.getClass(), "varStart", 0);
        setField(term158894, term158894.getClass(), "compilerData", null);
        setIntField(term158894, term158894.getClass(), "type", 0);
        setField(term158894, term158894.getClass(), "next", null);
        setField(term158895, term158895.getClass(), "str", null);
        setIntField(term158895, term158895.getClass(), "type", 0);
        setField(term158895, term158895.getClass(), "next", null);
        setField(term158895, term158895.getClass(), "first", null);
        setField(term158895, term158895.getClass(), "last", null);
        setField(term158895, term158895.getClass(), "propListHead", null);
        setIntField(term158895, term158895.getClass(), "sourcePosition", 0);
        setField(term158895, term158895.getClass(), "jsType", null);
        setField(term158895, term158895.getClass(), "parent", null);
        setField(term158894, term158894.getClass(), "first", term158895);
        setField(term158894, term158894.getClass(), "last", null);
        setField(term158894, term158894.getClass(), "propListHead", null);
        setIntField(term158894, term158894.getClass(), "sourcePosition", 0);
        setField(term158894, term158894.getClass(), "jsType", null);
        setField(term158894, term158894.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term158479;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term158393, args);
        assertTrue(recursiveEquals(term158393, term158893));
        assertTrue(recursiveEquals(term158479, term158894));
        assertTrue(recursiveEquals(retValue, null));
    }

};



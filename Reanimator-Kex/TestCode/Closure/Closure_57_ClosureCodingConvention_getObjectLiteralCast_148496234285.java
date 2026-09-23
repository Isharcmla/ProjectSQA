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

public class ClosureCodingConvention_getObjectLiteralCast_148496234285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121458;
     Object term121544;
     Object term121666;
     Object term121667;

    public ClosureCodingConvention_getObjectLiteralCast_148496234285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121458 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term121544 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term121636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term121544, term121544.getClass(), "type", 37);
        setField(term121544, term121544.getClass(), "first", term121636);
        term121666 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term121666, term121666.getClass(), "propertyTestFunctions", null);
        term121667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term121668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term121667, term121667.getClass(), "functionName", null);
        setBooleanField(term121667, term121667.getClass(), "itsNeedsActivation", false);
        setIntField(term121667, term121667.getClass(), "itsFunctionType", 0);
        setBooleanField(term121667, term121667.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term121667, term121667.getClass(), "encodedSourceStart", 0);
        setIntField(term121667, term121667.getClass(), "encodedSourceEnd", 0);
        setField(term121667, term121667.getClass(), "sourceName", null);
        setIntField(term121667, term121667.getClass(), "baseLineno", 0);
        setIntField(term121667, term121667.getClass(), "endLineno", 0);
        setField(term121667, term121667.getClass(), "functions", null);
        setField(term121667, term121667.getClass(), "regexps", null);
        setField(term121667, term121667.getClass(), "itsVariables", null);
        setField(term121667, term121667.getClass(), "itsConst", null);
        setField(term121667, term121667.getClass(), "itsVariableNames", null);
        setIntField(term121667, term121667.getClass(), "varStart", 0);
        setField(term121667, term121667.getClass(), "compilerData", null);
        setIntField(term121667, term121667.getClass(), "type", 37);
        setField(term121667, term121667.getClass(), "next", null);
        setField(term121668, term121668.getClass(), "str", null);
        setIntField(term121668, term121668.getClass(), "type", 0);
        setField(term121668, term121668.getClass(), "next", null);
        setField(term121668, term121668.getClass(), "first", null);
        setField(term121668, term121668.getClass(), "last", null);
        setField(term121668, term121668.getClass(), "propListHead", null);
        setIntField(term121668, term121668.getClass(), "sourcePosition", 0);
        setField(term121668, term121668.getClass(), "jsType", null);
        setField(term121668, term121668.getClass(), "parent", null);
        setField(term121667, term121667.getClass(), "first", term121668);
        setField(term121667, term121667.getClass(), "last", null);
        setField(term121667, term121667.getClass(), "propListHead", null);
        setIntField(term121667, term121667.getClass(), "sourcePosition", 0);
        setField(term121667, term121667.getClass(), "jsType", null);
        setField(term121667, term121667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term121544;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term121458, args);
        assertTrue(recursiveEquals(term121458, term121666));
        assertTrue(recursiveEquals(term121544, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



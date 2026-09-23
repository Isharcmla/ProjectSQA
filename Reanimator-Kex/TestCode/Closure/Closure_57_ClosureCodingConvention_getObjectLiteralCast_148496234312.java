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

public class ClosureCodingConvention_getObjectLiteralCast_148496234312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125921;
     Object term126007;
     Object term126454;
     Object term126455;

    public ClosureCodingConvention_getObjectLiteralCast_148496234312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125921 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term126007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term126093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term126007, term126007.getClass(), "type", 37);
        setField(term126007, term126007.getClass(), "first", term126093);
        term126454 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term126454, term126454.getClass(), "propertyTestFunctions", null);
        term126455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term126456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term126455, term126455.getClass(), "functionName", null);
        setBooleanField(term126455, term126455.getClass(), "itsNeedsActivation", false);
        setIntField(term126455, term126455.getClass(), "itsFunctionType", 0);
        setBooleanField(term126455, term126455.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term126455, term126455.getClass(), "encodedSourceStart", 0);
        setIntField(term126455, term126455.getClass(), "encodedSourceEnd", 0);
        setField(term126455, term126455.getClass(), "sourceName", null);
        setIntField(term126455, term126455.getClass(), "baseLineno", 0);
        setIntField(term126455, term126455.getClass(), "endLineno", 0);
        setField(term126455, term126455.getClass(), "functions", null);
        setField(term126455, term126455.getClass(), "regexps", null);
        setField(term126455, term126455.getClass(), "itsVariables", null);
        setField(term126455, term126455.getClass(), "itsConst", null);
        setField(term126455, term126455.getClass(), "itsVariableNames", null);
        setIntField(term126455, term126455.getClass(), "varStart", 0);
        setField(term126455, term126455.getClass(), "compilerData", null);
        setIntField(term126455, term126455.getClass(), "type", 37);
        setField(term126455, term126455.getClass(), "next", null);
        setField(term126456, term126456.getClass(), "functionName", null);
        setBooleanField(term126456, term126456.getClass(), "itsNeedsActivation", false);
        setIntField(term126456, term126456.getClass(), "itsFunctionType", 0);
        setBooleanField(term126456, term126456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term126456, term126456.getClass(), "encodedSourceStart", 0);
        setIntField(term126456, term126456.getClass(), "encodedSourceEnd", 0);
        setField(term126456, term126456.getClass(), "sourceName", null);
        setIntField(term126456, term126456.getClass(), "baseLineno", 0);
        setIntField(term126456, term126456.getClass(), "endLineno", 0);
        setField(term126456, term126456.getClass(), "functions", null);
        setField(term126456, term126456.getClass(), "regexps", null);
        setField(term126456, term126456.getClass(), "itsVariables", null);
        setField(term126456, term126456.getClass(), "itsConst", null);
        setField(term126456, term126456.getClass(), "itsVariableNames", null);
        setIntField(term126456, term126456.getClass(), "varStart", 0);
        setField(term126456, term126456.getClass(), "compilerData", null);
        setIntField(term126456, term126456.getClass(), "type", 0);
        setField(term126456, term126456.getClass(), "next", null);
        setField(term126456, term126456.getClass(), "first", null);
        setField(term126456, term126456.getClass(), "last", null);
        setField(term126456, term126456.getClass(), "propListHead", null);
        setIntField(term126456, term126456.getClass(), "sourcePosition", 0);
        setField(term126456, term126456.getClass(), "jsType", null);
        setField(term126456, term126456.getClass(), "parent", null);
        setField(term126455, term126455.getClass(), "first", term126456);
        setField(term126455, term126455.getClass(), "last", null);
        setField(term126455, term126455.getClass(), "propListHead", null);
        setIntField(term126455, term126455.getClass(), "sourcePosition", 0);
        setField(term126455, term126455.getClass(), "jsType", null);
        setField(term126455, term126455.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term126007;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term125921, args);
        assertTrue(recursiveEquals(term125921, term126454));
        assertTrue(recursiveEquals(term126007, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



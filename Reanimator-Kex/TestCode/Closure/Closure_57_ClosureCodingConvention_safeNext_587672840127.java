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

public class ClosureCodingConvention_safeNext_587672840127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62205;
     Object term62291;
     Object term62326;
     Object term62327;

    public ClosureCodingConvention_safeNext_587672840127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62205 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term62291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62326 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term62326, term62326.getClass(), "propertyTestFunctions", null);
        term62327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62327, term62327.getClass(), "functionName", null);
        setBooleanField(term62327, term62327.getClass(), "itsNeedsActivation", false);
        setIntField(term62327, term62327.getClass(), "itsFunctionType", 0);
        setBooleanField(term62327, term62327.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62327, term62327.getClass(), "encodedSourceStart", 0);
        setIntField(term62327, term62327.getClass(), "encodedSourceEnd", 0);
        setField(term62327, term62327.getClass(), "sourceName", null);
        setIntField(term62327, term62327.getClass(), "baseLineno", 0);
        setIntField(term62327, term62327.getClass(), "endLineno", 0);
        setField(term62327, term62327.getClass(), "functions", null);
        setField(term62327, term62327.getClass(), "regexps", null);
        setField(term62327, term62327.getClass(), "itsVariables", null);
        setField(term62327, term62327.getClass(), "itsConst", null);
        setField(term62327, term62327.getClass(), "itsVariableNames", null);
        setIntField(term62327, term62327.getClass(), "varStart", 0);
        setField(term62327, term62327.getClass(), "compilerData", null);
        setIntField(term62327, term62327.getClass(), "type", 0);
        setField(term62327, term62327.getClass(), "next", null);
        setField(term62327, term62327.getClass(), "first", null);
        setField(term62327, term62327.getClass(), "last", null);
        setField(term62327, term62327.getClass(), "propListHead", null);
        setIntField(term62327, term62327.getClass(), "sourcePosition", 0);
        setField(term62327, term62327.getClass(), "jsType", null);
        setField(term62327, term62327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62291;
        Object retValue = callMethod(klass, "safeNext", argTypes, term62205, args);
        assertTrue(recursiveEquals(term62205, term62326));
        assertTrue(recursiveEquals(term62291, term62327));
        assertTrue(recursiveEquals(retValue, null));
    }

};



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

public class ClosureCodingConvention_getObjectLiteralCast_148496234205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94752;
     Object term94838;
     Object term94984;
     Object term94985;

    public ClosureCodingConvention_getObjectLiteralCast_148496234205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94752 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term94838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94924 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94838, term94838.getClass(), "type", 37);
        setIntField(term94924, term94924.getClass(), "type", 42);
        setField(term94838, term94838.getClass(), "first", term94924);
        term94984 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term94984, term94984.getClass(), "propertyTestFunctions", null);
        term94985 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94986 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94985, term94985.getClass(), "functionName", null);
        setBooleanField(term94985, term94985.getClass(), "itsNeedsActivation", false);
        setIntField(term94985, term94985.getClass(), "itsFunctionType", 0);
        setBooleanField(term94985, term94985.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94985, term94985.getClass(), "encodedSourceStart", 0);
        setIntField(term94985, term94985.getClass(), "encodedSourceEnd", 0);
        setField(term94985, term94985.getClass(), "sourceName", null);
        setIntField(term94985, term94985.getClass(), "baseLineno", 0);
        setIntField(term94985, term94985.getClass(), "endLineno", 0);
        setField(term94985, term94985.getClass(), "functions", null);
        setField(term94985, term94985.getClass(), "regexps", null);
        setField(term94985, term94985.getClass(), "itsVariables", null);
        setField(term94985, term94985.getClass(), "itsConst", null);
        setField(term94985, term94985.getClass(), "itsVariableNames", null);
        setIntField(term94985, term94985.getClass(), "varStart", 0);
        setField(term94985, term94985.getClass(), "compilerData", null);
        setIntField(term94985, term94985.getClass(), "type", 37);
        setField(term94985, term94985.getClass(), "next", null);
        setField(term94986, term94986.getClass(), "functionName", null);
        setBooleanField(term94986, term94986.getClass(), "itsNeedsActivation", false);
        setIntField(term94986, term94986.getClass(), "itsFunctionType", 0);
        setBooleanField(term94986, term94986.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94986, term94986.getClass(), "encodedSourceStart", 0);
        setIntField(term94986, term94986.getClass(), "encodedSourceEnd", 0);
        setField(term94986, term94986.getClass(), "sourceName", null);
        setIntField(term94986, term94986.getClass(), "baseLineno", 0);
        setIntField(term94986, term94986.getClass(), "endLineno", 0);
        setField(term94986, term94986.getClass(), "functions", null);
        setField(term94986, term94986.getClass(), "regexps", null);
        setField(term94986, term94986.getClass(), "itsVariables", null);
        setField(term94986, term94986.getClass(), "itsConst", null);
        setField(term94986, term94986.getClass(), "itsVariableNames", null);
        setIntField(term94986, term94986.getClass(), "varStart", 0);
        setField(term94986, term94986.getClass(), "compilerData", null);
        setIntField(term94986, term94986.getClass(), "type", 42);
        setField(term94986, term94986.getClass(), "next", null);
        setField(term94986, term94986.getClass(), "first", null);
        setField(term94986, term94986.getClass(), "last", null);
        setField(term94986, term94986.getClass(), "propListHead", null);
        setIntField(term94986, term94986.getClass(), "sourcePosition", 0);
        setField(term94986, term94986.getClass(), "jsType", null);
        setField(term94986, term94986.getClass(), "parent", null);
        setField(term94985, term94985.getClass(), "first", term94986);
        setField(term94985, term94985.getClass(), "last", null);
        setField(term94985, term94985.getClass(), "propListHead", null);
        setIntField(term94985, term94985.getClass(), "sourcePosition", 0);
        setField(term94985, term94985.getClass(), "jsType", null);
        setField(term94985, term94985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term94838;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term94752, args);
        assertTrue(recursiveEquals(term94752, term94984));
        assertTrue(recursiveEquals(term94838, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};



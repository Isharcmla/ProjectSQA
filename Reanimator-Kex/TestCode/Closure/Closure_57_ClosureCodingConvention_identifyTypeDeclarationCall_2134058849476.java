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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155914;
     Object term156000;
     Object term156421;
     Object term156422;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155914 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term156000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term156092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156000, term156000.getClass(), "first", term156092);
        term156421 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term156421, term156421.getClass(), "propertyTestFunctions", null);
        term156422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term156423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156422, term156422.getClass(), "functionName", null);
        setBooleanField(term156422, term156422.getClass(), "itsNeedsActivation", false);
        setIntField(term156422, term156422.getClass(), "itsFunctionType", 0);
        setBooleanField(term156422, term156422.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term156422, term156422.getClass(), "encodedSourceStart", 0);
        setIntField(term156422, term156422.getClass(), "encodedSourceEnd", 0);
        setField(term156422, term156422.getClass(), "sourceName", null);
        setIntField(term156422, term156422.getClass(), "baseLineno", 0);
        setIntField(term156422, term156422.getClass(), "endLineno", 0);
        setField(term156422, term156422.getClass(), "functions", null);
        setField(term156422, term156422.getClass(), "regexps", null);
        setField(term156422, term156422.getClass(), "itsVariables", null);
        setField(term156422, term156422.getClass(), "itsConst", null);
        setField(term156422, term156422.getClass(), "itsVariableNames", null);
        setIntField(term156422, term156422.getClass(), "varStart", 0);
        setField(term156422, term156422.getClass(), "compilerData", null);
        setIntField(term156422, term156422.getClass(), "type", 0);
        setField(term156422, term156422.getClass(), "next", null);
        setField(term156423, term156423.getClass(), "str", null);
        setIntField(term156423, term156423.getClass(), "type", 0);
        setField(term156423, term156423.getClass(), "next", null);
        setField(term156423, term156423.getClass(), "first", null);
        setField(term156423, term156423.getClass(), "last", null);
        setField(term156423, term156423.getClass(), "propListHead", null);
        setIntField(term156423, term156423.getClass(), "sourcePosition", 0);
        setField(term156423, term156423.getClass(), "jsType", null);
        setField(term156423, term156423.getClass(), "parent", null);
        setField(term156422, term156422.getClass(), "first", term156423);
        setField(term156422, term156422.getClass(), "last", null);
        setField(term156422, term156422.getClass(), "propListHead", null);
        setIntField(term156422, term156422.getClass(), "sourcePosition", 0);
        setField(term156422, term156422.getClass(), "jsType", null);
        setField(term156422, term156422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156000;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term155914, args);
        assertTrue(recursiveEquals(term155914, term156421));
        assertTrue(recursiveEquals(term156000, term156422));
        assertTrue(recursiveEquals(retValue, null));
    }

};



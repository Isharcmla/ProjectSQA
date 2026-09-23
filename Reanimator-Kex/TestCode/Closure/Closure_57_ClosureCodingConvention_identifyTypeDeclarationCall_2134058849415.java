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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145740;
     Object term145826;
     Object term145947;
     Object term145948;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145740 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term145826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term145826, term145826.getClass(), "first", term145918);
        term145947 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term145947, term145947.getClass(), "propertyTestFunctions", null);
        term145948 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term145948, term145948.getClass(), "functionName", null);
        setBooleanField(term145948, term145948.getClass(), "itsNeedsActivation", false);
        setIntField(term145948, term145948.getClass(), "itsFunctionType", 0);
        setBooleanField(term145948, term145948.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145948, term145948.getClass(), "encodedSourceStart", 0);
        setIntField(term145948, term145948.getClass(), "encodedSourceEnd", 0);
        setField(term145948, term145948.getClass(), "sourceName", null);
        setIntField(term145948, term145948.getClass(), "baseLineno", 0);
        setIntField(term145948, term145948.getClass(), "endLineno", 0);
        setField(term145948, term145948.getClass(), "functions", null);
        setField(term145948, term145948.getClass(), "regexps", null);
        setField(term145948, term145948.getClass(), "itsVariables", null);
        setField(term145948, term145948.getClass(), "itsConst", null);
        setField(term145948, term145948.getClass(), "itsVariableNames", null);
        setIntField(term145948, term145948.getClass(), "varStart", 0);
        setField(term145948, term145948.getClass(), "compilerData", null);
        setIntField(term145948, term145948.getClass(), "type", 0);
        setField(term145948, term145948.getClass(), "next", null);
        setDoubleField(term145949, term145949.getClass(), "number", 0.0);
        setIntField(term145949, term145949.getClass(), "type", 0);
        setField(term145949, term145949.getClass(), "next", null);
        setField(term145949, term145949.getClass(), "first", null);
        setField(term145949, term145949.getClass(), "last", null);
        setField(term145949, term145949.getClass(), "propListHead", null);
        setIntField(term145949, term145949.getClass(), "sourcePosition", 0);
        setField(term145949, term145949.getClass(), "jsType", null);
        setField(term145949, term145949.getClass(), "parent", null);
        setField(term145948, term145948.getClass(), "first", term145949);
        setField(term145948, term145948.getClass(), "last", null);
        setField(term145948, term145948.getClass(), "propListHead", null);
        setIntField(term145948, term145948.getClass(), "sourcePosition", 0);
        setField(term145948, term145948.getClass(), "jsType", null);
        setField(term145948, term145948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term145826;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term145740, args);
        assertTrue(recursiveEquals(term145740, term145947));
        assertTrue(recursiveEquals(term145826, term145948));
        assertTrue(recursiveEquals(retValue, null));
    }

};



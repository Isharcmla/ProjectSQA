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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450661;
     Object term450753;
     Object term451023;
     Object term451024;
     Object term450946;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450661 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term450753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term450845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term450931 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term450845, term450845.getClass(), "next", term450931);
        setIntField(term450845, term450845.getClass(), "type", 0);
        setField(term450753, term450753.getClass(), "first", term450845);
        setIntField(term450753, term450753.getClass(), "type", 100);
        setField(term450753, term450753.getClass(), "parent", null);
        term451023 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term451023, term451023.getClass(), "currentTraversal", null);
        term451024 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term451025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term451026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term451024, term451024.getClass(), "str", null);
        setIntField(term451024, term451024.getClass(), "type", 100);
        setField(term451024, term451024.getClass(), "next", null);
        setField(term451025, term451025.getClass(), "str", null);
        setIntField(term451025, term451025.getClass(), "type", 0);
        setField(term451026, term451026.getClass(), "functionName", null);
        setBooleanField(term451026, term451026.getClass(), "itsNeedsActivation", false);
        setIntField(term451026, term451026.getClass(), "itsFunctionType", 0);
        setBooleanField(term451026, term451026.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term451026, term451026.getClass(), "encodedSourceStart", 0);
        setIntField(term451026, term451026.getClass(), "encodedSourceEnd", 0);
        setField(term451026, term451026.getClass(), "sourceName", null);
        setIntField(term451026, term451026.getClass(), "baseLineno", 0);
        setIntField(term451026, term451026.getClass(), "endLineno", 0);
        setField(term451026, term451026.getClass(), "functions", null);
        setField(term451026, term451026.getClass(), "regexps", null);
        setField(term451026, term451026.getClass(), "itsVariables", null);
        setField(term451026, term451026.getClass(), "itsConst", null);
        setField(term451026, term451026.getClass(), "itsVariableNames", null);
        setIntField(term451026, term451026.getClass(), "varStart", 0);
        setField(term451026, term451026.getClass(), "compilerData", null);
        setIntField(term451026, term451026.getClass(), "type", 0);
        setField(term451026, term451026.getClass(), "next", null);
        setField(term451026, term451026.getClass(), "first", null);
        setField(term451026, term451026.getClass(), "last", null);
        setField(term451026, term451026.getClass(), "propListHead", null);
        setIntField(term451026, term451026.getClass(), "sourcePosition", 0);
        setField(term451026, term451026.getClass(), "jsType", null);
        setField(term451026, term451026.getClass(), "parent", null);
        setField(term451025, term451025.getClass(), "next", term451026);
        setField(term451025, term451025.getClass(), "first", null);
        setField(term451025, term451025.getClass(), "last", null);
        setField(term451025, term451025.getClass(), "propListHead", null);
        setIntField(term451025, term451025.getClass(), "sourcePosition", 0);
        setField(term451025, term451025.getClass(), "jsType", null);
        setField(term451025, term451025.getClass(), "parent", null);
        setField(term451024, term451024.getClass(), "first", term451025);
        setField(term451024, term451024.getClass(), "last", null);
        setField(term451024, term451024.getClass(), "propListHead", null);
        setIntField(term451024, term451024.getClass(), "sourcePosition", 0);
        setField(term451024, term451024.getClass(), "jsType", null);
        setField(term451024, term451024.getClass(), "parent", null);
        term450946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term450948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term450950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term450946, term450946.getClass(), "str", null);
        setIntField(term450946, term450946.getClass(), "type", 100);
        setField(term450946, term450946.getClass(), "next", null);
        setField(term450948, term450948.getClass(), "str", null);
        setIntField(term450948, term450948.getClass(), "type", 0);
        setField(term450950, term450950.getClass(), "functionName", null);
        setBooleanField(term450950, term450950.getClass(), "itsNeedsActivation", false);
        setIntField(term450950, term450950.getClass(), "itsFunctionType", 0);
        setBooleanField(term450950, term450950.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term450950, term450950.getClass(), "encodedSourceStart", 0);
        setIntField(term450950, term450950.getClass(), "encodedSourceEnd", 0);
        setField(term450950, term450950.getClass(), "sourceName", null);
        setIntField(term450950, term450950.getClass(), "baseLineno", 0);
        setIntField(term450950, term450950.getClass(), "endLineno", 0);
        setField(term450950, term450950.getClass(), "functions", null);
        setField(term450950, term450950.getClass(), "regexps", null);
        setField(term450950, term450950.getClass(), "itsVariables", null);
        setField(term450950, term450950.getClass(), "itsConst", null);
        setField(term450950, term450950.getClass(), "itsVariableNames", null);
        setIntField(term450950, term450950.getClass(), "varStart", 0);
        setField(term450950, term450950.getClass(), "compilerData", null);
        setIntField(term450950, term450950.getClass(), "type", 0);
        setField(term450950, term450950.getClass(), "next", null);
        setField(term450950, term450950.getClass(), "first", null);
        setField(term450950, term450950.getClass(), "last", null);
        setField(term450950, term450950.getClass(), "propListHead", null);
        setIntField(term450950, term450950.getClass(), "sourcePosition", 0);
        setField(term450950, term450950.getClass(), "jsType", null);
        setField(term450950, term450950.getClass(), "parent", null);
        setField(term450948, term450948.getClass(), "next", term450950);
        setField(term450948, term450948.getClass(), "first", null);
        setField(term450948, term450948.getClass(), "last", null);
        setField(term450948, term450948.getClass(), "propListHead", null);
        setIntField(term450948, term450948.getClass(), "sourcePosition", 0);
        setField(term450948, term450948.getClass(), "jsType", null);
        setField(term450948, term450948.getClass(), "parent", null);
        setField(term450946, term450946.getClass(), "first", term450948);
        setField(term450946, term450946.getClass(), "last", null);
        setField(term450946, term450946.getClass(), "propListHead", null);
        setIntField(term450946, term450946.getClass(), "sourcePosition", 0);
        setField(term450946, term450946.getClass(), "jsType", null);
        setField(term450946, term450946.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term450753;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term450661, args);
        assertTrue(recursiveEquals(term450661, term451023));
        assertTrue(recursiveEquals(term450753, term451024));
        assertTrue(recursiveEquals(retValue, term450946));
    }

};



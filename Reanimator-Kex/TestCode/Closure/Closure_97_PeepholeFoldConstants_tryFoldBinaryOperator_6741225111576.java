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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574968;
     Object term575060;
     Object term575414;
     Object term575415;
     Object term575325;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574968 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term575060 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term575150 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term575236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term575150, term575150.getClass(), "next", term575236);
        setIntField(term575150, term575150.getClass(), "type", 0);
        setField(term575060, term575060.getClass(), "first", term575150);
        setIntField(term575060, term575060.getClass(), "type", 100);
        setField(term575060, term575060.getClass(), "parent", null);
        term575414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term575414, term575414.getClass(), "currentTraversal", null);
        term575415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term575416 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term575417 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term575415, term575415.getClass(), "number", 0.0);
        setIntField(term575415, term575415.getClass(), "type", 100);
        setField(term575415, term575415.getClass(), "next", null);
        setIntField(term575416, term575416.getClass(), "encodedSourceStart", 0);
        setIntField(term575416, term575416.getClass(), "encodedSourceEnd", 0);
        setField(term575416, term575416.getClass(), "sourceName", null);
        setIntField(term575416, term575416.getClass(), "baseLineno", 0);
        setIntField(term575416, term575416.getClass(), "endLineno", 0);
        setField(term575416, term575416.getClass(), "functions", null);
        setField(term575416, term575416.getClass(), "regexps", null);
        setField(term575416, term575416.getClass(), "itsVariables", null);
        setField(term575416, term575416.getClass(), "itsConst", null);
        setField(term575416, term575416.getClass(), "itsVariableNames", null);
        setIntField(term575416, term575416.getClass(), "varStart", 0);
        setField(term575416, term575416.getClass(), "compilerData", null);
        setIntField(term575416, term575416.getClass(), "type", 0);
        setField(term575417, term575417.getClass(), "functionName", null);
        setBooleanField(term575417, term575417.getClass(), "itsNeedsActivation", false);
        setIntField(term575417, term575417.getClass(), "itsFunctionType", 0);
        setBooleanField(term575417, term575417.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term575417, term575417.getClass(), "encodedSourceStart", 0);
        setIntField(term575417, term575417.getClass(), "encodedSourceEnd", 0);
        setField(term575417, term575417.getClass(), "sourceName", null);
        setIntField(term575417, term575417.getClass(), "baseLineno", 0);
        setIntField(term575417, term575417.getClass(), "endLineno", 0);
        setField(term575417, term575417.getClass(), "functions", null);
        setField(term575417, term575417.getClass(), "regexps", null);
        setField(term575417, term575417.getClass(), "itsVariables", null);
        setField(term575417, term575417.getClass(), "itsConst", null);
        setField(term575417, term575417.getClass(), "itsVariableNames", null);
        setIntField(term575417, term575417.getClass(), "varStart", 0);
        setField(term575417, term575417.getClass(), "compilerData", null);
        setIntField(term575417, term575417.getClass(), "type", 0);
        setField(term575417, term575417.getClass(), "next", null);
        setField(term575417, term575417.getClass(), "first", null);
        setField(term575417, term575417.getClass(), "last", null);
        setField(term575417, term575417.getClass(), "propListHead", null);
        setIntField(term575417, term575417.getClass(), "sourcePosition", 0);
        setField(term575417, term575417.getClass(), "jsType", null);
        setField(term575417, term575417.getClass(), "parent", null);
        setField(term575416, term575416.getClass(), "next", term575417);
        setField(term575416, term575416.getClass(), "first", null);
        setField(term575416, term575416.getClass(), "last", null);
        setField(term575416, term575416.getClass(), "propListHead", null);
        setIntField(term575416, term575416.getClass(), "sourcePosition", 0);
        setField(term575416, term575416.getClass(), "jsType", null);
        setField(term575416, term575416.getClass(), "parent", null);
        setField(term575415, term575415.getClass(), "first", term575416);
        setField(term575415, term575415.getClass(), "last", null);
        setField(term575415, term575415.getClass(), "propListHead", null);
        setIntField(term575415, term575415.getClass(), "sourcePosition", 0);
        setField(term575415, term575415.getClass(), "jsType", null);
        setField(term575415, term575415.getClass(), "parent", null);
        term575325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term575328 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term575335 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term575325, term575325.getClass(), "number", 0.0);
        setIntField(term575325, term575325.getClass(), "type", 100);
        setField(term575325, term575325.getClass(), "next", null);
        setIntField(term575328, term575328.getClass(), "encodedSourceStart", 0);
        setIntField(term575328, term575328.getClass(), "encodedSourceEnd", 0);
        setField(term575328, term575328.getClass(), "sourceName", null);
        setIntField(term575328, term575328.getClass(), "baseLineno", 0);
        setIntField(term575328, term575328.getClass(), "endLineno", 0);
        setField(term575328, term575328.getClass(), "functions", null);
        setField(term575328, term575328.getClass(), "regexps", null);
        setField(term575328, term575328.getClass(), "itsVariables", null);
        setField(term575328, term575328.getClass(), "itsConst", null);
        setField(term575328, term575328.getClass(), "itsVariableNames", null);
        setIntField(term575328, term575328.getClass(), "varStart", 0);
        setField(term575328, term575328.getClass(), "compilerData", null);
        setIntField(term575328, term575328.getClass(), "type", 0);
        setField(term575335, term575335.getClass(), "functionName", null);
        setBooleanField(term575335, term575335.getClass(), "itsNeedsActivation", false);
        setIntField(term575335, term575335.getClass(), "itsFunctionType", 0);
        setBooleanField(term575335, term575335.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term575335, term575335.getClass(), "encodedSourceStart", 0);
        setIntField(term575335, term575335.getClass(), "encodedSourceEnd", 0);
        setField(term575335, term575335.getClass(), "sourceName", null);
        setIntField(term575335, term575335.getClass(), "baseLineno", 0);
        setIntField(term575335, term575335.getClass(), "endLineno", 0);
        setField(term575335, term575335.getClass(), "functions", null);
        setField(term575335, term575335.getClass(), "regexps", null);
        setField(term575335, term575335.getClass(), "itsVariables", null);
        setField(term575335, term575335.getClass(), "itsConst", null);
        setField(term575335, term575335.getClass(), "itsVariableNames", null);
        setIntField(term575335, term575335.getClass(), "varStart", 0);
        setField(term575335, term575335.getClass(), "compilerData", null);
        setIntField(term575335, term575335.getClass(), "type", 0);
        setField(term575335, term575335.getClass(), "next", null);
        setField(term575335, term575335.getClass(), "first", null);
        setField(term575335, term575335.getClass(), "last", null);
        setField(term575335, term575335.getClass(), "propListHead", null);
        setIntField(term575335, term575335.getClass(), "sourcePosition", 0);
        setField(term575335, term575335.getClass(), "jsType", null);
        setField(term575335, term575335.getClass(), "parent", null);
        setField(term575328, term575328.getClass(), "next", term575335);
        setField(term575328, term575328.getClass(), "first", null);
        setField(term575328, term575328.getClass(), "last", null);
        setField(term575328, term575328.getClass(), "propListHead", null);
        setIntField(term575328, term575328.getClass(), "sourcePosition", 0);
        setField(term575328, term575328.getClass(), "jsType", null);
        setField(term575328, term575328.getClass(), "parent", null);
        setField(term575325, term575325.getClass(), "first", term575328);
        setField(term575325, term575325.getClass(), "last", null);
        setField(term575325, term575325.getClass(), "propListHead", null);
        setIntField(term575325, term575325.getClass(), "sourcePosition", 0);
        setField(term575325, term575325.getClass(), "jsType", null);
        setField(term575325, term575325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term575060;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term574968, args);
        assertTrue(recursiveEquals(term574968, term575414));
        assertTrue(recursiveEquals(term575060, term575415));
        assertTrue(recursiveEquals(retValue, term575325));
    }

};



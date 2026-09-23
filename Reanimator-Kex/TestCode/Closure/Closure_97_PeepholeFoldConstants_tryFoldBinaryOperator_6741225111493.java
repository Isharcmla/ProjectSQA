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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553332;
     Object term553418;
     Object term554057;
     Object term554058;
     Object term553972;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553332 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term553418 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553504 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553504, term553504.getClass(), "next", term553574);
        setField(term553418, term553418.getClass(), "first", term553504);
        setIntField(term553418, term553418.getClass(), "type", 100);
        term554057 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term554057, term554057.getClass(), "currentTraversal", null);
        term554058 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term554060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term554058, term554058.getClass(), "functionName", null);
        setBooleanField(term554058, term554058.getClass(), "itsNeedsActivation", false);
        setIntField(term554058, term554058.getClass(), "itsFunctionType", 0);
        setBooleanField(term554058, term554058.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term554058, term554058.getClass(), "encodedSourceStart", 0);
        setIntField(term554058, term554058.getClass(), "encodedSourceEnd", 0);
        setField(term554058, term554058.getClass(), "sourceName", null);
        setIntField(term554058, term554058.getClass(), "baseLineno", 0);
        setIntField(term554058, term554058.getClass(), "endLineno", 0);
        setField(term554058, term554058.getClass(), "functions", null);
        setField(term554058, term554058.getClass(), "regexps", null);
        setField(term554058, term554058.getClass(), "itsVariables", null);
        setField(term554058, term554058.getClass(), "itsConst", null);
        setField(term554058, term554058.getClass(), "itsVariableNames", null);
        setIntField(term554058, term554058.getClass(), "varStart", 0);
        setField(term554058, term554058.getClass(), "compilerData", null);
        setIntField(term554058, term554058.getClass(), "type", 100);
        setField(term554058, term554058.getClass(), "next", null);
        setField(term554059, term554059.getClass(), "functionName", null);
        setBooleanField(term554059, term554059.getClass(), "itsNeedsActivation", false);
        setIntField(term554059, term554059.getClass(), "itsFunctionType", 0);
        setBooleanField(term554059, term554059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term554059, term554059.getClass(), "encodedSourceStart", 0);
        setIntField(term554059, term554059.getClass(), "encodedSourceEnd", 0);
        setField(term554059, term554059.getClass(), "sourceName", null);
        setIntField(term554059, term554059.getClass(), "baseLineno", 0);
        setIntField(term554059, term554059.getClass(), "endLineno", 0);
        setField(term554059, term554059.getClass(), "functions", null);
        setField(term554059, term554059.getClass(), "regexps", null);
        setField(term554059, term554059.getClass(), "itsVariables", null);
        setField(term554059, term554059.getClass(), "itsConst", null);
        setField(term554059, term554059.getClass(), "itsVariableNames", null);
        setIntField(term554059, term554059.getClass(), "varStart", 0);
        setField(term554059, term554059.getClass(), "compilerData", null);
        setIntField(term554059, term554059.getClass(), "type", 0);
        setIntField(term554060, term554060.getClass(), "type", 0);
        setField(term554060, term554060.getClass(), "next", null);
        setField(term554060, term554060.getClass(), "first", null);
        setField(term554060, term554060.getClass(), "last", null);
        setField(term554060, term554060.getClass(), "propListHead", null);
        setIntField(term554060, term554060.getClass(), "sourcePosition", 0);
        setField(term554060, term554060.getClass(), "jsType", null);
        setField(term554060, term554060.getClass(), "parent", null);
        setField(term554059, term554059.getClass(), "next", term554060);
        setField(term554059, term554059.getClass(), "first", null);
        setField(term554059, term554059.getClass(), "last", null);
        setField(term554059, term554059.getClass(), "propListHead", null);
        setIntField(term554059, term554059.getClass(), "sourcePosition", 0);
        setField(term554059, term554059.getClass(), "jsType", null);
        setField(term554059, term554059.getClass(), "parent", null);
        setField(term554058, term554058.getClass(), "first", term554059);
        setField(term554058, term554058.getClass(), "last", null);
        setField(term554058, term554058.getClass(), "propListHead", null);
        setIntField(term554058, term554058.getClass(), "sourcePosition", 0);
        setField(term554058, term554058.getClass(), "jsType", null);
        setField(term554058, term554058.getClass(), "parent", null);
        term553972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553972, term553972.getClass(), "functionName", null);
        setBooleanField(term553972, term553972.getClass(), "itsNeedsActivation", false);
        setIntField(term553972, term553972.getClass(), "itsFunctionType", 0);
        setBooleanField(term553972, term553972.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553972, term553972.getClass(), "encodedSourceStart", 0);
        setIntField(term553972, term553972.getClass(), "encodedSourceEnd", 0);
        setField(term553972, term553972.getClass(), "sourceName", null);
        setIntField(term553972, term553972.getClass(), "baseLineno", 0);
        setIntField(term553972, term553972.getClass(), "endLineno", 0);
        setField(term553972, term553972.getClass(), "functions", null);
        setField(term553972, term553972.getClass(), "regexps", null);
        setField(term553972, term553972.getClass(), "itsVariables", null);
        setField(term553972, term553972.getClass(), "itsConst", null);
        setField(term553972, term553972.getClass(), "itsVariableNames", null);
        setIntField(term553972, term553972.getClass(), "varStart", 0);
        setField(term553972, term553972.getClass(), "compilerData", null);
        setIntField(term553972, term553972.getClass(), "type", 100);
        setField(term553972, term553972.getClass(), "next", null);
        setField(term553982, term553982.getClass(), "functionName", null);
        setBooleanField(term553982, term553982.getClass(), "itsNeedsActivation", false);
        setIntField(term553982, term553982.getClass(), "itsFunctionType", 0);
        setBooleanField(term553982, term553982.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553982, term553982.getClass(), "encodedSourceStart", 0);
        setIntField(term553982, term553982.getClass(), "encodedSourceEnd", 0);
        setField(term553982, term553982.getClass(), "sourceName", null);
        setIntField(term553982, term553982.getClass(), "baseLineno", 0);
        setIntField(term553982, term553982.getClass(), "endLineno", 0);
        setField(term553982, term553982.getClass(), "functions", null);
        setField(term553982, term553982.getClass(), "regexps", null);
        setField(term553982, term553982.getClass(), "itsVariables", null);
        setField(term553982, term553982.getClass(), "itsConst", null);
        setField(term553982, term553982.getClass(), "itsVariableNames", null);
        setIntField(term553982, term553982.getClass(), "varStart", 0);
        setField(term553982, term553982.getClass(), "compilerData", null);
        setIntField(term553982, term553982.getClass(), "type", 0);
        setIntField(term553992, term553992.getClass(), "type", 0);
        setField(term553992, term553992.getClass(), "next", null);
        setField(term553992, term553992.getClass(), "first", null);
        setField(term553992, term553992.getClass(), "last", null);
        setField(term553992, term553992.getClass(), "propListHead", null);
        setIntField(term553992, term553992.getClass(), "sourcePosition", 0);
        setField(term553992, term553992.getClass(), "jsType", null);
        setField(term553992, term553992.getClass(), "parent", null);
        setField(term553982, term553982.getClass(), "next", term553992);
        setField(term553982, term553982.getClass(), "first", null);
        setField(term553982, term553982.getClass(), "last", null);
        setField(term553982, term553982.getClass(), "propListHead", null);
        setIntField(term553982, term553982.getClass(), "sourcePosition", 0);
        setField(term553982, term553982.getClass(), "jsType", null);
        setField(term553982, term553982.getClass(), "parent", null);
        setField(term553972, term553972.getClass(), "first", term553982);
        setField(term553972, term553972.getClass(), "last", null);
        setField(term553972, term553972.getClass(), "propListHead", null);
        setIntField(term553972, term553972.getClass(), "sourcePosition", 0);
        setField(term553972, term553972.getClass(), "jsType", null);
        setField(term553972, term553972.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term553418;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term553332, args);
        assertTrue(recursiveEquals(term553332, term554057));
        assertTrue(recursiveEquals(term553418, term554058));
        assertTrue(recursiveEquals(retValue, term553972));
    }

};



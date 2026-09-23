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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437579;
     Object term437665;
     Object term438331;
     Object term438332;
     Object term438246;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437579 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term437665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term437751, term437751.getClass(), "next", term437821);
        setField(term437665, term437665.getClass(), "first", term437751);
        setIntField(term437665, term437665.getClass(), "type", 100);
        term438331 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term438331, term438331.getClass(), "currentTraversal", null);
        term438332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438333 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term438332, term438332.getClass(), "functionName", null);
        setBooleanField(term438332, term438332.getClass(), "itsNeedsActivation", false);
        setIntField(term438332, term438332.getClass(), "itsFunctionType", 0);
        setBooleanField(term438332, term438332.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438332, term438332.getClass(), "encodedSourceStart", 0);
        setIntField(term438332, term438332.getClass(), "encodedSourceEnd", 0);
        setField(term438332, term438332.getClass(), "sourceName", null);
        setIntField(term438332, term438332.getClass(), "baseLineno", 0);
        setIntField(term438332, term438332.getClass(), "endLineno", 0);
        setField(term438332, term438332.getClass(), "functions", null);
        setField(term438332, term438332.getClass(), "regexps", null);
        setField(term438332, term438332.getClass(), "itsVariables", null);
        setField(term438332, term438332.getClass(), "itsConst", null);
        setField(term438332, term438332.getClass(), "itsVariableNames", null);
        setIntField(term438332, term438332.getClass(), "varStart", 0);
        setField(term438332, term438332.getClass(), "compilerData", null);
        setIntField(term438332, term438332.getClass(), "type", 100);
        setField(term438332, term438332.getClass(), "next", null);
        setField(term438333, term438333.getClass(), "functionName", null);
        setBooleanField(term438333, term438333.getClass(), "itsNeedsActivation", false);
        setIntField(term438333, term438333.getClass(), "itsFunctionType", 0);
        setBooleanField(term438333, term438333.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438333, term438333.getClass(), "encodedSourceStart", 0);
        setIntField(term438333, term438333.getClass(), "encodedSourceEnd", 0);
        setField(term438333, term438333.getClass(), "sourceName", null);
        setIntField(term438333, term438333.getClass(), "baseLineno", 0);
        setIntField(term438333, term438333.getClass(), "endLineno", 0);
        setField(term438333, term438333.getClass(), "functions", null);
        setField(term438333, term438333.getClass(), "regexps", null);
        setField(term438333, term438333.getClass(), "itsVariables", null);
        setField(term438333, term438333.getClass(), "itsConst", null);
        setField(term438333, term438333.getClass(), "itsVariableNames", null);
        setIntField(term438333, term438333.getClass(), "varStart", 0);
        setField(term438333, term438333.getClass(), "compilerData", null);
        setIntField(term438333, term438333.getClass(), "type", 0);
        setIntField(term438334, term438334.getClass(), "type", 0);
        setField(term438334, term438334.getClass(), "next", null);
        setField(term438334, term438334.getClass(), "first", null);
        setField(term438334, term438334.getClass(), "last", null);
        setField(term438334, term438334.getClass(), "propListHead", null);
        setIntField(term438334, term438334.getClass(), "sourcePosition", 0);
        setField(term438334, term438334.getClass(), "jsType", null);
        setField(term438334, term438334.getClass(), "parent", null);
        setField(term438333, term438333.getClass(), "next", term438334);
        setField(term438333, term438333.getClass(), "first", null);
        setField(term438333, term438333.getClass(), "last", null);
        setField(term438333, term438333.getClass(), "propListHead", null);
        setIntField(term438333, term438333.getClass(), "sourcePosition", 0);
        setField(term438333, term438333.getClass(), "jsType", null);
        setField(term438333, term438333.getClass(), "parent", null);
        setField(term438332, term438332.getClass(), "first", term438333);
        setField(term438332, term438332.getClass(), "last", null);
        setField(term438332, term438332.getClass(), "propListHead", null);
        setIntField(term438332, term438332.getClass(), "sourcePosition", 0);
        setField(term438332, term438332.getClass(), "jsType", null);
        setField(term438332, term438332.getClass(), "parent", null);
        term438246 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term438246, term438246.getClass(), "functionName", null);
        setBooleanField(term438246, term438246.getClass(), "itsNeedsActivation", false);
        setIntField(term438246, term438246.getClass(), "itsFunctionType", 0);
        setBooleanField(term438246, term438246.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438246, term438246.getClass(), "encodedSourceStart", 0);
        setIntField(term438246, term438246.getClass(), "encodedSourceEnd", 0);
        setField(term438246, term438246.getClass(), "sourceName", null);
        setIntField(term438246, term438246.getClass(), "baseLineno", 0);
        setIntField(term438246, term438246.getClass(), "endLineno", 0);
        setField(term438246, term438246.getClass(), "functions", null);
        setField(term438246, term438246.getClass(), "regexps", null);
        setField(term438246, term438246.getClass(), "itsVariables", null);
        setField(term438246, term438246.getClass(), "itsConst", null);
        setField(term438246, term438246.getClass(), "itsVariableNames", null);
        setIntField(term438246, term438246.getClass(), "varStart", 0);
        setField(term438246, term438246.getClass(), "compilerData", null);
        setIntField(term438246, term438246.getClass(), "type", 100);
        setField(term438246, term438246.getClass(), "next", null);
        setField(term438256, term438256.getClass(), "functionName", null);
        setBooleanField(term438256, term438256.getClass(), "itsNeedsActivation", false);
        setIntField(term438256, term438256.getClass(), "itsFunctionType", 0);
        setBooleanField(term438256, term438256.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438256, term438256.getClass(), "encodedSourceStart", 0);
        setIntField(term438256, term438256.getClass(), "encodedSourceEnd", 0);
        setField(term438256, term438256.getClass(), "sourceName", null);
        setIntField(term438256, term438256.getClass(), "baseLineno", 0);
        setIntField(term438256, term438256.getClass(), "endLineno", 0);
        setField(term438256, term438256.getClass(), "functions", null);
        setField(term438256, term438256.getClass(), "regexps", null);
        setField(term438256, term438256.getClass(), "itsVariables", null);
        setField(term438256, term438256.getClass(), "itsConst", null);
        setField(term438256, term438256.getClass(), "itsVariableNames", null);
        setIntField(term438256, term438256.getClass(), "varStart", 0);
        setField(term438256, term438256.getClass(), "compilerData", null);
        setIntField(term438256, term438256.getClass(), "type", 0);
        setIntField(term438266, term438266.getClass(), "type", 0);
        setField(term438266, term438266.getClass(), "next", null);
        setField(term438266, term438266.getClass(), "first", null);
        setField(term438266, term438266.getClass(), "last", null);
        setField(term438266, term438266.getClass(), "propListHead", null);
        setIntField(term438266, term438266.getClass(), "sourcePosition", 0);
        setField(term438266, term438266.getClass(), "jsType", null);
        setField(term438266, term438266.getClass(), "parent", null);
        setField(term438256, term438256.getClass(), "next", term438266);
        setField(term438256, term438256.getClass(), "first", null);
        setField(term438256, term438256.getClass(), "last", null);
        setField(term438256, term438256.getClass(), "propListHead", null);
        setIntField(term438256, term438256.getClass(), "sourcePosition", 0);
        setField(term438256, term438256.getClass(), "jsType", null);
        setField(term438256, term438256.getClass(), "parent", null);
        setField(term438246, term438246.getClass(), "first", term438256);
        setField(term438246, term438246.getClass(), "last", null);
        setField(term438246, term438246.getClass(), "propListHead", null);
        setIntField(term438246, term438246.getClass(), "sourcePosition", 0);
        setField(term438246, term438246.getClass(), "jsType", null);
        setField(term438246, term438246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term437665;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term437579, args);
        assertTrue(recursiveEquals(term437579, term438331));
        assertTrue(recursiveEquals(term437665, term438332));
        assertTrue(recursiveEquals(retValue, term438246));
    }

};



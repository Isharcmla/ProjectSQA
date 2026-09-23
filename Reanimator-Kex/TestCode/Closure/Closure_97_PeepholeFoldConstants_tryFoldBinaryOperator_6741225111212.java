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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369320;
     Object term369406;
     Object term369673;
     Object term369674;
     Object term369577;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369320 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term369406 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369492, term369492.getClass(), "next", term369562);
        setField(term369406, term369406.getClass(), "first", term369492);
        setIntField(term369406, term369406.getClass(), "type", 21);
        term369673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term369673, term369673.getClass(), "currentTraversal", null);
        term369674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369675 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369674, term369674.getClass(), "functionName", null);
        setBooleanField(term369674, term369674.getClass(), "itsNeedsActivation", false);
        setIntField(term369674, term369674.getClass(), "itsFunctionType", 0);
        setBooleanField(term369674, term369674.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369674, term369674.getClass(), "encodedSourceStart", 0);
        setIntField(term369674, term369674.getClass(), "encodedSourceEnd", 0);
        setField(term369674, term369674.getClass(), "sourceName", null);
        setIntField(term369674, term369674.getClass(), "baseLineno", 0);
        setIntField(term369674, term369674.getClass(), "endLineno", 0);
        setField(term369674, term369674.getClass(), "functions", null);
        setField(term369674, term369674.getClass(), "regexps", null);
        setField(term369674, term369674.getClass(), "itsVariables", null);
        setField(term369674, term369674.getClass(), "itsConst", null);
        setField(term369674, term369674.getClass(), "itsVariableNames", null);
        setIntField(term369674, term369674.getClass(), "varStart", 0);
        setField(term369674, term369674.getClass(), "compilerData", null);
        setIntField(term369674, term369674.getClass(), "type", 21);
        setField(term369674, term369674.getClass(), "next", null);
        setField(term369675, term369675.getClass(), "functionName", null);
        setBooleanField(term369675, term369675.getClass(), "itsNeedsActivation", false);
        setIntField(term369675, term369675.getClass(), "itsFunctionType", 0);
        setBooleanField(term369675, term369675.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369675, term369675.getClass(), "encodedSourceStart", 0);
        setIntField(term369675, term369675.getClass(), "encodedSourceEnd", 0);
        setField(term369675, term369675.getClass(), "sourceName", null);
        setIntField(term369675, term369675.getClass(), "baseLineno", 0);
        setIntField(term369675, term369675.getClass(), "endLineno", 0);
        setField(term369675, term369675.getClass(), "functions", null);
        setField(term369675, term369675.getClass(), "regexps", null);
        setField(term369675, term369675.getClass(), "itsVariables", null);
        setField(term369675, term369675.getClass(), "itsConst", null);
        setField(term369675, term369675.getClass(), "itsVariableNames", null);
        setIntField(term369675, term369675.getClass(), "varStart", 0);
        setField(term369675, term369675.getClass(), "compilerData", null);
        setIntField(term369675, term369675.getClass(), "type", 0);
        setIntField(term369676, term369676.getClass(), "type", 0);
        setField(term369676, term369676.getClass(), "next", null);
        setField(term369676, term369676.getClass(), "first", null);
        setField(term369676, term369676.getClass(), "last", null);
        setField(term369676, term369676.getClass(), "propListHead", null);
        setIntField(term369676, term369676.getClass(), "sourcePosition", 0);
        setField(term369676, term369676.getClass(), "jsType", null);
        setField(term369676, term369676.getClass(), "parent", null);
        setField(term369675, term369675.getClass(), "next", term369676);
        setField(term369675, term369675.getClass(), "first", null);
        setField(term369675, term369675.getClass(), "last", null);
        setField(term369675, term369675.getClass(), "propListHead", null);
        setIntField(term369675, term369675.getClass(), "sourcePosition", 0);
        setField(term369675, term369675.getClass(), "jsType", null);
        setField(term369675, term369675.getClass(), "parent", null);
        setField(term369674, term369674.getClass(), "first", term369675);
        setField(term369674, term369674.getClass(), "last", null);
        setField(term369674, term369674.getClass(), "propListHead", null);
        setIntField(term369674, term369674.getClass(), "sourcePosition", 0);
        setField(term369674, term369674.getClass(), "jsType", null);
        setField(term369674, term369674.getClass(), "parent", null);
        term369577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369587 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369577, term369577.getClass(), "functionName", null);
        setBooleanField(term369577, term369577.getClass(), "itsNeedsActivation", false);
        setIntField(term369577, term369577.getClass(), "itsFunctionType", 0);
        setBooleanField(term369577, term369577.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369577, term369577.getClass(), "encodedSourceStart", 0);
        setIntField(term369577, term369577.getClass(), "encodedSourceEnd", 0);
        setField(term369577, term369577.getClass(), "sourceName", null);
        setIntField(term369577, term369577.getClass(), "baseLineno", 0);
        setIntField(term369577, term369577.getClass(), "endLineno", 0);
        setField(term369577, term369577.getClass(), "functions", null);
        setField(term369577, term369577.getClass(), "regexps", null);
        setField(term369577, term369577.getClass(), "itsVariables", null);
        setField(term369577, term369577.getClass(), "itsConst", null);
        setField(term369577, term369577.getClass(), "itsVariableNames", null);
        setIntField(term369577, term369577.getClass(), "varStart", 0);
        setField(term369577, term369577.getClass(), "compilerData", null);
        setIntField(term369577, term369577.getClass(), "type", 21);
        setField(term369577, term369577.getClass(), "next", null);
        setField(term369587, term369587.getClass(), "functionName", null);
        setBooleanField(term369587, term369587.getClass(), "itsNeedsActivation", false);
        setIntField(term369587, term369587.getClass(), "itsFunctionType", 0);
        setBooleanField(term369587, term369587.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369587, term369587.getClass(), "encodedSourceStart", 0);
        setIntField(term369587, term369587.getClass(), "encodedSourceEnd", 0);
        setField(term369587, term369587.getClass(), "sourceName", null);
        setIntField(term369587, term369587.getClass(), "baseLineno", 0);
        setIntField(term369587, term369587.getClass(), "endLineno", 0);
        setField(term369587, term369587.getClass(), "functions", null);
        setField(term369587, term369587.getClass(), "regexps", null);
        setField(term369587, term369587.getClass(), "itsVariables", null);
        setField(term369587, term369587.getClass(), "itsConst", null);
        setField(term369587, term369587.getClass(), "itsVariableNames", null);
        setIntField(term369587, term369587.getClass(), "varStart", 0);
        setField(term369587, term369587.getClass(), "compilerData", null);
        setIntField(term369587, term369587.getClass(), "type", 0);
        setIntField(term369597, term369597.getClass(), "type", 0);
        setField(term369597, term369597.getClass(), "next", null);
        setField(term369597, term369597.getClass(), "first", null);
        setField(term369597, term369597.getClass(), "last", null);
        setField(term369597, term369597.getClass(), "propListHead", null);
        setIntField(term369597, term369597.getClass(), "sourcePosition", 0);
        setField(term369597, term369597.getClass(), "jsType", null);
        setField(term369597, term369597.getClass(), "parent", null);
        setField(term369587, term369587.getClass(), "next", term369597);
        setField(term369587, term369587.getClass(), "first", null);
        setField(term369587, term369587.getClass(), "last", null);
        setField(term369587, term369587.getClass(), "propListHead", null);
        setIntField(term369587, term369587.getClass(), "sourcePosition", 0);
        setField(term369587, term369587.getClass(), "jsType", null);
        setField(term369587, term369587.getClass(), "parent", null);
        setField(term369577, term369577.getClass(), "first", term369587);
        setField(term369577, term369577.getClass(), "last", null);
        setField(term369577, term369577.getClass(), "propListHead", null);
        setIntField(term369577, term369577.getClass(), "sourcePosition", 0);
        setField(term369577, term369577.getClass(), "jsType", null);
        setField(term369577, term369577.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term369406;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term369320, args);
        assertTrue(recursiveEquals(term369320, term369673));
        assertTrue(recursiveEquals(term369406, term369674));
        assertTrue(recursiveEquals(retValue, term369577));
    }

};



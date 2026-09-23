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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207612;
     Object term207698;
     Object term208738;
     Object term208739;
     Object term208674;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207612 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term207698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term207876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term207784, term207784.getClass(), "next", term207876);
        setIntField(term207784, term207784.getClass(), "type", 39);
        setField(term207698, term207698.getClass(), "first", term207784);
        setIntField(term207698, term207698.getClass(), "type", 18);
        term208738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term208738, term208738.getClass(), "currentTraversal", null);
        term208739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term208739, term208739.getClass(), "functionName", null);
        setBooleanField(term208739, term208739.getClass(), "itsNeedsActivation", false);
        setIntField(term208739, term208739.getClass(), "itsFunctionType", 0);
        setBooleanField(term208739, term208739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208739, term208739.getClass(), "encodedSourceStart", 0);
        setIntField(term208739, term208739.getClass(), "encodedSourceEnd", 0);
        setField(term208739, term208739.getClass(), "sourceName", null);
        setIntField(term208739, term208739.getClass(), "baseLineno", 0);
        setIntField(term208739, term208739.getClass(), "endLineno", 0);
        setField(term208739, term208739.getClass(), "functions", null);
        setField(term208739, term208739.getClass(), "regexps", null);
        setField(term208739, term208739.getClass(), "itsVariables", null);
        setField(term208739, term208739.getClass(), "itsConst", null);
        setField(term208739, term208739.getClass(), "itsVariableNames", null);
        setIntField(term208739, term208739.getClass(), "varStart", 0);
        setField(term208739, term208739.getClass(), "compilerData", null);
        setIntField(term208739, term208739.getClass(), "type", 18);
        setField(term208739, term208739.getClass(), "next", null);
        setField(term208740, term208740.getClass(), "functionName", null);
        setBooleanField(term208740, term208740.getClass(), "itsNeedsActivation", false);
        setIntField(term208740, term208740.getClass(), "itsFunctionType", 0);
        setBooleanField(term208740, term208740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208740, term208740.getClass(), "encodedSourceStart", 0);
        setIntField(term208740, term208740.getClass(), "encodedSourceEnd", 0);
        setField(term208740, term208740.getClass(), "sourceName", null);
        setIntField(term208740, term208740.getClass(), "baseLineno", 0);
        setIntField(term208740, term208740.getClass(), "endLineno", 0);
        setField(term208740, term208740.getClass(), "functions", null);
        setField(term208740, term208740.getClass(), "regexps", null);
        setField(term208740, term208740.getClass(), "itsVariables", null);
        setField(term208740, term208740.getClass(), "itsConst", null);
        setField(term208740, term208740.getClass(), "itsVariableNames", null);
        setIntField(term208740, term208740.getClass(), "varStart", 0);
        setField(term208740, term208740.getClass(), "compilerData", null);
        setIntField(term208740, term208740.getClass(), "type", 39);
        setDoubleField(term208741, term208741.getClass(), "number", 0.0);
        setIntField(term208741, term208741.getClass(), "type", 0);
        setField(term208741, term208741.getClass(), "next", null);
        setField(term208741, term208741.getClass(), "first", null);
        setField(term208741, term208741.getClass(), "last", null);
        setField(term208741, term208741.getClass(), "propListHead", null);
        setIntField(term208741, term208741.getClass(), "sourcePosition", 0);
        setField(term208741, term208741.getClass(), "jsType", null);
        setField(term208741, term208741.getClass(), "parent", null);
        setField(term208740, term208740.getClass(), "next", term208741);
        setField(term208740, term208740.getClass(), "first", null);
        setField(term208740, term208740.getClass(), "last", null);
        setField(term208740, term208740.getClass(), "propListHead", null);
        setIntField(term208740, term208740.getClass(), "sourcePosition", 0);
        setField(term208740, term208740.getClass(), "jsType", null);
        setField(term208740, term208740.getClass(), "parent", null);
        setField(term208739, term208739.getClass(), "first", term208740);
        setField(term208739, term208739.getClass(), "last", null);
        setField(term208739, term208739.getClass(), "propListHead", null);
        setIntField(term208739, term208739.getClass(), "sourcePosition", 0);
        setField(term208739, term208739.getClass(), "jsType", null);
        setField(term208739, term208739.getClass(), "parent", null);
        term208674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term208674, term208674.getClass(), "functionName", null);
        setBooleanField(term208674, term208674.getClass(), "itsNeedsActivation", false);
        setIntField(term208674, term208674.getClass(), "itsFunctionType", 0);
        setBooleanField(term208674, term208674.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208674, term208674.getClass(), "encodedSourceStart", 0);
        setIntField(term208674, term208674.getClass(), "encodedSourceEnd", 0);
        setField(term208674, term208674.getClass(), "sourceName", null);
        setIntField(term208674, term208674.getClass(), "baseLineno", 0);
        setIntField(term208674, term208674.getClass(), "endLineno", 0);
        setField(term208674, term208674.getClass(), "functions", null);
        setField(term208674, term208674.getClass(), "regexps", null);
        setField(term208674, term208674.getClass(), "itsVariables", null);
        setField(term208674, term208674.getClass(), "itsConst", null);
        setField(term208674, term208674.getClass(), "itsVariableNames", null);
        setIntField(term208674, term208674.getClass(), "varStart", 0);
        setField(term208674, term208674.getClass(), "compilerData", null);
        setIntField(term208674, term208674.getClass(), "type", 18);
        setField(term208674, term208674.getClass(), "next", null);
        setField(term208684, term208684.getClass(), "functionName", null);
        setBooleanField(term208684, term208684.getClass(), "itsNeedsActivation", false);
        setIntField(term208684, term208684.getClass(), "itsFunctionType", 0);
        setBooleanField(term208684, term208684.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208684, term208684.getClass(), "encodedSourceStart", 0);
        setIntField(term208684, term208684.getClass(), "encodedSourceEnd", 0);
        setField(term208684, term208684.getClass(), "sourceName", null);
        setIntField(term208684, term208684.getClass(), "baseLineno", 0);
        setIntField(term208684, term208684.getClass(), "endLineno", 0);
        setField(term208684, term208684.getClass(), "functions", null);
        setField(term208684, term208684.getClass(), "regexps", null);
        setField(term208684, term208684.getClass(), "itsVariables", null);
        setField(term208684, term208684.getClass(), "itsConst", null);
        setField(term208684, term208684.getClass(), "itsVariableNames", null);
        setIntField(term208684, term208684.getClass(), "varStart", 0);
        setField(term208684, term208684.getClass(), "compilerData", null);
        setIntField(term208684, term208684.getClass(), "type", 39);
        setDoubleField(term208694, term208694.getClass(), "number", 0.0);
        setIntField(term208694, term208694.getClass(), "type", 0);
        setField(term208694, term208694.getClass(), "next", null);
        setField(term208694, term208694.getClass(), "first", null);
        setField(term208694, term208694.getClass(), "last", null);
        setField(term208694, term208694.getClass(), "propListHead", null);
        setIntField(term208694, term208694.getClass(), "sourcePosition", 0);
        setField(term208694, term208694.getClass(), "jsType", null);
        setField(term208694, term208694.getClass(), "parent", null);
        setField(term208684, term208684.getClass(), "next", term208694);
        setField(term208684, term208684.getClass(), "first", null);
        setField(term208684, term208684.getClass(), "last", null);
        setField(term208684, term208684.getClass(), "propListHead", null);
        setIntField(term208684, term208684.getClass(), "sourcePosition", 0);
        setField(term208684, term208684.getClass(), "jsType", null);
        setField(term208684, term208684.getClass(), "parent", null);
        setField(term208674, term208674.getClass(), "first", term208684);
        setField(term208674, term208674.getClass(), "last", null);
        setField(term208674, term208674.getClass(), "propListHead", null);
        setIntField(term208674, term208674.getClass(), "sourcePosition", 0);
        setField(term208674, term208674.getClass(), "jsType", null);
        setField(term208674, term208674.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term207698;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term207612, args);
        assertTrue(recursiveEquals(term207612, term208738));
        assertTrue(recursiveEquals(term207698, term208739));
        assertTrue(recursiveEquals(retValue, term208674));
    }

};



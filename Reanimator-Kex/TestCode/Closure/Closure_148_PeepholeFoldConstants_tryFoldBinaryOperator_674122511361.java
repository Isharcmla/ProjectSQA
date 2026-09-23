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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72427;
     Object term72513;
     Object term73193;
     Object term73194;
     Object term73108;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72427 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term72513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72599 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term72669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72599, term72599.getClass(), "next", term72669);
        setField(term72513, term72513.getClass(), "first", term72599);
        setIntField(term72513, term72513.getClass(), "type", 101);
        term73193 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term73193, term73193.getClass(), "currentTraversal", null);
        term73194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73194, term73194.getClass(), "functionName", null);
        setBooleanField(term73194, term73194.getClass(), "itsNeedsActivation", false);
        setIntField(term73194, term73194.getClass(), "itsFunctionType", 0);
        setBooleanField(term73194, term73194.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73194, term73194.getClass(), "encodedSourceStart", 0);
        setIntField(term73194, term73194.getClass(), "encodedSourceEnd", 0);
        setField(term73194, term73194.getClass(), "sourceName", null);
        setIntField(term73194, term73194.getClass(), "baseLineno", 0);
        setIntField(term73194, term73194.getClass(), "endLineno", 0);
        setField(term73194, term73194.getClass(), "functions", null);
        setField(term73194, term73194.getClass(), "regexps", null);
        setField(term73194, term73194.getClass(), "itsVariables", null);
        setField(term73194, term73194.getClass(), "itsConst", null);
        setField(term73194, term73194.getClass(), "itsVariableNames", null);
        setIntField(term73194, term73194.getClass(), "varStart", 0);
        setField(term73194, term73194.getClass(), "compilerData", null);
        setIntField(term73194, term73194.getClass(), "type", 101);
        setField(term73194, term73194.getClass(), "next", null);
        setField(term73195, term73195.getClass(), "functionName", null);
        setBooleanField(term73195, term73195.getClass(), "itsNeedsActivation", false);
        setIntField(term73195, term73195.getClass(), "itsFunctionType", 0);
        setBooleanField(term73195, term73195.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73195, term73195.getClass(), "encodedSourceStart", 0);
        setIntField(term73195, term73195.getClass(), "encodedSourceEnd", 0);
        setField(term73195, term73195.getClass(), "sourceName", null);
        setIntField(term73195, term73195.getClass(), "baseLineno", 0);
        setIntField(term73195, term73195.getClass(), "endLineno", 0);
        setField(term73195, term73195.getClass(), "functions", null);
        setField(term73195, term73195.getClass(), "regexps", null);
        setField(term73195, term73195.getClass(), "itsVariables", null);
        setField(term73195, term73195.getClass(), "itsConst", null);
        setField(term73195, term73195.getClass(), "itsVariableNames", null);
        setIntField(term73195, term73195.getClass(), "varStart", 0);
        setField(term73195, term73195.getClass(), "compilerData", null);
        setIntField(term73195, term73195.getClass(), "type", 0);
        setIntField(term73196, term73196.getClass(), "type", 0);
        setField(term73196, term73196.getClass(), "next", null);
        setField(term73196, term73196.getClass(), "first", null);
        setField(term73196, term73196.getClass(), "last", null);
        setField(term73196, term73196.getClass(), "propListHead", null);
        setIntField(term73196, term73196.getClass(), "sourcePosition", 0);
        setField(term73196, term73196.getClass(), "jsType", null);
        setField(term73196, term73196.getClass(), "parent", null);
        setField(term73195, term73195.getClass(), "next", term73196);
        setField(term73195, term73195.getClass(), "first", null);
        setField(term73195, term73195.getClass(), "last", null);
        setField(term73195, term73195.getClass(), "propListHead", null);
        setIntField(term73195, term73195.getClass(), "sourcePosition", 0);
        setField(term73195, term73195.getClass(), "jsType", null);
        setField(term73195, term73195.getClass(), "parent", null);
        setField(term73194, term73194.getClass(), "first", term73195);
        setField(term73194, term73194.getClass(), "last", null);
        setField(term73194, term73194.getClass(), "propListHead", null);
        setIntField(term73194, term73194.getClass(), "sourcePosition", 0);
        setField(term73194, term73194.getClass(), "jsType", null);
        setField(term73194, term73194.getClass(), "parent", null);
        term73108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73108, term73108.getClass(), "functionName", null);
        setBooleanField(term73108, term73108.getClass(), "itsNeedsActivation", false);
        setIntField(term73108, term73108.getClass(), "itsFunctionType", 0);
        setBooleanField(term73108, term73108.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73108, term73108.getClass(), "encodedSourceStart", 0);
        setIntField(term73108, term73108.getClass(), "encodedSourceEnd", 0);
        setField(term73108, term73108.getClass(), "sourceName", null);
        setIntField(term73108, term73108.getClass(), "baseLineno", 0);
        setIntField(term73108, term73108.getClass(), "endLineno", 0);
        setField(term73108, term73108.getClass(), "functions", null);
        setField(term73108, term73108.getClass(), "regexps", null);
        setField(term73108, term73108.getClass(), "itsVariables", null);
        setField(term73108, term73108.getClass(), "itsConst", null);
        setField(term73108, term73108.getClass(), "itsVariableNames", null);
        setIntField(term73108, term73108.getClass(), "varStart", 0);
        setField(term73108, term73108.getClass(), "compilerData", null);
        setIntField(term73108, term73108.getClass(), "type", 101);
        setField(term73108, term73108.getClass(), "next", null);
        setField(term73118, term73118.getClass(), "functionName", null);
        setBooleanField(term73118, term73118.getClass(), "itsNeedsActivation", false);
        setIntField(term73118, term73118.getClass(), "itsFunctionType", 0);
        setBooleanField(term73118, term73118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73118, term73118.getClass(), "encodedSourceStart", 0);
        setIntField(term73118, term73118.getClass(), "encodedSourceEnd", 0);
        setField(term73118, term73118.getClass(), "sourceName", null);
        setIntField(term73118, term73118.getClass(), "baseLineno", 0);
        setIntField(term73118, term73118.getClass(), "endLineno", 0);
        setField(term73118, term73118.getClass(), "functions", null);
        setField(term73118, term73118.getClass(), "regexps", null);
        setField(term73118, term73118.getClass(), "itsVariables", null);
        setField(term73118, term73118.getClass(), "itsConst", null);
        setField(term73118, term73118.getClass(), "itsVariableNames", null);
        setIntField(term73118, term73118.getClass(), "varStart", 0);
        setField(term73118, term73118.getClass(), "compilerData", null);
        setIntField(term73118, term73118.getClass(), "type", 0);
        setIntField(term73128, term73128.getClass(), "type", 0);
        setField(term73128, term73128.getClass(), "next", null);
        setField(term73128, term73128.getClass(), "first", null);
        setField(term73128, term73128.getClass(), "last", null);
        setField(term73128, term73128.getClass(), "propListHead", null);
        setIntField(term73128, term73128.getClass(), "sourcePosition", 0);
        setField(term73128, term73128.getClass(), "jsType", null);
        setField(term73128, term73128.getClass(), "parent", null);
        setField(term73118, term73118.getClass(), "next", term73128);
        setField(term73118, term73118.getClass(), "first", null);
        setField(term73118, term73118.getClass(), "last", null);
        setField(term73118, term73118.getClass(), "propListHead", null);
        setIntField(term73118, term73118.getClass(), "sourcePosition", 0);
        setField(term73118, term73118.getClass(), "jsType", null);
        setField(term73118, term73118.getClass(), "parent", null);
        setField(term73108, term73108.getClass(), "first", term73118);
        setField(term73108, term73108.getClass(), "last", null);
        setField(term73108, term73108.getClass(), "propListHead", null);
        setIntField(term73108, term73108.getClass(), "sourcePosition", 0);
        setField(term73108, term73108.getClass(), "jsType", null);
        setField(term73108, term73108.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term72513;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term72427, args);
        assertTrue(recursiveEquals(term72427, term73193));
        assertTrue(recursiveEquals(term72513, term73194));
        assertTrue(recursiveEquals(retValue, term73108));
    }

};



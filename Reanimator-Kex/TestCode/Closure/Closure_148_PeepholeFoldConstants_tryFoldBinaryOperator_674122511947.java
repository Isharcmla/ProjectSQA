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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220979;
     Object term221065;
     Object term221739;
     Object term221740;
     Object term221676;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term221065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term221151, term221151.getClass(), "next", term221221);
        setField(term221065, term221065.getClass(), "first", term221151);
        setIntField(term221065, term221065.getClass(), "type", 11);
        term221739 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term221739, term221739.getClass(), "currentTraversal", null);
        term221740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term221740, term221740.getClass(), "functionName", null);
        setBooleanField(term221740, term221740.getClass(), "itsNeedsActivation", false);
        setIntField(term221740, term221740.getClass(), "itsFunctionType", 0);
        setBooleanField(term221740, term221740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term221740, term221740.getClass(), "encodedSourceStart", 0);
        setIntField(term221740, term221740.getClass(), "encodedSourceEnd", 0);
        setField(term221740, term221740.getClass(), "sourceName", null);
        setIntField(term221740, term221740.getClass(), "baseLineno", 0);
        setIntField(term221740, term221740.getClass(), "endLineno", 0);
        setField(term221740, term221740.getClass(), "functions", null);
        setField(term221740, term221740.getClass(), "regexps", null);
        setField(term221740, term221740.getClass(), "itsVariables", null);
        setField(term221740, term221740.getClass(), "itsConst", null);
        setField(term221740, term221740.getClass(), "itsVariableNames", null);
        setIntField(term221740, term221740.getClass(), "varStart", 0);
        setField(term221740, term221740.getClass(), "compilerData", null);
        setIntField(term221740, term221740.getClass(), "type", 11);
        setField(term221740, term221740.getClass(), "next", null);
        setField(term221741, term221741.getClass(), "functionName", null);
        setBooleanField(term221741, term221741.getClass(), "itsNeedsActivation", false);
        setIntField(term221741, term221741.getClass(), "itsFunctionType", 0);
        setBooleanField(term221741, term221741.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term221741, term221741.getClass(), "encodedSourceStart", 0);
        setIntField(term221741, term221741.getClass(), "encodedSourceEnd", 0);
        setField(term221741, term221741.getClass(), "sourceName", null);
        setIntField(term221741, term221741.getClass(), "baseLineno", 0);
        setIntField(term221741, term221741.getClass(), "endLineno", 0);
        setField(term221741, term221741.getClass(), "functions", null);
        setField(term221741, term221741.getClass(), "regexps", null);
        setField(term221741, term221741.getClass(), "itsVariables", null);
        setField(term221741, term221741.getClass(), "itsConst", null);
        setField(term221741, term221741.getClass(), "itsVariableNames", null);
        setIntField(term221741, term221741.getClass(), "varStart", 0);
        setField(term221741, term221741.getClass(), "compilerData", null);
        setIntField(term221741, term221741.getClass(), "type", 0);
        setIntField(term221742, term221742.getClass(), "type", 0);
        setField(term221742, term221742.getClass(), "next", null);
        setField(term221742, term221742.getClass(), "first", null);
        setField(term221742, term221742.getClass(), "last", null);
        setField(term221742, term221742.getClass(), "propListHead", null);
        setIntField(term221742, term221742.getClass(), "sourcePosition", 0);
        setField(term221742, term221742.getClass(), "jsType", null);
        setField(term221742, term221742.getClass(), "parent", null);
        setField(term221741, term221741.getClass(), "next", term221742);
        setField(term221741, term221741.getClass(), "first", null);
        setField(term221741, term221741.getClass(), "last", null);
        setField(term221741, term221741.getClass(), "propListHead", null);
        setIntField(term221741, term221741.getClass(), "sourcePosition", 0);
        setField(term221741, term221741.getClass(), "jsType", null);
        setField(term221741, term221741.getClass(), "parent", null);
        setField(term221740, term221740.getClass(), "first", term221741);
        setField(term221740, term221740.getClass(), "last", null);
        setField(term221740, term221740.getClass(), "propListHead", null);
        setIntField(term221740, term221740.getClass(), "sourcePosition", 0);
        setField(term221740, term221740.getClass(), "jsType", null);
        setField(term221740, term221740.getClass(), "parent", null);
        term221676 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term221696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term221676, term221676.getClass(), "functionName", null);
        setBooleanField(term221676, term221676.getClass(), "itsNeedsActivation", false);
        setIntField(term221676, term221676.getClass(), "itsFunctionType", 0);
        setBooleanField(term221676, term221676.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term221676, term221676.getClass(), "encodedSourceStart", 0);
        setIntField(term221676, term221676.getClass(), "encodedSourceEnd", 0);
        setField(term221676, term221676.getClass(), "sourceName", null);
        setIntField(term221676, term221676.getClass(), "baseLineno", 0);
        setIntField(term221676, term221676.getClass(), "endLineno", 0);
        setField(term221676, term221676.getClass(), "functions", null);
        setField(term221676, term221676.getClass(), "regexps", null);
        setField(term221676, term221676.getClass(), "itsVariables", null);
        setField(term221676, term221676.getClass(), "itsConst", null);
        setField(term221676, term221676.getClass(), "itsVariableNames", null);
        setIntField(term221676, term221676.getClass(), "varStart", 0);
        setField(term221676, term221676.getClass(), "compilerData", null);
        setIntField(term221676, term221676.getClass(), "type", 11);
        setField(term221676, term221676.getClass(), "next", null);
        setField(term221686, term221686.getClass(), "functionName", null);
        setBooleanField(term221686, term221686.getClass(), "itsNeedsActivation", false);
        setIntField(term221686, term221686.getClass(), "itsFunctionType", 0);
        setBooleanField(term221686, term221686.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term221686, term221686.getClass(), "encodedSourceStart", 0);
        setIntField(term221686, term221686.getClass(), "encodedSourceEnd", 0);
        setField(term221686, term221686.getClass(), "sourceName", null);
        setIntField(term221686, term221686.getClass(), "baseLineno", 0);
        setIntField(term221686, term221686.getClass(), "endLineno", 0);
        setField(term221686, term221686.getClass(), "functions", null);
        setField(term221686, term221686.getClass(), "regexps", null);
        setField(term221686, term221686.getClass(), "itsVariables", null);
        setField(term221686, term221686.getClass(), "itsConst", null);
        setField(term221686, term221686.getClass(), "itsVariableNames", null);
        setIntField(term221686, term221686.getClass(), "varStart", 0);
        setField(term221686, term221686.getClass(), "compilerData", null);
        setIntField(term221686, term221686.getClass(), "type", 0);
        setIntField(term221696, term221696.getClass(), "type", 0);
        setField(term221696, term221696.getClass(), "next", null);
        setField(term221696, term221696.getClass(), "first", null);
        setField(term221696, term221696.getClass(), "last", null);
        setField(term221696, term221696.getClass(), "propListHead", null);
        setIntField(term221696, term221696.getClass(), "sourcePosition", 0);
        setField(term221696, term221696.getClass(), "jsType", null);
        setField(term221696, term221696.getClass(), "parent", null);
        setField(term221686, term221686.getClass(), "next", term221696);
        setField(term221686, term221686.getClass(), "first", null);
        setField(term221686, term221686.getClass(), "last", null);
        setField(term221686, term221686.getClass(), "propListHead", null);
        setIntField(term221686, term221686.getClass(), "sourcePosition", 0);
        setField(term221686, term221686.getClass(), "jsType", null);
        setField(term221686, term221686.getClass(), "parent", null);
        setField(term221676, term221676.getClass(), "first", term221686);
        setField(term221676, term221676.getClass(), "last", null);
        setField(term221676, term221676.getClass(), "propListHead", null);
        setIntField(term221676, term221676.getClass(), "sourcePosition", 0);
        setField(term221676, term221676.getClass(), "jsType", null);
        setField(term221676, term221676.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term221065;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term220979, args);
        assertTrue(recursiveEquals(term220979, term221739));
        assertTrue(recursiveEquals(term221065, term221740));
        assertTrue(recursiveEquals(retValue, term221676));
    }

};



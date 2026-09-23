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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146680;
     Object term146766;
     Object term147510;
     Object term147511;
     Object term147451;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146680 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term146766 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term146852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term146922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term146852, term146852.getClass(), "next", term146922);
        setField(term146766, term146766.getClass(), "first", term146852);
        setIntField(term146766, term146766.getClass(), "type", 24);
        term147510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term147510, term147510.getClass(), "currentTraversal", null);
        term147511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term147511, term147511.getClass(), "functionName", null);
        setBooleanField(term147511, term147511.getClass(), "itsNeedsActivation", false);
        setIntField(term147511, term147511.getClass(), "itsFunctionType", 0);
        setBooleanField(term147511, term147511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147511, term147511.getClass(), "encodedSourceStart", 0);
        setIntField(term147511, term147511.getClass(), "encodedSourceEnd", 0);
        setField(term147511, term147511.getClass(), "sourceName", null);
        setIntField(term147511, term147511.getClass(), "baseLineno", 0);
        setIntField(term147511, term147511.getClass(), "endLineno", 0);
        setField(term147511, term147511.getClass(), "functions", null);
        setField(term147511, term147511.getClass(), "regexps", null);
        setField(term147511, term147511.getClass(), "itsVariables", null);
        setField(term147511, term147511.getClass(), "itsConst", null);
        setField(term147511, term147511.getClass(), "itsVariableNames", null);
        setIntField(term147511, term147511.getClass(), "varStart", 0);
        setField(term147511, term147511.getClass(), "compilerData", null);
        setIntField(term147511, term147511.getClass(), "type", 24);
        setField(term147511, term147511.getClass(), "next", null);
        setField(term147512, term147512.getClass(), "functionName", null);
        setBooleanField(term147512, term147512.getClass(), "itsNeedsActivation", false);
        setIntField(term147512, term147512.getClass(), "itsFunctionType", 0);
        setBooleanField(term147512, term147512.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147512, term147512.getClass(), "encodedSourceStart", 0);
        setIntField(term147512, term147512.getClass(), "encodedSourceEnd", 0);
        setField(term147512, term147512.getClass(), "sourceName", null);
        setIntField(term147512, term147512.getClass(), "baseLineno", 0);
        setIntField(term147512, term147512.getClass(), "endLineno", 0);
        setField(term147512, term147512.getClass(), "functions", null);
        setField(term147512, term147512.getClass(), "regexps", null);
        setField(term147512, term147512.getClass(), "itsVariables", null);
        setField(term147512, term147512.getClass(), "itsConst", null);
        setField(term147512, term147512.getClass(), "itsVariableNames", null);
        setIntField(term147512, term147512.getClass(), "varStart", 0);
        setField(term147512, term147512.getClass(), "compilerData", null);
        setIntField(term147512, term147512.getClass(), "type", 0);
        setIntField(term147513, term147513.getClass(), "type", 0);
        setField(term147513, term147513.getClass(), "next", null);
        setField(term147513, term147513.getClass(), "first", null);
        setField(term147513, term147513.getClass(), "last", null);
        setField(term147513, term147513.getClass(), "propListHead", null);
        setIntField(term147513, term147513.getClass(), "sourcePosition", 0);
        setField(term147513, term147513.getClass(), "jsType", null);
        setField(term147513, term147513.getClass(), "parent", null);
        setField(term147512, term147512.getClass(), "next", term147513);
        setField(term147512, term147512.getClass(), "first", null);
        setField(term147512, term147512.getClass(), "last", null);
        setField(term147512, term147512.getClass(), "propListHead", null);
        setIntField(term147512, term147512.getClass(), "sourcePosition", 0);
        setField(term147512, term147512.getClass(), "jsType", null);
        setField(term147512, term147512.getClass(), "parent", null);
        setField(term147511, term147511.getClass(), "first", term147512);
        setField(term147511, term147511.getClass(), "last", null);
        setField(term147511, term147511.getClass(), "propListHead", null);
        setIntField(term147511, term147511.getClass(), "sourcePosition", 0);
        setField(term147511, term147511.getClass(), "jsType", null);
        setField(term147511, term147511.getClass(), "parent", null);
        term147451 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term147471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term147451, term147451.getClass(), "functionName", null);
        setBooleanField(term147451, term147451.getClass(), "itsNeedsActivation", false);
        setIntField(term147451, term147451.getClass(), "itsFunctionType", 0);
        setBooleanField(term147451, term147451.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147451, term147451.getClass(), "encodedSourceStart", 0);
        setIntField(term147451, term147451.getClass(), "encodedSourceEnd", 0);
        setField(term147451, term147451.getClass(), "sourceName", null);
        setIntField(term147451, term147451.getClass(), "baseLineno", 0);
        setIntField(term147451, term147451.getClass(), "endLineno", 0);
        setField(term147451, term147451.getClass(), "functions", null);
        setField(term147451, term147451.getClass(), "regexps", null);
        setField(term147451, term147451.getClass(), "itsVariables", null);
        setField(term147451, term147451.getClass(), "itsConst", null);
        setField(term147451, term147451.getClass(), "itsVariableNames", null);
        setIntField(term147451, term147451.getClass(), "varStart", 0);
        setField(term147451, term147451.getClass(), "compilerData", null);
        setIntField(term147451, term147451.getClass(), "type", 24);
        setField(term147451, term147451.getClass(), "next", null);
        setField(term147461, term147461.getClass(), "functionName", null);
        setBooleanField(term147461, term147461.getClass(), "itsNeedsActivation", false);
        setIntField(term147461, term147461.getClass(), "itsFunctionType", 0);
        setBooleanField(term147461, term147461.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term147461, term147461.getClass(), "encodedSourceStart", 0);
        setIntField(term147461, term147461.getClass(), "encodedSourceEnd", 0);
        setField(term147461, term147461.getClass(), "sourceName", null);
        setIntField(term147461, term147461.getClass(), "baseLineno", 0);
        setIntField(term147461, term147461.getClass(), "endLineno", 0);
        setField(term147461, term147461.getClass(), "functions", null);
        setField(term147461, term147461.getClass(), "regexps", null);
        setField(term147461, term147461.getClass(), "itsVariables", null);
        setField(term147461, term147461.getClass(), "itsConst", null);
        setField(term147461, term147461.getClass(), "itsVariableNames", null);
        setIntField(term147461, term147461.getClass(), "varStart", 0);
        setField(term147461, term147461.getClass(), "compilerData", null);
        setIntField(term147461, term147461.getClass(), "type", 0);
        setIntField(term147471, term147471.getClass(), "type", 0);
        setField(term147471, term147471.getClass(), "next", null);
        setField(term147471, term147471.getClass(), "first", null);
        setField(term147471, term147471.getClass(), "last", null);
        setField(term147471, term147471.getClass(), "propListHead", null);
        setIntField(term147471, term147471.getClass(), "sourcePosition", 0);
        setField(term147471, term147471.getClass(), "jsType", null);
        setField(term147471, term147471.getClass(), "parent", null);
        setField(term147461, term147461.getClass(), "next", term147471);
        setField(term147461, term147461.getClass(), "first", null);
        setField(term147461, term147461.getClass(), "last", null);
        setField(term147461, term147461.getClass(), "propListHead", null);
        setIntField(term147461, term147461.getClass(), "sourcePosition", 0);
        setField(term147461, term147461.getClass(), "jsType", null);
        setField(term147461, term147461.getClass(), "parent", null);
        setField(term147451, term147451.getClass(), "first", term147461);
        setField(term147451, term147451.getClass(), "last", null);
        setField(term147451, term147451.getClass(), "propListHead", null);
        setIntField(term147451, term147451.getClass(), "sourcePosition", 0);
        setField(term147451, term147451.getClass(), "jsType", null);
        setField(term147451, term147451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term146766;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term146680, args);
        assertTrue(recursiveEquals(term146680, term147510));
        assertTrue(recursiveEquals(term146766, term147511));
        assertTrue(recursiveEquals(retValue, term147451));
    }

};



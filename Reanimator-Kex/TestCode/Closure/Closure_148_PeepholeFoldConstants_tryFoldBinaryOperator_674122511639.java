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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140698;
     Object term140784;
     Object term141458;
     Object term141459;
     Object term141365;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term140784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term140854, term140854.getClass(), "next", term140940);
        setIntField(term140854, term140854.getClass(), "type", 0);
        setField(term140784, term140784.getClass(), "first", term140854);
        setIntField(term140784, term140784.getClass(), "type", 101);
        setField(term140784, term140784.getClass(), "parent", null);
        term141458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term141458, term141458.getClass(), "currentTraversal", null);
        term141459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term141459, term141459.getClass(), "functionName", null);
        setBooleanField(term141459, term141459.getClass(), "itsNeedsActivation", false);
        setIntField(term141459, term141459.getClass(), "itsFunctionType", 0);
        setBooleanField(term141459, term141459.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141459, term141459.getClass(), "encodedSourceStart", 0);
        setIntField(term141459, term141459.getClass(), "encodedSourceEnd", 0);
        setField(term141459, term141459.getClass(), "sourceName", null);
        setIntField(term141459, term141459.getClass(), "baseLineno", 0);
        setIntField(term141459, term141459.getClass(), "endLineno", 0);
        setField(term141459, term141459.getClass(), "functions", null);
        setField(term141459, term141459.getClass(), "regexps", null);
        setField(term141459, term141459.getClass(), "itsVariables", null);
        setField(term141459, term141459.getClass(), "itsConst", null);
        setField(term141459, term141459.getClass(), "itsVariableNames", null);
        setIntField(term141459, term141459.getClass(), "varStart", 0);
        setField(term141459, term141459.getClass(), "compilerData", null);
        setIntField(term141459, term141459.getClass(), "type", 101);
        setField(term141459, term141459.getClass(), "next", null);
        setIntField(term141460, term141460.getClass(), "type", 0);
        setField(term141461, term141461.getClass(), "functionName", null);
        setBooleanField(term141461, term141461.getClass(), "itsNeedsActivation", false);
        setIntField(term141461, term141461.getClass(), "itsFunctionType", 0);
        setBooleanField(term141461, term141461.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141461, term141461.getClass(), "encodedSourceStart", 0);
        setIntField(term141461, term141461.getClass(), "encodedSourceEnd", 0);
        setField(term141461, term141461.getClass(), "sourceName", null);
        setIntField(term141461, term141461.getClass(), "baseLineno", 0);
        setIntField(term141461, term141461.getClass(), "endLineno", 0);
        setField(term141461, term141461.getClass(), "functions", null);
        setField(term141461, term141461.getClass(), "regexps", null);
        setField(term141461, term141461.getClass(), "itsVariables", null);
        setField(term141461, term141461.getClass(), "itsConst", null);
        setField(term141461, term141461.getClass(), "itsVariableNames", null);
        setIntField(term141461, term141461.getClass(), "varStart", 0);
        setField(term141461, term141461.getClass(), "compilerData", null);
        setIntField(term141461, term141461.getClass(), "type", 0);
        setField(term141461, term141461.getClass(), "next", null);
        setField(term141461, term141461.getClass(), "first", null);
        setField(term141461, term141461.getClass(), "last", null);
        setField(term141461, term141461.getClass(), "propListHead", null);
        setIntField(term141461, term141461.getClass(), "sourcePosition", 0);
        setField(term141461, term141461.getClass(), "jsType", null);
        setField(term141461, term141461.getClass(), "parent", null);
        setField(term141460, term141460.getClass(), "next", term141461);
        setField(term141460, term141460.getClass(), "first", null);
        setField(term141460, term141460.getClass(), "last", null);
        setField(term141460, term141460.getClass(), "propListHead", null);
        setIntField(term141460, term141460.getClass(), "sourcePosition", 0);
        setField(term141460, term141460.getClass(), "jsType", null);
        setField(term141460, term141460.getClass(), "parent", null);
        setField(term141459, term141459.getClass(), "first", term141460);
        setField(term141459, term141459.getClass(), "last", null);
        setField(term141459, term141459.getClass(), "propListHead", null);
        setIntField(term141459, term141459.getClass(), "sourcePosition", 0);
        setField(term141459, term141459.getClass(), "jsType", null);
        setField(term141459, term141459.getClass(), "parent", null);
        term141365 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term141365, term141365.getClass(), "functionName", null);
        setBooleanField(term141365, term141365.getClass(), "itsNeedsActivation", false);
        setIntField(term141365, term141365.getClass(), "itsFunctionType", 0);
        setBooleanField(term141365, term141365.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141365, term141365.getClass(), "encodedSourceStart", 0);
        setIntField(term141365, term141365.getClass(), "encodedSourceEnd", 0);
        setField(term141365, term141365.getClass(), "sourceName", null);
        setIntField(term141365, term141365.getClass(), "baseLineno", 0);
        setIntField(term141365, term141365.getClass(), "endLineno", 0);
        setField(term141365, term141365.getClass(), "functions", null);
        setField(term141365, term141365.getClass(), "regexps", null);
        setField(term141365, term141365.getClass(), "itsVariables", null);
        setField(term141365, term141365.getClass(), "itsConst", null);
        setField(term141365, term141365.getClass(), "itsVariableNames", null);
        setIntField(term141365, term141365.getClass(), "varStart", 0);
        setField(term141365, term141365.getClass(), "compilerData", null);
        setIntField(term141365, term141365.getClass(), "type", 101);
        setField(term141365, term141365.getClass(), "next", null);
        setIntField(term141375, term141375.getClass(), "type", 0);
        setField(term141377, term141377.getClass(), "functionName", null);
        setBooleanField(term141377, term141377.getClass(), "itsNeedsActivation", false);
        setIntField(term141377, term141377.getClass(), "itsFunctionType", 0);
        setBooleanField(term141377, term141377.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term141377, term141377.getClass(), "encodedSourceStart", 0);
        setIntField(term141377, term141377.getClass(), "encodedSourceEnd", 0);
        setField(term141377, term141377.getClass(), "sourceName", null);
        setIntField(term141377, term141377.getClass(), "baseLineno", 0);
        setIntField(term141377, term141377.getClass(), "endLineno", 0);
        setField(term141377, term141377.getClass(), "functions", null);
        setField(term141377, term141377.getClass(), "regexps", null);
        setField(term141377, term141377.getClass(), "itsVariables", null);
        setField(term141377, term141377.getClass(), "itsConst", null);
        setField(term141377, term141377.getClass(), "itsVariableNames", null);
        setIntField(term141377, term141377.getClass(), "varStart", 0);
        setField(term141377, term141377.getClass(), "compilerData", null);
        setIntField(term141377, term141377.getClass(), "type", 0);
        setField(term141377, term141377.getClass(), "next", null);
        setField(term141377, term141377.getClass(), "first", null);
        setField(term141377, term141377.getClass(), "last", null);
        setField(term141377, term141377.getClass(), "propListHead", null);
        setIntField(term141377, term141377.getClass(), "sourcePosition", 0);
        setField(term141377, term141377.getClass(), "jsType", null);
        setField(term141377, term141377.getClass(), "parent", null);
        setField(term141375, term141375.getClass(), "next", term141377);
        setField(term141375, term141375.getClass(), "first", null);
        setField(term141375, term141375.getClass(), "last", null);
        setField(term141375, term141375.getClass(), "propListHead", null);
        setIntField(term141375, term141375.getClass(), "sourcePosition", 0);
        setField(term141375, term141375.getClass(), "jsType", null);
        setField(term141375, term141375.getClass(), "parent", null);
        setField(term141365, term141365.getClass(), "first", term141375);
        setField(term141365, term141365.getClass(), "last", null);
        setField(term141365, term141365.getClass(), "propListHead", null);
        setIntField(term141365, term141365.getClass(), "sourcePosition", 0);
        setField(term141365, term141365.getClass(), "jsType", null);
        setField(term141365, term141365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term140784;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term140698, args);
        assertTrue(recursiveEquals(term140698, term141458));
        assertTrue(recursiveEquals(term140784, term141459));
        assertTrue(recursiveEquals(retValue, term141365));
    }

};



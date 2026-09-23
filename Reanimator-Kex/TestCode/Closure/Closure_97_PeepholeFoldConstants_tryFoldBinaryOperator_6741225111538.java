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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565596;
     Object term565682;
     Object term566001;
     Object term566002;
     Object term565942;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565596 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term565682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565768 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term565768, term565768.getClass(), "next", term565838);
        setField(term565682, term565682.getClass(), "first", term565768);
        setIntField(term565682, term565682.getClass(), "type", 20);
        term566001 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term566001, term566001.getClass(), "currentTraversal", null);
        term566002 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term566003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term566004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term566002, term566002.getClass(), "functionName", null);
        setBooleanField(term566002, term566002.getClass(), "itsNeedsActivation", false);
        setIntField(term566002, term566002.getClass(), "itsFunctionType", 0);
        setBooleanField(term566002, term566002.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566002, term566002.getClass(), "encodedSourceStart", 0);
        setIntField(term566002, term566002.getClass(), "encodedSourceEnd", 0);
        setField(term566002, term566002.getClass(), "sourceName", null);
        setIntField(term566002, term566002.getClass(), "baseLineno", 0);
        setIntField(term566002, term566002.getClass(), "endLineno", 0);
        setField(term566002, term566002.getClass(), "functions", null);
        setField(term566002, term566002.getClass(), "regexps", null);
        setField(term566002, term566002.getClass(), "itsVariables", null);
        setField(term566002, term566002.getClass(), "itsConst", null);
        setField(term566002, term566002.getClass(), "itsVariableNames", null);
        setIntField(term566002, term566002.getClass(), "varStart", 0);
        setField(term566002, term566002.getClass(), "compilerData", null);
        setIntField(term566002, term566002.getClass(), "type", 20);
        setField(term566002, term566002.getClass(), "next", null);
        setField(term566003, term566003.getClass(), "functionName", null);
        setBooleanField(term566003, term566003.getClass(), "itsNeedsActivation", false);
        setIntField(term566003, term566003.getClass(), "itsFunctionType", 0);
        setBooleanField(term566003, term566003.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566003, term566003.getClass(), "encodedSourceStart", 0);
        setIntField(term566003, term566003.getClass(), "encodedSourceEnd", 0);
        setField(term566003, term566003.getClass(), "sourceName", null);
        setIntField(term566003, term566003.getClass(), "baseLineno", 0);
        setIntField(term566003, term566003.getClass(), "endLineno", 0);
        setField(term566003, term566003.getClass(), "functions", null);
        setField(term566003, term566003.getClass(), "regexps", null);
        setField(term566003, term566003.getClass(), "itsVariables", null);
        setField(term566003, term566003.getClass(), "itsConst", null);
        setField(term566003, term566003.getClass(), "itsVariableNames", null);
        setIntField(term566003, term566003.getClass(), "varStart", 0);
        setField(term566003, term566003.getClass(), "compilerData", null);
        setIntField(term566003, term566003.getClass(), "type", 0);
        setIntField(term566004, term566004.getClass(), "type", 0);
        setField(term566004, term566004.getClass(), "next", null);
        setField(term566004, term566004.getClass(), "first", null);
        setField(term566004, term566004.getClass(), "last", null);
        setField(term566004, term566004.getClass(), "propListHead", null);
        setIntField(term566004, term566004.getClass(), "sourcePosition", 0);
        setField(term566004, term566004.getClass(), "jsType", null);
        setField(term566004, term566004.getClass(), "parent", null);
        setField(term566003, term566003.getClass(), "next", term566004);
        setField(term566003, term566003.getClass(), "first", null);
        setField(term566003, term566003.getClass(), "last", null);
        setField(term566003, term566003.getClass(), "propListHead", null);
        setIntField(term566003, term566003.getClass(), "sourcePosition", 0);
        setField(term566003, term566003.getClass(), "jsType", null);
        setField(term566003, term566003.getClass(), "parent", null);
        setField(term566002, term566002.getClass(), "first", term566003);
        setField(term566002, term566002.getClass(), "last", null);
        setField(term566002, term566002.getClass(), "propListHead", null);
        setIntField(term566002, term566002.getClass(), "sourcePosition", 0);
        setField(term566002, term566002.getClass(), "jsType", null);
        setField(term566002, term566002.getClass(), "parent", null);
        term565942 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term565942, term565942.getClass(), "functionName", null);
        setBooleanField(term565942, term565942.getClass(), "itsNeedsActivation", false);
        setIntField(term565942, term565942.getClass(), "itsFunctionType", 0);
        setBooleanField(term565942, term565942.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565942, term565942.getClass(), "encodedSourceStart", 0);
        setIntField(term565942, term565942.getClass(), "encodedSourceEnd", 0);
        setField(term565942, term565942.getClass(), "sourceName", null);
        setIntField(term565942, term565942.getClass(), "baseLineno", 0);
        setIntField(term565942, term565942.getClass(), "endLineno", 0);
        setField(term565942, term565942.getClass(), "functions", null);
        setField(term565942, term565942.getClass(), "regexps", null);
        setField(term565942, term565942.getClass(), "itsVariables", null);
        setField(term565942, term565942.getClass(), "itsConst", null);
        setField(term565942, term565942.getClass(), "itsVariableNames", null);
        setIntField(term565942, term565942.getClass(), "varStart", 0);
        setField(term565942, term565942.getClass(), "compilerData", null);
        setIntField(term565942, term565942.getClass(), "type", 20);
        setField(term565942, term565942.getClass(), "next", null);
        setField(term565952, term565952.getClass(), "functionName", null);
        setBooleanField(term565952, term565952.getClass(), "itsNeedsActivation", false);
        setIntField(term565952, term565952.getClass(), "itsFunctionType", 0);
        setBooleanField(term565952, term565952.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565952, term565952.getClass(), "encodedSourceStart", 0);
        setIntField(term565952, term565952.getClass(), "encodedSourceEnd", 0);
        setField(term565952, term565952.getClass(), "sourceName", null);
        setIntField(term565952, term565952.getClass(), "baseLineno", 0);
        setIntField(term565952, term565952.getClass(), "endLineno", 0);
        setField(term565952, term565952.getClass(), "functions", null);
        setField(term565952, term565952.getClass(), "regexps", null);
        setField(term565952, term565952.getClass(), "itsVariables", null);
        setField(term565952, term565952.getClass(), "itsConst", null);
        setField(term565952, term565952.getClass(), "itsVariableNames", null);
        setIntField(term565952, term565952.getClass(), "varStart", 0);
        setField(term565952, term565952.getClass(), "compilerData", null);
        setIntField(term565952, term565952.getClass(), "type", 0);
        setIntField(term565962, term565962.getClass(), "type", 0);
        setField(term565962, term565962.getClass(), "next", null);
        setField(term565962, term565962.getClass(), "first", null);
        setField(term565962, term565962.getClass(), "last", null);
        setField(term565962, term565962.getClass(), "propListHead", null);
        setIntField(term565962, term565962.getClass(), "sourcePosition", 0);
        setField(term565962, term565962.getClass(), "jsType", null);
        setField(term565962, term565962.getClass(), "parent", null);
        setField(term565952, term565952.getClass(), "next", term565962);
        setField(term565952, term565952.getClass(), "first", null);
        setField(term565952, term565952.getClass(), "last", null);
        setField(term565952, term565952.getClass(), "propListHead", null);
        setIntField(term565952, term565952.getClass(), "sourcePosition", 0);
        setField(term565952, term565952.getClass(), "jsType", null);
        setField(term565952, term565952.getClass(), "parent", null);
        setField(term565942, term565942.getClass(), "first", term565952);
        setField(term565942, term565942.getClass(), "last", null);
        setField(term565942, term565942.getClass(), "propListHead", null);
        setIntField(term565942, term565942.getClass(), "sourcePosition", 0);
        setField(term565942, term565942.getClass(), "jsType", null);
        setField(term565942, term565942.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term565682;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term565596, args);
        assertTrue(recursiveEquals(term565596, term566001));
        assertTrue(recursiveEquals(term565682, term566002));
        assertTrue(recursiveEquals(retValue, term565942));
    }

};



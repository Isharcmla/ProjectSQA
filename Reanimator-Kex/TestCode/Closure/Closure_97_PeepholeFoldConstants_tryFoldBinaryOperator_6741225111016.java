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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318080;
     Object term318166;
     Object term318489;
     Object term318490;
     Object term318422;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318080 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term318166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term318252, term318252.getClass(), "next", term318344);
        setIntField(term318252, term318252.getClass(), "type", 39);
        setField(term318166, term318166.getClass(), "first", term318252);
        setIntField(term318166, term318166.getClass(), "type", 9);
        term318489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term318489, term318489.getClass(), "currentTraversal", null);
        term318490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318491 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term318490, term318490.getClass(), "functionName", null);
        setBooleanField(term318490, term318490.getClass(), "itsNeedsActivation", false);
        setIntField(term318490, term318490.getClass(), "itsFunctionType", 0);
        setBooleanField(term318490, term318490.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318490, term318490.getClass(), "encodedSourceStart", 0);
        setIntField(term318490, term318490.getClass(), "encodedSourceEnd", 0);
        setField(term318490, term318490.getClass(), "sourceName", null);
        setIntField(term318490, term318490.getClass(), "baseLineno", 0);
        setIntField(term318490, term318490.getClass(), "endLineno", 0);
        setField(term318490, term318490.getClass(), "functions", null);
        setField(term318490, term318490.getClass(), "regexps", null);
        setField(term318490, term318490.getClass(), "itsVariables", null);
        setField(term318490, term318490.getClass(), "itsConst", null);
        setField(term318490, term318490.getClass(), "itsVariableNames", null);
        setIntField(term318490, term318490.getClass(), "varStart", 0);
        setField(term318490, term318490.getClass(), "compilerData", null);
        setIntField(term318490, term318490.getClass(), "type", 9);
        setField(term318490, term318490.getClass(), "next", null);
        setField(term318491, term318491.getClass(), "functionName", null);
        setBooleanField(term318491, term318491.getClass(), "itsNeedsActivation", false);
        setIntField(term318491, term318491.getClass(), "itsFunctionType", 0);
        setBooleanField(term318491, term318491.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318491, term318491.getClass(), "encodedSourceStart", 0);
        setIntField(term318491, term318491.getClass(), "encodedSourceEnd", 0);
        setField(term318491, term318491.getClass(), "sourceName", null);
        setIntField(term318491, term318491.getClass(), "baseLineno", 0);
        setIntField(term318491, term318491.getClass(), "endLineno", 0);
        setField(term318491, term318491.getClass(), "functions", null);
        setField(term318491, term318491.getClass(), "regexps", null);
        setField(term318491, term318491.getClass(), "itsVariables", null);
        setField(term318491, term318491.getClass(), "itsConst", null);
        setField(term318491, term318491.getClass(), "itsVariableNames", null);
        setIntField(term318491, term318491.getClass(), "varStart", 0);
        setField(term318491, term318491.getClass(), "compilerData", null);
        setIntField(term318491, term318491.getClass(), "type", 39);
        setField(term318492, term318492.getClass(), "str", null);
        setIntField(term318492, term318492.getClass(), "type", 0);
        setField(term318492, term318492.getClass(), "next", null);
        setField(term318492, term318492.getClass(), "first", null);
        setField(term318492, term318492.getClass(), "last", null);
        setField(term318492, term318492.getClass(), "propListHead", null);
        setIntField(term318492, term318492.getClass(), "sourcePosition", 0);
        setField(term318492, term318492.getClass(), "jsType", null);
        setField(term318492, term318492.getClass(), "parent", null);
        setField(term318491, term318491.getClass(), "next", term318492);
        setField(term318491, term318491.getClass(), "first", null);
        setField(term318491, term318491.getClass(), "last", null);
        setField(term318491, term318491.getClass(), "propListHead", null);
        setIntField(term318491, term318491.getClass(), "sourcePosition", 0);
        setField(term318491, term318491.getClass(), "jsType", null);
        setField(term318491, term318491.getClass(), "parent", null);
        setField(term318490, term318490.getClass(), "first", term318491);
        setField(term318490, term318490.getClass(), "last", null);
        setField(term318490, term318490.getClass(), "propListHead", null);
        setIntField(term318490, term318490.getClass(), "sourcePosition", 0);
        setField(term318490, term318490.getClass(), "jsType", null);
        setField(term318490, term318490.getClass(), "parent", null);
        term318422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term318442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term318422, term318422.getClass(), "functionName", null);
        setBooleanField(term318422, term318422.getClass(), "itsNeedsActivation", false);
        setIntField(term318422, term318422.getClass(), "itsFunctionType", 0);
        setBooleanField(term318422, term318422.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318422, term318422.getClass(), "encodedSourceStart", 0);
        setIntField(term318422, term318422.getClass(), "encodedSourceEnd", 0);
        setField(term318422, term318422.getClass(), "sourceName", null);
        setIntField(term318422, term318422.getClass(), "baseLineno", 0);
        setIntField(term318422, term318422.getClass(), "endLineno", 0);
        setField(term318422, term318422.getClass(), "functions", null);
        setField(term318422, term318422.getClass(), "regexps", null);
        setField(term318422, term318422.getClass(), "itsVariables", null);
        setField(term318422, term318422.getClass(), "itsConst", null);
        setField(term318422, term318422.getClass(), "itsVariableNames", null);
        setIntField(term318422, term318422.getClass(), "varStart", 0);
        setField(term318422, term318422.getClass(), "compilerData", null);
        setIntField(term318422, term318422.getClass(), "type", 9);
        setField(term318422, term318422.getClass(), "next", null);
        setField(term318432, term318432.getClass(), "functionName", null);
        setBooleanField(term318432, term318432.getClass(), "itsNeedsActivation", false);
        setIntField(term318432, term318432.getClass(), "itsFunctionType", 0);
        setBooleanField(term318432, term318432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318432, term318432.getClass(), "encodedSourceStart", 0);
        setIntField(term318432, term318432.getClass(), "encodedSourceEnd", 0);
        setField(term318432, term318432.getClass(), "sourceName", null);
        setIntField(term318432, term318432.getClass(), "baseLineno", 0);
        setIntField(term318432, term318432.getClass(), "endLineno", 0);
        setField(term318432, term318432.getClass(), "functions", null);
        setField(term318432, term318432.getClass(), "regexps", null);
        setField(term318432, term318432.getClass(), "itsVariables", null);
        setField(term318432, term318432.getClass(), "itsConst", null);
        setField(term318432, term318432.getClass(), "itsVariableNames", null);
        setIntField(term318432, term318432.getClass(), "varStart", 0);
        setField(term318432, term318432.getClass(), "compilerData", null);
        setIntField(term318432, term318432.getClass(), "type", 39);
        setField(term318442, term318442.getClass(), "str", null);
        setIntField(term318442, term318442.getClass(), "type", 0);
        setField(term318442, term318442.getClass(), "next", null);
        setField(term318442, term318442.getClass(), "first", null);
        setField(term318442, term318442.getClass(), "last", null);
        setField(term318442, term318442.getClass(), "propListHead", null);
        setIntField(term318442, term318442.getClass(), "sourcePosition", 0);
        setField(term318442, term318442.getClass(), "jsType", null);
        setField(term318442, term318442.getClass(), "parent", null);
        setField(term318432, term318432.getClass(), "next", term318442);
        setField(term318432, term318432.getClass(), "first", null);
        setField(term318432, term318432.getClass(), "last", null);
        setField(term318432, term318432.getClass(), "propListHead", null);
        setIntField(term318432, term318432.getClass(), "sourcePosition", 0);
        setField(term318432, term318432.getClass(), "jsType", null);
        setField(term318432, term318432.getClass(), "parent", null);
        setField(term318422, term318422.getClass(), "first", term318432);
        setField(term318422, term318422.getClass(), "last", null);
        setField(term318422, term318422.getClass(), "propListHead", null);
        setIntField(term318422, term318422.getClass(), "sourcePosition", 0);
        setField(term318422, term318422.getClass(), "jsType", null);
        setField(term318422, term318422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term318166;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term318080, args);
        assertTrue(recursiveEquals(term318080, term318489));
        assertTrue(recursiveEquals(term318166, term318490));
        assertTrue(recursiveEquals(retValue, term318422));
    }

};



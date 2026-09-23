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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228140;
     Object term228226;
     Object term228574;
     Object term228575;
     Object term228508;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228140 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term228226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term228312, term228312.getClass(), "next", term228382);
        setField(term228226, term228226.getClass(), "first", term228312);
        setIntField(term228226, term228226.getClass(), "type", 17);
        term228574 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term228574, term228574.getClass(), "currentTraversal", null);
        term228575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228576 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term228575, term228575.getClass(), "functionName", null);
        setBooleanField(term228575, term228575.getClass(), "itsNeedsActivation", false);
        setIntField(term228575, term228575.getClass(), "itsFunctionType", 0);
        setBooleanField(term228575, term228575.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term228575, term228575.getClass(), "encodedSourceStart", 0);
        setIntField(term228575, term228575.getClass(), "encodedSourceEnd", 0);
        setField(term228575, term228575.getClass(), "sourceName", null);
        setIntField(term228575, term228575.getClass(), "baseLineno", 0);
        setIntField(term228575, term228575.getClass(), "endLineno", 0);
        setField(term228575, term228575.getClass(), "functions", null);
        setField(term228575, term228575.getClass(), "regexps", null);
        setField(term228575, term228575.getClass(), "itsVariables", null);
        setField(term228575, term228575.getClass(), "itsConst", null);
        setField(term228575, term228575.getClass(), "itsVariableNames", null);
        setIntField(term228575, term228575.getClass(), "varStart", 0);
        setField(term228575, term228575.getClass(), "compilerData", null);
        setIntField(term228575, term228575.getClass(), "type", 17);
        setField(term228575, term228575.getClass(), "next", null);
        setField(term228576, term228576.getClass(), "functionName", null);
        setBooleanField(term228576, term228576.getClass(), "itsNeedsActivation", false);
        setIntField(term228576, term228576.getClass(), "itsFunctionType", 0);
        setBooleanField(term228576, term228576.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term228576, term228576.getClass(), "encodedSourceStart", 0);
        setIntField(term228576, term228576.getClass(), "encodedSourceEnd", 0);
        setField(term228576, term228576.getClass(), "sourceName", null);
        setIntField(term228576, term228576.getClass(), "baseLineno", 0);
        setIntField(term228576, term228576.getClass(), "endLineno", 0);
        setField(term228576, term228576.getClass(), "functions", null);
        setField(term228576, term228576.getClass(), "regexps", null);
        setField(term228576, term228576.getClass(), "itsVariables", null);
        setField(term228576, term228576.getClass(), "itsConst", null);
        setField(term228576, term228576.getClass(), "itsVariableNames", null);
        setIntField(term228576, term228576.getClass(), "varStart", 0);
        setField(term228576, term228576.getClass(), "compilerData", null);
        setIntField(term228576, term228576.getClass(), "type", 0);
        setIntField(term228577, term228577.getClass(), "type", 0);
        setField(term228577, term228577.getClass(), "next", null);
        setField(term228577, term228577.getClass(), "first", null);
        setField(term228577, term228577.getClass(), "last", null);
        setField(term228577, term228577.getClass(), "propListHead", null);
        setIntField(term228577, term228577.getClass(), "sourcePosition", 0);
        setField(term228577, term228577.getClass(), "jsType", null);
        setField(term228577, term228577.getClass(), "parent", null);
        setField(term228576, term228576.getClass(), "next", term228577);
        setField(term228576, term228576.getClass(), "first", null);
        setField(term228576, term228576.getClass(), "last", null);
        setField(term228576, term228576.getClass(), "propListHead", null);
        setIntField(term228576, term228576.getClass(), "sourcePosition", 0);
        setField(term228576, term228576.getClass(), "jsType", null);
        setField(term228576, term228576.getClass(), "parent", null);
        setField(term228575, term228575.getClass(), "first", term228576);
        setField(term228575, term228575.getClass(), "last", null);
        setField(term228575, term228575.getClass(), "propListHead", null);
        setIntField(term228575, term228575.getClass(), "sourcePosition", 0);
        setField(term228575, term228575.getClass(), "jsType", null);
        setField(term228575, term228575.getClass(), "parent", null);
        term228508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term228528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term228508, term228508.getClass(), "functionName", null);
        setBooleanField(term228508, term228508.getClass(), "itsNeedsActivation", false);
        setIntField(term228508, term228508.getClass(), "itsFunctionType", 0);
        setBooleanField(term228508, term228508.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term228508, term228508.getClass(), "encodedSourceStart", 0);
        setIntField(term228508, term228508.getClass(), "encodedSourceEnd", 0);
        setField(term228508, term228508.getClass(), "sourceName", null);
        setIntField(term228508, term228508.getClass(), "baseLineno", 0);
        setIntField(term228508, term228508.getClass(), "endLineno", 0);
        setField(term228508, term228508.getClass(), "functions", null);
        setField(term228508, term228508.getClass(), "regexps", null);
        setField(term228508, term228508.getClass(), "itsVariables", null);
        setField(term228508, term228508.getClass(), "itsConst", null);
        setField(term228508, term228508.getClass(), "itsVariableNames", null);
        setIntField(term228508, term228508.getClass(), "varStart", 0);
        setField(term228508, term228508.getClass(), "compilerData", null);
        setIntField(term228508, term228508.getClass(), "type", 17);
        setField(term228508, term228508.getClass(), "next", null);
        setField(term228518, term228518.getClass(), "functionName", null);
        setBooleanField(term228518, term228518.getClass(), "itsNeedsActivation", false);
        setIntField(term228518, term228518.getClass(), "itsFunctionType", 0);
        setBooleanField(term228518, term228518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term228518, term228518.getClass(), "encodedSourceStart", 0);
        setIntField(term228518, term228518.getClass(), "encodedSourceEnd", 0);
        setField(term228518, term228518.getClass(), "sourceName", null);
        setIntField(term228518, term228518.getClass(), "baseLineno", 0);
        setIntField(term228518, term228518.getClass(), "endLineno", 0);
        setField(term228518, term228518.getClass(), "functions", null);
        setField(term228518, term228518.getClass(), "regexps", null);
        setField(term228518, term228518.getClass(), "itsVariables", null);
        setField(term228518, term228518.getClass(), "itsConst", null);
        setField(term228518, term228518.getClass(), "itsVariableNames", null);
        setIntField(term228518, term228518.getClass(), "varStart", 0);
        setField(term228518, term228518.getClass(), "compilerData", null);
        setIntField(term228518, term228518.getClass(), "type", 0);
        setIntField(term228528, term228528.getClass(), "type", 0);
        setField(term228528, term228528.getClass(), "next", null);
        setField(term228528, term228528.getClass(), "first", null);
        setField(term228528, term228528.getClass(), "last", null);
        setField(term228528, term228528.getClass(), "propListHead", null);
        setIntField(term228528, term228528.getClass(), "sourcePosition", 0);
        setField(term228528, term228528.getClass(), "jsType", null);
        setField(term228528, term228528.getClass(), "parent", null);
        setField(term228518, term228518.getClass(), "next", term228528);
        setField(term228518, term228518.getClass(), "first", null);
        setField(term228518, term228518.getClass(), "last", null);
        setField(term228518, term228518.getClass(), "propListHead", null);
        setIntField(term228518, term228518.getClass(), "sourcePosition", 0);
        setField(term228518, term228518.getClass(), "jsType", null);
        setField(term228518, term228518.getClass(), "parent", null);
        setField(term228508, term228508.getClass(), "first", term228518);
        setField(term228508, term228508.getClass(), "last", null);
        setField(term228508, term228508.getClass(), "propListHead", null);
        setIntField(term228508, term228508.getClass(), "sourcePosition", 0);
        setField(term228508, term228508.getClass(), "jsType", null);
        setField(term228508, term228508.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term228226;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term228140, args);
        assertTrue(recursiveEquals(term228140, term228574));
        assertTrue(recursiveEquals(term228226, term228575));
        assertTrue(recursiveEquals(retValue, term228508));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243022;
     Object term243108;
     Object term243663;
     Object term243664;
     Object term243620;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term243108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term243194, term243194.getClass(), "next", term243264);
        setField(term243108, term243108.getClass(), "first", term243194);
        setIntField(term243108, term243108.getClass(), "type", 39);
        term243663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term243663, term243663.getClass(), "currentTraversal", null);
        term243664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term243664, term243664.getClass(), "functionName", null);
        setBooleanField(term243664, term243664.getClass(), "itsNeedsActivation", false);
        setIntField(term243664, term243664.getClass(), "itsFunctionType", 0);
        setBooleanField(term243664, term243664.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243664, term243664.getClass(), "encodedSourceStart", 0);
        setIntField(term243664, term243664.getClass(), "encodedSourceEnd", 0);
        setField(term243664, term243664.getClass(), "sourceName", null);
        setIntField(term243664, term243664.getClass(), "baseLineno", 0);
        setIntField(term243664, term243664.getClass(), "endLineno", 0);
        setField(term243664, term243664.getClass(), "functions", null);
        setField(term243664, term243664.getClass(), "regexps", null);
        setField(term243664, term243664.getClass(), "itsVariables", null);
        setField(term243664, term243664.getClass(), "itsConst", null);
        setField(term243664, term243664.getClass(), "itsVariableNames", null);
        setIntField(term243664, term243664.getClass(), "varStart", 0);
        setField(term243664, term243664.getClass(), "compilerData", null);
        setIntField(term243664, term243664.getClass(), "type", 39);
        setField(term243664, term243664.getClass(), "next", null);
        setField(term243665, term243665.getClass(), "functionName", null);
        setBooleanField(term243665, term243665.getClass(), "itsNeedsActivation", false);
        setIntField(term243665, term243665.getClass(), "itsFunctionType", 0);
        setBooleanField(term243665, term243665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243665, term243665.getClass(), "encodedSourceStart", 0);
        setIntField(term243665, term243665.getClass(), "encodedSourceEnd", 0);
        setField(term243665, term243665.getClass(), "sourceName", null);
        setIntField(term243665, term243665.getClass(), "baseLineno", 0);
        setIntField(term243665, term243665.getClass(), "endLineno", 0);
        setField(term243665, term243665.getClass(), "functions", null);
        setField(term243665, term243665.getClass(), "regexps", null);
        setField(term243665, term243665.getClass(), "itsVariables", null);
        setField(term243665, term243665.getClass(), "itsConst", null);
        setField(term243665, term243665.getClass(), "itsVariableNames", null);
        setIntField(term243665, term243665.getClass(), "varStart", 0);
        setField(term243665, term243665.getClass(), "compilerData", null);
        setIntField(term243665, term243665.getClass(), "type", 0);
        setIntField(term243666, term243666.getClass(), "type", 0);
        setField(term243666, term243666.getClass(), "next", null);
        setField(term243666, term243666.getClass(), "first", null);
        setField(term243666, term243666.getClass(), "last", null);
        setField(term243666, term243666.getClass(), "propListHead", null);
        setIntField(term243666, term243666.getClass(), "sourcePosition", 0);
        setField(term243666, term243666.getClass(), "jsType", null);
        setField(term243666, term243666.getClass(), "parent", null);
        setField(term243665, term243665.getClass(), "next", term243666);
        setField(term243665, term243665.getClass(), "first", null);
        setField(term243665, term243665.getClass(), "last", null);
        setField(term243665, term243665.getClass(), "propListHead", null);
        setIntField(term243665, term243665.getClass(), "sourcePosition", 0);
        setField(term243665, term243665.getClass(), "jsType", null);
        setField(term243665, term243665.getClass(), "parent", null);
        setField(term243664, term243664.getClass(), "first", term243665);
        setField(term243664, term243664.getClass(), "last", null);
        setField(term243664, term243664.getClass(), "propListHead", null);
        setIntField(term243664, term243664.getClass(), "sourcePosition", 0);
        setField(term243664, term243664.getClass(), "jsType", null);
        setField(term243664, term243664.getClass(), "parent", null);
        term243620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term243640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term243620, term243620.getClass(), "functionName", null);
        setBooleanField(term243620, term243620.getClass(), "itsNeedsActivation", false);
        setIntField(term243620, term243620.getClass(), "itsFunctionType", 0);
        setBooleanField(term243620, term243620.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243620, term243620.getClass(), "encodedSourceStart", 0);
        setIntField(term243620, term243620.getClass(), "encodedSourceEnd", 0);
        setField(term243620, term243620.getClass(), "sourceName", null);
        setIntField(term243620, term243620.getClass(), "baseLineno", 0);
        setIntField(term243620, term243620.getClass(), "endLineno", 0);
        setField(term243620, term243620.getClass(), "functions", null);
        setField(term243620, term243620.getClass(), "regexps", null);
        setField(term243620, term243620.getClass(), "itsVariables", null);
        setField(term243620, term243620.getClass(), "itsConst", null);
        setField(term243620, term243620.getClass(), "itsVariableNames", null);
        setIntField(term243620, term243620.getClass(), "varStart", 0);
        setField(term243620, term243620.getClass(), "compilerData", null);
        setIntField(term243620, term243620.getClass(), "type", 39);
        setField(term243620, term243620.getClass(), "next", null);
        setField(term243630, term243630.getClass(), "functionName", null);
        setBooleanField(term243630, term243630.getClass(), "itsNeedsActivation", false);
        setIntField(term243630, term243630.getClass(), "itsFunctionType", 0);
        setBooleanField(term243630, term243630.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243630, term243630.getClass(), "encodedSourceStart", 0);
        setIntField(term243630, term243630.getClass(), "encodedSourceEnd", 0);
        setField(term243630, term243630.getClass(), "sourceName", null);
        setIntField(term243630, term243630.getClass(), "baseLineno", 0);
        setIntField(term243630, term243630.getClass(), "endLineno", 0);
        setField(term243630, term243630.getClass(), "functions", null);
        setField(term243630, term243630.getClass(), "regexps", null);
        setField(term243630, term243630.getClass(), "itsVariables", null);
        setField(term243630, term243630.getClass(), "itsConst", null);
        setField(term243630, term243630.getClass(), "itsVariableNames", null);
        setIntField(term243630, term243630.getClass(), "varStart", 0);
        setField(term243630, term243630.getClass(), "compilerData", null);
        setIntField(term243630, term243630.getClass(), "type", 0);
        setIntField(term243640, term243640.getClass(), "type", 0);
        setField(term243640, term243640.getClass(), "next", null);
        setField(term243640, term243640.getClass(), "first", null);
        setField(term243640, term243640.getClass(), "last", null);
        setField(term243640, term243640.getClass(), "propListHead", null);
        setIntField(term243640, term243640.getClass(), "sourcePosition", 0);
        setField(term243640, term243640.getClass(), "jsType", null);
        setField(term243640, term243640.getClass(), "parent", null);
        setField(term243630, term243630.getClass(), "next", term243640);
        setField(term243630, term243630.getClass(), "first", null);
        setField(term243630, term243630.getClass(), "last", null);
        setField(term243630, term243630.getClass(), "propListHead", null);
        setIntField(term243630, term243630.getClass(), "sourcePosition", 0);
        setField(term243630, term243630.getClass(), "jsType", null);
        setField(term243630, term243630.getClass(), "parent", null);
        setField(term243620, term243620.getClass(), "first", term243630);
        setField(term243620, term243620.getClass(), "last", null);
        setField(term243620, term243620.getClass(), "propListHead", null);
        setIntField(term243620, term243620.getClass(), "sourcePosition", 0);
        setField(term243620, term243620.getClass(), "jsType", null);
        setField(term243620, term243620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term243108;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term243022, args);
        assertTrue(recursiveEquals(term243022, term243663));
        assertTrue(recursiveEquals(term243108, term243664));
        assertTrue(recursiveEquals(retValue, term243620));
    }

};



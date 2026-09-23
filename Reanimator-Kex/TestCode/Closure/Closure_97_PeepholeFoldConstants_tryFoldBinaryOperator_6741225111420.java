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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535392;
     Object term535484;
     Object term535700;
     Object term535701;
     Object term535655;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535392 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term535484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term535640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term535570, term535570.getClass(), "next", term535640);
        setField(term535484, term535484.getClass(), "first", term535570);
        setIntField(term535484, term535484.getClass(), "type", 24);
        term535700 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term535700, term535700.getClass(), "currentTraversal", null);
        term535701 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term535703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term535701, term535701.getClass(), "number", 0.0);
        setIntField(term535701, term535701.getClass(), "type", 24);
        setField(term535701, term535701.getClass(), "next", null);
        setField(term535702, term535702.getClass(), "functionName", null);
        setBooleanField(term535702, term535702.getClass(), "itsNeedsActivation", false);
        setIntField(term535702, term535702.getClass(), "itsFunctionType", 0);
        setBooleanField(term535702, term535702.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term535702, term535702.getClass(), "encodedSourceStart", 0);
        setIntField(term535702, term535702.getClass(), "encodedSourceEnd", 0);
        setField(term535702, term535702.getClass(), "sourceName", null);
        setIntField(term535702, term535702.getClass(), "baseLineno", 0);
        setIntField(term535702, term535702.getClass(), "endLineno", 0);
        setField(term535702, term535702.getClass(), "functions", null);
        setField(term535702, term535702.getClass(), "regexps", null);
        setField(term535702, term535702.getClass(), "itsVariables", null);
        setField(term535702, term535702.getClass(), "itsConst", null);
        setField(term535702, term535702.getClass(), "itsVariableNames", null);
        setIntField(term535702, term535702.getClass(), "varStart", 0);
        setField(term535702, term535702.getClass(), "compilerData", null);
        setIntField(term535702, term535702.getClass(), "type", 0);
        setIntField(term535703, term535703.getClass(), "type", 0);
        setField(term535703, term535703.getClass(), "next", null);
        setField(term535703, term535703.getClass(), "first", null);
        setField(term535703, term535703.getClass(), "last", null);
        setField(term535703, term535703.getClass(), "propListHead", null);
        setIntField(term535703, term535703.getClass(), "sourcePosition", 0);
        setField(term535703, term535703.getClass(), "jsType", null);
        setField(term535703, term535703.getClass(), "parent", null);
        setField(term535702, term535702.getClass(), "next", term535703);
        setField(term535702, term535702.getClass(), "first", null);
        setField(term535702, term535702.getClass(), "last", null);
        setField(term535702, term535702.getClass(), "propListHead", null);
        setIntField(term535702, term535702.getClass(), "sourcePosition", 0);
        setField(term535702, term535702.getClass(), "jsType", null);
        setField(term535702, term535702.getClass(), "parent", null);
        setField(term535701, term535701.getClass(), "first", term535702);
        setField(term535701, term535701.getClass(), "last", null);
        setField(term535701, term535701.getClass(), "propListHead", null);
        setIntField(term535701, term535701.getClass(), "sourcePosition", 0);
        setField(term535701, term535701.getClass(), "jsType", null);
        setField(term535701, term535701.getClass(), "parent", null);
        term535655 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term535658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term535668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term535655, term535655.getClass(), "number", 0.0);
        setIntField(term535655, term535655.getClass(), "type", 24);
        setField(term535655, term535655.getClass(), "next", null);
        setField(term535658, term535658.getClass(), "functionName", null);
        setBooleanField(term535658, term535658.getClass(), "itsNeedsActivation", false);
        setIntField(term535658, term535658.getClass(), "itsFunctionType", 0);
        setBooleanField(term535658, term535658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term535658, term535658.getClass(), "encodedSourceStart", 0);
        setIntField(term535658, term535658.getClass(), "encodedSourceEnd", 0);
        setField(term535658, term535658.getClass(), "sourceName", null);
        setIntField(term535658, term535658.getClass(), "baseLineno", 0);
        setIntField(term535658, term535658.getClass(), "endLineno", 0);
        setField(term535658, term535658.getClass(), "functions", null);
        setField(term535658, term535658.getClass(), "regexps", null);
        setField(term535658, term535658.getClass(), "itsVariables", null);
        setField(term535658, term535658.getClass(), "itsConst", null);
        setField(term535658, term535658.getClass(), "itsVariableNames", null);
        setIntField(term535658, term535658.getClass(), "varStart", 0);
        setField(term535658, term535658.getClass(), "compilerData", null);
        setIntField(term535658, term535658.getClass(), "type", 0);
        setIntField(term535668, term535668.getClass(), "type", 0);
        setField(term535668, term535668.getClass(), "next", null);
        setField(term535668, term535668.getClass(), "first", null);
        setField(term535668, term535668.getClass(), "last", null);
        setField(term535668, term535668.getClass(), "propListHead", null);
        setIntField(term535668, term535668.getClass(), "sourcePosition", 0);
        setField(term535668, term535668.getClass(), "jsType", null);
        setField(term535668, term535668.getClass(), "parent", null);
        setField(term535658, term535658.getClass(), "next", term535668);
        setField(term535658, term535658.getClass(), "first", null);
        setField(term535658, term535658.getClass(), "last", null);
        setField(term535658, term535658.getClass(), "propListHead", null);
        setIntField(term535658, term535658.getClass(), "sourcePosition", 0);
        setField(term535658, term535658.getClass(), "jsType", null);
        setField(term535658, term535658.getClass(), "parent", null);
        setField(term535655, term535655.getClass(), "first", term535658);
        setField(term535655, term535655.getClass(), "last", null);
        setField(term535655, term535655.getClass(), "propListHead", null);
        setIntField(term535655, term535655.getClass(), "sourcePosition", 0);
        setField(term535655, term535655.getClass(), "jsType", null);
        setField(term535655, term535655.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term535484;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term535392, args);
        assertTrue(recursiveEquals(term535392, term535700));
        assertTrue(recursiveEquals(term535484, term535701));
        assertTrue(recursiveEquals(retValue, term535655));
    }

};



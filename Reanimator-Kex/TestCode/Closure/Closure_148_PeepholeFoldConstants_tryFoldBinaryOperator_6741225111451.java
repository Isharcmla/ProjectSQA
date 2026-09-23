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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358799;
     Object term358885;
     Object term359657;
     Object term359658;
     Object term359591;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358799 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term358885 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term358971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term358971, term358971.getClass(), "next", term359041);
        setField(term358885, term358885.getClass(), "first", term358971);
        setIntField(term358885, term358885.getClass(), "type", 17);
        term359657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term359657, term359657.getClass(), "currentTraversal", null);
        term359658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term359658, term359658.getClass(), "functionName", null);
        setBooleanField(term359658, term359658.getClass(), "itsNeedsActivation", false);
        setIntField(term359658, term359658.getClass(), "itsFunctionType", 0);
        setBooleanField(term359658, term359658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359658, term359658.getClass(), "encodedSourceStart", 0);
        setIntField(term359658, term359658.getClass(), "encodedSourceEnd", 0);
        setField(term359658, term359658.getClass(), "sourceName", null);
        setIntField(term359658, term359658.getClass(), "baseLineno", 0);
        setIntField(term359658, term359658.getClass(), "endLineno", 0);
        setField(term359658, term359658.getClass(), "functions", null);
        setField(term359658, term359658.getClass(), "regexps", null);
        setField(term359658, term359658.getClass(), "itsVariables", null);
        setField(term359658, term359658.getClass(), "itsConst", null);
        setField(term359658, term359658.getClass(), "itsVariableNames", null);
        setIntField(term359658, term359658.getClass(), "varStart", 0);
        setField(term359658, term359658.getClass(), "compilerData", null);
        setIntField(term359658, term359658.getClass(), "type", 17);
        setField(term359658, term359658.getClass(), "next", null);
        setField(term359659, term359659.getClass(), "functionName", null);
        setBooleanField(term359659, term359659.getClass(), "itsNeedsActivation", false);
        setIntField(term359659, term359659.getClass(), "itsFunctionType", 0);
        setBooleanField(term359659, term359659.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359659, term359659.getClass(), "encodedSourceStart", 0);
        setIntField(term359659, term359659.getClass(), "encodedSourceEnd", 0);
        setField(term359659, term359659.getClass(), "sourceName", null);
        setIntField(term359659, term359659.getClass(), "baseLineno", 0);
        setIntField(term359659, term359659.getClass(), "endLineno", 0);
        setField(term359659, term359659.getClass(), "functions", null);
        setField(term359659, term359659.getClass(), "regexps", null);
        setField(term359659, term359659.getClass(), "itsVariables", null);
        setField(term359659, term359659.getClass(), "itsConst", null);
        setField(term359659, term359659.getClass(), "itsVariableNames", null);
        setIntField(term359659, term359659.getClass(), "varStart", 0);
        setField(term359659, term359659.getClass(), "compilerData", null);
        setIntField(term359659, term359659.getClass(), "type", 0);
        setIntField(term359660, term359660.getClass(), "type", 0);
        setField(term359660, term359660.getClass(), "next", null);
        setField(term359660, term359660.getClass(), "first", null);
        setField(term359660, term359660.getClass(), "last", null);
        setField(term359660, term359660.getClass(), "propListHead", null);
        setIntField(term359660, term359660.getClass(), "sourcePosition", 0);
        setField(term359660, term359660.getClass(), "jsType", null);
        setField(term359660, term359660.getClass(), "parent", null);
        setField(term359659, term359659.getClass(), "next", term359660);
        setField(term359659, term359659.getClass(), "first", null);
        setField(term359659, term359659.getClass(), "last", null);
        setField(term359659, term359659.getClass(), "propListHead", null);
        setIntField(term359659, term359659.getClass(), "sourcePosition", 0);
        setField(term359659, term359659.getClass(), "jsType", null);
        setField(term359659, term359659.getClass(), "parent", null);
        setField(term359658, term359658.getClass(), "first", term359659);
        setField(term359658, term359658.getClass(), "last", null);
        setField(term359658, term359658.getClass(), "propListHead", null);
        setIntField(term359658, term359658.getClass(), "sourcePosition", 0);
        setField(term359658, term359658.getClass(), "jsType", null);
        setField(term359658, term359658.getClass(), "parent", null);
        term359591 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term359611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term359591, term359591.getClass(), "functionName", null);
        setBooleanField(term359591, term359591.getClass(), "itsNeedsActivation", false);
        setIntField(term359591, term359591.getClass(), "itsFunctionType", 0);
        setBooleanField(term359591, term359591.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359591, term359591.getClass(), "encodedSourceStart", 0);
        setIntField(term359591, term359591.getClass(), "encodedSourceEnd", 0);
        setField(term359591, term359591.getClass(), "sourceName", null);
        setIntField(term359591, term359591.getClass(), "baseLineno", 0);
        setIntField(term359591, term359591.getClass(), "endLineno", 0);
        setField(term359591, term359591.getClass(), "functions", null);
        setField(term359591, term359591.getClass(), "regexps", null);
        setField(term359591, term359591.getClass(), "itsVariables", null);
        setField(term359591, term359591.getClass(), "itsConst", null);
        setField(term359591, term359591.getClass(), "itsVariableNames", null);
        setIntField(term359591, term359591.getClass(), "varStart", 0);
        setField(term359591, term359591.getClass(), "compilerData", null);
        setIntField(term359591, term359591.getClass(), "type", 17);
        setField(term359591, term359591.getClass(), "next", null);
        setField(term359601, term359601.getClass(), "functionName", null);
        setBooleanField(term359601, term359601.getClass(), "itsNeedsActivation", false);
        setIntField(term359601, term359601.getClass(), "itsFunctionType", 0);
        setBooleanField(term359601, term359601.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359601, term359601.getClass(), "encodedSourceStart", 0);
        setIntField(term359601, term359601.getClass(), "encodedSourceEnd", 0);
        setField(term359601, term359601.getClass(), "sourceName", null);
        setIntField(term359601, term359601.getClass(), "baseLineno", 0);
        setIntField(term359601, term359601.getClass(), "endLineno", 0);
        setField(term359601, term359601.getClass(), "functions", null);
        setField(term359601, term359601.getClass(), "regexps", null);
        setField(term359601, term359601.getClass(), "itsVariables", null);
        setField(term359601, term359601.getClass(), "itsConst", null);
        setField(term359601, term359601.getClass(), "itsVariableNames", null);
        setIntField(term359601, term359601.getClass(), "varStart", 0);
        setField(term359601, term359601.getClass(), "compilerData", null);
        setIntField(term359601, term359601.getClass(), "type", 0);
        setIntField(term359611, term359611.getClass(), "type", 0);
        setField(term359611, term359611.getClass(), "next", null);
        setField(term359611, term359611.getClass(), "first", null);
        setField(term359611, term359611.getClass(), "last", null);
        setField(term359611, term359611.getClass(), "propListHead", null);
        setIntField(term359611, term359611.getClass(), "sourcePosition", 0);
        setField(term359611, term359611.getClass(), "jsType", null);
        setField(term359611, term359611.getClass(), "parent", null);
        setField(term359601, term359601.getClass(), "next", term359611);
        setField(term359601, term359601.getClass(), "first", null);
        setField(term359601, term359601.getClass(), "last", null);
        setField(term359601, term359601.getClass(), "propListHead", null);
        setIntField(term359601, term359601.getClass(), "sourcePosition", 0);
        setField(term359601, term359601.getClass(), "jsType", null);
        setField(term359601, term359601.getClass(), "parent", null);
        setField(term359591, term359591.getClass(), "first", term359601);
        setField(term359591, term359591.getClass(), "last", null);
        setField(term359591, term359591.getClass(), "propListHead", null);
        setIntField(term359591, term359591.getClass(), "sourcePosition", 0);
        setField(term359591, term359591.getClass(), "jsType", null);
        setField(term359591, term359591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term358885;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term358799, args);
        assertTrue(recursiveEquals(term358799, term359657));
        assertTrue(recursiveEquals(term358885, term359658));
        assertTrue(recursiveEquals(retValue, term359591));
    }

};



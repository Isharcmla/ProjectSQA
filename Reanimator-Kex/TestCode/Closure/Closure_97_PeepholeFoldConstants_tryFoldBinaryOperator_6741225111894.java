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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724367;
     Object term724459;
     Object term724795;
     Object term724796;
     Object term724702;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724367 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term724459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term724545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term724545, term724545.getClass(), "next", term724631);
        setIntField(term724545, term724545.getClass(), "type", 0);
        setField(term724459, term724459.getClass(), "first", term724545);
        setIntField(term724459, term724459.getClass(), "type", 100);
        setField(term724459, term724459.getClass(), "parent", null);
        term724795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term724795, term724795.getClass(), "currentTraversal", null);
        term724796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term724797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term724796, term724796.getClass(), "str", null);
        setIntField(term724796, term724796.getClass(), "type", 100);
        setField(term724796, term724796.getClass(), "next", null);
        setField(term724797, term724797.getClass(), "functionName", null);
        setBooleanField(term724797, term724797.getClass(), "itsNeedsActivation", false);
        setIntField(term724797, term724797.getClass(), "itsFunctionType", 0);
        setBooleanField(term724797, term724797.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724797, term724797.getClass(), "encodedSourceStart", 0);
        setIntField(term724797, term724797.getClass(), "encodedSourceEnd", 0);
        setField(term724797, term724797.getClass(), "sourceName", null);
        setIntField(term724797, term724797.getClass(), "baseLineno", 0);
        setIntField(term724797, term724797.getClass(), "endLineno", 0);
        setField(term724797, term724797.getClass(), "functions", null);
        setField(term724797, term724797.getClass(), "regexps", null);
        setField(term724797, term724797.getClass(), "itsVariables", null);
        setField(term724797, term724797.getClass(), "itsConst", null);
        setField(term724797, term724797.getClass(), "itsVariableNames", null);
        setIntField(term724797, term724797.getClass(), "varStart", 0);
        setField(term724797, term724797.getClass(), "compilerData", null);
        setIntField(term724797, term724797.getClass(), "type", 0);
        setField(term724798, term724798.getClass(), "functionName", null);
        setBooleanField(term724798, term724798.getClass(), "itsNeedsActivation", false);
        setIntField(term724798, term724798.getClass(), "itsFunctionType", 0);
        setBooleanField(term724798, term724798.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724798, term724798.getClass(), "encodedSourceStart", 0);
        setIntField(term724798, term724798.getClass(), "encodedSourceEnd", 0);
        setField(term724798, term724798.getClass(), "sourceName", null);
        setIntField(term724798, term724798.getClass(), "baseLineno", 0);
        setIntField(term724798, term724798.getClass(), "endLineno", 0);
        setField(term724798, term724798.getClass(), "functions", null);
        setField(term724798, term724798.getClass(), "regexps", null);
        setField(term724798, term724798.getClass(), "itsVariables", null);
        setField(term724798, term724798.getClass(), "itsConst", null);
        setField(term724798, term724798.getClass(), "itsVariableNames", null);
        setIntField(term724798, term724798.getClass(), "varStart", 0);
        setField(term724798, term724798.getClass(), "compilerData", null);
        setIntField(term724798, term724798.getClass(), "type", 0);
        setField(term724798, term724798.getClass(), "next", null);
        setField(term724798, term724798.getClass(), "first", null);
        setField(term724798, term724798.getClass(), "last", null);
        setField(term724798, term724798.getClass(), "propListHead", null);
        setIntField(term724798, term724798.getClass(), "sourcePosition", 0);
        setField(term724798, term724798.getClass(), "jsType", null);
        setField(term724798, term724798.getClass(), "parent", null);
        setField(term724797, term724797.getClass(), "next", term724798);
        setField(term724797, term724797.getClass(), "first", null);
        setField(term724797, term724797.getClass(), "last", null);
        setField(term724797, term724797.getClass(), "propListHead", null);
        setIntField(term724797, term724797.getClass(), "sourcePosition", 0);
        setField(term724797, term724797.getClass(), "jsType", null);
        setField(term724797, term724797.getClass(), "parent", null);
        setField(term724796, term724796.getClass(), "first", term724797);
        setField(term724796, term724796.getClass(), "last", null);
        setField(term724796, term724796.getClass(), "propListHead", null);
        setIntField(term724796, term724796.getClass(), "sourcePosition", 0);
        setField(term724796, term724796.getClass(), "jsType", null);
        setField(term724796, term724796.getClass(), "parent", null);
        term724702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term724704 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term724702, term724702.getClass(), "str", null);
        setIntField(term724702, term724702.getClass(), "type", 100);
        setField(term724702, term724702.getClass(), "next", null);
        setField(term724704, term724704.getClass(), "functionName", null);
        setBooleanField(term724704, term724704.getClass(), "itsNeedsActivation", false);
        setIntField(term724704, term724704.getClass(), "itsFunctionType", 0);
        setBooleanField(term724704, term724704.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724704, term724704.getClass(), "encodedSourceStart", 0);
        setIntField(term724704, term724704.getClass(), "encodedSourceEnd", 0);
        setField(term724704, term724704.getClass(), "sourceName", null);
        setIntField(term724704, term724704.getClass(), "baseLineno", 0);
        setIntField(term724704, term724704.getClass(), "endLineno", 0);
        setField(term724704, term724704.getClass(), "functions", null);
        setField(term724704, term724704.getClass(), "regexps", null);
        setField(term724704, term724704.getClass(), "itsVariables", null);
        setField(term724704, term724704.getClass(), "itsConst", null);
        setField(term724704, term724704.getClass(), "itsVariableNames", null);
        setIntField(term724704, term724704.getClass(), "varStart", 0);
        setField(term724704, term724704.getClass(), "compilerData", null);
        setIntField(term724704, term724704.getClass(), "type", 0);
        setField(term724714, term724714.getClass(), "functionName", null);
        setBooleanField(term724714, term724714.getClass(), "itsNeedsActivation", false);
        setIntField(term724714, term724714.getClass(), "itsFunctionType", 0);
        setBooleanField(term724714, term724714.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724714, term724714.getClass(), "encodedSourceStart", 0);
        setIntField(term724714, term724714.getClass(), "encodedSourceEnd", 0);
        setField(term724714, term724714.getClass(), "sourceName", null);
        setIntField(term724714, term724714.getClass(), "baseLineno", 0);
        setIntField(term724714, term724714.getClass(), "endLineno", 0);
        setField(term724714, term724714.getClass(), "functions", null);
        setField(term724714, term724714.getClass(), "regexps", null);
        setField(term724714, term724714.getClass(), "itsVariables", null);
        setField(term724714, term724714.getClass(), "itsConst", null);
        setField(term724714, term724714.getClass(), "itsVariableNames", null);
        setIntField(term724714, term724714.getClass(), "varStart", 0);
        setField(term724714, term724714.getClass(), "compilerData", null);
        setIntField(term724714, term724714.getClass(), "type", 0);
        setField(term724714, term724714.getClass(), "next", null);
        setField(term724714, term724714.getClass(), "first", null);
        setField(term724714, term724714.getClass(), "last", null);
        setField(term724714, term724714.getClass(), "propListHead", null);
        setIntField(term724714, term724714.getClass(), "sourcePosition", 0);
        setField(term724714, term724714.getClass(), "jsType", null);
        setField(term724714, term724714.getClass(), "parent", null);
        setField(term724704, term724704.getClass(), "next", term724714);
        setField(term724704, term724704.getClass(), "first", null);
        setField(term724704, term724704.getClass(), "last", null);
        setField(term724704, term724704.getClass(), "propListHead", null);
        setIntField(term724704, term724704.getClass(), "sourcePosition", 0);
        setField(term724704, term724704.getClass(), "jsType", null);
        setField(term724704, term724704.getClass(), "parent", null);
        setField(term724702, term724702.getClass(), "first", term724704);
        setField(term724702, term724702.getClass(), "last", null);
        setField(term724702, term724702.getClass(), "propListHead", null);
        setIntField(term724702, term724702.getClass(), "sourcePosition", 0);
        setField(term724702, term724702.getClass(), "jsType", null);
        setField(term724702, term724702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term724459;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term724367, args);
        assertTrue(recursiveEquals(term724367, term724795));
        assertTrue(recursiveEquals(term724459, term724796));
        assertTrue(recursiveEquals(retValue, term724702));
    }

};



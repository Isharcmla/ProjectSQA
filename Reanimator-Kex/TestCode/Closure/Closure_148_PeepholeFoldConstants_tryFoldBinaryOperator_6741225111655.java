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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424009;
     Object term424101;
     Object term424868;
     Object term424869;
     Object term424796;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term424101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term424187 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term424257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term424187, term424187.getClass(), "next", term424257);
        setField(term424101, term424101.getClass(), "first", term424187);
        setIntField(term424101, term424101.getClass(), "type", 21);
        term424868 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term424868, term424868.getClass(), "currentTraversal", null);
        term424869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term424870 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term424871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term424869, term424869.getClass(), "str", null);
        setIntField(term424869, term424869.getClass(), "type", 21);
        setField(term424869, term424869.getClass(), "next", null);
        setField(term424870, term424870.getClass(), "functionName", null);
        setBooleanField(term424870, term424870.getClass(), "itsNeedsActivation", false);
        setIntField(term424870, term424870.getClass(), "itsFunctionType", 0);
        setBooleanField(term424870, term424870.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term424870, term424870.getClass(), "encodedSourceStart", 0);
        setIntField(term424870, term424870.getClass(), "encodedSourceEnd", 0);
        setField(term424870, term424870.getClass(), "sourceName", null);
        setIntField(term424870, term424870.getClass(), "baseLineno", 0);
        setIntField(term424870, term424870.getClass(), "endLineno", 0);
        setField(term424870, term424870.getClass(), "functions", null);
        setField(term424870, term424870.getClass(), "regexps", null);
        setField(term424870, term424870.getClass(), "itsVariables", null);
        setField(term424870, term424870.getClass(), "itsConst", null);
        setField(term424870, term424870.getClass(), "itsVariableNames", null);
        setIntField(term424870, term424870.getClass(), "varStart", 0);
        setField(term424870, term424870.getClass(), "compilerData", null);
        setIntField(term424870, term424870.getClass(), "type", 0);
        setIntField(term424871, term424871.getClass(), "type", 0);
        setField(term424871, term424871.getClass(), "next", null);
        setField(term424871, term424871.getClass(), "first", null);
        setField(term424871, term424871.getClass(), "last", null);
        setField(term424871, term424871.getClass(), "propListHead", null);
        setIntField(term424871, term424871.getClass(), "sourcePosition", 0);
        setField(term424871, term424871.getClass(), "jsType", null);
        setField(term424871, term424871.getClass(), "parent", null);
        setField(term424870, term424870.getClass(), "next", term424871);
        setField(term424870, term424870.getClass(), "first", null);
        setField(term424870, term424870.getClass(), "last", null);
        setField(term424870, term424870.getClass(), "propListHead", null);
        setIntField(term424870, term424870.getClass(), "sourcePosition", 0);
        setField(term424870, term424870.getClass(), "jsType", null);
        setField(term424870, term424870.getClass(), "parent", null);
        setField(term424869, term424869.getClass(), "first", term424870);
        setField(term424869, term424869.getClass(), "last", null);
        setField(term424869, term424869.getClass(), "propListHead", null);
        setIntField(term424869, term424869.getClass(), "sourcePosition", 0);
        setField(term424869, term424869.getClass(), "jsType", null);
        setField(term424869, term424869.getClass(), "parent", null);
        term424796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term424798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term424808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term424796, term424796.getClass(), "str", null);
        setIntField(term424796, term424796.getClass(), "type", 21);
        setField(term424796, term424796.getClass(), "next", null);
        setField(term424798, term424798.getClass(), "functionName", null);
        setBooleanField(term424798, term424798.getClass(), "itsNeedsActivation", false);
        setIntField(term424798, term424798.getClass(), "itsFunctionType", 0);
        setBooleanField(term424798, term424798.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term424798, term424798.getClass(), "encodedSourceStart", 0);
        setIntField(term424798, term424798.getClass(), "encodedSourceEnd", 0);
        setField(term424798, term424798.getClass(), "sourceName", null);
        setIntField(term424798, term424798.getClass(), "baseLineno", 0);
        setIntField(term424798, term424798.getClass(), "endLineno", 0);
        setField(term424798, term424798.getClass(), "functions", null);
        setField(term424798, term424798.getClass(), "regexps", null);
        setField(term424798, term424798.getClass(), "itsVariables", null);
        setField(term424798, term424798.getClass(), "itsConst", null);
        setField(term424798, term424798.getClass(), "itsVariableNames", null);
        setIntField(term424798, term424798.getClass(), "varStart", 0);
        setField(term424798, term424798.getClass(), "compilerData", null);
        setIntField(term424798, term424798.getClass(), "type", 0);
        setIntField(term424808, term424808.getClass(), "type", 0);
        setField(term424808, term424808.getClass(), "next", null);
        setField(term424808, term424808.getClass(), "first", null);
        setField(term424808, term424808.getClass(), "last", null);
        setField(term424808, term424808.getClass(), "propListHead", null);
        setIntField(term424808, term424808.getClass(), "sourcePosition", 0);
        setField(term424808, term424808.getClass(), "jsType", null);
        setField(term424808, term424808.getClass(), "parent", null);
        setField(term424798, term424798.getClass(), "next", term424808);
        setField(term424798, term424798.getClass(), "first", null);
        setField(term424798, term424798.getClass(), "last", null);
        setField(term424798, term424798.getClass(), "propListHead", null);
        setIntField(term424798, term424798.getClass(), "sourcePosition", 0);
        setField(term424798, term424798.getClass(), "jsType", null);
        setField(term424798, term424798.getClass(), "parent", null);
        setField(term424796, term424796.getClass(), "first", term424798);
        setField(term424796, term424796.getClass(), "last", null);
        setField(term424796, term424796.getClass(), "propListHead", null);
        setIntField(term424796, term424796.getClass(), "sourcePosition", 0);
        setField(term424796, term424796.getClass(), "jsType", null);
        setField(term424796, term424796.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term424101;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term424009, args);
        assertTrue(recursiveEquals(term424009, term424868));
        assertTrue(recursiveEquals(term424101, term424869));
        assertTrue(recursiveEquals(retValue, term424796));
    }

};



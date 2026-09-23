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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568576;
     Object term568668;
     Object term568884;
     Object term568885;
     Object term568839;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568576 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term568668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568754 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term568754, term568754.getClass(), "next", term568824);
        setField(term568668, term568668.getClass(), "first", term568754);
        setIntField(term568668, term568668.getClass(), "type", 18);
        term568884 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term568884, term568884.getClass(), "currentTraversal", null);
        term568885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568886 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term568885, term568885.getClass(), "number", 0.0);
        setIntField(term568885, term568885.getClass(), "type", 18);
        setField(term568885, term568885.getClass(), "next", null);
        setField(term568886, term568886.getClass(), "functionName", null);
        setBooleanField(term568886, term568886.getClass(), "itsNeedsActivation", false);
        setIntField(term568886, term568886.getClass(), "itsFunctionType", 0);
        setBooleanField(term568886, term568886.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568886, term568886.getClass(), "encodedSourceStart", 0);
        setIntField(term568886, term568886.getClass(), "encodedSourceEnd", 0);
        setField(term568886, term568886.getClass(), "sourceName", null);
        setIntField(term568886, term568886.getClass(), "baseLineno", 0);
        setIntField(term568886, term568886.getClass(), "endLineno", 0);
        setField(term568886, term568886.getClass(), "functions", null);
        setField(term568886, term568886.getClass(), "regexps", null);
        setField(term568886, term568886.getClass(), "itsVariables", null);
        setField(term568886, term568886.getClass(), "itsConst", null);
        setField(term568886, term568886.getClass(), "itsVariableNames", null);
        setIntField(term568886, term568886.getClass(), "varStart", 0);
        setField(term568886, term568886.getClass(), "compilerData", null);
        setIntField(term568886, term568886.getClass(), "type", 0);
        setIntField(term568887, term568887.getClass(), "type", 0);
        setField(term568887, term568887.getClass(), "next", null);
        setField(term568887, term568887.getClass(), "first", null);
        setField(term568887, term568887.getClass(), "last", null);
        setField(term568887, term568887.getClass(), "propListHead", null);
        setIntField(term568887, term568887.getClass(), "sourcePosition", 0);
        setField(term568887, term568887.getClass(), "jsType", null);
        setField(term568887, term568887.getClass(), "parent", null);
        setField(term568886, term568886.getClass(), "next", term568887);
        setField(term568886, term568886.getClass(), "first", null);
        setField(term568886, term568886.getClass(), "last", null);
        setField(term568886, term568886.getClass(), "propListHead", null);
        setIntField(term568886, term568886.getClass(), "sourcePosition", 0);
        setField(term568886, term568886.getClass(), "jsType", null);
        setField(term568886, term568886.getClass(), "parent", null);
        setField(term568885, term568885.getClass(), "first", term568886);
        setField(term568885, term568885.getClass(), "last", null);
        setField(term568885, term568885.getClass(), "propListHead", null);
        setIntField(term568885, term568885.getClass(), "sourcePosition", 0);
        setField(term568885, term568885.getClass(), "jsType", null);
        setField(term568885, term568885.getClass(), "parent", null);
        term568839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term568842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term568852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term568839, term568839.getClass(), "number", 0.0);
        setIntField(term568839, term568839.getClass(), "type", 18);
        setField(term568839, term568839.getClass(), "next", null);
        setField(term568842, term568842.getClass(), "functionName", null);
        setBooleanField(term568842, term568842.getClass(), "itsNeedsActivation", false);
        setIntField(term568842, term568842.getClass(), "itsFunctionType", 0);
        setBooleanField(term568842, term568842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term568842, term568842.getClass(), "encodedSourceStart", 0);
        setIntField(term568842, term568842.getClass(), "encodedSourceEnd", 0);
        setField(term568842, term568842.getClass(), "sourceName", null);
        setIntField(term568842, term568842.getClass(), "baseLineno", 0);
        setIntField(term568842, term568842.getClass(), "endLineno", 0);
        setField(term568842, term568842.getClass(), "functions", null);
        setField(term568842, term568842.getClass(), "regexps", null);
        setField(term568842, term568842.getClass(), "itsVariables", null);
        setField(term568842, term568842.getClass(), "itsConst", null);
        setField(term568842, term568842.getClass(), "itsVariableNames", null);
        setIntField(term568842, term568842.getClass(), "varStart", 0);
        setField(term568842, term568842.getClass(), "compilerData", null);
        setIntField(term568842, term568842.getClass(), "type", 0);
        setIntField(term568852, term568852.getClass(), "type", 0);
        setField(term568852, term568852.getClass(), "next", null);
        setField(term568852, term568852.getClass(), "first", null);
        setField(term568852, term568852.getClass(), "last", null);
        setField(term568852, term568852.getClass(), "propListHead", null);
        setIntField(term568852, term568852.getClass(), "sourcePosition", 0);
        setField(term568852, term568852.getClass(), "jsType", null);
        setField(term568852, term568852.getClass(), "parent", null);
        setField(term568842, term568842.getClass(), "next", term568852);
        setField(term568842, term568842.getClass(), "first", null);
        setField(term568842, term568842.getClass(), "last", null);
        setField(term568842, term568842.getClass(), "propListHead", null);
        setIntField(term568842, term568842.getClass(), "sourcePosition", 0);
        setField(term568842, term568842.getClass(), "jsType", null);
        setField(term568842, term568842.getClass(), "parent", null);
        setField(term568839, term568839.getClass(), "first", term568842);
        setField(term568839, term568839.getClass(), "last", null);
        setField(term568839, term568839.getClass(), "propListHead", null);
        setIntField(term568839, term568839.getClass(), "sourcePosition", 0);
        setField(term568839, term568839.getClass(), "jsType", null);
        setField(term568839, term568839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term568668;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term568576, args);
        assertTrue(recursiveEquals(term568576, term568884));
        assertTrue(recursiveEquals(term568668, term568885));
        assertTrue(recursiveEquals(retValue, term568839));
    }

};



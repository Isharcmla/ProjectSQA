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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70544;
     Object term70630;
     Object term70913;
     Object term70914;
     Object term70847;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term70630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70716, term70716.getClass(), "next", term70786);
        setField(term70630, term70630.getClass(), "first", term70716);
        setIntField(term70630, term70630.getClass(), "type", 13);
        term70913 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term70913, term70913.getClass(), "currentTraversal", null);
        term70914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70914, term70914.getClass(), "functionName", null);
        setBooleanField(term70914, term70914.getClass(), "itsNeedsActivation", false);
        setIntField(term70914, term70914.getClass(), "itsFunctionType", 0);
        setBooleanField(term70914, term70914.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70914, term70914.getClass(), "encodedSourceStart", 0);
        setIntField(term70914, term70914.getClass(), "encodedSourceEnd", 0);
        setField(term70914, term70914.getClass(), "sourceName", null);
        setIntField(term70914, term70914.getClass(), "baseLineno", 0);
        setIntField(term70914, term70914.getClass(), "endLineno", 0);
        setField(term70914, term70914.getClass(), "functions", null);
        setField(term70914, term70914.getClass(), "regexps", null);
        setField(term70914, term70914.getClass(), "itsVariables", null);
        setField(term70914, term70914.getClass(), "itsConst", null);
        setField(term70914, term70914.getClass(), "itsVariableNames", null);
        setIntField(term70914, term70914.getClass(), "varStart", 0);
        setField(term70914, term70914.getClass(), "compilerData", null);
        setIntField(term70914, term70914.getClass(), "type", 13);
        setField(term70914, term70914.getClass(), "next", null);
        setField(term70915, term70915.getClass(), "functionName", null);
        setBooleanField(term70915, term70915.getClass(), "itsNeedsActivation", false);
        setIntField(term70915, term70915.getClass(), "itsFunctionType", 0);
        setBooleanField(term70915, term70915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70915, term70915.getClass(), "encodedSourceStart", 0);
        setIntField(term70915, term70915.getClass(), "encodedSourceEnd", 0);
        setField(term70915, term70915.getClass(), "sourceName", null);
        setIntField(term70915, term70915.getClass(), "baseLineno", 0);
        setIntField(term70915, term70915.getClass(), "endLineno", 0);
        setField(term70915, term70915.getClass(), "functions", null);
        setField(term70915, term70915.getClass(), "regexps", null);
        setField(term70915, term70915.getClass(), "itsVariables", null);
        setField(term70915, term70915.getClass(), "itsConst", null);
        setField(term70915, term70915.getClass(), "itsVariableNames", null);
        setIntField(term70915, term70915.getClass(), "varStart", 0);
        setField(term70915, term70915.getClass(), "compilerData", null);
        setIntField(term70915, term70915.getClass(), "type", 0);
        setIntField(term70916, term70916.getClass(), "type", 0);
        setField(term70916, term70916.getClass(), "next", null);
        setField(term70916, term70916.getClass(), "first", null);
        setField(term70916, term70916.getClass(), "last", null);
        setField(term70916, term70916.getClass(), "propListHead", null);
        setIntField(term70916, term70916.getClass(), "sourcePosition", 0);
        setField(term70916, term70916.getClass(), "jsType", null);
        setField(term70916, term70916.getClass(), "parent", null);
        setField(term70915, term70915.getClass(), "next", term70916);
        setField(term70915, term70915.getClass(), "first", null);
        setField(term70915, term70915.getClass(), "last", null);
        setField(term70915, term70915.getClass(), "propListHead", null);
        setIntField(term70915, term70915.getClass(), "sourcePosition", 0);
        setField(term70915, term70915.getClass(), "jsType", null);
        setField(term70915, term70915.getClass(), "parent", null);
        setField(term70914, term70914.getClass(), "first", term70915);
        setField(term70914, term70914.getClass(), "last", null);
        setField(term70914, term70914.getClass(), "propListHead", null);
        setIntField(term70914, term70914.getClass(), "sourcePosition", 0);
        setField(term70914, term70914.getClass(), "jsType", null);
        setField(term70914, term70914.getClass(), "parent", null);
        term70847 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70847, term70847.getClass(), "functionName", null);
        setBooleanField(term70847, term70847.getClass(), "itsNeedsActivation", false);
        setIntField(term70847, term70847.getClass(), "itsFunctionType", 0);
        setBooleanField(term70847, term70847.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70847, term70847.getClass(), "encodedSourceStart", 0);
        setIntField(term70847, term70847.getClass(), "encodedSourceEnd", 0);
        setField(term70847, term70847.getClass(), "sourceName", null);
        setIntField(term70847, term70847.getClass(), "baseLineno", 0);
        setIntField(term70847, term70847.getClass(), "endLineno", 0);
        setField(term70847, term70847.getClass(), "functions", null);
        setField(term70847, term70847.getClass(), "regexps", null);
        setField(term70847, term70847.getClass(), "itsVariables", null);
        setField(term70847, term70847.getClass(), "itsConst", null);
        setField(term70847, term70847.getClass(), "itsVariableNames", null);
        setIntField(term70847, term70847.getClass(), "varStart", 0);
        setField(term70847, term70847.getClass(), "compilerData", null);
        setIntField(term70847, term70847.getClass(), "type", 13);
        setField(term70847, term70847.getClass(), "next", null);
        setField(term70857, term70857.getClass(), "functionName", null);
        setBooleanField(term70857, term70857.getClass(), "itsNeedsActivation", false);
        setIntField(term70857, term70857.getClass(), "itsFunctionType", 0);
        setBooleanField(term70857, term70857.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70857, term70857.getClass(), "encodedSourceStart", 0);
        setIntField(term70857, term70857.getClass(), "encodedSourceEnd", 0);
        setField(term70857, term70857.getClass(), "sourceName", null);
        setIntField(term70857, term70857.getClass(), "baseLineno", 0);
        setIntField(term70857, term70857.getClass(), "endLineno", 0);
        setField(term70857, term70857.getClass(), "functions", null);
        setField(term70857, term70857.getClass(), "regexps", null);
        setField(term70857, term70857.getClass(), "itsVariables", null);
        setField(term70857, term70857.getClass(), "itsConst", null);
        setField(term70857, term70857.getClass(), "itsVariableNames", null);
        setIntField(term70857, term70857.getClass(), "varStart", 0);
        setField(term70857, term70857.getClass(), "compilerData", null);
        setIntField(term70857, term70857.getClass(), "type", 0);
        setIntField(term70867, term70867.getClass(), "type", 0);
        setField(term70867, term70867.getClass(), "next", null);
        setField(term70867, term70867.getClass(), "first", null);
        setField(term70867, term70867.getClass(), "last", null);
        setField(term70867, term70867.getClass(), "propListHead", null);
        setIntField(term70867, term70867.getClass(), "sourcePosition", 0);
        setField(term70867, term70867.getClass(), "jsType", null);
        setField(term70867, term70867.getClass(), "parent", null);
        setField(term70857, term70857.getClass(), "next", term70867);
        setField(term70857, term70857.getClass(), "first", null);
        setField(term70857, term70857.getClass(), "last", null);
        setField(term70857, term70857.getClass(), "propListHead", null);
        setIntField(term70857, term70857.getClass(), "sourcePosition", 0);
        setField(term70857, term70857.getClass(), "jsType", null);
        setField(term70857, term70857.getClass(), "parent", null);
        setField(term70847, term70847.getClass(), "first", term70857);
        setField(term70847, term70847.getClass(), "last", null);
        setField(term70847, term70847.getClass(), "propListHead", null);
        setIntField(term70847, term70847.getClass(), "sourcePosition", 0);
        setField(term70847, term70847.getClass(), "jsType", null);
        setField(term70847, term70847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term70630;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term70544, args);
        assertTrue(recursiveEquals(term70544, term70913));
        assertTrue(recursiveEquals(term70630, term70914));
        assertTrue(recursiveEquals(retValue, term70847));
    }

};



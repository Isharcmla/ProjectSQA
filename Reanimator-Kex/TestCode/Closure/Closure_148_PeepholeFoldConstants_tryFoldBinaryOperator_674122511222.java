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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42029;
     Object term42115;
     Object term42306;
     Object term42307;
     Object term42243;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42029 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42115, term42115.getClass(), "first", term42115);
        setField(term42115, term42115.getClass(), "next", term42185);
        setIntField(term42115, term42115.getClass(), "type", 21);
        term42306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42306, term42306.getClass(), "currentTraversal", null);
        term42307 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42307, term42307.getClass(), "functionName", null);
        setBooleanField(term42307, term42307.getClass(), "itsNeedsActivation", false);
        setIntField(term42307, term42307.getClass(), "itsFunctionType", 0);
        setBooleanField(term42307, term42307.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42307, term42307.getClass(), "encodedSourceStart", 0);
        setIntField(term42307, term42307.getClass(), "encodedSourceEnd", 0);
        setField(term42307, term42307.getClass(), "sourceName", null);
        setIntField(term42307, term42307.getClass(), "baseLineno", 0);
        setIntField(term42307, term42307.getClass(), "endLineno", 0);
        setField(term42307, term42307.getClass(), "functions", null);
        setField(term42307, term42307.getClass(), "regexps", null);
        setField(term42307, term42307.getClass(), "itsVariables", null);
        setField(term42307, term42307.getClass(), "itsConst", null);
        setField(term42307, term42307.getClass(), "itsVariableNames", null);
        setIntField(term42307, term42307.getClass(), "varStart", 0);
        setField(term42307, term42307.getClass(), "compilerData", null);
        setIntField(term42307, term42307.getClass(), "type", 21);
        setIntField(term42308, term42308.getClass(), "type", 0);
        setField(term42308, term42308.getClass(), "next", null);
        setField(term42308, term42308.getClass(), "first", null);
        setField(term42308, term42308.getClass(), "last", null);
        setField(term42308, term42308.getClass(), "propListHead", null);
        setIntField(term42308, term42308.getClass(), "sourcePosition", 0);
        setField(term42308, term42308.getClass(), "jsType", null);
        setField(term42308, term42308.getClass(), "parent", null);
        setField(term42307, term42307.getClass(), "next", term42308);
        setField(term42307, term42307.getClass(), "first", term42307);
        setField(term42307, term42307.getClass(), "last", null);
        setField(term42307, term42307.getClass(), "propListHead", null);
        setIntField(term42307, term42307.getClass(), "sourcePosition", 0);
        setField(term42307, term42307.getClass(), "jsType", null);
        setField(term42307, term42307.getClass(), "parent", null);
        term42243 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term42253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42243, term42243.getClass(), "functionName", null);
        setBooleanField(term42243, term42243.getClass(), "itsNeedsActivation", false);
        setIntField(term42243, term42243.getClass(), "itsFunctionType", 0);
        setBooleanField(term42243, term42243.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42243, term42243.getClass(), "encodedSourceStart", 0);
        setIntField(term42243, term42243.getClass(), "encodedSourceEnd", 0);
        setField(term42243, term42243.getClass(), "sourceName", null);
        setIntField(term42243, term42243.getClass(), "baseLineno", 0);
        setIntField(term42243, term42243.getClass(), "endLineno", 0);
        setField(term42243, term42243.getClass(), "functions", null);
        setField(term42243, term42243.getClass(), "regexps", null);
        setField(term42243, term42243.getClass(), "itsVariables", null);
        setField(term42243, term42243.getClass(), "itsConst", null);
        setField(term42243, term42243.getClass(), "itsVariableNames", null);
        setIntField(term42243, term42243.getClass(), "varStart", 0);
        setField(term42243, term42243.getClass(), "compilerData", null);
        setIntField(term42243, term42243.getClass(), "type", 21);
        setIntField(term42253, term42253.getClass(), "type", 0);
        setField(term42253, term42253.getClass(), "next", null);
        setField(term42253, term42253.getClass(), "first", null);
        setField(term42253, term42253.getClass(), "last", null);
        setField(term42253, term42253.getClass(), "propListHead", null);
        setIntField(term42253, term42253.getClass(), "sourcePosition", 0);
        setField(term42253, term42253.getClass(), "jsType", null);
        setField(term42253, term42253.getClass(), "parent", null);
        setField(term42243, term42243.getClass(), "next", term42253);
        setField(term42243, term42243.getClass(), "first", term42243);
        setField(term42243, term42243.getClass(), "last", null);
        setField(term42243, term42243.getClass(), "propListHead", null);
        setIntField(term42243, term42243.getClass(), "sourcePosition", 0);
        setField(term42243, term42243.getClass(), "jsType", null);
        setField(term42243, term42243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42115;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term42029, args);
        assertTrue(recursiveEquals(term42029, term42306));
        assertTrue(recursiveEquals(term42115, term42307));
        assertTrue(recursiveEquals(retValue, term42243));
    }

};



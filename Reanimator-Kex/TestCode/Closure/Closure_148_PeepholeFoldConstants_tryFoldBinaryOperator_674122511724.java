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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161133;
     Object term161219;
     Object term162171;
     Object term162172;
     Object term162105;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161133 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term161219 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161305 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term161305, term161305.getClass(), "next", term161375);
        setField(term161219, term161219.getClass(), "first", term161305);
        setIntField(term161219, term161219.getClass(), "type", 45);
        term162171 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term162171, term162171.getClass(), "currentTraversal", null);
        term162172 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162172, term162172.getClass(), "functionName", null);
        setBooleanField(term162172, term162172.getClass(), "itsNeedsActivation", false);
        setIntField(term162172, term162172.getClass(), "itsFunctionType", 0);
        setBooleanField(term162172, term162172.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162172, term162172.getClass(), "encodedSourceStart", 0);
        setIntField(term162172, term162172.getClass(), "encodedSourceEnd", 0);
        setField(term162172, term162172.getClass(), "sourceName", null);
        setIntField(term162172, term162172.getClass(), "baseLineno", 0);
        setIntField(term162172, term162172.getClass(), "endLineno", 0);
        setField(term162172, term162172.getClass(), "functions", null);
        setField(term162172, term162172.getClass(), "regexps", null);
        setField(term162172, term162172.getClass(), "itsVariables", null);
        setField(term162172, term162172.getClass(), "itsConst", null);
        setField(term162172, term162172.getClass(), "itsVariableNames", null);
        setIntField(term162172, term162172.getClass(), "varStart", 0);
        setField(term162172, term162172.getClass(), "compilerData", null);
        setIntField(term162172, term162172.getClass(), "type", 45);
        setField(term162172, term162172.getClass(), "next", null);
        setField(term162173, term162173.getClass(), "functionName", null);
        setBooleanField(term162173, term162173.getClass(), "itsNeedsActivation", false);
        setIntField(term162173, term162173.getClass(), "itsFunctionType", 0);
        setBooleanField(term162173, term162173.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162173, term162173.getClass(), "encodedSourceStart", 0);
        setIntField(term162173, term162173.getClass(), "encodedSourceEnd", 0);
        setField(term162173, term162173.getClass(), "sourceName", null);
        setIntField(term162173, term162173.getClass(), "baseLineno", 0);
        setIntField(term162173, term162173.getClass(), "endLineno", 0);
        setField(term162173, term162173.getClass(), "functions", null);
        setField(term162173, term162173.getClass(), "regexps", null);
        setField(term162173, term162173.getClass(), "itsVariables", null);
        setField(term162173, term162173.getClass(), "itsConst", null);
        setField(term162173, term162173.getClass(), "itsVariableNames", null);
        setIntField(term162173, term162173.getClass(), "varStart", 0);
        setField(term162173, term162173.getClass(), "compilerData", null);
        setIntField(term162173, term162173.getClass(), "type", 0);
        setIntField(term162174, term162174.getClass(), "type", 0);
        setField(term162174, term162174.getClass(), "next", null);
        setField(term162174, term162174.getClass(), "first", null);
        setField(term162174, term162174.getClass(), "last", null);
        setField(term162174, term162174.getClass(), "propListHead", null);
        setIntField(term162174, term162174.getClass(), "sourcePosition", 0);
        setField(term162174, term162174.getClass(), "jsType", null);
        setField(term162174, term162174.getClass(), "parent", null);
        setField(term162173, term162173.getClass(), "next", term162174);
        setField(term162173, term162173.getClass(), "first", null);
        setField(term162173, term162173.getClass(), "last", null);
        setField(term162173, term162173.getClass(), "propListHead", null);
        setIntField(term162173, term162173.getClass(), "sourcePosition", 0);
        setField(term162173, term162173.getClass(), "jsType", null);
        setField(term162173, term162173.getClass(), "parent", null);
        setField(term162172, term162172.getClass(), "first", term162173);
        setField(term162172, term162172.getClass(), "last", null);
        setField(term162172, term162172.getClass(), "propListHead", null);
        setIntField(term162172, term162172.getClass(), "sourcePosition", 0);
        setField(term162172, term162172.getClass(), "jsType", null);
        setField(term162172, term162172.getClass(), "parent", null);
        term162105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162105, term162105.getClass(), "functionName", null);
        setBooleanField(term162105, term162105.getClass(), "itsNeedsActivation", false);
        setIntField(term162105, term162105.getClass(), "itsFunctionType", 0);
        setBooleanField(term162105, term162105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162105, term162105.getClass(), "encodedSourceStart", 0);
        setIntField(term162105, term162105.getClass(), "encodedSourceEnd", 0);
        setField(term162105, term162105.getClass(), "sourceName", null);
        setIntField(term162105, term162105.getClass(), "baseLineno", 0);
        setIntField(term162105, term162105.getClass(), "endLineno", 0);
        setField(term162105, term162105.getClass(), "functions", null);
        setField(term162105, term162105.getClass(), "regexps", null);
        setField(term162105, term162105.getClass(), "itsVariables", null);
        setField(term162105, term162105.getClass(), "itsConst", null);
        setField(term162105, term162105.getClass(), "itsVariableNames", null);
        setIntField(term162105, term162105.getClass(), "varStart", 0);
        setField(term162105, term162105.getClass(), "compilerData", null);
        setIntField(term162105, term162105.getClass(), "type", 45);
        setField(term162105, term162105.getClass(), "next", null);
        setField(term162115, term162115.getClass(), "functionName", null);
        setBooleanField(term162115, term162115.getClass(), "itsNeedsActivation", false);
        setIntField(term162115, term162115.getClass(), "itsFunctionType", 0);
        setBooleanField(term162115, term162115.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162115, term162115.getClass(), "encodedSourceStart", 0);
        setIntField(term162115, term162115.getClass(), "encodedSourceEnd", 0);
        setField(term162115, term162115.getClass(), "sourceName", null);
        setIntField(term162115, term162115.getClass(), "baseLineno", 0);
        setIntField(term162115, term162115.getClass(), "endLineno", 0);
        setField(term162115, term162115.getClass(), "functions", null);
        setField(term162115, term162115.getClass(), "regexps", null);
        setField(term162115, term162115.getClass(), "itsVariables", null);
        setField(term162115, term162115.getClass(), "itsConst", null);
        setField(term162115, term162115.getClass(), "itsVariableNames", null);
        setIntField(term162115, term162115.getClass(), "varStart", 0);
        setField(term162115, term162115.getClass(), "compilerData", null);
        setIntField(term162115, term162115.getClass(), "type", 0);
        setIntField(term162125, term162125.getClass(), "type", 0);
        setField(term162125, term162125.getClass(), "next", null);
        setField(term162125, term162125.getClass(), "first", null);
        setField(term162125, term162125.getClass(), "last", null);
        setField(term162125, term162125.getClass(), "propListHead", null);
        setIntField(term162125, term162125.getClass(), "sourcePosition", 0);
        setField(term162125, term162125.getClass(), "jsType", null);
        setField(term162125, term162125.getClass(), "parent", null);
        setField(term162115, term162115.getClass(), "next", term162125);
        setField(term162115, term162115.getClass(), "first", null);
        setField(term162115, term162115.getClass(), "last", null);
        setField(term162115, term162115.getClass(), "propListHead", null);
        setIntField(term162115, term162115.getClass(), "sourcePosition", 0);
        setField(term162115, term162115.getClass(), "jsType", null);
        setField(term162115, term162115.getClass(), "parent", null);
        setField(term162105, term162105.getClass(), "first", term162115);
        setField(term162105, term162105.getClass(), "last", null);
        setField(term162105, term162105.getClass(), "propListHead", null);
        setIntField(term162105, term162105.getClass(), "sourcePosition", 0);
        setField(term162105, term162105.getClass(), "jsType", null);
        setField(term162105, term162105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term161219;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term161133, args);
        assertTrue(recursiveEquals(term161133, term162171));
        assertTrue(recursiveEquals(term161219, term162172));
        assertTrue(recursiveEquals(retValue, term162105));
    }

};



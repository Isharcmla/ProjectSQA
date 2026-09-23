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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362994;
     Object term363080;
     Object term363209;
     Object term363210;
     Object term363165;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term363080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term363150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term363080, term363080.getClass(), "first", term363080);
        setField(term363080, term363080.getClass(), "next", term363150);
        setIntField(term363080, term363080.getClass(), "type", 45);
        term363209 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term363209, term363209.getClass(), "currentTraversal", null);
        term363210 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term363211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term363210, term363210.getClass(), "functionName", null);
        setBooleanField(term363210, term363210.getClass(), "itsNeedsActivation", false);
        setIntField(term363210, term363210.getClass(), "itsFunctionType", 0);
        setBooleanField(term363210, term363210.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term363210, term363210.getClass(), "encodedSourceStart", 0);
        setIntField(term363210, term363210.getClass(), "encodedSourceEnd", 0);
        setField(term363210, term363210.getClass(), "sourceName", null);
        setIntField(term363210, term363210.getClass(), "baseLineno", 0);
        setIntField(term363210, term363210.getClass(), "endLineno", 0);
        setField(term363210, term363210.getClass(), "functions", null);
        setField(term363210, term363210.getClass(), "regexps", null);
        setField(term363210, term363210.getClass(), "itsVariables", null);
        setField(term363210, term363210.getClass(), "itsConst", null);
        setField(term363210, term363210.getClass(), "itsVariableNames", null);
        setIntField(term363210, term363210.getClass(), "varStart", 0);
        setField(term363210, term363210.getClass(), "compilerData", null);
        setIntField(term363210, term363210.getClass(), "type", 45);
        setIntField(term363211, term363211.getClass(), "type", 0);
        setField(term363211, term363211.getClass(), "next", null);
        setField(term363211, term363211.getClass(), "first", null);
        setField(term363211, term363211.getClass(), "last", null);
        setField(term363211, term363211.getClass(), "propListHead", null);
        setIntField(term363211, term363211.getClass(), "sourcePosition", 0);
        setField(term363211, term363211.getClass(), "jsType", null);
        setField(term363211, term363211.getClass(), "parent", null);
        setField(term363210, term363210.getClass(), "next", term363211);
        setField(term363210, term363210.getClass(), "first", term363210);
        setField(term363210, term363210.getClass(), "last", null);
        setField(term363210, term363210.getClass(), "propListHead", null);
        setIntField(term363210, term363210.getClass(), "sourcePosition", 0);
        setField(term363210, term363210.getClass(), "jsType", null);
        setField(term363210, term363210.getClass(), "parent", null);
        term363165 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term363175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term363165, term363165.getClass(), "functionName", null);
        setBooleanField(term363165, term363165.getClass(), "itsNeedsActivation", false);
        setIntField(term363165, term363165.getClass(), "itsFunctionType", 0);
        setBooleanField(term363165, term363165.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term363165, term363165.getClass(), "encodedSourceStart", 0);
        setIntField(term363165, term363165.getClass(), "encodedSourceEnd", 0);
        setField(term363165, term363165.getClass(), "sourceName", null);
        setIntField(term363165, term363165.getClass(), "baseLineno", 0);
        setIntField(term363165, term363165.getClass(), "endLineno", 0);
        setField(term363165, term363165.getClass(), "functions", null);
        setField(term363165, term363165.getClass(), "regexps", null);
        setField(term363165, term363165.getClass(), "itsVariables", null);
        setField(term363165, term363165.getClass(), "itsConst", null);
        setField(term363165, term363165.getClass(), "itsVariableNames", null);
        setIntField(term363165, term363165.getClass(), "varStart", 0);
        setField(term363165, term363165.getClass(), "compilerData", null);
        setIntField(term363165, term363165.getClass(), "type", 45);
        setIntField(term363175, term363175.getClass(), "type", 0);
        setField(term363175, term363175.getClass(), "next", null);
        setField(term363175, term363175.getClass(), "first", null);
        setField(term363175, term363175.getClass(), "last", null);
        setField(term363175, term363175.getClass(), "propListHead", null);
        setIntField(term363175, term363175.getClass(), "sourcePosition", 0);
        setField(term363175, term363175.getClass(), "jsType", null);
        setField(term363175, term363175.getClass(), "parent", null);
        setField(term363165, term363165.getClass(), "next", term363175);
        setField(term363165, term363165.getClass(), "first", term363165);
        setField(term363165, term363165.getClass(), "last", null);
        setField(term363165, term363165.getClass(), "propListHead", null);
        setIntField(term363165, term363165.getClass(), "sourcePosition", 0);
        setField(term363165, term363165.getClass(), "jsType", null);
        setField(term363165, term363165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term363080;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term362994, args);
        assertTrue(recursiveEquals(term362994, term363209));
        assertTrue(recursiveEquals(term363080, term363210));
        assertTrue(recursiveEquals(retValue, term363165));
    }

};



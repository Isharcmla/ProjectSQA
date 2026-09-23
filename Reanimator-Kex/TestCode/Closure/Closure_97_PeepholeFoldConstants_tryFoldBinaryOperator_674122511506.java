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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135203;
     Object term135289;
     Object term136099;
     Object term136100;
     Object term136055;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135203 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term135289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term135289, term135289.getClass(), "first", term135289);
        setField(term135289, term135289.getClass(), "next", term135359);
        setIntField(term135289, term135289.getClass(), "type", 15);
        term136099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term136099, term136099.getClass(), "currentTraversal", null);
        term136100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136100, term136100.getClass(), "functionName", null);
        setBooleanField(term136100, term136100.getClass(), "itsNeedsActivation", false);
        setIntField(term136100, term136100.getClass(), "itsFunctionType", 0);
        setBooleanField(term136100, term136100.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136100, term136100.getClass(), "encodedSourceStart", 0);
        setIntField(term136100, term136100.getClass(), "encodedSourceEnd", 0);
        setField(term136100, term136100.getClass(), "sourceName", null);
        setIntField(term136100, term136100.getClass(), "baseLineno", 0);
        setIntField(term136100, term136100.getClass(), "endLineno", 0);
        setField(term136100, term136100.getClass(), "functions", null);
        setField(term136100, term136100.getClass(), "regexps", null);
        setField(term136100, term136100.getClass(), "itsVariables", null);
        setField(term136100, term136100.getClass(), "itsConst", null);
        setField(term136100, term136100.getClass(), "itsVariableNames", null);
        setIntField(term136100, term136100.getClass(), "varStart", 0);
        setField(term136100, term136100.getClass(), "compilerData", null);
        setIntField(term136100, term136100.getClass(), "type", 15);
        setIntField(term136101, term136101.getClass(), "type", 0);
        setField(term136101, term136101.getClass(), "next", null);
        setField(term136101, term136101.getClass(), "first", null);
        setField(term136101, term136101.getClass(), "last", null);
        setField(term136101, term136101.getClass(), "propListHead", null);
        setIntField(term136101, term136101.getClass(), "sourcePosition", 0);
        setField(term136101, term136101.getClass(), "jsType", null);
        setField(term136101, term136101.getClass(), "parent", null);
        setField(term136100, term136100.getClass(), "next", term136101);
        setField(term136100, term136100.getClass(), "first", term136100);
        setField(term136100, term136100.getClass(), "last", null);
        setField(term136100, term136100.getClass(), "propListHead", null);
        setIntField(term136100, term136100.getClass(), "sourcePosition", 0);
        setField(term136100, term136100.getClass(), "jsType", null);
        setField(term136100, term136100.getClass(), "parent", null);
        term136055 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136055, term136055.getClass(), "functionName", null);
        setBooleanField(term136055, term136055.getClass(), "itsNeedsActivation", false);
        setIntField(term136055, term136055.getClass(), "itsFunctionType", 0);
        setBooleanField(term136055, term136055.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136055, term136055.getClass(), "encodedSourceStart", 0);
        setIntField(term136055, term136055.getClass(), "encodedSourceEnd", 0);
        setField(term136055, term136055.getClass(), "sourceName", null);
        setIntField(term136055, term136055.getClass(), "baseLineno", 0);
        setIntField(term136055, term136055.getClass(), "endLineno", 0);
        setField(term136055, term136055.getClass(), "functions", null);
        setField(term136055, term136055.getClass(), "regexps", null);
        setField(term136055, term136055.getClass(), "itsVariables", null);
        setField(term136055, term136055.getClass(), "itsConst", null);
        setField(term136055, term136055.getClass(), "itsVariableNames", null);
        setIntField(term136055, term136055.getClass(), "varStart", 0);
        setField(term136055, term136055.getClass(), "compilerData", null);
        setIntField(term136055, term136055.getClass(), "type", 15);
        setIntField(term136065, term136065.getClass(), "type", 0);
        setField(term136065, term136065.getClass(), "next", null);
        setField(term136065, term136065.getClass(), "first", null);
        setField(term136065, term136065.getClass(), "last", null);
        setField(term136065, term136065.getClass(), "propListHead", null);
        setIntField(term136065, term136065.getClass(), "sourcePosition", 0);
        setField(term136065, term136065.getClass(), "jsType", null);
        setField(term136065, term136065.getClass(), "parent", null);
        setField(term136055, term136055.getClass(), "next", term136065);
        setField(term136055, term136055.getClass(), "first", term136055);
        setField(term136055, term136055.getClass(), "last", null);
        setField(term136055, term136055.getClass(), "propListHead", null);
        setIntField(term136055, term136055.getClass(), "sourcePosition", 0);
        setField(term136055, term136055.getClass(), "jsType", null);
        setField(term136055, term136055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term135289;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term135203, args);
        assertTrue(recursiveEquals(term135203, term136099));
        assertTrue(recursiveEquals(term135289, term136100));
        assertTrue(recursiveEquals(retValue, term136055));
    }

};



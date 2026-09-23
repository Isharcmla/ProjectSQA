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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320755;
     Object term320841;
     Object term321099;
     Object term321100;
     Object term321035;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term320841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term320927 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term320927, term320927.getClass(), "next", term321019);
        setIntField(term320927, term320927.getClass(), "type", 39);
        setField(term320841, term320841.getClass(), "first", term320927);
        setIntField(term320841, term320841.getClass(), "type", 23);
        term321099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term321099, term321099.getClass(), "currentTraversal", null);
        term321100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321101 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term321100, term321100.getClass(), "functionName", null);
        setBooleanField(term321100, term321100.getClass(), "itsNeedsActivation", false);
        setIntField(term321100, term321100.getClass(), "itsFunctionType", 0);
        setBooleanField(term321100, term321100.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321100, term321100.getClass(), "encodedSourceStart", 0);
        setIntField(term321100, term321100.getClass(), "encodedSourceEnd", 0);
        setField(term321100, term321100.getClass(), "sourceName", null);
        setIntField(term321100, term321100.getClass(), "baseLineno", 0);
        setIntField(term321100, term321100.getClass(), "endLineno", 0);
        setField(term321100, term321100.getClass(), "functions", null);
        setField(term321100, term321100.getClass(), "regexps", null);
        setField(term321100, term321100.getClass(), "itsVariables", null);
        setField(term321100, term321100.getClass(), "itsConst", null);
        setField(term321100, term321100.getClass(), "itsVariableNames", null);
        setIntField(term321100, term321100.getClass(), "varStart", 0);
        setField(term321100, term321100.getClass(), "compilerData", null);
        setIntField(term321100, term321100.getClass(), "type", 23);
        setField(term321100, term321100.getClass(), "next", null);
        setField(term321101, term321101.getClass(), "functionName", null);
        setBooleanField(term321101, term321101.getClass(), "itsNeedsActivation", false);
        setIntField(term321101, term321101.getClass(), "itsFunctionType", 0);
        setBooleanField(term321101, term321101.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321101, term321101.getClass(), "encodedSourceStart", 0);
        setIntField(term321101, term321101.getClass(), "encodedSourceEnd", 0);
        setField(term321101, term321101.getClass(), "sourceName", null);
        setIntField(term321101, term321101.getClass(), "baseLineno", 0);
        setIntField(term321101, term321101.getClass(), "endLineno", 0);
        setField(term321101, term321101.getClass(), "functions", null);
        setField(term321101, term321101.getClass(), "regexps", null);
        setField(term321101, term321101.getClass(), "itsVariables", null);
        setField(term321101, term321101.getClass(), "itsConst", null);
        setField(term321101, term321101.getClass(), "itsVariableNames", null);
        setIntField(term321101, term321101.getClass(), "varStart", 0);
        setField(term321101, term321101.getClass(), "compilerData", null);
        setIntField(term321101, term321101.getClass(), "type", 39);
        setDoubleField(term321102, term321102.getClass(), "number", 0.0);
        setIntField(term321102, term321102.getClass(), "type", 0);
        setField(term321102, term321102.getClass(), "next", null);
        setField(term321102, term321102.getClass(), "first", null);
        setField(term321102, term321102.getClass(), "last", null);
        setField(term321102, term321102.getClass(), "propListHead", null);
        setIntField(term321102, term321102.getClass(), "sourcePosition", 0);
        setField(term321102, term321102.getClass(), "jsType", null);
        setField(term321102, term321102.getClass(), "parent", null);
        setField(term321101, term321101.getClass(), "next", term321102);
        setField(term321101, term321101.getClass(), "first", null);
        setField(term321101, term321101.getClass(), "last", null);
        setField(term321101, term321101.getClass(), "propListHead", null);
        setIntField(term321101, term321101.getClass(), "sourcePosition", 0);
        setField(term321101, term321101.getClass(), "jsType", null);
        setField(term321101, term321101.getClass(), "parent", null);
        setField(term321100, term321100.getClass(), "first", term321101);
        setField(term321100, term321100.getClass(), "last", null);
        setField(term321100, term321100.getClass(), "propListHead", null);
        setIntField(term321100, term321100.getClass(), "sourcePosition", 0);
        setField(term321100, term321100.getClass(), "jsType", null);
        setField(term321100, term321100.getClass(), "parent", null);
        term321035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term321035, term321035.getClass(), "functionName", null);
        setBooleanField(term321035, term321035.getClass(), "itsNeedsActivation", false);
        setIntField(term321035, term321035.getClass(), "itsFunctionType", 0);
        setBooleanField(term321035, term321035.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321035, term321035.getClass(), "encodedSourceStart", 0);
        setIntField(term321035, term321035.getClass(), "encodedSourceEnd", 0);
        setField(term321035, term321035.getClass(), "sourceName", null);
        setIntField(term321035, term321035.getClass(), "baseLineno", 0);
        setIntField(term321035, term321035.getClass(), "endLineno", 0);
        setField(term321035, term321035.getClass(), "functions", null);
        setField(term321035, term321035.getClass(), "regexps", null);
        setField(term321035, term321035.getClass(), "itsVariables", null);
        setField(term321035, term321035.getClass(), "itsConst", null);
        setField(term321035, term321035.getClass(), "itsVariableNames", null);
        setIntField(term321035, term321035.getClass(), "varStart", 0);
        setField(term321035, term321035.getClass(), "compilerData", null);
        setIntField(term321035, term321035.getClass(), "type", 23);
        setField(term321035, term321035.getClass(), "next", null);
        setField(term321045, term321045.getClass(), "functionName", null);
        setBooleanField(term321045, term321045.getClass(), "itsNeedsActivation", false);
        setIntField(term321045, term321045.getClass(), "itsFunctionType", 0);
        setBooleanField(term321045, term321045.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321045, term321045.getClass(), "encodedSourceStart", 0);
        setIntField(term321045, term321045.getClass(), "encodedSourceEnd", 0);
        setField(term321045, term321045.getClass(), "sourceName", null);
        setIntField(term321045, term321045.getClass(), "baseLineno", 0);
        setIntField(term321045, term321045.getClass(), "endLineno", 0);
        setField(term321045, term321045.getClass(), "functions", null);
        setField(term321045, term321045.getClass(), "regexps", null);
        setField(term321045, term321045.getClass(), "itsVariables", null);
        setField(term321045, term321045.getClass(), "itsConst", null);
        setField(term321045, term321045.getClass(), "itsVariableNames", null);
        setIntField(term321045, term321045.getClass(), "varStart", 0);
        setField(term321045, term321045.getClass(), "compilerData", null);
        setIntField(term321045, term321045.getClass(), "type", 39);
        setDoubleField(term321055, term321055.getClass(), "number", 0.0);
        setIntField(term321055, term321055.getClass(), "type", 0);
        setField(term321055, term321055.getClass(), "next", null);
        setField(term321055, term321055.getClass(), "first", null);
        setField(term321055, term321055.getClass(), "last", null);
        setField(term321055, term321055.getClass(), "propListHead", null);
        setIntField(term321055, term321055.getClass(), "sourcePosition", 0);
        setField(term321055, term321055.getClass(), "jsType", null);
        setField(term321055, term321055.getClass(), "parent", null);
        setField(term321045, term321045.getClass(), "next", term321055);
        setField(term321045, term321045.getClass(), "first", null);
        setField(term321045, term321045.getClass(), "last", null);
        setField(term321045, term321045.getClass(), "propListHead", null);
        setIntField(term321045, term321045.getClass(), "sourcePosition", 0);
        setField(term321045, term321045.getClass(), "jsType", null);
        setField(term321045, term321045.getClass(), "parent", null);
        setField(term321035, term321035.getClass(), "first", term321045);
        setField(term321035, term321035.getClass(), "last", null);
        setField(term321035, term321035.getClass(), "propListHead", null);
        setIntField(term321035, term321035.getClass(), "sourcePosition", 0);
        setField(term321035, term321035.getClass(), "jsType", null);
        setField(term321035, term321035.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term320841;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term320755, args);
        assertTrue(recursiveEquals(term320755, term321099));
        assertTrue(recursiveEquals(term320841, term321100));
        assertTrue(recursiveEquals(retValue, term321035));
    }

};



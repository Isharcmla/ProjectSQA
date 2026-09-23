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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361240;
     Object term361326;
     Object term361452;
     Object term361453;
     Object term361411;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term361326 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term361396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term361326, term361326.getClass(), "first", term361326);
        setField(term361326, term361326.getClass(), "next", term361396);
        setIntField(term361326, term361326.getClass(), "type", 33);
        term361452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term361452, term361452.getClass(), "currentTraversal", null);
        term361453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term361454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term361453, term361453.getClass(), "functionName", null);
        setBooleanField(term361453, term361453.getClass(), "itsNeedsActivation", false);
        setIntField(term361453, term361453.getClass(), "itsFunctionType", 0);
        setBooleanField(term361453, term361453.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361453, term361453.getClass(), "encodedSourceStart", 0);
        setIntField(term361453, term361453.getClass(), "encodedSourceEnd", 0);
        setField(term361453, term361453.getClass(), "sourceName", null);
        setIntField(term361453, term361453.getClass(), "baseLineno", 0);
        setIntField(term361453, term361453.getClass(), "endLineno", 0);
        setField(term361453, term361453.getClass(), "functions", null);
        setField(term361453, term361453.getClass(), "regexps", null);
        setField(term361453, term361453.getClass(), "itsVariables", null);
        setField(term361453, term361453.getClass(), "itsConst", null);
        setField(term361453, term361453.getClass(), "itsVariableNames", null);
        setIntField(term361453, term361453.getClass(), "varStart", 0);
        setField(term361453, term361453.getClass(), "compilerData", null);
        setIntField(term361453, term361453.getClass(), "type", 33);
        setIntField(term361454, term361454.getClass(), "type", 0);
        setField(term361454, term361454.getClass(), "next", null);
        setField(term361454, term361454.getClass(), "first", null);
        setField(term361454, term361454.getClass(), "last", null);
        setField(term361454, term361454.getClass(), "propListHead", null);
        setIntField(term361454, term361454.getClass(), "sourcePosition", 0);
        setField(term361454, term361454.getClass(), "jsType", null);
        setField(term361454, term361454.getClass(), "parent", null);
        setField(term361453, term361453.getClass(), "next", term361454);
        setField(term361453, term361453.getClass(), "first", term361453);
        setField(term361453, term361453.getClass(), "last", null);
        setField(term361453, term361453.getClass(), "propListHead", null);
        setIntField(term361453, term361453.getClass(), "sourcePosition", 0);
        setField(term361453, term361453.getClass(), "jsType", null);
        setField(term361453, term361453.getClass(), "parent", null);
        term361411 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term361421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term361411, term361411.getClass(), "functionName", null);
        setBooleanField(term361411, term361411.getClass(), "itsNeedsActivation", false);
        setIntField(term361411, term361411.getClass(), "itsFunctionType", 0);
        setBooleanField(term361411, term361411.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361411, term361411.getClass(), "encodedSourceStart", 0);
        setIntField(term361411, term361411.getClass(), "encodedSourceEnd", 0);
        setField(term361411, term361411.getClass(), "sourceName", null);
        setIntField(term361411, term361411.getClass(), "baseLineno", 0);
        setIntField(term361411, term361411.getClass(), "endLineno", 0);
        setField(term361411, term361411.getClass(), "functions", null);
        setField(term361411, term361411.getClass(), "regexps", null);
        setField(term361411, term361411.getClass(), "itsVariables", null);
        setField(term361411, term361411.getClass(), "itsConst", null);
        setField(term361411, term361411.getClass(), "itsVariableNames", null);
        setIntField(term361411, term361411.getClass(), "varStart", 0);
        setField(term361411, term361411.getClass(), "compilerData", null);
        setIntField(term361411, term361411.getClass(), "type", 33);
        setIntField(term361421, term361421.getClass(), "type", 0);
        setField(term361421, term361421.getClass(), "next", null);
        setField(term361421, term361421.getClass(), "first", null);
        setField(term361421, term361421.getClass(), "last", null);
        setField(term361421, term361421.getClass(), "propListHead", null);
        setIntField(term361421, term361421.getClass(), "sourcePosition", 0);
        setField(term361421, term361421.getClass(), "jsType", null);
        setField(term361421, term361421.getClass(), "parent", null);
        setField(term361411, term361411.getClass(), "next", term361421);
        setField(term361411, term361411.getClass(), "first", term361411);
        setField(term361411, term361411.getClass(), "last", null);
        setField(term361411, term361411.getClass(), "propListHead", null);
        setIntField(term361411, term361411.getClass(), "sourcePosition", 0);
        setField(term361411, term361411.getClass(), "jsType", null);
        setField(term361411, term361411.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term361326;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term361240, args);
        assertTrue(recursiveEquals(term361240, term361452));
        assertTrue(recursiveEquals(term361326, term361453));
        assertTrue(recursiveEquals(retValue, term361411));
    }

};



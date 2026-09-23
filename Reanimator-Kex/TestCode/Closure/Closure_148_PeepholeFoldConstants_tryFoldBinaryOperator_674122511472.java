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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97372;
     Object term97458;
     Object term98043;
     Object term98044;
     Object term97979;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term97458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97544 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term97544, term97544.getClass(), "next", term97636);
        setIntField(term97544, term97544.getClass(), "type", 39);
        setField(term97458, term97458.getClass(), "first", term97544);
        setIntField(term97458, term97458.getClass(), "type", 24);
        term98043 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term98043, term98043.getClass(), "currentTraversal", null);
        term98044 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98045 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term98046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term98044, term98044.getClass(), "functionName", null);
        setBooleanField(term98044, term98044.getClass(), "itsNeedsActivation", false);
        setIntField(term98044, term98044.getClass(), "itsFunctionType", 0);
        setBooleanField(term98044, term98044.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98044, term98044.getClass(), "encodedSourceStart", 0);
        setIntField(term98044, term98044.getClass(), "encodedSourceEnd", 0);
        setField(term98044, term98044.getClass(), "sourceName", null);
        setIntField(term98044, term98044.getClass(), "baseLineno", 0);
        setIntField(term98044, term98044.getClass(), "endLineno", 0);
        setField(term98044, term98044.getClass(), "functions", null);
        setField(term98044, term98044.getClass(), "regexps", null);
        setField(term98044, term98044.getClass(), "itsVariables", null);
        setField(term98044, term98044.getClass(), "itsConst", null);
        setField(term98044, term98044.getClass(), "itsVariableNames", null);
        setIntField(term98044, term98044.getClass(), "varStart", 0);
        setField(term98044, term98044.getClass(), "compilerData", null);
        setIntField(term98044, term98044.getClass(), "type", 24);
        setField(term98044, term98044.getClass(), "next", null);
        setField(term98045, term98045.getClass(), "functionName", null);
        setBooleanField(term98045, term98045.getClass(), "itsNeedsActivation", false);
        setIntField(term98045, term98045.getClass(), "itsFunctionType", 0);
        setBooleanField(term98045, term98045.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term98045, term98045.getClass(), "encodedSourceStart", 0);
        setIntField(term98045, term98045.getClass(), "encodedSourceEnd", 0);
        setField(term98045, term98045.getClass(), "sourceName", null);
        setIntField(term98045, term98045.getClass(), "baseLineno", 0);
        setIntField(term98045, term98045.getClass(), "endLineno", 0);
        setField(term98045, term98045.getClass(), "functions", null);
        setField(term98045, term98045.getClass(), "regexps", null);
        setField(term98045, term98045.getClass(), "itsVariables", null);
        setField(term98045, term98045.getClass(), "itsConst", null);
        setField(term98045, term98045.getClass(), "itsVariableNames", null);
        setIntField(term98045, term98045.getClass(), "varStart", 0);
        setField(term98045, term98045.getClass(), "compilerData", null);
        setIntField(term98045, term98045.getClass(), "type", 39);
        setDoubleField(term98046, term98046.getClass(), "number", 0.0);
        setIntField(term98046, term98046.getClass(), "type", 0);
        setField(term98046, term98046.getClass(), "next", null);
        setField(term98046, term98046.getClass(), "first", null);
        setField(term98046, term98046.getClass(), "last", null);
        setField(term98046, term98046.getClass(), "propListHead", null);
        setIntField(term98046, term98046.getClass(), "sourcePosition", 0);
        setField(term98046, term98046.getClass(), "jsType", null);
        setField(term98046, term98046.getClass(), "parent", null);
        setField(term98045, term98045.getClass(), "next", term98046);
        setField(term98045, term98045.getClass(), "first", null);
        setField(term98045, term98045.getClass(), "last", null);
        setField(term98045, term98045.getClass(), "propListHead", null);
        setIntField(term98045, term98045.getClass(), "sourcePosition", 0);
        setField(term98045, term98045.getClass(), "jsType", null);
        setField(term98045, term98045.getClass(), "parent", null);
        setField(term98044, term98044.getClass(), "first", term98045);
        setField(term98044, term98044.getClass(), "last", null);
        setField(term98044, term98044.getClass(), "propListHead", null);
        setIntField(term98044, term98044.getClass(), "sourcePosition", 0);
        setField(term98044, term98044.getClass(), "jsType", null);
        setField(term98044, term98044.getClass(), "parent", null);
        term97979 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term97999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term97979, term97979.getClass(), "functionName", null);
        setBooleanField(term97979, term97979.getClass(), "itsNeedsActivation", false);
        setIntField(term97979, term97979.getClass(), "itsFunctionType", 0);
        setBooleanField(term97979, term97979.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97979, term97979.getClass(), "encodedSourceStart", 0);
        setIntField(term97979, term97979.getClass(), "encodedSourceEnd", 0);
        setField(term97979, term97979.getClass(), "sourceName", null);
        setIntField(term97979, term97979.getClass(), "baseLineno", 0);
        setIntField(term97979, term97979.getClass(), "endLineno", 0);
        setField(term97979, term97979.getClass(), "functions", null);
        setField(term97979, term97979.getClass(), "regexps", null);
        setField(term97979, term97979.getClass(), "itsVariables", null);
        setField(term97979, term97979.getClass(), "itsConst", null);
        setField(term97979, term97979.getClass(), "itsVariableNames", null);
        setIntField(term97979, term97979.getClass(), "varStart", 0);
        setField(term97979, term97979.getClass(), "compilerData", null);
        setIntField(term97979, term97979.getClass(), "type", 24);
        setField(term97979, term97979.getClass(), "next", null);
        setField(term97989, term97989.getClass(), "functionName", null);
        setBooleanField(term97989, term97989.getClass(), "itsNeedsActivation", false);
        setIntField(term97989, term97989.getClass(), "itsFunctionType", 0);
        setBooleanField(term97989, term97989.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term97989, term97989.getClass(), "encodedSourceStart", 0);
        setIntField(term97989, term97989.getClass(), "encodedSourceEnd", 0);
        setField(term97989, term97989.getClass(), "sourceName", null);
        setIntField(term97989, term97989.getClass(), "baseLineno", 0);
        setIntField(term97989, term97989.getClass(), "endLineno", 0);
        setField(term97989, term97989.getClass(), "functions", null);
        setField(term97989, term97989.getClass(), "regexps", null);
        setField(term97989, term97989.getClass(), "itsVariables", null);
        setField(term97989, term97989.getClass(), "itsConst", null);
        setField(term97989, term97989.getClass(), "itsVariableNames", null);
        setIntField(term97989, term97989.getClass(), "varStart", 0);
        setField(term97989, term97989.getClass(), "compilerData", null);
        setIntField(term97989, term97989.getClass(), "type", 39);
        setDoubleField(term97999, term97999.getClass(), "number", 0.0);
        setIntField(term97999, term97999.getClass(), "type", 0);
        setField(term97999, term97999.getClass(), "next", null);
        setField(term97999, term97999.getClass(), "first", null);
        setField(term97999, term97999.getClass(), "last", null);
        setField(term97999, term97999.getClass(), "propListHead", null);
        setIntField(term97999, term97999.getClass(), "sourcePosition", 0);
        setField(term97999, term97999.getClass(), "jsType", null);
        setField(term97999, term97999.getClass(), "parent", null);
        setField(term97989, term97989.getClass(), "next", term97999);
        setField(term97989, term97989.getClass(), "first", null);
        setField(term97989, term97989.getClass(), "last", null);
        setField(term97989, term97989.getClass(), "propListHead", null);
        setIntField(term97989, term97989.getClass(), "sourcePosition", 0);
        setField(term97989, term97989.getClass(), "jsType", null);
        setField(term97989, term97989.getClass(), "parent", null);
        setField(term97979, term97979.getClass(), "first", term97989);
        setField(term97979, term97979.getClass(), "last", null);
        setField(term97979, term97979.getClass(), "propListHead", null);
        setIntField(term97979, term97979.getClass(), "sourcePosition", 0);
        setField(term97979, term97979.getClass(), "jsType", null);
        setField(term97979, term97979.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term97458;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term97372, args);
        assertTrue(recursiveEquals(term97372, term98043));
        assertTrue(recursiveEquals(term97458, term98044));
        assertTrue(recursiveEquals(retValue, term97979));
    }

};



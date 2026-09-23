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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413907;
     Object term413999;
     Object term414525;
     Object term414526;
     Object term414480;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413907 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term413999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term414085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term414155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term414085, term414085.getClass(), "next", term414155);
        setIntField(term414085, term414085.getClass(), "type", 39);
        setField(term413999, term413999.getClass(), "first", term414085);
        setIntField(term413999, term413999.getClass(), "type", 22);
        term414525 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term414525, term414525.getClass(), "currentTraversal", null);
        term414526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term414527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term414528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term414526, term414526.getClass(), "str", null);
        setIntField(term414526, term414526.getClass(), "type", 22);
        setField(term414526, term414526.getClass(), "next", null);
        setField(term414527, term414527.getClass(), "functionName", null);
        setBooleanField(term414527, term414527.getClass(), "itsNeedsActivation", false);
        setIntField(term414527, term414527.getClass(), "itsFunctionType", 0);
        setBooleanField(term414527, term414527.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term414527, term414527.getClass(), "encodedSourceStart", 0);
        setIntField(term414527, term414527.getClass(), "encodedSourceEnd", 0);
        setField(term414527, term414527.getClass(), "sourceName", null);
        setIntField(term414527, term414527.getClass(), "baseLineno", 0);
        setIntField(term414527, term414527.getClass(), "endLineno", 0);
        setField(term414527, term414527.getClass(), "functions", null);
        setField(term414527, term414527.getClass(), "regexps", null);
        setField(term414527, term414527.getClass(), "itsVariables", null);
        setField(term414527, term414527.getClass(), "itsConst", null);
        setField(term414527, term414527.getClass(), "itsVariableNames", null);
        setIntField(term414527, term414527.getClass(), "varStart", 0);
        setField(term414527, term414527.getClass(), "compilerData", null);
        setIntField(term414527, term414527.getClass(), "type", 39);
        setIntField(term414528, term414528.getClass(), "type", 0);
        setField(term414528, term414528.getClass(), "next", null);
        setField(term414528, term414528.getClass(), "first", null);
        setField(term414528, term414528.getClass(), "last", null);
        setField(term414528, term414528.getClass(), "propListHead", null);
        setIntField(term414528, term414528.getClass(), "sourcePosition", 0);
        setField(term414528, term414528.getClass(), "jsType", null);
        setField(term414528, term414528.getClass(), "parent", null);
        setField(term414527, term414527.getClass(), "next", term414528);
        setField(term414527, term414527.getClass(), "first", null);
        setField(term414527, term414527.getClass(), "last", null);
        setField(term414527, term414527.getClass(), "propListHead", null);
        setIntField(term414527, term414527.getClass(), "sourcePosition", 0);
        setField(term414527, term414527.getClass(), "jsType", null);
        setField(term414527, term414527.getClass(), "parent", null);
        setField(term414526, term414526.getClass(), "first", term414527);
        setField(term414526, term414526.getClass(), "last", null);
        setField(term414526, term414526.getClass(), "propListHead", null);
        setIntField(term414526, term414526.getClass(), "sourcePosition", 0);
        setField(term414526, term414526.getClass(), "jsType", null);
        setField(term414526, term414526.getClass(), "parent", null);
        term414480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term414482 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term414492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term414480, term414480.getClass(), "str", null);
        setIntField(term414480, term414480.getClass(), "type", 22);
        setField(term414480, term414480.getClass(), "next", null);
        setField(term414482, term414482.getClass(), "functionName", null);
        setBooleanField(term414482, term414482.getClass(), "itsNeedsActivation", false);
        setIntField(term414482, term414482.getClass(), "itsFunctionType", 0);
        setBooleanField(term414482, term414482.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term414482, term414482.getClass(), "encodedSourceStart", 0);
        setIntField(term414482, term414482.getClass(), "encodedSourceEnd", 0);
        setField(term414482, term414482.getClass(), "sourceName", null);
        setIntField(term414482, term414482.getClass(), "baseLineno", 0);
        setIntField(term414482, term414482.getClass(), "endLineno", 0);
        setField(term414482, term414482.getClass(), "functions", null);
        setField(term414482, term414482.getClass(), "regexps", null);
        setField(term414482, term414482.getClass(), "itsVariables", null);
        setField(term414482, term414482.getClass(), "itsConst", null);
        setField(term414482, term414482.getClass(), "itsVariableNames", null);
        setIntField(term414482, term414482.getClass(), "varStart", 0);
        setField(term414482, term414482.getClass(), "compilerData", null);
        setIntField(term414482, term414482.getClass(), "type", 39);
        setIntField(term414492, term414492.getClass(), "type", 0);
        setField(term414492, term414492.getClass(), "next", null);
        setField(term414492, term414492.getClass(), "first", null);
        setField(term414492, term414492.getClass(), "last", null);
        setField(term414492, term414492.getClass(), "propListHead", null);
        setIntField(term414492, term414492.getClass(), "sourcePosition", 0);
        setField(term414492, term414492.getClass(), "jsType", null);
        setField(term414492, term414492.getClass(), "parent", null);
        setField(term414482, term414482.getClass(), "next", term414492);
        setField(term414482, term414482.getClass(), "first", null);
        setField(term414482, term414482.getClass(), "last", null);
        setField(term414482, term414482.getClass(), "propListHead", null);
        setIntField(term414482, term414482.getClass(), "sourcePosition", 0);
        setField(term414482, term414482.getClass(), "jsType", null);
        setField(term414482, term414482.getClass(), "parent", null);
        setField(term414480, term414480.getClass(), "first", term414482);
        setField(term414480, term414480.getClass(), "last", null);
        setField(term414480, term414480.getClass(), "propListHead", null);
        setIntField(term414480, term414480.getClass(), "sourcePosition", 0);
        setField(term414480, term414480.getClass(), "jsType", null);
        setField(term414480, term414480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term413999;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term413907, args);
        assertTrue(recursiveEquals(term413907, term414525));
        assertTrue(recursiveEquals(term413999, term414526));
        assertTrue(recursiveEquals(retValue, term414480));
    }

};



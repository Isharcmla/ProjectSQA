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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343018;
     Object term343104;
     Object term344177;
     Object term344178;
     Object term344114;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term343104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term343190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term343282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term343190, term343190.getClass(), "next", term343282);
        setField(term343104, term343104.getClass(), "first", term343190);
        setIntField(term343104, term343104.getClass(), "type", 33);
        term344177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term344177, term344177.getClass(), "currentTraversal", null);
        term344178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term344179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term344180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term344178, term344178.getClass(), "functionName", null);
        setBooleanField(term344178, term344178.getClass(), "itsNeedsActivation", false);
        setIntField(term344178, term344178.getClass(), "itsFunctionType", 0);
        setBooleanField(term344178, term344178.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term344178, term344178.getClass(), "encodedSourceStart", 0);
        setIntField(term344178, term344178.getClass(), "encodedSourceEnd", 0);
        setField(term344178, term344178.getClass(), "sourceName", null);
        setIntField(term344178, term344178.getClass(), "baseLineno", 0);
        setIntField(term344178, term344178.getClass(), "endLineno", 0);
        setField(term344178, term344178.getClass(), "functions", null);
        setField(term344178, term344178.getClass(), "regexps", null);
        setField(term344178, term344178.getClass(), "itsVariables", null);
        setField(term344178, term344178.getClass(), "itsConst", null);
        setField(term344178, term344178.getClass(), "itsVariableNames", null);
        setIntField(term344178, term344178.getClass(), "varStart", 0);
        setField(term344178, term344178.getClass(), "compilerData", null);
        setIntField(term344178, term344178.getClass(), "type", 33);
        setField(term344178, term344178.getClass(), "next", null);
        setField(term344179, term344179.getClass(), "functionName", null);
        setBooleanField(term344179, term344179.getClass(), "itsNeedsActivation", false);
        setIntField(term344179, term344179.getClass(), "itsFunctionType", 0);
        setBooleanField(term344179, term344179.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term344179, term344179.getClass(), "encodedSourceStart", 0);
        setIntField(term344179, term344179.getClass(), "encodedSourceEnd", 0);
        setField(term344179, term344179.getClass(), "sourceName", null);
        setIntField(term344179, term344179.getClass(), "baseLineno", 0);
        setIntField(term344179, term344179.getClass(), "endLineno", 0);
        setField(term344179, term344179.getClass(), "functions", null);
        setField(term344179, term344179.getClass(), "regexps", null);
        setField(term344179, term344179.getClass(), "itsVariables", null);
        setField(term344179, term344179.getClass(), "itsConst", null);
        setField(term344179, term344179.getClass(), "itsVariableNames", null);
        setIntField(term344179, term344179.getClass(), "varStart", 0);
        setField(term344179, term344179.getClass(), "compilerData", null);
        setIntField(term344179, term344179.getClass(), "type", 0);
        setField(term344180, term344180.getClass(), "str", null);
        setIntField(term344180, term344180.getClass(), "type", 0);
        setField(term344180, term344180.getClass(), "next", null);
        setField(term344180, term344180.getClass(), "first", null);
        setField(term344180, term344180.getClass(), "last", null);
        setField(term344180, term344180.getClass(), "propListHead", null);
        setIntField(term344180, term344180.getClass(), "sourcePosition", 0);
        setField(term344180, term344180.getClass(), "jsType", null);
        setField(term344180, term344180.getClass(), "parent", null);
        setField(term344179, term344179.getClass(), "next", term344180);
        setField(term344179, term344179.getClass(), "first", null);
        setField(term344179, term344179.getClass(), "last", null);
        setField(term344179, term344179.getClass(), "propListHead", null);
        setIntField(term344179, term344179.getClass(), "sourcePosition", 0);
        setField(term344179, term344179.getClass(), "jsType", null);
        setField(term344179, term344179.getClass(), "parent", null);
        setField(term344178, term344178.getClass(), "first", term344179);
        setField(term344178, term344178.getClass(), "last", null);
        setField(term344178, term344178.getClass(), "propListHead", null);
        setIntField(term344178, term344178.getClass(), "sourcePosition", 0);
        setField(term344178, term344178.getClass(), "jsType", null);
        setField(term344178, term344178.getClass(), "parent", null);
        term344114 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term344124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term344134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term344114, term344114.getClass(), "functionName", null);
        setBooleanField(term344114, term344114.getClass(), "itsNeedsActivation", false);
        setIntField(term344114, term344114.getClass(), "itsFunctionType", 0);
        setBooleanField(term344114, term344114.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term344114, term344114.getClass(), "encodedSourceStart", 0);
        setIntField(term344114, term344114.getClass(), "encodedSourceEnd", 0);
        setField(term344114, term344114.getClass(), "sourceName", null);
        setIntField(term344114, term344114.getClass(), "baseLineno", 0);
        setIntField(term344114, term344114.getClass(), "endLineno", 0);
        setField(term344114, term344114.getClass(), "functions", null);
        setField(term344114, term344114.getClass(), "regexps", null);
        setField(term344114, term344114.getClass(), "itsVariables", null);
        setField(term344114, term344114.getClass(), "itsConst", null);
        setField(term344114, term344114.getClass(), "itsVariableNames", null);
        setIntField(term344114, term344114.getClass(), "varStart", 0);
        setField(term344114, term344114.getClass(), "compilerData", null);
        setIntField(term344114, term344114.getClass(), "type", 33);
        setField(term344114, term344114.getClass(), "next", null);
        setField(term344124, term344124.getClass(), "functionName", null);
        setBooleanField(term344124, term344124.getClass(), "itsNeedsActivation", false);
        setIntField(term344124, term344124.getClass(), "itsFunctionType", 0);
        setBooleanField(term344124, term344124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term344124, term344124.getClass(), "encodedSourceStart", 0);
        setIntField(term344124, term344124.getClass(), "encodedSourceEnd", 0);
        setField(term344124, term344124.getClass(), "sourceName", null);
        setIntField(term344124, term344124.getClass(), "baseLineno", 0);
        setIntField(term344124, term344124.getClass(), "endLineno", 0);
        setField(term344124, term344124.getClass(), "functions", null);
        setField(term344124, term344124.getClass(), "regexps", null);
        setField(term344124, term344124.getClass(), "itsVariables", null);
        setField(term344124, term344124.getClass(), "itsConst", null);
        setField(term344124, term344124.getClass(), "itsVariableNames", null);
        setIntField(term344124, term344124.getClass(), "varStart", 0);
        setField(term344124, term344124.getClass(), "compilerData", null);
        setIntField(term344124, term344124.getClass(), "type", 0);
        setField(term344134, term344134.getClass(), "str", null);
        setIntField(term344134, term344134.getClass(), "type", 0);
        setField(term344134, term344134.getClass(), "next", null);
        setField(term344134, term344134.getClass(), "first", null);
        setField(term344134, term344134.getClass(), "last", null);
        setField(term344134, term344134.getClass(), "propListHead", null);
        setIntField(term344134, term344134.getClass(), "sourcePosition", 0);
        setField(term344134, term344134.getClass(), "jsType", null);
        setField(term344134, term344134.getClass(), "parent", null);
        setField(term344124, term344124.getClass(), "next", term344134);
        setField(term344124, term344124.getClass(), "first", null);
        setField(term344124, term344124.getClass(), "last", null);
        setField(term344124, term344124.getClass(), "propListHead", null);
        setIntField(term344124, term344124.getClass(), "sourcePosition", 0);
        setField(term344124, term344124.getClass(), "jsType", null);
        setField(term344124, term344124.getClass(), "parent", null);
        setField(term344114, term344114.getClass(), "first", term344124);
        setField(term344114, term344114.getClass(), "last", null);
        setField(term344114, term344114.getClass(), "propListHead", null);
        setIntField(term344114, term344114.getClass(), "sourcePosition", 0);
        setField(term344114, term344114.getClass(), "jsType", null);
        setField(term344114, term344114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term343104;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term343018, args);
        assertTrue(recursiveEquals(term343018, term344177));
        assertTrue(recursiveEquals(term343104, term344178));
        assertTrue(recursiveEquals(retValue, term344114));
    }

};



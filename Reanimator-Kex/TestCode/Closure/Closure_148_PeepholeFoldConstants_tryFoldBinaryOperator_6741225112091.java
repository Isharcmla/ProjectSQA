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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566173;
     Object term566265;
     Object term566991;
     Object term566992;
     Object term566920;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term566265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term566351 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term566437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term566351, term566351.getClass(), "next", term566437);
        setField(term566265, term566265.getClass(), "first", term566351);
        setIntField(term566265, term566265.getClass(), "type", 33);
        term566991 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term566991, term566991.getClass(), "currentTraversal", null);
        term566992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term566993 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term566994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term566992, term566992.getClass(), "str", null);
        setIntField(term566992, term566992.getClass(), "type", 33);
        setField(term566992, term566992.getClass(), "next", null);
        setField(term566993, term566993.getClass(), "functionName", null);
        setBooleanField(term566993, term566993.getClass(), "itsNeedsActivation", false);
        setIntField(term566993, term566993.getClass(), "itsFunctionType", 0);
        setBooleanField(term566993, term566993.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566993, term566993.getClass(), "encodedSourceStart", 0);
        setIntField(term566993, term566993.getClass(), "encodedSourceEnd", 0);
        setField(term566993, term566993.getClass(), "sourceName", null);
        setIntField(term566993, term566993.getClass(), "baseLineno", 0);
        setIntField(term566993, term566993.getClass(), "endLineno", 0);
        setField(term566993, term566993.getClass(), "functions", null);
        setField(term566993, term566993.getClass(), "regexps", null);
        setField(term566993, term566993.getClass(), "itsVariables", null);
        setField(term566993, term566993.getClass(), "itsConst", null);
        setField(term566993, term566993.getClass(), "itsVariableNames", null);
        setIntField(term566993, term566993.getClass(), "varStart", 0);
        setField(term566993, term566993.getClass(), "compilerData", null);
        setIntField(term566993, term566993.getClass(), "type", 0);
        setField(term566994, term566994.getClass(), "functionName", null);
        setBooleanField(term566994, term566994.getClass(), "itsNeedsActivation", false);
        setIntField(term566994, term566994.getClass(), "itsFunctionType", 0);
        setBooleanField(term566994, term566994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566994, term566994.getClass(), "encodedSourceStart", 0);
        setIntField(term566994, term566994.getClass(), "encodedSourceEnd", 0);
        setField(term566994, term566994.getClass(), "sourceName", null);
        setIntField(term566994, term566994.getClass(), "baseLineno", 0);
        setIntField(term566994, term566994.getClass(), "endLineno", 0);
        setField(term566994, term566994.getClass(), "functions", null);
        setField(term566994, term566994.getClass(), "regexps", null);
        setField(term566994, term566994.getClass(), "itsVariables", null);
        setField(term566994, term566994.getClass(), "itsConst", null);
        setField(term566994, term566994.getClass(), "itsVariableNames", null);
        setIntField(term566994, term566994.getClass(), "varStart", 0);
        setField(term566994, term566994.getClass(), "compilerData", null);
        setIntField(term566994, term566994.getClass(), "type", 0);
        setField(term566994, term566994.getClass(), "next", null);
        setField(term566994, term566994.getClass(), "first", null);
        setField(term566994, term566994.getClass(), "last", null);
        setField(term566994, term566994.getClass(), "propListHead", null);
        setIntField(term566994, term566994.getClass(), "sourcePosition", 0);
        setField(term566994, term566994.getClass(), "jsType", null);
        setField(term566994, term566994.getClass(), "parent", null);
        setField(term566993, term566993.getClass(), "next", term566994);
        setField(term566993, term566993.getClass(), "first", null);
        setField(term566993, term566993.getClass(), "last", null);
        setField(term566993, term566993.getClass(), "propListHead", null);
        setIntField(term566993, term566993.getClass(), "sourcePosition", 0);
        setField(term566993, term566993.getClass(), "jsType", null);
        setField(term566993, term566993.getClass(), "parent", null);
        setField(term566992, term566992.getClass(), "first", term566993);
        setField(term566992, term566992.getClass(), "last", null);
        setField(term566992, term566992.getClass(), "propListHead", null);
        setIntField(term566992, term566992.getClass(), "sourcePosition", 0);
        setField(term566992, term566992.getClass(), "jsType", null);
        setField(term566992, term566992.getClass(), "parent", null);
        term566920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term566922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term566932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term566920, term566920.getClass(), "str", null);
        setIntField(term566920, term566920.getClass(), "type", 33);
        setField(term566920, term566920.getClass(), "next", null);
        setField(term566922, term566922.getClass(), "functionName", null);
        setBooleanField(term566922, term566922.getClass(), "itsNeedsActivation", false);
        setIntField(term566922, term566922.getClass(), "itsFunctionType", 0);
        setBooleanField(term566922, term566922.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566922, term566922.getClass(), "encodedSourceStart", 0);
        setIntField(term566922, term566922.getClass(), "encodedSourceEnd", 0);
        setField(term566922, term566922.getClass(), "sourceName", null);
        setIntField(term566922, term566922.getClass(), "baseLineno", 0);
        setIntField(term566922, term566922.getClass(), "endLineno", 0);
        setField(term566922, term566922.getClass(), "functions", null);
        setField(term566922, term566922.getClass(), "regexps", null);
        setField(term566922, term566922.getClass(), "itsVariables", null);
        setField(term566922, term566922.getClass(), "itsConst", null);
        setField(term566922, term566922.getClass(), "itsVariableNames", null);
        setIntField(term566922, term566922.getClass(), "varStart", 0);
        setField(term566922, term566922.getClass(), "compilerData", null);
        setIntField(term566922, term566922.getClass(), "type", 0);
        setField(term566932, term566932.getClass(), "functionName", null);
        setBooleanField(term566932, term566932.getClass(), "itsNeedsActivation", false);
        setIntField(term566932, term566932.getClass(), "itsFunctionType", 0);
        setBooleanField(term566932, term566932.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term566932, term566932.getClass(), "encodedSourceStart", 0);
        setIntField(term566932, term566932.getClass(), "encodedSourceEnd", 0);
        setField(term566932, term566932.getClass(), "sourceName", null);
        setIntField(term566932, term566932.getClass(), "baseLineno", 0);
        setIntField(term566932, term566932.getClass(), "endLineno", 0);
        setField(term566932, term566932.getClass(), "functions", null);
        setField(term566932, term566932.getClass(), "regexps", null);
        setField(term566932, term566932.getClass(), "itsVariables", null);
        setField(term566932, term566932.getClass(), "itsConst", null);
        setField(term566932, term566932.getClass(), "itsVariableNames", null);
        setIntField(term566932, term566932.getClass(), "varStart", 0);
        setField(term566932, term566932.getClass(), "compilerData", null);
        setIntField(term566932, term566932.getClass(), "type", 0);
        setField(term566932, term566932.getClass(), "next", null);
        setField(term566932, term566932.getClass(), "first", null);
        setField(term566932, term566932.getClass(), "last", null);
        setField(term566932, term566932.getClass(), "propListHead", null);
        setIntField(term566932, term566932.getClass(), "sourcePosition", 0);
        setField(term566932, term566932.getClass(), "jsType", null);
        setField(term566932, term566932.getClass(), "parent", null);
        setField(term566922, term566922.getClass(), "next", term566932);
        setField(term566922, term566922.getClass(), "first", null);
        setField(term566922, term566922.getClass(), "last", null);
        setField(term566922, term566922.getClass(), "propListHead", null);
        setIntField(term566922, term566922.getClass(), "sourcePosition", 0);
        setField(term566922, term566922.getClass(), "jsType", null);
        setField(term566922, term566922.getClass(), "parent", null);
        setField(term566920, term566920.getClass(), "first", term566922);
        setField(term566920, term566920.getClass(), "last", null);
        setField(term566920, term566920.getClass(), "propListHead", null);
        setIntField(term566920, term566920.getClass(), "sourcePosition", 0);
        setField(term566920, term566920.getClass(), "jsType", null);
        setField(term566920, term566920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term566265;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term566173, args);
        assertTrue(recursiveEquals(term566173, term566991));
        assertTrue(recursiveEquals(term566265, term566992));
        assertTrue(recursiveEquals(retValue, term566920));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899296;
     Object term899388;
     Object term900132;
     Object term900133;
     Object term900050;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term899388 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term899474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term899560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term899474, term899474.getClass(), "next", term899560);
        setIntField(term899474, term899474.getClass(), "type", 0);
        setField(term899388, term899388.getClass(), "first", term899474);
        setIntField(term899388, term899388.getClass(), "type", 16);
        term900132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term900132, term900132.getClass(), "currentTraversal", null);
        term900133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term900134 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term900135 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term900133, term900133.getClass(), "str", null);
        setIntField(term900133, term900133.getClass(), "type", 16);
        setField(term900133, term900133.getClass(), "next", null);
        setField(term900134, term900134.getClass(), "functionName", null);
        setBooleanField(term900134, term900134.getClass(), "itsNeedsActivation", false);
        setIntField(term900134, term900134.getClass(), "itsFunctionType", 0);
        setBooleanField(term900134, term900134.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term900134, term900134.getClass(), "encodedSourceStart", 0);
        setIntField(term900134, term900134.getClass(), "encodedSourceEnd", 0);
        setField(term900134, term900134.getClass(), "sourceName", null);
        setIntField(term900134, term900134.getClass(), "baseLineno", 0);
        setIntField(term900134, term900134.getClass(), "endLineno", 0);
        setField(term900134, term900134.getClass(), "functions", null);
        setField(term900134, term900134.getClass(), "regexps", null);
        setField(term900134, term900134.getClass(), "itsVariables", null);
        setField(term900134, term900134.getClass(), "itsConst", null);
        setField(term900134, term900134.getClass(), "itsVariableNames", null);
        setIntField(term900134, term900134.getClass(), "varStart", 0);
        setField(term900134, term900134.getClass(), "compilerData", null);
        setIntField(term900134, term900134.getClass(), "type", 0);
        setField(term900135, term900135.getClass(), "functionName", null);
        setBooleanField(term900135, term900135.getClass(), "itsNeedsActivation", false);
        setIntField(term900135, term900135.getClass(), "itsFunctionType", 0);
        setBooleanField(term900135, term900135.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term900135, term900135.getClass(), "encodedSourceStart", 0);
        setIntField(term900135, term900135.getClass(), "encodedSourceEnd", 0);
        setField(term900135, term900135.getClass(), "sourceName", null);
        setIntField(term900135, term900135.getClass(), "baseLineno", 0);
        setIntField(term900135, term900135.getClass(), "endLineno", 0);
        setField(term900135, term900135.getClass(), "functions", null);
        setField(term900135, term900135.getClass(), "regexps", null);
        setField(term900135, term900135.getClass(), "itsVariables", null);
        setField(term900135, term900135.getClass(), "itsConst", null);
        setField(term900135, term900135.getClass(), "itsVariableNames", null);
        setIntField(term900135, term900135.getClass(), "varStart", 0);
        setField(term900135, term900135.getClass(), "compilerData", null);
        setIntField(term900135, term900135.getClass(), "type", 0);
        setField(term900135, term900135.getClass(), "next", null);
        setField(term900135, term900135.getClass(), "first", null);
        setField(term900135, term900135.getClass(), "last", null);
        setField(term900135, term900135.getClass(), "propListHead", null);
        setIntField(term900135, term900135.getClass(), "sourcePosition", 0);
        setField(term900135, term900135.getClass(), "jsType", null);
        setField(term900135, term900135.getClass(), "parent", null);
        setField(term900134, term900134.getClass(), "next", term900135);
        setField(term900134, term900134.getClass(), "first", null);
        setField(term900134, term900134.getClass(), "last", null);
        setField(term900134, term900134.getClass(), "propListHead", null);
        setIntField(term900134, term900134.getClass(), "sourcePosition", 0);
        setField(term900134, term900134.getClass(), "jsType", null);
        setField(term900134, term900134.getClass(), "parent", null);
        setField(term900133, term900133.getClass(), "first", term900134);
        setField(term900133, term900133.getClass(), "last", null);
        setField(term900133, term900133.getClass(), "propListHead", null);
        setIntField(term900133, term900133.getClass(), "sourcePosition", 0);
        setField(term900133, term900133.getClass(), "jsType", null);
        setField(term900133, term900133.getClass(), "parent", null);
        term900050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term900052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term900062 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term900050, term900050.getClass(), "str", null);
        setIntField(term900050, term900050.getClass(), "type", 16);
        setField(term900050, term900050.getClass(), "next", null);
        setField(term900052, term900052.getClass(), "functionName", null);
        setBooleanField(term900052, term900052.getClass(), "itsNeedsActivation", false);
        setIntField(term900052, term900052.getClass(), "itsFunctionType", 0);
        setBooleanField(term900052, term900052.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term900052, term900052.getClass(), "encodedSourceStart", 0);
        setIntField(term900052, term900052.getClass(), "encodedSourceEnd", 0);
        setField(term900052, term900052.getClass(), "sourceName", null);
        setIntField(term900052, term900052.getClass(), "baseLineno", 0);
        setIntField(term900052, term900052.getClass(), "endLineno", 0);
        setField(term900052, term900052.getClass(), "functions", null);
        setField(term900052, term900052.getClass(), "regexps", null);
        setField(term900052, term900052.getClass(), "itsVariables", null);
        setField(term900052, term900052.getClass(), "itsConst", null);
        setField(term900052, term900052.getClass(), "itsVariableNames", null);
        setIntField(term900052, term900052.getClass(), "varStart", 0);
        setField(term900052, term900052.getClass(), "compilerData", null);
        setIntField(term900052, term900052.getClass(), "type", 0);
        setField(term900062, term900062.getClass(), "functionName", null);
        setBooleanField(term900062, term900062.getClass(), "itsNeedsActivation", false);
        setIntField(term900062, term900062.getClass(), "itsFunctionType", 0);
        setBooleanField(term900062, term900062.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term900062, term900062.getClass(), "encodedSourceStart", 0);
        setIntField(term900062, term900062.getClass(), "encodedSourceEnd", 0);
        setField(term900062, term900062.getClass(), "sourceName", null);
        setIntField(term900062, term900062.getClass(), "baseLineno", 0);
        setIntField(term900062, term900062.getClass(), "endLineno", 0);
        setField(term900062, term900062.getClass(), "functions", null);
        setField(term900062, term900062.getClass(), "regexps", null);
        setField(term900062, term900062.getClass(), "itsVariables", null);
        setField(term900062, term900062.getClass(), "itsConst", null);
        setField(term900062, term900062.getClass(), "itsVariableNames", null);
        setIntField(term900062, term900062.getClass(), "varStart", 0);
        setField(term900062, term900062.getClass(), "compilerData", null);
        setIntField(term900062, term900062.getClass(), "type", 0);
        setField(term900062, term900062.getClass(), "next", null);
        setField(term900062, term900062.getClass(), "first", null);
        setField(term900062, term900062.getClass(), "last", null);
        setField(term900062, term900062.getClass(), "propListHead", null);
        setIntField(term900062, term900062.getClass(), "sourcePosition", 0);
        setField(term900062, term900062.getClass(), "jsType", null);
        setField(term900062, term900062.getClass(), "parent", null);
        setField(term900052, term900052.getClass(), "next", term900062);
        setField(term900052, term900052.getClass(), "first", null);
        setField(term900052, term900052.getClass(), "last", null);
        setField(term900052, term900052.getClass(), "propListHead", null);
        setIntField(term900052, term900052.getClass(), "sourcePosition", 0);
        setField(term900052, term900052.getClass(), "jsType", null);
        setField(term900052, term900052.getClass(), "parent", null);
        setField(term900050, term900050.getClass(), "first", term900052);
        setField(term900050, term900050.getClass(), "last", null);
        setField(term900050, term900050.getClass(), "propListHead", null);
        setIntField(term900050, term900050.getClass(), "sourcePosition", 0);
        setField(term900050, term900050.getClass(), "jsType", null);
        setField(term900050, term900050.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term899388;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term899296, args);
        assertTrue(recursiveEquals(term899296, term900132));
        assertTrue(recursiveEquals(term899388, term900133));
        assertTrue(recursiveEquals(retValue, term900050));
    }

};



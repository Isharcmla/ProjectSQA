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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914905;
     Object term914997;
     Object term915721;
     Object term915722;
     Object term915676;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term914905 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term914997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term915083 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term915153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term915083, term915083.getClass(), "next", term915153);
        setIntField(term915083, term915083.getClass(), "type", 39);
        setField(term914997, term914997.getClass(), "first", term915083);
        setIntField(term914997, term914997.getClass(), "type", 19);
        term915721 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term915721, term915721.getClass(), "currentTraversal", null);
        term915722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term915723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term915724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term915722, term915722.getClass(), "str", null);
        setIntField(term915722, term915722.getClass(), "type", 19);
        setField(term915722, term915722.getClass(), "next", null);
        setField(term915723, term915723.getClass(), "functionName", null);
        setBooleanField(term915723, term915723.getClass(), "itsNeedsActivation", false);
        setIntField(term915723, term915723.getClass(), "itsFunctionType", 0);
        setBooleanField(term915723, term915723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term915723, term915723.getClass(), "encodedSourceStart", 0);
        setIntField(term915723, term915723.getClass(), "encodedSourceEnd", 0);
        setField(term915723, term915723.getClass(), "sourceName", null);
        setIntField(term915723, term915723.getClass(), "baseLineno", 0);
        setIntField(term915723, term915723.getClass(), "endLineno", 0);
        setField(term915723, term915723.getClass(), "functions", null);
        setField(term915723, term915723.getClass(), "regexps", null);
        setField(term915723, term915723.getClass(), "itsVariables", null);
        setField(term915723, term915723.getClass(), "itsConst", null);
        setField(term915723, term915723.getClass(), "itsVariableNames", null);
        setIntField(term915723, term915723.getClass(), "varStart", 0);
        setField(term915723, term915723.getClass(), "compilerData", null);
        setIntField(term915723, term915723.getClass(), "type", 39);
        setIntField(term915724, term915724.getClass(), "type", 0);
        setField(term915724, term915724.getClass(), "next", null);
        setField(term915724, term915724.getClass(), "first", null);
        setField(term915724, term915724.getClass(), "last", null);
        setField(term915724, term915724.getClass(), "propListHead", null);
        setIntField(term915724, term915724.getClass(), "sourcePosition", 0);
        setField(term915724, term915724.getClass(), "jsType", null);
        setField(term915724, term915724.getClass(), "parent", null);
        setField(term915723, term915723.getClass(), "next", term915724);
        setField(term915723, term915723.getClass(), "first", null);
        setField(term915723, term915723.getClass(), "last", null);
        setField(term915723, term915723.getClass(), "propListHead", null);
        setIntField(term915723, term915723.getClass(), "sourcePosition", 0);
        setField(term915723, term915723.getClass(), "jsType", null);
        setField(term915723, term915723.getClass(), "parent", null);
        setField(term915722, term915722.getClass(), "first", term915723);
        setField(term915722, term915722.getClass(), "last", null);
        setField(term915722, term915722.getClass(), "propListHead", null);
        setIntField(term915722, term915722.getClass(), "sourcePosition", 0);
        setField(term915722, term915722.getClass(), "jsType", null);
        setField(term915722, term915722.getClass(), "parent", null);
        term915676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term915678 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term915688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term915676, term915676.getClass(), "str", null);
        setIntField(term915676, term915676.getClass(), "type", 19);
        setField(term915676, term915676.getClass(), "next", null);
        setField(term915678, term915678.getClass(), "functionName", null);
        setBooleanField(term915678, term915678.getClass(), "itsNeedsActivation", false);
        setIntField(term915678, term915678.getClass(), "itsFunctionType", 0);
        setBooleanField(term915678, term915678.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term915678, term915678.getClass(), "encodedSourceStart", 0);
        setIntField(term915678, term915678.getClass(), "encodedSourceEnd", 0);
        setField(term915678, term915678.getClass(), "sourceName", null);
        setIntField(term915678, term915678.getClass(), "baseLineno", 0);
        setIntField(term915678, term915678.getClass(), "endLineno", 0);
        setField(term915678, term915678.getClass(), "functions", null);
        setField(term915678, term915678.getClass(), "regexps", null);
        setField(term915678, term915678.getClass(), "itsVariables", null);
        setField(term915678, term915678.getClass(), "itsConst", null);
        setField(term915678, term915678.getClass(), "itsVariableNames", null);
        setIntField(term915678, term915678.getClass(), "varStart", 0);
        setField(term915678, term915678.getClass(), "compilerData", null);
        setIntField(term915678, term915678.getClass(), "type", 39);
        setIntField(term915688, term915688.getClass(), "type", 0);
        setField(term915688, term915688.getClass(), "next", null);
        setField(term915688, term915688.getClass(), "first", null);
        setField(term915688, term915688.getClass(), "last", null);
        setField(term915688, term915688.getClass(), "propListHead", null);
        setIntField(term915688, term915688.getClass(), "sourcePosition", 0);
        setField(term915688, term915688.getClass(), "jsType", null);
        setField(term915688, term915688.getClass(), "parent", null);
        setField(term915678, term915678.getClass(), "next", term915688);
        setField(term915678, term915678.getClass(), "first", null);
        setField(term915678, term915678.getClass(), "last", null);
        setField(term915678, term915678.getClass(), "propListHead", null);
        setIntField(term915678, term915678.getClass(), "sourcePosition", 0);
        setField(term915678, term915678.getClass(), "jsType", null);
        setField(term915678, term915678.getClass(), "parent", null);
        setField(term915676, term915676.getClass(), "first", term915678);
        setField(term915676, term915676.getClass(), "last", null);
        setField(term915676, term915676.getClass(), "propListHead", null);
        setIntField(term915676, term915676.getClass(), "sourcePosition", 0);
        setField(term915676, term915676.getClass(), "jsType", null);
        setField(term915676, term915676.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term914997;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term914905, args);
        assertTrue(recursiveEquals(term914905, term915721));
        assertTrue(recursiveEquals(term914997, term915722));
        assertTrue(recursiveEquals(retValue, term915676));
    }

};



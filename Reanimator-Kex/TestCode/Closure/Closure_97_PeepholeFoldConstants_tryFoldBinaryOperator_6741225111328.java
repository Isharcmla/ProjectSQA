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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438872;
     Object term438958;
     Object term439192;
     Object term439193;
     Object term439129;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term438958 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439044 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439044, term439044.getClass(), "next", term439114);
        setField(term438958, term438958.getClass(), "first", term439044);
        setIntField(term438958, term438958.getClass(), "type", 33);
        term439192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term439192, term439192.getClass(), "currentTraversal", null);
        term439193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439193, term439193.getClass(), "functionName", null);
        setBooleanField(term439193, term439193.getClass(), "itsNeedsActivation", false);
        setIntField(term439193, term439193.getClass(), "itsFunctionType", 0);
        setBooleanField(term439193, term439193.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439193, term439193.getClass(), "encodedSourceStart", 0);
        setIntField(term439193, term439193.getClass(), "encodedSourceEnd", 0);
        setField(term439193, term439193.getClass(), "sourceName", null);
        setIntField(term439193, term439193.getClass(), "baseLineno", 0);
        setIntField(term439193, term439193.getClass(), "endLineno", 0);
        setField(term439193, term439193.getClass(), "functions", null);
        setField(term439193, term439193.getClass(), "regexps", null);
        setField(term439193, term439193.getClass(), "itsVariables", null);
        setField(term439193, term439193.getClass(), "itsConst", null);
        setField(term439193, term439193.getClass(), "itsVariableNames", null);
        setIntField(term439193, term439193.getClass(), "varStart", 0);
        setField(term439193, term439193.getClass(), "compilerData", null);
        setIntField(term439193, term439193.getClass(), "type", 33);
        setField(term439193, term439193.getClass(), "next", null);
        setField(term439194, term439194.getClass(), "functionName", null);
        setBooleanField(term439194, term439194.getClass(), "itsNeedsActivation", false);
        setIntField(term439194, term439194.getClass(), "itsFunctionType", 0);
        setBooleanField(term439194, term439194.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439194, term439194.getClass(), "encodedSourceStart", 0);
        setIntField(term439194, term439194.getClass(), "encodedSourceEnd", 0);
        setField(term439194, term439194.getClass(), "sourceName", null);
        setIntField(term439194, term439194.getClass(), "baseLineno", 0);
        setIntField(term439194, term439194.getClass(), "endLineno", 0);
        setField(term439194, term439194.getClass(), "functions", null);
        setField(term439194, term439194.getClass(), "regexps", null);
        setField(term439194, term439194.getClass(), "itsVariables", null);
        setField(term439194, term439194.getClass(), "itsConst", null);
        setField(term439194, term439194.getClass(), "itsVariableNames", null);
        setIntField(term439194, term439194.getClass(), "varStart", 0);
        setField(term439194, term439194.getClass(), "compilerData", null);
        setIntField(term439194, term439194.getClass(), "type", 0);
        setIntField(term439195, term439195.getClass(), "type", 0);
        setField(term439195, term439195.getClass(), "next", null);
        setField(term439195, term439195.getClass(), "first", null);
        setField(term439195, term439195.getClass(), "last", null);
        setField(term439195, term439195.getClass(), "propListHead", null);
        setIntField(term439195, term439195.getClass(), "sourcePosition", 0);
        setField(term439195, term439195.getClass(), "jsType", null);
        setField(term439195, term439195.getClass(), "parent", null);
        setField(term439194, term439194.getClass(), "next", term439195);
        setField(term439194, term439194.getClass(), "first", null);
        setField(term439194, term439194.getClass(), "last", null);
        setField(term439194, term439194.getClass(), "propListHead", null);
        setIntField(term439194, term439194.getClass(), "sourcePosition", 0);
        setField(term439194, term439194.getClass(), "jsType", null);
        setField(term439194, term439194.getClass(), "parent", null);
        setField(term439193, term439193.getClass(), "first", term439194);
        setField(term439193, term439193.getClass(), "last", null);
        setField(term439193, term439193.getClass(), "propListHead", null);
        setIntField(term439193, term439193.getClass(), "sourcePosition", 0);
        setField(term439193, term439193.getClass(), "jsType", null);
        setField(term439193, term439193.getClass(), "parent", null);
        term439129 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term439149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term439129, term439129.getClass(), "functionName", null);
        setBooleanField(term439129, term439129.getClass(), "itsNeedsActivation", false);
        setIntField(term439129, term439129.getClass(), "itsFunctionType", 0);
        setBooleanField(term439129, term439129.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439129, term439129.getClass(), "encodedSourceStart", 0);
        setIntField(term439129, term439129.getClass(), "encodedSourceEnd", 0);
        setField(term439129, term439129.getClass(), "sourceName", null);
        setIntField(term439129, term439129.getClass(), "baseLineno", 0);
        setIntField(term439129, term439129.getClass(), "endLineno", 0);
        setField(term439129, term439129.getClass(), "functions", null);
        setField(term439129, term439129.getClass(), "regexps", null);
        setField(term439129, term439129.getClass(), "itsVariables", null);
        setField(term439129, term439129.getClass(), "itsConst", null);
        setField(term439129, term439129.getClass(), "itsVariableNames", null);
        setIntField(term439129, term439129.getClass(), "varStart", 0);
        setField(term439129, term439129.getClass(), "compilerData", null);
        setIntField(term439129, term439129.getClass(), "type", 33);
        setField(term439129, term439129.getClass(), "next", null);
        setField(term439139, term439139.getClass(), "functionName", null);
        setBooleanField(term439139, term439139.getClass(), "itsNeedsActivation", false);
        setIntField(term439139, term439139.getClass(), "itsFunctionType", 0);
        setBooleanField(term439139, term439139.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term439139, term439139.getClass(), "encodedSourceStart", 0);
        setIntField(term439139, term439139.getClass(), "encodedSourceEnd", 0);
        setField(term439139, term439139.getClass(), "sourceName", null);
        setIntField(term439139, term439139.getClass(), "baseLineno", 0);
        setIntField(term439139, term439139.getClass(), "endLineno", 0);
        setField(term439139, term439139.getClass(), "functions", null);
        setField(term439139, term439139.getClass(), "regexps", null);
        setField(term439139, term439139.getClass(), "itsVariables", null);
        setField(term439139, term439139.getClass(), "itsConst", null);
        setField(term439139, term439139.getClass(), "itsVariableNames", null);
        setIntField(term439139, term439139.getClass(), "varStart", 0);
        setField(term439139, term439139.getClass(), "compilerData", null);
        setIntField(term439139, term439139.getClass(), "type", 0);
        setIntField(term439149, term439149.getClass(), "type", 0);
        setField(term439149, term439149.getClass(), "next", null);
        setField(term439149, term439149.getClass(), "first", null);
        setField(term439149, term439149.getClass(), "last", null);
        setField(term439149, term439149.getClass(), "propListHead", null);
        setIntField(term439149, term439149.getClass(), "sourcePosition", 0);
        setField(term439149, term439149.getClass(), "jsType", null);
        setField(term439149, term439149.getClass(), "parent", null);
        setField(term439139, term439139.getClass(), "next", term439149);
        setField(term439139, term439139.getClass(), "first", null);
        setField(term439139, term439139.getClass(), "last", null);
        setField(term439139, term439139.getClass(), "propListHead", null);
        setIntField(term439139, term439139.getClass(), "sourcePosition", 0);
        setField(term439139, term439139.getClass(), "jsType", null);
        setField(term439139, term439139.getClass(), "parent", null);
        setField(term439129, term439129.getClass(), "first", term439139);
        setField(term439129, term439129.getClass(), "last", null);
        setField(term439129, term439129.getClass(), "propListHead", null);
        setIntField(term439129, term439129.getClass(), "sourcePosition", 0);
        setField(term439129, term439129.getClass(), "jsType", null);
        setField(term439129, term439129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term438958;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term438872, args);
        assertTrue(recursiveEquals(term438872, term439192));
        assertTrue(recursiveEquals(term438958, term439193));
        assertTrue(recursiveEquals(retValue, term439129));
    }

};



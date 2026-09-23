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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217897;
     Object term217983;
     Object term218547;
     Object term218548;
     Object term218503;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term217983 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term218075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term217983, term217983.getClass(), "first", term217983);
        setField(term217983, term217983.getClass(), "next", term218075);
        setIntField(term217983, term217983.getClass(), "type", 33);
        term218547 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term218547, term218547.getClass(), "currentTraversal", null);
        term218548 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term218549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term218548, term218548.getClass(), "functionName", null);
        setBooleanField(term218548, term218548.getClass(), "itsNeedsActivation", false);
        setIntField(term218548, term218548.getClass(), "itsFunctionType", 0);
        setBooleanField(term218548, term218548.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term218548, term218548.getClass(), "encodedSourceStart", 0);
        setIntField(term218548, term218548.getClass(), "encodedSourceEnd", 0);
        setField(term218548, term218548.getClass(), "sourceName", null);
        setIntField(term218548, term218548.getClass(), "baseLineno", 0);
        setIntField(term218548, term218548.getClass(), "endLineno", 0);
        setField(term218548, term218548.getClass(), "functions", null);
        setField(term218548, term218548.getClass(), "regexps", null);
        setField(term218548, term218548.getClass(), "itsVariables", null);
        setField(term218548, term218548.getClass(), "itsConst", null);
        setField(term218548, term218548.getClass(), "itsVariableNames", null);
        setIntField(term218548, term218548.getClass(), "varStart", 0);
        setField(term218548, term218548.getClass(), "compilerData", null);
        setIntField(term218548, term218548.getClass(), "type", 33);
        setDoubleField(term218549, term218549.getClass(), "number", 0.0);
        setIntField(term218549, term218549.getClass(), "type", 0);
        setField(term218549, term218549.getClass(), "next", null);
        setField(term218549, term218549.getClass(), "first", null);
        setField(term218549, term218549.getClass(), "last", null);
        setField(term218549, term218549.getClass(), "propListHead", null);
        setIntField(term218549, term218549.getClass(), "sourcePosition", 0);
        setField(term218549, term218549.getClass(), "jsType", null);
        setField(term218549, term218549.getClass(), "parent", null);
        setField(term218548, term218548.getClass(), "next", term218549);
        setField(term218548, term218548.getClass(), "first", term218548);
        setField(term218548, term218548.getClass(), "last", null);
        setField(term218548, term218548.getClass(), "propListHead", null);
        setIntField(term218548, term218548.getClass(), "sourcePosition", 0);
        setField(term218548, term218548.getClass(), "jsType", null);
        setField(term218548, term218548.getClass(), "parent", null);
        term218503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term218513 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term218503, term218503.getClass(), "functionName", null);
        setBooleanField(term218503, term218503.getClass(), "itsNeedsActivation", false);
        setIntField(term218503, term218503.getClass(), "itsFunctionType", 0);
        setBooleanField(term218503, term218503.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term218503, term218503.getClass(), "encodedSourceStart", 0);
        setIntField(term218503, term218503.getClass(), "encodedSourceEnd", 0);
        setField(term218503, term218503.getClass(), "sourceName", null);
        setIntField(term218503, term218503.getClass(), "baseLineno", 0);
        setIntField(term218503, term218503.getClass(), "endLineno", 0);
        setField(term218503, term218503.getClass(), "functions", null);
        setField(term218503, term218503.getClass(), "regexps", null);
        setField(term218503, term218503.getClass(), "itsVariables", null);
        setField(term218503, term218503.getClass(), "itsConst", null);
        setField(term218503, term218503.getClass(), "itsVariableNames", null);
        setIntField(term218503, term218503.getClass(), "varStart", 0);
        setField(term218503, term218503.getClass(), "compilerData", null);
        setIntField(term218503, term218503.getClass(), "type", 33);
        setDoubleField(term218513, term218513.getClass(), "number", 0.0);
        setIntField(term218513, term218513.getClass(), "type", 0);
        setField(term218513, term218513.getClass(), "next", null);
        setField(term218513, term218513.getClass(), "first", null);
        setField(term218513, term218513.getClass(), "last", null);
        setField(term218513, term218513.getClass(), "propListHead", null);
        setIntField(term218513, term218513.getClass(), "sourcePosition", 0);
        setField(term218513, term218513.getClass(), "jsType", null);
        setField(term218513, term218513.getClass(), "parent", null);
        setField(term218503, term218503.getClass(), "next", term218513);
        setField(term218503, term218503.getClass(), "first", term218503);
        setField(term218503, term218503.getClass(), "last", null);
        setField(term218503, term218503.getClass(), "propListHead", null);
        setIntField(term218503, term218503.getClass(), "sourcePosition", 0);
        setField(term218503, term218503.getClass(), "jsType", null);
        setField(term218503, term218503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term217983;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term217897, args);
        assertTrue(recursiveEquals(term217897, term218547));
        assertTrue(recursiveEquals(term217983, term218548));
        assertTrue(recursiveEquals(retValue, term218503));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115698;
     Object term115790;
     Object term116115;
     Object term116116;
     Object term116043;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term115790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115882 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115968 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term115968, term115968.getClass(), "type", 42);
        setField(term115882, term115882.getClass(), "next", term115968);
        setIntField(term115882, term115882.getClass(), "type", 42);
        setField(term115790, term115790.getClass(), "first", term115882);
        setIntField(term115790, term115790.getClass(), "type", 16);
        term116115 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term116115, term116115.getClass(), "currentTraversal", null);
        term116116 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116117 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term116116, term116116.getClass(), "number", 0.0);
        setIntField(term116116, term116116.getClass(), "type", 16);
        setField(term116116, term116116.getClass(), "next", null);
        setDoubleField(term116117, term116117.getClass(), "number", 0.0);
        setIntField(term116117, term116117.getClass(), "type", 42);
        setField(term116118, term116118.getClass(), "functionName", null);
        setBooleanField(term116118, term116118.getClass(), "itsNeedsActivation", false);
        setIntField(term116118, term116118.getClass(), "itsFunctionType", 0);
        setBooleanField(term116118, term116118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term116118, term116118.getClass(), "encodedSourceStart", 0);
        setIntField(term116118, term116118.getClass(), "encodedSourceEnd", 0);
        setField(term116118, term116118.getClass(), "sourceName", null);
        setIntField(term116118, term116118.getClass(), "baseLineno", 0);
        setIntField(term116118, term116118.getClass(), "endLineno", 0);
        setField(term116118, term116118.getClass(), "functions", null);
        setField(term116118, term116118.getClass(), "regexps", null);
        setField(term116118, term116118.getClass(), "itsVariables", null);
        setField(term116118, term116118.getClass(), "itsConst", null);
        setField(term116118, term116118.getClass(), "itsVariableNames", null);
        setIntField(term116118, term116118.getClass(), "varStart", 0);
        setField(term116118, term116118.getClass(), "compilerData", null);
        setIntField(term116118, term116118.getClass(), "type", 42);
        setField(term116118, term116118.getClass(), "next", null);
        setField(term116118, term116118.getClass(), "first", null);
        setField(term116118, term116118.getClass(), "last", null);
        setField(term116118, term116118.getClass(), "propListHead", null);
        setIntField(term116118, term116118.getClass(), "sourcePosition", 0);
        setField(term116118, term116118.getClass(), "jsType", null);
        setField(term116118, term116118.getClass(), "parent", null);
        setField(term116117, term116117.getClass(), "next", term116118);
        setField(term116117, term116117.getClass(), "first", null);
        setField(term116117, term116117.getClass(), "last", null);
        setField(term116117, term116117.getClass(), "propListHead", null);
        setIntField(term116117, term116117.getClass(), "sourcePosition", 0);
        setField(term116117, term116117.getClass(), "jsType", null);
        setField(term116117, term116117.getClass(), "parent", null);
        setField(term116116, term116116.getClass(), "first", term116117);
        setField(term116116, term116116.getClass(), "last", null);
        setField(term116116, term116116.getClass(), "propListHead", null);
        setIntField(term116116, term116116.getClass(), "sourcePosition", 0);
        setField(term116116, term116116.getClass(), "jsType", null);
        setField(term116116, term116116.getClass(), "parent", null);
        term116043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term116043, term116043.getClass(), "number", 0.0);
        setIntField(term116043, term116043.getClass(), "type", 16);
        setField(term116043, term116043.getClass(), "next", null);
        setDoubleField(term116046, term116046.getClass(), "number", 0.0);
        setIntField(term116046, term116046.getClass(), "type", 42);
        setField(term116049, term116049.getClass(), "functionName", null);
        setBooleanField(term116049, term116049.getClass(), "itsNeedsActivation", false);
        setIntField(term116049, term116049.getClass(), "itsFunctionType", 0);
        setBooleanField(term116049, term116049.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term116049, term116049.getClass(), "encodedSourceStart", 0);
        setIntField(term116049, term116049.getClass(), "encodedSourceEnd", 0);
        setField(term116049, term116049.getClass(), "sourceName", null);
        setIntField(term116049, term116049.getClass(), "baseLineno", 0);
        setIntField(term116049, term116049.getClass(), "endLineno", 0);
        setField(term116049, term116049.getClass(), "functions", null);
        setField(term116049, term116049.getClass(), "regexps", null);
        setField(term116049, term116049.getClass(), "itsVariables", null);
        setField(term116049, term116049.getClass(), "itsConst", null);
        setField(term116049, term116049.getClass(), "itsVariableNames", null);
        setIntField(term116049, term116049.getClass(), "varStart", 0);
        setField(term116049, term116049.getClass(), "compilerData", null);
        setIntField(term116049, term116049.getClass(), "type", 42);
        setField(term116049, term116049.getClass(), "next", null);
        setField(term116049, term116049.getClass(), "first", null);
        setField(term116049, term116049.getClass(), "last", null);
        setField(term116049, term116049.getClass(), "propListHead", null);
        setIntField(term116049, term116049.getClass(), "sourcePosition", 0);
        setField(term116049, term116049.getClass(), "jsType", null);
        setField(term116049, term116049.getClass(), "parent", null);
        setField(term116046, term116046.getClass(), "next", term116049);
        setField(term116046, term116046.getClass(), "first", null);
        setField(term116046, term116046.getClass(), "last", null);
        setField(term116046, term116046.getClass(), "propListHead", null);
        setIntField(term116046, term116046.getClass(), "sourcePosition", 0);
        setField(term116046, term116046.getClass(), "jsType", null);
        setField(term116046, term116046.getClass(), "parent", null);
        setField(term116043, term116043.getClass(), "first", term116046);
        setField(term116043, term116043.getClass(), "last", null);
        setField(term116043, term116043.getClass(), "propListHead", null);
        setIntField(term116043, term116043.getClass(), "sourcePosition", 0);
        setField(term116043, term116043.getClass(), "jsType", null);
        setField(term116043, term116043.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term115790;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term115698, args);
        assertTrue(recursiveEquals(term115698, term116115));
        assertTrue(recursiveEquals(term115790, term116116));
        assertTrue(recursiveEquals(retValue, term116043));
    }

};



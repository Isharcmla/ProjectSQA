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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549724;
     Object term549810;
     Object term549994;
     Object term550086;
     Object term550170;
     Object term550171;
     Object term550173;
     Object term550174;
     Object term550091;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term549810 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term549902, term549902.getClass(), "type", 108);
        setField(term549810, term549810.getClass(), "parent", term549902);
        setIntField(term549810, term549810.getClass(), "type", 100);
        term549994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term549994, term549994.getClass(), "type", 34);
        term550086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term550086, term550086.getClass(), "type", 44);
        term550170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term550170, term550170.getClass(), "currentTraversal", null);
        term550171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term550171, term550171.getClass(), "functionName", null);
        setBooleanField(term550171, term550171.getClass(), "itsNeedsActivation", false);
        setIntField(term550171, term550171.getClass(), "itsFunctionType", 0);
        setBooleanField(term550171, term550171.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term550171, term550171.getClass(), "encodedSourceStart", 0);
        setIntField(term550171, term550171.getClass(), "encodedSourceEnd", 0);
        setField(term550171, term550171.getClass(), "sourceName", null);
        setIntField(term550171, term550171.getClass(), "baseLineno", 0);
        setIntField(term550171, term550171.getClass(), "endLineno", 0);
        setField(term550171, term550171.getClass(), "functions", null);
        setField(term550171, term550171.getClass(), "regexps", null);
        setField(term550171, term550171.getClass(), "itsVariables", null);
        setField(term550171, term550171.getClass(), "itsConst", null);
        setField(term550171, term550171.getClass(), "itsVariableNames", null);
        setIntField(term550171, term550171.getClass(), "varStart", 0);
        setField(term550171, term550171.getClass(), "compilerData", null);
        setIntField(term550171, term550171.getClass(), "type", 100);
        setField(term550171, term550171.getClass(), "next", null);
        setField(term550171, term550171.getClass(), "first", null);
        setField(term550171, term550171.getClass(), "last", null);
        setField(term550171, term550171.getClass(), "propListHead", null);
        setIntField(term550171, term550171.getClass(), "sourcePosition", 0);
        setField(term550171, term550171.getClass(), "jsType", null);
        setDoubleField(term550172, term550172.getClass(), "number", 0.0);
        setIntField(term550172, term550172.getClass(), "type", 108);
        setField(term550172, term550172.getClass(), "next", null);
        setField(term550172, term550172.getClass(), "first", null);
        setField(term550172, term550172.getClass(), "last", null);
        setField(term550172, term550172.getClass(), "propListHead", null);
        setIntField(term550172, term550172.getClass(), "sourcePosition", 0);
        setField(term550172, term550172.getClass(), "jsType", null);
        setField(term550172, term550172.getClass(), "parent", null);
        setField(term550171, term550171.getClass(), "parent", term550172);
        term550173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term550173, term550173.getClass(), "number", 0.0);
        setIntField(term550173, term550173.getClass(), "type", 34);
        setField(term550173, term550173.getClass(), "next", null);
        setField(term550173, term550173.getClass(), "first", null);
        setField(term550173, term550173.getClass(), "last", null);
        setField(term550173, term550173.getClass(), "propListHead", null);
        setIntField(term550173, term550173.getClass(), "sourcePosition", 0);
        setField(term550173, term550173.getClass(), "jsType", null);
        setField(term550173, term550173.getClass(), "parent", null);
        term550174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term550174, term550174.getClass(), "str", null);
        setIntField(term550174, term550174.getClass(), "type", 44);
        setField(term550174, term550174.getClass(), "next", null);
        setField(term550174, term550174.getClass(), "first", null);
        setField(term550174, term550174.getClass(), "last", null);
        setField(term550174, term550174.getClass(), "propListHead", null);
        setIntField(term550174, term550174.getClass(), "sourcePosition", 0);
        setField(term550174, term550174.getClass(), "jsType", null);
        setField(term550174, term550174.getClass(), "parent", null);
        term550091 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term550091, term550091.getClass(), "functionName", null);
        setBooleanField(term550091, term550091.getClass(), "itsNeedsActivation", false);
        setIntField(term550091, term550091.getClass(), "itsFunctionType", 0);
        setBooleanField(term550091, term550091.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term550091, term550091.getClass(), "encodedSourceStart", 0);
        setIntField(term550091, term550091.getClass(), "encodedSourceEnd", 0);
        setField(term550091, term550091.getClass(), "sourceName", null);
        setIntField(term550091, term550091.getClass(), "baseLineno", 0);
        setIntField(term550091, term550091.getClass(), "endLineno", 0);
        setField(term550091, term550091.getClass(), "functions", null);
        setField(term550091, term550091.getClass(), "regexps", null);
        setField(term550091, term550091.getClass(), "itsVariables", null);
        setField(term550091, term550091.getClass(), "itsConst", null);
        setField(term550091, term550091.getClass(), "itsVariableNames", null);
        setIntField(term550091, term550091.getClass(), "varStart", 0);
        setField(term550091, term550091.getClass(), "compilerData", null);
        setIntField(term550091, term550091.getClass(), "type", 100);
        setField(term550091, term550091.getClass(), "next", null);
        setField(term550091, term550091.getClass(), "first", null);
        setField(term550091, term550091.getClass(), "last", null);
        setField(term550091, term550091.getClass(), "propListHead", null);
        setIntField(term550091, term550091.getClass(), "sourcePosition", 0);
        setField(term550091, term550091.getClass(), "jsType", null);
        setDoubleField(term550102, term550102.getClass(), "number", 0.0);
        setIntField(term550102, term550102.getClass(), "type", 108);
        setField(term550102, term550102.getClass(), "next", null);
        setField(term550102, term550102.getClass(), "first", null);
        setField(term550102, term550102.getClass(), "last", null);
        setField(term550102, term550102.getClass(), "propListHead", null);
        setIntField(term550102, term550102.getClass(), "sourcePosition", 0);
        setField(term550102, term550102.getClass(), "jsType", null);
        setField(term550102, term550102.getClass(), "parent", null);
        setField(term550091, term550091.getClass(), "parent", term550102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term549810;
        args[1] = term549994;
        args[2] = term550086;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term549724, args);
        assertTrue(recursiveEquals(term549724, term550170));
        assertTrue(recursiveEquals(term549810, term550171));
        assertTrue(recursiveEquals(term549994, term550173));
        assertTrue(recursiveEquals(term550086, term550174));
        assertTrue(recursiveEquals(retValue, term550091));
    }

};



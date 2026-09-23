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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719933;
     Object term720019;
     Object term720203;
     Object term720295;
     Object term721158;
     Object term721159;
     Object term721161;
     Object term721162;
     Object term721080;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term720019 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term720111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term720111, term720111.getClass(), "type", 108);
        setField(term720019, term720019.getClass(), "parent", term720111);
        setIntField(term720019, term720019.getClass(), "type", 0);
        term720203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term720203, term720203.getClass(), "type", 109);
        term720295 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term720295, term720295.getClass(), "type", 44);
        term721158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term721158, term721158.getClass(), "currentTraversal", null);
        term721159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term721160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term721159, term721159.getClass(), "functionName", null);
        setBooleanField(term721159, term721159.getClass(), "itsNeedsActivation", false);
        setIntField(term721159, term721159.getClass(), "itsFunctionType", 0);
        setBooleanField(term721159, term721159.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term721159, term721159.getClass(), "encodedSourceStart", 0);
        setIntField(term721159, term721159.getClass(), "encodedSourceEnd", 0);
        setField(term721159, term721159.getClass(), "sourceName", null);
        setIntField(term721159, term721159.getClass(), "baseLineno", 0);
        setIntField(term721159, term721159.getClass(), "endLineno", 0);
        setField(term721159, term721159.getClass(), "functions", null);
        setField(term721159, term721159.getClass(), "regexps", null);
        setField(term721159, term721159.getClass(), "itsVariables", null);
        setField(term721159, term721159.getClass(), "itsConst", null);
        setField(term721159, term721159.getClass(), "itsVariableNames", null);
        setIntField(term721159, term721159.getClass(), "varStart", 0);
        setField(term721159, term721159.getClass(), "compilerData", null);
        setIntField(term721159, term721159.getClass(), "type", 0);
        setField(term721159, term721159.getClass(), "next", null);
        setField(term721159, term721159.getClass(), "first", null);
        setField(term721159, term721159.getClass(), "last", null);
        setField(term721159, term721159.getClass(), "propListHead", null);
        setIntField(term721159, term721159.getClass(), "sourcePosition", 0);
        setField(term721159, term721159.getClass(), "jsType", null);
        setDoubleField(term721160, term721160.getClass(), "number", 0.0);
        setIntField(term721160, term721160.getClass(), "type", 108);
        setField(term721160, term721160.getClass(), "next", null);
        setField(term721160, term721160.getClass(), "first", null);
        setField(term721160, term721160.getClass(), "last", null);
        setField(term721160, term721160.getClass(), "propListHead", null);
        setIntField(term721160, term721160.getClass(), "sourcePosition", 0);
        setField(term721160, term721160.getClass(), "jsType", null);
        setField(term721160, term721160.getClass(), "parent", null);
        setField(term721159, term721159.getClass(), "parent", term721160);
        term721161 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term721161, term721161.getClass(), "number", 0.0);
        setIntField(term721161, term721161.getClass(), "type", 109);
        setField(term721161, term721161.getClass(), "next", null);
        setField(term721161, term721161.getClass(), "first", null);
        setField(term721161, term721161.getClass(), "last", null);
        setField(term721161, term721161.getClass(), "propListHead", null);
        setIntField(term721161, term721161.getClass(), "sourcePosition", 0);
        setField(term721161, term721161.getClass(), "jsType", null);
        setField(term721161, term721161.getClass(), "parent", null);
        term721162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term721162, term721162.getClass(), "str", null);
        setIntField(term721162, term721162.getClass(), "type", 44);
        setField(term721162, term721162.getClass(), "next", null);
        setField(term721162, term721162.getClass(), "first", null);
        setField(term721162, term721162.getClass(), "last", null);
        setField(term721162, term721162.getClass(), "propListHead", null);
        setIntField(term721162, term721162.getClass(), "sourcePosition", 0);
        setField(term721162, term721162.getClass(), "jsType", null);
        setField(term721162, term721162.getClass(), "parent", null);
        term721080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term721091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term721080, term721080.getClass(), "functionName", null);
        setBooleanField(term721080, term721080.getClass(), "itsNeedsActivation", false);
        setIntField(term721080, term721080.getClass(), "itsFunctionType", 0);
        setBooleanField(term721080, term721080.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term721080, term721080.getClass(), "encodedSourceStart", 0);
        setIntField(term721080, term721080.getClass(), "encodedSourceEnd", 0);
        setField(term721080, term721080.getClass(), "sourceName", null);
        setIntField(term721080, term721080.getClass(), "baseLineno", 0);
        setIntField(term721080, term721080.getClass(), "endLineno", 0);
        setField(term721080, term721080.getClass(), "functions", null);
        setField(term721080, term721080.getClass(), "regexps", null);
        setField(term721080, term721080.getClass(), "itsVariables", null);
        setField(term721080, term721080.getClass(), "itsConst", null);
        setField(term721080, term721080.getClass(), "itsVariableNames", null);
        setIntField(term721080, term721080.getClass(), "varStart", 0);
        setField(term721080, term721080.getClass(), "compilerData", null);
        setIntField(term721080, term721080.getClass(), "type", 0);
        setField(term721080, term721080.getClass(), "next", null);
        setField(term721080, term721080.getClass(), "first", null);
        setField(term721080, term721080.getClass(), "last", null);
        setField(term721080, term721080.getClass(), "propListHead", null);
        setIntField(term721080, term721080.getClass(), "sourcePosition", 0);
        setField(term721080, term721080.getClass(), "jsType", null);
        setDoubleField(term721091, term721091.getClass(), "number", 0.0);
        setIntField(term721091, term721091.getClass(), "type", 108);
        setField(term721091, term721091.getClass(), "next", null);
        setField(term721091, term721091.getClass(), "first", null);
        setField(term721091, term721091.getClass(), "last", null);
        setField(term721091, term721091.getClass(), "propListHead", null);
        setIntField(term721091, term721091.getClass(), "sourcePosition", 0);
        setField(term721091, term721091.getClass(), "jsType", null);
        setField(term721091, term721091.getClass(), "parent", null);
        setField(term721080, term721080.getClass(), "parent", term721091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term720019;
        args[1] = term720203;
        args[2] = term720295;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term719933, args);
        assertTrue(recursiveEquals(term719933, term721158));
        assertTrue(recursiveEquals(term720019, term721159));
        assertTrue(recursiveEquals(term720203, term721161));
        assertTrue(recursiveEquals(term720295, term721162));
        assertTrue(recursiveEquals(retValue, term721080));
    }

};



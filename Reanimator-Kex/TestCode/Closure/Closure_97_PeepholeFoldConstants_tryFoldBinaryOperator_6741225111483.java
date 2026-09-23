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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550583;
     Object term550675;
     Object term551410;
     Object term551411;
     Object term551358;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550583 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term550675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term550761 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term550831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term550761, term550761.getClass(), "next", term550831);
        setField(term550675, term550675.getClass(), "first", term550761);
        setIntField(term550675, term550675.getClass(), "type", 15);
        term551410 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term551410, term551410.getClass(), "currentTraversal", null);
        term551411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term551412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term551411, term551411.getClass(), "number", 0.0);
        setIntField(term551411, term551411.getClass(), "type", 15);
        setField(term551411, term551411.getClass(), "next", null);
        setField(term551412, term551412.getClass(), "functionName", null);
        setBooleanField(term551412, term551412.getClass(), "itsNeedsActivation", false);
        setIntField(term551412, term551412.getClass(), "itsFunctionType", 0);
        setBooleanField(term551412, term551412.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551412, term551412.getClass(), "encodedSourceStart", 0);
        setIntField(term551412, term551412.getClass(), "encodedSourceEnd", 0);
        setField(term551412, term551412.getClass(), "sourceName", null);
        setIntField(term551412, term551412.getClass(), "baseLineno", 0);
        setIntField(term551412, term551412.getClass(), "endLineno", 0);
        setField(term551412, term551412.getClass(), "functions", null);
        setField(term551412, term551412.getClass(), "regexps", null);
        setField(term551412, term551412.getClass(), "itsVariables", null);
        setField(term551412, term551412.getClass(), "itsConst", null);
        setField(term551412, term551412.getClass(), "itsVariableNames", null);
        setIntField(term551412, term551412.getClass(), "varStart", 0);
        setField(term551412, term551412.getClass(), "compilerData", null);
        setIntField(term551412, term551412.getClass(), "type", 0);
        setIntField(term551413, term551413.getClass(), "type", 0);
        setField(term551413, term551413.getClass(), "next", null);
        setField(term551413, term551413.getClass(), "first", null);
        setField(term551413, term551413.getClass(), "last", null);
        setField(term551413, term551413.getClass(), "propListHead", null);
        setIntField(term551413, term551413.getClass(), "sourcePosition", 0);
        setField(term551413, term551413.getClass(), "jsType", null);
        setField(term551413, term551413.getClass(), "parent", null);
        setField(term551412, term551412.getClass(), "next", term551413);
        setField(term551412, term551412.getClass(), "first", null);
        setField(term551412, term551412.getClass(), "last", null);
        setField(term551412, term551412.getClass(), "propListHead", null);
        setIntField(term551412, term551412.getClass(), "sourcePosition", 0);
        setField(term551412, term551412.getClass(), "jsType", null);
        setField(term551412, term551412.getClass(), "parent", null);
        setField(term551411, term551411.getClass(), "first", term551412);
        setField(term551411, term551411.getClass(), "last", null);
        setField(term551411, term551411.getClass(), "propListHead", null);
        setIntField(term551411, term551411.getClass(), "sourcePosition", 0);
        setField(term551411, term551411.getClass(), "jsType", null);
        setField(term551411, term551411.getClass(), "parent", null);
        term551358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term551361 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term551358, term551358.getClass(), "number", 0.0);
        setIntField(term551358, term551358.getClass(), "type", 15);
        setField(term551358, term551358.getClass(), "next", null);
        setField(term551361, term551361.getClass(), "functionName", null);
        setBooleanField(term551361, term551361.getClass(), "itsNeedsActivation", false);
        setIntField(term551361, term551361.getClass(), "itsFunctionType", 0);
        setBooleanField(term551361, term551361.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551361, term551361.getClass(), "encodedSourceStart", 0);
        setIntField(term551361, term551361.getClass(), "encodedSourceEnd", 0);
        setField(term551361, term551361.getClass(), "sourceName", null);
        setIntField(term551361, term551361.getClass(), "baseLineno", 0);
        setIntField(term551361, term551361.getClass(), "endLineno", 0);
        setField(term551361, term551361.getClass(), "functions", null);
        setField(term551361, term551361.getClass(), "regexps", null);
        setField(term551361, term551361.getClass(), "itsVariables", null);
        setField(term551361, term551361.getClass(), "itsConst", null);
        setField(term551361, term551361.getClass(), "itsVariableNames", null);
        setIntField(term551361, term551361.getClass(), "varStart", 0);
        setField(term551361, term551361.getClass(), "compilerData", null);
        setIntField(term551361, term551361.getClass(), "type", 0);
        setIntField(term551371, term551371.getClass(), "type", 0);
        setField(term551371, term551371.getClass(), "next", null);
        setField(term551371, term551371.getClass(), "first", null);
        setField(term551371, term551371.getClass(), "last", null);
        setField(term551371, term551371.getClass(), "propListHead", null);
        setIntField(term551371, term551371.getClass(), "sourcePosition", 0);
        setField(term551371, term551371.getClass(), "jsType", null);
        setField(term551371, term551371.getClass(), "parent", null);
        setField(term551361, term551361.getClass(), "next", term551371);
        setField(term551361, term551361.getClass(), "first", null);
        setField(term551361, term551361.getClass(), "last", null);
        setField(term551361, term551361.getClass(), "propListHead", null);
        setIntField(term551361, term551361.getClass(), "sourcePosition", 0);
        setField(term551361, term551361.getClass(), "jsType", null);
        setField(term551361, term551361.getClass(), "parent", null);
        setField(term551358, term551358.getClass(), "first", term551361);
        setField(term551358, term551358.getClass(), "last", null);
        setField(term551358, term551358.getClass(), "propListHead", null);
        setIntField(term551358, term551358.getClass(), "sourcePosition", 0);
        setField(term551358, term551358.getClass(), "jsType", null);
        setField(term551358, term551358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term550675;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term550583, args);
        assertTrue(recursiveEquals(term550583, term551410));
        assertTrue(recursiveEquals(term550675, term551411));
        assertTrue(recursiveEquals(retValue, term551358));
    }

};



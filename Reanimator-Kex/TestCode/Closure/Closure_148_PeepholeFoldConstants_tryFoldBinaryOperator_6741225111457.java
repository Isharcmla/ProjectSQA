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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360630;
     Object term360722;
     Object term361485;
     Object term361486;
     Object term361403;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360630 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term360722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360808 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term360894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term360808, term360808.getClass(), "next", term360894);
        setIntField(term360808, term360808.getClass(), "type", 102);
        setField(term360722, term360722.getClass(), "first", term360808);
        setIntField(term360722, term360722.getClass(), "type", 16);
        term361485 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term361485, term361485.getClass(), "currentTraversal", null);
        term361486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361487 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term361488 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361486, term361486.getClass(), "str", null);
        setIntField(term361486, term361486.getClass(), "type", 16);
        setField(term361486, term361486.getClass(), "next", null);
        setField(term361487, term361487.getClass(), "functionName", null);
        setBooleanField(term361487, term361487.getClass(), "itsNeedsActivation", false);
        setIntField(term361487, term361487.getClass(), "itsFunctionType", 0);
        setBooleanField(term361487, term361487.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361487, term361487.getClass(), "encodedSourceStart", 0);
        setIntField(term361487, term361487.getClass(), "encodedSourceEnd", 0);
        setField(term361487, term361487.getClass(), "sourceName", null);
        setIntField(term361487, term361487.getClass(), "baseLineno", 0);
        setIntField(term361487, term361487.getClass(), "endLineno", 0);
        setField(term361487, term361487.getClass(), "functions", null);
        setField(term361487, term361487.getClass(), "regexps", null);
        setField(term361487, term361487.getClass(), "itsVariables", null);
        setField(term361487, term361487.getClass(), "itsConst", null);
        setField(term361487, term361487.getClass(), "itsVariableNames", null);
        setIntField(term361487, term361487.getClass(), "varStart", 0);
        setField(term361487, term361487.getClass(), "compilerData", null);
        setIntField(term361487, term361487.getClass(), "type", 102);
        setField(term361488, term361488.getClass(), "functionName", null);
        setBooleanField(term361488, term361488.getClass(), "itsNeedsActivation", false);
        setIntField(term361488, term361488.getClass(), "itsFunctionType", 0);
        setBooleanField(term361488, term361488.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361488, term361488.getClass(), "encodedSourceStart", 0);
        setIntField(term361488, term361488.getClass(), "encodedSourceEnd", 0);
        setField(term361488, term361488.getClass(), "sourceName", null);
        setIntField(term361488, term361488.getClass(), "baseLineno", 0);
        setIntField(term361488, term361488.getClass(), "endLineno", 0);
        setField(term361488, term361488.getClass(), "functions", null);
        setField(term361488, term361488.getClass(), "regexps", null);
        setField(term361488, term361488.getClass(), "itsVariables", null);
        setField(term361488, term361488.getClass(), "itsConst", null);
        setField(term361488, term361488.getClass(), "itsVariableNames", null);
        setIntField(term361488, term361488.getClass(), "varStart", 0);
        setField(term361488, term361488.getClass(), "compilerData", null);
        setIntField(term361488, term361488.getClass(), "type", 0);
        setField(term361488, term361488.getClass(), "next", null);
        setField(term361488, term361488.getClass(), "first", null);
        setField(term361488, term361488.getClass(), "last", null);
        setField(term361488, term361488.getClass(), "propListHead", null);
        setIntField(term361488, term361488.getClass(), "sourcePosition", 0);
        setField(term361488, term361488.getClass(), "jsType", null);
        setField(term361488, term361488.getClass(), "parent", null);
        setField(term361487, term361487.getClass(), "next", term361488);
        setField(term361487, term361487.getClass(), "first", null);
        setField(term361487, term361487.getClass(), "last", null);
        setField(term361487, term361487.getClass(), "propListHead", null);
        setIntField(term361487, term361487.getClass(), "sourcePosition", 0);
        setField(term361487, term361487.getClass(), "jsType", null);
        setField(term361487, term361487.getClass(), "parent", null);
        setField(term361486, term361486.getClass(), "first", term361487);
        setField(term361486, term361486.getClass(), "last", null);
        setField(term361486, term361486.getClass(), "propListHead", null);
        setIntField(term361486, term361486.getClass(), "sourcePosition", 0);
        setField(term361486, term361486.getClass(), "jsType", null);
        setField(term361486, term361486.getClass(), "parent", null);
        term361403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361405 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term361415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361403, term361403.getClass(), "str", null);
        setIntField(term361403, term361403.getClass(), "type", 16);
        setField(term361403, term361403.getClass(), "next", null);
        setField(term361405, term361405.getClass(), "functionName", null);
        setBooleanField(term361405, term361405.getClass(), "itsNeedsActivation", false);
        setIntField(term361405, term361405.getClass(), "itsFunctionType", 0);
        setBooleanField(term361405, term361405.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361405, term361405.getClass(), "encodedSourceStart", 0);
        setIntField(term361405, term361405.getClass(), "encodedSourceEnd", 0);
        setField(term361405, term361405.getClass(), "sourceName", null);
        setIntField(term361405, term361405.getClass(), "baseLineno", 0);
        setIntField(term361405, term361405.getClass(), "endLineno", 0);
        setField(term361405, term361405.getClass(), "functions", null);
        setField(term361405, term361405.getClass(), "regexps", null);
        setField(term361405, term361405.getClass(), "itsVariables", null);
        setField(term361405, term361405.getClass(), "itsConst", null);
        setField(term361405, term361405.getClass(), "itsVariableNames", null);
        setIntField(term361405, term361405.getClass(), "varStart", 0);
        setField(term361405, term361405.getClass(), "compilerData", null);
        setIntField(term361405, term361405.getClass(), "type", 102);
        setField(term361415, term361415.getClass(), "functionName", null);
        setBooleanField(term361415, term361415.getClass(), "itsNeedsActivation", false);
        setIntField(term361415, term361415.getClass(), "itsFunctionType", 0);
        setBooleanField(term361415, term361415.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361415, term361415.getClass(), "encodedSourceStart", 0);
        setIntField(term361415, term361415.getClass(), "encodedSourceEnd", 0);
        setField(term361415, term361415.getClass(), "sourceName", null);
        setIntField(term361415, term361415.getClass(), "baseLineno", 0);
        setIntField(term361415, term361415.getClass(), "endLineno", 0);
        setField(term361415, term361415.getClass(), "functions", null);
        setField(term361415, term361415.getClass(), "regexps", null);
        setField(term361415, term361415.getClass(), "itsVariables", null);
        setField(term361415, term361415.getClass(), "itsConst", null);
        setField(term361415, term361415.getClass(), "itsVariableNames", null);
        setIntField(term361415, term361415.getClass(), "varStart", 0);
        setField(term361415, term361415.getClass(), "compilerData", null);
        setIntField(term361415, term361415.getClass(), "type", 0);
        setField(term361415, term361415.getClass(), "next", null);
        setField(term361415, term361415.getClass(), "first", null);
        setField(term361415, term361415.getClass(), "last", null);
        setField(term361415, term361415.getClass(), "propListHead", null);
        setIntField(term361415, term361415.getClass(), "sourcePosition", 0);
        setField(term361415, term361415.getClass(), "jsType", null);
        setField(term361415, term361415.getClass(), "parent", null);
        setField(term361405, term361405.getClass(), "next", term361415);
        setField(term361405, term361405.getClass(), "first", null);
        setField(term361405, term361405.getClass(), "last", null);
        setField(term361405, term361405.getClass(), "propListHead", null);
        setIntField(term361405, term361405.getClass(), "sourcePosition", 0);
        setField(term361405, term361405.getClass(), "jsType", null);
        setField(term361405, term361405.getClass(), "parent", null);
        setField(term361403, term361403.getClass(), "first", term361405);
        setField(term361403, term361403.getClass(), "last", null);
        setField(term361403, term361403.getClass(), "propListHead", null);
        setIntField(term361403, term361403.getClass(), "sourcePosition", 0);
        setField(term361403, term361403.getClass(), "jsType", null);
        setField(term361403, term361403.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term360722;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term360630, args);
        assertTrue(recursiveEquals(term360630, term361485));
        assertTrue(recursiveEquals(term360722, term361486));
        assertTrue(recursiveEquals(retValue, term361403));
    }

};



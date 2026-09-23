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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603559;
     Object term603645;
     Object term604369;
     Object term604370;
     Object term604292;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term603645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term603731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term603823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term603731, term603731.getClass(), "next", term603823);
        setIntField(term603731, term603731.getClass(), "type", 24);
        setField(term603645, term603645.getClass(), "first", term603731);
        setIntField(term603645, term603645.getClass(), "type", 16);
        term604369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term604369, term604369.getClass(), "currentTraversal", null);
        term604370 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604372 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term604370, term604370.getClass(), "functionName", null);
        setBooleanField(term604370, term604370.getClass(), "itsNeedsActivation", false);
        setIntField(term604370, term604370.getClass(), "itsFunctionType", 0);
        setBooleanField(term604370, term604370.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604370, term604370.getClass(), "encodedSourceStart", 0);
        setIntField(term604370, term604370.getClass(), "encodedSourceEnd", 0);
        setField(term604370, term604370.getClass(), "sourceName", null);
        setIntField(term604370, term604370.getClass(), "baseLineno", 0);
        setIntField(term604370, term604370.getClass(), "endLineno", 0);
        setField(term604370, term604370.getClass(), "functions", null);
        setField(term604370, term604370.getClass(), "regexps", null);
        setField(term604370, term604370.getClass(), "itsVariables", null);
        setField(term604370, term604370.getClass(), "itsConst", null);
        setField(term604370, term604370.getClass(), "itsVariableNames", null);
        setIntField(term604370, term604370.getClass(), "varStart", 0);
        setField(term604370, term604370.getClass(), "compilerData", null);
        setIntField(term604370, term604370.getClass(), "type", 16);
        setField(term604370, term604370.getClass(), "next", null);
        setField(term604371, term604371.getClass(), "functionName", null);
        setBooleanField(term604371, term604371.getClass(), "itsNeedsActivation", false);
        setIntField(term604371, term604371.getClass(), "itsFunctionType", 0);
        setBooleanField(term604371, term604371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604371, term604371.getClass(), "encodedSourceStart", 0);
        setIntField(term604371, term604371.getClass(), "encodedSourceEnd", 0);
        setField(term604371, term604371.getClass(), "sourceName", null);
        setIntField(term604371, term604371.getClass(), "baseLineno", 0);
        setIntField(term604371, term604371.getClass(), "endLineno", 0);
        setField(term604371, term604371.getClass(), "functions", null);
        setField(term604371, term604371.getClass(), "regexps", null);
        setField(term604371, term604371.getClass(), "itsVariables", null);
        setField(term604371, term604371.getClass(), "itsConst", null);
        setField(term604371, term604371.getClass(), "itsVariableNames", null);
        setIntField(term604371, term604371.getClass(), "varStart", 0);
        setField(term604371, term604371.getClass(), "compilerData", null);
        setIntField(term604371, term604371.getClass(), "type", 24);
        setDoubleField(term604372, term604372.getClass(), "number", 0.0);
        setIntField(term604372, term604372.getClass(), "type", 0);
        setField(term604372, term604372.getClass(), "next", null);
        setField(term604372, term604372.getClass(), "first", null);
        setField(term604372, term604372.getClass(), "last", null);
        setField(term604372, term604372.getClass(), "propListHead", null);
        setIntField(term604372, term604372.getClass(), "sourcePosition", 0);
        setField(term604372, term604372.getClass(), "jsType", null);
        setField(term604372, term604372.getClass(), "parent", null);
        setField(term604371, term604371.getClass(), "next", term604372);
        setField(term604371, term604371.getClass(), "first", null);
        setField(term604371, term604371.getClass(), "last", null);
        setField(term604371, term604371.getClass(), "propListHead", null);
        setIntField(term604371, term604371.getClass(), "sourcePosition", 0);
        setField(term604371, term604371.getClass(), "jsType", null);
        setField(term604371, term604371.getClass(), "parent", null);
        setField(term604370, term604370.getClass(), "first", term604371);
        setField(term604370, term604370.getClass(), "last", null);
        setField(term604370, term604370.getClass(), "propListHead", null);
        setIntField(term604370, term604370.getClass(), "sourcePosition", 0);
        setField(term604370, term604370.getClass(), "jsType", null);
        setField(term604370, term604370.getClass(), "parent", null);
        term604292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term604312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term604292, term604292.getClass(), "functionName", null);
        setBooleanField(term604292, term604292.getClass(), "itsNeedsActivation", false);
        setIntField(term604292, term604292.getClass(), "itsFunctionType", 0);
        setBooleanField(term604292, term604292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604292, term604292.getClass(), "encodedSourceStart", 0);
        setIntField(term604292, term604292.getClass(), "encodedSourceEnd", 0);
        setField(term604292, term604292.getClass(), "sourceName", null);
        setIntField(term604292, term604292.getClass(), "baseLineno", 0);
        setIntField(term604292, term604292.getClass(), "endLineno", 0);
        setField(term604292, term604292.getClass(), "functions", null);
        setField(term604292, term604292.getClass(), "regexps", null);
        setField(term604292, term604292.getClass(), "itsVariables", null);
        setField(term604292, term604292.getClass(), "itsConst", null);
        setField(term604292, term604292.getClass(), "itsVariableNames", null);
        setIntField(term604292, term604292.getClass(), "varStart", 0);
        setField(term604292, term604292.getClass(), "compilerData", null);
        setIntField(term604292, term604292.getClass(), "type", 16);
        setField(term604292, term604292.getClass(), "next", null);
        setField(term604302, term604302.getClass(), "functionName", null);
        setBooleanField(term604302, term604302.getClass(), "itsNeedsActivation", false);
        setIntField(term604302, term604302.getClass(), "itsFunctionType", 0);
        setBooleanField(term604302, term604302.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term604302, term604302.getClass(), "encodedSourceStart", 0);
        setIntField(term604302, term604302.getClass(), "encodedSourceEnd", 0);
        setField(term604302, term604302.getClass(), "sourceName", null);
        setIntField(term604302, term604302.getClass(), "baseLineno", 0);
        setIntField(term604302, term604302.getClass(), "endLineno", 0);
        setField(term604302, term604302.getClass(), "functions", null);
        setField(term604302, term604302.getClass(), "regexps", null);
        setField(term604302, term604302.getClass(), "itsVariables", null);
        setField(term604302, term604302.getClass(), "itsConst", null);
        setField(term604302, term604302.getClass(), "itsVariableNames", null);
        setIntField(term604302, term604302.getClass(), "varStart", 0);
        setField(term604302, term604302.getClass(), "compilerData", null);
        setIntField(term604302, term604302.getClass(), "type", 24);
        setDoubleField(term604312, term604312.getClass(), "number", 0.0);
        setIntField(term604312, term604312.getClass(), "type", 0);
        setField(term604312, term604312.getClass(), "next", null);
        setField(term604312, term604312.getClass(), "first", null);
        setField(term604312, term604312.getClass(), "last", null);
        setField(term604312, term604312.getClass(), "propListHead", null);
        setIntField(term604312, term604312.getClass(), "sourcePosition", 0);
        setField(term604312, term604312.getClass(), "jsType", null);
        setField(term604312, term604312.getClass(), "parent", null);
        setField(term604302, term604302.getClass(), "next", term604312);
        setField(term604302, term604302.getClass(), "first", null);
        setField(term604302, term604302.getClass(), "last", null);
        setField(term604302, term604302.getClass(), "propListHead", null);
        setIntField(term604302, term604302.getClass(), "sourcePosition", 0);
        setField(term604302, term604302.getClass(), "jsType", null);
        setField(term604302, term604302.getClass(), "parent", null);
        setField(term604292, term604292.getClass(), "first", term604302);
        setField(term604292, term604292.getClass(), "last", null);
        setField(term604292, term604292.getClass(), "propListHead", null);
        setIntField(term604292, term604292.getClass(), "sourcePosition", 0);
        setField(term604292, term604292.getClass(), "jsType", null);
        setField(term604292, term604292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term603645;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term603559, args);
        assertTrue(recursiveEquals(term603559, term604369));
        assertTrue(recursiveEquals(term603645, term604370));
        assertTrue(recursiveEquals(retValue, term604292));
    }

};



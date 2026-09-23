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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437510;
     Object term437596;
     Object term438358;
     Object term438359;
     Object term438292;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term437596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437682 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term437752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term437682, term437682.getClass(), "next", term437752);
        setField(term437596, term437596.getClass(), "first", term437682);
        setIntField(term437596, term437596.getClass(), "type", 52);
        term438358 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term438358, term438358.getClass(), "currentTraversal", null);
        term438359 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term438359, term438359.getClass(), "functionName", null);
        setBooleanField(term438359, term438359.getClass(), "itsNeedsActivation", false);
        setIntField(term438359, term438359.getClass(), "itsFunctionType", 0);
        setBooleanField(term438359, term438359.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438359, term438359.getClass(), "encodedSourceStart", 0);
        setIntField(term438359, term438359.getClass(), "encodedSourceEnd", 0);
        setField(term438359, term438359.getClass(), "sourceName", null);
        setIntField(term438359, term438359.getClass(), "baseLineno", 0);
        setIntField(term438359, term438359.getClass(), "endLineno", 0);
        setField(term438359, term438359.getClass(), "functions", null);
        setField(term438359, term438359.getClass(), "regexps", null);
        setField(term438359, term438359.getClass(), "itsVariables", null);
        setField(term438359, term438359.getClass(), "itsConst", null);
        setField(term438359, term438359.getClass(), "itsVariableNames", null);
        setIntField(term438359, term438359.getClass(), "varStart", 0);
        setField(term438359, term438359.getClass(), "compilerData", null);
        setIntField(term438359, term438359.getClass(), "type", 52);
        setField(term438359, term438359.getClass(), "next", null);
        setField(term438360, term438360.getClass(), "functionName", null);
        setBooleanField(term438360, term438360.getClass(), "itsNeedsActivation", false);
        setIntField(term438360, term438360.getClass(), "itsFunctionType", 0);
        setBooleanField(term438360, term438360.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438360, term438360.getClass(), "encodedSourceStart", 0);
        setIntField(term438360, term438360.getClass(), "encodedSourceEnd", 0);
        setField(term438360, term438360.getClass(), "sourceName", null);
        setIntField(term438360, term438360.getClass(), "baseLineno", 0);
        setIntField(term438360, term438360.getClass(), "endLineno", 0);
        setField(term438360, term438360.getClass(), "functions", null);
        setField(term438360, term438360.getClass(), "regexps", null);
        setField(term438360, term438360.getClass(), "itsVariables", null);
        setField(term438360, term438360.getClass(), "itsConst", null);
        setField(term438360, term438360.getClass(), "itsVariableNames", null);
        setIntField(term438360, term438360.getClass(), "varStart", 0);
        setField(term438360, term438360.getClass(), "compilerData", null);
        setIntField(term438360, term438360.getClass(), "type", 0);
        setIntField(term438361, term438361.getClass(), "type", 0);
        setField(term438361, term438361.getClass(), "next", null);
        setField(term438361, term438361.getClass(), "first", null);
        setField(term438361, term438361.getClass(), "last", null);
        setField(term438361, term438361.getClass(), "propListHead", null);
        setIntField(term438361, term438361.getClass(), "sourcePosition", 0);
        setField(term438361, term438361.getClass(), "jsType", null);
        setField(term438361, term438361.getClass(), "parent", null);
        setField(term438360, term438360.getClass(), "next", term438361);
        setField(term438360, term438360.getClass(), "first", null);
        setField(term438360, term438360.getClass(), "last", null);
        setField(term438360, term438360.getClass(), "propListHead", null);
        setIntField(term438360, term438360.getClass(), "sourcePosition", 0);
        setField(term438360, term438360.getClass(), "jsType", null);
        setField(term438360, term438360.getClass(), "parent", null);
        setField(term438359, term438359.getClass(), "first", term438360);
        setField(term438359, term438359.getClass(), "last", null);
        setField(term438359, term438359.getClass(), "propListHead", null);
        setIntField(term438359, term438359.getClass(), "sourcePosition", 0);
        setField(term438359, term438359.getClass(), "jsType", null);
        setField(term438359, term438359.getClass(), "parent", null);
        term438292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term438292, term438292.getClass(), "functionName", null);
        setBooleanField(term438292, term438292.getClass(), "itsNeedsActivation", false);
        setIntField(term438292, term438292.getClass(), "itsFunctionType", 0);
        setBooleanField(term438292, term438292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438292, term438292.getClass(), "encodedSourceStart", 0);
        setIntField(term438292, term438292.getClass(), "encodedSourceEnd", 0);
        setField(term438292, term438292.getClass(), "sourceName", null);
        setIntField(term438292, term438292.getClass(), "baseLineno", 0);
        setIntField(term438292, term438292.getClass(), "endLineno", 0);
        setField(term438292, term438292.getClass(), "functions", null);
        setField(term438292, term438292.getClass(), "regexps", null);
        setField(term438292, term438292.getClass(), "itsVariables", null);
        setField(term438292, term438292.getClass(), "itsConst", null);
        setField(term438292, term438292.getClass(), "itsVariableNames", null);
        setIntField(term438292, term438292.getClass(), "varStart", 0);
        setField(term438292, term438292.getClass(), "compilerData", null);
        setIntField(term438292, term438292.getClass(), "type", 52);
        setField(term438292, term438292.getClass(), "next", null);
        setField(term438302, term438302.getClass(), "functionName", null);
        setBooleanField(term438302, term438302.getClass(), "itsNeedsActivation", false);
        setIntField(term438302, term438302.getClass(), "itsFunctionType", 0);
        setBooleanField(term438302, term438302.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term438302, term438302.getClass(), "encodedSourceStart", 0);
        setIntField(term438302, term438302.getClass(), "encodedSourceEnd", 0);
        setField(term438302, term438302.getClass(), "sourceName", null);
        setIntField(term438302, term438302.getClass(), "baseLineno", 0);
        setIntField(term438302, term438302.getClass(), "endLineno", 0);
        setField(term438302, term438302.getClass(), "functions", null);
        setField(term438302, term438302.getClass(), "regexps", null);
        setField(term438302, term438302.getClass(), "itsVariables", null);
        setField(term438302, term438302.getClass(), "itsConst", null);
        setField(term438302, term438302.getClass(), "itsVariableNames", null);
        setIntField(term438302, term438302.getClass(), "varStart", 0);
        setField(term438302, term438302.getClass(), "compilerData", null);
        setIntField(term438302, term438302.getClass(), "type", 0);
        setIntField(term438312, term438312.getClass(), "type", 0);
        setField(term438312, term438312.getClass(), "next", null);
        setField(term438312, term438312.getClass(), "first", null);
        setField(term438312, term438312.getClass(), "last", null);
        setField(term438312, term438312.getClass(), "propListHead", null);
        setIntField(term438312, term438312.getClass(), "sourcePosition", 0);
        setField(term438312, term438312.getClass(), "jsType", null);
        setField(term438312, term438312.getClass(), "parent", null);
        setField(term438302, term438302.getClass(), "next", term438312);
        setField(term438302, term438302.getClass(), "first", null);
        setField(term438302, term438302.getClass(), "last", null);
        setField(term438302, term438302.getClass(), "propListHead", null);
        setIntField(term438302, term438302.getClass(), "sourcePosition", 0);
        setField(term438302, term438302.getClass(), "jsType", null);
        setField(term438302, term438302.getClass(), "parent", null);
        setField(term438292, term438292.getClass(), "first", term438302);
        setField(term438292, term438292.getClass(), "last", null);
        setField(term438292, term438292.getClass(), "propListHead", null);
        setIntField(term438292, term438292.getClass(), "sourcePosition", 0);
        setField(term438292, term438292.getClass(), "jsType", null);
        setField(term438292, term438292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term437596;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term437510, args);
        assertTrue(recursiveEquals(term437510, term438358));
        assertTrue(recursiveEquals(term437596, term438359));
        assertTrue(recursiveEquals(retValue, term438292));
    }

};



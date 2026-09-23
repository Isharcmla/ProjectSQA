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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245643;
     Object term245729;
     Object term246318;
     Object term246319;
     Object term246242;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245643 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term245729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term245815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term245729, term245729.getClass(), "first", term245729);
        setField(term245729, term245729.getClass(), "next", term245815);
        setIntField(term245729, term245729.getClass(), "type", 16);
        term246318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term246318, term246318.getClass(), "currentTraversal", null);
        term246319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term246319, term246319.getClass(), "functionName", null);
        setBooleanField(term246319, term246319.getClass(), "itsNeedsActivation", false);
        setIntField(term246319, term246319.getClass(), "itsFunctionType", 0);
        setBooleanField(term246319, term246319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246319, term246319.getClass(), "encodedSourceStart", 0);
        setIntField(term246319, term246319.getClass(), "encodedSourceEnd", 0);
        setField(term246319, term246319.getClass(), "sourceName", null);
        setIntField(term246319, term246319.getClass(), "baseLineno", 0);
        setIntField(term246319, term246319.getClass(), "endLineno", 0);
        setField(term246319, term246319.getClass(), "functions", null);
        setField(term246319, term246319.getClass(), "regexps", null);
        setField(term246319, term246319.getClass(), "itsVariables", null);
        setField(term246319, term246319.getClass(), "itsConst", null);
        setField(term246319, term246319.getClass(), "itsVariableNames", null);
        setIntField(term246319, term246319.getClass(), "varStart", 0);
        setField(term246319, term246319.getClass(), "compilerData", null);
        setIntField(term246319, term246319.getClass(), "type", 16);
        setField(term246320, term246320.getClass(), "functionName", null);
        setBooleanField(term246320, term246320.getClass(), "itsNeedsActivation", false);
        setIntField(term246320, term246320.getClass(), "itsFunctionType", 0);
        setBooleanField(term246320, term246320.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246320, term246320.getClass(), "encodedSourceStart", 0);
        setIntField(term246320, term246320.getClass(), "encodedSourceEnd", 0);
        setField(term246320, term246320.getClass(), "sourceName", null);
        setIntField(term246320, term246320.getClass(), "baseLineno", 0);
        setIntField(term246320, term246320.getClass(), "endLineno", 0);
        setField(term246320, term246320.getClass(), "functions", null);
        setField(term246320, term246320.getClass(), "regexps", null);
        setField(term246320, term246320.getClass(), "itsVariables", null);
        setField(term246320, term246320.getClass(), "itsConst", null);
        setField(term246320, term246320.getClass(), "itsVariableNames", null);
        setIntField(term246320, term246320.getClass(), "varStart", 0);
        setField(term246320, term246320.getClass(), "compilerData", null);
        setIntField(term246320, term246320.getClass(), "type", 0);
        setField(term246320, term246320.getClass(), "next", null);
        setField(term246320, term246320.getClass(), "first", null);
        setField(term246320, term246320.getClass(), "last", null);
        setField(term246320, term246320.getClass(), "propListHead", null);
        setIntField(term246320, term246320.getClass(), "sourcePosition", 0);
        setField(term246320, term246320.getClass(), "jsType", null);
        setField(term246320, term246320.getClass(), "parent", null);
        setField(term246319, term246319.getClass(), "next", term246320);
        setField(term246319, term246319.getClass(), "first", term246319);
        setField(term246319, term246319.getClass(), "last", null);
        setField(term246319, term246319.getClass(), "propListHead", null);
        setIntField(term246319, term246319.getClass(), "sourcePosition", 0);
        setField(term246319, term246319.getClass(), "jsType", null);
        setField(term246319, term246319.getClass(), "parent", null);
        term246242 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term246252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term246242, term246242.getClass(), "functionName", null);
        setBooleanField(term246242, term246242.getClass(), "itsNeedsActivation", false);
        setIntField(term246242, term246242.getClass(), "itsFunctionType", 0);
        setBooleanField(term246242, term246242.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246242, term246242.getClass(), "encodedSourceStart", 0);
        setIntField(term246242, term246242.getClass(), "encodedSourceEnd", 0);
        setField(term246242, term246242.getClass(), "sourceName", null);
        setIntField(term246242, term246242.getClass(), "baseLineno", 0);
        setIntField(term246242, term246242.getClass(), "endLineno", 0);
        setField(term246242, term246242.getClass(), "functions", null);
        setField(term246242, term246242.getClass(), "regexps", null);
        setField(term246242, term246242.getClass(), "itsVariables", null);
        setField(term246242, term246242.getClass(), "itsConst", null);
        setField(term246242, term246242.getClass(), "itsVariableNames", null);
        setIntField(term246242, term246242.getClass(), "varStart", 0);
        setField(term246242, term246242.getClass(), "compilerData", null);
        setIntField(term246242, term246242.getClass(), "type", 16);
        setField(term246252, term246252.getClass(), "functionName", null);
        setBooleanField(term246252, term246252.getClass(), "itsNeedsActivation", false);
        setIntField(term246252, term246252.getClass(), "itsFunctionType", 0);
        setBooleanField(term246252, term246252.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term246252, term246252.getClass(), "encodedSourceStart", 0);
        setIntField(term246252, term246252.getClass(), "encodedSourceEnd", 0);
        setField(term246252, term246252.getClass(), "sourceName", null);
        setIntField(term246252, term246252.getClass(), "baseLineno", 0);
        setIntField(term246252, term246252.getClass(), "endLineno", 0);
        setField(term246252, term246252.getClass(), "functions", null);
        setField(term246252, term246252.getClass(), "regexps", null);
        setField(term246252, term246252.getClass(), "itsVariables", null);
        setField(term246252, term246252.getClass(), "itsConst", null);
        setField(term246252, term246252.getClass(), "itsVariableNames", null);
        setIntField(term246252, term246252.getClass(), "varStart", 0);
        setField(term246252, term246252.getClass(), "compilerData", null);
        setIntField(term246252, term246252.getClass(), "type", 0);
        setField(term246252, term246252.getClass(), "next", null);
        setField(term246252, term246252.getClass(), "first", null);
        setField(term246252, term246252.getClass(), "last", null);
        setField(term246252, term246252.getClass(), "propListHead", null);
        setIntField(term246252, term246252.getClass(), "sourcePosition", 0);
        setField(term246252, term246252.getClass(), "jsType", null);
        setField(term246252, term246252.getClass(), "parent", null);
        setField(term246242, term246242.getClass(), "next", term246252);
        setField(term246242, term246242.getClass(), "first", term246242);
        setField(term246242, term246242.getClass(), "last", null);
        setField(term246242, term246242.getClass(), "propListHead", null);
        setIntField(term246242, term246242.getClass(), "sourcePosition", 0);
        setField(term246242, term246242.getClass(), "jsType", null);
        setField(term246242, term246242.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term245729;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term245643, args);
        assertTrue(recursiveEquals(term245643, term246318));
        assertTrue(recursiveEquals(term245729, term246319));
        assertTrue(recursiveEquals(retValue, term246242));
    }

};



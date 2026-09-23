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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696779;
     Object term696865;
     Object term697165;
     Object term697166;
     Object term697099;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term696865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term696951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term696951, term696951.getClass(), "next", term697021);
        setField(term696865, term696865.getClass(), "first", term696951);
        setIntField(term696865, term696865.getClass(), "type", 46);
        term697165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term697165, term697165.getClass(), "currentTraversal", null);
        term697166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term697166, term697166.getClass(), "functionName", null);
        setBooleanField(term697166, term697166.getClass(), "itsNeedsActivation", false);
        setIntField(term697166, term697166.getClass(), "itsFunctionType", 0);
        setBooleanField(term697166, term697166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697166, term697166.getClass(), "encodedSourceStart", 0);
        setIntField(term697166, term697166.getClass(), "encodedSourceEnd", 0);
        setField(term697166, term697166.getClass(), "sourceName", null);
        setIntField(term697166, term697166.getClass(), "baseLineno", 0);
        setIntField(term697166, term697166.getClass(), "endLineno", 0);
        setField(term697166, term697166.getClass(), "functions", null);
        setField(term697166, term697166.getClass(), "regexps", null);
        setField(term697166, term697166.getClass(), "itsVariables", null);
        setField(term697166, term697166.getClass(), "itsConst", null);
        setField(term697166, term697166.getClass(), "itsVariableNames", null);
        setIntField(term697166, term697166.getClass(), "varStart", 0);
        setField(term697166, term697166.getClass(), "compilerData", null);
        setIntField(term697166, term697166.getClass(), "type", 46);
        setField(term697166, term697166.getClass(), "next", null);
        setField(term697167, term697167.getClass(), "functionName", null);
        setBooleanField(term697167, term697167.getClass(), "itsNeedsActivation", false);
        setIntField(term697167, term697167.getClass(), "itsFunctionType", 0);
        setBooleanField(term697167, term697167.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697167, term697167.getClass(), "encodedSourceStart", 0);
        setIntField(term697167, term697167.getClass(), "encodedSourceEnd", 0);
        setField(term697167, term697167.getClass(), "sourceName", null);
        setIntField(term697167, term697167.getClass(), "baseLineno", 0);
        setIntField(term697167, term697167.getClass(), "endLineno", 0);
        setField(term697167, term697167.getClass(), "functions", null);
        setField(term697167, term697167.getClass(), "regexps", null);
        setField(term697167, term697167.getClass(), "itsVariables", null);
        setField(term697167, term697167.getClass(), "itsConst", null);
        setField(term697167, term697167.getClass(), "itsVariableNames", null);
        setIntField(term697167, term697167.getClass(), "varStart", 0);
        setField(term697167, term697167.getClass(), "compilerData", null);
        setIntField(term697167, term697167.getClass(), "type", 0);
        setIntField(term697168, term697168.getClass(), "type", 0);
        setField(term697168, term697168.getClass(), "next", null);
        setField(term697168, term697168.getClass(), "first", null);
        setField(term697168, term697168.getClass(), "last", null);
        setField(term697168, term697168.getClass(), "propListHead", null);
        setIntField(term697168, term697168.getClass(), "sourcePosition", 0);
        setField(term697168, term697168.getClass(), "jsType", null);
        setField(term697168, term697168.getClass(), "parent", null);
        setField(term697167, term697167.getClass(), "next", term697168);
        setField(term697167, term697167.getClass(), "first", null);
        setField(term697167, term697167.getClass(), "last", null);
        setField(term697167, term697167.getClass(), "propListHead", null);
        setIntField(term697167, term697167.getClass(), "sourcePosition", 0);
        setField(term697167, term697167.getClass(), "jsType", null);
        setField(term697167, term697167.getClass(), "parent", null);
        setField(term697166, term697166.getClass(), "first", term697167);
        setField(term697166, term697166.getClass(), "last", null);
        setField(term697166, term697166.getClass(), "propListHead", null);
        setIntField(term697166, term697166.getClass(), "sourcePosition", 0);
        setField(term697166, term697166.getClass(), "jsType", null);
        setField(term697166, term697166.getClass(), "parent", null);
        term697099 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697109 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term697119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term697099, term697099.getClass(), "functionName", null);
        setBooleanField(term697099, term697099.getClass(), "itsNeedsActivation", false);
        setIntField(term697099, term697099.getClass(), "itsFunctionType", 0);
        setBooleanField(term697099, term697099.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697099, term697099.getClass(), "encodedSourceStart", 0);
        setIntField(term697099, term697099.getClass(), "encodedSourceEnd", 0);
        setField(term697099, term697099.getClass(), "sourceName", null);
        setIntField(term697099, term697099.getClass(), "baseLineno", 0);
        setIntField(term697099, term697099.getClass(), "endLineno", 0);
        setField(term697099, term697099.getClass(), "functions", null);
        setField(term697099, term697099.getClass(), "regexps", null);
        setField(term697099, term697099.getClass(), "itsVariables", null);
        setField(term697099, term697099.getClass(), "itsConst", null);
        setField(term697099, term697099.getClass(), "itsVariableNames", null);
        setIntField(term697099, term697099.getClass(), "varStart", 0);
        setField(term697099, term697099.getClass(), "compilerData", null);
        setIntField(term697099, term697099.getClass(), "type", 46);
        setField(term697099, term697099.getClass(), "next", null);
        setField(term697109, term697109.getClass(), "functionName", null);
        setBooleanField(term697109, term697109.getClass(), "itsNeedsActivation", false);
        setIntField(term697109, term697109.getClass(), "itsFunctionType", 0);
        setBooleanField(term697109, term697109.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term697109, term697109.getClass(), "encodedSourceStart", 0);
        setIntField(term697109, term697109.getClass(), "encodedSourceEnd", 0);
        setField(term697109, term697109.getClass(), "sourceName", null);
        setIntField(term697109, term697109.getClass(), "baseLineno", 0);
        setIntField(term697109, term697109.getClass(), "endLineno", 0);
        setField(term697109, term697109.getClass(), "functions", null);
        setField(term697109, term697109.getClass(), "regexps", null);
        setField(term697109, term697109.getClass(), "itsVariables", null);
        setField(term697109, term697109.getClass(), "itsConst", null);
        setField(term697109, term697109.getClass(), "itsVariableNames", null);
        setIntField(term697109, term697109.getClass(), "varStart", 0);
        setField(term697109, term697109.getClass(), "compilerData", null);
        setIntField(term697109, term697109.getClass(), "type", 0);
        setIntField(term697119, term697119.getClass(), "type", 0);
        setField(term697119, term697119.getClass(), "next", null);
        setField(term697119, term697119.getClass(), "first", null);
        setField(term697119, term697119.getClass(), "last", null);
        setField(term697119, term697119.getClass(), "propListHead", null);
        setIntField(term697119, term697119.getClass(), "sourcePosition", 0);
        setField(term697119, term697119.getClass(), "jsType", null);
        setField(term697119, term697119.getClass(), "parent", null);
        setField(term697109, term697109.getClass(), "next", term697119);
        setField(term697109, term697109.getClass(), "first", null);
        setField(term697109, term697109.getClass(), "last", null);
        setField(term697109, term697109.getClass(), "propListHead", null);
        setIntField(term697109, term697109.getClass(), "sourcePosition", 0);
        setField(term697109, term697109.getClass(), "jsType", null);
        setField(term697109, term697109.getClass(), "parent", null);
        setField(term697099, term697099.getClass(), "first", term697109);
        setField(term697099, term697099.getClass(), "last", null);
        setField(term697099, term697099.getClass(), "propListHead", null);
        setIntField(term697099, term697099.getClass(), "sourcePosition", 0);
        setField(term697099, term697099.getClass(), "jsType", null);
        setField(term697099, term697099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term696865;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term696779, args);
        assertTrue(recursiveEquals(term696779, term697165));
        assertTrue(recursiveEquals(term696865, term697166));
        assertTrue(recursiveEquals(retValue, term697099));
    }

};



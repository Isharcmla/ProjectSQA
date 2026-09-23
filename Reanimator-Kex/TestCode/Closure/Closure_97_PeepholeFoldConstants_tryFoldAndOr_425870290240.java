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

public class PeepholeFoldConstants_tryFoldAndOr_425870290240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47793;
     Object term47879;
     Object term47969;
     Object term48055;
     Object term48164;
     Object term48165;
     Object term48166;
     Object term48167;
     Object term48105;

    public PeepholeFoldConstants_tryFoldAndOr_425870290240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term47879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term47879, term47879.getClass(), "parent", null);
        setIntField(term47879, term47879.getClass(), "type", 0);
        term47969 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term47969, term47969.getClass(), "type", 0);
        term48055 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term48164 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term48164, term48164.getClass(), "currentTraversal", null);
        term48165 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48165, term48165.getClass(), "functionName", null);
        setBooleanField(term48165, term48165.getClass(), "itsNeedsActivation", false);
        setIntField(term48165, term48165.getClass(), "itsFunctionType", 0);
        setBooleanField(term48165, term48165.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48165, term48165.getClass(), "encodedSourceStart", 0);
        setIntField(term48165, term48165.getClass(), "encodedSourceEnd", 0);
        setField(term48165, term48165.getClass(), "sourceName", null);
        setIntField(term48165, term48165.getClass(), "baseLineno", 0);
        setIntField(term48165, term48165.getClass(), "endLineno", 0);
        setField(term48165, term48165.getClass(), "functions", null);
        setField(term48165, term48165.getClass(), "regexps", null);
        setField(term48165, term48165.getClass(), "itsVariables", null);
        setField(term48165, term48165.getClass(), "itsConst", null);
        setField(term48165, term48165.getClass(), "itsVariableNames", null);
        setIntField(term48165, term48165.getClass(), "varStart", 0);
        setField(term48165, term48165.getClass(), "compilerData", null);
        setIntField(term48165, term48165.getClass(), "type", 0);
        setField(term48165, term48165.getClass(), "next", null);
        setField(term48165, term48165.getClass(), "first", null);
        setField(term48165, term48165.getClass(), "last", null);
        setField(term48165, term48165.getClass(), "propListHead", null);
        setIntField(term48165, term48165.getClass(), "sourcePosition", 0);
        setField(term48165, term48165.getClass(), "jsType", null);
        setField(term48165, term48165.getClass(), "parent", null);
        term48166 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term48166, term48166.getClass(), "encodedSourceStart", 0);
        setIntField(term48166, term48166.getClass(), "encodedSourceEnd", 0);
        setField(term48166, term48166.getClass(), "sourceName", null);
        setIntField(term48166, term48166.getClass(), "baseLineno", 0);
        setIntField(term48166, term48166.getClass(), "endLineno", 0);
        setField(term48166, term48166.getClass(), "functions", null);
        setField(term48166, term48166.getClass(), "regexps", null);
        setField(term48166, term48166.getClass(), "itsVariables", null);
        setField(term48166, term48166.getClass(), "itsConst", null);
        setField(term48166, term48166.getClass(), "itsVariableNames", null);
        setIntField(term48166, term48166.getClass(), "varStart", 0);
        setField(term48166, term48166.getClass(), "compilerData", null);
        setIntField(term48166, term48166.getClass(), "type", 0);
        setField(term48166, term48166.getClass(), "next", null);
        setField(term48166, term48166.getClass(), "first", null);
        setField(term48166, term48166.getClass(), "last", null);
        setField(term48166, term48166.getClass(), "propListHead", null);
        setIntField(term48166, term48166.getClass(), "sourcePosition", 0);
        setField(term48166, term48166.getClass(), "jsType", null);
        setField(term48166, term48166.getClass(), "parent", null);
        term48167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48167, term48167.getClass(), "functionName", null);
        setBooleanField(term48167, term48167.getClass(), "itsNeedsActivation", false);
        setIntField(term48167, term48167.getClass(), "itsFunctionType", 0);
        setBooleanField(term48167, term48167.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48167, term48167.getClass(), "encodedSourceStart", 0);
        setIntField(term48167, term48167.getClass(), "encodedSourceEnd", 0);
        setField(term48167, term48167.getClass(), "sourceName", null);
        setIntField(term48167, term48167.getClass(), "baseLineno", 0);
        setIntField(term48167, term48167.getClass(), "endLineno", 0);
        setField(term48167, term48167.getClass(), "functions", null);
        setField(term48167, term48167.getClass(), "regexps", null);
        setField(term48167, term48167.getClass(), "itsVariables", null);
        setField(term48167, term48167.getClass(), "itsConst", null);
        setField(term48167, term48167.getClass(), "itsVariableNames", null);
        setIntField(term48167, term48167.getClass(), "varStart", 0);
        setField(term48167, term48167.getClass(), "compilerData", null);
        setIntField(term48167, term48167.getClass(), "type", 0);
        setField(term48167, term48167.getClass(), "next", null);
        setField(term48167, term48167.getClass(), "first", null);
        setField(term48167, term48167.getClass(), "last", null);
        setField(term48167, term48167.getClass(), "propListHead", null);
        setIntField(term48167, term48167.getClass(), "sourcePosition", 0);
        setField(term48167, term48167.getClass(), "jsType", null);
        setField(term48167, term48167.getClass(), "parent", null);
        term48105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48105, term48105.getClass(), "functionName", null);
        setBooleanField(term48105, term48105.getClass(), "itsNeedsActivation", false);
        setIntField(term48105, term48105.getClass(), "itsFunctionType", 0);
        setBooleanField(term48105, term48105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48105, term48105.getClass(), "encodedSourceStart", 0);
        setIntField(term48105, term48105.getClass(), "encodedSourceEnd", 0);
        setField(term48105, term48105.getClass(), "sourceName", null);
        setIntField(term48105, term48105.getClass(), "baseLineno", 0);
        setIntField(term48105, term48105.getClass(), "endLineno", 0);
        setField(term48105, term48105.getClass(), "functions", null);
        setField(term48105, term48105.getClass(), "regexps", null);
        setField(term48105, term48105.getClass(), "itsVariables", null);
        setField(term48105, term48105.getClass(), "itsConst", null);
        setField(term48105, term48105.getClass(), "itsVariableNames", null);
        setIntField(term48105, term48105.getClass(), "varStart", 0);
        setField(term48105, term48105.getClass(), "compilerData", null);
        setIntField(term48105, term48105.getClass(), "type", 0);
        setField(term48105, term48105.getClass(), "next", null);
        setField(term48105, term48105.getClass(), "first", null);
        setField(term48105, term48105.getClass(), "last", null);
        setField(term48105, term48105.getClass(), "propListHead", null);
        setIntField(term48105, term48105.getClass(), "sourcePosition", 0);
        setField(term48105, term48105.getClass(), "jsType", null);
        setField(term48105, term48105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term47879;
        args[1] = term47969;
        args[2] = term48055;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term47793, args);
        assertTrue(recursiveEquals(term47793, term48164));
        assertTrue(recursiveEquals(term47879, term48165));
        assertTrue(recursiveEquals(term47969, term48166));
        assertTrue(recursiveEquals(term48055, term48167));
        assertTrue(recursiveEquals(retValue, term48105));
    }

};



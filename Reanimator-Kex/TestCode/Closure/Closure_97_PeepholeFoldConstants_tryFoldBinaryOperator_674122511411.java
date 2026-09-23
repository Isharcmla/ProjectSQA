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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95307;
     Object term95393;
     Object term96067;
     Object term96068;
     Object term96008;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term95393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95479, term95479.getClass(), "next", term95549);
        setField(term95393, term95393.getClass(), "first", term95479);
        setIntField(term95393, term95393.getClass(), "type", 22);
        term96067 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96067, term96067.getClass(), "currentTraversal", null);
        term96068 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96068, term96068.getClass(), "functionName", null);
        setBooleanField(term96068, term96068.getClass(), "itsNeedsActivation", false);
        setIntField(term96068, term96068.getClass(), "itsFunctionType", 0);
        setBooleanField(term96068, term96068.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96068, term96068.getClass(), "encodedSourceStart", 0);
        setIntField(term96068, term96068.getClass(), "encodedSourceEnd", 0);
        setField(term96068, term96068.getClass(), "sourceName", null);
        setIntField(term96068, term96068.getClass(), "baseLineno", 0);
        setIntField(term96068, term96068.getClass(), "endLineno", 0);
        setField(term96068, term96068.getClass(), "functions", null);
        setField(term96068, term96068.getClass(), "regexps", null);
        setField(term96068, term96068.getClass(), "itsVariables", null);
        setField(term96068, term96068.getClass(), "itsConst", null);
        setField(term96068, term96068.getClass(), "itsVariableNames", null);
        setIntField(term96068, term96068.getClass(), "varStart", 0);
        setField(term96068, term96068.getClass(), "compilerData", null);
        setIntField(term96068, term96068.getClass(), "type", 22);
        setField(term96068, term96068.getClass(), "next", null);
        setField(term96069, term96069.getClass(), "functionName", null);
        setBooleanField(term96069, term96069.getClass(), "itsNeedsActivation", false);
        setIntField(term96069, term96069.getClass(), "itsFunctionType", 0);
        setBooleanField(term96069, term96069.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96069, term96069.getClass(), "encodedSourceStart", 0);
        setIntField(term96069, term96069.getClass(), "encodedSourceEnd", 0);
        setField(term96069, term96069.getClass(), "sourceName", null);
        setIntField(term96069, term96069.getClass(), "baseLineno", 0);
        setIntField(term96069, term96069.getClass(), "endLineno", 0);
        setField(term96069, term96069.getClass(), "functions", null);
        setField(term96069, term96069.getClass(), "regexps", null);
        setField(term96069, term96069.getClass(), "itsVariables", null);
        setField(term96069, term96069.getClass(), "itsConst", null);
        setField(term96069, term96069.getClass(), "itsVariableNames", null);
        setIntField(term96069, term96069.getClass(), "varStart", 0);
        setField(term96069, term96069.getClass(), "compilerData", null);
        setIntField(term96069, term96069.getClass(), "type", 0);
        setIntField(term96070, term96070.getClass(), "type", 0);
        setField(term96070, term96070.getClass(), "next", null);
        setField(term96070, term96070.getClass(), "first", null);
        setField(term96070, term96070.getClass(), "last", null);
        setField(term96070, term96070.getClass(), "propListHead", null);
        setIntField(term96070, term96070.getClass(), "sourcePosition", 0);
        setField(term96070, term96070.getClass(), "jsType", null);
        setField(term96070, term96070.getClass(), "parent", null);
        setField(term96069, term96069.getClass(), "next", term96070);
        setField(term96069, term96069.getClass(), "first", null);
        setField(term96069, term96069.getClass(), "last", null);
        setField(term96069, term96069.getClass(), "propListHead", null);
        setIntField(term96069, term96069.getClass(), "sourcePosition", 0);
        setField(term96069, term96069.getClass(), "jsType", null);
        setField(term96069, term96069.getClass(), "parent", null);
        setField(term96068, term96068.getClass(), "first", term96069);
        setField(term96068, term96068.getClass(), "last", null);
        setField(term96068, term96068.getClass(), "propListHead", null);
        setIntField(term96068, term96068.getClass(), "sourcePosition", 0);
        setField(term96068, term96068.getClass(), "jsType", null);
        setField(term96068, term96068.getClass(), "parent", null);
        term96008 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term96028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96008, term96008.getClass(), "functionName", null);
        setBooleanField(term96008, term96008.getClass(), "itsNeedsActivation", false);
        setIntField(term96008, term96008.getClass(), "itsFunctionType", 0);
        setBooleanField(term96008, term96008.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96008, term96008.getClass(), "encodedSourceStart", 0);
        setIntField(term96008, term96008.getClass(), "encodedSourceEnd", 0);
        setField(term96008, term96008.getClass(), "sourceName", null);
        setIntField(term96008, term96008.getClass(), "baseLineno", 0);
        setIntField(term96008, term96008.getClass(), "endLineno", 0);
        setField(term96008, term96008.getClass(), "functions", null);
        setField(term96008, term96008.getClass(), "regexps", null);
        setField(term96008, term96008.getClass(), "itsVariables", null);
        setField(term96008, term96008.getClass(), "itsConst", null);
        setField(term96008, term96008.getClass(), "itsVariableNames", null);
        setIntField(term96008, term96008.getClass(), "varStart", 0);
        setField(term96008, term96008.getClass(), "compilerData", null);
        setIntField(term96008, term96008.getClass(), "type", 22);
        setField(term96008, term96008.getClass(), "next", null);
        setField(term96018, term96018.getClass(), "functionName", null);
        setBooleanField(term96018, term96018.getClass(), "itsNeedsActivation", false);
        setIntField(term96018, term96018.getClass(), "itsFunctionType", 0);
        setBooleanField(term96018, term96018.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term96018, term96018.getClass(), "encodedSourceStart", 0);
        setIntField(term96018, term96018.getClass(), "encodedSourceEnd", 0);
        setField(term96018, term96018.getClass(), "sourceName", null);
        setIntField(term96018, term96018.getClass(), "baseLineno", 0);
        setIntField(term96018, term96018.getClass(), "endLineno", 0);
        setField(term96018, term96018.getClass(), "functions", null);
        setField(term96018, term96018.getClass(), "regexps", null);
        setField(term96018, term96018.getClass(), "itsVariables", null);
        setField(term96018, term96018.getClass(), "itsConst", null);
        setField(term96018, term96018.getClass(), "itsVariableNames", null);
        setIntField(term96018, term96018.getClass(), "varStart", 0);
        setField(term96018, term96018.getClass(), "compilerData", null);
        setIntField(term96018, term96018.getClass(), "type", 0);
        setIntField(term96028, term96028.getClass(), "type", 0);
        setField(term96028, term96028.getClass(), "next", null);
        setField(term96028, term96028.getClass(), "first", null);
        setField(term96028, term96028.getClass(), "last", null);
        setField(term96028, term96028.getClass(), "propListHead", null);
        setIntField(term96028, term96028.getClass(), "sourcePosition", 0);
        setField(term96028, term96028.getClass(), "jsType", null);
        setField(term96028, term96028.getClass(), "parent", null);
        setField(term96018, term96018.getClass(), "next", term96028);
        setField(term96018, term96018.getClass(), "first", null);
        setField(term96018, term96018.getClass(), "last", null);
        setField(term96018, term96018.getClass(), "propListHead", null);
        setIntField(term96018, term96018.getClass(), "sourcePosition", 0);
        setField(term96018, term96018.getClass(), "jsType", null);
        setField(term96018, term96018.getClass(), "parent", null);
        setField(term96008, term96008.getClass(), "first", term96018);
        setField(term96008, term96008.getClass(), "last", null);
        setField(term96008, term96008.getClass(), "propListHead", null);
        setIntField(term96008, term96008.getClass(), "sourcePosition", 0);
        setField(term96008, term96008.getClass(), "jsType", null);
        setField(term96008, term96008.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term95393;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term95307, args);
        assertTrue(recursiveEquals(term95307, term96067));
        assertTrue(recursiveEquals(term95393, term96068));
        assertTrue(recursiveEquals(retValue, term96008));
    }

};



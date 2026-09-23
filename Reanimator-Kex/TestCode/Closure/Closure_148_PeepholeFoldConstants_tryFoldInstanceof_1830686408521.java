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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110511;
     Object term110597;
     Object term110683;
     Object term111253;
     Object term111254;
     Object term111255;
     Object term111222;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term110597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term110597, term110597.getClass(), "type", 52);
        term110683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term111253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term111253, term111253.getClass(), "currentTraversal", null);
        term111254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111254, term111254.getClass(), "functionName", null);
        setBooleanField(term111254, term111254.getClass(), "itsNeedsActivation", false);
        setIntField(term111254, term111254.getClass(), "itsFunctionType", 0);
        setBooleanField(term111254, term111254.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111254, term111254.getClass(), "encodedSourceStart", 0);
        setIntField(term111254, term111254.getClass(), "encodedSourceEnd", 0);
        setField(term111254, term111254.getClass(), "sourceName", null);
        setIntField(term111254, term111254.getClass(), "baseLineno", 0);
        setIntField(term111254, term111254.getClass(), "endLineno", 0);
        setField(term111254, term111254.getClass(), "functions", null);
        setField(term111254, term111254.getClass(), "regexps", null);
        setField(term111254, term111254.getClass(), "itsVariables", null);
        setField(term111254, term111254.getClass(), "itsConst", null);
        setField(term111254, term111254.getClass(), "itsVariableNames", null);
        setIntField(term111254, term111254.getClass(), "varStart", 0);
        setField(term111254, term111254.getClass(), "compilerData", null);
        setIntField(term111254, term111254.getClass(), "type", 52);
        setField(term111254, term111254.getClass(), "next", null);
        setField(term111254, term111254.getClass(), "first", null);
        setField(term111254, term111254.getClass(), "last", null);
        setField(term111254, term111254.getClass(), "propListHead", null);
        setIntField(term111254, term111254.getClass(), "sourcePosition", 0);
        setField(term111254, term111254.getClass(), "jsType", null);
        setField(term111254, term111254.getClass(), "parent", null);
        term111255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111255, term111255.getClass(), "functionName", null);
        setBooleanField(term111255, term111255.getClass(), "itsNeedsActivation", false);
        setIntField(term111255, term111255.getClass(), "itsFunctionType", 0);
        setBooleanField(term111255, term111255.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111255, term111255.getClass(), "encodedSourceStart", 0);
        setIntField(term111255, term111255.getClass(), "encodedSourceEnd", 0);
        setField(term111255, term111255.getClass(), "sourceName", null);
        setIntField(term111255, term111255.getClass(), "baseLineno", 0);
        setIntField(term111255, term111255.getClass(), "endLineno", 0);
        setField(term111255, term111255.getClass(), "functions", null);
        setField(term111255, term111255.getClass(), "regexps", null);
        setField(term111255, term111255.getClass(), "itsVariables", null);
        setField(term111255, term111255.getClass(), "itsConst", null);
        setField(term111255, term111255.getClass(), "itsVariableNames", null);
        setIntField(term111255, term111255.getClass(), "varStart", 0);
        setField(term111255, term111255.getClass(), "compilerData", null);
        setIntField(term111255, term111255.getClass(), "type", 0);
        setField(term111255, term111255.getClass(), "next", null);
        setField(term111255, term111255.getClass(), "first", null);
        setField(term111255, term111255.getClass(), "last", null);
        setField(term111255, term111255.getClass(), "propListHead", null);
        setIntField(term111255, term111255.getClass(), "sourcePosition", 0);
        setField(term111255, term111255.getClass(), "jsType", null);
        setField(term111255, term111255.getClass(), "parent", null);
        term111222 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111222, term111222.getClass(), "functionName", null);
        setBooleanField(term111222, term111222.getClass(), "itsNeedsActivation", false);
        setIntField(term111222, term111222.getClass(), "itsFunctionType", 0);
        setBooleanField(term111222, term111222.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111222, term111222.getClass(), "encodedSourceStart", 0);
        setIntField(term111222, term111222.getClass(), "encodedSourceEnd", 0);
        setField(term111222, term111222.getClass(), "sourceName", null);
        setIntField(term111222, term111222.getClass(), "baseLineno", 0);
        setIntField(term111222, term111222.getClass(), "endLineno", 0);
        setField(term111222, term111222.getClass(), "functions", null);
        setField(term111222, term111222.getClass(), "regexps", null);
        setField(term111222, term111222.getClass(), "itsVariables", null);
        setField(term111222, term111222.getClass(), "itsConst", null);
        setField(term111222, term111222.getClass(), "itsVariableNames", null);
        setIntField(term111222, term111222.getClass(), "varStart", 0);
        setField(term111222, term111222.getClass(), "compilerData", null);
        setIntField(term111222, term111222.getClass(), "type", 52);
        setField(term111222, term111222.getClass(), "next", null);
        setField(term111222, term111222.getClass(), "first", null);
        setField(term111222, term111222.getClass(), "last", null);
        setField(term111222, term111222.getClass(), "propListHead", null);
        setIntField(term111222, term111222.getClass(), "sourcePosition", 0);
        setField(term111222, term111222.getClass(), "jsType", null);
        setField(term111222, term111222.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term110597;
        args[1] = term110683;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term110511, args);
        assertTrue(recursiveEquals(term110511, term111253));
        assertTrue(recursiveEquals(term110597, term111254));
        assertTrue(recursiveEquals(term110683, term111255));
        assertTrue(recursiveEquals(retValue, term111222));
    }

};



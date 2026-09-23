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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722567;
     Object term722659;
     Object term722836;
     Object term722837;
     Object term722790;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722567 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term722659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term722745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term722659, term722659.getClass(), "type", 32);
        setField(term722659, term722659.getClass(), "first", term722745);
        term722836 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term722836, term722836.getClass(), "currentTraversal", null);
        term722837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term722838 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term722837, term722837.getClass(), "str", null);
        setIntField(term722837, term722837.getClass(), "type", 32);
        setField(term722837, term722837.getClass(), "next", null);
        setField(term722838, term722838.getClass(), "functionName", null);
        setBooleanField(term722838, term722838.getClass(), "itsNeedsActivation", false);
        setIntField(term722838, term722838.getClass(), "itsFunctionType", 0);
        setBooleanField(term722838, term722838.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722838, term722838.getClass(), "encodedSourceStart", 0);
        setIntField(term722838, term722838.getClass(), "encodedSourceEnd", 0);
        setField(term722838, term722838.getClass(), "sourceName", null);
        setIntField(term722838, term722838.getClass(), "baseLineno", 0);
        setIntField(term722838, term722838.getClass(), "endLineno", 0);
        setField(term722838, term722838.getClass(), "functions", null);
        setField(term722838, term722838.getClass(), "regexps", null);
        setField(term722838, term722838.getClass(), "itsVariables", null);
        setField(term722838, term722838.getClass(), "itsConst", null);
        setField(term722838, term722838.getClass(), "itsVariableNames", null);
        setIntField(term722838, term722838.getClass(), "varStart", 0);
        setField(term722838, term722838.getClass(), "compilerData", null);
        setIntField(term722838, term722838.getClass(), "type", 0);
        setField(term722838, term722838.getClass(), "next", null);
        setField(term722838, term722838.getClass(), "first", null);
        setField(term722838, term722838.getClass(), "last", null);
        setField(term722838, term722838.getClass(), "propListHead", null);
        setIntField(term722838, term722838.getClass(), "sourcePosition", 0);
        setField(term722838, term722838.getClass(), "jsType", null);
        setField(term722838, term722838.getClass(), "parent", null);
        setField(term722837, term722837.getClass(), "first", term722838);
        setField(term722837, term722837.getClass(), "last", null);
        setField(term722837, term722837.getClass(), "propListHead", null);
        setIntField(term722837, term722837.getClass(), "sourcePosition", 0);
        setField(term722837, term722837.getClass(), "jsType", null);
        setField(term722837, term722837.getClass(), "parent", null);
        term722790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term722792 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term722790, term722790.getClass(), "str", null);
        setIntField(term722790, term722790.getClass(), "type", 32);
        setField(term722790, term722790.getClass(), "next", null);
        setField(term722792, term722792.getClass(), "functionName", null);
        setBooleanField(term722792, term722792.getClass(), "itsNeedsActivation", false);
        setIntField(term722792, term722792.getClass(), "itsFunctionType", 0);
        setBooleanField(term722792, term722792.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term722792, term722792.getClass(), "encodedSourceStart", 0);
        setIntField(term722792, term722792.getClass(), "encodedSourceEnd", 0);
        setField(term722792, term722792.getClass(), "sourceName", null);
        setIntField(term722792, term722792.getClass(), "baseLineno", 0);
        setIntField(term722792, term722792.getClass(), "endLineno", 0);
        setField(term722792, term722792.getClass(), "functions", null);
        setField(term722792, term722792.getClass(), "regexps", null);
        setField(term722792, term722792.getClass(), "itsVariables", null);
        setField(term722792, term722792.getClass(), "itsConst", null);
        setField(term722792, term722792.getClass(), "itsVariableNames", null);
        setIntField(term722792, term722792.getClass(), "varStart", 0);
        setField(term722792, term722792.getClass(), "compilerData", null);
        setIntField(term722792, term722792.getClass(), "type", 0);
        setField(term722792, term722792.getClass(), "next", null);
        setField(term722792, term722792.getClass(), "first", null);
        setField(term722792, term722792.getClass(), "last", null);
        setField(term722792, term722792.getClass(), "propListHead", null);
        setIntField(term722792, term722792.getClass(), "sourcePosition", 0);
        setField(term722792, term722792.getClass(), "jsType", null);
        setField(term722792, term722792.getClass(), "parent", null);
        setField(term722790, term722790.getClass(), "first", term722792);
        setField(term722790, term722790.getClass(), "last", null);
        setField(term722790, term722790.getClass(), "propListHead", null);
        setIntField(term722790, term722790.getClass(), "sourcePosition", 0);
        setField(term722790, term722790.getClass(), "jsType", null);
        setField(term722790, term722790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term722659;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term722567, args);
        assertTrue(recursiveEquals(term722567, term722836));
        assertTrue(recursiveEquals(term722659, term722837));
        assertTrue(recursiveEquals(retValue, term722790));
    }

};



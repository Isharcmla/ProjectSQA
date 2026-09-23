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

public class PeepholeFoldConstants_tryFoldComparison_848443179941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277522;
     Object term277608;
     Object term277694;
     Object term277780;
     Object term303316;
     Object term303317;
     Object term303318;
     Object term303319;
     Object term303280;

    public PeepholeFoldConstants_tryFoldComparison_848443179941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277522 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term277608 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term277608, term277608.getClass(), "type", 14);
        term277694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term277694, term277694.getClass(), "type", 14);
        term277780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term303316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303316, term303316.getClass(), "currentTraversal", null);
        term303317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303317, term303317.getClass(), "functionName", null);
        setBooleanField(term303317, term303317.getClass(), "itsNeedsActivation", false);
        setIntField(term303317, term303317.getClass(), "itsFunctionType", 0);
        setBooleanField(term303317, term303317.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303317, term303317.getClass(), "encodedSourceStart", 0);
        setIntField(term303317, term303317.getClass(), "encodedSourceEnd", 0);
        setField(term303317, term303317.getClass(), "sourceName", null);
        setIntField(term303317, term303317.getClass(), "baseLineno", 0);
        setIntField(term303317, term303317.getClass(), "endLineno", 0);
        setField(term303317, term303317.getClass(), "functions", null);
        setField(term303317, term303317.getClass(), "regexps", null);
        setField(term303317, term303317.getClass(), "itsVariables", null);
        setField(term303317, term303317.getClass(), "itsConst", null);
        setField(term303317, term303317.getClass(), "itsVariableNames", null);
        setIntField(term303317, term303317.getClass(), "varStart", 0);
        setField(term303317, term303317.getClass(), "compilerData", null);
        setIntField(term303317, term303317.getClass(), "type", 14);
        setField(term303317, term303317.getClass(), "next", null);
        setField(term303317, term303317.getClass(), "first", null);
        setField(term303317, term303317.getClass(), "last", null);
        setField(term303317, term303317.getClass(), "propListHead", null);
        setIntField(term303317, term303317.getClass(), "sourcePosition", 0);
        setField(term303317, term303317.getClass(), "jsType", null);
        setField(term303317, term303317.getClass(), "parent", null);
        term303318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303318, term303318.getClass(), "functionName", null);
        setBooleanField(term303318, term303318.getClass(), "itsNeedsActivation", false);
        setIntField(term303318, term303318.getClass(), "itsFunctionType", 0);
        setBooleanField(term303318, term303318.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303318, term303318.getClass(), "encodedSourceStart", 0);
        setIntField(term303318, term303318.getClass(), "encodedSourceEnd", 0);
        setField(term303318, term303318.getClass(), "sourceName", null);
        setIntField(term303318, term303318.getClass(), "baseLineno", 0);
        setIntField(term303318, term303318.getClass(), "endLineno", 0);
        setField(term303318, term303318.getClass(), "functions", null);
        setField(term303318, term303318.getClass(), "regexps", null);
        setField(term303318, term303318.getClass(), "itsVariables", null);
        setField(term303318, term303318.getClass(), "itsConst", null);
        setField(term303318, term303318.getClass(), "itsVariableNames", null);
        setIntField(term303318, term303318.getClass(), "varStart", 0);
        setField(term303318, term303318.getClass(), "compilerData", null);
        setIntField(term303318, term303318.getClass(), "type", 14);
        setField(term303318, term303318.getClass(), "next", null);
        setField(term303318, term303318.getClass(), "first", null);
        setField(term303318, term303318.getClass(), "last", null);
        setField(term303318, term303318.getClass(), "propListHead", null);
        setIntField(term303318, term303318.getClass(), "sourcePosition", 0);
        setField(term303318, term303318.getClass(), "jsType", null);
        setField(term303318, term303318.getClass(), "parent", null);
        term303319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303319, term303319.getClass(), "functionName", null);
        setBooleanField(term303319, term303319.getClass(), "itsNeedsActivation", false);
        setIntField(term303319, term303319.getClass(), "itsFunctionType", 0);
        setBooleanField(term303319, term303319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303319, term303319.getClass(), "encodedSourceStart", 0);
        setIntField(term303319, term303319.getClass(), "encodedSourceEnd", 0);
        setField(term303319, term303319.getClass(), "sourceName", null);
        setIntField(term303319, term303319.getClass(), "baseLineno", 0);
        setIntField(term303319, term303319.getClass(), "endLineno", 0);
        setField(term303319, term303319.getClass(), "functions", null);
        setField(term303319, term303319.getClass(), "regexps", null);
        setField(term303319, term303319.getClass(), "itsVariables", null);
        setField(term303319, term303319.getClass(), "itsConst", null);
        setField(term303319, term303319.getClass(), "itsVariableNames", null);
        setIntField(term303319, term303319.getClass(), "varStart", 0);
        setField(term303319, term303319.getClass(), "compilerData", null);
        setIntField(term303319, term303319.getClass(), "type", 0);
        setField(term303319, term303319.getClass(), "next", null);
        setField(term303319, term303319.getClass(), "first", null);
        setField(term303319, term303319.getClass(), "last", null);
        setField(term303319, term303319.getClass(), "propListHead", null);
        setIntField(term303319, term303319.getClass(), "sourcePosition", 0);
        setField(term303319, term303319.getClass(), "jsType", null);
        setField(term303319, term303319.getClass(), "parent", null);
        term303280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303280, term303280.getClass(), "functionName", null);
        setBooleanField(term303280, term303280.getClass(), "itsNeedsActivation", false);
        setIntField(term303280, term303280.getClass(), "itsFunctionType", 0);
        setBooleanField(term303280, term303280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303280, term303280.getClass(), "encodedSourceStart", 0);
        setIntField(term303280, term303280.getClass(), "encodedSourceEnd", 0);
        setField(term303280, term303280.getClass(), "sourceName", null);
        setIntField(term303280, term303280.getClass(), "baseLineno", 0);
        setIntField(term303280, term303280.getClass(), "endLineno", 0);
        setField(term303280, term303280.getClass(), "functions", null);
        setField(term303280, term303280.getClass(), "regexps", null);
        setField(term303280, term303280.getClass(), "itsVariables", null);
        setField(term303280, term303280.getClass(), "itsConst", null);
        setField(term303280, term303280.getClass(), "itsVariableNames", null);
        setIntField(term303280, term303280.getClass(), "varStart", 0);
        setField(term303280, term303280.getClass(), "compilerData", null);
        setIntField(term303280, term303280.getClass(), "type", 14);
        setField(term303280, term303280.getClass(), "next", null);
        setField(term303280, term303280.getClass(), "first", null);
        setField(term303280, term303280.getClass(), "last", null);
        setField(term303280, term303280.getClass(), "propListHead", null);
        setIntField(term303280, term303280.getClass(), "sourcePosition", 0);
        setField(term303280, term303280.getClass(), "jsType", null);
        setField(term303280, term303280.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term277608;
        args[1] = term277694;
        args[2] = term277780;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term277522, args);
        assertTrue(recursiveEquals(term277522, term303316));
        assertTrue(recursiveEquals(term277608, term303317));
        assertTrue(recursiveEquals(term277694, term303318));
        assertTrue(recursiveEquals(term277780, term303319));
        assertTrue(recursiveEquals(retValue, term303280));
    }

};



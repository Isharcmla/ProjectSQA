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

public class PeepholeFoldConstants_tryFoldComparison_848443179904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209954;
     Object term210040;
     Object term210126;
     Object term210212;
     Object term210314;
     Object term210315;
     Object term210316;
     Object term210317;
     Object term210280;

    public PeepholeFoldConstants_tryFoldComparison_848443179904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term210040 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210040, term210040.getClass(), "type", 16);
        term210126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210126, term210126.getClass(), "type", 16);
        term210212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term210314 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term210314, term210314.getClass(), "currentTraversal", null);
        term210315 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term210315, term210315.getClass(), "functionName", null);
        setBooleanField(term210315, term210315.getClass(), "itsNeedsActivation", false);
        setIntField(term210315, term210315.getClass(), "itsFunctionType", 0);
        setBooleanField(term210315, term210315.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term210315, term210315.getClass(), "encodedSourceStart", 0);
        setIntField(term210315, term210315.getClass(), "encodedSourceEnd", 0);
        setField(term210315, term210315.getClass(), "sourceName", null);
        setIntField(term210315, term210315.getClass(), "baseLineno", 0);
        setIntField(term210315, term210315.getClass(), "endLineno", 0);
        setField(term210315, term210315.getClass(), "functions", null);
        setField(term210315, term210315.getClass(), "regexps", null);
        setField(term210315, term210315.getClass(), "itsVariables", null);
        setField(term210315, term210315.getClass(), "itsConst", null);
        setField(term210315, term210315.getClass(), "itsVariableNames", null);
        setIntField(term210315, term210315.getClass(), "varStart", 0);
        setField(term210315, term210315.getClass(), "compilerData", null);
        setIntField(term210315, term210315.getClass(), "type", 16);
        setField(term210315, term210315.getClass(), "next", null);
        setField(term210315, term210315.getClass(), "first", null);
        setField(term210315, term210315.getClass(), "last", null);
        setField(term210315, term210315.getClass(), "propListHead", null);
        setIntField(term210315, term210315.getClass(), "sourcePosition", 0);
        setField(term210315, term210315.getClass(), "jsType", null);
        setField(term210315, term210315.getClass(), "parent", null);
        term210316 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term210316, term210316.getClass(), "functionName", null);
        setBooleanField(term210316, term210316.getClass(), "itsNeedsActivation", false);
        setIntField(term210316, term210316.getClass(), "itsFunctionType", 0);
        setBooleanField(term210316, term210316.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term210316, term210316.getClass(), "encodedSourceStart", 0);
        setIntField(term210316, term210316.getClass(), "encodedSourceEnd", 0);
        setField(term210316, term210316.getClass(), "sourceName", null);
        setIntField(term210316, term210316.getClass(), "baseLineno", 0);
        setIntField(term210316, term210316.getClass(), "endLineno", 0);
        setField(term210316, term210316.getClass(), "functions", null);
        setField(term210316, term210316.getClass(), "regexps", null);
        setField(term210316, term210316.getClass(), "itsVariables", null);
        setField(term210316, term210316.getClass(), "itsConst", null);
        setField(term210316, term210316.getClass(), "itsVariableNames", null);
        setIntField(term210316, term210316.getClass(), "varStart", 0);
        setField(term210316, term210316.getClass(), "compilerData", null);
        setIntField(term210316, term210316.getClass(), "type", 16);
        setField(term210316, term210316.getClass(), "next", null);
        setField(term210316, term210316.getClass(), "first", null);
        setField(term210316, term210316.getClass(), "last", null);
        setField(term210316, term210316.getClass(), "propListHead", null);
        setIntField(term210316, term210316.getClass(), "sourcePosition", 0);
        setField(term210316, term210316.getClass(), "jsType", null);
        setField(term210316, term210316.getClass(), "parent", null);
        term210317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term210317, term210317.getClass(), "functionName", null);
        setBooleanField(term210317, term210317.getClass(), "itsNeedsActivation", false);
        setIntField(term210317, term210317.getClass(), "itsFunctionType", 0);
        setBooleanField(term210317, term210317.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term210317, term210317.getClass(), "encodedSourceStart", 0);
        setIntField(term210317, term210317.getClass(), "encodedSourceEnd", 0);
        setField(term210317, term210317.getClass(), "sourceName", null);
        setIntField(term210317, term210317.getClass(), "baseLineno", 0);
        setIntField(term210317, term210317.getClass(), "endLineno", 0);
        setField(term210317, term210317.getClass(), "functions", null);
        setField(term210317, term210317.getClass(), "regexps", null);
        setField(term210317, term210317.getClass(), "itsVariables", null);
        setField(term210317, term210317.getClass(), "itsConst", null);
        setField(term210317, term210317.getClass(), "itsVariableNames", null);
        setIntField(term210317, term210317.getClass(), "varStart", 0);
        setField(term210317, term210317.getClass(), "compilerData", null);
        setIntField(term210317, term210317.getClass(), "type", 0);
        setField(term210317, term210317.getClass(), "next", null);
        setField(term210317, term210317.getClass(), "first", null);
        setField(term210317, term210317.getClass(), "last", null);
        setField(term210317, term210317.getClass(), "propListHead", null);
        setIntField(term210317, term210317.getClass(), "sourcePosition", 0);
        setField(term210317, term210317.getClass(), "jsType", null);
        setField(term210317, term210317.getClass(), "parent", null);
        term210280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term210280, term210280.getClass(), "functionName", null);
        setBooleanField(term210280, term210280.getClass(), "itsNeedsActivation", false);
        setIntField(term210280, term210280.getClass(), "itsFunctionType", 0);
        setBooleanField(term210280, term210280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term210280, term210280.getClass(), "encodedSourceStart", 0);
        setIntField(term210280, term210280.getClass(), "encodedSourceEnd", 0);
        setField(term210280, term210280.getClass(), "sourceName", null);
        setIntField(term210280, term210280.getClass(), "baseLineno", 0);
        setIntField(term210280, term210280.getClass(), "endLineno", 0);
        setField(term210280, term210280.getClass(), "functions", null);
        setField(term210280, term210280.getClass(), "regexps", null);
        setField(term210280, term210280.getClass(), "itsVariables", null);
        setField(term210280, term210280.getClass(), "itsConst", null);
        setField(term210280, term210280.getClass(), "itsVariableNames", null);
        setIntField(term210280, term210280.getClass(), "varStart", 0);
        setField(term210280, term210280.getClass(), "compilerData", null);
        setIntField(term210280, term210280.getClass(), "type", 16);
        setField(term210280, term210280.getClass(), "next", null);
        setField(term210280, term210280.getClass(), "first", null);
        setField(term210280, term210280.getClass(), "last", null);
        setField(term210280, term210280.getClass(), "propListHead", null);
        setIntField(term210280, term210280.getClass(), "sourcePosition", 0);
        setField(term210280, term210280.getClass(), "jsType", null);
        setField(term210280, term210280.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term210040;
        args[1] = term210126;
        args[2] = term210212;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term209954, args);
        assertTrue(recursiveEquals(term209954, term210314));
        assertTrue(recursiveEquals(term210040, term210315));
        assertTrue(recursiveEquals(term210126, term210316));
        assertTrue(recursiveEquals(term210212, term210317));
        assertTrue(recursiveEquals(retValue, term210280));
    }

};



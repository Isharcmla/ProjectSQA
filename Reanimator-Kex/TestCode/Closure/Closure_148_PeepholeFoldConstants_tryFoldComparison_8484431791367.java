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

public class PeepholeFoldConstants_tryFoldComparison_8484431791367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333511;
     Object term333597;
     Object term333683;
     Object term333769;
     Object term334278;
     Object term334279;
     Object term334280;
     Object term334281;
     Object term334244;

    public PeepholeFoldConstants_tryFoldComparison_8484431791367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term333597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term333597, term333597.getClass(), "type", 16);
        term333683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term333683, term333683.getClass(), "type", 16);
        term333769 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term334278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term334278, term334278.getClass(), "currentTraversal", null);
        term334279 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334279, term334279.getClass(), "functionName", null);
        setBooleanField(term334279, term334279.getClass(), "itsNeedsActivation", false);
        setIntField(term334279, term334279.getClass(), "itsFunctionType", 0);
        setBooleanField(term334279, term334279.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334279, term334279.getClass(), "encodedSourceStart", 0);
        setIntField(term334279, term334279.getClass(), "encodedSourceEnd", 0);
        setField(term334279, term334279.getClass(), "sourceName", null);
        setIntField(term334279, term334279.getClass(), "baseLineno", 0);
        setIntField(term334279, term334279.getClass(), "endLineno", 0);
        setField(term334279, term334279.getClass(), "functions", null);
        setField(term334279, term334279.getClass(), "regexps", null);
        setField(term334279, term334279.getClass(), "itsVariables", null);
        setField(term334279, term334279.getClass(), "itsConst", null);
        setField(term334279, term334279.getClass(), "itsVariableNames", null);
        setIntField(term334279, term334279.getClass(), "varStart", 0);
        setField(term334279, term334279.getClass(), "compilerData", null);
        setIntField(term334279, term334279.getClass(), "type", 16);
        setField(term334279, term334279.getClass(), "next", null);
        setField(term334279, term334279.getClass(), "first", null);
        setField(term334279, term334279.getClass(), "last", null);
        setField(term334279, term334279.getClass(), "propListHead", null);
        setIntField(term334279, term334279.getClass(), "sourcePosition", 0);
        setField(term334279, term334279.getClass(), "jsType", null);
        setField(term334279, term334279.getClass(), "parent", null);
        term334280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334280, term334280.getClass(), "functionName", null);
        setBooleanField(term334280, term334280.getClass(), "itsNeedsActivation", false);
        setIntField(term334280, term334280.getClass(), "itsFunctionType", 0);
        setBooleanField(term334280, term334280.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334280, term334280.getClass(), "encodedSourceStart", 0);
        setIntField(term334280, term334280.getClass(), "encodedSourceEnd", 0);
        setField(term334280, term334280.getClass(), "sourceName", null);
        setIntField(term334280, term334280.getClass(), "baseLineno", 0);
        setIntField(term334280, term334280.getClass(), "endLineno", 0);
        setField(term334280, term334280.getClass(), "functions", null);
        setField(term334280, term334280.getClass(), "regexps", null);
        setField(term334280, term334280.getClass(), "itsVariables", null);
        setField(term334280, term334280.getClass(), "itsConst", null);
        setField(term334280, term334280.getClass(), "itsVariableNames", null);
        setIntField(term334280, term334280.getClass(), "varStart", 0);
        setField(term334280, term334280.getClass(), "compilerData", null);
        setIntField(term334280, term334280.getClass(), "type", 16);
        setField(term334280, term334280.getClass(), "next", null);
        setField(term334280, term334280.getClass(), "first", null);
        setField(term334280, term334280.getClass(), "last", null);
        setField(term334280, term334280.getClass(), "propListHead", null);
        setIntField(term334280, term334280.getClass(), "sourcePosition", 0);
        setField(term334280, term334280.getClass(), "jsType", null);
        setField(term334280, term334280.getClass(), "parent", null);
        term334281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334281, term334281.getClass(), "functionName", null);
        setBooleanField(term334281, term334281.getClass(), "itsNeedsActivation", false);
        setIntField(term334281, term334281.getClass(), "itsFunctionType", 0);
        setBooleanField(term334281, term334281.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334281, term334281.getClass(), "encodedSourceStart", 0);
        setIntField(term334281, term334281.getClass(), "encodedSourceEnd", 0);
        setField(term334281, term334281.getClass(), "sourceName", null);
        setIntField(term334281, term334281.getClass(), "baseLineno", 0);
        setIntField(term334281, term334281.getClass(), "endLineno", 0);
        setField(term334281, term334281.getClass(), "functions", null);
        setField(term334281, term334281.getClass(), "regexps", null);
        setField(term334281, term334281.getClass(), "itsVariables", null);
        setField(term334281, term334281.getClass(), "itsConst", null);
        setField(term334281, term334281.getClass(), "itsVariableNames", null);
        setIntField(term334281, term334281.getClass(), "varStart", 0);
        setField(term334281, term334281.getClass(), "compilerData", null);
        setIntField(term334281, term334281.getClass(), "type", 0);
        setField(term334281, term334281.getClass(), "next", null);
        setField(term334281, term334281.getClass(), "first", null);
        setField(term334281, term334281.getClass(), "last", null);
        setField(term334281, term334281.getClass(), "propListHead", null);
        setIntField(term334281, term334281.getClass(), "sourcePosition", 0);
        setField(term334281, term334281.getClass(), "jsType", null);
        setField(term334281, term334281.getClass(), "parent", null);
        term334244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term334244, term334244.getClass(), "functionName", null);
        setBooleanField(term334244, term334244.getClass(), "itsNeedsActivation", false);
        setIntField(term334244, term334244.getClass(), "itsFunctionType", 0);
        setBooleanField(term334244, term334244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term334244, term334244.getClass(), "encodedSourceStart", 0);
        setIntField(term334244, term334244.getClass(), "encodedSourceEnd", 0);
        setField(term334244, term334244.getClass(), "sourceName", null);
        setIntField(term334244, term334244.getClass(), "baseLineno", 0);
        setIntField(term334244, term334244.getClass(), "endLineno", 0);
        setField(term334244, term334244.getClass(), "functions", null);
        setField(term334244, term334244.getClass(), "regexps", null);
        setField(term334244, term334244.getClass(), "itsVariables", null);
        setField(term334244, term334244.getClass(), "itsConst", null);
        setField(term334244, term334244.getClass(), "itsVariableNames", null);
        setIntField(term334244, term334244.getClass(), "varStart", 0);
        setField(term334244, term334244.getClass(), "compilerData", null);
        setIntField(term334244, term334244.getClass(), "type", 16);
        setField(term334244, term334244.getClass(), "next", null);
        setField(term334244, term334244.getClass(), "first", null);
        setField(term334244, term334244.getClass(), "last", null);
        setField(term334244, term334244.getClass(), "propListHead", null);
        setIntField(term334244, term334244.getClass(), "sourcePosition", 0);
        setField(term334244, term334244.getClass(), "jsType", null);
        setField(term334244, term334244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term333597;
        args[1] = term333683;
        args[2] = term333769;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term333511, args);
        assertTrue(recursiveEquals(term333511, term334278));
        assertTrue(recursiveEquals(term333597, term334279));
        assertTrue(recursiveEquals(term333683, term334280));
        assertTrue(recursiveEquals(term333769, term334281));
        assertTrue(recursiveEquals(retValue, term334244));
    }

};



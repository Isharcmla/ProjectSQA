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

public class PeepholeFoldConstants_tryFoldAndOr_425870290362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72847;
     Object term72933;
     Object term73023;
     Object term73093;
     Object term73248;
     Object term73249;
     Object term73250;
     Object term73251;
     Object term73197;

    public PeepholeFoldConstants_tryFoldAndOr_425870290362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72847 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term72933 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term72933, term72933.getClass(), "parent", null);
        setIntField(term72933, term72933.getClass(), "type", 0);
        term73023 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term73023, term73023.getClass(), "type", 0);
        term73093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term73248 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term73248, term73248.getClass(), "currentTraversal", null);
        term73249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term73249, term73249.getClass(), "functionName", null);
        setBooleanField(term73249, term73249.getClass(), "itsNeedsActivation", false);
        setIntField(term73249, term73249.getClass(), "itsFunctionType", 0);
        setBooleanField(term73249, term73249.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73249, term73249.getClass(), "encodedSourceStart", 0);
        setIntField(term73249, term73249.getClass(), "encodedSourceEnd", 0);
        setField(term73249, term73249.getClass(), "sourceName", null);
        setIntField(term73249, term73249.getClass(), "baseLineno", 0);
        setIntField(term73249, term73249.getClass(), "endLineno", 0);
        setField(term73249, term73249.getClass(), "functions", null);
        setField(term73249, term73249.getClass(), "regexps", null);
        setField(term73249, term73249.getClass(), "itsVariables", null);
        setField(term73249, term73249.getClass(), "itsConst", null);
        setField(term73249, term73249.getClass(), "itsVariableNames", null);
        setIntField(term73249, term73249.getClass(), "varStart", 0);
        setField(term73249, term73249.getClass(), "compilerData", null);
        setIntField(term73249, term73249.getClass(), "type", 0);
        setField(term73249, term73249.getClass(), "next", null);
        setField(term73249, term73249.getClass(), "first", null);
        setField(term73249, term73249.getClass(), "last", null);
        setField(term73249, term73249.getClass(), "propListHead", null);
        setIntField(term73249, term73249.getClass(), "sourcePosition", 0);
        setField(term73249, term73249.getClass(), "jsType", null);
        setField(term73249, term73249.getClass(), "parent", null);
        term73250 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term73250, term73250.getClass(), "encodedSourceStart", 0);
        setIntField(term73250, term73250.getClass(), "encodedSourceEnd", 0);
        setField(term73250, term73250.getClass(), "sourceName", null);
        setIntField(term73250, term73250.getClass(), "baseLineno", 0);
        setIntField(term73250, term73250.getClass(), "endLineno", 0);
        setField(term73250, term73250.getClass(), "functions", null);
        setField(term73250, term73250.getClass(), "regexps", null);
        setField(term73250, term73250.getClass(), "itsVariables", null);
        setField(term73250, term73250.getClass(), "itsConst", null);
        setField(term73250, term73250.getClass(), "itsVariableNames", null);
        setIntField(term73250, term73250.getClass(), "varStart", 0);
        setField(term73250, term73250.getClass(), "compilerData", null);
        setIntField(term73250, term73250.getClass(), "type", 0);
        setField(term73250, term73250.getClass(), "next", null);
        setField(term73250, term73250.getClass(), "first", null);
        setField(term73250, term73250.getClass(), "last", null);
        setField(term73250, term73250.getClass(), "propListHead", null);
        setIntField(term73250, term73250.getClass(), "sourcePosition", 0);
        setField(term73250, term73250.getClass(), "jsType", null);
        setField(term73250, term73250.getClass(), "parent", null);
        term73251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73251, term73251.getClass(), "type", 0);
        setField(term73251, term73251.getClass(), "next", null);
        setField(term73251, term73251.getClass(), "first", null);
        setField(term73251, term73251.getClass(), "last", null);
        setField(term73251, term73251.getClass(), "propListHead", null);
        setIntField(term73251, term73251.getClass(), "sourcePosition", 0);
        setField(term73251, term73251.getClass(), "jsType", null);
        setField(term73251, term73251.getClass(), "parent", null);
        term73197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term73197, term73197.getClass(), "functionName", null);
        setBooleanField(term73197, term73197.getClass(), "itsNeedsActivation", false);
        setIntField(term73197, term73197.getClass(), "itsFunctionType", 0);
        setBooleanField(term73197, term73197.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term73197, term73197.getClass(), "encodedSourceStart", 0);
        setIntField(term73197, term73197.getClass(), "encodedSourceEnd", 0);
        setField(term73197, term73197.getClass(), "sourceName", null);
        setIntField(term73197, term73197.getClass(), "baseLineno", 0);
        setIntField(term73197, term73197.getClass(), "endLineno", 0);
        setField(term73197, term73197.getClass(), "functions", null);
        setField(term73197, term73197.getClass(), "regexps", null);
        setField(term73197, term73197.getClass(), "itsVariables", null);
        setField(term73197, term73197.getClass(), "itsConst", null);
        setField(term73197, term73197.getClass(), "itsVariableNames", null);
        setIntField(term73197, term73197.getClass(), "varStart", 0);
        setField(term73197, term73197.getClass(), "compilerData", null);
        setIntField(term73197, term73197.getClass(), "type", 0);
        setField(term73197, term73197.getClass(), "next", null);
        setField(term73197, term73197.getClass(), "first", null);
        setField(term73197, term73197.getClass(), "last", null);
        setField(term73197, term73197.getClass(), "propListHead", null);
        setIntField(term73197, term73197.getClass(), "sourcePosition", 0);
        setField(term73197, term73197.getClass(), "jsType", null);
        setField(term73197, term73197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term72933;
        args[1] = term73023;
        args[2] = term73093;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term72847, args);
        assertTrue(recursiveEquals(term72847, term73248));
        assertTrue(recursiveEquals(term72933, term73249));
        assertTrue(recursiveEquals(term73023, term73250));
        assertTrue(recursiveEquals(term73093, term73251));
        assertTrue(recursiveEquals(retValue, term73197));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105620;
     Object term105710;
     Object term106403;
     Object term106404;
     Object term106340;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105620 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term105710 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term105800 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term105710, term105710.getClass(), "first", term105710);
        setField(term105710, term105710.getClass(), "next", term105800);
        setIntField(term105710, term105710.getClass(), "type", 14);
        term106403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term106403, term106403.getClass(), "currentTraversal", null);
        term106404 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term106405 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term106404, term106404.getClass(), "encodedSourceStart", 0);
        setIntField(term106404, term106404.getClass(), "encodedSourceEnd", 0);
        setField(term106404, term106404.getClass(), "sourceName", null);
        setIntField(term106404, term106404.getClass(), "baseLineno", 0);
        setIntField(term106404, term106404.getClass(), "endLineno", 0);
        setField(term106404, term106404.getClass(), "functions", null);
        setField(term106404, term106404.getClass(), "regexps", null);
        setField(term106404, term106404.getClass(), "itsVariables", null);
        setField(term106404, term106404.getClass(), "itsConst", null);
        setField(term106404, term106404.getClass(), "itsVariableNames", null);
        setIntField(term106404, term106404.getClass(), "varStart", 0);
        setField(term106404, term106404.getClass(), "compilerData", null);
        setIntField(term106404, term106404.getClass(), "type", 14);
        setIntField(term106405, term106405.getClass(), "encodedSourceStart", 0);
        setIntField(term106405, term106405.getClass(), "encodedSourceEnd", 0);
        setField(term106405, term106405.getClass(), "sourceName", null);
        setIntField(term106405, term106405.getClass(), "baseLineno", 0);
        setIntField(term106405, term106405.getClass(), "endLineno", 0);
        setField(term106405, term106405.getClass(), "functions", null);
        setField(term106405, term106405.getClass(), "regexps", null);
        setField(term106405, term106405.getClass(), "itsVariables", null);
        setField(term106405, term106405.getClass(), "itsConst", null);
        setField(term106405, term106405.getClass(), "itsVariableNames", null);
        setIntField(term106405, term106405.getClass(), "varStart", 0);
        setField(term106405, term106405.getClass(), "compilerData", null);
        setIntField(term106405, term106405.getClass(), "type", 0);
        setField(term106405, term106405.getClass(), "next", null);
        setField(term106405, term106405.getClass(), "first", null);
        setField(term106405, term106405.getClass(), "last", null);
        setField(term106405, term106405.getClass(), "propListHead", null);
        setIntField(term106405, term106405.getClass(), "sourcePosition", 0);
        setField(term106405, term106405.getClass(), "jsType", null);
        setField(term106405, term106405.getClass(), "parent", null);
        setField(term106404, term106404.getClass(), "next", term106405);
        setField(term106404, term106404.getClass(), "first", term106404);
        setField(term106404, term106404.getClass(), "last", null);
        setField(term106404, term106404.getClass(), "propListHead", null);
        setIntField(term106404, term106404.getClass(), "sourcePosition", 0);
        setField(term106404, term106404.getClass(), "jsType", null);
        setField(term106404, term106404.getClass(), "parent", null);
        term106340 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term106347 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term106340, term106340.getClass(), "encodedSourceStart", 0);
        setIntField(term106340, term106340.getClass(), "encodedSourceEnd", 0);
        setField(term106340, term106340.getClass(), "sourceName", null);
        setIntField(term106340, term106340.getClass(), "baseLineno", 0);
        setIntField(term106340, term106340.getClass(), "endLineno", 0);
        setField(term106340, term106340.getClass(), "functions", null);
        setField(term106340, term106340.getClass(), "regexps", null);
        setField(term106340, term106340.getClass(), "itsVariables", null);
        setField(term106340, term106340.getClass(), "itsConst", null);
        setField(term106340, term106340.getClass(), "itsVariableNames", null);
        setIntField(term106340, term106340.getClass(), "varStart", 0);
        setField(term106340, term106340.getClass(), "compilerData", null);
        setIntField(term106340, term106340.getClass(), "type", 14);
        setIntField(term106347, term106347.getClass(), "encodedSourceStart", 0);
        setIntField(term106347, term106347.getClass(), "encodedSourceEnd", 0);
        setField(term106347, term106347.getClass(), "sourceName", null);
        setIntField(term106347, term106347.getClass(), "baseLineno", 0);
        setIntField(term106347, term106347.getClass(), "endLineno", 0);
        setField(term106347, term106347.getClass(), "functions", null);
        setField(term106347, term106347.getClass(), "regexps", null);
        setField(term106347, term106347.getClass(), "itsVariables", null);
        setField(term106347, term106347.getClass(), "itsConst", null);
        setField(term106347, term106347.getClass(), "itsVariableNames", null);
        setIntField(term106347, term106347.getClass(), "varStart", 0);
        setField(term106347, term106347.getClass(), "compilerData", null);
        setIntField(term106347, term106347.getClass(), "type", 0);
        setField(term106347, term106347.getClass(), "next", null);
        setField(term106347, term106347.getClass(), "first", null);
        setField(term106347, term106347.getClass(), "last", null);
        setField(term106347, term106347.getClass(), "propListHead", null);
        setIntField(term106347, term106347.getClass(), "sourcePosition", 0);
        setField(term106347, term106347.getClass(), "jsType", null);
        setField(term106347, term106347.getClass(), "parent", null);
        setField(term106340, term106340.getClass(), "next", term106347);
        setField(term106340, term106340.getClass(), "first", term106340);
        setField(term106340, term106340.getClass(), "last", null);
        setField(term106340, term106340.getClass(), "propListHead", null);
        setIntField(term106340, term106340.getClass(), "sourcePosition", 0);
        setField(term106340, term106340.getClass(), "jsType", null);
        setField(term106340, term106340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term105710;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term105620, args);
        assertTrue(recursiveEquals(term105620, term106403));
        assertTrue(recursiveEquals(term105710, term106404));
        assertTrue(recursiveEquals(retValue, term106340));
    }

};



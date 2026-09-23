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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38586;
     Object term38676;
     Object term39423;
     Object term39424;
     Object term39359;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38586 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term38676 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term38766 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term38856 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term38766, term38766.getClass(), "next", term38856);
        setIntField(term38766, term38766.getClass(), "type", 39);
        setField(term38676, term38676.getClass(), "first", term38766);
        setIntField(term38676, term38676.getClass(), "type", 20);
        term39423 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39423, term39423.getClass(), "currentTraversal", null);
        term39424 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term39425 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term39426 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term39424, term39424.getClass(), "encodedSourceStart", 0);
        setIntField(term39424, term39424.getClass(), "encodedSourceEnd", 0);
        setField(term39424, term39424.getClass(), "sourceName", null);
        setIntField(term39424, term39424.getClass(), "baseLineno", 0);
        setIntField(term39424, term39424.getClass(), "endLineno", 0);
        setField(term39424, term39424.getClass(), "functions", null);
        setField(term39424, term39424.getClass(), "regexps", null);
        setField(term39424, term39424.getClass(), "itsVariables", null);
        setField(term39424, term39424.getClass(), "itsConst", null);
        setField(term39424, term39424.getClass(), "itsVariableNames", null);
        setIntField(term39424, term39424.getClass(), "varStart", 0);
        setField(term39424, term39424.getClass(), "compilerData", null);
        setIntField(term39424, term39424.getClass(), "type", 20);
        setField(term39424, term39424.getClass(), "next", null);
        setIntField(term39425, term39425.getClass(), "encodedSourceStart", 0);
        setIntField(term39425, term39425.getClass(), "encodedSourceEnd", 0);
        setField(term39425, term39425.getClass(), "sourceName", null);
        setIntField(term39425, term39425.getClass(), "baseLineno", 0);
        setIntField(term39425, term39425.getClass(), "endLineno", 0);
        setField(term39425, term39425.getClass(), "functions", null);
        setField(term39425, term39425.getClass(), "regexps", null);
        setField(term39425, term39425.getClass(), "itsVariables", null);
        setField(term39425, term39425.getClass(), "itsConst", null);
        setField(term39425, term39425.getClass(), "itsVariableNames", null);
        setIntField(term39425, term39425.getClass(), "varStart", 0);
        setField(term39425, term39425.getClass(), "compilerData", null);
        setIntField(term39425, term39425.getClass(), "type", 39);
        setIntField(term39426, term39426.getClass(), "encodedSourceStart", 0);
        setIntField(term39426, term39426.getClass(), "encodedSourceEnd", 0);
        setField(term39426, term39426.getClass(), "sourceName", null);
        setIntField(term39426, term39426.getClass(), "baseLineno", 0);
        setIntField(term39426, term39426.getClass(), "endLineno", 0);
        setField(term39426, term39426.getClass(), "functions", null);
        setField(term39426, term39426.getClass(), "regexps", null);
        setField(term39426, term39426.getClass(), "itsVariables", null);
        setField(term39426, term39426.getClass(), "itsConst", null);
        setField(term39426, term39426.getClass(), "itsVariableNames", null);
        setIntField(term39426, term39426.getClass(), "varStart", 0);
        setField(term39426, term39426.getClass(), "compilerData", null);
        setIntField(term39426, term39426.getClass(), "type", 0);
        setField(term39426, term39426.getClass(), "next", null);
        setField(term39426, term39426.getClass(), "first", null);
        setField(term39426, term39426.getClass(), "last", null);
        setField(term39426, term39426.getClass(), "propListHead", null);
        setIntField(term39426, term39426.getClass(), "sourcePosition", 0);
        setField(term39426, term39426.getClass(), "jsType", null);
        setField(term39426, term39426.getClass(), "parent", null);
        setField(term39425, term39425.getClass(), "next", term39426);
        setField(term39425, term39425.getClass(), "first", null);
        setField(term39425, term39425.getClass(), "last", null);
        setField(term39425, term39425.getClass(), "propListHead", null);
        setIntField(term39425, term39425.getClass(), "sourcePosition", 0);
        setField(term39425, term39425.getClass(), "jsType", null);
        setField(term39425, term39425.getClass(), "parent", null);
        setField(term39424, term39424.getClass(), "first", term39425);
        setField(term39424, term39424.getClass(), "last", null);
        setField(term39424, term39424.getClass(), "propListHead", null);
        setIntField(term39424, term39424.getClass(), "sourcePosition", 0);
        setField(term39424, term39424.getClass(), "jsType", null);
        setField(term39424, term39424.getClass(), "parent", null);
        term39359 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term39366 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term39373 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term39359, term39359.getClass(), "encodedSourceStart", 0);
        setIntField(term39359, term39359.getClass(), "encodedSourceEnd", 0);
        setField(term39359, term39359.getClass(), "sourceName", null);
        setIntField(term39359, term39359.getClass(), "baseLineno", 0);
        setIntField(term39359, term39359.getClass(), "endLineno", 0);
        setField(term39359, term39359.getClass(), "functions", null);
        setField(term39359, term39359.getClass(), "regexps", null);
        setField(term39359, term39359.getClass(), "itsVariables", null);
        setField(term39359, term39359.getClass(), "itsConst", null);
        setField(term39359, term39359.getClass(), "itsVariableNames", null);
        setIntField(term39359, term39359.getClass(), "varStart", 0);
        setField(term39359, term39359.getClass(), "compilerData", null);
        setIntField(term39359, term39359.getClass(), "type", 20);
        setField(term39359, term39359.getClass(), "next", null);
        setIntField(term39366, term39366.getClass(), "encodedSourceStart", 0);
        setIntField(term39366, term39366.getClass(), "encodedSourceEnd", 0);
        setField(term39366, term39366.getClass(), "sourceName", null);
        setIntField(term39366, term39366.getClass(), "baseLineno", 0);
        setIntField(term39366, term39366.getClass(), "endLineno", 0);
        setField(term39366, term39366.getClass(), "functions", null);
        setField(term39366, term39366.getClass(), "regexps", null);
        setField(term39366, term39366.getClass(), "itsVariables", null);
        setField(term39366, term39366.getClass(), "itsConst", null);
        setField(term39366, term39366.getClass(), "itsVariableNames", null);
        setIntField(term39366, term39366.getClass(), "varStart", 0);
        setField(term39366, term39366.getClass(), "compilerData", null);
        setIntField(term39366, term39366.getClass(), "type", 39);
        setIntField(term39373, term39373.getClass(), "encodedSourceStart", 0);
        setIntField(term39373, term39373.getClass(), "encodedSourceEnd", 0);
        setField(term39373, term39373.getClass(), "sourceName", null);
        setIntField(term39373, term39373.getClass(), "baseLineno", 0);
        setIntField(term39373, term39373.getClass(), "endLineno", 0);
        setField(term39373, term39373.getClass(), "functions", null);
        setField(term39373, term39373.getClass(), "regexps", null);
        setField(term39373, term39373.getClass(), "itsVariables", null);
        setField(term39373, term39373.getClass(), "itsConst", null);
        setField(term39373, term39373.getClass(), "itsVariableNames", null);
        setIntField(term39373, term39373.getClass(), "varStart", 0);
        setField(term39373, term39373.getClass(), "compilerData", null);
        setIntField(term39373, term39373.getClass(), "type", 0);
        setField(term39373, term39373.getClass(), "next", null);
        setField(term39373, term39373.getClass(), "first", null);
        setField(term39373, term39373.getClass(), "last", null);
        setField(term39373, term39373.getClass(), "propListHead", null);
        setIntField(term39373, term39373.getClass(), "sourcePosition", 0);
        setField(term39373, term39373.getClass(), "jsType", null);
        setField(term39373, term39373.getClass(), "parent", null);
        setField(term39366, term39366.getClass(), "next", term39373);
        setField(term39366, term39366.getClass(), "first", null);
        setField(term39366, term39366.getClass(), "last", null);
        setField(term39366, term39366.getClass(), "propListHead", null);
        setIntField(term39366, term39366.getClass(), "sourcePosition", 0);
        setField(term39366, term39366.getClass(), "jsType", null);
        setField(term39366, term39366.getClass(), "parent", null);
        setField(term39359, term39359.getClass(), "first", term39366);
        setField(term39359, term39359.getClass(), "last", null);
        setField(term39359, term39359.getClass(), "propListHead", null);
        setIntField(term39359, term39359.getClass(), "sourcePosition", 0);
        setField(term39359, term39359.getClass(), "jsType", null);
        setField(term39359, term39359.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38676;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term38586, args);
        assertTrue(recursiveEquals(term38586, term39423));
        assertTrue(recursiveEquals(term38676, term39424));
        assertTrue(recursiveEquals(retValue, term39359));
    }

};



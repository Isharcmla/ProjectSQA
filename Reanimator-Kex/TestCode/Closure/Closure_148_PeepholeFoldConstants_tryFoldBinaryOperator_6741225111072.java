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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251506;
     Object term251596;
     Object term251861;
     Object term251862;
     Object term251793;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251506 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term251596 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251686 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251776 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term251686, term251686.getClass(), "next", term251776);
        setIntField(term251686, term251686.getClass(), "type", 63);
        setField(term251596, term251596.getClass(), "first", term251686);
        setIntField(term251596, term251596.getClass(), "type", 35);
        term251861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term251861, term251861.getClass(), "currentTraversal", null);
        term251862 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251863 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251864 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term251862, term251862.getClass(), "encodedSourceStart", 0);
        setIntField(term251862, term251862.getClass(), "encodedSourceEnd", 0);
        setField(term251862, term251862.getClass(), "sourceName", null);
        setIntField(term251862, term251862.getClass(), "baseLineno", 0);
        setIntField(term251862, term251862.getClass(), "endLineno", 0);
        setField(term251862, term251862.getClass(), "functions", null);
        setField(term251862, term251862.getClass(), "regexps", null);
        setField(term251862, term251862.getClass(), "itsVariables", null);
        setField(term251862, term251862.getClass(), "itsConst", null);
        setField(term251862, term251862.getClass(), "itsVariableNames", null);
        setIntField(term251862, term251862.getClass(), "varStart", 0);
        setField(term251862, term251862.getClass(), "compilerData", null);
        setIntField(term251862, term251862.getClass(), "type", 35);
        setField(term251862, term251862.getClass(), "next", null);
        setIntField(term251863, term251863.getClass(), "encodedSourceStart", 0);
        setIntField(term251863, term251863.getClass(), "encodedSourceEnd", 0);
        setField(term251863, term251863.getClass(), "sourceName", null);
        setIntField(term251863, term251863.getClass(), "baseLineno", 0);
        setIntField(term251863, term251863.getClass(), "endLineno", 0);
        setField(term251863, term251863.getClass(), "functions", null);
        setField(term251863, term251863.getClass(), "regexps", null);
        setField(term251863, term251863.getClass(), "itsVariables", null);
        setField(term251863, term251863.getClass(), "itsConst", null);
        setField(term251863, term251863.getClass(), "itsVariableNames", null);
        setIntField(term251863, term251863.getClass(), "varStart", 0);
        setField(term251863, term251863.getClass(), "compilerData", null);
        setIntField(term251863, term251863.getClass(), "type", 63);
        setIntField(term251864, term251864.getClass(), "encodedSourceStart", 0);
        setIntField(term251864, term251864.getClass(), "encodedSourceEnd", 0);
        setField(term251864, term251864.getClass(), "sourceName", null);
        setIntField(term251864, term251864.getClass(), "baseLineno", 0);
        setIntField(term251864, term251864.getClass(), "endLineno", 0);
        setField(term251864, term251864.getClass(), "functions", null);
        setField(term251864, term251864.getClass(), "regexps", null);
        setField(term251864, term251864.getClass(), "itsVariables", null);
        setField(term251864, term251864.getClass(), "itsConst", null);
        setField(term251864, term251864.getClass(), "itsVariableNames", null);
        setIntField(term251864, term251864.getClass(), "varStart", 0);
        setField(term251864, term251864.getClass(), "compilerData", null);
        setIntField(term251864, term251864.getClass(), "type", 0);
        setField(term251864, term251864.getClass(), "next", null);
        setField(term251864, term251864.getClass(), "first", null);
        setField(term251864, term251864.getClass(), "last", null);
        setField(term251864, term251864.getClass(), "propListHead", null);
        setIntField(term251864, term251864.getClass(), "sourcePosition", 0);
        setField(term251864, term251864.getClass(), "jsType", null);
        setField(term251864, term251864.getClass(), "parent", null);
        setField(term251863, term251863.getClass(), "next", term251864);
        setField(term251863, term251863.getClass(), "first", null);
        setField(term251863, term251863.getClass(), "last", null);
        setField(term251863, term251863.getClass(), "propListHead", null);
        setIntField(term251863, term251863.getClass(), "sourcePosition", 0);
        setField(term251863, term251863.getClass(), "jsType", null);
        setField(term251863, term251863.getClass(), "parent", null);
        setField(term251862, term251862.getClass(), "first", term251863);
        setField(term251862, term251862.getClass(), "last", null);
        setField(term251862, term251862.getClass(), "propListHead", null);
        setIntField(term251862, term251862.getClass(), "sourcePosition", 0);
        setField(term251862, term251862.getClass(), "jsType", null);
        setField(term251862, term251862.getClass(), "parent", null);
        term251793 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251800 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term251807 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term251793, term251793.getClass(), "encodedSourceStart", 0);
        setIntField(term251793, term251793.getClass(), "encodedSourceEnd", 0);
        setField(term251793, term251793.getClass(), "sourceName", null);
        setIntField(term251793, term251793.getClass(), "baseLineno", 0);
        setIntField(term251793, term251793.getClass(), "endLineno", 0);
        setField(term251793, term251793.getClass(), "functions", null);
        setField(term251793, term251793.getClass(), "regexps", null);
        setField(term251793, term251793.getClass(), "itsVariables", null);
        setField(term251793, term251793.getClass(), "itsConst", null);
        setField(term251793, term251793.getClass(), "itsVariableNames", null);
        setIntField(term251793, term251793.getClass(), "varStart", 0);
        setField(term251793, term251793.getClass(), "compilerData", null);
        setIntField(term251793, term251793.getClass(), "type", 35);
        setField(term251793, term251793.getClass(), "next", null);
        setIntField(term251800, term251800.getClass(), "encodedSourceStart", 0);
        setIntField(term251800, term251800.getClass(), "encodedSourceEnd", 0);
        setField(term251800, term251800.getClass(), "sourceName", null);
        setIntField(term251800, term251800.getClass(), "baseLineno", 0);
        setIntField(term251800, term251800.getClass(), "endLineno", 0);
        setField(term251800, term251800.getClass(), "functions", null);
        setField(term251800, term251800.getClass(), "regexps", null);
        setField(term251800, term251800.getClass(), "itsVariables", null);
        setField(term251800, term251800.getClass(), "itsConst", null);
        setField(term251800, term251800.getClass(), "itsVariableNames", null);
        setIntField(term251800, term251800.getClass(), "varStart", 0);
        setField(term251800, term251800.getClass(), "compilerData", null);
        setIntField(term251800, term251800.getClass(), "type", 63);
        setIntField(term251807, term251807.getClass(), "encodedSourceStart", 0);
        setIntField(term251807, term251807.getClass(), "encodedSourceEnd", 0);
        setField(term251807, term251807.getClass(), "sourceName", null);
        setIntField(term251807, term251807.getClass(), "baseLineno", 0);
        setIntField(term251807, term251807.getClass(), "endLineno", 0);
        setField(term251807, term251807.getClass(), "functions", null);
        setField(term251807, term251807.getClass(), "regexps", null);
        setField(term251807, term251807.getClass(), "itsVariables", null);
        setField(term251807, term251807.getClass(), "itsConst", null);
        setField(term251807, term251807.getClass(), "itsVariableNames", null);
        setIntField(term251807, term251807.getClass(), "varStart", 0);
        setField(term251807, term251807.getClass(), "compilerData", null);
        setIntField(term251807, term251807.getClass(), "type", 0);
        setField(term251807, term251807.getClass(), "next", null);
        setField(term251807, term251807.getClass(), "first", null);
        setField(term251807, term251807.getClass(), "last", null);
        setField(term251807, term251807.getClass(), "propListHead", null);
        setIntField(term251807, term251807.getClass(), "sourcePosition", 0);
        setField(term251807, term251807.getClass(), "jsType", null);
        setField(term251807, term251807.getClass(), "parent", null);
        setField(term251800, term251800.getClass(), "next", term251807);
        setField(term251800, term251800.getClass(), "first", null);
        setField(term251800, term251800.getClass(), "last", null);
        setField(term251800, term251800.getClass(), "propListHead", null);
        setIntField(term251800, term251800.getClass(), "sourcePosition", 0);
        setField(term251800, term251800.getClass(), "jsType", null);
        setField(term251800, term251800.getClass(), "parent", null);
        setField(term251793, term251793.getClass(), "first", term251800);
        setField(term251793, term251793.getClass(), "last", null);
        setField(term251793, term251793.getClass(), "propListHead", null);
        setIntField(term251793, term251793.getClass(), "sourcePosition", 0);
        setField(term251793, term251793.getClass(), "jsType", null);
        setField(term251793, term251793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term251596;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term251506, args);
        assertTrue(recursiveEquals(term251506, term251861));
        assertTrue(recursiveEquals(term251596, term251862));
        assertTrue(recursiveEquals(retValue, term251793));
    }

};



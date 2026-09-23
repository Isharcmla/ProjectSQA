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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668170;
     Object term668262;
     Object term668896;
     Object term668897;
     Object term668839;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term668262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668444 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term668354, term668354.getClass(), "next", term668444);
        setIntField(term668354, term668354.getClass(), "type", 16);
        setField(term668262, term668262.getClass(), "first", term668354);
        setIntField(term668262, term668262.getClass(), "type", 16);
        term668896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term668896, term668896.getClass(), "currentTraversal", null);
        term668897 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668899 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term668897, term668897.getClass(), "str", null);
        setIntField(term668897, term668897.getClass(), "type", 16);
        setField(term668897, term668897.getClass(), "next", null);
        setField(term668898, term668898.getClass(), "str", null);
        setIntField(term668898, term668898.getClass(), "type", 16);
        setIntField(term668899, term668899.getClass(), "encodedSourceStart", 0);
        setIntField(term668899, term668899.getClass(), "encodedSourceEnd", 0);
        setField(term668899, term668899.getClass(), "sourceName", null);
        setIntField(term668899, term668899.getClass(), "baseLineno", 0);
        setIntField(term668899, term668899.getClass(), "endLineno", 0);
        setField(term668899, term668899.getClass(), "functions", null);
        setField(term668899, term668899.getClass(), "regexps", null);
        setField(term668899, term668899.getClass(), "itsVariables", null);
        setField(term668899, term668899.getClass(), "itsConst", null);
        setField(term668899, term668899.getClass(), "itsVariableNames", null);
        setIntField(term668899, term668899.getClass(), "varStart", 0);
        setField(term668899, term668899.getClass(), "compilerData", null);
        setIntField(term668899, term668899.getClass(), "type", 0);
        setField(term668899, term668899.getClass(), "next", null);
        setField(term668899, term668899.getClass(), "first", null);
        setField(term668899, term668899.getClass(), "last", null);
        setField(term668899, term668899.getClass(), "propListHead", null);
        setIntField(term668899, term668899.getClass(), "sourcePosition", 0);
        setField(term668899, term668899.getClass(), "jsType", null);
        setField(term668899, term668899.getClass(), "parent", null);
        setField(term668898, term668898.getClass(), "next", term668899);
        setField(term668898, term668898.getClass(), "first", null);
        setField(term668898, term668898.getClass(), "last", null);
        setField(term668898, term668898.getClass(), "propListHead", null);
        setIntField(term668898, term668898.getClass(), "sourcePosition", 0);
        setField(term668898, term668898.getClass(), "jsType", null);
        setField(term668898, term668898.getClass(), "parent", null);
        setField(term668897, term668897.getClass(), "first", term668898);
        setField(term668897, term668897.getClass(), "last", null);
        setField(term668897, term668897.getClass(), "propListHead", null);
        setIntField(term668897, term668897.getClass(), "sourcePosition", 0);
        setField(term668897, term668897.getClass(), "jsType", null);
        setField(term668897, term668897.getClass(), "parent", null);
        term668839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term668843 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term668839, term668839.getClass(), "str", null);
        setIntField(term668839, term668839.getClass(), "type", 16);
        setField(term668839, term668839.getClass(), "next", null);
        setField(term668841, term668841.getClass(), "str", null);
        setIntField(term668841, term668841.getClass(), "type", 16);
        setIntField(term668843, term668843.getClass(), "encodedSourceStart", 0);
        setIntField(term668843, term668843.getClass(), "encodedSourceEnd", 0);
        setField(term668843, term668843.getClass(), "sourceName", null);
        setIntField(term668843, term668843.getClass(), "baseLineno", 0);
        setIntField(term668843, term668843.getClass(), "endLineno", 0);
        setField(term668843, term668843.getClass(), "functions", null);
        setField(term668843, term668843.getClass(), "regexps", null);
        setField(term668843, term668843.getClass(), "itsVariables", null);
        setField(term668843, term668843.getClass(), "itsConst", null);
        setField(term668843, term668843.getClass(), "itsVariableNames", null);
        setIntField(term668843, term668843.getClass(), "varStart", 0);
        setField(term668843, term668843.getClass(), "compilerData", null);
        setIntField(term668843, term668843.getClass(), "type", 0);
        setField(term668843, term668843.getClass(), "next", null);
        setField(term668843, term668843.getClass(), "first", null);
        setField(term668843, term668843.getClass(), "last", null);
        setField(term668843, term668843.getClass(), "propListHead", null);
        setIntField(term668843, term668843.getClass(), "sourcePosition", 0);
        setField(term668843, term668843.getClass(), "jsType", null);
        setField(term668843, term668843.getClass(), "parent", null);
        setField(term668841, term668841.getClass(), "next", term668843);
        setField(term668841, term668841.getClass(), "first", null);
        setField(term668841, term668841.getClass(), "last", null);
        setField(term668841, term668841.getClass(), "propListHead", null);
        setIntField(term668841, term668841.getClass(), "sourcePosition", 0);
        setField(term668841, term668841.getClass(), "jsType", null);
        setField(term668841, term668841.getClass(), "parent", null);
        setField(term668839, term668839.getClass(), "first", term668841);
        setField(term668839, term668839.getClass(), "last", null);
        setField(term668839, term668839.getClass(), "propListHead", null);
        setIntField(term668839, term668839.getClass(), "sourcePosition", 0);
        setField(term668839, term668839.getClass(), "jsType", null);
        setField(term668839, term668839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term668262;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term668170, args);
        assertTrue(recursiveEquals(term668170, term668896));
        assertTrue(recursiveEquals(term668262, term668897));
        assertTrue(recursiveEquals(retValue, term668839));
    }

};



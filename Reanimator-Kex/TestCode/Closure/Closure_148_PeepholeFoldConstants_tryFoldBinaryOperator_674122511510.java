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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107739;
     Object term107829;
     Object term107997;
     Object term107998;
     Object term107936;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107739 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term107829 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107919 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term107829, term107829.getClass(), "first", term107829);
        setField(term107829, term107829.getClass(), "next", term107919);
        setIntField(term107829, term107829.getClass(), "type", 16);
        term107997 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term107997, term107997.getClass(), "currentTraversal", null);
        term107998 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107999 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term107998, term107998.getClass(), "encodedSourceStart", 0);
        setIntField(term107998, term107998.getClass(), "encodedSourceEnd", 0);
        setField(term107998, term107998.getClass(), "sourceName", null);
        setIntField(term107998, term107998.getClass(), "baseLineno", 0);
        setIntField(term107998, term107998.getClass(), "endLineno", 0);
        setField(term107998, term107998.getClass(), "functions", null);
        setField(term107998, term107998.getClass(), "regexps", null);
        setField(term107998, term107998.getClass(), "itsVariables", null);
        setField(term107998, term107998.getClass(), "itsConst", null);
        setField(term107998, term107998.getClass(), "itsVariableNames", null);
        setIntField(term107998, term107998.getClass(), "varStart", 0);
        setField(term107998, term107998.getClass(), "compilerData", null);
        setIntField(term107998, term107998.getClass(), "type", 16);
        setIntField(term107999, term107999.getClass(), "encodedSourceStart", 0);
        setIntField(term107999, term107999.getClass(), "encodedSourceEnd", 0);
        setField(term107999, term107999.getClass(), "sourceName", null);
        setIntField(term107999, term107999.getClass(), "baseLineno", 0);
        setIntField(term107999, term107999.getClass(), "endLineno", 0);
        setField(term107999, term107999.getClass(), "functions", null);
        setField(term107999, term107999.getClass(), "regexps", null);
        setField(term107999, term107999.getClass(), "itsVariables", null);
        setField(term107999, term107999.getClass(), "itsConst", null);
        setField(term107999, term107999.getClass(), "itsVariableNames", null);
        setIntField(term107999, term107999.getClass(), "varStart", 0);
        setField(term107999, term107999.getClass(), "compilerData", null);
        setIntField(term107999, term107999.getClass(), "type", 0);
        setField(term107999, term107999.getClass(), "next", null);
        setField(term107999, term107999.getClass(), "first", null);
        setField(term107999, term107999.getClass(), "last", null);
        setField(term107999, term107999.getClass(), "propListHead", null);
        setIntField(term107999, term107999.getClass(), "sourcePosition", 0);
        setField(term107999, term107999.getClass(), "jsType", null);
        setField(term107999, term107999.getClass(), "parent", null);
        setField(term107998, term107998.getClass(), "next", term107999);
        setField(term107998, term107998.getClass(), "first", term107998);
        setField(term107998, term107998.getClass(), "last", null);
        setField(term107998, term107998.getClass(), "propListHead", null);
        setIntField(term107998, term107998.getClass(), "sourcePosition", 0);
        setField(term107998, term107998.getClass(), "jsType", null);
        setField(term107998, term107998.getClass(), "parent", null);
        term107936 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term107943 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term107936, term107936.getClass(), "encodedSourceStart", 0);
        setIntField(term107936, term107936.getClass(), "encodedSourceEnd", 0);
        setField(term107936, term107936.getClass(), "sourceName", null);
        setIntField(term107936, term107936.getClass(), "baseLineno", 0);
        setIntField(term107936, term107936.getClass(), "endLineno", 0);
        setField(term107936, term107936.getClass(), "functions", null);
        setField(term107936, term107936.getClass(), "regexps", null);
        setField(term107936, term107936.getClass(), "itsVariables", null);
        setField(term107936, term107936.getClass(), "itsConst", null);
        setField(term107936, term107936.getClass(), "itsVariableNames", null);
        setIntField(term107936, term107936.getClass(), "varStart", 0);
        setField(term107936, term107936.getClass(), "compilerData", null);
        setIntField(term107936, term107936.getClass(), "type", 16);
        setIntField(term107943, term107943.getClass(), "encodedSourceStart", 0);
        setIntField(term107943, term107943.getClass(), "encodedSourceEnd", 0);
        setField(term107943, term107943.getClass(), "sourceName", null);
        setIntField(term107943, term107943.getClass(), "baseLineno", 0);
        setIntField(term107943, term107943.getClass(), "endLineno", 0);
        setField(term107943, term107943.getClass(), "functions", null);
        setField(term107943, term107943.getClass(), "regexps", null);
        setField(term107943, term107943.getClass(), "itsVariables", null);
        setField(term107943, term107943.getClass(), "itsConst", null);
        setField(term107943, term107943.getClass(), "itsVariableNames", null);
        setIntField(term107943, term107943.getClass(), "varStart", 0);
        setField(term107943, term107943.getClass(), "compilerData", null);
        setIntField(term107943, term107943.getClass(), "type", 0);
        setField(term107943, term107943.getClass(), "next", null);
        setField(term107943, term107943.getClass(), "first", null);
        setField(term107943, term107943.getClass(), "last", null);
        setField(term107943, term107943.getClass(), "propListHead", null);
        setIntField(term107943, term107943.getClass(), "sourcePosition", 0);
        setField(term107943, term107943.getClass(), "jsType", null);
        setField(term107943, term107943.getClass(), "parent", null);
        setField(term107936, term107936.getClass(), "next", term107943);
        setField(term107936, term107936.getClass(), "first", term107936);
        setField(term107936, term107936.getClass(), "last", null);
        setField(term107936, term107936.getClass(), "propListHead", null);
        setIntField(term107936, term107936.getClass(), "sourcePosition", 0);
        setField(term107936, term107936.getClass(), "jsType", null);
        setField(term107936, term107936.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term107829;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term107739, args);
        assertTrue(recursiveEquals(term107739, term107997));
        assertTrue(recursiveEquals(term107829, term107998));
        assertTrue(recursiveEquals(retValue, term107936));
    }

};



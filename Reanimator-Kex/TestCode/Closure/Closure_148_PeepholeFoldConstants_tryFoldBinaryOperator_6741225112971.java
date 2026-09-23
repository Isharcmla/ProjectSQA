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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871680;
     Object term871772;
     Object term873092;
     Object term873093;
     Object term872990;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term871680 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term871772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term871862 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term871948 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term872040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term871948, term871948.getClass(), "type", 64);
        setField(term871862, term871862.getClass(), "next", term871948);
        setIntField(term871862, term871862.getClass(), "type", 0);
        setField(term871772, term871772.getClass(), "first", term871862);
        setIntField(term871772, term871772.getClass(), "type", 101);
        setField(term871772, term871772.getClass(), "parent", term872040);
        term873092 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term873092, term873092.getClass(), "currentTraversal", null);
        term873093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term873094 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term873095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term873093, term873093.getClass(), "str", null);
        setIntField(term873093, term873093.getClass(), "type", 101);
        setField(term873093, term873093.getClass(), "next", null);
        setIntField(term873094, term873094.getClass(), "encodedSourceStart", 0);
        setIntField(term873094, term873094.getClass(), "encodedSourceEnd", 0);
        setField(term873094, term873094.getClass(), "sourceName", null);
        setIntField(term873094, term873094.getClass(), "baseLineno", 0);
        setIntField(term873094, term873094.getClass(), "endLineno", 0);
        setField(term873094, term873094.getClass(), "functions", null);
        setField(term873094, term873094.getClass(), "regexps", null);
        setField(term873094, term873094.getClass(), "itsVariables", null);
        setField(term873094, term873094.getClass(), "itsConst", null);
        setField(term873094, term873094.getClass(), "itsVariableNames", null);
        setIntField(term873094, term873094.getClass(), "varStart", 0);
        setField(term873094, term873094.getClass(), "compilerData", null);
        setIntField(term873094, term873094.getClass(), "type", 0);
        setField(term873095, term873095.getClass(), "functionName", null);
        setBooleanField(term873095, term873095.getClass(), "itsNeedsActivation", false);
        setIntField(term873095, term873095.getClass(), "itsFunctionType", 0);
        setBooleanField(term873095, term873095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term873095, term873095.getClass(), "encodedSourceStart", 0);
        setIntField(term873095, term873095.getClass(), "encodedSourceEnd", 0);
        setField(term873095, term873095.getClass(), "sourceName", null);
        setIntField(term873095, term873095.getClass(), "baseLineno", 0);
        setIntField(term873095, term873095.getClass(), "endLineno", 0);
        setField(term873095, term873095.getClass(), "functions", null);
        setField(term873095, term873095.getClass(), "regexps", null);
        setField(term873095, term873095.getClass(), "itsVariables", null);
        setField(term873095, term873095.getClass(), "itsConst", null);
        setField(term873095, term873095.getClass(), "itsVariableNames", null);
        setIntField(term873095, term873095.getClass(), "varStart", 0);
        setField(term873095, term873095.getClass(), "compilerData", null);
        setIntField(term873095, term873095.getClass(), "type", 64);
        setField(term873095, term873095.getClass(), "next", null);
        setField(term873095, term873095.getClass(), "first", null);
        setField(term873095, term873095.getClass(), "last", null);
        setField(term873095, term873095.getClass(), "propListHead", null);
        setIntField(term873095, term873095.getClass(), "sourcePosition", 0);
        setField(term873095, term873095.getClass(), "jsType", null);
        setField(term873095, term873095.getClass(), "parent", null);
        setField(term873094, term873094.getClass(), "next", term873095);
        setField(term873094, term873094.getClass(), "first", null);
        setField(term873094, term873094.getClass(), "last", null);
        setField(term873094, term873094.getClass(), "propListHead", null);
        setIntField(term873094, term873094.getClass(), "sourcePosition", 0);
        setField(term873094, term873094.getClass(), "jsType", null);
        setField(term873094, term873094.getClass(), "parent", null);
        setField(term873093, term873093.getClass(), "first", term873094);
        setField(term873093, term873093.getClass(), "last", null);
        setField(term873093, term873093.getClass(), "propListHead", null);
        setIntField(term873093, term873093.getClass(), "sourcePosition", 0);
        setField(term873093, term873093.getClass(), "jsType", null);
        setField(term873096, term873096.getClass(), "str", null);
        setIntField(term873096, term873096.getClass(), "type", 0);
        setField(term873096, term873096.getClass(), "next", null);
        setField(term873096, term873096.getClass(), "first", null);
        setField(term873096, term873096.getClass(), "last", null);
        setField(term873096, term873096.getClass(), "propListHead", null);
        setIntField(term873096, term873096.getClass(), "sourcePosition", 0);
        setField(term873096, term873096.getClass(), "jsType", null);
        setField(term873096, term873096.getClass(), "parent", null);
        setField(term873093, term873093.getClass(), "parent", term873096);
        term872990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term872992 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term872999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term873012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term872990, term872990.getClass(), "str", null);
        setIntField(term872990, term872990.getClass(), "type", 101);
        setField(term872990, term872990.getClass(), "next", null);
        setIntField(term872992, term872992.getClass(), "encodedSourceStart", 0);
        setIntField(term872992, term872992.getClass(), "encodedSourceEnd", 0);
        setField(term872992, term872992.getClass(), "sourceName", null);
        setIntField(term872992, term872992.getClass(), "baseLineno", 0);
        setIntField(term872992, term872992.getClass(), "endLineno", 0);
        setField(term872992, term872992.getClass(), "functions", null);
        setField(term872992, term872992.getClass(), "regexps", null);
        setField(term872992, term872992.getClass(), "itsVariables", null);
        setField(term872992, term872992.getClass(), "itsConst", null);
        setField(term872992, term872992.getClass(), "itsVariableNames", null);
        setIntField(term872992, term872992.getClass(), "varStart", 0);
        setField(term872992, term872992.getClass(), "compilerData", null);
        setIntField(term872992, term872992.getClass(), "type", 0);
        setField(term872999, term872999.getClass(), "functionName", null);
        setBooleanField(term872999, term872999.getClass(), "itsNeedsActivation", false);
        setIntField(term872999, term872999.getClass(), "itsFunctionType", 0);
        setBooleanField(term872999, term872999.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term872999, term872999.getClass(), "encodedSourceStart", 0);
        setIntField(term872999, term872999.getClass(), "encodedSourceEnd", 0);
        setField(term872999, term872999.getClass(), "sourceName", null);
        setIntField(term872999, term872999.getClass(), "baseLineno", 0);
        setIntField(term872999, term872999.getClass(), "endLineno", 0);
        setField(term872999, term872999.getClass(), "functions", null);
        setField(term872999, term872999.getClass(), "regexps", null);
        setField(term872999, term872999.getClass(), "itsVariables", null);
        setField(term872999, term872999.getClass(), "itsConst", null);
        setField(term872999, term872999.getClass(), "itsVariableNames", null);
        setIntField(term872999, term872999.getClass(), "varStart", 0);
        setField(term872999, term872999.getClass(), "compilerData", null);
        setIntField(term872999, term872999.getClass(), "type", 64);
        setField(term872999, term872999.getClass(), "next", null);
        setField(term872999, term872999.getClass(), "first", null);
        setField(term872999, term872999.getClass(), "last", null);
        setField(term872999, term872999.getClass(), "propListHead", null);
        setIntField(term872999, term872999.getClass(), "sourcePosition", 0);
        setField(term872999, term872999.getClass(), "jsType", null);
        setField(term872999, term872999.getClass(), "parent", null);
        setField(term872992, term872992.getClass(), "next", term872999);
        setField(term872992, term872992.getClass(), "first", null);
        setField(term872992, term872992.getClass(), "last", null);
        setField(term872992, term872992.getClass(), "propListHead", null);
        setIntField(term872992, term872992.getClass(), "sourcePosition", 0);
        setField(term872992, term872992.getClass(), "jsType", null);
        setField(term872992, term872992.getClass(), "parent", null);
        setField(term872990, term872990.getClass(), "first", term872992);
        setField(term872990, term872990.getClass(), "last", null);
        setField(term872990, term872990.getClass(), "propListHead", null);
        setIntField(term872990, term872990.getClass(), "sourcePosition", 0);
        setField(term872990, term872990.getClass(), "jsType", null);
        setField(term873012, term873012.getClass(), "str", null);
        setIntField(term873012, term873012.getClass(), "type", 0);
        setField(term873012, term873012.getClass(), "next", null);
        setField(term873012, term873012.getClass(), "first", null);
        setField(term873012, term873012.getClass(), "last", null);
        setField(term873012, term873012.getClass(), "propListHead", null);
        setIntField(term873012, term873012.getClass(), "sourcePosition", 0);
        setField(term873012, term873012.getClass(), "jsType", null);
        setField(term873012, term873012.getClass(), "parent", null);
        setField(term872990, term872990.getClass(), "parent", term873012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term871772;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term871680, args);
        assertTrue(recursiveEquals(term871680, term873092));
        assertTrue(recursiveEquals(term871772, term873093));
        assertTrue(recursiveEquals(retValue, term872990));
    }

};



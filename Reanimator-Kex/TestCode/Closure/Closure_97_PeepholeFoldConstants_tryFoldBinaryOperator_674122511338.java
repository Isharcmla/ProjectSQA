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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65052;
     Object term65138;
     Object term81026;
     Object term81027;
     Object term80967;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65224, term65224.getClass(), "next", term65294);
        setField(term65138, term65138.getClass(), "first", term65224);
        setIntField(term65138, term65138.getClass(), "type", 24);
        term81026 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term81026, term81026.getClass(), "currentTraversal", null);
        term81027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81027, term81027.getClass(), "functionName", null);
        setBooleanField(term81027, term81027.getClass(), "itsNeedsActivation", false);
        setIntField(term81027, term81027.getClass(), "itsFunctionType", 0);
        setBooleanField(term81027, term81027.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81027, term81027.getClass(), "encodedSourceStart", 0);
        setIntField(term81027, term81027.getClass(), "encodedSourceEnd", 0);
        setField(term81027, term81027.getClass(), "sourceName", null);
        setIntField(term81027, term81027.getClass(), "baseLineno", 0);
        setIntField(term81027, term81027.getClass(), "endLineno", 0);
        setField(term81027, term81027.getClass(), "functions", null);
        setField(term81027, term81027.getClass(), "regexps", null);
        setField(term81027, term81027.getClass(), "itsVariables", null);
        setField(term81027, term81027.getClass(), "itsConst", null);
        setField(term81027, term81027.getClass(), "itsVariableNames", null);
        setIntField(term81027, term81027.getClass(), "varStart", 0);
        setField(term81027, term81027.getClass(), "compilerData", null);
        setIntField(term81027, term81027.getClass(), "type", 24);
        setField(term81027, term81027.getClass(), "next", null);
        setField(term81028, term81028.getClass(), "functionName", null);
        setBooleanField(term81028, term81028.getClass(), "itsNeedsActivation", false);
        setIntField(term81028, term81028.getClass(), "itsFunctionType", 0);
        setBooleanField(term81028, term81028.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81028, term81028.getClass(), "encodedSourceStart", 0);
        setIntField(term81028, term81028.getClass(), "encodedSourceEnd", 0);
        setField(term81028, term81028.getClass(), "sourceName", null);
        setIntField(term81028, term81028.getClass(), "baseLineno", 0);
        setIntField(term81028, term81028.getClass(), "endLineno", 0);
        setField(term81028, term81028.getClass(), "functions", null);
        setField(term81028, term81028.getClass(), "regexps", null);
        setField(term81028, term81028.getClass(), "itsVariables", null);
        setField(term81028, term81028.getClass(), "itsConst", null);
        setField(term81028, term81028.getClass(), "itsVariableNames", null);
        setIntField(term81028, term81028.getClass(), "varStart", 0);
        setField(term81028, term81028.getClass(), "compilerData", null);
        setIntField(term81028, term81028.getClass(), "type", 0);
        setIntField(term81029, term81029.getClass(), "type", 0);
        setField(term81029, term81029.getClass(), "next", null);
        setField(term81029, term81029.getClass(), "first", null);
        setField(term81029, term81029.getClass(), "last", null);
        setField(term81029, term81029.getClass(), "propListHead", null);
        setIntField(term81029, term81029.getClass(), "sourcePosition", 0);
        setField(term81029, term81029.getClass(), "jsType", null);
        setField(term81029, term81029.getClass(), "parent", null);
        setField(term81028, term81028.getClass(), "next", term81029);
        setField(term81028, term81028.getClass(), "first", null);
        setField(term81028, term81028.getClass(), "last", null);
        setField(term81028, term81028.getClass(), "propListHead", null);
        setIntField(term81028, term81028.getClass(), "sourcePosition", 0);
        setField(term81028, term81028.getClass(), "jsType", null);
        setField(term81028, term81028.getClass(), "parent", null);
        setField(term81027, term81027.getClass(), "first", term81028);
        setField(term81027, term81027.getClass(), "last", null);
        setField(term81027, term81027.getClass(), "propListHead", null);
        setIntField(term81027, term81027.getClass(), "sourcePosition", 0);
        setField(term81027, term81027.getClass(), "jsType", null);
        setField(term81027, term81027.getClass(), "parent", null);
        term80967 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80977 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80967, term80967.getClass(), "functionName", null);
        setBooleanField(term80967, term80967.getClass(), "itsNeedsActivation", false);
        setIntField(term80967, term80967.getClass(), "itsFunctionType", 0);
        setBooleanField(term80967, term80967.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80967, term80967.getClass(), "encodedSourceStart", 0);
        setIntField(term80967, term80967.getClass(), "encodedSourceEnd", 0);
        setField(term80967, term80967.getClass(), "sourceName", null);
        setIntField(term80967, term80967.getClass(), "baseLineno", 0);
        setIntField(term80967, term80967.getClass(), "endLineno", 0);
        setField(term80967, term80967.getClass(), "functions", null);
        setField(term80967, term80967.getClass(), "regexps", null);
        setField(term80967, term80967.getClass(), "itsVariables", null);
        setField(term80967, term80967.getClass(), "itsConst", null);
        setField(term80967, term80967.getClass(), "itsVariableNames", null);
        setIntField(term80967, term80967.getClass(), "varStart", 0);
        setField(term80967, term80967.getClass(), "compilerData", null);
        setIntField(term80967, term80967.getClass(), "type", 24);
        setField(term80967, term80967.getClass(), "next", null);
        setField(term80977, term80977.getClass(), "functionName", null);
        setBooleanField(term80977, term80977.getClass(), "itsNeedsActivation", false);
        setIntField(term80977, term80977.getClass(), "itsFunctionType", 0);
        setBooleanField(term80977, term80977.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80977, term80977.getClass(), "encodedSourceStart", 0);
        setIntField(term80977, term80977.getClass(), "encodedSourceEnd", 0);
        setField(term80977, term80977.getClass(), "sourceName", null);
        setIntField(term80977, term80977.getClass(), "baseLineno", 0);
        setIntField(term80977, term80977.getClass(), "endLineno", 0);
        setField(term80977, term80977.getClass(), "functions", null);
        setField(term80977, term80977.getClass(), "regexps", null);
        setField(term80977, term80977.getClass(), "itsVariables", null);
        setField(term80977, term80977.getClass(), "itsConst", null);
        setField(term80977, term80977.getClass(), "itsVariableNames", null);
        setIntField(term80977, term80977.getClass(), "varStart", 0);
        setField(term80977, term80977.getClass(), "compilerData", null);
        setIntField(term80977, term80977.getClass(), "type", 0);
        setIntField(term80987, term80987.getClass(), "type", 0);
        setField(term80987, term80987.getClass(), "next", null);
        setField(term80987, term80987.getClass(), "first", null);
        setField(term80987, term80987.getClass(), "last", null);
        setField(term80987, term80987.getClass(), "propListHead", null);
        setIntField(term80987, term80987.getClass(), "sourcePosition", 0);
        setField(term80987, term80987.getClass(), "jsType", null);
        setField(term80987, term80987.getClass(), "parent", null);
        setField(term80977, term80977.getClass(), "next", term80987);
        setField(term80977, term80977.getClass(), "first", null);
        setField(term80977, term80977.getClass(), "last", null);
        setField(term80977, term80977.getClass(), "propListHead", null);
        setIntField(term80977, term80977.getClass(), "sourcePosition", 0);
        setField(term80977, term80977.getClass(), "jsType", null);
        setField(term80977, term80977.getClass(), "parent", null);
        setField(term80967, term80967.getClass(), "first", term80977);
        setField(term80967, term80967.getClass(), "last", null);
        setField(term80967, term80967.getClass(), "propListHead", null);
        setIntField(term80967, term80967.getClass(), "sourcePosition", 0);
        setField(term80967, term80967.getClass(), "jsType", null);
        setField(term80967, term80967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65138;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term65052, args);
        assertTrue(recursiveEquals(term65052, term81026));
        assertTrue(recursiveEquals(term65138, term81027));
        assertTrue(recursiveEquals(retValue, term80967));
    }

};



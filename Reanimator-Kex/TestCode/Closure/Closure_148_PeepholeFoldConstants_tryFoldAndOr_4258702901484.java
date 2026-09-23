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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369071;
     Object term369157;
     Object term369313;
     Object term369399;
     Object term369494;
     Object term369495;
     Object term369497;
     Object term369498;
     Object term369403;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369071 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term369157 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369227, term369227.getClass(), "type", 108);
        setField(term369157, term369157.getClass(), "parent", term369227);
        setIntField(term369157, term369157.getClass(), "type", 0);
        term369313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term369313, term369313.getClass(), "type", 0);
        term369399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term369399, term369399.getClass(), "type", 63);
        term369494 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term369494, term369494.getClass(), "currentTraversal", null);
        term369495 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369495, term369495.getClass(), "functionName", null);
        setBooleanField(term369495, term369495.getClass(), "itsNeedsActivation", false);
        setIntField(term369495, term369495.getClass(), "itsFunctionType", 0);
        setBooleanField(term369495, term369495.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369495, term369495.getClass(), "encodedSourceStart", 0);
        setIntField(term369495, term369495.getClass(), "encodedSourceEnd", 0);
        setField(term369495, term369495.getClass(), "sourceName", null);
        setIntField(term369495, term369495.getClass(), "baseLineno", 0);
        setIntField(term369495, term369495.getClass(), "endLineno", 0);
        setField(term369495, term369495.getClass(), "functions", null);
        setField(term369495, term369495.getClass(), "regexps", null);
        setField(term369495, term369495.getClass(), "itsVariables", null);
        setField(term369495, term369495.getClass(), "itsConst", null);
        setField(term369495, term369495.getClass(), "itsVariableNames", null);
        setIntField(term369495, term369495.getClass(), "varStart", 0);
        setField(term369495, term369495.getClass(), "compilerData", null);
        setIntField(term369495, term369495.getClass(), "type", 0);
        setField(term369495, term369495.getClass(), "next", null);
        setField(term369495, term369495.getClass(), "first", null);
        setField(term369495, term369495.getClass(), "last", null);
        setField(term369495, term369495.getClass(), "propListHead", null);
        setIntField(term369495, term369495.getClass(), "sourcePosition", 0);
        setField(term369495, term369495.getClass(), "jsType", null);
        setIntField(term369496, term369496.getClass(), "type", 108);
        setField(term369496, term369496.getClass(), "next", null);
        setField(term369496, term369496.getClass(), "first", null);
        setField(term369496, term369496.getClass(), "last", null);
        setField(term369496, term369496.getClass(), "propListHead", null);
        setIntField(term369496, term369496.getClass(), "sourcePosition", 0);
        setField(term369496, term369496.getClass(), "jsType", null);
        setField(term369496, term369496.getClass(), "parent", null);
        setField(term369495, term369495.getClass(), "parent", term369496);
        term369497 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term369497, term369497.getClass(), "functionName", null);
        setBooleanField(term369497, term369497.getClass(), "itsNeedsActivation", false);
        setIntField(term369497, term369497.getClass(), "itsFunctionType", 0);
        setBooleanField(term369497, term369497.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369497, term369497.getClass(), "encodedSourceStart", 0);
        setIntField(term369497, term369497.getClass(), "encodedSourceEnd", 0);
        setField(term369497, term369497.getClass(), "sourceName", null);
        setIntField(term369497, term369497.getClass(), "baseLineno", 0);
        setIntField(term369497, term369497.getClass(), "endLineno", 0);
        setField(term369497, term369497.getClass(), "functions", null);
        setField(term369497, term369497.getClass(), "regexps", null);
        setField(term369497, term369497.getClass(), "itsVariables", null);
        setField(term369497, term369497.getClass(), "itsConst", null);
        setField(term369497, term369497.getClass(), "itsVariableNames", null);
        setIntField(term369497, term369497.getClass(), "varStart", 0);
        setField(term369497, term369497.getClass(), "compilerData", null);
        setIntField(term369497, term369497.getClass(), "type", 0);
        setField(term369497, term369497.getClass(), "next", null);
        setField(term369497, term369497.getClass(), "first", null);
        setField(term369497, term369497.getClass(), "last", null);
        setField(term369497, term369497.getClass(), "propListHead", null);
        setIntField(term369497, term369497.getClass(), "sourcePosition", 0);
        setField(term369497, term369497.getClass(), "jsType", null);
        setField(term369497, term369497.getClass(), "parent", null);
        term369498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term369498, term369498.getClass(), "functionName", null);
        setBooleanField(term369498, term369498.getClass(), "itsNeedsActivation", false);
        setIntField(term369498, term369498.getClass(), "itsFunctionType", 0);
        setBooleanField(term369498, term369498.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369498, term369498.getClass(), "encodedSourceStart", 0);
        setIntField(term369498, term369498.getClass(), "encodedSourceEnd", 0);
        setField(term369498, term369498.getClass(), "sourceName", null);
        setIntField(term369498, term369498.getClass(), "baseLineno", 0);
        setIntField(term369498, term369498.getClass(), "endLineno", 0);
        setField(term369498, term369498.getClass(), "functions", null);
        setField(term369498, term369498.getClass(), "regexps", null);
        setField(term369498, term369498.getClass(), "itsVariables", null);
        setField(term369498, term369498.getClass(), "itsConst", null);
        setField(term369498, term369498.getClass(), "itsVariableNames", null);
        setIntField(term369498, term369498.getClass(), "varStart", 0);
        setField(term369498, term369498.getClass(), "compilerData", null);
        setIntField(term369498, term369498.getClass(), "type", 63);
        setField(term369498, term369498.getClass(), "next", null);
        setField(term369498, term369498.getClass(), "first", null);
        setField(term369498, term369498.getClass(), "last", null);
        setField(term369498, term369498.getClass(), "propListHead", null);
        setIntField(term369498, term369498.getClass(), "sourcePosition", 0);
        setField(term369498, term369498.getClass(), "jsType", null);
        setField(term369498, term369498.getClass(), "parent", null);
        term369403 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term369414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369403, term369403.getClass(), "functionName", null);
        setBooleanField(term369403, term369403.getClass(), "itsNeedsActivation", false);
        setIntField(term369403, term369403.getClass(), "itsFunctionType", 0);
        setBooleanField(term369403, term369403.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term369403, term369403.getClass(), "encodedSourceStart", 0);
        setIntField(term369403, term369403.getClass(), "encodedSourceEnd", 0);
        setField(term369403, term369403.getClass(), "sourceName", null);
        setIntField(term369403, term369403.getClass(), "baseLineno", 0);
        setIntField(term369403, term369403.getClass(), "endLineno", 0);
        setField(term369403, term369403.getClass(), "functions", null);
        setField(term369403, term369403.getClass(), "regexps", null);
        setField(term369403, term369403.getClass(), "itsVariables", null);
        setField(term369403, term369403.getClass(), "itsConst", null);
        setField(term369403, term369403.getClass(), "itsVariableNames", null);
        setIntField(term369403, term369403.getClass(), "varStart", 0);
        setField(term369403, term369403.getClass(), "compilerData", null);
        setIntField(term369403, term369403.getClass(), "type", 0);
        setField(term369403, term369403.getClass(), "next", null);
        setField(term369403, term369403.getClass(), "first", null);
        setField(term369403, term369403.getClass(), "last", null);
        setField(term369403, term369403.getClass(), "propListHead", null);
        setIntField(term369403, term369403.getClass(), "sourcePosition", 0);
        setField(term369403, term369403.getClass(), "jsType", null);
        setIntField(term369414, term369414.getClass(), "type", 108);
        setField(term369414, term369414.getClass(), "next", null);
        setField(term369414, term369414.getClass(), "first", null);
        setField(term369414, term369414.getClass(), "last", null);
        setField(term369414, term369414.getClass(), "propListHead", null);
        setIntField(term369414, term369414.getClass(), "sourcePosition", 0);
        setField(term369414, term369414.getClass(), "jsType", null);
        setField(term369414, term369414.getClass(), "parent", null);
        setField(term369403, term369403.getClass(), "parent", term369414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term369157;
        args[1] = term369313;
        args[2] = term369399;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term369071, args);
        assertTrue(recursiveEquals(term369071, term369494));
        assertTrue(recursiveEquals(term369157, term369495));
        assertTrue(recursiveEquals(term369313, term369497));
        assertTrue(recursiveEquals(term369399, term369498));
        assertTrue(recursiveEquals(retValue, term369403));
    }

};



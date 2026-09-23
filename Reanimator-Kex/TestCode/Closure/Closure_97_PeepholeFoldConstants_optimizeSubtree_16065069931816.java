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

public class PeepholeFoldConstants_optimizeSubtree_16065069931816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704741;
     Object term704831;
     Object term705474;
     Object term705475;
     Object term705379;

    public PeepholeFoldConstants_optimizeSubtree_16065069931816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704741 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term704831 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term704917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term705009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term704831, term704831.getClass(), "type", 35);
        setField(term704917, term704917.getClass(), "next", term705009);
        setIntField(term704917, term704917.getClass(), "type", 63);
        setField(term704831, term704831.getClass(), "first", term704917);
        term705474 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term705474, term705474.getClass(), "currentTraversal", null);
        term705475 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term705476 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term705477 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term705475, term705475.getClass(), "encodedSourceStart", 0);
        setIntField(term705475, term705475.getClass(), "encodedSourceEnd", 0);
        setField(term705475, term705475.getClass(), "sourceName", null);
        setIntField(term705475, term705475.getClass(), "baseLineno", 0);
        setIntField(term705475, term705475.getClass(), "endLineno", 0);
        setField(term705475, term705475.getClass(), "functions", null);
        setField(term705475, term705475.getClass(), "regexps", null);
        setField(term705475, term705475.getClass(), "itsVariables", null);
        setField(term705475, term705475.getClass(), "itsConst", null);
        setField(term705475, term705475.getClass(), "itsVariableNames", null);
        setIntField(term705475, term705475.getClass(), "varStart", 0);
        setField(term705475, term705475.getClass(), "compilerData", null);
        setIntField(term705475, term705475.getClass(), "type", 35);
        setField(term705475, term705475.getClass(), "next", null);
        setField(term705476, term705476.getClass(), "functionName", null);
        setBooleanField(term705476, term705476.getClass(), "itsNeedsActivation", false);
        setIntField(term705476, term705476.getClass(), "itsFunctionType", 0);
        setBooleanField(term705476, term705476.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term705476, term705476.getClass(), "encodedSourceStart", 0);
        setIntField(term705476, term705476.getClass(), "encodedSourceEnd", 0);
        setField(term705476, term705476.getClass(), "sourceName", null);
        setIntField(term705476, term705476.getClass(), "baseLineno", 0);
        setIntField(term705476, term705476.getClass(), "endLineno", 0);
        setField(term705476, term705476.getClass(), "functions", null);
        setField(term705476, term705476.getClass(), "regexps", null);
        setField(term705476, term705476.getClass(), "itsVariables", null);
        setField(term705476, term705476.getClass(), "itsConst", null);
        setField(term705476, term705476.getClass(), "itsVariableNames", null);
        setIntField(term705476, term705476.getClass(), "varStart", 0);
        setField(term705476, term705476.getClass(), "compilerData", null);
        setIntField(term705476, term705476.getClass(), "type", 63);
        setField(term705477, term705477.getClass(), "str", null);
        setIntField(term705477, term705477.getClass(), "type", 0);
        setField(term705477, term705477.getClass(), "next", null);
        setField(term705477, term705477.getClass(), "first", null);
        setField(term705477, term705477.getClass(), "last", null);
        setField(term705477, term705477.getClass(), "propListHead", null);
        setIntField(term705477, term705477.getClass(), "sourcePosition", 0);
        setField(term705477, term705477.getClass(), "jsType", null);
        setField(term705477, term705477.getClass(), "parent", null);
        setField(term705476, term705476.getClass(), "next", term705477);
        setField(term705476, term705476.getClass(), "first", null);
        setField(term705476, term705476.getClass(), "last", null);
        setField(term705476, term705476.getClass(), "propListHead", null);
        setIntField(term705476, term705476.getClass(), "sourcePosition", 0);
        setField(term705476, term705476.getClass(), "jsType", null);
        setField(term705476, term705476.getClass(), "parent", null);
        setField(term705475, term705475.getClass(), "first", term705476);
        setField(term705475, term705475.getClass(), "last", null);
        setField(term705475, term705475.getClass(), "propListHead", null);
        setIntField(term705475, term705475.getClass(), "sourcePosition", 0);
        setField(term705475, term705475.getClass(), "jsType", null);
        setField(term705475, term705475.getClass(), "parent", null);
        term705379 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term705386 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term705396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term705379, term705379.getClass(), "encodedSourceStart", 0);
        setIntField(term705379, term705379.getClass(), "encodedSourceEnd", 0);
        setField(term705379, term705379.getClass(), "sourceName", null);
        setIntField(term705379, term705379.getClass(), "baseLineno", 0);
        setIntField(term705379, term705379.getClass(), "endLineno", 0);
        setField(term705379, term705379.getClass(), "functions", null);
        setField(term705379, term705379.getClass(), "regexps", null);
        setField(term705379, term705379.getClass(), "itsVariables", null);
        setField(term705379, term705379.getClass(), "itsConst", null);
        setField(term705379, term705379.getClass(), "itsVariableNames", null);
        setIntField(term705379, term705379.getClass(), "varStart", 0);
        setField(term705379, term705379.getClass(), "compilerData", null);
        setIntField(term705379, term705379.getClass(), "type", 35);
        setField(term705379, term705379.getClass(), "next", null);
        setField(term705386, term705386.getClass(), "functionName", null);
        setBooleanField(term705386, term705386.getClass(), "itsNeedsActivation", false);
        setIntField(term705386, term705386.getClass(), "itsFunctionType", 0);
        setBooleanField(term705386, term705386.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term705386, term705386.getClass(), "encodedSourceStart", 0);
        setIntField(term705386, term705386.getClass(), "encodedSourceEnd", 0);
        setField(term705386, term705386.getClass(), "sourceName", null);
        setIntField(term705386, term705386.getClass(), "baseLineno", 0);
        setIntField(term705386, term705386.getClass(), "endLineno", 0);
        setField(term705386, term705386.getClass(), "functions", null);
        setField(term705386, term705386.getClass(), "regexps", null);
        setField(term705386, term705386.getClass(), "itsVariables", null);
        setField(term705386, term705386.getClass(), "itsConst", null);
        setField(term705386, term705386.getClass(), "itsVariableNames", null);
        setIntField(term705386, term705386.getClass(), "varStart", 0);
        setField(term705386, term705386.getClass(), "compilerData", null);
        setIntField(term705386, term705386.getClass(), "type", 63);
        setField(term705396, term705396.getClass(), "str", null);
        setIntField(term705396, term705396.getClass(), "type", 0);
        setField(term705396, term705396.getClass(), "next", null);
        setField(term705396, term705396.getClass(), "first", null);
        setField(term705396, term705396.getClass(), "last", null);
        setField(term705396, term705396.getClass(), "propListHead", null);
        setIntField(term705396, term705396.getClass(), "sourcePosition", 0);
        setField(term705396, term705396.getClass(), "jsType", null);
        setField(term705396, term705396.getClass(), "parent", null);
        setField(term705386, term705386.getClass(), "next", term705396);
        setField(term705386, term705386.getClass(), "first", null);
        setField(term705386, term705386.getClass(), "last", null);
        setField(term705386, term705386.getClass(), "propListHead", null);
        setIntField(term705386, term705386.getClass(), "sourcePosition", 0);
        setField(term705386, term705386.getClass(), "jsType", null);
        setField(term705386, term705386.getClass(), "parent", null);
        setField(term705379, term705379.getClass(), "first", term705386);
        setField(term705379, term705379.getClass(), "last", null);
        setField(term705379, term705379.getClass(), "propListHead", null);
        setIntField(term705379, term705379.getClass(), "sourcePosition", 0);
        setField(term705379, term705379.getClass(), "jsType", null);
        setField(term705379, term705379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term704831;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term704741, args);
        assertTrue(recursiveEquals(term704741, term705474));
        assertTrue(recursiveEquals(term704831, term705475));
        assertTrue(recursiveEquals(retValue, term705379));
    }

};



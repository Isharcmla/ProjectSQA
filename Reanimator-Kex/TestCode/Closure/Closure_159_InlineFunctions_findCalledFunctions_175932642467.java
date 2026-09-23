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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class InlineFunctions_findCalledFunctions_175932642467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11340;
     Object term11426;
     Object term11560;
     Object term12147;
     Object term12148;
     Object term12150;

    public InlineFunctions_findCalledFunctions_175932642467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11340 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term11426 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term11512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term11426, term11426.getClass(), "type", -38);
        setField(term11426, term11426.getClass(), "first", term11512);
        term11560 = new HashSet();
        term12147 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term12147, term12147.getClass(), "fns", null);
        setField(term12147, term12147.getClass(), "anonFns", null);
        setField(term12147, term12147.getClass(), "compiler", null);
        setField(term12147, term12147.getClass(), "injector", null);
        setBooleanField(term12147, term12147.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term12147, term12147.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term12147, term12147.getClass(), "inlineLocalFunctions", false);
        setField(term12147, term12147.getClass(), "specializationState", null);
        term12148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term12149 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term12148, term12148.getClass(), "functionName", null);
        setBooleanField(term12148, term12148.getClass(), "itsNeedsActivation", false);
        setIntField(term12148, term12148.getClass(), "itsFunctionType", 0);
        setBooleanField(term12148, term12148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term12148, term12148.getClass(), "encodedSourceStart", 0);
        setIntField(term12148, term12148.getClass(), "encodedSourceEnd", 0);
        setField(term12148, term12148.getClass(), "sourceName", null);
        setIntField(term12148, term12148.getClass(), "baseLineno", 0);
        setIntField(term12148, term12148.getClass(), "endLineno", 0);
        setField(term12148, term12148.getClass(), "functions", null);
        setField(term12148, term12148.getClass(), "regexps", null);
        setField(term12148, term12148.getClass(), "itsVariables", null);
        setField(term12148, term12148.getClass(), "itsConst", null);
        setField(term12148, term12148.getClass(), "itsVariableNames", null);
        setIntField(term12148, term12148.getClass(), "varStart", 0);
        setField(term12148, term12148.getClass(), "compilerData", null);
        setIntField(term12148, term12148.getClass(), "type", -38);
        setField(term12148, term12148.getClass(), "next", null);
        setField(term12149, term12149.getClass(), "functionName", null);
        setBooleanField(term12149, term12149.getClass(), "itsNeedsActivation", false);
        setIntField(term12149, term12149.getClass(), "itsFunctionType", 0);
        setBooleanField(term12149, term12149.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term12149, term12149.getClass(), "encodedSourceStart", 0);
        setIntField(term12149, term12149.getClass(), "encodedSourceEnd", 0);
        setField(term12149, term12149.getClass(), "sourceName", null);
        setIntField(term12149, term12149.getClass(), "baseLineno", 0);
        setIntField(term12149, term12149.getClass(), "endLineno", 0);
        setField(term12149, term12149.getClass(), "functions", null);
        setField(term12149, term12149.getClass(), "regexps", null);
        setField(term12149, term12149.getClass(), "itsVariables", null);
        setField(term12149, term12149.getClass(), "itsConst", null);
        setField(term12149, term12149.getClass(), "itsVariableNames", null);
        setIntField(term12149, term12149.getClass(), "varStart", 0);
        setField(term12149, term12149.getClass(), "compilerData", null);
        setIntField(term12149, term12149.getClass(), "type", 0);
        setField(term12149, term12149.getClass(), "next", null);
        setField(term12149, term12149.getClass(), "first", null);
        setField(term12149, term12149.getClass(), "last", null);
        setField(term12149, term12149.getClass(), "propListHead", null);
        setIntField(term12149, term12149.getClass(), "sourcePosition", 0);
        setField(term12149, term12149.getClass(), "jsType", null);
        setField(term12149, term12149.getClass(), "parent", null);
        setField(term12148, term12148.getClass(), "first", term12149);
        setField(term12148, term12148.getClass(), "last", null);
        setField(term12148, term12148.getClass(), "propListHead", null);
        setIntField(term12148, term12148.getClass(), "sourcePosition", 0);
        setField(term12148, term12148.getClass(), "jsType", null);
        setField(term12148, term12148.getClass(), "parent", null);
        HashMap term12151 = new HashMap();
        Set<Object> term12152 =  ((Map) term12151).keySet();
        term12150 = new HashSet((Collection<? extends Object>) term12152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term11426;
        args[1] = term11560;
        callMethod(klass, "findCalledFunctions", argTypes, term11340, args);
        assertTrue(recursiveEquals(term11340, term12147));
        assertTrue(recursiveEquals(term11426, term12148));
        assertTrue(recursiveEquals(term11560, term12150));
    }

};



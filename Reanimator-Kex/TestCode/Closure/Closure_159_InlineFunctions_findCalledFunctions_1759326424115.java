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

public class InlineFunctions_findCalledFunctions_1759326424115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19903;
     Object term19989;
     Object term20129;
     Object term70122;
     Object term70123;
     Object term70125;

    public InlineFunctions_findCalledFunctions_1759326424115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19903 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term19989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term20081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19989, term19989.getClass(), "type", -38);
        setField(term19989, term19989.getClass(), "first", term20081);
        term20129 = new HashSet();
        term70122 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term70122, term70122.getClass(), "fns", null);
        setField(term70122, term70122.getClass(), "anonFns", null);
        setField(term70122, term70122.getClass(), "compiler", null);
        setField(term70122, term70122.getClass(), "injector", null);
        setBooleanField(term70122, term70122.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term70122, term70122.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term70122, term70122.getClass(), "inlineLocalFunctions", false);
        setField(term70122, term70122.getClass(), "specializationState", null);
        term70123 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70123, term70123.getClass(), "functionName", null);
        setBooleanField(term70123, term70123.getClass(), "itsNeedsActivation", false);
        setIntField(term70123, term70123.getClass(), "itsFunctionType", 0);
        setBooleanField(term70123, term70123.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70123, term70123.getClass(), "encodedSourceStart", 0);
        setIntField(term70123, term70123.getClass(), "encodedSourceEnd", 0);
        setField(term70123, term70123.getClass(), "sourceName", null);
        setIntField(term70123, term70123.getClass(), "baseLineno", 0);
        setIntField(term70123, term70123.getClass(), "endLineno", 0);
        setField(term70123, term70123.getClass(), "functions", null);
        setField(term70123, term70123.getClass(), "regexps", null);
        setField(term70123, term70123.getClass(), "itsVariables", null);
        setField(term70123, term70123.getClass(), "itsConst", null);
        setField(term70123, term70123.getClass(), "itsVariableNames", null);
        setIntField(term70123, term70123.getClass(), "varStart", 0);
        setField(term70123, term70123.getClass(), "compilerData", null);
        setIntField(term70123, term70123.getClass(), "type", -38);
        setField(term70123, term70123.getClass(), "next", null);
        setField(term70124, term70124.getClass(), "str", null);
        setIntField(term70124, term70124.getClass(), "type", 0);
        setField(term70124, term70124.getClass(), "next", null);
        setField(term70124, term70124.getClass(), "first", null);
        setField(term70124, term70124.getClass(), "last", null);
        setField(term70124, term70124.getClass(), "propListHead", null);
        setIntField(term70124, term70124.getClass(), "sourcePosition", 0);
        setField(term70124, term70124.getClass(), "jsType", null);
        setField(term70124, term70124.getClass(), "parent", null);
        setField(term70123, term70123.getClass(), "first", term70124);
        setField(term70123, term70123.getClass(), "last", null);
        setField(term70123, term70123.getClass(), "propListHead", null);
        setIntField(term70123, term70123.getClass(), "sourcePosition", 0);
        setField(term70123, term70123.getClass(), "jsType", null);
        setField(term70123, term70123.getClass(), "parent", null);
        HashMap term70126 = new HashMap();
        Set<Object> term70127 =  ((Map) term70126).keySet();
        term70125 = new HashSet((Collection<? extends Object>) term70127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term19989;
        args[1] = term20129;
        callMethod(klass, "findCalledFunctions", argTypes, term19903, args);
        assertTrue(recursiveEquals(term19903, term70122));
        assertTrue(recursiveEquals(term19989, term70123));
        assertTrue(recursiveEquals(term20129, term70125));
    }

};



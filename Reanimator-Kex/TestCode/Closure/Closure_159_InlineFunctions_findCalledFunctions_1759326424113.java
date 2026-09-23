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

public class InlineFunctions_findCalledFunctions_1759326424113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19096;
     Object term19182;
     Object term19386;
     Object term69784;
     Object term69785;
     Object term69788;

    public InlineFunctions_findCalledFunctions_1759326424113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19096 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term19182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term19252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19338 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term19182, term19182.getClass(), "type", 0);
        setIntField(term19252, term19252.getClass(), "type", 0);
        setField(term19252, term19252.getClass(), "first", term19338);
        setField(term19182, term19182.getClass(), "first", term19252);
        term19386 = new HashSet();
        term69784 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term69784, term69784.getClass(), "fns", null);
        setField(term69784, term69784.getClass(), "anonFns", null);
        setField(term69784, term69784.getClass(), "compiler", null);
        setField(term69784, term69784.getClass(), "injector", null);
        setBooleanField(term69784, term69784.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term69784, term69784.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term69784, term69784.getClass(), "inlineLocalFunctions", false);
        setField(term69784, term69784.getClass(), "specializationState", null);
        term69785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term69785, term69785.getClass(), "functionName", null);
        setBooleanField(term69785, term69785.getClass(), "itsNeedsActivation", false);
        setIntField(term69785, term69785.getClass(), "itsFunctionType", 0);
        setBooleanField(term69785, term69785.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term69785, term69785.getClass(), "encodedSourceStart", 0);
        setIntField(term69785, term69785.getClass(), "encodedSourceEnd", 0);
        setField(term69785, term69785.getClass(), "sourceName", null);
        setIntField(term69785, term69785.getClass(), "baseLineno", 0);
        setIntField(term69785, term69785.getClass(), "endLineno", 0);
        setField(term69785, term69785.getClass(), "functions", null);
        setField(term69785, term69785.getClass(), "regexps", null);
        setField(term69785, term69785.getClass(), "itsVariables", null);
        setField(term69785, term69785.getClass(), "itsConst", null);
        setField(term69785, term69785.getClass(), "itsVariableNames", null);
        setIntField(term69785, term69785.getClass(), "varStart", 0);
        setField(term69785, term69785.getClass(), "compilerData", null);
        setIntField(term69785, term69785.getClass(), "type", 0);
        setField(term69785, term69785.getClass(), "next", null);
        setIntField(term69786, term69786.getClass(), "type", 0);
        setField(term69786, term69786.getClass(), "next", null);
        setField(term69787, term69787.getClass(), "functionName", null);
        setBooleanField(term69787, term69787.getClass(), "itsNeedsActivation", false);
        setIntField(term69787, term69787.getClass(), "itsFunctionType", 0);
        setBooleanField(term69787, term69787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term69787, term69787.getClass(), "encodedSourceStart", 0);
        setIntField(term69787, term69787.getClass(), "encodedSourceEnd", 0);
        setField(term69787, term69787.getClass(), "sourceName", null);
        setIntField(term69787, term69787.getClass(), "baseLineno", 0);
        setIntField(term69787, term69787.getClass(), "endLineno", 0);
        setField(term69787, term69787.getClass(), "functions", null);
        setField(term69787, term69787.getClass(), "regexps", null);
        setField(term69787, term69787.getClass(), "itsVariables", null);
        setField(term69787, term69787.getClass(), "itsConst", null);
        setField(term69787, term69787.getClass(), "itsVariableNames", null);
        setIntField(term69787, term69787.getClass(), "varStart", 0);
        setField(term69787, term69787.getClass(), "compilerData", null);
        setIntField(term69787, term69787.getClass(), "type", 0);
        setField(term69787, term69787.getClass(), "next", null);
        setField(term69787, term69787.getClass(), "first", null);
        setField(term69787, term69787.getClass(), "last", null);
        setField(term69787, term69787.getClass(), "propListHead", null);
        setIntField(term69787, term69787.getClass(), "sourcePosition", 0);
        setField(term69787, term69787.getClass(), "jsType", null);
        setField(term69787, term69787.getClass(), "parent", null);
        setField(term69786, term69786.getClass(), "first", term69787);
        setField(term69786, term69786.getClass(), "last", null);
        setField(term69786, term69786.getClass(), "propListHead", null);
        setIntField(term69786, term69786.getClass(), "sourcePosition", 0);
        setField(term69786, term69786.getClass(), "jsType", null);
        setField(term69786, term69786.getClass(), "parent", null);
        setField(term69785, term69785.getClass(), "first", term69786);
        setField(term69785, term69785.getClass(), "last", null);
        setField(term69785, term69785.getClass(), "propListHead", null);
        setIntField(term69785, term69785.getClass(), "sourcePosition", 0);
        setField(term69785, term69785.getClass(), "jsType", null);
        setField(term69785, term69785.getClass(), "parent", null);
        HashMap term69789 = new HashMap();
        Set<Object> term69790 =  ((Map) term69789).keySet();
        term69788 = new HashSet((Collection<? extends Object>) term69790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term19182;
        args[1] = term19386;
        callMethod(klass, "findCalledFunctions", argTypes, term19096, args);
        assertTrue(recursiveEquals(term19096, term69784));
        assertTrue(recursiveEquals(term19182, term69785));
        assertTrue(recursiveEquals(term19386, term69788));
    }

};



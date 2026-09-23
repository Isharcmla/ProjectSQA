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

public class InlineFunctions_findCalledFunctions_175932642455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8687;
     Object term8777;
     Object term8915;
     Object term8971;
     Object term8972;
     Object term8974;

    public InlineFunctions_findCalledFunctions_175932642455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8687 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term8777 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term8867 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term8777, term8777.getClass(), "type", -38);
        setField(term8777, term8777.getClass(), "first", term8867);
        term8915 = new HashSet();
        term8971 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term8971, term8971.getClass(), "fns", null);
        setField(term8971, term8971.getClass(), "anonFns", null);
        setField(term8971, term8971.getClass(), "compiler", null);
        setField(term8971, term8971.getClass(), "injector", null);
        setBooleanField(term8971, term8971.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term8971, term8971.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term8971, term8971.getClass(), "inlineLocalFunctions", false);
        setField(term8971, term8971.getClass(), "specializationState", null);
        term8972 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term8973 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term8972, term8972.getClass(), "encodedSourceStart", 0);
        setIntField(term8972, term8972.getClass(), "encodedSourceEnd", 0);
        setField(term8972, term8972.getClass(), "sourceName", null);
        setIntField(term8972, term8972.getClass(), "baseLineno", 0);
        setIntField(term8972, term8972.getClass(), "endLineno", 0);
        setField(term8972, term8972.getClass(), "functions", null);
        setField(term8972, term8972.getClass(), "regexps", null);
        setField(term8972, term8972.getClass(), "itsVariables", null);
        setField(term8972, term8972.getClass(), "itsConst", null);
        setField(term8972, term8972.getClass(), "itsVariableNames", null);
        setIntField(term8972, term8972.getClass(), "varStart", 0);
        setField(term8972, term8972.getClass(), "compilerData", null);
        setIntField(term8972, term8972.getClass(), "type", -38);
        setField(term8972, term8972.getClass(), "next", null);
        setIntField(term8973, term8973.getClass(), "encodedSourceStart", 0);
        setIntField(term8973, term8973.getClass(), "encodedSourceEnd", 0);
        setField(term8973, term8973.getClass(), "sourceName", null);
        setIntField(term8973, term8973.getClass(), "baseLineno", 0);
        setIntField(term8973, term8973.getClass(), "endLineno", 0);
        setField(term8973, term8973.getClass(), "functions", null);
        setField(term8973, term8973.getClass(), "regexps", null);
        setField(term8973, term8973.getClass(), "itsVariables", null);
        setField(term8973, term8973.getClass(), "itsConst", null);
        setField(term8973, term8973.getClass(), "itsVariableNames", null);
        setIntField(term8973, term8973.getClass(), "varStart", 0);
        setField(term8973, term8973.getClass(), "compilerData", null);
        setIntField(term8973, term8973.getClass(), "type", 0);
        setField(term8973, term8973.getClass(), "next", null);
        setField(term8973, term8973.getClass(), "first", null);
        setField(term8973, term8973.getClass(), "last", null);
        setField(term8973, term8973.getClass(), "propListHead", null);
        setIntField(term8973, term8973.getClass(), "sourcePosition", 0);
        setField(term8973, term8973.getClass(), "jsType", null);
        setField(term8973, term8973.getClass(), "parent", null);
        setField(term8972, term8972.getClass(), "first", term8973);
        setField(term8972, term8972.getClass(), "last", null);
        setField(term8972, term8972.getClass(), "propListHead", null);
        setIntField(term8972, term8972.getClass(), "sourcePosition", 0);
        setField(term8972, term8972.getClass(), "jsType", null);
        setField(term8972, term8972.getClass(), "parent", null);
        HashMap term8975 = new HashMap();
        Set<Object> term8976 =  ((Map) term8975).keySet();
        term8974 = new HashSet((Collection<? extends Object>) term8976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term8777;
        args[1] = term8915;
        callMethod(klass, "findCalledFunctions", argTypes, term8687, args);
        assertTrue(recursiveEquals(term8687, term8971));
        assertTrue(recursiveEquals(term8777, term8972));
        assertTrue(recursiveEquals(term8915, term8974));
    }

};



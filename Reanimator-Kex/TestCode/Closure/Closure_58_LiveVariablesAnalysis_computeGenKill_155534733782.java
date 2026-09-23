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

public class LiveVariablesAnalysis_computeGenKill_155534733782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13784;
     Object term13874;
     Object term19645;
     Object term19646;

    public LiveVariablesAnalysis_computeGenKill_155534733782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13784 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term13874 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term13964 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term13874, term13874.getClass(), "type", -344842608);
        setField(term13874, term13874.getClass(), "first", term13964);
        term19645 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term19645, term19645.getClass(), "jsScope", null);
        setField(term19645, term19645.getClass(), "escaped", null);
        setField(term19645, term19645.getClass(), "cfg", null);
        setField(term19645, term19645.getClass(), "joinOp", null);
        setField(term19645, term19645.getClass(), "orderedWorkSet", null);
        term19646 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term19647 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term19646, term19646.getClass(), "encodedSourceStart", 0);
        setIntField(term19646, term19646.getClass(), "encodedSourceEnd", 0);
        setField(term19646, term19646.getClass(), "sourceName", null);
        setIntField(term19646, term19646.getClass(), "baseLineno", 0);
        setIntField(term19646, term19646.getClass(), "endLineno", 0);
        setField(term19646, term19646.getClass(), "functions", null);
        setField(term19646, term19646.getClass(), "regexps", null);
        setField(term19646, term19646.getClass(), "itsVariables", null);
        setField(term19646, term19646.getClass(), "itsConst", null);
        setField(term19646, term19646.getClass(), "itsVariableNames", null);
        setIntField(term19646, term19646.getClass(), "varStart", 0);
        setField(term19646, term19646.getClass(), "compilerData", null);
        setIntField(term19646, term19646.getClass(), "type", -344842608);
        setField(term19646, term19646.getClass(), "next", null);
        setIntField(term19647, term19647.getClass(), "encodedSourceStart", 0);
        setIntField(term19647, term19647.getClass(), "encodedSourceEnd", 0);
        setField(term19647, term19647.getClass(), "sourceName", null);
        setIntField(term19647, term19647.getClass(), "baseLineno", 0);
        setIntField(term19647, term19647.getClass(), "endLineno", 0);
        setField(term19647, term19647.getClass(), "functions", null);
        setField(term19647, term19647.getClass(), "regexps", null);
        setField(term19647, term19647.getClass(), "itsVariables", null);
        setField(term19647, term19647.getClass(), "itsConst", null);
        setField(term19647, term19647.getClass(), "itsVariableNames", null);
        setIntField(term19647, term19647.getClass(), "varStart", 0);
        setField(term19647, term19647.getClass(), "compilerData", null);
        setIntField(term19647, term19647.getClass(), "type", 0);
        setField(term19647, term19647.getClass(), "next", null);
        setField(term19647, term19647.getClass(), "first", null);
        setField(term19647, term19647.getClass(), "last", null);
        setField(term19647, term19647.getClass(), "propListHead", null);
        setIntField(term19647, term19647.getClass(), "sourcePosition", 0);
        setField(term19647, term19647.getClass(), "jsType", null);
        setField(term19647, term19647.getClass(), "parent", null);
        setField(term19646, term19646.getClass(), "first", term19647);
        setField(term19646, term19646.getClass(), "last", null);
        setField(term19646, term19646.getClass(), "propListHead", null);
        setIntField(term19646, term19646.getClass(), "sourcePosition", 0);
        setField(term19646, term19646.getClass(), "jsType", null);
        setField(term19646, term19646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term13874;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term13784, args);
        assertTrue(recursiveEquals(term13784, term19645));
        assertTrue(recursiveEquals(term13874, term19646));
    }

};



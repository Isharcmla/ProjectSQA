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

public class LiveVariablesAnalysis_computeGenKill_155534733755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8747;
     Object term8833;
     Object term9357;
     Object term9358;

    public LiveVariablesAnalysis_computeGenKill_155534733755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8747 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term8833 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term8919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term8833, term8833.getClass(), "type", -344842608);
        setField(term8833, term8833.getClass(), "first", term8919);
        term9357 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term9357, term9357.getClass(), "jsScope", null);
        setField(term9357, term9357.getClass(), "escaped", null);
        setField(term9357, term9357.getClass(), "cfg", null);
        setField(term9357, term9357.getClass(), "joinOp", null);
        setField(term9357, term9357.getClass(), "orderedWorkSet", null);
        term9358 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term9359 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9358, term9358.getClass(), "functionName", null);
        setBooleanField(term9358, term9358.getClass(), "itsNeedsActivation", false);
        setIntField(term9358, term9358.getClass(), "itsFunctionType", 0);
        setBooleanField(term9358, term9358.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term9358, term9358.getClass(), "encodedSourceStart", 0);
        setIntField(term9358, term9358.getClass(), "encodedSourceEnd", 0);
        setField(term9358, term9358.getClass(), "sourceName", null);
        setIntField(term9358, term9358.getClass(), "baseLineno", 0);
        setIntField(term9358, term9358.getClass(), "endLineno", 0);
        setField(term9358, term9358.getClass(), "functions", null);
        setField(term9358, term9358.getClass(), "regexps", null);
        setField(term9358, term9358.getClass(), "itsVariables", null);
        setField(term9358, term9358.getClass(), "itsConst", null);
        setField(term9358, term9358.getClass(), "itsVariableNames", null);
        setIntField(term9358, term9358.getClass(), "varStart", 0);
        setField(term9358, term9358.getClass(), "compilerData", null);
        setIntField(term9358, term9358.getClass(), "type", -344842608);
        setField(term9358, term9358.getClass(), "next", null);
        setField(term9359, term9359.getClass(), "functionName", null);
        setBooleanField(term9359, term9359.getClass(), "itsNeedsActivation", false);
        setIntField(term9359, term9359.getClass(), "itsFunctionType", 0);
        setBooleanField(term9359, term9359.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term9359, term9359.getClass(), "encodedSourceStart", 0);
        setIntField(term9359, term9359.getClass(), "encodedSourceEnd", 0);
        setField(term9359, term9359.getClass(), "sourceName", null);
        setIntField(term9359, term9359.getClass(), "baseLineno", 0);
        setIntField(term9359, term9359.getClass(), "endLineno", 0);
        setField(term9359, term9359.getClass(), "functions", null);
        setField(term9359, term9359.getClass(), "regexps", null);
        setField(term9359, term9359.getClass(), "itsVariables", null);
        setField(term9359, term9359.getClass(), "itsConst", null);
        setField(term9359, term9359.getClass(), "itsVariableNames", null);
        setIntField(term9359, term9359.getClass(), "varStart", 0);
        setField(term9359, term9359.getClass(), "compilerData", null);
        setIntField(term9359, term9359.getClass(), "type", 0);
        setField(term9359, term9359.getClass(), "next", null);
        setField(term9359, term9359.getClass(), "first", null);
        setField(term9359, term9359.getClass(), "last", null);
        setField(term9359, term9359.getClass(), "propListHead", null);
        setIntField(term9359, term9359.getClass(), "sourcePosition", 0);
        setField(term9359, term9359.getClass(), "jsType", null);
        setField(term9359, term9359.getClass(), "parent", null);
        setField(term9358, term9358.getClass(), "first", term9359);
        setField(term9358, term9358.getClass(), "last", null);
        setField(term9358, term9358.getClass(), "propListHead", null);
        setIntField(term9358, term9358.getClass(), "sourcePosition", 0);
        setField(term9358, term9358.getClass(), "jsType", null);
        setField(term9358, term9358.getClass(), "parent", null);
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
        args[0] = term8833;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term8747, args);
        assertTrue(recursiveEquals(term8747, term9357));
        assertTrue(recursiveEquals(term8833, term9358));
    }

};



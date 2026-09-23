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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420515;
     Object term420601;
     Object term420757;
     Object term420843;
     Object term420963;
     Object term420964;
     Object term420966;
     Object term420967;
     Object term420872;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420515 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term420601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term420671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term420671, term420671.getClass(), "type", 108);
        setField(term420601, term420601.getClass(), "parent", term420671);
        setIntField(term420601, term420601.getClass(), "type", 0);
        term420757 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term420757, term420757.getClass(), "type", 58);
        term420843 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term420843, term420843.getClass(), "type", 63);
        term420963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420963, term420963.getClass(), "currentTraversal", null);
        term420964 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term420965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term420964, term420964.getClass(), "functionName", null);
        setBooleanField(term420964, term420964.getClass(), "itsNeedsActivation", false);
        setIntField(term420964, term420964.getClass(), "itsFunctionType", 0);
        setBooleanField(term420964, term420964.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420964, term420964.getClass(), "encodedSourceStart", 0);
        setIntField(term420964, term420964.getClass(), "encodedSourceEnd", 0);
        setField(term420964, term420964.getClass(), "sourceName", null);
        setIntField(term420964, term420964.getClass(), "baseLineno", 0);
        setIntField(term420964, term420964.getClass(), "endLineno", 0);
        setField(term420964, term420964.getClass(), "functions", null);
        setField(term420964, term420964.getClass(), "regexps", null);
        setField(term420964, term420964.getClass(), "itsVariables", null);
        setField(term420964, term420964.getClass(), "itsConst", null);
        setField(term420964, term420964.getClass(), "itsVariableNames", null);
        setIntField(term420964, term420964.getClass(), "varStart", 0);
        setField(term420964, term420964.getClass(), "compilerData", null);
        setIntField(term420964, term420964.getClass(), "type", 0);
        setField(term420964, term420964.getClass(), "next", null);
        setField(term420964, term420964.getClass(), "first", null);
        setField(term420964, term420964.getClass(), "last", null);
        setField(term420964, term420964.getClass(), "propListHead", null);
        setIntField(term420964, term420964.getClass(), "sourcePosition", 0);
        setField(term420964, term420964.getClass(), "jsType", null);
        setIntField(term420965, term420965.getClass(), "type", 108);
        setField(term420965, term420965.getClass(), "next", null);
        setField(term420965, term420965.getClass(), "first", null);
        setField(term420965, term420965.getClass(), "last", null);
        setField(term420965, term420965.getClass(), "propListHead", null);
        setIntField(term420965, term420965.getClass(), "sourcePosition", 0);
        setField(term420965, term420965.getClass(), "jsType", null);
        setField(term420965, term420965.getClass(), "parent", null);
        setField(term420964, term420964.getClass(), "parent", term420965);
        term420966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term420966, term420966.getClass(), "functionName", null);
        setBooleanField(term420966, term420966.getClass(), "itsNeedsActivation", false);
        setIntField(term420966, term420966.getClass(), "itsFunctionType", 0);
        setBooleanField(term420966, term420966.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420966, term420966.getClass(), "encodedSourceStart", 0);
        setIntField(term420966, term420966.getClass(), "encodedSourceEnd", 0);
        setField(term420966, term420966.getClass(), "sourceName", null);
        setIntField(term420966, term420966.getClass(), "baseLineno", 0);
        setIntField(term420966, term420966.getClass(), "endLineno", 0);
        setField(term420966, term420966.getClass(), "functions", null);
        setField(term420966, term420966.getClass(), "regexps", null);
        setField(term420966, term420966.getClass(), "itsVariables", null);
        setField(term420966, term420966.getClass(), "itsConst", null);
        setField(term420966, term420966.getClass(), "itsVariableNames", null);
        setIntField(term420966, term420966.getClass(), "varStart", 0);
        setField(term420966, term420966.getClass(), "compilerData", null);
        setIntField(term420966, term420966.getClass(), "type", 58);
        setField(term420966, term420966.getClass(), "next", null);
        setField(term420966, term420966.getClass(), "first", null);
        setField(term420966, term420966.getClass(), "last", null);
        setField(term420966, term420966.getClass(), "propListHead", null);
        setIntField(term420966, term420966.getClass(), "sourcePosition", 0);
        setField(term420966, term420966.getClass(), "jsType", null);
        setField(term420966, term420966.getClass(), "parent", null);
        term420967 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term420967, term420967.getClass(), "functionName", null);
        setBooleanField(term420967, term420967.getClass(), "itsNeedsActivation", false);
        setIntField(term420967, term420967.getClass(), "itsFunctionType", 0);
        setBooleanField(term420967, term420967.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420967, term420967.getClass(), "encodedSourceStart", 0);
        setIntField(term420967, term420967.getClass(), "encodedSourceEnd", 0);
        setField(term420967, term420967.getClass(), "sourceName", null);
        setIntField(term420967, term420967.getClass(), "baseLineno", 0);
        setIntField(term420967, term420967.getClass(), "endLineno", 0);
        setField(term420967, term420967.getClass(), "functions", null);
        setField(term420967, term420967.getClass(), "regexps", null);
        setField(term420967, term420967.getClass(), "itsVariables", null);
        setField(term420967, term420967.getClass(), "itsConst", null);
        setField(term420967, term420967.getClass(), "itsVariableNames", null);
        setIntField(term420967, term420967.getClass(), "varStart", 0);
        setField(term420967, term420967.getClass(), "compilerData", null);
        setIntField(term420967, term420967.getClass(), "type", 63);
        setField(term420967, term420967.getClass(), "next", null);
        setField(term420967, term420967.getClass(), "first", null);
        setField(term420967, term420967.getClass(), "last", null);
        setField(term420967, term420967.getClass(), "propListHead", null);
        setIntField(term420967, term420967.getClass(), "sourcePosition", 0);
        setField(term420967, term420967.getClass(), "jsType", null);
        setField(term420967, term420967.getClass(), "parent", null);
        term420872 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term420883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term420872, term420872.getClass(), "functionName", null);
        setBooleanField(term420872, term420872.getClass(), "itsNeedsActivation", false);
        setIntField(term420872, term420872.getClass(), "itsFunctionType", 0);
        setBooleanField(term420872, term420872.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term420872, term420872.getClass(), "encodedSourceStart", 0);
        setIntField(term420872, term420872.getClass(), "encodedSourceEnd", 0);
        setField(term420872, term420872.getClass(), "sourceName", null);
        setIntField(term420872, term420872.getClass(), "baseLineno", 0);
        setIntField(term420872, term420872.getClass(), "endLineno", 0);
        setField(term420872, term420872.getClass(), "functions", null);
        setField(term420872, term420872.getClass(), "regexps", null);
        setField(term420872, term420872.getClass(), "itsVariables", null);
        setField(term420872, term420872.getClass(), "itsConst", null);
        setField(term420872, term420872.getClass(), "itsVariableNames", null);
        setIntField(term420872, term420872.getClass(), "varStart", 0);
        setField(term420872, term420872.getClass(), "compilerData", null);
        setIntField(term420872, term420872.getClass(), "type", 0);
        setField(term420872, term420872.getClass(), "next", null);
        setField(term420872, term420872.getClass(), "first", null);
        setField(term420872, term420872.getClass(), "last", null);
        setField(term420872, term420872.getClass(), "propListHead", null);
        setIntField(term420872, term420872.getClass(), "sourcePosition", 0);
        setField(term420872, term420872.getClass(), "jsType", null);
        setIntField(term420883, term420883.getClass(), "type", 108);
        setField(term420883, term420883.getClass(), "next", null);
        setField(term420883, term420883.getClass(), "first", null);
        setField(term420883, term420883.getClass(), "last", null);
        setField(term420883, term420883.getClass(), "propListHead", null);
        setIntField(term420883, term420883.getClass(), "sourcePosition", 0);
        setField(term420883, term420883.getClass(), "jsType", null);
        setField(term420883, term420883.getClass(), "parent", null);
        setField(term420872, term420872.getClass(), "parent", term420883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term420601;
        args[1] = term420757;
        args[2] = term420843;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term420515, args);
        assertTrue(recursiveEquals(term420515, term420963));
        assertTrue(recursiveEquals(term420601, term420964));
        assertTrue(recursiveEquals(term420757, term420966));
        assertTrue(recursiveEquals(term420843, term420967));
        assertTrue(recursiveEquals(retValue, term420872));
    }

};



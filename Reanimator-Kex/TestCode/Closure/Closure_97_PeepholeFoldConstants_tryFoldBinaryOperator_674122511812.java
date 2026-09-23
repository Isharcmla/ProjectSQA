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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233207;
     Object term233293;
     Object term233560;
     Object term233561;
     Object term233464;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233207 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term233293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term233379, term233379.getClass(), "next", term233449);
        setField(term233293, term233293.getClass(), "first", term233379);
        setIntField(term233293, term233293.getClass(), "type", 21);
        term233560 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term233560, term233560.getClass(), "currentTraversal", null);
        term233561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233562 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term233561, term233561.getClass(), "functionName", null);
        setBooleanField(term233561, term233561.getClass(), "itsNeedsActivation", false);
        setIntField(term233561, term233561.getClass(), "itsFunctionType", 0);
        setBooleanField(term233561, term233561.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233561, term233561.getClass(), "encodedSourceStart", 0);
        setIntField(term233561, term233561.getClass(), "encodedSourceEnd", 0);
        setField(term233561, term233561.getClass(), "sourceName", null);
        setIntField(term233561, term233561.getClass(), "baseLineno", 0);
        setIntField(term233561, term233561.getClass(), "endLineno", 0);
        setField(term233561, term233561.getClass(), "functions", null);
        setField(term233561, term233561.getClass(), "regexps", null);
        setField(term233561, term233561.getClass(), "itsVariables", null);
        setField(term233561, term233561.getClass(), "itsConst", null);
        setField(term233561, term233561.getClass(), "itsVariableNames", null);
        setIntField(term233561, term233561.getClass(), "varStart", 0);
        setField(term233561, term233561.getClass(), "compilerData", null);
        setIntField(term233561, term233561.getClass(), "type", 21);
        setField(term233561, term233561.getClass(), "next", null);
        setField(term233562, term233562.getClass(), "functionName", null);
        setBooleanField(term233562, term233562.getClass(), "itsNeedsActivation", false);
        setIntField(term233562, term233562.getClass(), "itsFunctionType", 0);
        setBooleanField(term233562, term233562.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233562, term233562.getClass(), "encodedSourceStart", 0);
        setIntField(term233562, term233562.getClass(), "encodedSourceEnd", 0);
        setField(term233562, term233562.getClass(), "sourceName", null);
        setIntField(term233562, term233562.getClass(), "baseLineno", 0);
        setIntField(term233562, term233562.getClass(), "endLineno", 0);
        setField(term233562, term233562.getClass(), "functions", null);
        setField(term233562, term233562.getClass(), "regexps", null);
        setField(term233562, term233562.getClass(), "itsVariables", null);
        setField(term233562, term233562.getClass(), "itsConst", null);
        setField(term233562, term233562.getClass(), "itsVariableNames", null);
        setIntField(term233562, term233562.getClass(), "varStart", 0);
        setField(term233562, term233562.getClass(), "compilerData", null);
        setIntField(term233562, term233562.getClass(), "type", 0);
        setIntField(term233563, term233563.getClass(), "type", 0);
        setField(term233563, term233563.getClass(), "next", null);
        setField(term233563, term233563.getClass(), "first", null);
        setField(term233563, term233563.getClass(), "last", null);
        setField(term233563, term233563.getClass(), "propListHead", null);
        setIntField(term233563, term233563.getClass(), "sourcePosition", 0);
        setField(term233563, term233563.getClass(), "jsType", null);
        setField(term233563, term233563.getClass(), "parent", null);
        setField(term233562, term233562.getClass(), "next", term233563);
        setField(term233562, term233562.getClass(), "first", null);
        setField(term233562, term233562.getClass(), "last", null);
        setField(term233562, term233562.getClass(), "propListHead", null);
        setIntField(term233562, term233562.getClass(), "sourcePosition", 0);
        setField(term233562, term233562.getClass(), "jsType", null);
        setField(term233562, term233562.getClass(), "parent", null);
        setField(term233561, term233561.getClass(), "first", term233562);
        setField(term233561, term233561.getClass(), "last", null);
        setField(term233561, term233561.getClass(), "propListHead", null);
        setIntField(term233561, term233561.getClass(), "sourcePosition", 0);
        setField(term233561, term233561.getClass(), "jsType", null);
        setField(term233561, term233561.getClass(), "parent", null);
        term233464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term233464, term233464.getClass(), "functionName", null);
        setBooleanField(term233464, term233464.getClass(), "itsNeedsActivation", false);
        setIntField(term233464, term233464.getClass(), "itsFunctionType", 0);
        setBooleanField(term233464, term233464.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233464, term233464.getClass(), "encodedSourceStart", 0);
        setIntField(term233464, term233464.getClass(), "encodedSourceEnd", 0);
        setField(term233464, term233464.getClass(), "sourceName", null);
        setIntField(term233464, term233464.getClass(), "baseLineno", 0);
        setIntField(term233464, term233464.getClass(), "endLineno", 0);
        setField(term233464, term233464.getClass(), "functions", null);
        setField(term233464, term233464.getClass(), "regexps", null);
        setField(term233464, term233464.getClass(), "itsVariables", null);
        setField(term233464, term233464.getClass(), "itsConst", null);
        setField(term233464, term233464.getClass(), "itsVariableNames", null);
        setIntField(term233464, term233464.getClass(), "varStart", 0);
        setField(term233464, term233464.getClass(), "compilerData", null);
        setIntField(term233464, term233464.getClass(), "type", 21);
        setField(term233464, term233464.getClass(), "next", null);
        setField(term233474, term233474.getClass(), "functionName", null);
        setBooleanField(term233474, term233474.getClass(), "itsNeedsActivation", false);
        setIntField(term233474, term233474.getClass(), "itsFunctionType", 0);
        setBooleanField(term233474, term233474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233474, term233474.getClass(), "encodedSourceStart", 0);
        setIntField(term233474, term233474.getClass(), "encodedSourceEnd", 0);
        setField(term233474, term233474.getClass(), "sourceName", null);
        setIntField(term233474, term233474.getClass(), "baseLineno", 0);
        setIntField(term233474, term233474.getClass(), "endLineno", 0);
        setField(term233474, term233474.getClass(), "functions", null);
        setField(term233474, term233474.getClass(), "regexps", null);
        setField(term233474, term233474.getClass(), "itsVariables", null);
        setField(term233474, term233474.getClass(), "itsConst", null);
        setField(term233474, term233474.getClass(), "itsVariableNames", null);
        setIntField(term233474, term233474.getClass(), "varStart", 0);
        setField(term233474, term233474.getClass(), "compilerData", null);
        setIntField(term233474, term233474.getClass(), "type", 0);
        setIntField(term233484, term233484.getClass(), "type", 0);
        setField(term233484, term233484.getClass(), "next", null);
        setField(term233484, term233484.getClass(), "first", null);
        setField(term233484, term233484.getClass(), "last", null);
        setField(term233484, term233484.getClass(), "propListHead", null);
        setIntField(term233484, term233484.getClass(), "sourcePosition", 0);
        setField(term233484, term233484.getClass(), "jsType", null);
        setField(term233484, term233484.getClass(), "parent", null);
        setField(term233474, term233474.getClass(), "next", term233484);
        setField(term233474, term233474.getClass(), "first", null);
        setField(term233474, term233474.getClass(), "last", null);
        setField(term233474, term233474.getClass(), "propListHead", null);
        setIntField(term233474, term233474.getClass(), "sourcePosition", 0);
        setField(term233474, term233474.getClass(), "jsType", null);
        setField(term233474, term233474.getClass(), "parent", null);
        setField(term233464, term233464.getClass(), "first", term233474);
        setField(term233464, term233464.getClass(), "last", null);
        setField(term233464, term233464.getClass(), "propListHead", null);
        setIntField(term233464, term233464.getClass(), "sourcePosition", 0);
        setField(term233464, term233464.getClass(), "jsType", null);
        setField(term233464, term233464.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term233293;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term233207, args);
        assertTrue(recursiveEquals(term233207, term233560));
        assertTrue(recursiveEquals(term233293, term233561));
        assertTrue(recursiveEquals(retValue, term233464));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223756;
     Object term223848;
     Object term224472;
     Object term224473;
     Object term224423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223756 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term223848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223934 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term223934, term223934.getClass(), "next", term224004);
        setField(term223848, term223848.getClass(), "first", term223934);
        setIntField(term223848, term223848.getClass(), "type", 9);
        term224472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term224472, term224472.getClass(), "currentTraversal", null);
        term224473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term224473, term224473.getClass(), "str", null);
        setIntField(term224473, term224473.getClass(), "type", 9);
        setField(term224473, term224473.getClass(), "next", null);
        setField(term224474, term224474.getClass(), "functionName", null);
        setBooleanField(term224474, term224474.getClass(), "itsNeedsActivation", false);
        setIntField(term224474, term224474.getClass(), "itsFunctionType", 0);
        setBooleanField(term224474, term224474.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224474, term224474.getClass(), "encodedSourceStart", 0);
        setIntField(term224474, term224474.getClass(), "encodedSourceEnd", 0);
        setField(term224474, term224474.getClass(), "sourceName", null);
        setIntField(term224474, term224474.getClass(), "baseLineno", 0);
        setIntField(term224474, term224474.getClass(), "endLineno", 0);
        setField(term224474, term224474.getClass(), "functions", null);
        setField(term224474, term224474.getClass(), "regexps", null);
        setField(term224474, term224474.getClass(), "itsVariables", null);
        setField(term224474, term224474.getClass(), "itsConst", null);
        setField(term224474, term224474.getClass(), "itsVariableNames", null);
        setIntField(term224474, term224474.getClass(), "varStart", 0);
        setField(term224474, term224474.getClass(), "compilerData", null);
        setIntField(term224474, term224474.getClass(), "type", 0);
        setIntField(term224475, term224475.getClass(), "type", 0);
        setField(term224475, term224475.getClass(), "next", null);
        setField(term224475, term224475.getClass(), "first", null);
        setField(term224475, term224475.getClass(), "last", null);
        setField(term224475, term224475.getClass(), "propListHead", null);
        setIntField(term224475, term224475.getClass(), "sourcePosition", 0);
        setField(term224475, term224475.getClass(), "jsType", null);
        setField(term224475, term224475.getClass(), "parent", null);
        setField(term224474, term224474.getClass(), "next", term224475);
        setField(term224474, term224474.getClass(), "first", null);
        setField(term224474, term224474.getClass(), "last", null);
        setField(term224474, term224474.getClass(), "propListHead", null);
        setIntField(term224474, term224474.getClass(), "sourcePosition", 0);
        setField(term224474, term224474.getClass(), "jsType", null);
        setField(term224474, term224474.getClass(), "parent", null);
        setField(term224473, term224473.getClass(), "first", term224474);
        setField(term224473, term224473.getClass(), "last", null);
        setField(term224473, term224473.getClass(), "propListHead", null);
        setIntField(term224473, term224473.getClass(), "sourcePosition", 0);
        setField(term224473, term224473.getClass(), "jsType", null);
        setField(term224473, term224473.getClass(), "parent", null);
        term224423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term224423, term224423.getClass(), "str", null);
        setIntField(term224423, term224423.getClass(), "type", 9);
        setField(term224423, term224423.getClass(), "next", null);
        setField(term224425, term224425.getClass(), "functionName", null);
        setBooleanField(term224425, term224425.getClass(), "itsNeedsActivation", false);
        setIntField(term224425, term224425.getClass(), "itsFunctionType", 0);
        setBooleanField(term224425, term224425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224425, term224425.getClass(), "encodedSourceStart", 0);
        setIntField(term224425, term224425.getClass(), "encodedSourceEnd", 0);
        setField(term224425, term224425.getClass(), "sourceName", null);
        setIntField(term224425, term224425.getClass(), "baseLineno", 0);
        setIntField(term224425, term224425.getClass(), "endLineno", 0);
        setField(term224425, term224425.getClass(), "functions", null);
        setField(term224425, term224425.getClass(), "regexps", null);
        setField(term224425, term224425.getClass(), "itsVariables", null);
        setField(term224425, term224425.getClass(), "itsConst", null);
        setField(term224425, term224425.getClass(), "itsVariableNames", null);
        setIntField(term224425, term224425.getClass(), "varStart", 0);
        setField(term224425, term224425.getClass(), "compilerData", null);
        setIntField(term224425, term224425.getClass(), "type", 0);
        setIntField(term224435, term224435.getClass(), "type", 0);
        setField(term224435, term224435.getClass(), "next", null);
        setField(term224435, term224435.getClass(), "first", null);
        setField(term224435, term224435.getClass(), "last", null);
        setField(term224435, term224435.getClass(), "propListHead", null);
        setIntField(term224435, term224435.getClass(), "sourcePosition", 0);
        setField(term224435, term224435.getClass(), "jsType", null);
        setField(term224435, term224435.getClass(), "parent", null);
        setField(term224425, term224425.getClass(), "next", term224435);
        setField(term224425, term224425.getClass(), "first", null);
        setField(term224425, term224425.getClass(), "last", null);
        setField(term224425, term224425.getClass(), "propListHead", null);
        setIntField(term224425, term224425.getClass(), "sourcePosition", 0);
        setField(term224425, term224425.getClass(), "jsType", null);
        setField(term224425, term224425.getClass(), "parent", null);
        setField(term224423, term224423.getClass(), "first", term224425);
        setField(term224423, term224423.getClass(), "last", null);
        setField(term224423, term224423.getClass(), "propListHead", null);
        setIntField(term224423, term224423.getClass(), "sourcePosition", 0);
        setField(term224423, term224423.getClass(), "jsType", null);
        setField(term224423, term224423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term223848;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term223756, args);
        assertTrue(recursiveEquals(term223756, term224472));
        assertTrue(recursiveEquals(term223848, term224473));
        assertTrue(recursiveEquals(retValue, term224423));
    }

};



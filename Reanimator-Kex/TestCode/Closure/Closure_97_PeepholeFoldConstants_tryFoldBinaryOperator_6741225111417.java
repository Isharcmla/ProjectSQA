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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534139;
     Object term534231;
     Object term534924;
     Object term534925;
     Object term534838;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term534231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term534403 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term534317, term534317.getClass(), "next", term534403);
        setIntField(term534317, term534317.getClass(), "type", 0);
        setField(term534231, term534231.getClass(), "first", term534317);
        setIntField(term534231, term534231.getClass(), "type", 14);
        term534924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term534924, term534924.getClass(), "currentTraversal", null);
        term534925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term534927 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term534925, term534925.getClass(), "number", 0.0);
        setIntField(term534925, term534925.getClass(), "type", 14);
        setField(term534925, term534925.getClass(), "next", null);
        setField(term534926, term534926.getClass(), "functionName", null);
        setBooleanField(term534926, term534926.getClass(), "itsNeedsActivation", false);
        setIntField(term534926, term534926.getClass(), "itsFunctionType", 0);
        setBooleanField(term534926, term534926.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534926, term534926.getClass(), "encodedSourceStart", 0);
        setIntField(term534926, term534926.getClass(), "encodedSourceEnd", 0);
        setField(term534926, term534926.getClass(), "sourceName", null);
        setIntField(term534926, term534926.getClass(), "baseLineno", 0);
        setIntField(term534926, term534926.getClass(), "endLineno", 0);
        setField(term534926, term534926.getClass(), "functions", null);
        setField(term534926, term534926.getClass(), "regexps", null);
        setField(term534926, term534926.getClass(), "itsVariables", null);
        setField(term534926, term534926.getClass(), "itsConst", null);
        setField(term534926, term534926.getClass(), "itsVariableNames", null);
        setIntField(term534926, term534926.getClass(), "varStart", 0);
        setField(term534926, term534926.getClass(), "compilerData", null);
        setIntField(term534926, term534926.getClass(), "type", 0);
        setField(term534927, term534927.getClass(), "functionName", null);
        setBooleanField(term534927, term534927.getClass(), "itsNeedsActivation", false);
        setIntField(term534927, term534927.getClass(), "itsFunctionType", 0);
        setBooleanField(term534927, term534927.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534927, term534927.getClass(), "encodedSourceStart", 0);
        setIntField(term534927, term534927.getClass(), "encodedSourceEnd", 0);
        setField(term534927, term534927.getClass(), "sourceName", null);
        setIntField(term534927, term534927.getClass(), "baseLineno", 0);
        setIntField(term534927, term534927.getClass(), "endLineno", 0);
        setField(term534927, term534927.getClass(), "functions", null);
        setField(term534927, term534927.getClass(), "regexps", null);
        setField(term534927, term534927.getClass(), "itsVariables", null);
        setField(term534927, term534927.getClass(), "itsConst", null);
        setField(term534927, term534927.getClass(), "itsVariableNames", null);
        setIntField(term534927, term534927.getClass(), "varStart", 0);
        setField(term534927, term534927.getClass(), "compilerData", null);
        setIntField(term534927, term534927.getClass(), "type", 0);
        setField(term534927, term534927.getClass(), "next", null);
        setField(term534927, term534927.getClass(), "first", null);
        setField(term534927, term534927.getClass(), "last", null);
        setField(term534927, term534927.getClass(), "propListHead", null);
        setIntField(term534927, term534927.getClass(), "sourcePosition", 0);
        setField(term534927, term534927.getClass(), "jsType", null);
        setField(term534927, term534927.getClass(), "parent", null);
        setField(term534926, term534926.getClass(), "next", term534927);
        setField(term534926, term534926.getClass(), "first", null);
        setField(term534926, term534926.getClass(), "last", null);
        setField(term534926, term534926.getClass(), "propListHead", null);
        setIntField(term534926, term534926.getClass(), "sourcePosition", 0);
        setField(term534926, term534926.getClass(), "jsType", null);
        setField(term534926, term534926.getClass(), "parent", null);
        setField(term534925, term534925.getClass(), "first", term534926);
        setField(term534925, term534925.getClass(), "last", null);
        setField(term534925, term534925.getClass(), "propListHead", null);
        setIntField(term534925, term534925.getClass(), "sourcePosition", 0);
        setField(term534925, term534925.getClass(), "jsType", null);
        setField(term534925, term534925.getClass(), "parent", null);
        term534838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term534851 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term534838, term534838.getClass(), "number", 0.0);
        setIntField(term534838, term534838.getClass(), "type", 14);
        setField(term534838, term534838.getClass(), "next", null);
        setField(term534841, term534841.getClass(), "functionName", null);
        setBooleanField(term534841, term534841.getClass(), "itsNeedsActivation", false);
        setIntField(term534841, term534841.getClass(), "itsFunctionType", 0);
        setBooleanField(term534841, term534841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534841, term534841.getClass(), "encodedSourceStart", 0);
        setIntField(term534841, term534841.getClass(), "encodedSourceEnd", 0);
        setField(term534841, term534841.getClass(), "sourceName", null);
        setIntField(term534841, term534841.getClass(), "baseLineno", 0);
        setIntField(term534841, term534841.getClass(), "endLineno", 0);
        setField(term534841, term534841.getClass(), "functions", null);
        setField(term534841, term534841.getClass(), "regexps", null);
        setField(term534841, term534841.getClass(), "itsVariables", null);
        setField(term534841, term534841.getClass(), "itsConst", null);
        setField(term534841, term534841.getClass(), "itsVariableNames", null);
        setIntField(term534841, term534841.getClass(), "varStart", 0);
        setField(term534841, term534841.getClass(), "compilerData", null);
        setIntField(term534841, term534841.getClass(), "type", 0);
        setField(term534851, term534851.getClass(), "functionName", null);
        setBooleanField(term534851, term534851.getClass(), "itsNeedsActivation", false);
        setIntField(term534851, term534851.getClass(), "itsFunctionType", 0);
        setBooleanField(term534851, term534851.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term534851, term534851.getClass(), "encodedSourceStart", 0);
        setIntField(term534851, term534851.getClass(), "encodedSourceEnd", 0);
        setField(term534851, term534851.getClass(), "sourceName", null);
        setIntField(term534851, term534851.getClass(), "baseLineno", 0);
        setIntField(term534851, term534851.getClass(), "endLineno", 0);
        setField(term534851, term534851.getClass(), "functions", null);
        setField(term534851, term534851.getClass(), "regexps", null);
        setField(term534851, term534851.getClass(), "itsVariables", null);
        setField(term534851, term534851.getClass(), "itsConst", null);
        setField(term534851, term534851.getClass(), "itsVariableNames", null);
        setIntField(term534851, term534851.getClass(), "varStart", 0);
        setField(term534851, term534851.getClass(), "compilerData", null);
        setIntField(term534851, term534851.getClass(), "type", 0);
        setField(term534851, term534851.getClass(), "next", null);
        setField(term534851, term534851.getClass(), "first", null);
        setField(term534851, term534851.getClass(), "last", null);
        setField(term534851, term534851.getClass(), "propListHead", null);
        setIntField(term534851, term534851.getClass(), "sourcePosition", 0);
        setField(term534851, term534851.getClass(), "jsType", null);
        setField(term534851, term534851.getClass(), "parent", null);
        setField(term534841, term534841.getClass(), "next", term534851);
        setField(term534841, term534841.getClass(), "first", null);
        setField(term534841, term534841.getClass(), "last", null);
        setField(term534841, term534841.getClass(), "propListHead", null);
        setIntField(term534841, term534841.getClass(), "sourcePosition", 0);
        setField(term534841, term534841.getClass(), "jsType", null);
        setField(term534841, term534841.getClass(), "parent", null);
        setField(term534838, term534838.getClass(), "first", term534841);
        setField(term534838, term534838.getClass(), "last", null);
        setField(term534838, term534838.getClass(), "propListHead", null);
        setIntField(term534838, term534838.getClass(), "sourcePosition", 0);
        setField(term534838, term534838.getClass(), "jsType", null);
        setField(term534838, term534838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term534231;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term534139, args);
        assertTrue(recursiveEquals(term534139, term534924));
        assertTrue(recursiveEquals(term534231, term534925));
        assertTrue(recursiveEquals(retValue, term534838));
    }

};



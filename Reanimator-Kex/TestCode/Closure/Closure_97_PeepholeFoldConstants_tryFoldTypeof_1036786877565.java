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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148563;
     Object term148649;
     Object term149504;
     Object term149505;
     Object term149450;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148563 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term148649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term148649, term148649.getClass(), "type", 32);
        setField(term148649, term148649.getClass(), "first", term148735);
        term149504 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term149504, term149504.getClass(), "currentTraversal", null);
        term149505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term149505, term149505.getClass(), "functionName", null);
        setBooleanField(term149505, term149505.getClass(), "itsNeedsActivation", false);
        setIntField(term149505, term149505.getClass(), "itsFunctionType", 0);
        setBooleanField(term149505, term149505.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149505, term149505.getClass(), "encodedSourceStart", 0);
        setIntField(term149505, term149505.getClass(), "encodedSourceEnd", 0);
        setField(term149505, term149505.getClass(), "sourceName", null);
        setIntField(term149505, term149505.getClass(), "baseLineno", 0);
        setIntField(term149505, term149505.getClass(), "endLineno", 0);
        setField(term149505, term149505.getClass(), "functions", null);
        setField(term149505, term149505.getClass(), "regexps", null);
        setField(term149505, term149505.getClass(), "itsVariables", null);
        setField(term149505, term149505.getClass(), "itsConst", null);
        setField(term149505, term149505.getClass(), "itsVariableNames", null);
        setIntField(term149505, term149505.getClass(), "varStart", 0);
        setField(term149505, term149505.getClass(), "compilerData", null);
        setIntField(term149505, term149505.getClass(), "type", 32);
        setField(term149505, term149505.getClass(), "next", null);
        setField(term149506, term149506.getClass(), "functionName", null);
        setBooleanField(term149506, term149506.getClass(), "itsNeedsActivation", false);
        setIntField(term149506, term149506.getClass(), "itsFunctionType", 0);
        setBooleanField(term149506, term149506.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149506, term149506.getClass(), "encodedSourceStart", 0);
        setIntField(term149506, term149506.getClass(), "encodedSourceEnd", 0);
        setField(term149506, term149506.getClass(), "sourceName", null);
        setIntField(term149506, term149506.getClass(), "baseLineno", 0);
        setIntField(term149506, term149506.getClass(), "endLineno", 0);
        setField(term149506, term149506.getClass(), "functions", null);
        setField(term149506, term149506.getClass(), "regexps", null);
        setField(term149506, term149506.getClass(), "itsVariables", null);
        setField(term149506, term149506.getClass(), "itsConst", null);
        setField(term149506, term149506.getClass(), "itsVariableNames", null);
        setIntField(term149506, term149506.getClass(), "varStart", 0);
        setField(term149506, term149506.getClass(), "compilerData", null);
        setIntField(term149506, term149506.getClass(), "type", 0);
        setField(term149506, term149506.getClass(), "next", null);
        setField(term149506, term149506.getClass(), "first", null);
        setField(term149506, term149506.getClass(), "last", null);
        setField(term149506, term149506.getClass(), "propListHead", null);
        setIntField(term149506, term149506.getClass(), "sourcePosition", 0);
        setField(term149506, term149506.getClass(), "jsType", null);
        setField(term149506, term149506.getClass(), "parent", null);
        setField(term149505, term149505.getClass(), "first", term149506);
        setField(term149505, term149505.getClass(), "last", null);
        setField(term149505, term149505.getClass(), "propListHead", null);
        setIntField(term149505, term149505.getClass(), "sourcePosition", 0);
        setField(term149505, term149505.getClass(), "jsType", null);
        setField(term149505, term149505.getClass(), "parent", null);
        term149450 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term149450, term149450.getClass(), "functionName", null);
        setBooleanField(term149450, term149450.getClass(), "itsNeedsActivation", false);
        setIntField(term149450, term149450.getClass(), "itsFunctionType", 0);
        setBooleanField(term149450, term149450.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149450, term149450.getClass(), "encodedSourceStart", 0);
        setIntField(term149450, term149450.getClass(), "encodedSourceEnd", 0);
        setField(term149450, term149450.getClass(), "sourceName", null);
        setIntField(term149450, term149450.getClass(), "baseLineno", 0);
        setIntField(term149450, term149450.getClass(), "endLineno", 0);
        setField(term149450, term149450.getClass(), "functions", null);
        setField(term149450, term149450.getClass(), "regexps", null);
        setField(term149450, term149450.getClass(), "itsVariables", null);
        setField(term149450, term149450.getClass(), "itsConst", null);
        setField(term149450, term149450.getClass(), "itsVariableNames", null);
        setIntField(term149450, term149450.getClass(), "varStart", 0);
        setField(term149450, term149450.getClass(), "compilerData", null);
        setIntField(term149450, term149450.getClass(), "type", 32);
        setField(term149450, term149450.getClass(), "next", null);
        setField(term149460, term149460.getClass(), "functionName", null);
        setBooleanField(term149460, term149460.getClass(), "itsNeedsActivation", false);
        setIntField(term149460, term149460.getClass(), "itsFunctionType", 0);
        setBooleanField(term149460, term149460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149460, term149460.getClass(), "encodedSourceStart", 0);
        setIntField(term149460, term149460.getClass(), "encodedSourceEnd", 0);
        setField(term149460, term149460.getClass(), "sourceName", null);
        setIntField(term149460, term149460.getClass(), "baseLineno", 0);
        setIntField(term149460, term149460.getClass(), "endLineno", 0);
        setField(term149460, term149460.getClass(), "functions", null);
        setField(term149460, term149460.getClass(), "regexps", null);
        setField(term149460, term149460.getClass(), "itsVariables", null);
        setField(term149460, term149460.getClass(), "itsConst", null);
        setField(term149460, term149460.getClass(), "itsVariableNames", null);
        setIntField(term149460, term149460.getClass(), "varStart", 0);
        setField(term149460, term149460.getClass(), "compilerData", null);
        setIntField(term149460, term149460.getClass(), "type", 0);
        setField(term149460, term149460.getClass(), "next", null);
        setField(term149460, term149460.getClass(), "first", null);
        setField(term149460, term149460.getClass(), "last", null);
        setField(term149460, term149460.getClass(), "propListHead", null);
        setIntField(term149460, term149460.getClass(), "sourcePosition", 0);
        setField(term149460, term149460.getClass(), "jsType", null);
        setField(term149460, term149460.getClass(), "parent", null);
        setField(term149450, term149450.getClass(), "first", term149460);
        setField(term149450, term149450.getClass(), "last", null);
        setField(term149450, term149450.getClass(), "propListHead", null);
        setIntField(term149450, term149450.getClass(), "sourcePosition", 0);
        setField(term149450, term149450.getClass(), "jsType", null);
        setField(term149450, term149450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148649;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term148563, args);
        assertTrue(recursiveEquals(term148563, term149504));
        assertTrue(recursiveEquals(term148649, term149505));
        assertTrue(recursiveEquals(retValue, term149450));
    }

};



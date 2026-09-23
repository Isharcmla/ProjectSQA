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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355631;
     Object term355717;
     Object term355953;
     Object term355954;
     Object term355888;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355631 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term355717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355803, term355803.getClass(), "next", term355873);
        setField(term355717, term355717.getClass(), "first", term355803);
        setIntField(term355717, term355717.getClass(), "type", 9);
        term355953 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term355953, term355953.getClass(), "currentTraversal", null);
        term355954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355954, term355954.getClass(), "functionName", null);
        setBooleanField(term355954, term355954.getClass(), "itsNeedsActivation", false);
        setIntField(term355954, term355954.getClass(), "itsFunctionType", 0);
        setBooleanField(term355954, term355954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355954, term355954.getClass(), "encodedSourceStart", 0);
        setIntField(term355954, term355954.getClass(), "encodedSourceEnd", 0);
        setField(term355954, term355954.getClass(), "sourceName", null);
        setIntField(term355954, term355954.getClass(), "baseLineno", 0);
        setIntField(term355954, term355954.getClass(), "endLineno", 0);
        setField(term355954, term355954.getClass(), "functions", null);
        setField(term355954, term355954.getClass(), "regexps", null);
        setField(term355954, term355954.getClass(), "itsVariables", null);
        setField(term355954, term355954.getClass(), "itsConst", null);
        setField(term355954, term355954.getClass(), "itsVariableNames", null);
        setIntField(term355954, term355954.getClass(), "varStart", 0);
        setField(term355954, term355954.getClass(), "compilerData", null);
        setIntField(term355954, term355954.getClass(), "type", 9);
        setField(term355954, term355954.getClass(), "next", null);
        setField(term355955, term355955.getClass(), "functionName", null);
        setBooleanField(term355955, term355955.getClass(), "itsNeedsActivation", false);
        setIntField(term355955, term355955.getClass(), "itsFunctionType", 0);
        setBooleanField(term355955, term355955.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355955, term355955.getClass(), "encodedSourceStart", 0);
        setIntField(term355955, term355955.getClass(), "encodedSourceEnd", 0);
        setField(term355955, term355955.getClass(), "sourceName", null);
        setIntField(term355955, term355955.getClass(), "baseLineno", 0);
        setIntField(term355955, term355955.getClass(), "endLineno", 0);
        setField(term355955, term355955.getClass(), "functions", null);
        setField(term355955, term355955.getClass(), "regexps", null);
        setField(term355955, term355955.getClass(), "itsVariables", null);
        setField(term355955, term355955.getClass(), "itsConst", null);
        setField(term355955, term355955.getClass(), "itsVariableNames", null);
        setIntField(term355955, term355955.getClass(), "varStart", 0);
        setField(term355955, term355955.getClass(), "compilerData", null);
        setIntField(term355955, term355955.getClass(), "type", 0);
        setIntField(term355956, term355956.getClass(), "type", 0);
        setField(term355956, term355956.getClass(), "next", null);
        setField(term355956, term355956.getClass(), "first", null);
        setField(term355956, term355956.getClass(), "last", null);
        setField(term355956, term355956.getClass(), "propListHead", null);
        setIntField(term355956, term355956.getClass(), "sourcePosition", 0);
        setField(term355956, term355956.getClass(), "jsType", null);
        setField(term355956, term355956.getClass(), "parent", null);
        setField(term355955, term355955.getClass(), "next", term355956);
        setField(term355955, term355955.getClass(), "first", null);
        setField(term355955, term355955.getClass(), "last", null);
        setField(term355955, term355955.getClass(), "propListHead", null);
        setIntField(term355955, term355955.getClass(), "sourcePosition", 0);
        setField(term355955, term355955.getClass(), "jsType", null);
        setField(term355955, term355955.getClass(), "parent", null);
        setField(term355954, term355954.getClass(), "first", term355955);
        setField(term355954, term355954.getClass(), "last", null);
        setField(term355954, term355954.getClass(), "propListHead", null);
        setIntField(term355954, term355954.getClass(), "sourcePosition", 0);
        setField(term355954, term355954.getClass(), "jsType", null);
        setField(term355954, term355954.getClass(), "parent", null);
        term355888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term355908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term355888, term355888.getClass(), "functionName", null);
        setBooleanField(term355888, term355888.getClass(), "itsNeedsActivation", false);
        setIntField(term355888, term355888.getClass(), "itsFunctionType", 0);
        setBooleanField(term355888, term355888.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355888, term355888.getClass(), "encodedSourceStart", 0);
        setIntField(term355888, term355888.getClass(), "encodedSourceEnd", 0);
        setField(term355888, term355888.getClass(), "sourceName", null);
        setIntField(term355888, term355888.getClass(), "baseLineno", 0);
        setIntField(term355888, term355888.getClass(), "endLineno", 0);
        setField(term355888, term355888.getClass(), "functions", null);
        setField(term355888, term355888.getClass(), "regexps", null);
        setField(term355888, term355888.getClass(), "itsVariables", null);
        setField(term355888, term355888.getClass(), "itsConst", null);
        setField(term355888, term355888.getClass(), "itsVariableNames", null);
        setIntField(term355888, term355888.getClass(), "varStart", 0);
        setField(term355888, term355888.getClass(), "compilerData", null);
        setIntField(term355888, term355888.getClass(), "type", 9);
        setField(term355888, term355888.getClass(), "next", null);
        setField(term355898, term355898.getClass(), "functionName", null);
        setBooleanField(term355898, term355898.getClass(), "itsNeedsActivation", false);
        setIntField(term355898, term355898.getClass(), "itsFunctionType", 0);
        setBooleanField(term355898, term355898.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term355898, term355898.getClass(), "encodedSourceStart", 0);
        setIntField(term355898, term355898.getClass(), "encodedSourceEnd", 0);
        setField(term355898, term355898.getClass(), "sourceName", null);
        setIntField(term355898, term355898.getClass(), "baseLineno", 0);
        setIntField(term355898, term355898.getClass(), "endLineno", 0);
        setField(term355898, term355898.getClass(), "functions", null);
        setField(term355898, term355898.getClass(), "regexps", null);
        setField(term355898, term355898.getClass(), "itsVariables", null);
        setField(term355898, term355898.getClass(), "itsConst", null);
        setField(term355898, term355898.getClass(), "itsVariableNames", null);
        setIntField(term355898, term355898.getClass(), "varStart", 0);
        setField(term355898, term355898.getClass(), "compilerData", null);
        setIntField(term355898, term355898.getClass(), "type", 0);
        setIntField(term355908, term355908.getClass(), "type", 0);
        setField(term355908, term355908.getClass(), "next", null);
        setField(term355908, term355908.getClass(), "first", null);
        setField(term355908, term355908.getClass(), "last", null);
        setField(term355908, term355908.getClass(), "propListHead", null);
        setIntField(term355908, term355908.getClass(), "sourcePosition", 0);
        setField(term355908, term355908.getClass(), "jsType", null);
        setField(term355908, term355908.getClass(), "parent", null);
        setField(term355898, term355898.getClass(), "next", term355908);
        setField(term355898, term355898.getClass(), "first", null);
        setField(term355898, term355898.getClass(), "last", null);
        setField(term355898, term355898.getClass(), "propListHead", null);
        setIntField(term355898, term355898.getClass(), "sourcePosition", 0);
        setField(term355898, term355898.getClass(), "jsType", null);
        setField(term355898, term355898.getClass(), "parent", null);
        setField(term355888, term355888.getClass(), "first", term355898);
        setField(term355888, term355888.getClass(), "last", null);
        setField(term355888, term355888.getClass(), "propListHead", null);
        setIntField(term355888, term355888.getClass(), "sourcePosition", 0);
        setField(term355888, term355888.getClass(), "jsType", null);
        setField(term355888, term355888.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term355717;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term355631, args);
        assertTrue(recursiveEquals(term355631, term355953));
        assertTrue(recursiveEquals(term355717, term355954));
        assertTrue(recursiveEquals(retValue, term355888));
    }

};



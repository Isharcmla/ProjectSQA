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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638082;
     Object term638174;
     Object term638952;
     Object term638953;
     Object term638905;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term638174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term638260 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term638330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term638260, term638260.getClass(), "next", term638330);
        setField(term638174, term638174.getClass(), "first", term638260);
        setIntField(term638174, term638174.getClass(), "type", 11);
        term638952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term638952, term638952.getClass(), "currentTraversal", null);
        term638953 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term638954 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term638955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term638953, term638953.getClass(), "str", null);
        setIntField(term638953, term638953.getClass(), "type", 11);
        setField(term638953, term638953.getClass(), "next", null);
        setField(term638954, term638954.getClass(), "functionName", null);
        setBooleanField(term638954, term638954.getClass(), "itsNeedsActivation", false);
        setIntField(term638954, term638954.getClass(), "itsFunctionType", 0);
        setBooleanField(term638954, term638954.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term638954, term638954.getClass(), "encodedSourceStart", 0);
        setIntField(term638954, term638954.getClass(), "encodedSourceEnd", 0);
        setField(term638954, term638954.getClass(), "sourceName", null);
        setIntField(term638954, term638954.getClass(), "baseLineno", 0);
        setIntField(term638954, term638954.getClass(), "endLineno", 0);
        setField(term638954, term638954.getClass(), "functions", null);
        setField(term638954, term638954.getClass(), "regexps", null);
        setField(term638954, term638954.getClass(), "itsVariables", null);
        setField(term638954, term638954.getClass(), "itsConst", null);
        setField(term638954, term638954.getClass(), "itsVariableNames", null);
        setIntField(term638954, term638954.getClass(), "varStart", 0);
        setField(term638954, term638954.getClass(), "compilerData", null);
        setIntField(term638954, term638954.getClass(), "type", 0);
        setIntField(term638955, term638955.getClass(), "type", 0);
        setField(term638955, term638955.getClass(), "next", null);
        setField(term638955, term638955.getClass(), "first", null);
        setField(term638955, term638955.getClass(), "last", null);
        setField(term638955, term638955.getClass(), "propListHead", null);
        setIntField(term638955, term638955.getClass(), "sourcePosition", 0);
        setField(term638955, term638955.getClass(), "jsType", null);
        setField(term638955, term638955.getClass(), "parent", null);
        setField(term638954, term638954.getClass(), "next", term638955);
        setField(term638954, term638954.getClass(), "first", null);
        setField(term638954, term638954.getClass(), "last", null);
        setField(term638954, term638954.getClass(), "propListHead", null);
        setIntField(term638954, term638954.getClass(), "sourcePosition", 0);
        setField(term638954, term638954.getClass(), "jsType", null);
        setField(term638954, term638954.getClass(), "parent", null);
        setField(term638953, term638953.getClass(), "first", term638954);
        setField(term638953, term638953.getClass(), "last", null);
        setField(term638953, term638953.getClass(), "propListHead", null);
        setIntField(term638953, term638953.getClass(), "sourcePosition", 0);
        setField(term638953, term638953.getClass(), "jsType", null);
        setField(term638953, term638953.getClass(), "parent", null);
        term638905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term638907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term638917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term638905, term638905.getClass(), "str", null);
        setIntField(term638905, term638905.getClass(), "type", 11);
        setField(term638905, term638905.getClass(), "next", null);
        setField(term638907, term638907.getClass(), "functionName", null);
        setBooleanField(term638907, term638907.getClass(), "itsNeedsActivation", false);
        setIntField(term638907, term638907.getClass(), "itsFunctionType", 0);
        setBooleanField(term638907, term638907.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term638907, term638907.getClass(), "encodedSourceStart", 0);
        setIntField(term638907, term638907.getClass(), "encodedSourceEnd", 0);
        setField(term638907, term638907.getClass(), "sourceName", null);
        setIntField(term638907, term638907.getClass(), "baseLineno", 0);
        setIntField(term638907, term638907.getClass(), "endLineno", 0);
        setField(term638907, term638907.getClass(), "functions", null);
        setField(term638907, term638907.getClass(), "regexps", null);
        setField(term638907, term638907.getClass(), "itsVariables", null);
        setField(term638907, term638907.getClass(), "itsConst", null);
        setField(term638907, term638907.getClass(), "itsVariableNames", null);
        setIntField(term638907, term638907.getClass(), "varStart", 0);
        setField(term638907, term638907.getClass(), "compilerData", null);
        setIntField(term638907, term638907.getClass(), "type", 0);
        setIntField(term638917, term638917.getClass(), "type", 0);
        setField(term638917, term638917.getClass(), "next", null);
        setField(term638917, term638917.getClass(), "first", null);
        setField(term638917, term638917.getClass(), "last", null);
        setField(term638917, term638917.getClass(), "propListHead", null);
        setIntField(term638917, term638917.getClass(), "sourcePosition", 0);
        setField(term638917, term638917.getClass(), "jsType", null);
        setField(term638917, term638917.getClass(), "parent", null);
        setField(term638907, term638907.getClass(), "next", term638917);
        setField(term638907, term638907.getClass(), "first", null);
        setField(term638907, term638907.getClass(), "last", null);
        setField(term638907, term638907.getClass(), "propListHead", null);
        setIntField(term638907, term638907.getClass(), "sourcePosition", 0);
        setField(term638907, term638907.getClass(), "jsType", null);
        setField(term638907, term638907.getClass(), "parent", null);
        setField(term638905, term638905.getClass(), "first", term638907);
        setField(term638905, term638905.getClass(), "last", null);
        setField(term638905, term638905.getClass(), "propListHead", null);
        setIntField(term638905, term638905.getClass(), "sourcePosition", 0);
        setField(term638905, term638905.getClass(), "jsType", null);
        setField(term638905, term638905.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term638174;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term638082, args);
        assertTrue(recursiveEquals(term638082, term638952));
        assertTrue(recursiveEquals(term638174, term638953));
        assertTrue(recursiveEquals(retValue, term638905));
    }

};



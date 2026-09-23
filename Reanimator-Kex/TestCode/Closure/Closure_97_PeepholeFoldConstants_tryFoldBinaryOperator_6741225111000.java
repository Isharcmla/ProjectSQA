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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314629;
     Object term314721;
     Object term314978;
     Object term314979;
     Object term314915;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314629 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term314721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314899 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term314813, term314813.getClass(), "next", term314899);
        setIntField(term314813, term314813.getClass(), "type", 39);
        setField(term314721, term314721.getClass(), "first", term314813);
        setIntField(term314721, term314721.getClass(), "type", 9);
        term314978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term314978, term314978.getClass(), "currentTraversal", null);
        term314979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term314979, term314979.getClass(), "number", 0.0);
        setIntField(term314979, term314979.getClass(), "type", 9);
        setField(term314979, term314979.getClass(), "next", null);
        setDoubleField(term314980, term314980.getClass(), "number", 0.0);
        setIntField(term314980, term314980.getClass(), "type", 39);
        setField(term314981, term314981.getClass(), "functionName", null);
        setBooleanField(term314981, term314981.getClass(), "itsNeedsActivation", false);
        setIntField(term314981, term314981.getClass(), "itsFunctionType", 0);
        setBooleanField(term314981, term314981.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314981, term314981.getClass(), "encodedSourceStart", 0);
        setIntField(term314981, term314981.getClass(), "encodedSourceEnd", 0);
        setField(term314981, term314981.getClass(), "sourceName", null);
        setIntField(term314981, term314981.getClass(), "baseLineno", 0);
        setIntField(term314981, term314981.getClass(), "endLineno", 0);
        setField(term314981, term314981.getClass(), "functions", null);
        setField(term314981, term314981.getClass(), "regexps", null);
        setField(term314981, term314981.getClass(), "itsVariables", null);
        setField(term314981, term314981.getClass(), "itsConst", null);
        setField(term314981, term314981.getClass(), "itsVariableNames", null);
        setIntField(term314981, term314981.getClass(), "varStart", 0);
        setField(term314981, term314981.getClass(), "compilerData", null);
        setIntField(term314981, term314981.getClass(), "type", 0);
        setField(term314981, term314981.getClass(), "next", null);
        setField(term314981, term314981.getClass(), "first", null);
        setField(term314981, term314981.getClass(), "last", null);
        setField(term314981, term314981.getClass(), "propListHead", null);
        setIntField(term314981, term314981.getClass(), "sourcePosition", 0);
        setField(term314981, term314981.getClass(), "jsType", null);
        setField(term314981, term314981.getClass(), "parent", null);
        setField(term314980, term314980.getClass(), "next", term314981);
        setField(term314980, term314980.getClass(), "first", null);
        setField(term314980, term314980.getClass(), "last", null);
        setField(term314980, term314980.getClass(), "propListHead", null);
        setIntField(term314980, term314980.getClass(), "sourcePosition", 0);
        setField(term314980, term314980.getClass(), "jsType", null);
        setField(term314980, term314980.getClass(), "parent", null);
        setField(term314979, term314979.getClass(), "first", term314980);
        setField(term314979, term314979.getClass(), "last", null);
        setField(term314979, term314979.getClass(), "propListHead", null);
        setIntField(term314979, term314979.getClass(), "sourcePosition", 0);
        setField(term314979, term314979.getClass(), "jsType", null);
        setField(term314979, term314979.getClass(), "parent", null);
        term314915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term314921 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term314915, term314915.getClass(), "number", 0.0);
        setIntField(term314915, term314915.getClass(), "type", 9);
        setField(term314915, term314915.getClass(), "next", null);
        setDoubleField(term314918, term314918.getClass(), "number", 0.0);
        setIntField(term314918, term314918.getClass(), "type", 39);
        setField(term314921, term314921.getClass(), "functionName", null);
        setBooleanField(term314921, term314921.getClass(), "itsNeedsActivation", false);
        setIntField(term314921, term314921.getClass(), "itsFunctionType", 0);
        setBooleanField(term314921, term314921.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term314921, term314921.getClass(), "encodedSourceStart", 0);
        setIntField(term314921, term314921.getClass(), "encodedSourceEnd", 0);
        setField(term314921, term314921.getClass(), "sourceName", null);
        setIntField(term314921, term314921.getClass(), "baseLineno", 0);
        setIntField(term314921, term314921.getClass(), "endLineno", 0);
        setField(term314921, term314921.getClass(), "functions", null);
        setField(term314921, term314921.getClass(), "regexps", null);
        setField(term314921, term314921.getClass(), "itsVariables", null);
        setField(term314921, term314921.getClass(), "itsConst", null);
        setField(term314921, term314921.getClass(), "itsVariableNames", null);
        setIntField(term314921, term314921.getClass(), "varStart", 0);
        setField(term314921, term314921.getClass(), "compilerData", null);
        setIntField(term314921, term314921.getClass(), "type", 0);
        setField(term314921, term314921.getClass(), "next", null);
        setField(term314921, term314921.getClass(), "first", null);
        setField(term314921, term314921.getClass(), "last", null);
        setField(term314921, term314921.getClass(), "propListHead", null);
        setIntField(term314921, term314921.getClass(), "sourcePosition", 0);
        setField(term314921, term314921.getClass(), "jsType", null);
        setField(term314921, term314921.getClass(), "parent", null);
        setField(term314918, term314918.getClass(), "next", term314921);
        setField(term314918, term314918.getClass(), "first", null);
        setField(term314918, term314918.getClass(), "last", null);
        setField(term314918, term314918.getClass(), "propListHead", null);
        setIntField(term314918, term314918.getClass(), "sourcePosition", 0);
        setField(term314918, term314918.getClass(), "jsType", null);
        setField(term314918, term314918.getClass(), "parent", null);
        setField(term314915, term314915.getClass(), "first", term314918);
        setField(term314915, term314915.getClass(), "last", null);
        setField(term314915, term314915.getClass(), "propListHead", null);
        setIntField(term314915, term314915.getClass(), "sourcePosition", 0);
        setField(term314915, term314915.getClass(), "jsType", null);
        setField(term314915, term314915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term314721;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term314629, args);
        assertTrue(recursiveEquals(term314629, term314978));
        assertTrue(recursiveEquals(term314721, term314979));
        assertTrue(recursiveEquals(retValue, term314915));
    }

};



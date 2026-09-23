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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99924;
     Object term100010;
     Object term100132;
     Object term100133;
     Object term100095;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term100010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100010, term100010.getClass(), "first", term100010);
        setField(term100010, term100010.getClass(), "next", term100080);
        setIntField(term100010, term100010.getClass(), "type", 23);
        term100132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term100132, term100132.getClass(), "currentTraversal", null);
        term100133 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100133, term100133.getClass(), "functionName", null);
        setBooleanField(term100133, term100133.getClass(), "itsNeedsActivation", false);
        setIntField(term100133, term100133.getClass(), "itsFunctionType", 0);
        setBooleanField(term100133, term100133.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100133, term100133.getClass(), "encodedSourceStart", 0);
        setIntField(term100133, term100133.getClass(), "encodedSourceEnd", 0);
        setField(term100133, term100133.getClass(), "sourceName", null);
        setIntField(term100133, term100133.getClass(), "baseLineno", 0);
        setIntField(term100133, term100133.getClass(), "endLineno", 0);
        setField(term100133, term100133.getClass(), "functions", null);
        setField(term100133, term100133.getClass(), "regexps", null);
        setField(term100133, term100133.getClass(), "itsVariables", null);
        setField(term100133, term100133.getClass(), "itsConst", null);
        setField(term100133, term100133.getClass(), "itsVariableNames", null);
        setIntField(term100133, term100133.getClass(), "varStart", 0);
        setField(term100133, term100133.getClass(), "compilerData", null);
        setIntField(term100133, term100133.getClass(), "type", 23);
        setIntField(term100134, term100134.getClass(), "type", 0);
        setField(term100134, term100134.getClass(), "next", null);
        setField(term100134, term100134.getClass(), "first", null);
        setField(term100134, term100134.getClass(), "last", null);
        setField(term100134, term100134.getClass(), "propListHead", null);
        setIntField(term100134, term100134.getClass(), "sourcePosition", 0);
        setField(term100134, term100134.getClass(), "jsType", null);
        setField(term100134, term100134.getClass(), "parent", null);
        setField(term100133, term100133.getClass(), "next", term100134);
        setField(term100133, term100133.getClass(), "first", term100133);
        setField(term100133, term100133.getClass(), "last", null);
        setField(term100133, term100133.getClass(), "propListHead", null);
        setIntField(term100133, term100133.getClass(), "sourcePosition", 0);
        setField(term100133, term100133.getClass(), "jsType", null);
        setField(term100133, term100133.getClass(), "parent", null);
        term100095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100095, term100095.getClass(), "functionName", null);
        setBooleanField(term100095, term100095.getClass(), "itsNeedsActivation", false);
        setIntField(term100095, term100095.getClass(), "itsFunctionType", 0);
        setBooleanField(term100095, term100095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100095, term100095.getClass(), "encodedSourceStart", 0);
        setIntField(term100095, term100095.getClass(), "encodedSourceEnd", 0);
        setField(term100095, term100095.getClass(), "sourceName", null);
        setIntField(term100095, term100095.getClass(), "baseLineno", 0);
        setIntField(term100095, term100095.getClass(), "endLineno", 0);
        setField(term100095, term100095.getClass(), "functions", null);
        setField(term100095, term100095.getClass(), "regexps", null);
        setField(term100095, term100095.getClass(), "itsVariables", null);
        setField(term100095, term100095.getClass(), "itsConst", null);
        setField(term100095, term100095.getClass(), "itsVariableNames", null);
        setIntField(term100095, term100095.getClass(), "varStart", 0);
        setField(term100095, term100095.getClass(), "compilerData", null);
        setIntField(term100095, term100095.getClass(), "type", 23);
        setIntField(term100105, term100105.getClass(), "type", 0);
        setField(term100105, term100105.getClass(), "next", null);
        setField(term100105, term100105.getClass(), "first", null);
        setField(term100105, term100105.getClass(), "last", null);
        setField(term100105, term100105.getClass(), "propListHead", null);
        setIntField(term100105, term100105.getClass(), "sourcePosition", 0);
        setField(term100105, term100105.getClass(), "jsType", null);
        setField(term100105, term100105.getClass(), "parent", null);
        setField(term100095, term100095.getClass(), "next", term100105);
        setField(term100095, term100095.getClass(), "first", term100095);
        setField(term100095, term100095.getClass(), "last", null);
        setField(term100095, term100095.getClass(), "propListHead", null);
        setIntField(term100095, term100095.getClass(), "sourcePosition", 0);
        setField(term100095, term100095.getClass(), "jsType", null);
        setField(term100095, term100095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100010;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term99924, args);
        assertTrue(recursiveEquals(term99924, term100132));
        assertTrue(recursiveEquals(term100010, term100133));
        assertTrue(recursiveEquals(retValue, term100095));
    }

};



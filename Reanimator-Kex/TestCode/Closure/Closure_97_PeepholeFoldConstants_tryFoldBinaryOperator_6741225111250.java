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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404696;
     Object term404788;
     Object term421385;
     Object term421386;
     Object term421335;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term404696 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term404788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term404874 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term404944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term404874, term404874.getClass(), "next", term404944);
        setField(term404788, term404788.getClass(), "first", term404874);
        setIntField(term404788, term404788.getClass(), "type", 45);
        term421385 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term421385, term421385.getClass(), "currentTraversal", null);
        term421386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421387 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term421386, term421386.getClass(), "str", null);
        setIntField(term421386, term421386.getClass(), "type", 45);
        setField(term421386, term421386.getClass(), "next", null);
        setField(term421387, term421387.getClass(), "functionName", null);
        setBooleanField(term421387, term421387.getClass(), "itsNeedsActivation", false);
        setIntField(term421387, term421387.getClass(), "itsFunctionType", 0);
        setBooleanField(term421387, term421387.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421387, term421387.getClass(), "encodedSourceStart", 0);
        setIntField(term421387, term421387.getClass(), "encodedSourceEnd", 0);
        setField(term421387, term421387.getClass(), "sourceName", null);
        setIntField(term421387, term421387.getClass(), "baseLineno", 0);
        setIntField(term421387, term421387.getClass(), "endLineno", 0);
        setField(term421387, term421387.getClass(), "functions", null);
        setField(term421387, term421387.getClass(), "regexps", null);
        setField(term421387, term421387.getClass(), "itsVariables", null);
        setField(term421387, term421387.getClass(), "itsConst", null);
        setField(term421387, term421387.getClass(), "itsVariableNames", null);
        setIntField(term421387, term421387.getClass(), "varStart", 0);
        setField(term421387, term421387.getClass(), "compilerData", null);
        setIntField(term421387, term421387.getClass(), "type", 0);
        setIntField(term421388, term421388.getClass(), "type", 0);
        setField(term421388, term421388.getClass(), "next", null);
        setField(term421388, term421388.getClass(), "first", null);
        setField(term421388, term421388.getClass(), "last", null);
        setField(term421388, term421388.getClass(), "propListHead", null);
        setIntField(term421388, term421388.getClass(), "sourcePosition", 0);
        setField(term421388, term421388.getClass(), "jsType", null);
        setField(term421388, term421388.getClass(), "parent", null);
        setField(term421387, term421387.getClass(), "next", term421388);
        setField(term421387, term421387.getClass(), "first", null);
        setField(term421387, term421387.getClass(), "last", null);
        setField(term421387, term421387.getClass(), "propListHead", null);
        setIntField(term421387, term421387.getClass(), "sourcePosition", 0);
        setField(term421387, term421387.getClass(), "jsType", null);
        setField(term421387, term421387.getClass(), "parent", null);
        setField(term421386, term421386.getClass(), "first", term421387);
        setField(term421386, term421386.getClass(), "last", null);
        setField(term421386, term421386.getClass(), "propListHead", null);
        setIntField(term421386, term421386.getClass(), "sourcePosition", 0);
        setField(term421386, term421386.getClass(), "jsType", null);
        setField(term421386, term421386.getClass(), "parent", null);
        term421335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term421337 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term421347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term421335, term421335.getClass(), "str", null);
        setIntField(term421335, term421335.getClass(), "type", 45);
        setField(term421335, term421335.getClass(), "next", null);
        setField(term421337, term421337.getClass(), "functionName", null);
        setBooleanField(term421337, term421337.getClass(), "itsNeedsActivation", false);
        setIntField(term421337, term421337.getClass(), "itsFunctionType", 0);
        setBooleanField(term421337, term421337.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term421337, term421337.getClass(), "encodedSourceStart", 0);
        setIntField(term421337, term421337.getClass(), "encodedSourceEnd", 0);
        setField(term421337, term421337.getClass(), "sourceName", null);
        setIntField(term421337, term421337.getClass(), "baseLineno", 0);
        setIntField(term421337, term421337.getClass(), "endLineno", 0);
        setField(term421337, term421337.getClass(), "functions", null);
        setField(term421337, term421337.getClass(), "regexps", null);
        setField(term421337, term421337.getClass(), "itsVariables", null);
        setField(term421337, term421337.getClass(), "itsConst", null);
        setField(term421337, term421337.getClass(), "itsVariableNames", null);
        setIntField(term421337, term421337.getClass(), "varStart", 0);
        setField(term421337, term421337.getClass(), "compilerData", null);
        setIntField(term421337, term421337.getClass(), "type", 0);
        setIntField(term421347, term421347.getClass(), "type", 0);
        setField(term421347, term421347.getClass(), "next", null);
        setField(term421347, term421347.getClass(), "first", null);
        setField(term421347, term421347.getClass(), "last", null);
        setField(term421347, term421347.getClass(), "propListHead", null);
        setIntField(term421347, term421347.getClass(), "sourcePosition", 0);
        setField(term421347, term421347.getClass(), "jsType", null);
        setField(term421347, term421347.getClass(), "parent", null);
        setField(term421337, term421337.getClass(), "next", term421347);
        setField(term421337, term421337.getClass(), "first", null);
        setField(term421337, term421337.getClass(), "last", null);
        setField(term421337, term421337.getClass(), "propListHead", null);
        setIntField(term421337, term421337.getClass(), "sourcePosition", 0);
        setField(term421337, term421337.getClass(), "jsType", null);
        setField(term421337, term421337.getClass(), "parent", null);
        setField(term421335, term421335.getClass(), "first", term421337);
        setField(term421335, term421335.getClass(), "last", null);
        setField(term421335, term421335.getClass(), "propListHead", null);
        setIntField(term421335, term421335.getClass(), "sourcePosition", 0);
        setField(term421335, term421335.getClass(), "jsType", null);
        setField(term421335, term421335.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term404788;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term404696, args);
        assertTrue(recursiveEquals(term404696, term421385));
        assertTrue(recursiveEquals(term404788, term421386));
        assertTrue(recursiveEquals(retValue, term421335));
    }

};



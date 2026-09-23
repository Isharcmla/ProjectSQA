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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84398;
     Object term84484;
     Object term84606;
     Object term84607;
     Object term84569;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84398 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term84484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84484, term84484.getClass(), "first", term84484);
        setField(term84484, term84484.getClass(), "next", term84554);
        setIntField(term84484, term84484.getClass(), "type", 23);
        term84606 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term84606, term84606.getClass(), "currentTraversal", null);
        term84607 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84607, term84607.getClass(), "functionName", null);
        setBooleanField(term84607, term84607.getClass(), "itsNeedsActivation", false);
        setIntField(term84607, term84607.getClass(), "itsFunctionType", 0);
        setBooleanField(term84607, term84607.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84607, term84607.getClass(), "encodedSourceStart", 0);
        setIntField(term84607, term84607.getClass(), "encodedSourceEnd", 0);
        setField(term84607, term84607.getClass(), "sourceName", null);
        setIntField(term84607, term84607.getClass(), "baseLineno", 0);
        setIntField(term84607, term84607.getClass(), "endLineno", 0);
        setField(term84607, term84607.getClass(), "functions", null);
        setField(term84607, term84607.getClass(), "regexps", null);
        setField(term84607, term84607.getClass(), "itsVariables", null);
        setField(term84607, term84607.getClass(), "itsConst", null);
        setField(term84607, term84607.getClass(), "itsVariableNames", null);
        setIntField(term84607, term84607.getClass(), "varStart", 0);
        setField(term84607, term84607.getClass(), "compilerData", null);
        setIntField(term84607, term84607.getClass(), "type", 23);
        setIntField(term84608, term84608.getClass(), "type", 0);
        setField(term84608, term84608.getClass(), "next", null);
        setField(term84608, term84608.getClass(), "first", null);
        setField(term84608, term84608.getClass(), "last", null);
        setField(term84608, term84608.getClass(), "propListHead", null);
        setIntField(term84608, term84608.getClass(), "sourcePosition", 0);
        setField(term84608, term84608.getClass(), "jsType", null);
        setField(term84608, term84608.getClass(), "parent", null);
        setField(term84607, term84607.getClass(), "next", term84608);
        setField(term84607, term84607.getClass(), "first", term84607);
        setField(term84607, term84607.getClass(), "last", null);
        setField(term84607, term84607.getClass(), "propListHead", null);
        setIntField(term84607, term84607.getClass(), "sourcePosition", 0);
        setField(term84607, term84607.getClass(), "jsType", null);
        setField(term84607, term84607.getClass(), "parent", null);
        term84569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84569, term84569.getClass(), "functionName", null);
        setBooleanField(term84569, term84569.getClass(), "itsNeedsActivation", false);
        setIntField(term84569, term84569.getClass(), "itsFunctionType", 0);
        setBooleanField(term84569, term84569.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84569, term84569.getClass(), "encodedSourceStart", 0);
        setIntField(term84569, term84569.getClass(), "encodedSourceEnd", 0);
        setField(term84569, term84569.getClass(), "sourceName", null);
        setIntField(term84569, term84569.getClass(), "baseLineno", 0);
        setIntField(term84569, term84569.getClass(), "endLineno", 0);
        setField(term84569, term84569.getClass(), "functions", null);
        setField(term84569, term84569.getClass(), "regexps", null);
        setField(term84569, term84569.getClass(), "itsVariables", null);
        setField(term84569, term84569.getClass(), "itsConst", null);
        setField(term84569, term84569.getClass(), "itsVariableNames", null);
        setIntField(term84569, term84569.getClass(), "varStart", 0);
        setField(term84569, term84569.getClass(), "compilerData", null);
        setIntField(term84569, term84569.getClass(), "type", 23);
        setIntField(term84579, term84579.getClass(), "type", 0);
        setField(term84579, term84579.getClass(), "next", null);
        setField(term84579, term84579.getClass(), "first", null);
        setField(term84579, term84579.getClass(), "last", null);
        setField(term84579, term84579.getClass(), "propListHead", null);
        setIntField(term84579, term84579.getClass(), "sourcePosition", 0);
        setField(term84579, term84579.getClass(), "jsType", null);
        setField(term84579, term84579.getClass(), "parent", null);
        setField(term84569, term84569.getClass(), "next", term84579);
        setField(term84569, term84569.getClass(), "first", term84569);
        setField(term84569, term84569.getClass(), "last", null);
        setField(term84569, term84569.getClass(), "propListHead", null);
        setIntField(term84569, term84569.getClass(), "sourcePosition", 0);
        setField(term84569, term84569.getClass(), "jsType", null);
        setField(term84569, term84569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84484;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term84398, args);
        assertTrue(recursiveEquals(term84398, term84606));
        assertTrue(recursiveEquals(term84484, term84607));
        assertTrue(recursiveEquals(retValue, term84569));
    }

};



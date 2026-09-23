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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279186;
     Object term279272;
     Object term303516;
     Object term303517;
     Object term303479;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279186 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term279272 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term279342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term279272, term279272.getClass(), "first", term279272);
        setField(term279272, term279272.getClass(), "next", term279342);
        setIntField(term279272, term279272.getClass(), "type", 24);
        term303516 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303516, term303516.getClass(), "currentTraversal", null);
        term303517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term303518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term303517, term303517.getClass(), "functionName", null);
        setBooleanField(term303517, term303517.getClass(), "itsNeedsActivation", false);
        setIntField(term303517, term303517.getClass(), "itsFunctionType", 0);
        setBooleanField(term303517, term303517.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303517, term303517.getClass(), "encodedSourceStart", 0);
        setIntField(term303517, term303517.getClass(), "encodedSourceEnd", 0);
        setField(term303517, term303517.getClass(), "sourceName", null);
        setIntField(term303517, term303517.getClass(), "baseLineno", 0);
        setIntField(term303517, term303517.getClass(), "endLineno", 0);
        setField(term303517, term303517.getClass(), "functions", null);
        setField(term303517, term303517.getClass(), "regexps", null);
        setField(term303517, term303517.getClass(), "itsVariables", null);
        setField(term303517, term303517.getClass(), "itsConst", null);
        setField(term303517, term303517.getClass(), "itsVariableNames", null);
        setIntField(term303517, term303517.getClass(), "varStart", 0);
        setField(term303517, term303517.getClass(), "compilerData", null);
        setIntField(term303517, term303517.getClass(), "type", 24);
        setIntField(term303518, term303518.getClass(), "type", 0);
        setField(term303518, term303518.getClass(), "next", null);
        setField(term303518, term303518.getClass(), "first", null);
        setField(term303518, term303518.getClass(), "last", null);
        setField(term303518, term303518.getClass(), "propListHead", null);
        setIntField(term303518, term303518.getClass(), "sourcePosition", 0);
        setField(term303518, term303518.getClass(), "jsType", null);
        setField(term303518, term303518.getClass(), "parent", null);
        setField(term303517, term303517.getClass(), "next", term303518);
        setField(term303517, term303517.getClass(), "first", term303517);
        setField(term303517, term303517.getClass(), "last", null);
        setField(term303517, term303517.getClass(), "propListHead", null);
        setIntField(term303517, term303517.getClass(), "sourcePosition", 0);
        setField(term303517, term303517.getClass(), "jsType", null);
        setField(term303517, term303517.getClass(), "parent", null);
        term303479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term303489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term303479, term303479.getClass(), "functionName", null);
        setBooleanField(term303479, term303479.getClass(), "itsNeedsActivation", false);
        setIntField(term303479, term303479.getClass(), "itsFunctionType", 0);
        setBooleanField(term303479, term303479.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303479, term303479.getClass(), "encodedSourceStart", 0);
        setIntField(term303479, term303479.getClass(), "encodedSourceEnd", 0);
        setField(term303479, term303479.getClass(), "sourceName", null);
        setIntField(term303479, term303479.getClass(), "baseLineno", 0);
        setIntField(term303479, term303479.getClass(), "endLineno", 0);
        setField(term303479, term303479.getClass(), "functions", null);
        setField(term303479, term303479.getClass(), "regexps", null);
        setField(term303479, term303479.getClass(), "itsVariables", null);
        setField(term303479, term303479.getClass(), "itsConst", null);
        setField(term303479, term303479.getClass(), "itsVariableNames", null);
        setIntField(term303479, term303479.getClass(), "varStart", 0);
        setField(term303479, term303479.getClass(), "compilerData", null);
        setIntField(term303479, term303479.getClass(), "type", 24);
        setIntField(term303489, term303489.getClass(), "type", 0);
        setField(term303489, term303489.getClass(), "next", null);
        setField(term303489, term303489.getClass(), "first", null);
        setField(term303489, term303489.getClass(), "last", null);
        setField(term303489, term303489.getClass(), "propListHead", null);
        setIntField(term303489, term303489.getClass(), "sourcePosition", 0);
        setField(term303489, term303489.getClass(), "jsType", null);
        setField(term303489, term303489.getClass(), "parent", null);
        setField(term303479, term303479.getClass(), "next", term303489);
        setField(term303479, term303479.getClass(), "first", term303479);
        setField(term303479, term303479.getClass(), "last", null);
        setField(term303479, term303479.getClass(), "propListHead", null);
        setIntField(term303479, term303479.getClass(), "sourcePosition", 0);
        setField(term303479, term303479.getClass(), "jsType", null);
        setField(term303479, term303479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term279272;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term279186, args);
        assertTrue(recursiveEquals(term279186, term303516));
        assertTrue(recursiveEquals(term279272, term303517));
        assertTrue(recursiveEquals(retValue, term303479));
    }

};



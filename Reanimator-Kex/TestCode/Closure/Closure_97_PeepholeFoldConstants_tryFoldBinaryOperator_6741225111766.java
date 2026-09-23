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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691399;
     Object term691491;
     Object term691779;
     Object term691780;
     Object term691729;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term691491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term691577, term691577.getClass(), "next", term691647);
        setField(term691491, term691491.getClass(), "first", term691577);
        setIntField(term691491, term691491.getClass(), "type", 46);
        term691779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term691779, term691779.getClass(), "currentTraversal", null);
        term691780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term691780, term691780.getClass(), "str", null);
        setIntField(term691780, term691780.getClass(), "type", 46);
        setField(term691780, term691780.getClass(), "next", null);
        setField(term691781, term691781.getClass(), "functionName", null);
        setBooleanField(term691781, term691781.getClass(), "itsNeedsActivation", false);
        setIntField(term691781, term691781.getClass(), "itsFunctionType", 0);
        setBooleanField(term691781, term691781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691781, term691781.getClass(), "encodedSourceStart", 0);
        setIntField(term691781, term691781.getClass(), "encodedSourceEnd", 0);
        setField(term691781, term691781.getClass(), "sourceName", null);
        setIntField(term691781, term691781.getClass(), "baseLineno", 0);
        setIntField(term691781, term691781.getClass(), "endLineno", 0);
        setField(term691781, term691781.getClass(), "functions", null);
        setField(term691781, term691781.getClass(), "regexps", null);
        setField(term691781, term691781.getClass(), "itsVariables", null);
        setField(term691781, term691781.getClass(), "itsConst", null);
        setField(term691781, term691781.getClass(), "itsVariableNames", null);
        setIntField(term691781, term691781.getClass(), "varStart", 0);
        setField(term691781, term691781.getClass(), "compilerData", null);
        setIntField(term691781, term691781.getClass(), "type", 0);
        setIntField(term691782, term691782.getClass(), "type", 0);
        setField(term691782, term691782.getClass(), "next", null);
        setField(term691782, term691782.getClass(), "first", null);
        setField(term691782, term691782.getClass(), "last", null);
        setField(term691782, term691782.getClass(), "propListHead", null);
        setIntField(term691782, term691782.getClass(), "sourcePosition", 0);
        setField(term691782, term691782.getClass(), "jsType", null);
        setField(term691782, term691782.getClass(), "parent", null);
        setField(term691781, term691781.getClass(), "next", term691782);
        setField(term691781, term691781.getClass(), "first", null);
        setField(term691781, term691781.getClass(), "last", null);
        setField(term691781, term691781.getClass(), "propListHead", null);
        setIntField(term691781, term691781.getClass(), "sourcePosition", 0);
        setField(term691781, term691781.getClass(), "jsType", null);
        setField(term691781, term691781.getClass(), "parent", null);
        setField(term691780, term691780.getClass(), "first", term691781);
        setField(term691780, term691780.getClass(), "last", null);
        setField(term691780, term691780.getClass(), "propListHead", null);
        setIntField(term691780, term691780.getClass(), "sourcePosition", 0);
        setField(term691780, term691780.getClass(), "jsType", null);
        setField(term691780, term691780.getClass(), "parent", null);
        term691729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term691731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term691729, term691729.getClass(), "str", null);
        setIntField(term691729, term691729.getClass(), "type", 46);
        setField(term691729, term691729.getClass(), "next", null);
        setField(term691731, term691731.getClass(), "functionName", null);
        setBooleanField(term691731, term691731.getClass(), "itsNeedsActivation", false);
        setIntField(term691731, term691731.getClass(), "itsFunctionType", 0);
        setBooleanField(term691731, term691731.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691731, term691731.getClass(), "encodedSourceStart", 0);
        setIntField(term691731, term691731.getClass(), "encodedSourceEnd", 0);
        setField(term691731, term691731.getClass(), "sourceName", null);
        setIntField(term691731, term691731.getClass(), "baseLineno", 0);
        setIntField(term691731, term691731.getClass(), "endLineno", 0);
        setField(term691731, term691731.getClass(), "functions", null);
        setField(term691731, term691731.getClass(), "regexps", null);
        setField(term691731, term691731.getClass(), "itsVariables", null);
        setField(term691731, term691731.getClass(), "itsConst", null);
        setField(term691731, term691731.getClass(), "itsVariableNames", null);
        setIntField(term691731, term691731.getClass(), "varStart", 0);
        setField(term691731, term691731.getClass(), "compilerData", null);
        setIntField(term691731, term691731.getClass(), "type", 0);
        setIntField(term691741, term691741.getClass(), "type", 0);
        setField(term691741, term691741.getClass(), "next", null);
        setField(term691741, term691741.getClass(), "first", null);
        setField(term691741, term691741.getClass(), "last", null);
        setField(term691741, term691741.getClass(), "propListHead", null);
        setIntField(term691741, term691741.getClass(), "sourcePosition", 0);
        setField(term691741, term691741.getClass(), "jsType", null);
        setField(term691741, term691741.getClass(), "parent", null);
        setField(term691731, term691731.getClass(), "next", term691741);
        setField(term691731, term691731.getClass(), "first", null);
        setField(term691731, term691731.getClass(), "last", null);
        setField(term691731, term691731.getClass(), "propListHead", null);
        setIntField(term691731, term691731.getClass(), "sourcePosition", 0);
        setField(term691731, term691731.getClass(), "jsType", null);
        setField(term691731, term691731.getClass(), "parent", null);
        setField(term691729, term691729.getClass(), "first", term691731);
        setField(term691729, term691729.getClass(), "last", null);
        setField(term691729, term691729.getClass(), "propListHead", null);
        setIntField(term691729, term691729.getClass(), "sourcePosition", 0);
        setField(term691729, term691729.getClass(), "jsType", null);
        setField(term691729, term691729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term691491;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term691399, args);
        assertTrue(recursiveEquals(term691399, term691779));
        assertTrue(recursiveEquals(term691491, term691780));
        assertTrue(recursiveEquals(retValue, term691729));
    }

};



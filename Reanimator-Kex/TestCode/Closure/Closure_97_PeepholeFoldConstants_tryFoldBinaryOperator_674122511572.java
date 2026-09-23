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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150498;
     Object term150584;
     Object term150713;
     Object term150714;
     Object term150669;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150498 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term150584 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term150584, term150584.getClass(), "first", term150584);
        setField(term150584, term150584.getClass(), "next", term150654);
        setIntField(term150584, term150584.getClass(), "type", 13);
        term150713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term150713, term150713.getClass(), "currentTraversal", null);
        term150714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term150714, term150714.getClass(), "functionName", null);
        setBooleanField(term150714, term150714.getClass(), "itsNeedsActivation", false);
        setIntField(term150714, term150714.getClass(), "itsFunctionType", 0);
        setBooleanField(term150714, term150714.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150714, term150714.getClass(), "encodedSourceStart", 0);
        setIntField(term150714, term150714.getClass(), "encodedSourceEnd", 0);
        setField(term150714, term150714.getClass(), "sourceName", null);
        setIntField(term150714, term150714.getClass(), "baseLineno", 0);
        setIntField(term150714, term150714.getClass(), "endLineno", 0);
        setField(term150714, term150714.getClass(), "functions", null);
        setField(term150714, term150714.getClass(), "regexps", null);
        setField(term150714, term150714.getClass(), "itsVariables", null);
        setField(term150714, term150714.getClass(), "itsConst", null);
        setField(term150714, term150714.getClass(), "itsVariableNames", null);
        setIntField(term150714, term150714.getClass(), "varStart", 0);
        setField(term150714, term150714.getClass(), "compilerData", null);
        setIntField(term150714, term150714.getClass(), "type", 13);
        setIntField(term150715, term150715.getClass(), "type", 0);
        setField(term150715, term150715.getClass(), "next", null);
        setField(term150715, term150715.getClass(), "first", null);
        setField(term150715, term150715.getClass(), "last", null);
        setField(term150715, term150715.getClass(), "propListHead", null);
        setIntField(term150715, term150715.getClass(), "sourcePosition", 0);
        setField(term150715, term150715.getClass(), "jsType", null);
        setField(term150715, term150715.getClass(), "parent", null);
        setField(term150714, term150714.getClass(), "next", term150715);
        setField(term150714, term150714.getClass(), "first", term150714);
        setField(term150714, term150714.getClass(), "last", null);
        setField(term150714, term150714.getClass(), "propListHead", null);
        setIntField(term150714, term150714.getClass(), "sourcePosition", 0);
        setField(term150714, term150714.getClass(), "jsType", null);
        setField(term150714, term150714.getClass(), "parent", null);
        term150669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term150679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term150669, term150669.getClass(), "functionName", null);
        setBooleanField(term150669, term150669.getClass(), "itsNeedsActivation", false);
        setIntField(term150669, term150669.getClass(), "itsFunctionType", 0);
        setBooleanField(term150669, term150669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term150669, term150669.getClass(), "encodedSourceStart", 0);
        setIntField(term150669, term150669.getClass(), "encodedSourceEnd", 0);
        setField(term150669, term150669.getClass(), "sourceName", null);
        setIntField(term150669, term150669.getClass(), "baseLineno", 0);
        setIntField(term150669, term150669.getClass(), "endLineno", 0);
        setField(term150669, term150669.getClass(), "functions", null);
        setField(term150669, term150669.getClass(), "regexps", null);
        setField(term150669, term150669.getClass(), "itsVariables", null);
        setField(term150669, term150669.getClass(), "itsConst", null);
        setField(term150669, term150669.getClass(), "itsVariableNames", null);
        setIntField(term150669, term150669.getClass(), "varStart", 0);
        setField(term150669, term150669.getClass(), "compilerData", null);
        setIntField(term150669, term150669.getClass(), "type", 13);
        setIntField(term150679, term150679.getClass(), "type", 0);
        setField(term150679, term150679.getClass(), "next", null);
        setField(term150679, term150679.getClass(), "first", null);
        setField(term150679, term150679.getClass(), "last", null);
        setField(term150679, term150679.getClass(), "propListHead", null);
        setIntField(term150679, term150679.getClass(), "sourcePosition", 0);
        setField(term150679, term150679.getClass(), "jsType", null);
        setField(term150679, term150679.getClass(), "parent", null);
        setField(term150669, term150669.getClass(), "next", term150679);
        setField(term150669, term150669.getClass(), "first", term150669);
        setField(term150669, term150669.getClass(), "last", null);
        setField(term150669, term150669.getClass(), "propListHead", null);
        setIntField(term150669, term150669.getClass(), "sourcePosition", 0);
        setField(term150669, term150669.getClass(), "jsType", null);
        setField(term150669, term150669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term150584;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term150498, args);
        assertTrue(recursiveEquals(term150498, term150713));
        assertTrue(recursiveEquals(term150584, term150714));
        assertTrue(recursiveEquals(retValue, term150669));
    }

};



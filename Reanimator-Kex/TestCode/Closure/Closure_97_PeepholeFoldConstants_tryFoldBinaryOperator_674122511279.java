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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55051;
     Object term55137;
     Object term55710;
     Object term55711;
     Object term55666;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55051 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term55137 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55137, term55137.getClass(), "first", term55137);
        setField(term55137, term55137.getClass(), "next", term55207);
        setIntField(term55137, term55137.getClass(), "type", 12);
        term55710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term55710, term55710.getClass(), "currentTraversal", null);
        term55711 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55711, term55711.getClass(), "functionName", null);
        setBooleanField(term55711, term55711.getClass(), "itsNeedsActivation", false);
        setIntField(term55711, term55711.getClass(), "itsFunctionType", 0);
        setBooleanField(term55711, term55711.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55711, term55711.getClass(), "encodedSourceStart", 0);
        setIntField(term55711, term55711.getClass(), "encodedSourceEnd", 0);
        setField(term55711, term55711.getClass(), "sourceName", null);
        setIntField(term55711, term55711.getClass(), "baseLineno", 0);
        setIntField(term55711, term55711.getClass(), "endLineno", 0);
        setField(term55711, term55711.getClass(), "functions", null);
        setField(term55711, term55711.getClass(), "regexps", null);
        setField(term55711, term55711.getClass(), "itsVariables", null);
        setField(term55711, term55711.getClass(), "itsConst", null);
        setField(term55711, term55711.getClass(), "itsVariableNames", null);
        setIntField(term55711, term55711.getClass(), "varStart", 0);
        setField(term55711, term55711.getClass(), "compilerData", null);
        setIntField(term55711, term55711.getClass(), "type", 12);
        setIntField(term55712, term55712.getClass(), "type", 0);
        setField(term55712, term55712.getClass(), "next", null);
        setField(term55712, term55712.getClass(), "first", null);
        setField(term55712, term55712.getClass(), "last", null);
        setField(term55712, term55712.getClass(), "propListHead", null);
        setIntField(term55712, term55712.getClass(), "sourcePosition", 0);
        setField(term55712, term55712.getClass(), "jsType", null);
        setField(term55712, term55712.getClass(), "parent", null);
        setField(term55711, term55711.getClass(), "next", term55712);
        setField(term55711, term55711.getClass(), "first", term55711);
        setField(term55711, term55711.getClass(), "last", null);
        setField(term55711, term55711.getClass(), "propListHead", null);
        setIntField(term55711, term55711.getClass(), "sourcePosition", 0);
        setField(term55711, term55711.getClass(), "jsType", null);
        setField(term55711, term55711.getClass(), "parent", null);
        term55666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55666, term55666.getClass(), "functionName", null);
        setBooleanField(term55666, term55666.getClass(), "itsNeedsActivation", false);
        setIntField(term55666, term55666.getClass(), "itsFunctionType", 0);
        setBooleanField(term55666, term55666.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55666, term55666.getClass(), "encodedSourceStart", 0);
        setIntField(term55666, term55666.getClass(), "encodedSourceEnd", 0);
        setField(term55666, term55666.getClass(), "sourceName", null);
        setIntField(term55666, term55666.getClass(), "baseLineno", 0);
        setIntField(term55666, term55666.getClass(), "endLineno", 0);
        setField(term55666, term55666.getClass(), "functions", null);
        setField(term55666, term55666.getClass(), "regexps", null);
        setField(term55666, term55666.getClass(), "itsVariables", null);
        setField(term55666, term55666.getClass(), "itsConst", null);
        setField(term55666, term55666.getClass(), "itsVariableNames", null);
        setIntField(term55666, term55666.getClass(), "varStart", 0);
        setField(term55666, term55666.getClass(), "compilerData", null);
        setIntField(term55666, term55666.getClass(), "type", 12);
        setIntField(term55676, term55676.getClass(), "type", 0);
        setField(term55676, term55676.getClass(), "next", null);
        setField(term55676, term55676.getClass(), "first", null);
        setField(term55676, term55676.getClass(), "last", null);
        setField(term55676, term55676.getClass(), "propListHead", null);
        setIntField(term55676, term55676.getClass(), "sourcePosition", 0);
        setField(term55676, term55676.getClass(), "jsType", null);
        setField(term55676, term55676.getClass(), "parent", null);
        setField(term55666, term55666.getClass(), "next", term55676);
        setField(term55666, term55666.getClass(), "first", term55666);
        setField(term55666, term55666.getClass(), "last", null);
        setField(term55666, term55666.getClass(), "propListHead", null);
        setIntField(term55666, term55666.getClass(), "sourcePosition", 0);
        setField(term55666, term55666.getClass(), "jsType", null);
        setField(term55666, term55666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55137;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term55051, args);
        assertTrue(recursiveEquals(term55051, term55710));
        assertTrue(recursiveEquals(term55137, term55711));
        assertTrue(recursiveEquals(retValue, term55666));
    }

};



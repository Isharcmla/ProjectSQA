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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170817;
     Object term170903;
     Object term171598;
     Object term171599;
     Object term171532;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term170903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term170989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term170989, term170989.getClass(), "next", term171059);
        setField(term170903, term170903.getClass(), "first", term170989);
        setIntField(term170903, term170903.getClass(), "type", 46);
        term171598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term171598, term171598.getClass(), "currentTraversal", null);
        term171599 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term171599, term171599.getClass(), "functionName", null);
        setBooleanField(term171599, term171599.getClass(), "itsNeedsActivation", false);
        setIntField(term171599, term171599.getClass(), "itsFunctionType", 0);
        setBooleanField(term171599, term171599.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171599, term171599.getClass(), "encodedSourceStart", 0);
        setIntField(term171599, term171599.getClass(), "encodedSourceEnd", 0);
        setField(term171599, term171599.getClass(), "sourceName", null);
        setIntField(term171599, term171599.getClass(), "baseLineno", 0);
        setIntField(term171599, term171599.getClass(), "endLineno", 0);
        setField(term171599, term171599.getClass(), "functions", null);
        setField(term171599, term171599.getClass(), "regexps", null);
        setField(term171599, term171599.getClass(), "itsVariables", null);
        setField(term171599, term171599.getClass(), "itsConst", null);
        setField(term171599, term171599.getClass(), "itsVariableNames", null);
        setIntField(term171599, term171599.getClass(), "varStart", 0);
        setField(term171599, term171599.getClass(), "compilerData", null);
        setIntField(term171599, term171599.getClass(), "type", 46);
        setField(term171599, term171599.getClass(), "next", null);
        setField(term171600, term171600.getClass(), "functionName", null);
        setBooleanField(term171600, term171600.getClass(), "itsNeedsActivation", false);
        setIntField(term171600, term171600.getClass(), "itsFunctionType", 0);
        setBooleanField(term171600, term171600.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171600, term171600.getClass(), "encodedSourceStart", 0);
        setIntField(term171600, term171600.getClass(), "encodedSourceEnd", 0);
        setField(term171600, term171600.getClass(), "sourceName", null);
        setIntField(term171600, term171600.getClass(), "baseLineno", 0);
        setIntField(term171600, term171600.getClass(), "endLineno", 0);
        setField(term171600, term171600.getClass(), "functions", null);
        setField(term171600, term171600.getClass(), "regexps", null);
        setField(term171600, term171600.getClass(), "itsVariables", null);
        setField(term171600, term171600.getClass(), "itsConst", null);
        setField(term171600, term171600.getClass(), "itsVariableNames", null);
        setIntField(term171600, term171600.getClass(), "varStart", 0);
        setField(term171600, term171600.getClass(), "compilerData", null);
        setIntField(term171600, term171600.getClass(), "type", 0);
        setIntField(term171601, term171601.getClass(), "type", 0);
        setField(term171601, term171601.getClass(), "next", null);
        setField(term171601, term171601.getClass(), "first", null);
        setField(term171601, term171601.getClass(), "last", null);
        setField(term171601, term171601.getClass(), "propListHead", null);
        setIntField(term171601, term171601.getClass(), "sourcePosition", 0);
        setField(term171601, term171601.getClass(), "jsType", null);
        setField(term171601, term171601.getClass(), "parent", null);
        setField(term171600, term171600.getClass(), "next", term171601);
        setField(term171600, term171600.getClass(), "first", null);
        setField(term171600, term171600.getClass(), "last", null);
        setField(term171600, term171600.getClass(), "propListHead", null);
        setIntField(term171600, term171600.getClass(), "sourcePosition", 0);
        setField(term171600, term171600.getClass(), "jsType", null);
        setField(term171600, term171600.getClass(), "parent", null);
        setField(term171599, term171599.getClass(), "first", term171600);
        setField(term171599, term171599.getClass(), "last", null);
        setField(term171599, term171599.getClass(), "propListHead", null);
        setIntField(term171599, term171599.getClass(), "sourcePosition", 0);
        setField(term171599, term171599.getClass(), "jsType", null);
        setField(term171599, term171599.getClass(), "parent", null);
        term171532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term171532, term171532.getClass(), "functionName", null);
        setBooleanField(term171532, term171532.getClass(), "itsNeedsActivation", false);
        setIntField(term171532, term171532.getClass(), "itsFunctionType", 0);
        setBooleanField(term171532, term171532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171532, term171532.getClass(), "encodedSourceStart", 0);
        setIntField(term171532, term171532.getClass(), "encodedSourceEnd", 0);
        setField(term171532, term171532.getClass(), "sourceName", null);
        setIntField(term171532, term171532.getClass(), "baseLineno", 0);
        setIntField(term171532, term171532.getClass(), "endLineno", 0);
        setField(term171532, term171532.getClass(), "functions", null);
        setField(term171532, term171532.getClass(), "regexps", null);
        setField(term171532, term171532.getClass(), "itsVariables", null);
        setField(term171532, term171532.getClass(), "itsConst", null);
        setField(term171532, term171532.getClass(), "itsVariableNames", null);
        setIntField(term171532, term171532.getClass(), "varStart", 0);
        setField(term171532, term171532.getClass(), "compilerData", null);
        setIntField(term171532, term171532.getClass(), "type", 46);
        setField(term171532, term171532.getClass(), "next", null);
        setField(term171542, term171542.getClass(), "functionName", null);
        setBooleanField(term171542, term171542.getClass(), "itsNeedsActivation", false);
        setIntField(term171542, term171542.getClass(), "itsFunctionType", 0);
        setBooleanField(term171542, term171542.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term171542, term171542.getClass(), "encodedSourceStart", 0);
        setIntField(term171542, term171542.getClass(), "encodedSourceEnd", 0);
        setField(term171542, term171542.getClass(), "sourceName", null);
        setIntField(term171542, term171542.getClass(), "baseLineno", 0);
        setIntField(term171542, term171542.getClass(), "endLineno", 0);
        setField(term171542, term171542.getClass(), "functions", null);
        setField(term171542, term171542.getClass(), "regexps", null);
        setField(term171542, term171542.getClass(), "itsVariables", null);
        setField(term171542, term171542.getClass(), "itsConst", null);
        setField(term171542, term171542.getClass(), "itsVariableNames", null);
        setIntField(term171542, term171542.getClass(), "varStart", 0);
        setField(term171542, term171542.getClass(), "compilerData", null);
        setIntField(term171542, term171542.getClass(), "type", 0);
        setIntField(term171552, term171552.getClass(), "type", 0);
        setField(term171552, term171552.getClass(), "next", null);
        setField(term171552, term171552.getClass(), "first", null);
        setField(term171552, term171552.getClass(), "last", null);
        setField(term171552, term171552.getClass(), "propListHead", null);
        setIntField(term171552, term171552.getClass(), "sourcePosition", 0);
        setField(term171552, term171552.getClass(), "jsType", null);
        setField(term171552, term171552.getClass(), "parent", null);
        setField(term171542, term171542.getClass(), "next", term171552);
        setField(term171542, term171542.getClass(), "first", null);
        setField(term171542, term171542.getClass(), "last", null);
        setField(term171542, term171542.getClass(), "propListHead", null);
        setIntField(term171542, term171542.getClass(), "sourcePosition", 0);
        setField(term171542, term171542.getClass(), "jsType", null);
        setField(term171542, term171542.getClass(), "parent", null);
        setField(term171532, term171532.getClass(), "first", term171542);
        setField(term171532, term171532.getClass(), "last", null);
        setField(term171532, term171532.getClass(), "propListHead", null);
        setIntField(term171532, term171532.getClass(), "sourcePosition", 0);
        setField(term171532, term171532.getClass(), "jsType", null);
        setField(term171532, term171532.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term170903;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term170817, args);
        assertTrue(recursiveEquals(term170817, term171598));
        assertTrue(recursiveEquals(term170903, term171599));
        assertTrue(recursiveEquals(retValue, term171532));
    }

};



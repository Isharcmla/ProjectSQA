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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653710;
     Object term653802;
     Object term654020;
     Object term654021;
     Object term653973;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term653802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term653888, term653888.getClass(), "next", term653958);
        setField(term653802, term653802.getClass(), "first", term653888);
        setIntField(term653802, term653802.getClass(), "type", 35);
        term654020 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term654020, term654020.getClass(), "currentTraversal", null);
        term654021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term654022 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term654023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term654021, term654021.getClass(), "str", null);
        setIntField(term654021, term654021.getClass(), "type", 35);
        setField(term654021, term654021.getClass(), "next", null);
        setField(term654022, term654022.getClass(), "functionName", null);
        setBooleanField(term654022, term654022.getClass(), "itsNeedsActivation", false);
        setIntField(term654022, term654022.getClass(), "itsFunctionType", 0);
        setBooleanField(term654022, term654022.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term654022, term654022.getClass(), "encodedSourceStart", 0);
        setIntField(term654022, term654022.getClass(), "encodedSourceEnd", 0);
        setField(term654022, term654022.getClass(), "sourceName", null);
        setIntField(term654022, term654022.getClass(), "baseLineno", 0);
        setIntField(term654022, term654022.getClass(), "endLineno", 0);
        setField(term654022, term654022.getClass(), "functions", null);
        setField(term654022, term654022.getClass(), "regexps", null);
        setField(term654022, term654022.getClass(), "itsVariables", null);
        setField(term654022, term654022.getClass(), "itsConst", null);
        setField(term654022, term654022.getClass(), "itsVariableNames", null);
        setIntField(term654022, term654022.getClass(), "varStart", 0);
        setField(term654022, term654022.getClass(), "compilerData", null);
        setIntField(term654022, term654022.getClass(), "type", 0);
        setIntField(term654023, term654023.getClass(), "type", 0);
        setField(term654023, term654023.getClass(), "next", null);
        setField(term654023, term654023.getClass(), "first", null);
        setField(term654023, term654023.getClass(), "last", null);
        setField(term654023, term654023.getClass(), "propListHead", null);
        setIntField(term654023, term654023.getClass(), "sourcePosition", 0);
        setField(term654023, term654023.getClass(), "jsType", null);
        setField(term654023, term654023.getClass(), "parent", null);
        setField(term654022, term654022.getClass(), "next", term654023);
        setField(term654022, term654022.getClass(), "first", null);
        setField(term654022, term654022.getClass(), "last", null);
        setField(term654022, term654022.getClass(), "propListHead", null);
        setIntField(term654022, term654022.getClass(), "sourcePosition", 0);
        setField(term654022, term654022.getClass(), "jsType", null);
        setField(term654022, term654022.getClass(), "parent", null);
        setField(term654021, term654021.getClass(), "first", term654022);
        setField(term654021, term654021.getClass(), "last", null);
        setField(term654021, term654021.getClass(), "propListHead", null);
        setIntField(term654021, term654021.getClass(), "sourcePosition", 0);
        setField(term654021, term654021.getClass(), "jsType", null);
        setField(term654021, term654021.getClass(), "parent", null);
        term653973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term653975 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term653985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term653973, term653973.getClass(), "str", null);
        setIntField(term653973, term653973.getClass(), "type", 35);
        setField(term653973, term653973.getClass(), "next", null);
        setField(term653975, term653975.getClass(), "functionName", null);
        setBooleanField(term653975, term653975.getClass(), "itsNeedsActivation", false);
        setIntField(term653975, term653975.getClass(), "itsFunctionType", 0);
        setBooleanField(term653975, term653975.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term653975, term653975.getClass(), "encodedSourceStart", 0);
        setIntField(term653975, term653975.getClass(), "encodedSourceEnd", 0);
        setField(term653975, term653975.getClass(), "sourceName", null);
        setIntField(term653975, term653975.getClass(), "baseLineno", 0);
        setIntField(term653975, term653975.getClass(), "endLineno", 0);
        setField(term653975, term653975.getClass(), "functions", null);
        setField(term653975, term653975.getClass(), "regexps", null);
        setField(term653975, term653975.getClass(), "itsVariables", null);
        setField(term653975, term653975.getClass(), "itsConst", null);
        setField(term653975, term653975.getClass(), "itsVariableNames", null);
        setIntField(term653975, term653975.getClass(), "varStart", 0);
        setField(term653975, term653975.getClass(), "compilerData", null);
        setIntField(term653975, term653975.getClass(), "type", 0);
        setIntField(term653985, term653985.getClass(), "type", 0);
        setField(term653985, term653985.getClass(), "next", null);
        setField(term653985, term653985.getClass(), "first", null);
        setField(term653985, term653985.getClass(), "last", null);
        setField(term653985, term653985.getClass(), "propListHead", null);
        setIntField(term653985, term653985.getClass(), "sourcePosition", 0);
        setField(term653985, term653985.getClass(), "jsType", null);
        setField(term653985, term653985.getClass(), "parent", null);
        setField(term653975, term653975.getClass(), "next", term653985);
        setField(term653975, term653975.getClass(), "first", null);
        setField(term653975, term653975.getClass(), "last", null);
        setField(term653975, term653975.getClass(), "propListHead", null);
        setIntField(term653975, term653975.getClass(), "sourcePosition", 0);
        setField(term653975, term653975.getClass(), "jsType", null);
        setField(term653975, term653975.getClass(), "parent", null);
        setField(term653973, term653973.getClass(), "first", term653975);
        setField(term653973, term653973.getClass(), "last", null);
        setField(term653973, term653973.getClass(), "propListHead", null);
        setIntField(term653973, term653973.getClass(), "sourcePosition", 0);
        setField(term653973, term653973.getClass(), "jsType", null);
        setField(term653973, term653973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term653802;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term653710, args);
        assertTrue(recursiveEquals(term653710, term654020));
        assertTrue(recursiveEquals(term653802, term654021));
        assertTrue(recursiveEquals(retValue, term653973));
    }

};



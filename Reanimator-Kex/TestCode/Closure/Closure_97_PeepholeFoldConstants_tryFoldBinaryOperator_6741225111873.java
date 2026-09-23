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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718828;
     Object term718920;
     Object term719678;
     Object term719679;
     Object term719629;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718828 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term718920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719006 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term719006, term719006.getClass(), "next", term719076);
        setIntField(term719006, term719006.getClass(), "type", 39);
        setField(term718920, term718920.getClass(), "first", term719006);
        setIntField(term718920, term718920.getClass(), "type", 11);
        term719678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term719678, term719678.getClass(), "currentTraversal", null);
        term719679 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term719679, term719679.getClass(), "str", null);
        setIntField(term719679, term719679.getClass(), "type", 11);
        setField(term719679, term719679.getClass(), "next", null);
        setField(term719680, term719680.getClass(), "functionName", null);
        setBooleanField(term719680, term719680.getClass(), "itsNeedsActivation", false);
        setIntField(term719680, term719680.getClass(), "itsFunctionType", 0);
        setBooleanField(term719680, term719680.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719680, term719680.getClass(), "encodedSourceStart", 0);
        setIntField(term719680, term719680.getClass(), "encodedSourceEnd", 0);
        setField(term719680, term719680.getClass(), "sourceName", null);
        setIntField(term719680, term719680.getClass(), "baseLineno", 0);
        setIntField(term719680, term719680.getClass(), "endLineno", 0);
        setField(term719680, term719680.getClass(), "functions", null);
        setField(term719680, term719680.getClass(), "regexps", null);
        setField(term719680, term719680.getClass(), "itsVariables", null);
        setField(term719680, term719680.getClass(), "itsConst", null);
        setField(term719680, term719680.getClass(), "itsVariableNames", null);
        setIntField(term719680, term719680.getClass(), "varStart", 0);
        setField(term719680, term719680.getClass(), "compilerData", null);
        setIntField(term719680, term719680.getClass(), "type", 39);
        setIntField(term719681, term719681.getClass(), "type", 0);
        setField(term719681, term719681.getClass(), "next", null);
        setField(term719681, term719681.getClass(), "first", null);
        setField(term719681, term719681.getClass(), "last", null);
        setField(term719681, term719681.getClass(), "propListHead", null);
        setIntField(term719681, term719681.getClass(), "sourcePosition", 0);
        setField(term719681, term719681.getClass(), "jsType", null);
        setField(term719681, term719681.getClass(), "parent", null);
        setField(term719680, term719680.getClass(), "next", term719681);
        setField(term719680, term719680.getClass(), "first", null);
        setField(term719680, term719680.getClass(), "last", null);
        setField(term719680, term719680.getClass(), "propListHead", null);
        setIntField(term719680, term719680.getClass(), "sourcePosition", 0);
        setField(term719680, term719680.getClass(), "jsType", null);
        setField(term719680, term719680.getClass(), "parent", null);
        setField(term719679, term719679.getClass(), "first", term719680);
        setField(term719679, term719679.getClass(), "last", null);
        setField(term719679, term719679.getClass(), "propListHead", null);
        setIntField(term719679, term719679.getClass(), "sourcePosition", 0);
        setField(term719679, term719679.getClass(), "jsType", null);
        setField(term719679, term719679.getClass(), "parent", null);
        term719629 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term719641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term719629, term719629.getClass(), "str", null);
        setIntField(term719629, term719629.getClass(), "type", 11);
        setField(term719629, term719629.getClass(), "next", null);
        setField(term719631, term719631.getClass(), "functionName", null);
        setBooleanField(term719631, term719631.getClass(), "itsNeedsActivation", false);
        setIntField(term719631, term719631.getClass(), "itsFunctionType", 0);
        setBooleanField(term719631, term719631.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term719631, term719631.getClass(), "encodedSourceStart", 0);
        setIntField(term719631, term719631.getClass(), "encodedSourceEnd", 0);
        setField(term719631, term719631.getClass(), "sourceName", null);
        setIntField(term719631, term719631.getClass(), "baseLineno", 0);
        setIntField(term719631, term719631.getClass(), "endLineno", 0);
        setField(term719631, term719631.getClass(), "functions", null);
        setField(term719631, term719631.getClass(), "regexps", null);
        setField(term719631, term719631.getClass(), "itsVariables", null);
        setField(term719631, term719631.getClass(), "itsConst", null);
        setField(term719631, term719631.getClass(), "itsVariableNames", null);
        setIntField(term719631, term719631.getClass(), "varStart", 0);
        setField(term719631, term719631.getClass(), "compilerData", null);
        setIntField(term719631, term719631.getClass(), "type", 39);
        setIntField(term719641, term719641.getClass(), "type", 0);
        setField(term719641, term719641.getClass(), "next", null);
        setField(term719641, term719641.getClass(), "first", null);
        setField(term719641, term719641.getClass(), "last", null);
        setField(term719641, term719641.getClass(), "propListHead", null);
        setIntField(term719641, term719641.getClass(), "sourcePosition", 0);
        setField(term719641, term719641.getClass(), "jsType", null);
        setField(term719641, term719641.getClass(), "parent", null);
        setField(term719631, term719631.getClass(), "next", term719641);
        setField(term719631, term719631.getClass(), "first", null);
        setField(term719631, term719631.getClass(), "last", null);
        setField(term719631, term719631.getClass(), "propListHead", null);
        setIntField(term719631, term719631.getClass(), "sourcePosition", 0);
        setField(term719631, term719631.getClass(), "jsType", null);
        setField(term719631, term719631.getClass(), "parent", null);
        setField(term719629, term719629.getClass(), "first", term719631);
        setField(term719629, term719629.getClass(), "last", null);
        setField(term719629, term719629.getClass(), "propListHead", null);
        setIntField(term719629, term719629.getClass(), "sourcePosition", 0);
        setField(term719629, term719629.getClass(), "jsType", null);
        setField(term719629, term719629.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term718920;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term718828, args);
        assertTrue(recursiveEquals(term718828, term719678));
        assertTrue(recursiveEquals(term718920, term719679));
        assertTrue(recursiveEquals(retValue, term719629));
    }

};



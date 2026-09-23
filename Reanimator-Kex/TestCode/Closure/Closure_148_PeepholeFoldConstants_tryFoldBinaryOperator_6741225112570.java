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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728367;
     Object term728459;
     Object term728679;
     Object term728680;
     Object term728630;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728367 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term728459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728545 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term728615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728545, term728545.getClass(), "next", term728615);
        setIntField(term728545, term728545.getClass(), "type", 39);
        setField(term728459, term728459.getClass(), "first", term728545);
        setIntField(term728459, term728459.getClass(), "type", 11);
        term728679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term728679, term728679.getClass(), "currentTraversal", null);
        term728680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term728682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728680, term728680.getClass(), "str", null);
        setIntField(term728680, term728680.getClass(), "type", 11);
        setField(term728680, term728680.getClass(), "next", null);
        setField(term728681, term728681.getClass(), "functionName", null);
        setBooleanField(term728681, term728681.getClass(), "itsNeedsActivation", false);
        setIntField(term728681, term728681.getClass(), "itsFunctionType", 0);
        setBooleanField(term728681, term728681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term728681, term728681.getClass(), "encodedSourceStart", 0);
        setIntField(term728681, term728681.getClass(), "encodedSourceEnd", 0);
        setField(term728681, term728681.getClass(), "sourceName", null);
        setIntField(term728681, term728681.getClass(), "baseLineno", 0);
        setIntField(term728681, term728681.getClass(), "endLineno", 0);
        setField(term728681, term728681.getClass(), "functions", null);
        setField(term728681, term728681.getClass(), "regexps", null);
        setField(term728681, term728681.getClass(), "itsVariables", null);
        setField(term728681, term728681.getClass(), "itsConst", null);
        setField(term728681, term728681.getClass(), "itsVariableNames", null);
        setIntField(term728681, term728681.getClass(), "varStart", 0);
        setField(term728681, term728681.getClass(), "compilerData", null);
        setIntField(term728681, term728681.getClass(), "type", 39);
        setIntField(term728682, term728682.getClass(), "type", 0);
        setField(term728682, term728682.getClass(), "next", null);
        setField(term728682, term728682.getClass(), "first", null);
        setField(term728682, term728682.getClass(), "last", null);
        setField(term728682, term728682.getClass(), "propListHead", null);
        setIntField(term728682, term728682.getClass(), "sourcePosition", 0);
        setField(term728682, term728682.getClass(), "jsType", null);
        setField(term728682, term728682.getClass(), "parent", null);
        setField(term728681, term728681.getClass(), "next", term728682);
        setField(term728681, term728681.getClass(), "first", null);
        setField(term728681, term728681.getClass(), "last", null);
        setField(term728681, term728681.getClass(), "propListHead", null);
        setIntField(term728681, term728681.getClass(), "sourcePosition", 0);
        setField(term728681, term728681.getClass(), "jsType", null);
        setField(term728681, term728681.getClass(), "parent", null);
        setField(term728680, term728680.getClass(), "first", term728681);
        setField(term728680, term728680.getClass(), "last", null);
        setField(term728680, term728680.getClass(), "propListHead", null);
        setIntField(term728680, term728680.getClass(), "sourcePosition", 0);
        setField(term728680, term728680.getClass(), "jsType", null);
        setField(term728680, term728680.getClass(), "parent", null);
        term728630 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term728632 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term728642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term728630, term728630.getClass(), "str", null);
        setIntField(term728630, term728630.getClass(), "type", 11);
        setField(term728630, term728630.getClass(), "next", null);
        setField(term728632, term728632.getClass(), "functionName", null);
        setBooleanField(term728632, term728632.getClass(), "itsNeedsActivation", false);
        setIntField(term728632, term728632.getClass(), "itsFunctionType", 0);
        setBooleanField(term728632, term728632.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term728632, term728632.getClass(), "encodedSourceStart", 0);
        setIntField(term728632, term728632.getClass(), "encodedSourceEnd", 0);
        setField(term728632, term728632.getClass(), "sourceName", null);
        setIntField(term728632, term728632.getClass(), "baseLineno", 0);
        setIntField(term728632, term728632.getClass(), "endLineno", 0);
        setField(term728632, term728632.getClass(), "functions", null);
        setField(term728632, term728632.getClass(), "regexps", null);
        setField(term728632, term728632.getClass(), "itsVariables", null);
        setField(term728632, term728632.getClass(), "itsConst", null);
        setField(term728632, term728632.getClass(), "itsVariableNames", null);
        setIntField(term728632, term728632.getClass(), "varStart", 0);
        setField(term728632, term728632.getClass(), "compilerData", null);
        setIntField(term728632, term728632.getClass(), "type", 39);
        setIntField(term728642, term728642.getClass(), "type", 0);
        setField(term728642, term728642.getClass(), "next", null);
        setField(term728642, term728642.getClass(), "first", null);
        setField(term728642, term728642.getClass(), "last", null);
        setField(term728642, term728642.getClass(), "propListHead", null);
        setIntField(term728642, term728642.getClass(), "sourcePosition", 0);
        setField(term728642, term728642.getClass(), "jsType", null);
        setField(term728642, term728642.getClass(), "parent", null);
        setField(term728632, term728632.getClass(), "next", term728642);
        setField(term728632, term728632.getClass(), "first", null);
        setField(term728632, term728632.getClass(), "last", null);
        setField(term728632, term728632.getClass(), "propListHead", null);
        setIntField(term728632, term728632.getClass(), "sourcePosition", 0);
        setField(term728632, term728632.getClass(), "jsType", null);
        setField(term728632, term728632.getClass(), "parent", null);
        setField(term728630, term728630.getClass(), "first", term728632);
        setField(term728630, term728630.getClass(), "last", null);
        setField(term728630, term728630.getClass(), "propListHead", null);
        setIntField(term728630, term728630.getClass(), "sourcePosition", 0);
        setField(term728630, term728630.getClass(), "jsType", null);
        setField(term728630, term728630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term728459;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term728367, args);
        assertTrue(recursiveEquals(term728367, term728679));
        assertTrue(recursiveEquals(term728459, term728680));
        assertTrue(recursiveEquals(retValue, term728630));
    }

};



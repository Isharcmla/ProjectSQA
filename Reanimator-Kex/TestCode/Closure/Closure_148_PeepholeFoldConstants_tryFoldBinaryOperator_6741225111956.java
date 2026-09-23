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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521369;
     Object term521461;
     Object term521683;
     Object term521684;
     Object term521638;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term521461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term521547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term521547, term521547.getClass(), "next", term521617);
        setField(term521461, term521461.getClass(), "first", term521547);
        setIntField(term521461, term521461.getClass(), "type", 19);
        term521683 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term521683, term521683.getClass(), "currentTraversal", null);
        term521684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term521685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term521684, term521684.getClass(), "number", 0.0);
        setIntField(term521684, term521684.getClass(), "type", 19);
        setField(term521684, term521684.getClass(), "next", null);
        setField(term521685, term521685.getClass(), "functionName", null);
        setBooleanField(term521685, term521685.getClass(), "itsNeedsActivation", false);
        setIntField(term521685, term521685.getClass(), "itsFunctionType", 0);
        setBooleanField(term521685, term521685.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term521685, term521685.getClass(), "encodedSourceStart", 0);
        setIntField(term521685, term521685.getClass(), "encodedSourceEnd", 0);
        setField(term521685, term521685.getClass(), "sourceName", null);
        setIntField(term521685, term521685.getClass(), "baseLineno", 0);
        setIntField(term521685, term521685.getClass(), "endLineno", 0);
        setField(term521685, term521685.getClass(), "functions", null);
        setField(term521685, term521685.getClass(), "regexps", null);
        setField(term521685, term521685.getClass(), "itsVariables", null);
        setField(term521685, term521685.getClass(), "itsConst", null);
        setField(term521685, term521685.getClass(), "itsVariableNames", null);
        setIntField(term521685, term521685.getClass(), "varStart", 0);
        setField(term521685, term521685.getClass(), "compilerData", null);
        setIntField(term521685, term521685.getClass(), "type", 0);
        setIntField(term521686, term521686.getClass(), "type", 0);
        setField(term521686, term521686.getClass(), "next", null);
        setField(term521686, term521686.getClass(), "first", null);
        setField(term521686, term521686.getClass(), "last", null);
        setField(term521686, term521686.getClass(), "propListHead", null);
        setIntField(term521686, term521686.getClass(), "sourcePosition", 0);
        setField(term521686, term521686.getClass(), "jsType", null);
        setField(term521686, term521686.getClass(), "parent", null);
        setField(term521685, term521685.getClass(), "next", term521686);
        setField(term521685, term521685.getClass(), "first", null);
        setField(term521685, term521685.getClass(), "last", null);
        setField(term521685, term521685.getClass(), "propListHead", null);
        setIntField(term521685, term521685.getClass(), "sourcePosition", 0);
        setField(term521685, term521685.getClass(), "jsType", null);
        setField(term521685, term521685.getClass(), "parent", null);
        setField(term521684, term521684.getClass(), "first", term521685);
        setField(term521684, term521684.getClass(), "last", null);
        setField(term521684, term521684.getClass(), "propListHead", null);
        setIntField(term521684, term521684.getClass(), "sourcePosition", 0);
        setField(term521684, term521684.getClass(), "jsType", null);
        setField(term521684, term521684.getClass(), "parent", null);
        term521638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term521641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term521638, term521638.getClass(), "number", 0.0);
        setIntField(term521638, term521638.getClass(), "type", 19);
        setField(term521638, term521638.getClass(), "next", null);
        setField(term521641, term521641.getClass(), "functionName", null);
        setBooleanField(term521641, term521641.getClass(), "itsNeedsActivation", false);
        setIntField(term521641, term521641.getClass(), "itsFunctionType", 0);
        setBooleanField(term521641, term521641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term521641, term521641.getClass(), "encodedSourceStart", 0);
        setIntField(term521641, term521641.getClass(), "encodedSourceEnd", 0);
        setField(term521641, term521641.getClass(), "sourceName", null);
        setIntField(term521641, term521641.getClass(), "baseLineno", 0);
        setIntField(term521641, term521641.getClass(), "endLineno", 0);
        setField(term521641, term521641.getClass(), "functions", null);
        setField(term521641, term521641.getClass(), "regexps", null);
        setField(term521641, term521641.getClass(), "itsVariables", null);
        setField(term521641, term521641.getClass(), "itsConst", null);
        setField(term521641, term521641.getClass(), "itsVariableNames", null);
        setIntField(term521641, term521641.getClass(), "varStart", 0);
        setField(term521641, term521641.getClass(), "compilerData", null);
        setIntField(term521641, term521641.getClass(), "type", 0);
        setIntField(term521651, term521651.getClass(), "type", 0);
        setField(term521651, term521651.getClass(), "next", null);
        setField(term521651, term521651.getClass(), "first", null);
        setField(term521651, term521651.getClass(), "last", null);
        setField(term521651, term521651.getClass(), "propListHead", null);
        setIntField(term521651, term521651.getClass(), "sourcePosition", 0);
        setField(term521651, term521651.getClass(), "jsType", null);
        setField(term521651, term521651.getClass(), "parent", null);
        setField(term521641, term521641.getClass(), "next", term521651);
        setField(term521641, term521641.getClass(), "first", null);
        setField(term521641, term521641.getClass(), "last", null);
        setField(term521641, term521641.getClass(), "propListHead", null);
        setIntField(term521641, term521641.getClass(), "sourcePosition", 0);
        setField(term521641, term521641.getClass(), "jsType", null);
        setField(term521641, term521641.getClass(), "parent", null);
        setField(term521638, term521638.getClass(), "first", term521641);
        setField(term521638, term521638.getClass(), "last", null);
        setField(term521638, term521638.getClass(), "propListHead", null);
        setIntField(term521638, term521638.getClass(), "sourcePosition", 0);
        setField(term521638, term521638.getClass(), "jsType", null);
        setField(term521638, term521638.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term521461;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term521369, args);
        assertTrue(recursiveEquals(term521369, term521683));
        assertTrue(recursiveEquals(term521461, term521684));
        assertTrue(recursiveEquals(retValue, term521638));
    }

};



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

public class PeepholeFoldConstants_optimizeSubtree_1606506993752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169285;
     Object term169371;
     Object term169759;
     Object term169760;
     Object term169652;

    public PeepholeFoldConstants_optimizeSubtree_1606506993752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169285 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term169371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169457 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169371, term169371.getClass(), "type", 33);
        setField(term169457, term169457.getClass(), "next", term169549);
        setField(term169371, term169371.getClass(), "first", term169457);
        term169759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term169759, term169759.getClass(), "currentTraversal", null);
        term169760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169761 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term169760, term169760.getClass(), "functionName", null);
        setBooleanField(term169760, term169760.getClass(), "itsNeedsActivation", false);
        setIntField(term169760, term169760.getClass(), "itsFunctionType", 0);
        setBooleanField(term169760, term169760.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169760, term169760.getClass(), "encodedSourceStart", 0);
        setIntField(term169760, term169760.getClass(), "encodedSourceEnd", 0);
        setField(term169760, term169760.getClass(), "sourceName", null);
        setIntField(term169760, term169760.getClass(), "baseLineno", 0);
        setIntField(term169760, term169760.getClass(), "endLineno", 0);
        setField(term169760, term169760.getClass(), "functions", null);
        setField(term169760, term169760.getClass(), "regexps", null);
        setField(term169760, term169760.getClass(), "itsVariables", null);
        setField(term169760, term169760.getClass(), "itsConst", null);
        setField(term169760, term169760.getClass(), "itsVariableNames", null);
        setIntField(term169760, term169760.getClass(), "varStart", 0);
        setField(term169760, term169760.getClass(), "compilerData", null);
        setIntField(term169760, term169760.getClass(), "type", 33);
        setField(term169760, term169760.getClass(), "next", null);
        setField(term169761, term169761.getClass(), "functionName", null);
        setBooleanField(term169761, term169761.getClass(), "itsNeedsActivation", false);
        setIntField(term169761, term169761.getClass(), "itsFunctionType", 0);
        setBooleanField(term169761, term169761.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169761, term169761.getClass(), "encodedSourceStart", 0);
        setIntField(term169761, term169761.getClass(), "encodedSourceEnd", 0);
        setField(term169761, term169761.getClass(), "sourceName", null);
        setIntField(term169761, term169761.getClass(), "baseLineno", 0);
        setIntField(term169761, term169761.getClass(), "endLineno", 0);
        setField(term169761, term169761.getClass(), "functions", null);
        setField(term169761, term169761.getClass(), "regexps", null);
        setField(term169761, term169761.getClass(), "itsVariables", null);
        setField(term169761, term169761.getClass(), "itsConst", null);
        setField(term169761, term169761.getClass(), "itsVariableNames", null);
        setIntField(term169761, term169761.getClass(), "varStart", 0);
        setField(term169761, term169761.getClass(), "compilerData", null);
        setIntField(term169761, term169761.getClass(), "type", 0);
        setDoubleField(term169762, term169762.getClass(), "number", 0.0);
        setIntField(term169762, term169762.getClass(), "type", 0);
        setField(term169762, term169762.getClass(), "next", null);
        setField(term169762, term169762.getClass(), "first", null);
        setField(term169762, term169762.getClass(), "last", null);
        setField(term169762, term169762.getClass(), "propListHead", null);
        setIntField(term169762, term169762.getClass(), "sourcePosition", 0);
        setField(term169762, term169762.getClass(), "jsType", null);
        setField(term169762, term169762.getClass(), "parent", null);
        setField(term169761, term169761.getClass(), "next", term169762);
        setField(term169761, term169761.getClass(), "first", null);
        setField(term169761, term169761.getClass(), "last", null);
        setField(term169761, term169761.getClass(), "propListHead", null);
        setIntField(term169761, term169761.getClass(), "sourcePosition", 0);
        setField(term169761, term169761.getClass(), "jsType", null);
        setField(term169761, term169761.getClass(), "parent", null);
        setField(term169760, term169760.getClass(), "first", term169761);
        setField(term169760, term169760.getClass(), "last", null);
        setField(term169760, term169760.getClass(), "propListHead", null);
        setIntField(term169760, term169760.getClass(), "sourcePosition", 0);
        setField(term169760, term169760.getClass(), "jsType", null);
        setField(term169760, term169760.getClass(), "parent", null);
        term169652 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169662 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term169652, term169652.getClass(), "functionName", null);
        setBooleanField(term169652, term169652.getClass(), "itsNeedsActivation", false);
        setIntField(term169652, term169652.getClass(), "itsFunctionType", 0);
        setBooleanField(term169652, term169652.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169652, term169652.getClass(), "encodedSourceStart", 0);
        setIntField(term169652, term169652.getClass(), "encodedSourceEnd", 0);
        setField(term169652, term169652.getClass(), "sourceName", null);
        setIntField(term169652, term169652.getClass(), "baseLineno", 0);
        setIntField(term169652, term169652.getClass(), "endLineno", 0);
        setField(term169652, term169652.getClass(), "functions", null);
        setField(term169652, term169652.getClass(), "regexps", null);
        setField(term169652, term169652.getClass(), "itsVariables", null);
        setField(term169652, term169652.getClass(), "itsConst", null);
        setField(term169652, term169652.getClass(), "itsVariableNames", null);
        setIntField(term169652, term169652.getClass(), "varStart", 0);
        setField(term169652, term169652.getClass(), "compilerData", null);
        setIntField(term169652, term169652.getClass(), "type", 33);
        setField(term169652, term169652.getClass(), "next", null);
        setField(term169662, term169662.getClass(), "functionName", null);
        setBooleanField(term169662, term169662.getClass(), "itsNeedsActivation", false);
        setIntField(term169662, term169662.getClass(), "itsFunctionType", 0);
        setBooleanField(term169662, term169662.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169662, term169662.getClass(), "encodedSourceStart", 0);
        setIntField(term169662, term169662.getClass(), "encodedSourceEnd", 0);
        setField(term169662, term169662.getClass(), "sourceName", null);
        setIntField(term169662, term169662.getClass(), "baseLineno", 0);
        setIntField(term169662, term169662.getClass(), "endLineno", 0);
        setField(term169662, term169662.getClass(), "functions", null);
        setField(term169662, term169662.getClass(), "regexps", null);
        setField(term169662, term169662.getClass(), "itsVariables", null);
        setField(term169662, term169662.getClass(), "itsConst", null);
        setField(term169662, term169662.getClass(), "itsVariableNames", null);
        setIntField(term169662, term169662.getClass(), "varStart", 0);
        setField(term169662, term169662.getClass(), "compilerData", null);
        setIntField(term169662, term169662.getClass(), "type", 0);
        setDoubleField(term169672, term169672.getClass(), "number", 0.0);
        setIntField(term169672, term169672.getClass(), "type", 0);
        setField(term169672, term169672.getClass(), "next", null);
        setField(term169672, term169672.getClass(), "first", null);
        setField(term169672, term169672.getClass(), "last", null);
        setField(term169672, term169672.getClass(), "propListHead", null);
        setIntField(term169672, term169672.getClass(), "sourcePosition", 0);
        setField(term169672, term169672.getClass(), "jsType", null);
        setField(term169672, term169672.getClass(), "parent", null);
        setField(term169662, term169662.getClass(), "next", term169672);
        setField(term169662, term169662.getClass(), "first", null);
        setField(term169662, term169662.getClass(), "last", null);
        setField(term169662, term169662.getClass(), "propListHead", null);
        setIntField(term169662, term169662.getClass(), "sourcePosition", 0);
        setField(term169662, term169662.getClass(), "jsType", null);
        setField(term169662, term169662.getClass(), "parent", null);
        setField(term169652, term169652.getClass(), "first", term169662);
        setField(term169652, term169652.getClass(), "last", null);
        setField(term169652, term169652.getClass(), "propListHead", null);
        setIntField(term169652, term169652.getClass(), "sourcePosition", 0);
        setField(term169652, term169652.getClass(), "jsType", null);
        setField(term169652, term169652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term169371;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term169285, args);
        assertTrue(recursiveEquals(term169285, term169759));
        assertTrue(recursiveEquals(term169371, term169760));
        assertTrue(recursiveEquals(retValue, term169652));
    }

};



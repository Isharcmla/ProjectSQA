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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738115;
     Object term738207;
     Object term738584;
     Object term738585;
     Object term738498;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738115 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term738207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term738293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738383 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term738293, term738293.getClass(), "next", term738383);
        setIntField(term738293, term738293.getClass(), "type", 0);
        setField(term738207, term738207.getClass(), "first", term738293);
        setIntField(term738207, term738207.getClass(), "type", 100);
        setField(term738207, term738207.getClass(), "parent", null);
        term738584 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term738584, term738584.getClass(), "currentTraversal", null);
        term738585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term738586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738587 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term738585, term738585.getClass(), "number", 0.0);
        setIntField(term738585, term738585.getClass(), "type", 100);
        setField(term738585, term738585.getClass(), "next", null);
        setField(term738586, term738586.getClass(), "functionName", null);
        setBooleanField(term738586, term738586.getClass(), "itsNeedsActivation", false);
        setIntField(term738586, term738586.getClass(), "itsFunctionType", 0);
        setBooleanField(term738586, term738586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738586, term738586.getClass(), "encodedSourceStart", 0);
        setIntField(term738586, term738586.getClass(), "encodedSourceEnd", 0);
        setField(term738586, term738586.getClass(), "sourceName", null);
        setIntField(term738586, term738586.getClass(), "baseLineno", 0);
        setIntField(term738586, term738586.getClass(), "endLineno", 0);
        setField(term738586, term738586.getClass(), "functions", null);
        setField(term738586, term738586.getClass(), "regexps", null);
        setField(term738586, term738586.getClass(), "itsVariables", null);
        setField(term738586, term738586.getClass(), "itsConst", null);
        setField(term738586, term738586.getClass(), "itsVariableNames", null);
        setIntField(term738586, term738586.getClass(), "varStart", 0);
        setField(term738586, term738586.getClass(), "compilerData", null);
        setIntField(term738586, term738586.getClass(), "type", 0);
        setIntField(term738587, term738587.getClass(), "encodedSourceStart", 0);
        setIntField(term738587, term738587.getClass(), "encodedSourceEnd", 0);
        setField(term738587, term738587.getClass(), "sourceName", null);
        setIntField(term738587, term738587.getClass(), "baseLineno", 0);
        setIntField(term738587, term738587.getClass(), "endLineno", 0);
        setField(term738587, term738587.getClass(), "functions", null);
        setField(term738587, term738587.getClass(), "regexps", null);
        setField(term738587, term738587.getClass(), "itsVariables", null);
        setField(term738587, term738587.getClass(), "itsConst", null);
        setField(term738587, term738587.getClass(), "itsVariableNames", null);
        setIntField(term738587, term738587.getClass(), "varStart", 0);
        setField(term738587, term738587.getClass(), "compilerData", null);
        setIntField(term738587, term738587.getClass(), "type", 0);
        setField(term738587, term738587.getClass(), "next", null);
        setField(term738587, term738587.getClass(), "first", null);
        setField(term738587, term738587.getClass(), "last", null);
        setField(term738587, term738587.getClass(), "propListHead", null);
        setIntField(term738587, term738587.getClass(), "sourcePosition", 0);
        setField(term738587, term738587.getClass(), "jsType", null);
        setField(term738587, term738587.getClass(), "parent", null);
        setField(term738586, term738586.getClass(), "next", term738587);
        setField(term738586, term738586.getClass(), "first", null);
        setField(term738586, term738586.getClass(), "last", null);
        setField(term738586, term738586.getClass(), "propListHead", null);
        setIntField(term738586, term738586.getClass(), "sourcePosition", 0);
        setField(term738586, term738586.getClass(), "jsType", null);
        setField(term738586, term738586.getClass(), "parent", null);
        setField(term738585, term738585.getClass(), "first", term738586);
        setField(term738585, term738585.getClass(), "last", null);
        setField(term738585, term738585.getClass(), "propListHead", null);
        setIntField(term738585, term738585.getClass(), "sourcePosition", 0);
        setField(term738585, term738585.getClass(), "jsType", null);
        setField(term738585, term738585.getClass(), "parent", null);
        term738498 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term738501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738511 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term738498, term738498.getClass(), "number", 0.0);
        setIntField(term738498, term738498.getClass(), "type", 100);
        setField(term738498, term738498.getClass(), "next", null);
        setField(term738501, term738501.getClass(), "functionName", null);
        setBooleanField(term738501, term738501.getClass(), "itsNeedsActivation", false);
        setIntField(term738501, term738501.getClass(), "itsFunctionType", 0);
        setBooleanField(term738501, term738501.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738501, term738501.getClass(), "encodedSourceStart", 0);
        setIntField(term738501, term738501.getClass(), "encodedSourceEnd", 0);
        setField(term738501, term738501.getClass(), "sourceName", null);
        setIntField(term738501, term738501.getClass(), "baseLineno", 0);
        setIntField(term738501, term738501.getClass(), "endLineno", 0);
        setField(term738501, term738501.getClass(), "functions", null);
        setField(term738501, term738501.getClass(), "regexps", null);
        setField(term738501, term738501.getClass(), "itsVariables", null);
        setField(term738501, term738501.getClass(), "itsConst", null);
        setField(term738501, term738501.getClass(), "itsVariableNames", null);
        setIntField(term738501, term738501.getClass(), "varStart", 0);
        setField(term738501, term738501.getClass(), "compilerData", null);
        setIntField(term738501, term738501.getClass(), "type", 0);
        setIntField(term738511, term738511.getClass(), "encodedSourceStart", 0);
        setIntField(term738511, term738511.getClass(), "encodedSourceEnd", 0);
        setField(term738511, term738511.getClass(), "sourceName", null);
        setIntField(term738511, term738511.getClass(), "baseLineno", 0);
        setIntField(term738511, term738511.getClass(), "endLineno", 0);
        setField(term738511, term738511.getClass(), "functions", null);
        setField(term738511, term738511.getClass(), "regexps", null);
        setField(term738511, term738511.getClass(), "itsVariables", null);
        setField(term738511, term738511.getClass(), "itsConst", null);
        setField(term738511, term738511.getClass(), "itsVariableNames", null);
        setIntField(term738511, term738511.getClass(), "varStart", 0);
        setField(term738511, term738511.getClass(), "compilerData", null);
        setIntField(term738511, term738511.getClass(), "type", 0);
        setField(term738511, term738511.getClass(), "next", null);
        setField(term738511, term738511.getClass(), "first", null);
        setField(term738511, term738511.getClass(), "last", null);
        setField(term738511, term738511.getClass(), "propListHead", null);
        setIntField(term738511, term738511.getClass(), "sourcePosition", 0);
        setField(term738511, term738511.getClass(), "jsType", null);
        setField(term738511, term738511.getClass(), "parent", null);
        setField(term738501, term738501.getClass(), "next", term738511);
        setField(term738501, term738501.getClass(), "first", null);
        setField(term738501, term738501.getClass(), "last", null);
        setField(term738501, term738501.getClass(), "propListHead", null);
        setIntField(term738501, term738501.getClass(), "sourcePosition", 0);
        setField(term738501, term738501.getClass(), "jsType", null);
        setField(term738501, term738501.getClass(), "parent", null);
        setField(term738498, term738498.getClass(), "first", term738501);
        setField(term738498, term738498.getClass(), "last", null);
        setField(term738498, term738498.getClass(), "propListHead", null);
        setIntField(term738498, term738498.getClass(), "sourcePosition", 0);
        setField(term738498, term738498.getClass(), "jsType", null);
        setField(term738498, term738498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term738207;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term738115, args);
        assertTrue(recursiveEquals(term738115, term738584));
        assertTrue(recursiveEquals(term738207, term738585));
        assertTrue(recursiveEquals(retValue, term738498));
    }

};



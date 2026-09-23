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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431284;
     Object term431374;
     Object term431686;
     Object term431687;
     Object term431631;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431284 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term431374 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term431460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term431552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term431460, term431460.getClass(), "next", term431552);
        setIntField(term431460, term431460.getClass(), "type", 39);
        setField(term431374, term431374.getClass(), "first", term431460);
        setIntField(term431374, term431374.getClass(), "type", 24);
        term431686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term431686, term431686.getClass(), "currentTraversal", null);
        term431687 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term431688 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term431689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431687, term431687.getClass(), "encodedSourceStart", 0);
        setIntField(term431687, term431687.getClass(), "encodedSourceEnd", 0);
        setField(term431687, term431687.getClass(), "sourceName", null);
        setIntField(term431687, term431687.getClass(), "baseLineno", 0);
        setIntField(term431687, term431687.getClass(), "endLineno", 0);
        setField(term431687, term431687.getClass(), "functions", null);
        setField(term431687, term431687.getClass(), "regexps", null);
        setField(term431687, term431687.getClass(), "itsVariables", null);
        setField(term431687, term431687.getClass(), "itsConst", null);
        setField(term431687, term431687.getClass(), "itsVariableNames", null);
        setIntField(term431687, term431687.getClass(), "varStart", 0);
        setField(term431687, term431687.getClass(), "compilerData", null);
        setIntField(term431687, term431687.getClass(), "type", 24);
        setField(term431687, term431687.getClass(), "next", null);
        setField(term431688, term431688.getClass(), "functionName", null);
        setBooleanField(term431688, term431688.getClass(), "itsNeedsActivation", false);
        setIntField(term431688, term431688.getClass(), "itsFunctionType", 0);
        setBooleanField(term431688, term431688.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term431688, term431688.getClass(), "encodedSourceStart", 0);
        setIntField(term431688, term431688.getClass(), "encodedSourceEnd", 0);
        setField(term431688, term431688.getClass(), "sourceName", null);
        setIntField(term431688, term431688.getClass(), "baseLineno", 0);
        setIntField(term431688, term431688.getClass(), "endLineno", 0);
        setField(term431688, term431688.getClass(), "functions", null);
        setField(term431688, term431688.getClass(), "regexps", null);
        setField(term431688, term431688.getClass(), "itsVariables", null);
        setField(term431688, term431688.getClass(), "itsConst", null);
        setField(term431688, term431688.getClass(), "itsVariableNames", null);
        setIntField(term431688, term431688.getClass(), "varStart", 0);
        setField(term431688, term431688.getClass(), "compilerData", null);
        setIntField(term431688, term431688.getClass(), "type", 39);
        setField(term431689, term431689.getClass(), "str", null);
        setIntField(term431689, term431689.getClass(), "type", 0);
        setField(term431689, term431689.getClass(), "next", null);
        setField(term431689, term431689.getClass(), "first", null);
        setField(term431689, term431689.getClass(), "last", null);
        setField(term431689, term431689.getClass(), "propListHead", null);
        setIntField(term431689, term431689.getClass(), "sourcePosition", 0);
        setField(term431689, term431689.getClass(), "jsType", null);
        setField(term431689, term431689.getClass(), "parent", null);
        setField(term431688, term431688.getClass(), "next", term431689);
        setField(term431688, term431688.getClass(), "first", null);
        setField(term431688, term431688.getClass(), "last", null);
        setField(term431688, term431688.getClass(), "propListHead", null);
        setIntField(term431688, term431688.getClass(), "sourcePosition", 0);
        setField(term431688, term431688.getClass(), "jsType", null);
        setField(term431688, term431688.getClass(), "parent", null);
        setField(term431687, term431687.getClass(), "first", term431688);
        setField(term431687, term431687.getClass(), "last", null);
        setField(term431687, term431687.getClass(), "propListHead", null);
        setIntField(term431687, term431687.getClass(), "sourcePosition", 0);
        setField(term431687, term431687.getClass(), "jsType", null);
        setField(term431687, term431687.getClass(), "parent", null);
        term431631 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term431638 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term431648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431631, term431631.getClass(), "encodedSourceStart", 0);
        setIntField(term431631, term431631.getClass(), "encodedSourceEnd", 0);
        setField(term431631, term431631.getClass(), "sourceName", null);
        setIntField(term431631, term431631.getClass(), "baseLineno", 0);
        setIntField(term431631, term431631.getClass(), "endLineno", 0);
        setField(term431631, term431631.getClass(), "functions", null);
        setField(term431631, term431631.getClass(), "regexps", null);
        setField(term431631, term431631.getClass(), "itsVariables", null);
        setField(term431631, term431631.getClass(), "itsConst", null);
        setField(term431631, term431631.getClass(), "itsVariableNames", null);
        setIntField(term431631, term431631.getClass(), "varStart", 0);
        setField(term431631, term431631.getClass(), "compilerData", null);
        setIntField(term431631, term431631.getClass(), "type", 24);
        setField(term431631, term431631.getClass(), "next", null);
        setField(term431638, term431638.getClass(), "functionName", null);
        setBooleanField(term431638, term431638.getClass(), "itsNeedsActivation", false);
        setIntField(term431638, term431638.getClass(), "itsFunctionType", 0);
        setBooleanField(term431638, term431638.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term431638, term431638.getClass(), "encodedSourceStart", 0);
        setIntField(term431638, term431638.getClass(), "encodedSourceEnd", 0);
        setField(term431638, term431638.getClass(), "sourceName", null);
        setIntField(term431638, term431638.getClass(), "baseLineno", 0);
        setIntField(term431638, term431638.getClass(), "endLineno", 0);
        setField(term431638, term431638.getClass(), "functions", null);
        setField(term431638, term431638.getClass(), "regexps", null);
        setField(term431638, term431638.getClass(), "itsVariables", null);
        setField(term431638, term431638.getClass(), "itsConst", null);
        setField(term431638, term431638.getClass(), "itsVariableNames", null);
        setIntField(term431638, term431638.getClass(), "varStart", 0);
        setField(term431638, term431638.getClass(), "compilerData", null);
        setIntField(term431638, term431638.getClass(), "type", 39);
        setField(term431648, term431648.getClass(), "str", null);
        setIntField(term431648, term431648.getClass(), "type", 0);
        setField(term431648, term431648.getClass(), "next", null);
        setField(term431648, term431648.getClass(), "first", null);
        setField(term431648, term431648.getClass(), "last", null);
        setField(term431648, term431648.getClass(), "propListHead", null);
        setIntField(term431648, term431648.getClass(), "sourcePosition", 0);
        setField(term431648, term431648.getClass(), "jsType", null);
        setField(term431648, term431648.getClass(), "parent", null);
        setField(term431638, term431638.getClass(), "next", term431648);
        setField(term431638, term431638.getClass(), "first", null);
        setField(term431638, term431638.getClass(), "last", null);
        setField(term431638, term431638.getClass(), "propListHead", null);
        setIntField(term431638, term431638.getClass(), "sourcePosition", 0);
        setField(term431638, term431638.getClass(), "jsType", null);
        setField(term431638, term431638.getClass(), "parent", null);
        setField(term431631, term431631.getClass(), "first", term431638);
        setField(term431631, term431631.getClass(), "last", null);
        setField(term431631, term431631.getClass(), "propListHead", null);
        setIntField(term431631, term431631.getClass(), "sourcePosition", 0);
        setField(term431631, term431631.getClass(), "jsType", null);
        setField(term431631, term431631.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term431374;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term431284, args);
        assertTrue(recursiveEquals(term431284, term431686));
        assertTrue(recursiveEquals(term431374, term431687));
        assertTrue(recursiveEquals(retValue, term431631));
    }

};



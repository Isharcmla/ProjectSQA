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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527403;
     Object term527495;
     Object term528196;
     Object term528197;
     Object term528109;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527403 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term527495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term527585 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term527671 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term527585, term527585.getClass(), "next", term527671);
        setIntField(term527585, term527585.getClass(), "type", 0);
        setField(term527495, term527495.getClass(), "first", term527585);
        setIntField(term527495, term527495.getClass(), "type", 100);
        setField(term527495, term527495.getClass(), "parent", null);
        term528196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term528196, term528196.getClass(), "currentTraversal", null);
        term528197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term528198 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term528199 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term528197, term528197.getClass(), "str", null);
        setIntField(term528197, term528197.getClass(), "type", 100);
        setField(term528197, term528197.getClass(), "next", null);
        setIntField(term528198, term528198.getClass(), "encodedSourceStart", 0);
        setIntField(term528198, term528198.getClass(), "encodedSourceEnd", 0);
        setField(term528198, term528198.getClass(), "sourceName", null);
        setIntField(term528198, term528198.getClass(), "baseLineno", 0);
        setIntField(term528198, term528198.getClass(), "endLineno", 0);
        setField(term528198, term528198.getClass(), "functions", null);
        setField(term528198, term528198.getClass(), "regexps", null);
        setField(term528198, term528198.getClass(), "itsVariables", null);
        setField(term528198, term528198.getClass(), "itsConst", null);
        setField(term528198, term528198.getClass(), "itsVariableNames", null);
        setIntField(term528198, term528198.getClass(), "varStart", 0);
        setField(term528198, term528198.getClass(), "compilerData", null);
        setIntField(term528198, term528198.getClass(), "type", 0);
        setField(term528199, term528199.getClass(), "functionName", null);
        setBooleanField(term528199, term528199.getClass(), "itsNeedsActivation", false);
        setIntField(term528199, term528199.getClass(), "itsFunctionType", 0);
        setBooleanField(term528199, term528199.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528199, term528199.getClass(), "encodedSourceStart", 0);
        setIntField(term528199, term528199.getClass(), "encodedSourceEnd", 0);
        setField(term528199, term528199.getClass(), "sourceName", null);
        setIntField(term528199, term528199.getClass(), "baseLineno", 0);
        setIntField(term528199, term528199.getClass(), "endLineno", 0);
        setField(term528199, term528199.getClass(), "functions", null);
        setField(term528199, term528199.getClass(), "regexps", null);
        setField(term528199, term528199.getClass(), "itsVariables", null);
        setField(term528199, term528199.getClass(), "itsConst", null);
        setField(term528199, term528199.getClass(), "itsVariableNames", null);
        setIntField(term528199, term528199.getClass(), "varStart", 0);
        setField(term528199, term528199.getClass(), "compilerData", null);
        setIntField(term528199, term528199.getClass(), "type", 0);
        setField(term528199, term528199.getClass(), "next", null);
        setField(term528199, term528199.getClass(), "first", null);
        setField(term528199, term528199.getClass(), "last", null);
        setField(term528199, term528199.getClass(), "propListHead", null);
        setIntField(term528199, term528199.getClass(), "sourcePosition", 0);
        setField(term528199, term528199.getClass(), "jsType", null);
        setField(term528199, term528199.getClass(), "parent", null);
        setField(term528198, term528198.getClass(), "next", term528199);
        setField(term528198, term528198.getClass(), "first", null);
        setField(term528198, term528198.getClass(), "last", null);
        setField(term528198, term528198.getClass(), "propListHead", null);
        setIntField(term528198, term528198.getClass(), "sourcePosition", 0);
        setField(term528198, term528198.getClass(), "jsType", null);
        setField(term528198, term528198.getClass(), "parent", null);
        setField(term528197, term528197.getClass(), "first", term528198);
        setField(term528197, term528197.getClass(), "last", null);
        setField(term528197, term528197.getClass(), "propListHead", null);
        setIntField(term528197, term528197.getClass(), "sourcePosition", 0);
        setField(term528197, term528197.getClass(), "jsType", null);
        setField(term528197, term528197.getClass(), "parent", null);
        term528109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term528111 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term528118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term528109, term528109.getClass(), "str", null);
        setIntField(term528109, term528109.getClass(), "type", 100);
        setField(term528109, term528109.getClass(), "next", null);
        setIntField(term528111, term528111.getClass(), "encodedSourceStart", 0);
        setIntField(term528111, term528111.getClass(), "encodedSourceEnd", 0);
        setField(term528111, term528111.getClass(), "sourceName", null);
        setIntField(term528111, term528111.getClass(), "baseLineno", 0);
        setIntField(term528111, term528111.getClass(), "endLineno", 0);
        setField(term528111, term528111.getClass(), "functions", null);
        setField(term528111, term528111.getClass(), "regexps", null);
        setField(term528111, term528111.getClass(), "itsVariables", null);
        setField(term528111, term528111.getClass(), "itsConst", null);
        setField(term528111, term528111.getClass(), "itsVariableNames", null);
        setIntField(term528111, term528111.getClass(), "varStart", 0);
        setField(term528111, term528111.getClass(), "compilerData", null);
        setIntField(term528111, term528111.getClass(), "type", 0);
        setField(term528118, term528118.getClass(), "functionName", null);
        setBooleanField(term528118, term528118.getClass(), "itsNeedsActivation", false);
        setIntField(term528118, term528118.getClass(), "itsFunctionType", 0);
        setBooleanField(term528118, term528118.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term528118, term528118.getClass(), "encodedSourceStart", 0);
        setIntField(term528118, term528118.getClass(), "encodedSourceEnd", 0);
        setField(term528118, term528118.getClass(), "sourceName", null);
        setIntField(term528118, term528118.getClass(), "baseLineno", 0);
        setIntField(term528118, term528118.getClass(), "endLineno", 0);
        setField(term528118, term528118.getClass(), "functions", null);
        setField(term528118, term528118.getClass(), "regexps", null);
        setField(term528118, term528118.getClass(), "itsVariables", null);
        setField(term528118, term528118.getClass(), "itsConst", null);
        setField(term528118, term528118.getClass(), "itsVariableNames", null);
        setIntField(term528118, term528118.getClass(), "varStart", 0);
        setField(term528118, term528118.getClass(), "compilerData", null);
        setIntField(term528118, term528118.getClass(), "type", 0);
        setField(term528118, term528118.getClass(), "next", null);
        setField(term528118, term528118.getClass(), "first", null);
        setField(term528118, term528118.getClass(), "last", null);
        setField(term528118, term528118.getClass(), "propListHead", null);
        setIntField(term528118, term528118.getClass(), "sourcePosition", 0);
        setField(term528118, term528118.getClass(), "jsType", null);
        setField(term528118, term528118.getClass(), "parent", null);
        setField(term528111, term528111.getClass(), "next", term528118);
        setField(term528111, term528111.getClass(), "first", null);
        setField(term528111, term528111.getClass(), "last", null);
        setField(term528111, term528111.getClass(), "propListHead", null);
        setIntField(term528111, term528111.getClass(), "sourcePosition", 0);
        setField(term528111, term528111.getClass(), "jsType", null);
        setField(term528111, term528111.getClass(), "parent", null);
        setField(term528109, term528109.getClass(), "first", term528111);
        setField(term528109, term528109.getClass(), "last", null);
        setField(term528109, term528109.getClass(), "propListHead", null);
        setIntField(term528109, term528109.getClass(), "sourcePosition", 0);
        setField(term528109, term528109.getClass(), "jsType", null);
        setField(term528109, term528109.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term527495;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term527403, args);
        assertTrue(recursiveEquals(term527403, term528196));
        assertTrue(recursiveEquals(term527495, term528197));
        assertTrue(recursiveEquals(retValue, term528109));
    }

};



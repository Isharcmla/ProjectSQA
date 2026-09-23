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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299744;
     Object term299836;
     Object term300330;
     Object term300331;
     Object term300285;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term299836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term299922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term299992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term299922, term299922.getClass(), "next", term299992);
        setField(term299836, term299836.getClass(), "first", term299922);
        setIntField(term299836, term299836.getClass(), "type", 24);
        term300330 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term300330, term300330.getClass(), "currentTraversal", null);
        term300331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term300331, term300331.getClass(), "number", 0.0);
        setIntField(term300331, term300331.getClass(), "type", 24);
        setField(term300331, term300331.getClass(), "next", null);
        setField(term300332, term300332.getClass(), "functionName", null);
        setBooleanField(term300332, term300332.getClass(), "itsNeedsActivation", false);
        setIntField(term300332, term300332.getClass(), "itsFunctionType", 0);
        setBooleanField(term300332, term300332.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300332, term300332.getClass(), "encodedSourceStart", 0);
        setIntField(term300332, term300332.getClass(), "encodedSourceEnd", 0);
        setField(term300332, term300332.getClass(), "sourceName", null);
        setIntField(term300332, term300332.getClass(), "baseLineno", 0);
        setIntField(term300332, term300332.getClass(), "endLineno", 0);
        setField(term300332, term300332.getClass(), "functions", null);
        setField(term300332, term300332.getClass(), "regexps", null);
        setField(term300332, term300332.getClass(), "itsVariables", null);
        setField(term300332, term300332.getClass(), "itsConst", null);
        setField(term300332, term300332.getClass(), "itsVariableNames", null);
        setIntField(term300332, term300332.getClass(), "varStart", 0);
        setField(term300332, term300332.getClass(), "compilerData", null);
        setIntField(term300332, term300332.getClass(), "type", 0);
        setIntField(term300333, term300333.getClass(), "type", 0);
        setField(term300333, term300333.getClass(), "next", null);
        setField(term300333, term300333.getClass(), "first", null);
        setField(term300333, term300333.getClass(), "last", null);
        setField(term300333, term300333.getClass(), "propListHead", null);
        setIntField(term300333, term300333.getClass(), "sourcePosition", 0);
        setField(term300333, term300333.getClass(), "jsType", null);
        setField(term300333, term300333.getClass(), "parent", null);
        setField(term300332, term300332.getClass(), "next", term300333);
        setField(term300332, term300332.getClass(), "first", null);
        setField(term300332, term300332.getClass(), "last", null);
        setField(term300332, term300332.getClass(), "propListHead", null);
        setIntField(term300332, term300332.getClass(), "sourcePosition", 0);
        setField(term300332, term300332.getClass(), "jsType", null);
        setField(term300332, term300332.getClass(), "parent", null);
        setField(term300331, term300331.getClass(), "first", term300332);
        setField(term300331, term300331.getClass(), "last", null);
        setField(term300331, term300331.getClass(), "propListHead", null);
        setIntField(term300331, term300331.getClass(), "sourcePosition", 0);
        setField(term300331, term300331.getClass(), "jsType", null);
        setField(term300331, term300331.getClass(), "parent", null);
        term300285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300288 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term300298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term300285, term300285.getClass(), "number", 0.0);
        setIntField(term300285, term300285.getClass(), "type", 24);
        setField(term300285, term300285.getClass(), "next", null);
        setField(term300288, term300288.getClass(), "functionName", null);
        setBooleanField(term300288, term300288.getClass(), "itsNeedsActivation", false);
        setIntField(term300288, term300288.getClass(), "itsFunctionType", 0);
        setBooleanField(term300288, term300288.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term300288, term300288.getClass(), "encodedSourceStart", 0);
        setIntField(term300288, term300288.getClass(), "encodedSourceEnd", 0);
        setField(term300288, term300288.getClass(), "sourceName", null);
        setIntField(term300288, term300288.getClass(), "baseLineno", 0);
        setIntField(term300288, term300288.getClass(), "endLineno", 0);
        setField(term300288, term300288.getClass(), "functions", null);
        setField(term300288, term300288.getClass(), "regexps", null);
        setField(term300288, term300288.getClass(), "itsVariables", null);
        setField(term300288, term300288.getClass(), "itsConst", null);
        setField(term300288, term300288.getClass(), "itsVariableNames", null);
        setIntField(term300288, term300288.getClass(), "varStart", 0);
        setField(term300288, term300288.getClass(), "compilerData", null);
        setIntField(term300288, term300288.getClass(), "type", 0);
        setIntField(term300298, term300298.getClass(), "type", 0);
        setField(term300298, term300298.getClass(), "next", null);
        setField(term300298, term300298.getClass(), "first", null);
        setField(term300298, term300298.getClass(), "last", null);
        setField(term300298, term300298.getClass(), "propListHead", null);
        setIntField(term300298, term300298.getClass(), "sourcePosition", 0);
        setField(term300298, term300298.getClass(), "jsType", null);
        setField(term300298, term300298.getClass(), "parent", null);
        setField(term300288, term300288.getClass(), "next", term300298);
        setField(term300288, term300288.getClass(), "first", null);
        setField(term300288, term300288.getClass(), "last", null);
        setField(term300288, term300288.getClass(), "propListHead", null);
        setIntField(term300288, term300288.getClass(), "sourcePosition", 0);
        setField(term300288, term300288.getClass(), "jsType", null);
        setField(term300288, term300288.getClass(), "parent", null);
        setField(term300285, term300285.getClass(), "first", term300288);
        setField(term300285, term300285.getClass(), "last", null);
        setField(term300285, term300285.getClass(), "propListHead", null);
        setIntField(term300285, term300285.getClass(), "sourcePosition", 0);
        setField(term300285, term300285.getClass(), "jsType", null);
        setField(term300285, term300285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term299836;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term299744, args);
        assertTrue(recursiveEquals(term299744, term300330));
        assertTrue(recursiveEquals(term299836, term300331));
        assertTrue(recursiveEquals(retValue, term300285));
    }

};



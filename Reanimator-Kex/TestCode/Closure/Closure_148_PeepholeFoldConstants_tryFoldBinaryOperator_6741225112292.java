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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630475;
     Object term630567;
     Object term631289;
     Object term631290;
     Object term631179;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term630567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term630657 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term630727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term630813 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term630727, term630727.getClass(), "type", 64);
        setField(term630657, term630657.getClass(), "next", term630727);
        setIntField(term630657, term630657.getClass(), "type", 0);
        setField(term630567, term630567.getClass(), "first", term630657);
        setIntField(term630567, term630567.getClass(), "type", 101);
        setField(term630567, term630567.getClass(), "parent", term630813);
        term631289 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term631289, term631289.getClass(), "currentTraversal", null);
        term631290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term631291 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term631292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term631290, term631290.getClass(), "str", null);
        setIntField(term631290, term631290.getClass(), "type", 101);
        setField(term631290, term631290.getClass(), "next", null);
        setIntField(term631291, term631291.getClass(), "encodedSourceStart", 0);
        setIntField(term631291, term631291.getClass(), "encodedSourceEnd", 0);
        setField(term631291, term631291.getClass(), "sourceName", null);
        setIntField(term631291, term631291.getClass(), "baseLineno", 0);
        setIntField(term631291, term631291.getClass(), "endLineno", 0);
        setField(term631291, term631291.getClass(), "functions", null);
        setField(term631291, term631291.getClass(), "regexps", null);
        setField(term631291, term631291.getClass(), "itsVariables", null);
        setField(term631291, term631291.getClass(), "itsConst", null);
        setField(term631291, term631291.getClass(), "itsVariableNames", null);
        setIntField(term631291, term631291.getClass(), "varStart", 0);
        setField(term631291, term631291.getClass(), "compilerData", null);
        setIntField(term631291, term631291.getClass(), "type", 0);
        setIntField(term631292, term631292.getClass(), "type", 64);
        setField(term631292, term631292.getClass(), "next", null);
        setField(term631292, term631292.getClass(), "first", null);
        setField(term631292, term631292.getClass(), "last", null);
        setField(term631292, term631292.getClass(), "propListHead", null);
        setIntField(term631292, term631292.getClass(), "sourcePosition", 0);
        setField(term631292, term631292.getClass(), "jsType", null);
        setField(term631292, term631292.getClass(), "parent", null);
        setField(term631291, term631291.getClass(), "next", term631292);
        setField(term631291, term631291.getClass(), "first", null);
        setField(term631291, term631291.getClass(), "last", null);
        setField(term631291, term631291.getClass(), "propListHead", null);
        setIntField(term631291, term631291.getClass(), "sourcePosition", 0);
        setField(term631291, term631291.getClass(), "jsType", null);
        setField(term631291, term631291.getClass(), "parent", null);
        setField(term631290, term631290.getClass(), "first", term631291);
        setField(term631290, term631290.getClass(), "last", null);
        setField(term631290, term631290.getClass(), "propListHead", null);
        setIntField(term631290, term631290.getClass(), "sourcePosition", 0);
        setField(term631290, term631290.getClass(), "jsType", null);
        setField(term631293, term631293.getClass(), "functionName", null);
        setBooleanField(term631293, term631293.getClass(), "itsNeedsActivation", false);
        setIntField(term631293, term631293.getClass(), "itsFunctionType", 0);
        setBooleanField(term631293, term631293.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term631293, term631293.getClass(), "encodedSourceStart", 0);
        setIntField(term631293, term631293.getClass(), "encodedSourceEnd", 0);
        setField(term631293, term631293.getClass(), "sourceName", null);
        setIntField(term631293, term631293.getClass(), "baseLineno", 0);
        setIntField(term631293, term631293.getClass(), "endLineno", 0);
        setField(term631293, term631293.getClass(), "functions", null);
        setField(term631293, term631293.getClass(), "regexps", null);
        setField(term631293, term631293.getClass(), "itsVariables", null);
        setField(term631293, term631293.getClass(), "itsConst", null);
        setField(term631293, term631293.getClass(), "itsVariableNames", null);
        setIntField(term631293, term631293.getClass(), "varStart", 0);
        setField(term631293, term631293.getClass(), "compilerData", null);
        setIntField(term631293, term631293.getClass(), "type", 0);
        setField(term631293, term631293.getClass(), "next", null);
        setField(term631293, term631293.getClass(), "first", null);
        setField(term631293, term631293.getClass(), "last", null);
        setField(term631293, term631293.getClass(), "propListHead", null);
        setIntField(term631293, term631293.getClass(), "sourcePosition", 0);
        setField(term631293, term631293.getClass(), "jsType", null);
        setField(term631293, term631293.getClass(), "parent", null);
        setField(term631290, term631290.getClass(), "parent", term631293);
        term631179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term631181 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term631188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term631179, term631179.getClass(), "str", null);
        setIntField(term631179, term631179.getClass(), "type", 101);
        setField(term631179, term631179.getClass(), "next", null);
        setIntField(term631181, term631181.getClass(), "encodedSourceStart", 0);
        setIntField(term631181, term631181.getClass(), "encodedSourceEnd", 0);
        setField(term631181, term631181.getClass(), "sourceName", null);
        setIntField(term631181, term631181.getClass(), "baseLineno", 0);
        setIntField(term631181, term631181.getClass(), "endLineno", 0);
        setField(term631181, term631181.getClass(), "functions", null);
        setField(term631181, term631181.getClass(), "regexps", null);
        setField(term631181, term631181.getClass(), "itsVariables", null);
        setField(term631181, term631181.getClass(), "itsConst", null);
        setField(term631181, term631181.getClass(), "itsVariableNames", null);
        setIntField(term631181, term631181.getClass(), "varStart", 0);
        setField(term631181, term631181.getClass(), "compilerData", null);
        setIntField(term631181, term631181.getClass(), "type", 0);
        setIntField(term631188, term631188.getClass(), "type", 64);
        setField(term631188, term631188.getClass(), "next", null);
        setField(term631188, term631188.getClass(), "first", null);
        setField(term631188, term631188.getClass(), "last", null);
        setField(term631188, term631188.getClass(), "propListHead", null);
        setIntField(term631188, term631188.getClass(), "sourcePosition", 0);
        setField(term631188, term631188.getClass(), "jsType", null);
        setField(term631188, term631188.getClass(), "parent", null);
        setField(term631181, term631181.getClass(), "next", term631188);
        setField(term631181, term631181.getClass(), "first", null);
        setField(term631181, term631181.getClass(), "last", null);
        setField(term631181, term631181.getClass(), "propListHead", null);
        setIntField(term631181, term631181.getClass(), "sourcePosition", 0);
        setField(term631181, term631181.getClass(), "jsType", null);
        setField(term631181, term631181.getClass(), "parent", null);
        setField(term631179, term631179.getClass(), "first", term631181);
        setField(term631179, term631179.getClass(), "last", null);
        setField(term631179, term631179.getClass(), "propListHead", null);
        setIntField(term631179, term631179.getClass(), "sourcePosition", 0);
        setField(term631179, term631179.getClass(), "jsType", null);
        setField(term631193, term631193.getClass(), "functionName", null);
        setBooleanField(term631193, term631193.getClass(), "itsNeedsActivation", false);
        setIntField(term631193, term631193.getClass(), "itsFunctionType", 0);
        setBooleanField(term631193, term631193.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term631193, term631193.getClass(), "encodedSourceStart", 0);
        setIntField(term631193, term631193.getClass(), "encodedSourceEnd", 0);
        setField(term631193, term631193.getClass(), "sourceName", null);
        setIntField(term631193, term631193.getClass(), "baseLineno", 0);
        setIntField(term631193, term631193.getClass(), "endLineno", 0);
        setField(term631193, term631193.getClass(), "functions", null);
        setField(term631193, term631193.getClass(), "regexps", null);
        setField(term631193, term631193.getClass(), "itsVariables", null);
        setField(term631193, term631193.getClass(), "itsConst", null);
        setField(term631193, term631193.getClass(), "itsVariableNames", null);
        setIntField(term631193, term631193.getClass(), "varStart", 0);
        setField(term631193, term631193.getClass(), "compilerData", null);
        setIntField(term631193, term631193.getClass(), "type", 0);
        setField(term631193, term631193.getClass(), "next", null);
        setField(term631193, term631193.getClass(), "first", null);
        setField(term631193, term631193.getClass(), "last", null);
        setField(term631193, term631193.getClass(), "propListHead", null);
        setIntField(term631193, term631193.getClass(), "sourcePosition", 0);
        setField(term631193, term631193.getClass(), "jsType", null);
        setField(term631193, term631193.getClass(), "parent", null);
        setField(term631179, term631179.getClass(), "parent", term631193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term630567;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term630475, args);
        assertTrue(recursiveEquals(term630475, term631289));
        assertTrue(recursiveEquals(term630567, term631290));
        assertTrue(recursiveEquals(retValue, term631179));
    }

};



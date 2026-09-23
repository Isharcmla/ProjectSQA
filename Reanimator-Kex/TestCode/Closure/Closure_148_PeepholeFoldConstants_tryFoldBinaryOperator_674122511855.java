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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197452;
     Object term197522;
     Object term198261;
     Object term198262;
     Object term198160;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term197522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197748 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term197662, term197662.getClass(), "first", term197748);
        setField(term197592, term197592.getClass(), "next", term197662);
        setField(term197522, term197522.getClass(), "first", term197592);
        setIntField(term197522, term197522.getClass(), "type", 86);
        term198261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term198261, term198261.getClass(), "currentTraversal", null);
        term198262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198265 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term198262, term198262.getClass(), "type", 86);
        setField(term198262, term198262.getClass(), "next", null);
        setIntField(term198263, term198263.getClass(), "type", 0);
        setIntField(term198264, term198264.getClass(), "type", 0);
        setField(term198264, term198264.getClass(), "next", null);
        setField(term198265, term198265.getClass(), "functionName", null);
        setBooleanField(term198265, term198265.getClass(), "itsNeedsActivation", false);
        setIntField(term198265, term198265.getClass(), "itsFunctionType", 0);
        setBooleanField(term198265, term198265.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term198265, term198265.getClass(), "encodedSourceStart", 0);
        setIntField(term198265, term198265.getClass(), "encodedSourceEnd", 0);
        setField(term198265, term198265.getClass(), "sourceName", null);
        setIntField(term198265, term198265.getClass(), "baseLineno", 0);
        setIntField(term198265, term198265.getClass(), "endLineno", 0);
        setField(term198265, term198265.getClass(), "functions", null);
        setField(term198265, term198265.getClass(), "regexps", null);
        setField(term198265, term198265.getClass(), "itsVariables", null);
        setField(term198265, term198265.getClass(), "itsConst", null);
        setField(term198265, term198265.getClass(), "itsVariableNames", null);
        setIntField(term198265, term198265.getClass(), "varStart", 0);
        setField(term198265, term198265.getClass(), "compilerData", null);
        setIntField(term198265, term198265.getClass(), "type", 0);
        setField(term198265, term198265.getClass(), "next", null);
        setField(term198265, term198265.getClass(), "first", null);
        setField(term198265, term198265.getClass(), "last", null);
        setField(term198265, term198265.getClass(), "propListHead", null);
        setIntField(term198265, term198265.getClass(), "sourcePosition", 0);
        setField(term198265, term198265.getClass(), "jsType", null);
        setField(term198265, term198265.getClass(), "parent", null);
        setField(term198264, term198264.getClass(), "first", term198265);
        setField(term198264, term198264.getClass(), "last", null);
        setField(term198264, term198264.getClass(), "propListHead", null);
        setIntField(term198264, term198264.getClass(), "sourcePosition", 0);
        setField(term198264, term198264.getClass(), "jsType", null);
        setField(term198264, term198264.getClass(), "parent", null);
        setField(term198263, term198263.getClass(), "next", term198264);
        setField(term198263, term198263.getClass(), "first", null);
        setField(term198263, term198263.getClass(), "last", null);
        setField(term198263, term198263.getClass(), "propListHead", null);
        setIntField(term198263, term198263.getClass(), "sourcePosition", 0);
        setField(term198263, term198263.getClass(), "jsType", null);
        setField(term198263, term198263.getClass(), "parent", null);
        setField(term198262, term198262.getClass(), "first", term198263);
        setField(term198262, term198262.getClass(), "last", null);
        setField(term198262, term198262.getClass(), "propListHead", null);
        setIntField(term198262, term198262.getClass(), "sourcePosition", 0);
        setField(term198262, term198262.getClass(), "jsType", null);
        setField(term198262, term198262.getClass(), "parent", null);
        term198160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term198160, term198160.getClass(), "type", 86);
        setField(term198160, term198160.getClass(), "next", null);
        setIntField(term198162, term198162.getClass(), "type", 0);
        setIntField(term198164, term198164.getClass(), "type", 0);
        setField(term198164, term198164.getClass(), "next", null);
        setField(term198166, term198166.getClass(), "functionName", null);
        setBooleanField(term198166, term198166.getClass(), "itsNeedsActivation", false);
        setIntField(term198166, term198166.getClass(), "itsFunctionType", 0);
        setBooleanField(term198166, term198166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term198166, term198166.getClass(), "encodedSourceStart", 0);
        setIntField(term198166, term198166.getClass(), "encodedSourceEnd", 0);
        setField(term198166, term198166.getClass(), "sourceName", null);
        setIntField(term198166, term198166.getClass(), "baseLineno", 0);
        setIntField(term198166, term198166.getClass(), "endLineno", 0);
        setField(term198166, term198166.getClass(), "functions", null);
        setField(term198166, term198166.getClass(), "regexps", null);
        setField(term198166, term198166.getClass(), "itsVariables", null);
        setField(term198166, term198166.getClass(), "itsConst", null);
        setField(term198166, term198166.getClass(), "itsVariableNames", null);
        setIntField(term198166, term198166.getClass(), "varStart", 0);
        setField(term198166, term198166.getClass(), "compilerData", null);
        setIntField(term198166, term198166.getClass(), "type", 0);
        setField(term198166, term198166.getClass(), "next", null);
        setField(term198166, term198166.getClass(), "first", null);
        setField(term198166, term198166.getClass(), "last", null);
        setField(term198166, term198166.getClass(), "propListHead", null);
        setIntField(term198166, term198166.getClass(), "sourcePosition", 0);
        setField(term198166, term198166.getClass(), "jsType", null);
        setField(term198166, term198166.getClass(), "parent", null);
        setField(term198164, term198164.getClass(), "first", term198166);
        setField(term198164, term198164.getClass(), "last", null);
        setField(term198164, term198164.getClass(), "propListHead", null);
        setIntField(term198164, term198164.getClass(), "sourcePosition", 0);
        setField(term198164, term198164.getClass(), "jsType", null);
        setField(term198164, term198164.getClass(), "parent", null);
        setField(term198162, term198162.getClass(), "next", term198164);
        setField(term198162, term198162.getClass(), "first", null);
        setField(term198162, term198162.getClass(), "last", null);
        setField(term198162, term198162.getClass(), "propListHead", null);
        setIntField(term198162, term198162.getClass(), "sourcePosition", 0);
        setField(term198162, term198162.getClass(), "jsType", null);
        setField(term198162, term198162.getClass(), "parent", null);
        setField(term198160, term198160.getClass(), "first", term198162);
        setField(term198160, term198160.getClass(), "last", null);
        setField(term198160, term198160.getClass(), "propListHead", null);
        setIntField(term198160, term198160.getClass(), "sourcePosition", 0);
        setField(term198160, term198160.getClass(), "jsType", null);
        setField(term198160, term198160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term197522;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term197452, args);
        assertTrue(recursiveEquals(term197452, term198261));
        assertTrue(recursiveEquals(term197522, term198262));
        assertTrue(recursiveEquals(retValue, term198160));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512941;
     Object term513027;
     Object term513773;
     Object term513774;
     Object term513709;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512941 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term513027 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513113 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term513113, term513113.getClass(), "next", term513205);
        setIntField(term513113, term513113.getClass(), "type", 39);
        setField(term513027, term513027.getClass(), "first", term513113);
        setIntField(term513027, term513027.getClass(), "type", 23);
        term513773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term513773, term513773.getClass(), "currentTraversal", null);
        term513774 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513775 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term513774, term513774.getClass(), "functionName", null);
        setBooleanField(term513774, term513774.getClass(), "itsNeedsActivation", false);
        setIntField(term513774, term513774.getClass(), "itsFunctionType", 0);
        setBooleanField(term513774, term513774.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term513774, term513774.getClass(), "encodedSourceStart", 0);
        setIntField(term513774, term513774.getClass(), "encodedSourceEnd", 0);
        setField(term513774, term513774.getClass(), "sourceName", null);
        setIntField(term513774, term513774.getClass(), "baseLineno", 0);
        setIntField(term513774, term513774.getClass(), "endLineno", 0);
        setField(term513774, term513774.getClass(), "functions", null);
        setField(term513774, term513774.getClass(), "regexps", null);
        setField(term513774, term513774.getClass(), "itsVariables", null);
        setField(term513774, term513774.getClass(), "itsConst", null);
        setField(term513774, term513774.getClass(), "itsVariableNames", null);
        setIntField(term513774, term513774.getClass(), "varStart", 0);
        setField(term513774, term513774.getClass(), "compilerData", null);
        setIntField(term513774, term513774.getClass(), "type", 23);
        setField(term513774, term513774.getClass(), "next", null);
        setField(term513775, term513775.getClass(), "functionName", null);
        setBooleanField(term513775, term513775.getClass(), "itsNeedsActivation", false);
        setIntField(term513775, term513775.getClass(), "itsFunctionType", 0);
        setBooleanField(term513775, term513775.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term513775, term513775.getClass(), "encodedSourceStart", 0);
        setIntField(term513775, term513775.getClass(), "encodedSourceEnd", 0);
        setField(term513775, term513775.getClass(), "sourceName", null);
        setIntField(term513775, term513775.getClass(), "baseLineno", 0);
        setIntField(term513775, term513775.getClass(), "endLineno", 0);
        setField(term513775, term513775.getClass(), "functions", null);
        setField(term513775, term513775.getClass(), "regexps", null);
        setField(term513775, term513775.getClass(), "itsVariables", null);
        setField(term513775, term513775.getClass(), "itsConst", null);
        setField(term513775, term513775.getClass(), "itsVariableNames", null);
        setIntField(term513775, term513775.getClass(), "varStart", 0);
        setField(term513775, term513775.getClass(), "compilerData", null);
        setIntField(term513775, term513775.getClass(), "type", 39);
        setDoubleField(term513776, term513776.getClass(), "number", 0.0);
        setIntField(term513776, term513776.getClass(), "type", 0);
        setField(term513776, term513776.getClass(), "next", null);
        setField(term513776, term513776.getClass(), "first", null);
        setField(term513776, term513776.getClass(), "last", null);
        setField(term513776, term513776.getClass(), "propListHead", null);
        setIntField(term513776, term513776.getClass(), "sourcePosition", 0);
        setField(term513776, term513776.getClass(), "jsType", null);
        setField(term513776, term513776.getClass(), "parent", null);
        setField(term513775, term513775.getClass(), "next", term513776);
        setField(term513775, term513775.getClass(), "first", null);
        setField(term513775, term513775.getClass(), "last", null);
        setField(term513775, term513775.getClass(), "propListHead", null);
        setIntField(term513775, term513775.getClass(), "sourcePosition", 0);
        setField(term513775, term513775.getClass(), "jsType", null);
        setField(term513775, term513775.getClass(), "parent", null);
        setField(term513774, term513774.getClass(), "first", term513775);
        setField(term513774, term513774.getClass(), "last", null);
        setField(term513774, term513774.getClass(), "propListHead", null);
        setIntField(term513774, term513774.getClass(), "sourcePosition", 0);
        setField(term513774, term513774.getClass(), "jsType", null);
        setField(term513774, term513774.getClass(), "parent", null);
        term513709 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term513729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term513709, term513709.getClass(), "functionName", null);
        setBooleanField(term513709, term513709.getClass(), "itsNeedsActivation", false);
        setIntField(term513709, term513709.getClass(), "itsFunctionType", 0);
        setBooleanField(term513709, term513709.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term513709, term513709.getClass(), "encodedSourceStart", 0);
        setIntField(term513709, term513709.getClass(), "encodedSourceEnd", 0);
        setField(term513709, term513709.getClass(), "sourceName", null);
        setIntField(term513709, term513709.getClass(), "baseLineno", 0);
        setIntField(term513709, term513709.getClass(), "endLineno", 0);
        setField(term513709, term513709.getClass(), "functions", null);
        setField(term513709, term513709.getClass(), "regexps", null);
        setField(term513709, term513709.getClass(), "itsVariables", null);
        setField(term513709, term513709.getClass(), "itsConst", null);
        setField(term513709, term513709.getClass(), "itsVariableNames", null);
        setIntField(term513709, term513709.getClass(), "varStart", 0);
        setField(term513709, term513709.getClass(), "compilerData", null);
        setIntField(term513709, term513709.getClass(), "type", 23);
        setField(term513709, term513709.getClass(), "next", null);
        setField(term513719, term513719.getClass(), "functionName", null);
        setBooleanField(term513719, term513719.getClass(), "itsNeedsActivation", false);
        setIntField(term513719, term513719.getClass(), "itsFunctionType", 0);
        setBooleanField(term513719, term513719.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term513719, term513719.getClass(), "encodedSourceStart", 0);
        setIntField(term513719, term513719.getClass(), "encodedSourceEnd", 0);
        setField(term513719, term513719.getClass(), "sourceName", null);
        setIntField(term513719, term513719.getClass(), "baseLineno", 0);
        setIntField(term513719, term513719.getClass(), "endLineno", 0);
        setField(term513719, term513719.getClass(), "functions", null);
        setField(term513719, term513719.getClass(), "regexps", null);
        setField(term513719, term513719.getClass(), "itsVariables", null);
        setField(term513719, term513719.getClass(), "itsConst", null);
        setField(term513719, term513719.getClass(), "itsVariableNames", null);
        setIntField(term513719, term513719.getClass(), "varStart", 0);
        setField(term513719, term513719.getClass(), "compilerData", null);
        setIntField(term513719, term513719.getClass(), "type", 39);
        setDoubleField(term513729, term513729.getClass(), "number", 0.0);
        setIntField(term513729, term513729.getClass(), "type", 0);
        setField(term513729, term513729.getClass(), "next", null);
        setField(term513729, term513729.getClass(), "first", null);
        setField(term513729, term513729.getClass(), "last", null);
        setField(term513729, term513729.getClass(), "propListHead", null);
        setIntField(term513729, term513729.getClass(), "sourcePosition", 0);
        setField(term513729, term513729.getClass(), "jsType", null);
        setField(term513729, term513729.getClass(), "parent", null);
        setField(term513719, term513719.getClass(), "next", term513729);
        setField(term513719, term513719.getClass(), "first", null);
        setField(term513719, term513719.getClass(), "last", null);
        setField(term513719, term513719.getClass(), "propListHead", null);
        setIntField(term513719, term513719.getClass(), "sourcePosition", 0);
        setField(term513719, term513719.getClass(), "jsType", null);
        setField(term513719, term513719.getClass(), "parent", null);
        setField(term513709, term513709.getClass(), "first", term513719);
        setField(term513709, term513709.getClass(), "last", null);
        setField(term513709, term513709.getClass(), "propListHead", null);
        setIntField(term513709, term513709.getClass(), "sourcePosition", 0);
        setField(term513709, term513709.getClass(), "jsType", null);
        setField(term513709, term513709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term513027;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term512941, args);
        assertTrue(recursiveEquals(term512941, term513773));
        assertTrue(recursiveEquals(term513027, term513774));
        assertTrue(recursiveEquals(retValue, term513709));
    }

};



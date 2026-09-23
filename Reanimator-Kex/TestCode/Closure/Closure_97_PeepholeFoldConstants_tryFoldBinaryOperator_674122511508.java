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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135798;
     Object term135884;
     Object term136239;
     Object term136240;
     Object term136174;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135798 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term135884 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term135970 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term135970, term135970.getClass(), "next", term136040);
        setField(term135884, term135884.getClass(), "first", term135970);
        setIntField(term135884, term135884.getClass(), "type", 9);
        term136239 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term136239, term136239.getClass(), "currentTraversal", null);
        term136240 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136240, term136240.getClass(), "functionName", null);
        setBooleanField(term136240, term136240.getClass(), "itsNeedsActivation", false);
        setIntField(term136240, term136240.getClass(), "itsFunctionType", 0);
        setBooleanField(term136240, term136240.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136240, term136240.getClass(), "encodedSourceStart", 0);
        setIntField(term136240, term136240.getClass(), "encodedSourceEnd", 0);
        setField(term136240, term136240.getClass(), "sourceName", null);
        setIntField(term136240, term136240.getClass(), "baseLineno", 0);
        setIntField(term136240, term136240.getClass(), "endLineno", 0);
        setField(term136240, term136240.getClass(), "functions", null);
        setField(term136240, term136240.getClass(), "regexps", null);
        setField(term136240, term136240.getClass(), "itsVariables", null);
        setField(term136240, term136240.getClass(), "itsConst", null);
        setField(term136240, term136240.getClass(), "itsVariableNames", null);
        setIntField(term136240, term136240.getClass(), "varStart", 0);
        setField(term136240, term136240.getClass(), "compilerData", null);
        setIntField(term136240, term136240.getClass(), "type", 9);
        setField(term136240, term136240.getClass(), "next", null);
        setField(term136241, term136241.getClass(), "functionName", null);
        setBooleanField(term136241, term136241.getClass(), "itsNeedsActivation", false);
        setIntField(term136241, term136241.getClass(), "itsFunctionType", 0);
        setBooleanField(term136241, term136241.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136241, term136241.getClass(), "encodedSourceStart", 0);
        setIntField(term136241, term136241.getClass(), "encodedSourceEnd", 0);
        setField(term136241, term136241.getClass(), "sourceName", null);
        setIntField(term136241, term136241.getClass(), "baseLineno", 0);
        setIntField(term136241, term136241.getClass(), "endLineno", 0);
        setField(term136241, term136241.getClass(), "functions", null);
        setField(term136241, term136241.getClass(), "regexps", null);
        setField(term136241, term136241.getClass(), "itsVariables", null);
        setField(term136241, term136241.getClass(), "itsConst", null);
        setField(term136241, term136241.getClass(), "itsVariableNames", null);
        setIntField(term136241, term136241.getClass(), "varStart", 0);
        setField(term136241, term136241.getClass(), "compilerData", null);
        setIntField(term136241, term136241.getClass(), "type", 0);
        setIntField(term136242, term136242.getClass(), "type", 0);
        setField(term136242, term136242.getClass(), "next", null);
        setField(term136242, term136242.getClass(), "first", null);
        setField(term136242, term136242.getClass(), "last", null);
        setField(term136242, term136242.getClass(), "propListHead", null);
        setIntField(term136242, term136242.getClass(), "sourcePosition", 0);
        setField(term136242, term136242.getClass(), "jsType", null);
        setField(term136242, term136242.getClass(), "parent", null);
        setField(term136241, term136241.getClass(), "next", term136242);
        setField(term136241, term136241.getClass(), "first", null);
        setField(term136241, term136241.getClass(), "last", null);
        setField(term136241, term136241.getClass(), "propListHead", null);
        setIntField(term136241, term136241.getClass(), "sourcePosition", 0);
        setField(term136241, term136241.getClass(), "jsType", null);
        setField(term136241, term136241.getClass(), "parent", null);
        setField(term136240, term136240.getClass(), "first", term136241);
        setField(term136240, term136240.getClass(), "last", null);
        setField(term136240, term136240.getClass(), "propListHead", null);
        setIntField(term136240, term136240.getClass(), "sourcePosition", 0);
        setField(term136240, term136240.getClass(), "jsType", null);
        setField(term136240, term136240.getClass(), "parent", null);
        term136174 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term136194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term136174, term136174.getClass(), "functionName", null);
        setBooleanField(term136174, term136174.getClass(), "itsNeedsActivation", false);
        setIntField(term136174, term136174.getClass(), "itsFunctionType", 0);
        setBooleanField(term136174, term136174.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136174, term136174.getClass(), "encodedSourceStart", 0);
        setIntField(term136174, term136174.getClass(), "encodedSourceEnd", 0);
        setField(term136174, term136174.getClass(), "sourceName", null);
        setIntField(term136174, term136174.getClass(), "baseLineno", 0);
        setIntField(term136174, term136174.getClass(), "endLineno", 0);
        setField(term136174, term136174.getClass(), "functions", null);
        setField(term136174, term136174.getClass(), "regexps", null);
        setField(term136174, term136174.getClass(), "itsVariables", null);
        setField(term136174, term136174.getClass(), "itsConst", null);
        setField(term136174, term136174.getClass(), "itsVariableNames", null);
        setIntField(term136174, term136174.getClass(), "varStart", 0);
        setField(term136174, term136174.getClass(), "compilerData", null);
        setIntField(term136174, term136174.getClass(), "type", 9);
        setField(term136174, term136174.getClass(), "next", null);
        setField(term136184, term136184.getClass(), "functionName", null);
        setBooleanField(term136184, term136184.getClass(), "itsNeedsActivation", false);
        setIntField(term136184, term136184.getClass(), "itsFunctionType", 0);
        setBooleanField(term136184, term136184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term136184, term136184.getClass(), "encodedSourceStart", 0);
        setIntField(term136184, term136184.getClass(), "encodedSourceEnd", 0);
        setField(term136184, term136184.getClass(), "sourceName", null);
        setIntField(term136184, term136184.getClass(), "baseLineno", 0);
        setIntField(term136184, term136184.getClass(), "endLineno", 0);
        setField(term136184, term136184.getClass(), "functions", null);
        setField(term136184, term136184.getClass(), "regexps", null);
        setField(term136184, term136184.getClass(), "itsVariables", null);
        setField(term136184, term136184.getClass(), "itsConst", null);
        setField(term136184, term136184.getClass(), "itsVariableNames", null);
        setIntField(term136184, term136184.getClass(), "varStart", 0);
        setField(term136184, term136184.getClass(), "compilerData", null);
        setIntField(term136184, term136184.getClass(), "type", 0);
        setIntField(term136194, term136194.getClass(), "type", 0);
        setField(term136194, term136194.getClass(), "next", null);
        setField(term136194, term136194.getClass(), "first", null);
        setField(term136194, term136194.getClass(), "last", null);
        setField(term136194, term136194.getClass(), "propListHead", null);
        setIntField(term136194, term136194.getClass(), "sourcePosition", 0);
        setField(term136194, term136194.getClass(), "jsType", null);
        setField(term136194, term136194.getClass(), "parent", null);
        setField(term136184, term136184.getClass(), "next", term136194);
        setField(term136184, term136184.getClass(), "first", null);
        setField(term136184, term136184.getClass(), "last", null);
        setField(term136184, term136184.getClass(), "propListHead", null);
        setIntField(term136184, term136184.getClass(), "sourcePosition", 0);
        setField(term136184, term136184.getClass(), "jsType", null);
        setField(term136184, term136184.getClass(), "parent", null);
        setField(term136174, term136174.getClass(), "first", term136184);
        setField(term136174, term136174.getClass(), "last", null);
        setField(term136174, term136174.getClass(), "propListHead", null);
        setIntField(term136174, term136174.getClass(), "sourcePosition", 0);
        setField(term136174, term136174.getClass(), "jsType", null);
        setField(term136174, term136174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term135884;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term135798, args);
        assertTrue(recursiveEquals(term135798, term136239));
        assertTrue(recursiveEquals(term135884, term136240));
        assertTrue(recursiveEquals(retValue, term136174));
    }

};



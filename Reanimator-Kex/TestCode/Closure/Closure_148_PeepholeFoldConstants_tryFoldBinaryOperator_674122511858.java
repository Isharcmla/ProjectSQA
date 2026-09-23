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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198531;
     Object term198623;
     Object term198892;
     Object term198893;
     Object term198817;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term198623 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198801 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term198801, term198801.getClass(), "type", 16);
        setField(term198715, term198715.getClass(), "next", term198801);
        setIntField(term198715, term198715.getClass(), "type", 42);
        setField(term198623, term198623.getClass(), "first", term198715);
        setIntField(term198623, term198623.getClass(), "type", 16);
        term198892 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term198892, term198892.getClass(), "currentTraversal", null);
        term198893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term198893, term198893.getClass(), "number", 0.0);
        setIntField(term198893, term198893.getClass(), "type", 16);
        setField(term198893, term198893.getClass(), "next", null);
        setDoubleField(term198894, term198894.getClass(), "number", 0.0);
        setIntField(term198894, term198894.getClass(), "type", 42);
        setField(term198895, term198895.getClass(), "functionName", null);
        setBooleanField(term198895, term198895.getClass(), "itsNeedsActivation", false);
        setIntField(term198895, term198895.getClass(), "itsFunctionType", 0);
        setBooleanField(term198895, term198895.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term198895, term198895.getClass(), "encodedSourceStart", 0);
        setIntField(term198895, term198895.getClass(), "encodedSourceEnd", 0);
        setField(term198895, term198895.getClass(), "sourceName", null);
        setIntField(term198895, term198895.getClass(), "baseLineno", 0);
        setIntField(term198895, term198895.getClass(), "endLineno", 0);
        setField(term198895, term198895.getClass(), "functions", null);
        setField(term198895, term198895.getClass(), "regexps", null);
        setField(term198895, term198895.getClass(), "itsVariables", null);
        setField(term198895, term198895.getClass(), "itsConst", null);
        setField(term198895, term198895.getClass(), "itsVariableNames", null);
        setIntField(term198895, term198895.getClass(), "varStart", 0);
        setField(term198895, term198895.getClass(), "compilerData", null);
        setIntField(term198895, term198895.getClass(), "type", 16);
        setField(term198895, term198895.getClass(), "next", null);
        setField(term198895, term198895.getClass(), "first", null);
        setField(term198895, term198895.getClass(), "last", null);
        setField(term198895, term198895.getClass(), "propListHead", null);
        setIntField(term198895, term198895.getClass(), "sourcePosition", 0);
        setField(term198895, term198895.getClass(), "jsType", null);
        setField(term198895, term198895.getClass(), "parent", null);
        setField(term198894, term198894.getClass(), "next", term198895);
        setField(term198894, term198894.getClass(), "first", null);
        setField(term198894, term198894.getClass(), "last", null);
        setField(term198894, term198894.getClass(), "propListHead", null);
        setIntField(term198894, term198894.getClass(), "sourcePosition", 0);
        setField(term198894, term198894.getClass(), "jsType", null);
        setField(term198894, term198894.getClass(), "parent", null);
        setField(term198893, term198893.getClass(), "first", term198894);
        setField(term198893, term198893.getClass(), "last", null);
        setField(term198893, term198893.getClass(), "propListHead", null);
        setIntField(term198893, term198893.getClass(), "sourcePosition", 0);
        setField(term198893, term198893.getClass(), "jsType", null);
        setField(term198893, term198893.getClass(), "parent", null);
        term198817 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term198823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term198817, term198817.getClass(), "number", 0.0);
        setIntField(term198817, term198817.getClass(), "type", 16);
        setField(term198817, term198817.getClass(), "next", null);
        setDoubleField(term198820, term198820.getClass(), "number", 0.0);
        setIntField(term198820, term198820.getClass(), "type", 42);
        setField(term198823, term198823.getClass(), "functionName", null);
        setBooleanField(term198823, term198823.getClass(), "itsNeedsActivation", false);
        setIntField(term198823, term198823.getClass(), "itsFunctionType", 0);
        setBooleanField(term198823, term198823.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term198823, term198823.getClass(), "encodedSourceStart", 0);
        setIntField(term198823, term198823.getClass(), "encodedSourceEnd", 0);
        setField(term198823, term198823.getClass(), "sourceName", null);
        setIntField(term198823, term198823.getClass(), "baseLineno", 0);
        setIntField(term198823, term198823.getClass(), "endLineno", 0);
        setField(term198823, term198823.getClass(), "functions", null);
        setField(term198823, term198823.getClass(), "regexps", null);
        setField(term198823, term198823.getClass(), "itsVariables", null);
        setField(term198823, term198823.getClass(), "itsConst", null);
        setField(term198823, term198823.getClass(), "itsVariableNames", null);
        setIntField(term198823, term198823.getClass(), "varStart", 0);
        setField(term198823, term198823.getClass(), "compilerData", null);
        setIntField(term198823, term198823.getClass(), "type", 16);
        setField(term198823, term198823.getClass(), "next", null);
        setField(term198823, term198823.getClass(), "first", null);
        setField(term198823, term198823.getClass(), "last", null);
        setField(term198823, term198823.getClass(), "propListHead", null);
        setIntField(term198823, term198823.getClass(), "sourcePosition", 0);
        setField(term198823, term198823.getClass(), "jsType", null);
        setField(term198823, term198823.getClass(), "parent", null);
        setField(term198820, term198820.getClass(), "next", term198823);
        setField(term198820, term198820.getClass(), "first", null);
        setField(term198820, term198820.getClass(), "last", null);
        setField(term198820, term198820.getClass(), "propListHead", null);
        setIntField(term198820, term198820.getClass(), "sourcePosition", 0);
        setField(term198820, term198820.getClass(), "jsType", null);
        setField(term198820, term198820.getClass(), "parent", null);
        setField(term198817, term198817.getClass(), "first", term198820);
        setField(term198817, term198817.getClass(), "last", null);
        setField(term198817, term198817.getClass(), "propListHead", null);
        setIntField(term198817, term198817.getClass(), "sourcePosition", 0);
        setField(term198817, term198817.getClass(), "jsType", null);
        setField(term198817, term198817.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term198623;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term198531, args);
        assertTrue(recursiveEquals(term198531, term198892));
        assertTrue(recursiveEquals(term198623, term198893));
        assertTrue(recursiveEquals(retValue, term198817));
    }

};



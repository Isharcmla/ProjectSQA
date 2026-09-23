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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708734;
     Object term708826;
     Object term709044;
     Object term709045;
     Object term708997;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708734 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term708826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term708912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term708982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term708912, term708912.getClass(), "next", term708982);
        setIntField(term708912, term708912.getClass(), "type", 39);
        setField(term708826, term708826.getClass(), "first", term708912);
        setIntField(term708826, term708826.getClass(), "type", 22);
        term709044 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term709044, term709044.getClass(), "currentTraversal", null);
        term709045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term709046 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term709045, term709045.getClass(), "number", 0.0);
        setIntField(term709045, term709045.getClass(), "type", 22);
        setField(term709045, term709045.getClass(), "next", null);
        setField(term709046, term709046.getClass(), "functionName", null);
        setBooleanField(term709046, term709046.getClass(), "itsNeedsActivation", false);
        setIntField(term709046, term709046.getClass(), "itsFunctionType", 0);
        setBooleanField(term709046, term709046.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709046, term709046.getClass(), "encodedSourceStart", 0);
        setIntField(term709046, term709046.getClass(), "encodedSourceEnd", 0);
        setField(term709046, term709046.getClass(), "sourceName", null);
        setIntField(term709046, term709046.getClass(), "baseLineno", 0);
        setIntField(term709046, term709046.getClass(), "endLineno", 0);
        setField(term709046, term709046.getClass(), "functions", null);
        setField(term709046, term709046.getClass(), "regexps", null);
        setField(term709046, term709046.getClass(), "itsVariables", null);
        setField(term709046, term709046.getClass(), "itsConst", null);
        setField(term709046, term709046.getClass(), "itsVariableNames", null);
        setIntField(term709046, term709046.getClass(), "varStart", 0);
        setField(term709046, term709046.getClass(), "compilerData", null);
        setIntField(term709046, term709046.getClass(), "type", 39);
        setIntField(term709047, term709047.getClass(), "type", 0);
        setField(term709047, term709047.getClass(), "next", null);
        setField(term709047, term709047.getClass(), "first", null);
        setField(term709047, term709047.getClass(), "last", null);
        setField(term709047, term709047.getClass(), "propListHead", null);
        setIntField(term709047, term709047.getClass(), "sourcePosition", 0);
        setField(term709047, term709047.getClass(), "jsType", null);
        setField(term709047, term709047.getClass(), "parent", null);
        setField(term709046, term709046.getClass(), "next", term709047);
        setField(term709046, term709046.getClass(), "first", null);
        setField(term709046, term709046.getClass(), "last", null);
        setField(term709046, term709046.getClass(), "propListHead", null);
        setIntField(term709046, term709046.getClass(), "sourcePosition", 0);
        setField(term709046, term709046.getClass(), "jsType", null);
        setField(term709046, term709046.getClass(), "parent", null);
        setField(term709045, term709045.getClass(), "first", term709046);
        setField(term709045, term709045.getClass(), "last", null);
        setField(term709045, term709045.getClass(), "propListHead", null);
        setIntField(term709045, term709045.getClass(), "sourcePosition", 0);
        setField(term709045, term709045.getClass(), "jsType", null);
        setField(term709045, term709045.getClass(), "parent", null);
        term708997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term709000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term709010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term708997, term708997.getClass(), "number", 0.0);
        setIntField(term708997, term708997.getClass(), "type", 22);
        setField(term708997, term708997.getClass(), "next", null);
        setField(term709000, term709000.getClass(), "functionName", null);
        setBooleanField(term709000, term709000.getClass(), "itsNeedsActivation", false);
        setIntField(term709000, term709000.getClass(), "itsFunctionType", 0);
        setBooleanField(term709000, term709000.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term709000, term709000.getClass(), "encodedSourceStart", 0);
        setIntField(term709000, term709000.getClass(), "encodedSourceEnd", 0);
        setField(term709000, term709000.getClass(), "sourceName", null);
        setIntField(term709000, term709000.getClass(), "baseLineno", 0);
        setIntField(term709000, term709000.getClass(), "endLineno", 0);
        setField(term709000, term709000.getClass(), "functions", null);
        setField(term709000, term709000.getClass(), "regexps", null);
        setField(term709000, term709000.getClass(), "itsVariables", null);
        setField(term709000, term709000.getClass(), "itsConst", null);
        setField(term709000, term709000.getClass(), "itsVariableNames", null);
        setIntField(term709000, term709000.getClass(), "varStart", 0);
        setField(term709000, term709000.getClass(), "compilerData", null);
        setIntField(term709000, term709000.getClass(), "type", 39);
        setIntField(term709010, term709010.getClass(), "type", 0);
        setField(term709010, term709010.getClass(), "next", null);
        setField(term709010, term709010.getClass(), "first", null);
        setField(term709010, term709010.getClass(), "last", null);
        setField(term709010, term709010.getClass(), "propListHead", null);
        setIntField(term709010, term709010.getClass(), "sourcePosition", 0);
        setField(term709010, term709010.getClass(), "jsType", null);
        setField(term709010, term709010.getClass(), "parent", null);
        setField(term709000, term709000.getClass(), "next", term709010);
        setField(term709000, term709000.getClass(), "first", null);
        setField(term709000, term709000.getClass(), "last", null);
        setField(term709000, term709000.getClass(), "propListHead", null);
        setIntField(term709000, term709000.getClass(), "sourcePosition", 0);
        setField(term709000, term709000.getClass(), "jsType", null);
        setField(term709000, term709000.getClass(), "parent", null);
        setField(term708997, term708997.getClass(), "first", term709000);
        setField(term708997, term708997.getClass(), "last", null);
        setField(term708997, term708997.getClass(), "propListHead", null);
        setIntField(term708997, term708997.getClass(), "sourcePosition", 0);
        setField(term708997, term708997.getClass(), "jsType", null);
        setField(term708997, term708997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term708826;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term708734, args);
        assertTrue(recursiveEquals(term708734, term709044));
        assertTrue(recursiveEquals(term708826, term709045));
        assertTrue(recursiveEquals(retValue, term708997));
    }

};



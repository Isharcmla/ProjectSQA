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
     Object term244452;
     Object term244538;
     Object term244660;
     Object term244661;
     Object term244623;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term244538 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term244608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term244538, term244538.getClass(), "first", term244538);
        setField(term244538, term244538.getClass(), "next", term244608);
        setIntField(term244538, term244538.getClass(), "type", 19);
        term244660 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term244660, term244660.getClass(), "currentTraversal", null);
        term244661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term244662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term244661, term244661.getClass(), "functionName", null);
        setBooleanField(term244661, term244661.getClass(), "itsNeedsActivation", false);
        setIntField(term244661, term244661.getClass(), "itsFunctionType", 0);
        setBooleanField(term244661, term244661.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term244661, term244661.getClass(), "encodedSourceStart", 0);
        setIntField(term244661, term244661.getClass(), "encodedSourceEnd", 0);
        setField(term244661, term244661.getClass(), "sourceName", null);
        setIntField(term244661, term244661.getClass(), "baseLineno", 0);
        setIntField(term244661, term244661.getClass(), "endLineno", 0);
        setField(term244661, term244661.getClass(), "functions", null);
        setField(term244661, term244661.getClass(), "regexps", null);
        setField(term244661, term244661.getClass(), "itsVariables", null);
        setField(term244661, term244661.getClass(), "itsConst", null);
        setField(term244661, term244661.getClass(), "itsVariableNames", null);
        setIntField(term244661, term244661.getClass(), "varStart", 0);
        setField(term244661, term244661.getClass(), "compilerData", null);
        setIntField(term244661, term244661.getClass(), "type", 19);
        setIntField(term244662, term244662.getClass(), "type", 0);
        setField(term244662, term244662.getClass(), "next", null);
        setField(term244662, term244662.getClass(), "first", null);
        setField(term244662, term244662.getClass(), "last", null);
        setField(term244662, term244662.getClass(), "propListHead", null);
        setIntField(term244662, term244662.getClass(), "sourcePosition", 0);
        setField(term244662, term244662.getClass(), "jsType", null);
        setField(term244662, term244662.getClass(), "parent", null);
        setField(term244661, term244661.getClass(), "next", term244662);
        setField(term244661, term244661.getClass(), "first", term244661);
        setField(term244661, term244661.getClass(), "last", null);
        setField(term244661, term244661.getClass(), "propListHead", null);
        setIntField(term244661, term244661.getClass(), "sourcePosition", 0);
        setField(term244661, term244661.getClass(), "jsType", null);
        setField(term244661, term244661.getClass(), "parent", null);
        term244623 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term244633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term244623, term244623.getClass(), "functionName", null);
        setBooleanField(term244623, term244623.getClass(), "itsNeedsActivation", false);
        setIntField(term244623, term244623.getClass(), "itsFunctionType", 0);
        setBooleanField(term244623, term244623.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term244623, term244623.getClass(), "encodedSourceStart", 0);
        setIntField(term244623, term244623.getClass(), "encodedSourceEnd", 0);
        setField(term244623, term244623.getClass(), "sourceName", null);
        setIntField(term244623, term244623.getClass(), "baseLineno", 0);
        setIntField(term244623, term244623.getClass(), "endLineno", 0);
        setField(term244623, term244623.getClass(), "functions", null);
        setField(term244623, term244623.getClass(), "regexps", null);
        setField(term244623, term244623.getClass(), "itsVariables", null);
        setField(term244623, term244623.getClass(), "itsConst", null);
        setField(term244623, term244623.getClass(), "itsVariableNames", null);
        setIntField(term244623, term244623.getClass(), "varStart", 0);
        setField(term244623, term244623.getClass(), "compilerData", null);
        setIntField(term244623, term244623.getClass(), "type", 19);
        setIntField(term244633, term244633.getClass(), "type", 0);
        setField(term244633, term244633.getClass(), "next", null);
        setField(term244633, term244633.getClass(), "first", null);
        setField(term244633, term244633.getClass(), "last", null);
        setField(term244633, term244633.getClass(), "propListHead", null);
        setIntField(term244633, term244633.getClass(), "sourcePosition", 0);
        setField(term244633, term244633.getClass(), "jsType", null);
        setField(term244633, term244633.getClass(), "parent", null);
        setField(term244623, term244623.getClass(), "next", term244633);
        setField(term244623, term244623.getClass(), "first", term244623);
        setField(term244623, term244623.getClass(), "last", null);
        setField(term244623, term244623.getClass(), "propListHead", null);
        setIntField(term244623, term244623.getClass(), "sourcePosition", 0);
        setField(term244623, term244623.getClass(), "jsType", null);
        setField(term244623, term244623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term244538;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term244452, args);
        assertTrue(recursiveEquals(term244452, term244660));
        assertTrue(recursiveEquals(term244538, term244661));
        assertTrue(recursiveEquals(retValue, term244623));
    }

};



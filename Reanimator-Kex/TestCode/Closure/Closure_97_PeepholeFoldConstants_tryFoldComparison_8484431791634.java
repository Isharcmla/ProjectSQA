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

public class PeepholeFoldConstants_tryFoldComparison_8484431791634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655112;
     Object term655198;
     Object term655284;
     Object term655376;
     Object term655484;
     Object term655485;
     Object term655486;
     Object term655487;
     Object term655452;

    public PeepholeFoldConstants_tryFoldComparison_8484431791634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term655198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term655198, term655198.getClass(), "type", 16);
        term655284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term655284, term655284.getClass(), "type", 42);
        term655376 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term655376, term655376.getClass(), "type", 16);
        term655484 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term655484, term655484.getClass(), "currentTraversal", null);
        term655485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655485, term655485.getClass(), "functionName", null);
        setBooleanField(term655485, term655485.getClass(), "itsNeedsActivation", false);
        setIntField(term655485, term655485.getClass(), "itsFunctionType", 0);
        setBooleanField(term655485, term655485.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655485, term655485.getClass(), "encodedSourceStart", 0);
        setIntField(term655485, term655485.getClass(), "encodedSourceEnd", 0);
        setField(term655485, term655485.getClass(), "sourceName", null);
        setIntField(term655485, term655485.getClass(), "baseLineno", 0);
        setIntField(term655485, term655485.getClass(), "endLineno", 0);
        setField(term655485, term655485.getClass(), "functions", null);
        setField(term655485, term655485.getClass(), "regexps", null);
        setField(term655485, term655485.getClass(), "itsVariables", null);
        setField(term655485, term655485.getClass(), "itsConst", null);
        setField(term655485, term655485.getClass(), "itsVariableNames", null);
        setIntField(term655485, term655485.getClass(), "varStart", 0);
        setField(term655485, term655485.getClass(), "compilerData", null);
        setIntField(term655485, term655485.getClass(), "type", 42);
        setField(term655485, term655485.getClass(), "next", null);
        setField(term655485, term655485.getClass(), "first", null);
        setField(term655485, term655485.getClass(), "last", null);
        setField(term655485, term655485.getClass(), "propListHead", null);
        setIntField(term655485, term655485.getClass(), "sourcePosition", 0);
        setField(term655485, term655485.getClass(), "jsType", null);
        setField(term655485, term655485.getClass(), "parent", null);
        term655486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655486, term655486.getClass(), "functionName", null);
        setBooleanField(term655486, term655486.getClass(), "itsNeedsActivation", false);
        setIntField(term655486, term655486.getClass(), "itsFunctionType", 0);
        setBooleanField(term655486, term655486.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655486, term655486.getClass(), "encodedSourceStart", 0);
        setIntField(term655486, term655486.getClass(), "encodedSourceEnd", 0);
        setField(term655486, term655486.getClass(), "sourceName", null);
        setIntField(term655486, term655486.getClass(), "baseLineno", 0);
        setIntField(term655486, term655486.getClass(), "endLineno", 0);
        setField(term655486, term655486.getClass(), "functions", null);
        setField(term655486, term655486.getClass(), "regexps", null);
        setField(term655486, term655486.getClass(), "itsVariables", null);
        setField(term655486, term655486.getClass(), "itsConst", null);
        setField(term655486, term655486.getClass(), "itsVariableNames", null);
        setIntField(term655486, term655486.getClass(), "varStart", 0);
        setField(term655486, term655486.getClass(), "compilerData", null);
        setIntField(term655486, term655486.getClass(), "type", 16);
        setField(term655486, term655486.getClass(), "next", null);
        setField(term655486, term655486.getClass(), "first", null);
        setField(term655486, term655486.getClass(), "last", null);
        setField(term655486, term655486.getClass(), "propListHead", null);
        setIntField(term655486, term655486.getClass(), "sourcePosition", 0);
        setField(term655486, term655486.getClass(), "jsType", null);
        setField(term655486, term655486.getClass(), "parent", null);
        term655487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term655487, term655487.getClass(), "number", 0.0);
        setIntField(term655487, term655487.getClass(), "type", 16);
        setField(term655487, term655487.getClass(), "next", null);
        setField(term655487, term655487.getClass(), "first", null);
        setField(term655487, term655487.getClass(), "last", null);
        setField(term655487, term655487.getClass(), "propListHead", null);
        setIntField(term655487, term655487.getClass(), "sourcePosition", 0);
        setField(term655487, term655487.getClass(), "jsType", null);
        setField(term655487, term655487.getClass(), "parent", null);
        term655452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term655452, term655452.getClass(), "functionName", null);
        setBooleanField(term655452, term655452.getClass(), "itsNeedsActivation", false);
        setIntField(term655452, term655452.getClass(), "itsFunctionType", 0);
        setBooleanField(term655452, term655452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term655452, term655452.getClass(), "encodedSourceStart", 0);
        setIntField(term655452, term655452.getClass(), "encodedSourceEnd", 0);
        setField(term655452, term655452.getClass(), "sourceName", null);
        setIntField(term655452, term655452.getClass(), "baseLineno", 0);
        setIntField(term655452, term655452.getClass(), "endLineno", 0);
        setField(term655452, term655452.getClass(), "functions", null);
        setField(term655452, term655452.getClass(), "regexps", null);
        setField(term655452, term655452.getClass(), "itsVariables", null);
        setField(term655452, term655452.getClass(), "itsConst", null);
        setField(term655452, term655452.getClass(), "itsVariableNames", null);
        setIntField(term655452, term655452.getClass(), "varStart", 0);
        setField(term655452, term655452.getClass(), "compilerData", null);
        setIntField(term655452, term655452.getClass(), "type", 16);
        setField(term655452, term655452.getClass(), "next", null);
        setField(term655452, term655452.getClass(), "first", null);
        setField(term655452, term655452.getClass(), "last", null);
        setField(term655452, term655452.getClass(), "propListHead", null);
        setIntField(term655452, term655452.getClass(), "sourcePosition", 0);
        setField(term655452, term655452.getClass(), "jsType", null);
        setField(term655452, term655452.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term655198;
        args[1] = term655284;
        args[2] = term655376;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term655112, args);
        assertTrue(recursiveEquals(term655112, term655484));
        assertTrue(recursiveEquals(term655198, term655485));
        assertTrue(recursiveEquals(term655284, term655486));
        assertTrue(recursiveEquals(term655376, term655487));
        assertTrue(recursiveEquals(retValue, term655452));
    }

};



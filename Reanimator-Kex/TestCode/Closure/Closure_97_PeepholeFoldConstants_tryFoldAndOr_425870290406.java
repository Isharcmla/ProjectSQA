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

public class PeepholeFoldConstants_tryFoldAndOr_425870290406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94064;
     Object term94150;
     Object term94236;
     Object term94328;
     Object term94667;
     Object term94668;
     Object term94669;
     Object term94670;
     Object term94612;

    public PeepholeFoldConstants_tryFoldAndOr_425870290406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term94150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94150, term94150.getClass(), "parent", null);
        setIntField(term94150, term94150.getClass(), "type", 0);
        term94236 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94236, term94236.getClass(), "type", 0);
        term94328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term94667 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term94667, term94667.getClass(), "currentTraversal", null);
        term94668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94668, term94668.getClass(), "functionName", null);
        setBooleanField(term94668, term94668.getClass(), "itsNeedsActivation", false);
        setIntField(term94668, term94668.getClass(), "itsFunctionType", 0);
        setBooleanField(term94668, term94668.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94668, term94668.getClass(), "encodedSourceStart", 0);
        setIntField(term94668, term94668.getClass(), "encodedSourceEnd", 0);
        setField(term94668, term94668.getClass(), "sourceName", null);
        setIntField(term94668, term94668.getClass(), "baseLineno", 0);
        setIntField(term94668, term94668.getClass(), "endLineno", 0);
        setField(term94668, term94668.getClass(), "functions", null);
        setField(term94668, term94668.getClass(), "regexps", null);
        setField(term94668, term94668.getClass(), "itsVariables", null);
        setField(term94668, term94668.getClass(), "itsConst", null);
        setField(term94668, term94668.getClass(), "itsVariableNames", null);
        setIntField(term94668, term94668.getClass(), "varStart", 0);
        setField(term94668, term94668.getClass(), "compilerData", null);
        setIntField(term94668, term94668.getClass(), "type", 0);
        setField(term94668, term94668.getClass(), "next", null);
        setField(term94668, term94668.getClass(), "first", null);
        setField(term94668, term94668.getClass(), "last", null);
        setField(term94668, term94668.getClass(), "propListHead", null);
        setIntField(term94668, term94668.getClass(), "sourcePosition", 0);
        setField(term94668, term94668.getClass(), "jsType", null);
        setField(term94668, term94668.getClass(), "parent", null);
        term94669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94669, term94669.getClass(), "functionName", null);
        setBooleanField(term94669, term94669.getClass(), "itsNeedsActivation", false);
        setIntField(term94669, term94669.getClass(), "itsFunctionType", 0);
        setBooleanField(term94669, term94669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94669, term94669.getClass(), "encodedSourceStart", 0);
        setIntField(term94669, term94669.getClass(), "encodedSourceEnd", 0);
        setField(term94669, term94669.getClass(), "sourceName", null);
        setIntField(term94669, term94669.getClass(), "baseLineno", 0);
        setIntField(term94669, term94669.getClass(), "endLineno", 0);
        setField(term94669, term94669.getClass(), "functions", null);
        setField(term94669, term94669.getClass(), "regexps", null);
        setField(term94669, term94669.getClass(), "itsVariables", null);
        setField(term94669, term94669.getClass(), "itsConst", null);
        setField(term94669, term94669.getClass(), "itsVariableNames", null);
        setIntField(term94669, term94669.getClass(), "varStart", 0);
        setField(term94669, term94669.getClass(), "compilerData", null);
        setIntField(term94669, term94669.getClass(), "type", 0);
        setField(term94669, term94669.getClass(), "next", null);
        setField(term94669, term94669.getClass(), "first", null);
        setField(term94669, term94669.getClass(), "last", null);
        setField(term94669, term94669.getClass(), "propListHead", null);
        setIntField(term94669, term94669.getClass(), "sourcePosition", 0);
        setField(term94669, term94669.getClass(), "jsType", null);
        setField(term94669, term94669.getClass(), "parent", null);
        term94670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term94670, term94670.getClass(), "number", 0.0);
        setIntField(term94670, term94670.getClass(), "type", 0);
        setField(term94670, term94670.getClass(), "next", null);
        setField(term94670, term94670.getClass(), "first", null);
        setField(term94670, term94670.getClass(), "last", null);
        setField(term94670, term94670.getClass(), "propListHead", null);
        setIntField(term94670, term94670.getClass(), "sourcePosition", 0);
        setField(term94670, term94670.getClass(), "jsType", null);
        setField(term94670, term94670.getClass(), "parent", null);
        term94612 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term94612, term94612.getClass(), "functionName", null);
        setBooleanField(term94612, term94612.getClass(), "itsNeedsActivation", false);
        setIntField(term94612, term94612.getClass(), "itsFunctionType", 0);
        setBooleanField(term94612, term94612.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94612, term94612.getClass(), "encodedSourceStart", 0);
        setIntField(term94612, term94612.getClass(), "encodedSourceEnd", 0);
        setField(term94612, term94612.getClass(), "sourceName", null);
        setIntField(term94612, term94612.getClass(), "baseLineno", 0);
        setIntField(term94612, term94612.getClass(), "endLineno", 0);
        setField(term94612, term94612.getClass(), "functions", null);
        setField(term94612, term94612.getClass(), "regexps", null);
        setField(term94612, term94612.getClass(), "itsVariables", null);
        setField(term94612, term94612.getClass(), "itsConst", null);
        setField(term94612, term94612.getClass(), "itsVariableNames", null);
        setIntField(term94612, term94612.getClass(), "varStart", 0);
        setField(term94612, term94612.getClass(), "compilerData", null);
        setIntField(term94612, term94612.getClass(), "type", 0);
        setField(term94612, term94612.getClass(), "next", null);
        setField(term94612, term94612.getClass(), "first", null);
        setField(term94612, term94612.getClass(), "last", null);
        setField(term94612, term94612.getClass(), "propListHead", null);
        setIntField(term94612, term94612.getClass(), "sourcePosition", 0);
        setField(term94612, term94612.getClass(), "jsType", null);
        setField(term94612, term94612.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term94150;
        args[1] = term94236;
        args[2] = term94328;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term94064, args);
        assertTrue(recursiveEquals(term94064, term94667));
        assertTrue(recursiveEquals(term94150, term94668));
        assertTrue(recursiveEquals(term94236, term94669));
        assertTrue(recursiveEquals(term94328, term94670));
        assertTrue(recursiveEquals(retValue, term94612));
    }

};



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

public class PeepholeFoldConstants_tryFoldComparison_8484431791726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447134;
     Object term447226;
     Object term447318;
     Object term447404;
     Object term447444;
     Object term447445;
     Object term447446;
     Object term447447;
     Object term447415;

    public PeepholeFoldConstants_tryFoldComparison_8484431791726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447134 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term447226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term447226, term447226.getClass(), "type", 14);
        term447318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term447318, term447318.getClass(), "type", 14);
        term447404 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term447444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term447444, term447444.getClass(), "currentTraversal", null);
        term447445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term447445, term447445.getClass(), "number", 0.0);
        setIntField(term447445, term447445.getClass(), "type", 14);
        setField(term447445, term447445.getClass(), "next", null);
        setField(term447445, term447445.getClass(), "first", null);
        setField(term447445, term447445.getClass(), "last", null);
        setField(term447445, term447445.getClass(), "propListHead", null);
        setIntField(term447445, term447445.getClass(), "sourcePosition", 0);
        setField(term447445, term447445.getClass(), "jsType", null);
        setField(term447445, term447445.getClass(), "parent", null);
        term447446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term447446, term447446.getClass(), "number", 0.0);
        setIntField(term447446, term447446.getClass(), "type", 14);
        setField(term447446, term447446.getClass(), "next", null);
        setField(term447446, term447446.getClass(), "first", null);
        setField(term447446, term447446.getClass(), "last", null);
        setField(term447446, term447446.getClass(), "propListHead", null);
        setIntField(term447446, term447446.getClass(), "sourcePosition", 0);
        setField(term447446, term447446.getClass(), "jsType", null);
        setField(term447446, term447446.getClass(), "parent", null);
        term447447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term447447, term447447.getClass(), "functionName", null);
        setBooleanField(term447447, term447447.getClass(), "itsNeedsActivation", false);
        setIntField(term447447, term447447.getClass(), "itsFunctionType", 0);
        setBooleanField(term447447, term447447.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term447447, term447447.getClass(), "encodedSourceStart", 0);
        setIntField(term447447, term447447.getClass(), "encodedSourceEnd", 0);
        setField(term447447, term447447.getClass(), "sourceName", null);
        setIntField(term447447, term447447.getClass(), "baseLineno", 0);
        setIntField(term447447, term447447.getClass(), "endLineno", 0);
        setField(term447447, term447447.getClass(), "functions", null);
        setField(term447447, term447447.getClass(), "regexps", null);
        setField(term447447, term447447.getClass(), "itsVariables", null);
        setField(term447447, term447447.getClass(), "itsConst", null);
        setField(term447447, term447447.getClass(), "itsVariableNames", null);
        setIntField(term447447, term447447.getClass(), "varStart", 0);
        setField(term447447, term447447.getClass(), "compilerData", null);
        setIntField(term447447, term447447.getClass(), "type", 0);
        setField(term447447, term447447.getClass(), "next", null);
        setField(term447447, term447447.getClass(), "first", null);
        setField(term447447, term447447.getClass(), "last", null);
        setField(term447447, term447447.getClass(), "propListHead", null);
        setIntField(term447447, term447447.getClass(), "sourcePosition", 0);
        setField(term447447, term447447.getClass(), "jsType", null);
        setField(term447447, term447447.getClass(), "parent", null);
        term447415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term447415, term447415.getClass(), "number", 0.0);
        setIntField(term447415, term447415.getClass(), "type", 14);
        setField(term447415, term447415.getClass(), "next", null);
        setField(term447415, term447415.getClass(), "first", null);
        setField(term447415, term447415.getClass(), "last", null);
        setField(term447415, term447415.getClass(), "propListHead", null);
        setIntField(term447415, term447415.getClass(), "sourcePosition", 0);
        setField(term447415, term447415.getClass(), "jsType", null);
        setField(term447415, term447415.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term447226;
        args[1] = term447318;
        args[2] = term447404;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term447134, args);
        assertTrue(recursiveEquals(term447134, term447444));
        assertTrue(recursiveEquals(term447226, term447445));
        assertTrue(recursiveEquals(term447318, term447446));
        assertTrue(recursiveEquals(term447404, term447447));
        assertTrue(recursiveEquals(retValue, term447415));
    }

};



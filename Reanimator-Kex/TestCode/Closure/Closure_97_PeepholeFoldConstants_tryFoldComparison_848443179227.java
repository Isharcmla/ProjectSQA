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

public class PeepholeFoldConstants_tryFoldComparison_848443179227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44538;
     Object term44624;
     Object term44710;
     Object term44796;
     Object term45291;
     Object term45292;
     Object term45293;
     Object term45294;
     Object term45255;

    public PeepholeFoldConstants_tryFoldComparison_848443179227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44538 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44624 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term44624, term44624.getClass(), "type", 16);
        term44710 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term44710, term44710.getClass(), "type", 42);
        term44796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term44796, term44796.getClass(), "type", 42);
        term45291 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45291, term45291.getClass(), "currentTraversal", null);
        term45292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45292, term45292.getClass(), "functionName", null);
        setBooleanField(term45292, term45292.getClass(), "itsNeedsActivation", false);
        setIntField(term45292, term45292.getClass(), "itsFunctionType", 0);
        setBooleanField(term45292, term45292.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45292, term45292.getClass(), "encodedSourceStart", 0);
        setIntField(term45292, term45292.getClass(), "encodedSourceEnd", 0);
        setField(term45292, term45292.getClass(), "sourceName", null);
        setIntField(term45292, term45292.getClass(), "baseLineno", 0);
        setIntField(term45292, term45292.getClass(), "endLineno", 0);
        setField(term45292, term45292.getClass(), "functions", null);
        setField(term45292, term45292.getClass(), "regexps", null);
        setField(term45292, term45292.getClass(), "itsVariables", null);
        setField(term45292, term45292.getClass(), "itsConst", null);
        setField(term45292, term45292.getClass(), "itsVariableNames", null);
        setIntField(term45292, term45292.getClass(), "varStart", 0);
        setField(term45292, term45292.getClass(), "compilerData", null);
        setIntField(term45292, term45292.getClass(), "type", 42);
        setField(term45292, term45292.getClass(), "next", null);
        setField(term45292, term45292.getClass(), "first", null);
        setField(term45292, term45292.getClass(), "last", null);
        setField(term45292, term45292.getClass(), "propListHead", null);
        setIntField(term45292, term45292.getClass(), "sourcePosition", 0);
        setField(term45292, term45292.getClass(), "jsType", null);
        setField(term45292, term45292.getClass(), "parent", null);
        term45293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45293, term45293.getClass(), "functionName", null);
        setBooleanField(term45293, term45293.getClass(), "itsNeedsActivation", false);
        setIntField(term45293, term45293.getClass(), "itsFunctionType", 0);
        setBooleanField(term45293, term45293.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45293, term45293.getClass(), "encodedSourceStart", 0);
        setIntField(term45293, term45293.getClass(), "encodedSourceEnd", 0);
        setField(term45293, term45293.getClass(), "sourceName", null);
        setIntField(term45293, term45293.getClass(), "baseLineno", 0);
        setIntField(term45293, term45293.getClass(), "endLineno", 0);
        setField(term45293, term45293.getClass(), "functions", null);
        setField(term45293, term45293.getClass(), "regexps", null);
        setField(term45293, term45293.getClass(), "itsVariables", null);
        setField(term45293, term45293.getClass(), "itsConst", null);
        setField(term45293, term45293.getClass(), "itsVariableNames", null);
        setIntField(term45293, term45293.getClass(), "varStart", 0);
        setField(term45293, term45293.getClass(), "compilerData", null);
        setIntField(term45293, term45293.getClass(), "type", 16);
        setField(term45293, term45293.getClass(), "next", null);
        setField(term45293, term45293.getClass(), "first", null);
        setField(term45293, term45293.getClass(), "last", null);
        setField(term45293, term45293.getClass(), "propListHead", null);
        setIntField(term45293, term45293.getClass(), "sourcePosition", 0);
        setField(term45293, term45293.getClass(), "jsType", null);
        setField(term45293, term45293.getClass(), "parent", null);
        term45294 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45294, term45294.getClass(), "functionName", null);
        setBooleanField(term45294, term45294.getClass(), "itsNeedsActivation", false);
        setIntField(term45294, term45294.getClass(), "itsFunctionType", 0);
        setBooleanField(term45294, term45294.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45294, term45294.getClass(), "encodedSourceStart", 0);
        setIntField(term45294, term45294.getClass(), "encodedSourceEnd", 0);
        setField(term45294, term45294.getClass(), "sourceName", null);
        setIntField(term45294, term45294.getClass(), "baseLineno", 0);
        setIntField(term45294, term45294.getClass(), "endLineno", 0);
        setField(term45294, term45294.getClass(), "functions", null);
        setField(term45294, term45294.getClass(), "regexps", null);
        setField(term45294, term45294.getClass(), "itsVariables", null);
        setField(term45294, term45294.getClass(), "itsConst", null);
        setField(term45294, term45294.getClass(), "itsVariableNames", null);
        setIntField(term45294, term45294.getClass(), "varStart", 0);
        setField(term45294, term45294.getClass(), "compilerData", null);
        setIntField(term45294, term45294.getClass(), "type", 42);
        setField(term45294, term45294.getClass(), "next", null);
        setField(term45294, term45294.getClass(), "first", null);
        setField(term45294, term45294.getClass(), "last", null);
        setField(term45294, term45294.getClass(), "propListHead", null);
        setIntField(term45294, term45294.getClass(), "sourcePosition", 0);
        setField(term45294, term45294.getClass(), "jsType", null);
        setField(term45294, term45294.getClass(), "parent", null);
        term45255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term45255, term45255.getClass(), "functionName", null);
        setBooleanField(term45255, term45255.getClass(), "itsNeedsActivation", false);
        setIntField(term45255, term45255.getClass(), "itsFunctionType", 0);
        setBooleanField(term45255, term45255.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term45255, term45255.getClass(), "encodedSourceStart", 0);
        setIntField(term45255, term45255.getClass(), "encodedSourceEnd", 0);
        setField(term45255, term45255.getClass(), "sourceName", null);
        setIntField(term45255, term45255.getClass(), "baseLineno", 0);
        setIntField(term45255, term45255.getClass(), "endLineno", 0);
        setField(term45255, term45255.getClass(), "functions", null);
        setField(term45255, term45255.getClass(), "regexps", null);
        setField(term45255, term45255.getClass(), "itsVariables", null);
        setField(term45255, term45255.getClass(), "itsConst", null);
        setField(term45255, term45255.getClass(), "itsVariableNames", null);
        setIntField(term45255, term45255.getClass(), "varStart", 0);
        setField(term45255, term45255.getClass(), "compilerData", null);
        setIntField(term45255, term45255.getClass(), "type", 16);
        setField(term45255, term45255.getClass(), "next", null);
        setField(term45255, term45255.getClass(), "first", null);
        setField(term45255, term45255.getClass(), "last", null);
        setField(term45255, term45255.getClass(), "propListHead", null);
        setIntField(term45255, term45255.getClass(), "sourcePosition", 0);
        setField(term45255, term45255.getClass(), "jsType", null);
        setField(term45255, term45255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term44624;
        args[1] = term44710;
        args[2] = term44796;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term44538, args);
        assertTrue(recursiveEquals(term44538, term45291));
        assertTrue(recursiveEquals(term44624, term45292));
        assertTrue(recursiveEquals(term44710, term45293));
        assertTrue(recursiveEquals(term44796, term45294));
        assertTrue(recursiveEquals(retValue, term45255));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232341;
     Object term232427;
     Object term233016;
     Object term233017;
     Object term232951;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term232427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term232513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term232427, term232427.getClass(), "first", term232427);
        setField(term232427, term232427.getClass(), "next", term232513);
        setIntField(term232427, term232427.getClass(), "type", 33);
        term233016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term233016, term233016.getClass(), "currentTraversal", null);
        term233017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term233018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term233017, term233017.getClass(), "functionName", null);
        setBooleanField(term233017, term233017.getClass(), "itsNeedsActivation", false);
        setIntField(term233017, term233017.getClass(), "itsFunctionType", 0);
        setBooleanField(term233017, term233017.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233017, term233017.getClass(), "encodedSourceStart", 0);
        setIntField(term233017, term233017.getClass(), "encodedSourceEnd", 0);
        setField(term233017, term233017.getClass(), "sourceName", null);
        setIntField(term233017, term233017.getClass(), "baseLineno", 0);
        setIntField(term233017, term233017.getClass(), "endLineno", 0);
        setField(term233017, term233017.getClass(), "functions", null);
        setField(term233017, term233017.getClass(), "regexps", null);
        setField(term233017, term233017.getClass(), "itsVariables", null);
        setField(term233017, term233017.getClass(), "itsConst", null);
        setField(term233017, term233017.getClass(), "itsVariableNames", null);
        setIntField(term233017, term233017.getClass(), "varStart", 0);
        setField(term233017, term233017.getClass(), "compilerData", null);
        setIntField(term233017, term233017.getClass(), "type", 33);
        setField(term233018, term233018.getClass(), "functionName", null);
        setBooleanField(term233018, term233018.getClass(), "itsNeedsActivation", false);
        setIntField(term233018, term233018.getClass(), "itsFunctionType", 0);
        setBooleanField(term233018, term233018.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term233018, term233018.getClass(), "encodedSourceStart", 0);
        setIntField(term233018, term233018.getClass(), "encodedSourceEnd", 0);
        setField(term233018, term233018.getClass(), "sourceName", null);
        setIntField(term233018, term233018.getClass(), "baseLineno", 0);
        setIntField(term233018, term233018.getClass(), "endLineno", 0);
        setField(term233018, term233018.getClass(), "functions", null);
        setField(term233018, term233018.getClass(), "regexps", null);
        setField(term233018, term233018.getClass(), "itsVariables", null);
        setField(term233018, term233018.getClass(), "itsConst", null);
        setField(term233018, term233018.getClass(), "itsVariableNames", null);
        setIntField(term233018, term233018.getClass(), "varStart", 0);
        setField(term233018, term233018.getClass(), "compilerData", null);
        setIntField(term233018, term233018.getClass(), "type", 0);
        setField(term233018, term233018.getClass(), "next", null);
        setField(term233018, term233018.getClass(), "first", null);
        setField(term233018, term233018.getClass(), "last", null);
        setField(term233018, term233018.getClass(), "propListHead", null);
        setIntField(term233018, term233018.getClass(), "sourcePosition", 0);
        setField(term233018, term233018.getClass(), "jsType", null);
        setField(term233018, term233018.getClass(), "parent", null);
        setField(term233017, term233017.getClass(), "next", term233018);
        setField(term233017, term233017.getClass(), "first", term233017);
        setField(term233017, term233017.getClass(), "last", null);
        setField(term233017, term233017.getClass(), "propListHead", null);
        setIntField(term233017, term233017.getClass(), "sourcePosition", 0);
        setField(term233017, term233017.getClass(), "jsType", null);
        setField(term233017, term233017.getClass(), "parent", null);
        term232951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term232961 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term232951, term232951.getClass(), "functionName", null);
        setBooleanField(term232951, term232951.getClass(), "itsNeedsActivation", false);
        setIntField(term232951, term232951.getClass(), "itsFunctionType", 0);
        setBooleanField(term232951, term232951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term232951, term232951.getClass(), "encodedSourceStart", 0);
        setIntField(term232951, term232951.getClass(), "encodedSourceEnd", 0);
        setField(term232951, term232951.getClass(), "sourceName", null);
        setIntField(term232951, term232951.getClass(), "baseLineno", 0);
        setIntField(term232951, term232951.getClass(), "endLineno", 0);
        setField(term232951, term232951.getClass(), "functions", null);
        setField(term232951, term232951.getClass(), "regexps", null);
        setField(term232951, term232951.getClass(), "itsVariables", null);
        setField(term232951, term232951.getClass(), "itsConst", null);
        setField(term232951, term232951.getClass(), "itsVariableNames", null);
        setIntField(term232951, term232951.getClass(), "varStart", 0);
        setField(term232951, term232951.getClass(), "compilerData", null);
        setIntField(term232951, term232951.getClass(), "type", 33);
        setField(term232961, term232961.getClass(), "functionName", null);
        setBooleanField(term232961, term232961.getClass(), "itsNeedsActivation", false);
        setIntField(term232961, term232961.getClass(), "itsFunctionType", 0);
        setBooleanField(term232961, term232961.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term232961, term232961.getClass(), "encodedSourceStart", 0);
        setIntField(term232961, term232961.getClass(), "encodedSourceEnd", 0);
        setField(term232961, term232961.getClass(), "sourceName", null);
        setIntField(term232961, term232961.getClass(), "baseLineno", 0);
        setIntField(term232961, term232961.getClass(), "endLineno", 0);
        setField(term232961, term232961.getClass(), "functions", null);
        setField(term232961, term232961.getClass(), "regexps", null);
        setField(term232961, term232961.getClass(), "itsVariables", null);
        setField(term232961, term232961.getClass(), "itsConst", null);
        setField(term232961, term232961.getClass(), "itsVariableNames", null);
        setIntField(term232961, term232961.getClass(), "varStart", 0);
        setField(term232961, term232961.getClass(), "compilerData", null);
        setIntField(term232961, term232961.getClass(), "type", 0);
        setField(term232961, term232961.getClass(), "next", null);
        setField(term232961, term232961.getClass(), "first", null);
        setField(term232961, term232961.getClass(), "last", null);
        setField(term232961, term232961.getClass(), "propListHead", null);
        setIntField(term232961, term232961.getClass(), "sourcePosition", 0);
        setField(term232961, term232961.getClass(), "jsType", null);
        setField(term232961, term232961.getClass(), "parent", null);
        setField(term232951, term232951.getClass(), "next", term232961);
        setField(term232951, term232951.getClass(), "first", term232951);
        setField(term232951, term232951.getClass(), "last", null);
        setField(term232951, term232951.getClass(), "propListHead", null);
        setIntField(term232951, term232951.getClass(), "sourcePosition", 0);
        setField(term232951, term232951.getClass(), "jsType", null);
        setField(term232951, term232951.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term232427;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term232341, args);
        assertTrue(recursiveEquals(term232341, term233016));
        assertTrue(recursiveEquals(term232427, term233017));
        assertTrue(recursiveEquals(retValue, term232951));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531577;
     Object term531669;
     Object term531948;
     Object term531949;
     Object term531864;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531577 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term531669 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term531841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term531841, term531841.getClass(), "type", 42);
        setField(term531755, term531755.getClass(), "next", term531841);
        setIntField(term531755, term531755.getClass(), "type", 42);
        setField(term531669, term531669.getClass(), "first", term531755);
        setIntField(term531669, term531669.getClass(), "type", 16);
        term531948 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term531948, term531948.getClass(), "currentTraversal", null);
        term531949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term531951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term531949, term531949.getClass(), "str", null);
        setIntField(term531949, term531949.getClass(), "type", 16);
        setField(term531949, term531949.getClass(), "next", null);
        setField(term531950, term531950.getClass(), "functionName", null);
        setBooleanField(term531950, term531950.getClass(), "itsNeedsActivation", false);
        setIntField(term531950, term531950.getClass(), "itsFunctionType", 0);
        setBooleanField(term531950, term531950.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term531950, term531950.getClass(), "encodedSourceStart", 0);
        setIntField(term531950, term531950.getClass(), "encodedSourceEnd", 0);
        setField(term531950, term531950.getClass(), "sourceName", null);
        setIntField(term531950, term531950.getClass(), "baseLineno", 0);
        setIntField(term531950, term531950.getClass(), "endLineno", 0);
        setField(term531950, term531950.getClass(), "functions", null);
        setField(term531950, term531950.getClass(), "regexps", null);
        setField(term531950, term531950.getClass(), "itsVariables", null);
        setField(term531950, term531950.getClass(), "itsConst", null);
        setField(term531950, term531950.getClass(), "itsVariableNames", null);
        setIntField(term531950, term531950.getClass(), "varStart", 0);
        setField(term531950, term531950.getClass(), "compilerData", null);
        setIntField(term531950, term531950.getClass(), "type", 42);
        setField(term531951, term531951.getClass(), "functionName", null);
        setBooleanField(term531951, term531951.getClass(), "itsNeedsActivation", false);
        setIntField(term531951, term531951.getClass(), "itsFunctionType", 0);
        setBooleanField(term531951, term531951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term531951, term531951.getClass(), "encodedSourceStart", 0);
        setIntField(term531951, term531951.getClass(), "encodedSourceEnd", 0);
        setField(term531951, term531951.getClass(), "sourceName", null);
        setIntField(term531951, term531951.getClass(), "baseLineno", 0);
        setIntField(term531951, term531951.getClass(), "endLineno", 0);
        setField(term531951, term531951.getClass(), "functions", null);
        setField(term531951, term531951.getClass(), "regexps", null);
        setField(term531951, term531951.getClass(), "itsVariables", null);
        setField(term531951, term531951.getClass(), "itsConst", null);
        setField(term531951, term531951.getClass(), "itsVariableNames", null);
        setIntField(term531951, term531951.getClass(), "varStart", 0);
        setField(term531951, term531951.getClass(), "compilerData", null);
        setIntField(term531951, term531951.getClass(), "type", 42);
        setField(term531951, term531951.getClass(), "next", null);
        setField(term531951, term531951.getClass(), "first", null);
        setField(term531951, term531951.getClass(), "last", null);
        setField(term531951, term531951.getClass(), "propListHead", null);
        setIntField(term531951, term531951.getClass(), "sourcePosition", 0);
        setField(term531951, term531951.getClass(), "jsType", null);
        setField(term531951, term531951.getClass(), "parent", null);
        setField(term531950, term531950.getClass(), "next", term531951);
        setField(term531950, term531950.getClass(), "first", null);
        setField(term531950, term531950.getClass(), "last", null);
        setField(term531950, term531950.getClass(), "propListHead", null);
        setIntField(term531950, term531950.getClass(), "sourcePosition", 0);
        setField(term531950, term531950.getClass(), "jsType", null);
        setField(term531950, term531950.getClass(), "parent", null);
        setField(term531949, term531949.getClass(), "first", term531950);
        setField(term531949, term531949.getClass(), "last", null);
        setField(term531949, term531949.getClass(), "propListHead", null);
        setIntField(term531949, term531949.getClass(), "sourcePosition", 0);
        setField(term531949, term531949.getClass(), "jsType", null);
        setField(term531949, term531949.getClass(), "parent", null);
        term531864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term531876 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term531864, term531864.getClass(), "str", null);
        setIntField(term531864, term531864.getClass(), "type", 16);
        setField(term531864, term531864.getClass(), "next", null);
        setField(term531866, term531866.getClass(), "functionName", null);
        setBooleanField(term531866, term531866.getClass(), "itsNeedsActivation", false);
        setIntField(term531866, term531866.getClass(), "itsFunctionType", 0);
        setBooleanField(term531866, term531866.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term531866, term531866.getClass(), "encodedSourceStart", 0);
        setIntField(term531866, term531866.getClass(), "encodedSourceEnd", 0);
        setField(term531866, term531866.getClass(), "sourceName", null);
        setIntField(term531866, term531866.getClass(), "baseLineno", 0);
        setIntField(term531866, term531866.getClass(), "endLineno", 0);
        setField(term531866, term531866.getClass(), "functions", null);
        setField(term531866, term531866.getClass(), "regexps", null);
        setField(term531866, term531866.getClass(), "itsVariables", null);
        setField(term531866, term531866.getClass(), "itsConst", null);
        setField(term531866, term531866.getClass(), "itsVariableNames", null);
        setIntField(term531866, term531866.getClass(), "varStart", 0);
        setField(term531866, term531866.getClass(), "compilerData", null);
        setIntField(term531866, term531866.getClass(), "type", 42);
        setField(term531876, term531876.getClass(), "functionName", null);
        setBooleanField(term531876, term531876.getClass(), "itsNeedsActivation", false);
        setIntField(term531876, term531876.getClass(), "itsFunctionType", 0);
        setBooleanField(term531876, term531876.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term531876, term531876.getClass(), "encodedSourceStart", 0);
        setIntField(term531876, term531876.getClass(), "encodedSourceEnd", 0);
        setField(term531876, term531876.getClass(), "sourceName", null);
        setIntField(term531876, term531876.getClass(), "baseLineno", 0);
        setIntField(term531876, term531876.getClass(), "endLineno", 0);
        setField(term531876, term531876.getClass(), "functions", null);
        setField(term531876, term531876.getClass(), "regexps", null);
        setField(term531876, term531876.getClass(), "itsVariables", null);
        setField(term531876, term531876.getClass(), "itsConst", null);
        setField(term531876, term531876.getClass(), "itsVariableNames", null);
        setIntField(term531876, term531876.getClass(), "varStart", 0);
        setField(term531876, term531876.getClass(), "compilerData", null);
        setIntField(term531876, term531876.getClass(), "type", 42);
        setField(term531876, term531876.getClass(), "next", null);
        setField(term531876, term531876.getClass(), "first", null);
        setField(term531876, term531876.getClass(), "last", null);
        setField(term531876, term531876.getClass(), "propListHead", null);
        setIntField(term531876, term531876.getClass(), "sourcePosition", 0);
        setField(term531876, term531876.getClass(), "jsType", null);
        setField(term531876, term531876.getClass(), "parent", null);
        setField(term531866, term531866.getClass(), "next", term531876);
        setField(term531866, term531866.getClass(), "first", null);
        setField(term531866, term531866.getClass(), "last", null);
        setField(term531866, term531866.getClass(), "propListHead", null);
        setIntField(term531866, term531866.getClass(), "sourcePosition", 0);
        setField(term531866, term531866.getClass(), "jsType", null);
        setField(term531866, term531866.getClass(), "parent", null);
        setField(term531864, term531864.getClass(), "first", term531866);
        setField(term531864, term531864.getClass(), "last", null);
        setField(term531864, term531864.getClass(), "propListHead", null);
        setIntField(term531864, term531864.getClass(), "sourcePosition", 0);
        setField(term531864, term531864.getClass(), "jsType", null);
        setField(term531864, term531864.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term531669;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term531577, args);
        assertTrue(recursiveEquals(term531577, term531948));
        assertTrue(recursiveEquals(term531669, term531949));
        assertTrue(recursiveEquals(retValue, term531864));
    }

};



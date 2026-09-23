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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161826;
     Object term161912;
     Object term162532;
     Object term162533;
     Object term162468;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161826 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term161912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term161998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term161998, term161998.getClass(), "next", term162090);
        setIntField(term161998, term161998.getClass(), "type", 39);
        setField(term161912, term161912.getClass(), "first", term161998);
        setIntField(term161912, term161912.getClass(), "type", 20);
        term162532 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term162532, term162532.getClass(), "currentTraversal", null);
        term162533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term162533, term162533.getClass(), "functionName", null);
        setBooleanField(term162533, term162533.getClass(), "itsNeedsActivation", false);
        setIntField(term162533, term162533.getClass(), "itsFunctionType", 0);
        setBooleanField(term162533, term162533.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162533, term162533.getClass(), "encodedSourceStart", 0);
        setIntField(term162533, term162533.getClass(), "encodedSourceEnd", 0);
        setField(term162533, term162533.getClass(), "sourceName", null);
        setIntField(term162533, term162533.getClass(), "baseLineno", 0);
        setIntField(term162533, term162533.getClass(), "endLineno", 0);
        setField(term162533, term162533.getClass(), "functions", null);
        setField(term162533, term162533.getClass(), "regexps", null);
        setField(term162533, term162533.getClass(), "itsVariables", null);
        setField(term162533, term162533.getClass(), "itsConst", null);
        setField(term162533, term162533.getClass(), "itsVariableNames", null);
        setIntField(term162533, term162533.getClass(), "varStart", 0);
        setField(term162533, term162533.getClass(), "compilerData", null);
        setIntField(term162533, term162533.getClass(), "type", 20);
        setField(term162533, term162533.getClass(), "next", null);
        setField(term162534, term162534.getClass(), "functionName", null);
        setBooleanField(term162534, term162534.getClass(), "itsNeedsActivation", false);
        setIntField(term162534, term162534.getClass(), "itsFunctionType", 0);
        setBooleanField(term162534, term162534.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162534, term162534.getClass(), "encodedSourceStart", 0);
        setIntField(term162534, term162534.getClass(), "encodedSourceEnd", 0);
        setField(term162534, term162534.getClass(), "sourceName", null);
        setIntField(term162534, term162534.getClass(), "baseLineno", 0);
        setIntField(term162534, term162534.getClass(), "endLineno", 0);
        setField(term162534, term162534.getClass(), "functions", null);
        setField(term162534, term162534.getClass(), "regexps", null);
        setField(term162534, term162534.getClass(), "itsVariables", null);
        setField(term162534, term162534.getClass(), "itsConst", null);
        setField(term162534, term162534.getClass(), "itsVariableNames", null);
        setIntField(term162534, term162534.getClass(), "varStart", 0);
        setField(term162534, term162534.getClass(), "compilerData", null);
        setIntField(term162534, term162534.getClass(), "type", 39);
        setDoubleField(term162535, term162535.getClass(), "number", 0.0);
        setIntField(term162535, term162535.getClass(), "type", 0);
        setField(term162535, term162535.getClass(), "next", null);
        setField(term162535, term162535.getClass(), "first", null);
        setField(term162535, term162535.getClass(), "last", null);
        setField(term162535, term162535.getClass(), "propListHead", null);
        setIntField(term162535, term162535.getClass(), "sourcePosition", 0);
        setField(term162535, term162535.getClass(), "jsType", null);
        setField(term162535, term162535.getClass(), "parent", null);
        setField(term162534, term162534.getClass(), "next", term162535);
        setField(term162534, term162534.getClass(), "first", null);
        setField(term162534, term162534.getClass(), "last", null);
        setField(term162534, term162534.getClass(), "propListHead", null);
        setIntField(term162534, term162534.getClass(), "sourcePosition", 0);
        setField(term162534, term162534.getClass(), "jsType", null);
        setField(term162534, term162534.getClass(), "parent", null);
        setField(term162533, term162533.getClass(), "first", term162534);
        setField(term162533, term162533.getClass(), "last", null);
        setField(term162533, term162533.getClass(), "propListHead", null);
        setIntField(term162533, term162533.getClass(), "sourcePosition", 0);
        setField(term162533, term162533.getClass(), "jsType", null);
        setField(term162533, term162533.getClass(), "parent", null);
        term162468 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162478 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term162488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term162468, term162468.getClass(), "functionName", null);
        setBooleanField(term162468, term162468.getClass(), "itsNeedsActivation", false);
        setIntField(term162468, term162468.getClass(), "itsFunctionType", 0);
        setBooleanField(term162468, term162468.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162468, term162468.getClass(), "encodedSourceStart", 0);
        setIntField(term162468, term162468.getClass(), "encodedSourceEnd", 0);
        setField(term162468, term162468.getClass(), "sourceName", null);
        setIntField(term162468, term162468.getClass(), "baseLineno", 0);
        setIntField(term162468, term162468.getClass(), "endLineno", 0);
        setField(term162468, term162468.getClass(), "functions", null);
        setField(term162468, term162468.getClass(), "regexps", null);
        setField(term162468, term162468.getClass(), "itsVariables", null);
        setField(term162468, term162468.getClass(), "itsConst", null);
        setField(term162468, term162468.getClass(), "itsVariableNames", null);
        setIntField(term162468, term162468.getClass(), "varStart", 0);
        setField(term162468, term162468.getClass(), "compilerData", null);
        setIntField(term162468, term162468.getClass(), "type", 20);
        setField(term162468, term162468.getClass(), "next", null);
        setField(term162478, term162478.getClass(), "functionName", null);
        setBooleanField(term162478, term162478.getClass(), "itsNeedsActivation", false);
        setIntField(term162478, term162478.getClass(), "itsFunctionType", 0);
        setBooleanField(term162478, term162478.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term162478, term162478.getClass(), "encodedSourceStart", 0);
        setIntField(term162478, term162478.getClass(), "encodedSourceEnd", 0);
        setField(term162478, term162478.getClass(), "sourceName", null);
        setIntField(term162478, term162478.getClass(), "baseLineno", 0);
        setIntField(term162478, term162478.getClass(), "endLineno", 0);
        setField(term162478, term162478.getClass(), "functions", null);
        setField(term162478, term162478.getClass(), "regexps", null);
        setField(term162478, term162478.getClass(), "itsVariables", null);
        setField(term162478, term162478.getClass(), "itsConst", null);
        setField(term162478, term162478.getClass(), "itsVariableNames", null);
        setIntField(term162478, term162478.getClass(), "varStart", 0);
        setField(term162478, term162478.getClass(), "compilerData", null);
        setIntField(term162478, term162478.getClass(), "type", 39);
        setDoubleField(term162488, term162488.getClass(), "number", 0.0);
        setIntField(term162488, term162488.getClass(), "type", 0);
        setField(term162488, term162488.getClass(), "next", null);
        setField(term162488, term162488.getClass(), "first", null);
        setField(term162488, term162488.getClass(), "last", null);
        setField(term162488, term162488.getClass(), "propListHead", null);
        setIntField(term162488, term162488.getClass(), "sourcePosition", 0);
        setField(term162488, term162488.getClass(), "jsType", null);
        setField(term162488, term162488.getClass(), "parent", null);
        setField(term162478, term162478.getClass(), "next", term162488);
        setField(term162478, term162478.getClass(), "first", null);
        setField(term162478, term162478.getClass(), "last", null);
        setField(term162478, term162478.getClass(), "propListHead", null);
        setIntField(term162478, term162478.getClass(), "sourcePosition", 0);
        setField(term162478, term162478.getClass(), "jsType", null);
        setField(term162478, term162478.getClass(), "parent", null);
        setField(term162468, term162468.getClass(), "first", term162478);
        setField(term162468, term162468.getClass(), "last", null);
        setField(term162468, term162468.getClass(), "propListHead", null);
        setIntField(term162468, term162468.getClass(), "sourcePosition", 0);
        setField(term162468, term162468.getClass(), "jsType", null);
        setField(term162468, term162468.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term161912;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term161826, args);
        assertTrue(recursiveEquals(term161826, term162532));
        assertTrue(recursiveEquals(term161912, term162533));
        assertTrue(recursiveEquals(retValue, term162468));
    }

};



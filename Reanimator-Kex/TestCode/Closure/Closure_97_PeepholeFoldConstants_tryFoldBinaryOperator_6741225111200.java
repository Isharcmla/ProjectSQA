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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366168;
     Object term366254;
     Object term366529;
     Object term366530;
     Object term366448;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term366254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term366432, term366432.getClass(), "type", 42);
        setField(term366340, term366340.getClass(), "next", term366432);
        setIntField(term366340, term366340.getClass(), "type", 42);
        setField(term366254, term366254.getClass(), "first", term366340);
        setIntField(term366254, term366254.getClass(), "type", 14);
        term366529 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term366529, term366529.getClass(), "currentTraversal", null);
        term366530 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366531 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term366530, term366530.getClass(), "functionName", null);
        setBooleanField(term366530, term366530.getClass(), "itsNeedsActivation", false);
        setIntField(term366530, term366530.getClass(), "itsFunctionType", 0);
        setBooleanField(term366530, term366530.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term366530, term366530.getClass(), "encodedSourceStart", 0);
        setIntField(term366530, term366530.getClass(), "encodedSourceEnd", 0);
        setField(term366530, term366530.getClass(), "sourceName", null);
        setIntField(term366530, term366530.getClass(), "baseLineno", 0);
        setIntField(term366530, term366530.getClass(), "endLineno", 0);
        setField(term366530, term366530.getClass(), "functions", null);
        setField(term366530, term366530.getClass(), "regexps", null);
        setField(term366530, term366530.getClass(), "itsVariables", null);
        setField(term366530, term366530.getClass(), "itsConst", null);
        setField(term366530, term366530.getClass(), "itsVariableNames", null);
        setIntField(term366530, term366530.getClass(), "varStart", 0);
        setField(term366530, term366530.getClass(), "compilerData", null);
        setIntField(term366530, term366530.getClass(), "type", 14);
        setField(term366530, term366530.getClass(), "next", null);
        setField(term366531, term366531.getClass(), "functionName", null);
        setBooleanField(term366531, term366531.getClass(), "itsNeedsActivation", false);
        setIntField(term366531, term366531.getClass(), "itsFunctionType", 0);
        setBooleanField(term366531, term366531.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term366531, term366531.getClass(), "encodedSourceStart", 0);
        setIntField(term366531, term366531.getClass(), "encodedSourceEnd", 0);
        setField(term366531, term366531.getClass(), "sourceName", null);
        setIntField(term366531, term366531.getClass(), "baseLineno", 0);
        setIntField(term366531, term366531.getClass(), "endLineno", 0);
        setField(term366531, term366531.getClass(), "functions", null);
        setField(term366531, term366531.getClass(), "regexps", null);
        setField(term366531, term366531.getClass(), "itsVariables", null);
        setField(term366531, term366531.getClass(), "itsConst", null);
        setField(term366531, term366531.getClass(), "itsVariableNames", null);
        setIntField(term366531, term366531.getClass(), "varStart", 0);
        setField(term366531, term366531.getClass(), "compilerData", null);
        setIntField(term366531, term366531.getClass(), "type", 42);
        setDoubleField(term366532, term366532.getClass(), "number", 0.0);
        setIntField(term366532, term366532.getClass(), "type", 42);
        setField(term366532, term366532.getClass(), "next", null);
        setField(term366532, term366532.getClass(), "first", null);
        setField(term366532, term366532.getClass(), "last", null);
        setField(term366532, term366532.getClass(), "propListHead", null);
        setIntField(term366532, term366532.getClass(), "sourcePosition", 0);
        setField(term366532, term366532.getClass(), "jsType", null);
        setField(term366532, term366532.getClass(), "parent", null);
        setField(term366531, term366531.getClass(), "next", term366532);
        setField(term366531, term366531.getClass(), "first", null);
        setField(term366531, term366531.getClass(), "last", null);
        setField(term366531, term366531.getClass(), "propListHead", null);
        setIntField(term366531, term366531.getClass(), "sourcePosition", 0);
        setField(term366531, term366531.getClass(), "jsType", null);
        setField(term366531, term366531.getClass(), "parent", null);
        setField(term366530, term366530.getClass(), "first", term366531);
        setField(term366530, term366530.getClass(), "last", null);
        setField(term366530, term366530.getClass(), "propListHead", null);
        setIntField(term366530, term366530.getClass(), "sourcePosition", 0);
        setField(term366530, term366530.getClass(), "jsType", null);
        setField(term366530, term366530.getClass(), "parent", null);
        term366448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term366468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term366448, term366448.getClass(), "functionName", null);
        setBooleanField(term366448, term366448.getClass(), "itsNeedsActivation", false);
        setIntField(term366448, term366448.getClass(), "itsFunctionType", 0);
        setBooleanField(term366448, term366448.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term366448, term366448.getClass(), "encodedSourceStart", 0);
        setIntField(term366448, term366448.getClass(), "encodedSourceEnd", 0);
        setField(term366448, term366448.getClass(), "sourceName", null);
        setIntField(term366448, term366448.getClass(), "baseLineno", 0);
        setIntField(term366448, term366448.getClass(), "endLineno", 0);
        setField(term366448, term366448.getClass(), "functions", null);
        setField(term366448, term366448.getClass(), "regexps", null);
        setField(term366448, term366448.getClass(), "itsVariables", null);
        setField(term366448, term366448.getClass(), "itsConst", null);
        setField(term366448, term366448.getClass(), "itsVariableNames", null);
        setIntField(term366448, term366448.getClass(), "varStart", 0);
        setField(term366448, term366448.getClass(), "compilerData", null);
        setIntField(term366448, term366448.getClass(), "type", 14);
        setField(term366448, term366448.getClass(), "next", null);
        setField(term366458, term366458.getClass(), "functionName", null);
        setBooleanField(term366458, term366458.getClass(), "itsNeedsActivation", false);
        setIntField(term366458, term366458.getClass(), "itsFunctionType", 0);
        setBooleanField(term366458, term366458.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term366458, term366458.getClass(), "encodedSourceStart", 0);
        setIntField(term366458, term366458.getClass(), "encodedSourceEnd", 0);
        setField(term366458, term366458.getClass(), "sourceName", null);
        setIntField(term366458, term366458.getClass(), "baseLineno", 0);
        setIntField(term366458, term366458.getClass(), "endLineno", 0);
        setField(term366458, term366458.getClass(), "functions", null);
        setField(term366458, term366458.getClass(), "regexps", null);
        setField(term366458, term366458.getClass(), "itsVariables", null);
        setField(term366458, term366458.getClass(), "itsConst", null);
        setField(term366458, term366458.getClass(), "itsVariableNames", null);
        setIntField(term366458, term366458.getClass(), "varStart", 0);
        setField(term366458, term366458.getClass(), "compilerData", null);
        setIntField(term366458, term366458.getClass(), "type", 42);
        setDoubleField(term366468, term366468.getClass(), "number", 0.0);
        setIntField(term366468, term366468.getClass(), "type", 42);
        setField(term366468, term366468.getClass(), "next", null);
        setField(term366468, term366468.getClass(), "first", null);
        setField(term366468, term366468.getClass(), "last", null);
        setField(term366468, term366468.getClass(), "propListHead", null);
        setIntField(term366468, term366468.getClass(), "sourcePosition", 0);
        setField(term366468, term366468.getClass(), "jsType", null);
        setField(term366468, term366468.getClass(), "parent", null);
        setField(term366458, term366458.getClass(), "next", term366468);
        setField(term366458, term366458.getClass(), "first", null);
        setField(term366458, term366458.getClass(), "last", null);
        setField(term366458, term366458.getClass(), "propListHead", null);
        setIntField(term366458, term366458.getClass(), "sourcePosition", 0);
        setField(term366458, term366458.getClass(), "jsType", null);
        setField(term366458, term366458.getClass(), "parent", null);
        setField(term366448, term366448.getClass(), "first", term366458);
        setField(term366448, term366448.getClass(), "last", null);
        setField(term366448, term366448.getClass(), "propListHead", null);
        setIntField(term366448, term366448.getClass(), "sourcePosition", 0);
        setField(term366448, term366448.getClass(), "jsType", null);
        setField(term366448, term366448.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term366254;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term366168, args);
        assertTrue(recursiveEquals(term366168, term366529));
        assertTrue(recursiveEquals(term366254, term366530));
        assertTrue(recursiveEquals(retValue, term366448));
    }

};



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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706982;
     Object term707068;
     Object term707246;
     Object term707338;
     Object term707445;
     Object term707446;
     Object term707448;
     Object term707449;
     Object term707350;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706982 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term707068 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term707154, term707154.getClass(), "type", 114);
        setField(term707068, term707068.getClass(), "parent", term707154);
        setIntField(term707068, term707068.getClass(), "type", 0);
        term707246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term707246, term707246.getClass(), "type", 48);
        term707338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term707338, term707338.getClass(), "type", 63);
        term707445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term707445, term707445.getClass(), "currentTraversal", null);
        term707446 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707447 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707446, term707446.getClass(), "functionName", null);
        setBooleanField(term707446, term707446.getClass(), "itsNeedsActivation", false);
        setIntField(term707446, term707446.getClass(), "itsFunctionType", 0);
        setBooleanField(term707446, term707446.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707446, term707446.getClass(), "encodedSourceStart", 0);
        setIntField(term707446, term707446.getClass(), "encodedSourceEnd", 0);
        setField(term707446, term707446.getClass(), "sourceName", null);
        setIntField(term707446, term707446.getClass(), "baseLineno", 0);
        setIntField(term707446, term707446.getClass(), "endLineno", 0);
        setField(term707446, term707446.getClass(), "functions", null);
        setField(term707446, term707446.getClass(), "regexps", null);
        setField(term707446, term707446.getClass(), "itsVariables", null);
        setField(term707446, term707446.getClass(), "itsConst", null);
        setField(term707446, term707446.getClass(), "itsVariableNames", null);
        setIntField(term707446, term707446.getClass(), "varStart", 0);
        setField(term707446, term707446.getClass(), "compilerData", null);
        setIntField(term707446, term707446.getClass(), "type", 0);
        setField(term707446, term707446.getClass(), "next", null);
        setField(term707446, term707446.getClass(), "first", null);
        setField(term707446, term707446.getClass(), "last", null);
        setField(term707446, term707446.getClass(), "propListHead", null);
        setIntField(term707446, term707446.getClass(), "sourcePosition", 0);
        setField(term707446, term707446.getClass(), "jsType", null);
        setField(term707447, term707447.getClass(), "functionName", null);
        setBooleanField(term707447, term707447.getClass(), "itsNeedsActivation", false);
        setIntField(term707447, term707447.getClass(), "itsFunctionType", 0);
        setBooleanField(term707447, term707447.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707447, term707447.getClass(), "encodedSourceStart", 0);
        setIntField(term707447, term707447.getClass(), "encodedSourceEnd", 0);
        setField(term707447, term707447.getClass(), "sourceName", null);
        setIntField(term707447, term707447.getClass(), "baseLineno", 0);
        setIntField(term707447, term707447.getClass(), "endLineno", 0);
        setField(term707447, term707447.getClass(), "functions", null);
        setField(term707447, term707447.getClass(), "regexps", null);
        setField(term707447, term707447.getClass(), "itsVariables", null);
        setField(term707447, term707447.getClass(), "itsConst", null);
        setField(term707447, term707447.getClass(), "itsVariableNames", null);
        setIntField(term707447, term707447.getClass(), "varStart", 0);
        setField(term707447, term707447.getClass(), "compilerData", null);
        setIntField(term707447, term707447.getClass(), "type", 114);
        setField(term707447, term707447.getClass(), "next", null);
        setField(term707447, term707447.getClass(), "first", null);
        setField(term707447, term707447.getClass(), "last", null);
        setField(term707447, term707447.getClass(), "propListHead", null);
        setIntField(term707447, term707447.getClass(), "sourcePosition", 0);
        setField(term707447, term707447.getClass(), "jsType", null);
        setField(term707447, term707447.getClass(), "parent", null);
        setField(term707446, term707446.getClass(), "parent", term707447);
        term707448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term707448, term707448.getClass(), "number", 0.0);
        setIntField(term707448, term707448.getClass(), "type", 48);
        setField(term707448, term707448.getClass(), "next", null);
        setField(term707448, term707448.getClass(), "first", null);
        setField(term707448, term707448.getClass(), "last", null);
        setField(term707448, term707448.getClass(), "propListHead", null);
        setIntField(term707448, term707448.getClass(), "sourcePosition", 0);
        setField(term707448, term707448.getClass(), "jsType", null);
        setField(term707448, term707448.getClass(), "parent", null);
        term707449 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term707449, term707449.getClass(), "number", 0.0);
        setIntField(term707449, term707449.getClass(), "type", 63);
        setField(term707449, term707449.getClass(), "next", null);
        setField(term707449, term707449.getClass(), "first", null);
        setField(term707449, term707449.getClass(), "last", null);
        setField(term707449, term707449.getClass(), "propListHead", null);
        setIntField(term707449, term707449.getClass(), "sourcePosition", 0);
        setField(term707449, term707449.getClass(), "jsType", null);
        setField(term707449, term707449.getClass(), "parent", null);
        term707350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term707361 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term707350, term707350.getClass(), "functionName", null);
        setBooleanField(term707350, term707350.getClass(), "itsNeedsActivation", false);
        setIntField(term707350, term707350.getClass(), "itsFunctionType", 0);
        setBooleanField(term707350, term707350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707350, term707350.getClass(), "encodedSourceStart", 0);
        setIntField(term707350, term707350.getClass(), "encodedSourceEnd", 0);
        setField(term707350, term707350.getClass(), "sourceName", null);
        setIntField(term707350, term707350.getClass(), "baseLineno", 0);
        setIntField(term707350, term707350.getClass(), "endLineno", 0);
        setField(term707350, term707350.getClass(), "functions", null);
        setField(term707350, term707350.getClass(), "regexps", null);
        setField(term707350, term707350.getClass(), "itsVariables", null);
        setField(term707350, term707350.getClass(), "itsConst", null);
        setField(term707350, term707350.getClass(), "itsVariableNames", null);
        setIntField(term707350, term707350.getClass(), "varStart", 0);
        setField(term707350, term707350.getClass(), "compilerData", null);
        setIntField(term707350, term707350.getClass(), "type", 0);
        setField(term707350, term707350.getClass(), "next", null);
        setField(term707350, term707350.getClass(), "first", null);
        setField(term707350, term707350.getClass(), "last", null);
        setField(term707350, term707350.getClass(), "propListHead", null);
        setIntField(term707350, term707350.getClass(), "sourcePosition", 0);
        setField(term707350, term707350.getClass(), "jsType", null);
        setField(term707361, term707361.getClass(), "functionName", null);
        setBooleanField(term707361, term707361.getClass(), "itsNeedsActivation", false);
        setIntField(term707361, term707361.getClass(), "itsFunctionType", 0);
        setBooleanField(term707361, term707361.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term707361, term707361.getClass(), "encodedSourceStart", 0);
        setIntField(term707361, term707361.getClass(), "encodedSourceEnd", 0);
        setField(term707361, term707361.getClass(), "sourceName", null);
        setIntField(term707361, term707361.getClass(), "baseLineno", 0);
        setIntField(term707361, term707361.getClass(), "endLineno", 0);
        setField(term707361, term707361.getClass(), "functions", null);
        setField(term707361, term707361.getClass(), "regexps", null);
        setField(term707361, term707361.getClass(), "itsVariables", null);
        setField(term707361, term707361.getClass(), "itsConst", null);
        setField(term707361, term707361.getClass(), "itsVariableNames", null);
        setIntField(term707361, term707361.getClass(), "varStart", 0);
        setField(term707361, term707361.getClass(), "compilerData", null);
        setIntField(term707361, term707361.getClass(), "type", 114);
        setField(term707361, term707361.getClass(), "next", null);
        setField(term707361, term707361.getClass(), "first", null);
        setField(term707361, term707361.getClass(), "last", null);
        setField(term707361, term707361.getClass(), "propListHead", null);
        setIntField(term707361, term707361.getClass(), "sourcePosition", 0);
        setField(term707361, term707361.getClass(), "jsType", null);
        setField(term707361, term707361.getClass(), "parent", null);
        setField(term707350, term707350.getClass(), "parent", term707361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term707068;
        args[1] = term707246;
        args[2] = term707338;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term706982, args);
        assertTrue(recursiveEquals(term706982, term707445));
        assertTrue(recursiveEquals(term707068, term707446));
        assertTrue(recursiveEquals(term707246, term707448));
        assertTrue(recursiveEquals(term707338, term707449));
        assertTrue(recursiveEquals(retValue, term707350));
    }

};



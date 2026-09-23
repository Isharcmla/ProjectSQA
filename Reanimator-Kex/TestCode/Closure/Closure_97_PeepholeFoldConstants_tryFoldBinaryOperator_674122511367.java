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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85089;
     Object term85175;
     Object term85785;
     Object term85786;
     Object term85700;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85089 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term85175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85261 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term85261, term85261.getClass(), "next", term85353);
        setIntField(term85261, term85261.getClass(), "type", 0);
        setField(term85175, term85175.getClass(), "first", term85261);
        setIntField(term85175, term85175.getClass(), "type", 100);
        setField(term85175, term85175.getClass(), "parent", null);
        term85785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term85785, term85785.getClass(), "currentTraversal", null);
        term85786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term85786, term85786.getClass(), "functionName", null);
        setBooleanField(term85786, term85786.getClass(), "itsNeedsActivation", false);
        setIntField(term85786, term85786.getClass(), "itsFunctionType", 0);
        setBooleanField(term85786, term85786.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85786, term85786.getClass(), "encodedSourceStart", 0);
        setIntField(term85786, term85786.getClass(), "encodedSourceEnd", 0);
        setField(term85786, term85786.getClass(), "sourceName", null);
        setIntField(term85786, term85786.getClass(), "baseLineno", 0);
        setIntField(term85786, term85786.getClass(), "endLineno", 0);
        setField(term85786, term85786.getClass(), "functions", null);
        setField(term85786, term85786.getClass(), "regexps", null);
        setField(term85786, term85786.getClass(), "itsVariables", null);
        setField(term85786, term85786.getClass(), "itsConst", null);
        setField(term85786, term85786.getClass(), "itsVariableNames", null);
        setIntField(term85786, term85786.getClass(), "varStart", 0);
        setField(term85786, term85786.getClass(), "compilerData", null);
        setIntField(term85786, term85786.getClass(), "type", 100);
        setField(term85786, term85786.getClass(), "next", null);
        setField(term85787, term85787.getClass(), "functionName", null);
        setBooleanField(term85787, term85787.getClass(), "itsNeedsActivation", false);
        setIntField(term85787, term85787.getClass(), "itsFunctionType", 0);
        setBooleanField(term85787, term85787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85787, term85787.getClass(), "encodedSourceStart", 0);
        setIntField(term85787, term85787.getClass(), "encodedSourceEnd", 0);
        setField(term85787, term85787.getClass(), "sourceName", null);
        setIntField(term85787, term85787.getClass(), "baseLineno", 0);
        setIntField(term85787, term85787.getClass(), "endLineno", 0);
        setField(term85787, term85787.getClass(), "functions", null);
        setField(term85787, term85787.getClass(), "regexps", null);
        setField(term85787, term85787.getClass(), "itsVariables", null);
        setField(term85787, term85787.getClass(), "itsConst", null);
        setField(term85787, term85787.getClass(), "itsVariableNames", null);
        setIntField(term85787, term85787.getClass(), "varStart", 0);
        setField(term85787, term85787.getClass(), "compilerData", null);
        setIntField(term85787, term85787.getClass(), "type", 0);
        setField(term85788, term85788.getClass(), "str", null);
        setIntField(term85788, term85788.getClass(), "type", 0);
        setField(term85788, term85788.getClass(), "next", null);
        setField(term85788, term85788.getClass(), "first", null);
        setField(term85788, term85788.getClass(), "last", null);
        setField(term85788, term85788.getClass(), "propListHead", null);
        setIntField(term85788, term85788.getClass(), "sourcePosition", 0);
        setField(term85788, term85788.getClass(), "jsType", null);
        setField(term85788, term85788.getClass(), "parent", null);
        setField(term85787, term85787.getClass(), "next", term85788);
        setField(term85787, term85787.getClass(), "first", null);
        setField(term85787, term85787.getClass(), "last", null);
        setField(term85787, term85787.getClass(), "propListHead", null);
        setIntField(term85787, term85787.getClass(), "sourcePosition", 0);
        setField(term85787, term85787.getClass(), "jsType", null);
        setField(term85787, term85787.getClass(), "parent", null);
        setField(term85786, term85786.getClass(), "first", term85787);
        setField(term85786, term85786.getClass(), "last", null);
        setField(term85786, term85786.getClass(), "propListHead", null);
        setIntField(term85786, term85786.getClass(), "sourcePosition", 0);
        setField(term85786, term85786.getClass(), "jsType", null);
        setField(term85786, term85786.getClass(), "parent", null);
        term85700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85710 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term85700, term85700.getClass(), "functionName", null);
        setBooleanField(term85700, term85700.getClass(), "itsNeedsActivation", false);
        setIntField(term85700, term85700.getClass(), "itsFunctionType", 0);
        setBooleanField(term85700, term85700.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85700, term85700.getClass(), "encodedSourceStart", 0);
        setIntField(term85700, term85700.getClass(), "encodedSourceEnd", 0);
        setField(term85700, term85700.getClass(), "sourceName", null);
        setIntField(term85700, term85700.getClass(), "baseLineno", 0);
        setIntField(term85700, term85700.getClass(), "endLineno", 0);
        setField(term85700, term85700.getClass(), "functions", null);
        setField(term85700, term85700.getClass(), "regexps", null);
        setField(term85700, term85700.getClass(), "itsVariables", null);
        setField(term85700, term85700.getClass(), "itsConst", null);
        setField(term85700, term85700.getClass(), "itsVariableNames", null);
        setIntField(term85700, term85700.getClass(), "varStart", 0);
        setField(term85700, term85700.getClass(), "compilerData", null);
        setIntField(term85700, term85700.getClass(), "type", 100);
        setField(term85700, term85700.getClass(), "next", null);
        setField(term85710, term85710.getClass(), "functionName", null);
        setBooleanField(term85710, term85710.getClass(), "itsNeedsActivation", false);
        setIntField(term85710, term85710.getClass(), "itsFunctionType", 0);
        setBooleanField(term85710, term85710.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85710, term85710.getClass(), "encodedSourceStart", 0);
        setIntField(term85710, term85710.getClass(), "encodedSourceEnd", 0);
        setField(term85710, term85710.getClass(), "sourceName", null);
        setIntField(term85710, term85710.getClass(), "baseLineno", 0);
        setIntField(term85710, term85710.getClass(), "endLineno", 0);
        setField(term85710, term85710.getClass(), "functions", null);
        setField(term85710, term85710.getClass(), "regexps", null);
        setField(term85710, term85710.getClass(), "itsVariables", null);
        setField(term85710, term85710.getClass(), "itsConst", null);
        setField(term85710, term85710.getClass(), "itsVariableNames", null);
        setIntField(term85710, term85710.getClass(), "varStart", 0);
        setField(term85710, term85710.getClass(), "compilerData", null);
        setIntField(term85710, term85710.getClass(), "type", 0);
        setField(term85720, term85720.getClass(), "str", null);
        setIntField(term85720, term85720.getClass(), "type", 0);
        setField(term85720, term85720.getClass(), "next", null);
        setField(term85720, term85720.getClass(), "first", null);
        setField(term85720, term85720.getClass(), "last", null);
        setField(term85720, term85720.getClass(), "propListHead", null);
        setIntField(term85720, term85720.getClass(), "sourcePosition", 0);
        setField(term85720, term85720.getClass(), "jsType", null);
        setField(term85720, term85720.getClass(), "parent", null);
        setField(term85710, term85710.getClass(), "next", term85720);
        setField(term85710, term85710.getClass(), "first", null);
        setField(term85710, term85710.getClass(), "last", null);
        setField(term85710, term85710.getClass(), "propListHead", null);
        setIntField(term85710, term85710.getClass(), "sourcePosition", 0);
        setField(term85710, term85710.getClass(), "jsType", null);
        setField(term85710, term85710.getClass(), "parent", null);
        setField(term85700, term85700.getClass(), "first", term85710);
        setField(term85700, term85700.getClass(), "last", null);
        setField(term85700, term85700.getClass(), "propListHead", null);
        setIntField(term85700, term85700.getClass(), "sourcePosition", 0);
        setField(term85700, term85700.getClass(), "jsType", null);
        setField(term85700, term85700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85175;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term85089, args);
        assertTrue(recursiveEquals(term85089, term85785));
        assertTrue(recursiveEquals(term85175, term85786));
        assertTrue(recursiveEquals(retValue, term85700));
    }

};



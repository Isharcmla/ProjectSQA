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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866657;
     Object term866749;
     Object term867139;
     Object term867140;
     Object term867029;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term866657 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term866749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term866839 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term866931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term867017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term866931, term866931.getClass(), "type", 63);
        setField(term866839, term866839.getClass(), "next", term866931);
        setIntField(term866839, term866839.getClass(), "type", 0);
        setField(term866749, term866749.getClass(), "first", term866839);
        setIntField(term866749, term866749.getClass(), "type", 101);
        setField(term866749, term866749.getClass(), "parent", term867017);
        term867139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term867139, term867139.getClass(), "currentTraversal", null);
        term867140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term867141 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term867142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term867143 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term867140, term867140.getClass(), "str", null);
        setIntField(term867140, term867140.getClass(), "type", 101);
        setField(term867140, term867140.getClass(), "next", null);
        setIntField(term867141, term867141.getClass(), "encodedSourceStart", 0);
        setIntField(term867141, term867141.getClass(), "encodedSourceEnd", 0);
        setField(term867141, term867141.getClass(), "sourceName", null);
        setIntField(term867141, term867141.getClass(), "baseLineno", 0);
        setIntField(term867141, term867141.getClass(), "endLineno", 0);
        setField(term867141, term867141.getClass(), "functions", null);
        setField(term867141, term867141.getClass(), "regexps", null);
        setField(term867141, term867141.getClass(), "itsVariables", null);
        setField(term867141, term867141.getClass(), "itsConst", null);
        setField(term867141, term867141.getClass(), "itsVariableNames", null);
        setIntField(term867141, term867141.getClass(), "varStart", 0);
        setField(term867141, term867141.getClass(), "compilerData", null);
        setIntField(term867141, term867141.getClass(), "type", 0);
        setField(term867142, term867142.getClass(), "str", null);
        setIntField(term867142, term867142.getClass(), "type", 63);
        setField(term867142, term867142.getClass(), "next", null);
        setField(term867142, term867142.getClass(), "first", null);
        setField(term867142, term867142.getClass(), "last", null);
        setField(term867142, term867142.getClass(), "propListHead", null);
        setIntField(term867142, term867142.getClass(), "sourcePosition", 0);
        setField(term867142, term867142.getClass(), "jsType", null);
        setField(term867142, term867142.getClass(), "parent", null);
        setField(term867141, term867141.getClass(), "next", term867142);
        setField(term867141, term867141.getClass(), "first", null);
        setField(term867141, term867141.getClass(), "last", null);
        setField(term867141, term867141.getClass(), "propListHead", null);
        setIntField(term867141, term867141.getClass(), "sourcePosition", 0);
        setField(term867141, term867141.getClass(), "jsType", null);
        setField(term867141, term867141.getClass(), "parent", null);
        setField(term867140, term867140.getClass(), "first", term867141);
        setField(term867140, term867140.getClass(), "last", null);
        setField(term867140, term867140.getClass(), "propListHead", null);
        setIntField(term867140, term867140.getClass(), "sourcePosition", 0);
        setField(term867140, term867140.getClass(), "jsType", null);
        setField(term867143, term867143.getClass(), "functionName", null);
        setBooleanField(term867143, term867143.getClass(), "itsNeedsActivation", false);
        setIntField(term867143, term867143.getClass(), "itsFunctionType", 0);
        setBooleanField(term867143, term867143.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term867143, term867143.getClass(), "encodedSourceStart", 0);
        setIntField(term867143, term867143.getClass(), "encodedSourceEnd", 0);
        setField(term867143, term867143.getClass(), "sourceName", null);
        setIntField(term867143, term867143.getClass(), "baseLineno", 0);
        setIntField(term867143, term867143.getClass(), "endLineno", 0);
        setField(term867143, term867143.getClass(), "functions", null);
        setField(term867143, term867143.getClass(), "regexps", null);
        setField(term867143, term867143.getClass(), "itsVariables", null);
        setField(term867143, term867143.getClass(), "itsConst", null);
        setField(term867143, term867143.getClass(), "itsVariableNames", null);
        setIntField(term867143, term867143.getClass(), "varStart", 0);
        setField(term867143, term867143.getClass(), "compilerData", null);
        setIntField(term867143, term867143.getClass(), "type", 0);
        setField(term867143, term867143.getClass(), "next", null);
        setField(term867143, term867143.getClass(), "first", null);
        setField(term867143, term867143.getClass(), "last", null);
        setField(term867143, term867143.getClass(), "propListHead", null);
        setIntField(term867143, term867143.getClass(), "sourcePosition", 0);
        setField(term867143, term867143.getClass(), "jsType", null);
        setField(term867143, term867143.getClass(), "parent", null);
        setField(term867140, term867140.getClass(), "parent", term867143);
        term867029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term867031 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term867038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term867043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term867029, term867029.getClass(), "str", null);
        setIntField(term867029, term867029.getClass(), "type", 101);
        setField(term867029, term867029.getClass(), "next", null);
        setIntField(term867031, term867031.getClass(), "encodedSourceStart", 0);
        setIntField(term867031, term867031.getClass(), "encodedSourceEnd", 0);
        setField(term867031, term867031.getClass(), "sourceName", null);
        setIntField(term867031, term867031.getClass(), "baseLineno", 0);
        setIntField(term867031, term867031.getClass(), "endLineno", 0);
        setField(term867031, term867031.getClass(), "functions", null);
        setField(term867031, term867031.getClass(), "regexps", null);
        setField(term867031, term867031.getClass(), "itsVariables", null);
        setField(term867031, term867031.getClass(), "itsConst", null);
        setField(term867031, term867031.getClass(), "itsVariableNames", null);
        setIntField(term867031, term867031.getClass(), "varStart", 0);
        setField(term867031, term867031.getClass(), "compilerData", null);
        setIntField(term867031, term867031.getClass(), "type", 0);
        setField(term867038, term867038.getClass(), "str", null);
        setIntField(term867038, term867038.getClass(), "type", 63);
        setField(term867038, term867038.getClass(), "next", null);
        setField(term867038, term867038.getClass(), "first", null);
        setField(term867038, term867038.getClass(), "last", null);
        setField(term867038, term867038.getClass(), "propListHead", null);
        setIntField(term867038, term867038.getClass(), "sourcePosition", 0);
        setField(term867038, term867038.getClass(), "jsType", null);
        setField(term867038, term867038.getClass(), "parent", null);
        setField(term867031, term867031.getClass(), "next", term867038);
        setField(term867031, term867031.getClass(), "first", null);
        setField(term867031, term867031.getClass(), "last", null);
        setField(term867031, term867031.getClass(), "propListHead", null);
        setIntField(term867031, term867031.getClass(), "sourcePosition", 0);
        setField(term867031, term867031.getClass(), "jsType", null);
        setField(term867031, term867031.getClass(), "parent", null);
        setField(term867029, term867029.getClass(), "first", term867031);
        setField(term867029, term867029.getClass(), "last", null);
        setField(term867029, term867029.getClass(), "propListHead", null);
        setIntField(term867029, term867029.getClass(), "sourcePosition", 0);
        setField(term867029, term867029.getClass(), "jsType", null);
        setField(term867043, term867043.getClass(), "functionName", null);
        setBooleanField(term867043, term867043.getClass(), "itsNeedsActivation", false);
        setIntField(term867043, term867043.getClass(), "itsFunctionType", 0);
        setBooleanField(term867043, term867043.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term867043, term867043.getClass(), "encodedSourceStart", 0);
        setIntField(term867043, term867043.getClass(), "encodedSourceEnd", 0);
        setField(term867043, term867043.getClass(), "sourceName", null);
        setIntField(term867043, term867043.getClass(), "baseLineno", 0);
        setIntField(term867043, term867043.getClass(), "endLineno", 0);
        setField(term867043, term867043.getClass(), "functions", null);
        setField(term867043, term867043.getClass(), "regexps", null);
        setField(term867043, term867043.getClass(), "itsVariables", null);
        setField(term867043, term867043.getClass(), "itsConst", null);
        setField(term867043, term867043.getClass(), "itsVariableNames", null);
        setIntField(term867043, term867043.getClass(), "varStart", 0);
        setField(term867043, term867043.getClass(), "compilerData", null);
        setIntField(term867043, term867043.getClass(), "type", 0);
        setField(term867043, term867043.getClass(), "next", null);
        setField(term867043, term867043.getClass(), "first", null);
        setField(term867043, term867043.getClass(), "last", null);
        setField(term867043, term867043.getClass(), "propListHead", null);
        setIntField(term867043, term867043.getClass(), "sourcePosition", 0);
        setField(term867043, term867043.getClass(), "jsType", null);
        setField(term867043, term867043.getClass(), "parent", null);
        setField(term867029, term867029.getClass(), "parent", term867043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term866749;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term866657, args);
        assertTrue(recursiveEquals(term866657, term867139));
        assertTrue(recursiveEquals(term866749, term867140));
        assertTrue(recursiveEquals(retValue, term867029));
    }

};



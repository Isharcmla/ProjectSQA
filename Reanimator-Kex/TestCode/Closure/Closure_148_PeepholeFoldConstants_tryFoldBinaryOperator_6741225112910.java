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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850712;
     Object term850804;
     Object term851038;
     Object term851039;
     Object term850975;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850712 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term850804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term850890 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term850960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term850960, term850960.getClass(), "type", 16);
        setField(term850890, term850890.getClass(), "next", term850960);
        setIntField(term850890, term850890.getClass(), "type", 42);
        setField(term850804, term850804.getClass(), "first", term850890);
        setIntField(term850804, term850804.getClass(), "type", 16);
        term851038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term851038, term851038.getClass(), "currentTraversal", null);
        term851039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term851040 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term851041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term851039, term851039.getClass(), "str", null);
        setIntField(term851039, term851039.getClass(), "type", 16);
        setField(term851039, term851039.getClass(), "next", null);
        setField(term851040, term851040.getClass(), "functionName", null);
        setBooleanField(term851040, term851040.getClass(), "itsNeedsActivation", false);
        setIntField(term851040, term851040.getClass(), "itsFunctionType", 0);
        setBooleanField(term851040, term851040.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term851040, term851040.getClass(), "encodedSourceStart", 0);
        setIntField(term851040, term851040.getClass(), "encodedSourceEnd", 0);
        setField(term851040, term851040.getClass(), "sourceName", null);
        setIntField(term851040, term851040.getClass(), "baseLineno", 0);
        setIntField(term851040, term851040.getClass(), "endLineno", 0);
        setField(term851040, term851040.getClass(), "functions", null);
        setField(term851040, term851040.getClass(), "regexps", null);
        setField(term851040, term851040.getClass(), "itsVariables", null);
        setField(term851040, term851040.getClass(), "itsConst", null);
        setField(term851040, term851040.getClass(), "itsVariableNames", null);
        setIntField(term851040, term851040.getClass(), "varStart", 0);
        setField(term851040, term851040.getClass(), "compilerData", null);
        setIntField(term851040, term851040.getClass(), "type", 42);
        setIntField(term851041, term851041.getClass(), "type", 16);
        setField(term851041, term851041.getClass(), "next", null);
        setField(term851041, term851041.getClass(), "first", null);
        setField(term851041, term851041.getClass(), "last", null);
        setField(term851041, term851041.getClass(), "propListHead", null);
        setIntField(term851041, term851041.getClass(), "sourcePosition", 0);
        setField(term851041, term851041.getClass(), "jsType", null);
        setField(term851041, term851041.getClass(), "parent", null);
        setField(term851040, term851040.getClass(), "next", term851041);
        setField(term851040, term851040.getClass(), "first", null);
        setField(term851040, term851040.getClass(), "last", null);
        setField(term851040, term851040.getClass(), "propListHead", null);
        setIntField(term851040, term851040.getClass(), "sourcePosition", 0);
        setField(term851040, term851040.getClass(), "jsType", null);
        setField(term851040, term851040.getClass(), "parent", null);
        setField(term851039, term851039.getClass(), "first", term851040);
        setField(term851039, term851039.getClass(), "last", null);
        setField(term851039, term851039.getClass(), "propListHead", null);
        setIntField(term851039, term851039.getClass(), "sourcePosition", 0);
        setField(term851039, term851039.getClass(), "jsType", null);
        setField(term851039, term851039.getClass(), "parent", null);
        term850975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term850977 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term850987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term850975, term850975.getClass(), "str", null);
        setIntField(term850975, term850975.getClass(), "type", 16);
        setField(term850975, term850975.getClass(), "next", null);
        setField(term850977, term850977.getClass(), "functionName", null);
        setBooleanField(term850977, term850977.getClass(), "itsNeedsActivation", false);
        setIntField(term850977, term850977.getClass(), "itsFunctionType", 0);
        setBooleanField(term850977, term850977.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term850977, term850977.getClass(), "encodedSourceStart", 0);
        setIntField(term850977, term850977.getClass(), "encodedSourceEnd", 0);
        setField(term850977, term850977.getClass(), "sourceName", null);
        setIntField(term850977, term850977.getClass(), "baseLineno", 0);
        setIntField(term850977, term850977.getClass(), "endLineno", 0);
        setField(term850977, term850977.getClass(), "functions", null);
        setField(term850977, term850977.getClass(), "regexps", null);
        setField(term850977, term850977.getClass(), "itsVariables", null);
        setField(term850977, term850977.getClass(), "itsConst", null);
        setField(term850977, term850977.getClass(), "itsVariableNames", null);
        setIntField(term850977, term850977.getClass(), "varStart", 0);
        setField(term850977, term850977.getClass(), "compilerData", null);
        setIntField(term850977, term850977.getClass(), "type", 42);
        setIntField(term850987, term850987.getClass(), "type", 16);
        setField(term850987, term850987.getClass(), "next", null);
        setField(term850987, term850987.getClass(), "first", null);
        setField(term850987, term850987.getClass(), "last", null);
        setField(term850987, term850987.getClass(), "propListHead", null);
        setIntField(term850987, term850987.getClass(), "sourcePosition", 0);
        setField(term850987, term850987.getClass(), "jsType", null);
        setField(term850987, term850987.getClass(), "parent", null);
        setField(term850977, term850977.getClass(), "next", term850987);
        setField(term850977, term850977.getClass(), "first", null);
        setField(term850977, term850977.getClass(), "last", null);
        setField(term850977, term850977.getClass(), "propListHead", null);
        setIntField(term850977, term850977.getClass(), "sourcePosition", 0);
        setField(term850977, term850977.getClass(), "jsType", null);
        setField(term850977, term850977.getClass(), "parent", null);
        setField(term850975, term850975.getClass(), "first", term850977);
        setField(term850975, term850975.getClass(), "last", null);
        setField(term850975, term850975.getClass(), "propListHead", null);
        setIntField(term850975, term850975.getClass(), "sourcePosition", 0);
        setField(term850975, term850975.getClass(), "jsType", null);
        setField(term850975, term850975.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term850804;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term850712, args);
        assertTrue(recursiveEquals(term850712, term851038));
        assertTrue(recursiveEquals(term850804, term851039));
        assertTrue(recursiveEquals(retValue, term850975));
    }

};



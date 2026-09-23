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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881056;
     Object term881142;
     Object term881298;
     Object term881384;
     Object term882129;
     Object term882130;
     Object term882132;
     Object term882133;
     Object term882038;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term881056 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term881142 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term881212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term881212, term881212.getClass(), "type", 108);
        setField(term881142, term881142.getClass(), "parent", term881212);
        setIntField(term881142, term881142.getClass(), "type", 0);
        term881298 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term881298, term881298.getClass(), "type", 0);
        term881384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term881384, term881384.getClass(), "type", 64);
        term882129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term882129, term882129.getClass(), "currentTraversal", null);
        term882130 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term882131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term882130, term882130.getClass(), "functionName", null);
        setBooleanField(term882130, term882130.getClass(), "itsNeedsActivation", false);
        setIntField(term882130, term882130.getClass(), "itsFunctionType", 0);
        setBooleanField(term882130, term882130.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term882130, term882130.getClass(), "encodedSourceStart", 0);
        setIntField(term882130, term882130.getClass(), "encodedSourceEnd", 0);
        setField(term882130, term882130.getClass(), "sourceName", null);
        setIntField(term882130, term882130.getClass(), "baseLineno", 0);
        setIntField(term882130, term882130.getClass(), "endLineno", 0);
        setField(term882130, term882130.getClass(), "functions", null);
        setField(term882130, term882130.getClass(), "regexps", null);
        setField(term882130, term882130.getClass(), "itsVariables", null);
        setField(term882130, term882130.getClass(), "itsConst", null);
        setField(term882130, term882130.getClass(), "itsVariableNames", null);
        setIntField(term882130, term882130.getClass(), "varStart", 0);
        setField(term882130, term882130.getClass(), "compilerData", null);
        setIntField(term882130, term882130.getClass(), "type", 0);
        setField(term882130, term882130.getClass(), "next", null);
        setField(term882130, term882130.getClass(), "first", null);
        setField(term882130, term882130.getClass(), "last", null);
        setField(term882130, term882130.getClass(), "propListHead", null);
        setIntField(term882130, term882130.getClass(), "sourcePosition", 0);
        setField(term882130, term882130.getClass(), "jsType", null);
        setIntField(term882131, term882131.getClass(), "type", 108);
        setField(term882131, term882131.getClass(), "next", null);
        setField(term882131, term882131.getClass(), "first", null);
        setField(term882131, term882131.getClass(), "last", null);
        setField(term882131, term882131.getClass(), "propListHead", null);
        setIntField(term882131, term882131.getClass(), "sourcePosition", 0);
        setField(term882131, term882131.getClass(), "jsType", null);
        setField(term882131, term882131.getClass(), "parent", null);
        setField(term882130, term882130.getClass(), "parent", term882131);
        term882132 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term882132, term882132.getClass(), "functionName", null);
        setBooleanField(term882132, term882132.getClass(), "itsNeedsActivation", false);
        setIntField(term882132, term882132.getClass(), "itsFunctionType", 0);
        setBooleanField(term882132, term882132.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term882132, term882132.getClass(), "encodedSourceStart", 0);
        setIntField(term882132, term882132.getClass(), "encodedSourceEnd", 0);
        setField(term882132, term882132.getClass(), "sourceName", null);
        setIntField(term882132, term882132.getClass(), "baseLineno", 0);
        setIntField(term882132, term882132.getClass(), "endLineno", 0);
        setField(term882132, term882132.getClass(), "functions", null);
        setField(term882132, term882132.getClass(), "regexps", null);
        setField(term882132, term882132.getClass(), "itsVariables", null);
        setField(term882132, term882132.getClass(), "itsConst", null);
        setField(term882132, term882132.getClass(), "itsVariableNames", null);
        setIntField(term882132, term882132.getClass(), "varStart", 0);
        setField(term882132, term882132.getClass(), "compilerData", null);
        setIntField(term882132, term882132.getClass(), "type", 0);
        setField(term882132, term882132.getClass(), "next", null);
        setField(term882132, term882132.getClass(), "first", null);
        setField(term882132, term882132.getClass(), "last", null);
        setField(term882132, term882132.getClass(), "propListHead", null);
        setIntField(term882132, term882132.getClass(), "sourcePosition", 0);
        setField(term882132, term882132.getClass(), "jsType", null);
        setField(term882132, term882132.getClass(), "parent", null);
        term882133 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term882133, term882133.getClass(), "functionName", null);
        setBooleanField(term882133, term882133.getClass(), "itsNeedsActivation", false);
        setIntField(term882133, term882133.getClass(), "itsFunctionType", 0);
        setBooleanField(term882133, term882133.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term882133, term882133.getClass(), "encodedSourceStart", 0);
        setIntField(term882133, term882133.getClass(), "encodedSourceEnd", 0);
        setField(term882133, term882133.getClass(), "sourceName", null);
        setIntField(term882133, term882133.getClass(), "baseLineno", 0);
        setIntField(term882133, term882133.getClass(), "endLineno", 0);
        setField(term882133, term882133.getClass(), "functions", null);
        setField(term882133, term882133.getClass(), "regexps", null);
        setField(term882133, term882133.getClass(), "itsVariables", null);
        setField(term882133, term882133.getClass(), "itsConst", null);
        setField(term882133, term882133.getClass(), "itsVariableNames", null);
        setIntField(term882133, term882133.getClass(), "varStart", 0);
        setField(term882133, term882133.getClass(), "compilerData", null);
        setIntField(term882133, term882133.getClass(), "type", 64);
        setField(term882133, term882133.getClass(), "next", null);
        setField(term882133, term882133.getClass(), "first", null);
        setField(term882133, term882133.getClass(), "last", null);
        setField(term882133, term882133.getClass(), "propListHead", null);
        setIntField(term882133, term882133.getClass(), "sourcePosition", 0);
        setField(term882133, term882133.getClass(), "jsType", null);
        setField(term882133, term882133.getClass(), "parent", null);
        term882038 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term882049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term882038, term882038.getClass(), "functionName", null);
        setBooleanField(term882038, term882038.getClass(), "itsNeedsActivation", false);
        setIntField(term882038, term882038.getClass(), "itsFunctionType", 0);
        setBooleanField(term882038, term882038.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term882038, term882038.getClass(), "encodedSourceStart", 0);
        setIntField(term882038, term882038.getClass(), "encodedSourceEnd", 0);
        setField(term882038, term882038.getClass(), "sourceName", null);
        setIntField(term882038, term882038.getClass(), "baseLineno", 0);
        setIntField(term882038, term882038.getClass(), "endLineno", 0);
        setField(term882038, term882038.getClass(), "functions", null);
        setField(term882038, term882038.getClass(), "regexps", null);
        setField(term882038, term882038.getClass(), "itsVariables", null);
        setField(term882038, term882038.getClass(), "itsConst", null);
        setField(term882038, term882038.getClass(), "itsVariableNames", null);
        setIntField(term882038, term882038.getClass(), "varStart", 0);
        setField(term882038, term882038.getClass(), "compilerData", null);
        setIntField(term882038, term882038.getClass(), "type", 0);
        setField(term882038, term882038.getClass(), "next", null);
        setField(term882038, term882038.getClass(), "first", null);
        setField(term882038, term882038.getClass(), "last", null);
        setField(term882038, term882038.getClass(), "propListHead", null);
        setIntField(term882038, term882038.getClass(), "sourcePosition", 0);
        setField(term882038, term882038.getClass(), "jsType", null);
        setIntField(term882049, term882049.getClass(), "type", 108);
        setField(term882049, term882049.getClass(), "next", null);
        setField(term882049, term882049.getClass(), "first", null);
        setField(term882049, term882049.getClass(), "last", null);
        setField(term882049, term882049.getClass(), "propListHead", null);
        setIntField(term882049, term882049.getClass(), "sourcePosition", 0);
        setField(term882049, term882049.getClass(), "jsType", null);
        setField(term882049, term882049.getClass(), "parent", null);
        setField(term882038, term882038.getClass(), "parent", term882049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term881142;
        args[1] = term881298;
        args[2] = term881384;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term881056, args);
        assertTrue(recursiveEquals(term881056, term882129));
        assertTrue(recursiveEquals(term881142, term882130));
        assertTrue(recursiveEquals(term881298, term882132));
        assertTrue(recursiveEquals(term881384, term882133));
        assertTrue(recursiveEquals(retValue, term882038));
    }

};



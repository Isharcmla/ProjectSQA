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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822747;
     Object term822833;
     Object term823011;
     Object term823103;
     Object term823274;
     Object term823275;
     Object term823277;
     Object term823278;
     Object term823179;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term822833 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term822919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term822919, term822919.getClass(), "type", 114);
        setField(term822833, term822833.getClass(), "parent", term822919);
        setIntField(term822833, term822833.getClass(), "type", 0);
        term823011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term823011, term823011.getClass(), "type", 109);
        term823103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term823103, term823103.getClass(), "type", 63);
        term823274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term823274, term823274.getClass(), "currentTraversal", null);
        term823275 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term823276 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term823275, term823275.getClass(), "functionName", null);
        setBooleanField(term823275, term823275.getClass(), "itsNeedsActivation", false);
        setIntField(term823275, term823275.getClass(), "itsFunctionType", 0);
        setBooleanField(term823275, term823275.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823275, term823275.getClass(), "encodedSourceStart", 0);
        setIntField(term823275, term823275.getClass(), "encodedSourceEnd", 0);
        setField(term823275, term823275.getClass(), "sourceName", null);
        setIntField(term823275, term823275.getClass(), "baseLineno", 0);
        setIntField(term823275, term823275.getClass(), "endLineno", 0);
        setField(term823275, term823275.getClass(), "functions", null);
        setField(term823275, term823275.getClass(), "regexps", null);
        setField(term823275, term823275.getClass(), "itsVariables", null);
        setField(term823275, term823275.getClass(), "itsConst", null);
        setField(term823275, term823275.getClass(), "itsVariableNames", null);
        setIntField(term823275, term823275.getClass(), "varStart", 0);
        setField(term823275, term823275.getClass(), "compilerData", null);
        setIntField(term823275, term823275.getClass(), "type", 0);
        setField(term823275, term823275.getClass(), "next", null);
        setField(term823275, term823275.getClass(), "first", null);
        setField(term823275, term823275.getClass(), "last", null);
        setField(term823275, term823275.getClass(), "propListHead", null);
        setIntField(term823275, term823275.getClass(), "sourcePosition", 0);
        setField(term823275, term823275.getClass(), "jsType", null);
        setField(term823276, term823276.getClass(), "functionName", null);
        setBooleanField(term823276, term823276.getClass(), "itsNeedsActivation", false);
        setIntField(term823276, term823276.getClass(), "itsFunctionType", 0);
        setBooleanField(term823276, term823276.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823276, term823276.getClass(), "encodedSourceStart", 0);
        setIntField(term823276, term823276.getClass(), "encodedSourceEnd", 0);
        setField(term823276, term823276.getClass(), "sourceName", null);
        setIntField(term823276, term823276.getClass(), "baseLineno", 0);
        setIntField(term823276, term823276.getClass(), "endLineno", 0);
        setField(term823276, term823276.getClass(), "functions", null);
        setField(term823276, term823276.getClass(), "regexps", null);
        setField(term823276, term823276.getClass(), "itsVariables", null);
        setField(term823276, term823276.getClass(), "itsConst", null);
        setField(term823276, term823276.getClass(), "itsVariableNames", null);
        setIntField(term823276, term823276.getClass(), "varStart", 0);
        setField(term823276, term823276.getClass(), "compilerData", null);
        setIntField(term823276, term823276.getClass(), "type", 114);
        setField(term823276, term823276.getClass(), "next", null);
        setField(term823276, term823276.getClass(), "first", null);
        setField(term823276, term823276.getClass(), "last", null);
        setField(term823276, term823276.getClass(), "propListHead", null);
        setIntField(term823276, term823276.getClass(), "sourcePosition", 0);
        setField(term823276, term823276.getClass(), "jsType", null);
        setField(term823276, term823276.getClass(), "parent", null);
        setField(term823275, term823275.getClass(), "parent", term823276);
        term823277 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term823277, term823277.getClass(), "number", 0.0);
        setIntField(term823277, term823277.getClass(), "type", 109);
        setField(term823277, term823277.getClass(), "next", null);
        setField(term823277, term823277.getClass(), "first", null);
        setField(term823277, term823277.getClass(), "last", null);
        setField(term823277, term823277.getClass(), "propListHead", null);
        setIntField(term823277, term823277.getClass(), "sourcePosition", 0);
        setField(term823277, term823277.getClass(), "jsType", null);
        setField(term823277, term823277.getClass(), "parent", null);
        term823278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term823278, term823278.getClass(), "number", 0.0);
        setIntField(term823278, term823278.getClass(), "type", 63);
        setField(term823278, term823278.getClass(), "next", null);
        setField(term823278, term823278.getClass(), "first", null);
        setField(term823278, term823278.getClass(), "last", null);
        setField(term823278, term823278.getClass(), "propListHead", null);
        setIntField(term823278, term823278.getClass(), "sourcePosition", 0);
        setField(term823278, term823278.getClass(), "jsType", null);
        setField(term823278, term823278.getClass(), "parent", null);
        term823179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term823190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term823179, term823179.getClass(), "functionName", null);
        setBooleanField(term823179, term823179.getClass(), "itsNeedsActivation", false);
        setIntField(term823179, term823179.getClass(), "itsFunctionType", 0);
        setBooleanField(term823179, term823179.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823179, term823179.getClass(), "encodedSourceStart", 0);
        setIntField(term823179, term823179.getClass(), "encodedSourceEnd", 0);
        setField(term823179, term823179.getClass(), "sourceName", null);
        setIntField(term823179, term823179.getClass(), "baseLineno", 0);
        setIntField(term823179, term823179.getClass(), "endLineno", 0);
        setField(term823179, term823179.getClass(), "functions", null);
        setField(term823179, term823179.getClass(), "regexps", null);
        setField(term823179, term823179.getClass(), "itsVariables", null);
        setField(term823179, term823179.getClass(), "itsConst", null);
        setField(term823179, term823179.getClass(), "itsVariableNames", null);
        setIntField(term823179, term823179.getClass(), "varStart", 0);
        setField(term823179, term823179.getClass(), "compilerData", null);
        setIntField(term823179, term823179.getClass(), "type", 0);
        setField(term823179, term823179.getClass(), "next", null);
        setField(term823179, term823179.getClass(), "first", null);
        setField(term823179, term823179.getClass(), "last", null);
        setField(term823179, term823179.getClass(), "propListHead", null);
        setIntField(term823179, term823179.getClass(), "sourcePosition", 0);
        setField(term823179, term823179.getClass(), "jsType", null);
        setField(term823190, term823190.getClass(), "functionName", null);
        setBooleanField(term823190, term823190.getClass(), "itsNeedsActivation", false);
        setIntField(term823190, term823190.getClass(), "itsFunctionType", 0);
        setBooleanField(term823190, term823190.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term823190, term823190.getClass(), "encodedSourceStart", 0);
        setIntField(term823190, term823190.getClass(), "encodedSourceEnd", 0);
        setField(term823190, term823190.getClass(), "sourceName", null);
        setIntField(term823190, term823190.getClass(), "baseLineno", 0);
        setIntField(term823190, term823190.getClass(), "endLineno", 0);
        setField(term823190, term823190.getClass(), "functions", null);
        setField(term823190, term823190.getClass(), "regexps", null);
        setField(term823190, term823190.getClass(), "itsVariables", null);
        setField(term823190, term823190.getClass(), "itsConst", null);
        setField(term823190, term823190.getClass(), "itsVariableNames", null);
        setIntField(term823190, term823190.getClass(), "varStart", 0);
        setField(term823190, term823190.getClass(), "compilerData", null);
        setIntField(term823190, term823190.getClass(), "type", 114);
        setField(term823190, term823190.getClass(), "next", null);
        setField(term823190, term823190.getClass(), "first", null);
        setField(term823190, term823190.getClass(), "last", null);
        setField(term823190, term823190.getClass(), "propListHead", null);
        setIntField(term823190, term823190.getClass(), "sourcePosition", 0);
        setField(term823190, term823190.getClass(), "jsType", null);
        setField(term823190, term823190.getClass(), "parent", null);
        setField(term823179, term823179.getClass(), "parent", term823190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term822833;
        args[1] = term823011;
        args[2] = term823103;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term822747, args);
        assertTrue(recursiveEquals(term822747, term823274));
        assertTrue(recursiveEquals(term822833, term823275));
        assertTrue(recursiveEquals(term823011, term823277));
        assertTrue(recursiveEquals(term823103, term823278));
        assertTrue(recursiveEquals(retValue, term823179));
    }

};



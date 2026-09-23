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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550848;
     Object term550934;
     Object term551112;
     Object term551204;
     Object term551311;
     Object term551312;
     Object term551314;
     Object term551315;
     Object term551216;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term550934 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term551020, term551020.getClass(), "type", 114);
        setField(term550934, term550934.getClass(), "parent", term551020);
        setIntField(term550934, term550934.getClass(), "type", 0);
        term551112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term551112, term551112.getClass(), "type", 75);
        term551204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term551204, term551204.getClass(), "type", 63);
        term551311 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term551311, term551311.getClass(), "currentTraversal", null);
        term551312 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551312, term551312.getClass(), "functionName", null);
        setBooleanField(term551312, term551312.getClass(), "itsNeedsActivation", false);
        setIntField(term551312, term551312.getClass(), "itsFunctionType", 0);
        setBooleanField(term551312, term551312.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551312, term551312.getClass(), "encodedSourceStart", 0);
        setIntField(term551312, term551312.getClass(), "encodedSourceEnd", 0);
        setField(term551312, term551312.getClass(), "sourceName", null);
        setIntField(term551312, term551312.getClass(), "baseLineno", 0);
        setIntField(term551312, term551312.getClass(), "endLineno", 0);
        setField(term551312, term551312.getClass(), "functions", null);
        setField(term551312, term551312.getClass(), "regexps", null);
        setField(term551312, term551312.getClass(), "itsVariables", null);
        setField(term551312, term551312.getClass(), "itsConst", null);
        setField(term551312, term551312.getClass(), "itsVariableNames", null);
        setIntField(term551312, term551312.getClass(), "varStart", 0);
        setField(term551312, term551312.getClass(), "compilerData", null);
        setIntField(term551312, term551312.getClass(), "type", 0);
        setField(term551312, term551312.getClass(), "next", null);
        setField(term551312, term551312.getClass(), "first", null);
        setField(term551312, term551312.getClass(), "last", null);
        setField(term551312, term551312.getClass(), "propListHead", null);
        setIntField(term551312, term551312.getClass(), "sourcePosition", 0);
        setField(term551312, term551312.getClass(), "jsType", null);
        setField(term551313, term551313.getClass(), "functionName", null);
        setBooleanField(term551313, term551313.getClass(), "itsNeedsActivation", false);
        setIntField(term551313, term551313.getClass(), "itsFunctionType", 0);
        setBooleanField(term551313, term551313.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551313, term551313.getClass(), "encodedSourceStart", 0);
        setIntField(term551313, term551313.getClass(), "encodedSourceEnd", 0);
        setField(term551313, term551313.getClass(), "sourceName", null);
        setIntField(term551313, term551313.getClass(), "baseLineno", 0);
        setIntField(term551313, term551313.getClass(), "endLineno", 0);
        setField(term551313, term551313.getClass(), "functions", null);
        setField(term551313, term551313.getClass(), "regexps", null);
        setField(term551313, term551313.getClass(), "itsVariables", null);
        setField(term551313, term551313.getClass(), "itsConst", null);
        setField(term551313, term551313.getClass(), "itsVariableNames", null);
        setIntField(term551313, term551313.getClass(), "varStart", 0);
        setField(term551313, term551313.getClass(), "compilerData", null);
        setIntField(term551313, term551313.getClass(), "type", 114);
        setField(term551313, term551313.getClass(), "next", null);
        setField(term551313, term551313.getClass(), "first", null);
        setField(term551313, term551313.getClass(), "last", null);
        setField(term551313, term551313.getClass(), "propListHead", null);
        setIntField(term551313, term551313.getClass(), "sourcePosition", 0);
        setField(term551313, term551313.getClass(), "jsType", null);
        setField(term551313, term551313.getClass(), "parent", null);
        setField(term551312, term551312.getClass(), "parent", term551313);
        term551314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term551314, term551314.getClass(), "number", 0.0);
        setIntField(term551314, term551314.getClass(), "type", 75);
        setField(term551314, term551314.getClass(), "next", null);
        setField(term551314, term551314.getClass(), "first", null);
        setField(term551314, term551314.getClass(), "last", null);
        setField(term551314, term551314.getClass(), "propListHead", null);
        setIntField(term551314, term551314.getClass(), "sourcePosition", 0);
        setField(term551314, term551314.getClass(), "jsType", null);
        setField(term551314, term551314.getClass(), "parent", null);
        term551315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term551315, term551315.getClass(), "number", 0.0);
        setIntField(term551315, term551315.getClass(), "type", 63);
        setField(term551315, term551315.getClass(), "next", null);
        setField(term551315, term551315.getClass(), "first", null);
        setField(term551315, term551315.getClass(), "last", null);
        setField(term551315, term551315.getClass(), "propListHead", null);
        setIntField(term551315, term551315.getClass(), "sourcePosition", 0);
        setField(term551315, term551315.getClass(), "jsType", null);
        setField(term551315, term551315.getClass(), "parent", null);
        term551216 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551227 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term551216, term551216.getClass(), "functionName", null);
        setBooleanField(term551216, term551216.getClass(), "itsNeedsActivation", false);
        setIntField(term551216, term551216.getClass(), "itsFunctionType", 0);
        setBooleanField(term551216, term551216.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551216, term551216.getClass(), "encodedSourceStart", 0);
        setIntField(term551216, term551216.getClass(), "encodedSourceEnd", 0);
        setField(term551216, term551216.getClass(), "sourceName", null);
        setIntField(term551216, term551216.getClass(), "baseLineno", 0);
        setIntField(term551216, term551216.getClass(), "endLineno", 0);
        setField(term551216, term551216.getClass(), "functions", null);
        setField(term551216, term551216.getClass(), "regexps", null);
        setField(term551216, term551216.getClass(), "itsVariables", null);
        setField(term551216, term551216.getClass(), "itsConst", null);
        setField(term551216, term551216.getClass(), "itsVariableNames", null);
        setIntField(term551216, term551216.getClass(), "varStart", 0);
        setField(term551216, term551216.getClass(), "compilerData", null);
        setIntField(term551216, term551216.getClass(), "type", 0);
        setField(term551216, term551216.getClass(), "next", null);
        setField(term551216, term551216.getClass(), "first", null);
        setField(term551216, term551216.getClass(), "last", null);
        setField(term551216, term551216.getClass(), "propListHead", null);
        setIntField(term551216, term551216.getClass(), "sourcePosition", 0);
        setField(term551216, term551216.getClass(), "jsType", null);
        setField(term551227, term551227.getClass(), "functionName", null);
        setBooleanField(term551227, term551227.getClass(), "itsNeedsActivation", false);
        setIntField(term551227, term551227.getClass(), "itsFunctionType", 0);
        setBooleanField(term551227, term551227.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term551227, term551227.getClass(), "encodedSourceStart", 0);
        setIntField(term551227, term551227.getClass(), "encodedSourceEnd", 0);
        setField(term551227, term551227.getClass(), "sourceName", null);
        setIntField(term551227, term551227.getClass(), "baseLineno", 0);
        setIntField(term551227, term551227.getClass(), "endLineno", 0);
        setField(term551227, term551227.getClass(), "functions", null);
        setField(term551227, term551227.getClass(), "regexps", null);
        setField(term551227, term551227.getClass(), "itsVariables", null);
        setField(term551227, term551227.getClass(), "itsConst", null);
        setField(term551227, term551227.getClass(), "itsVariableNames", null);
        setIntField(term551227, term551227.getClass(), "varStart", 0);
        setField(term551227, term551227.getClass(), "compilerData", null);
        setIntField(term551227, term551227.getClass(), "type", 114);
        setField(term551227, term551227.getClass(), "next", null);
        setField(term551227, term551227.getClass(), "first", null);
        setField(term551227, term551227.getClass(), "last", null);
        setField(term551227, term551227.getClass(), "propListHead", null);
        setIntField(term551227, term551227.getClass(), "sourcePosition", 0);
        setField(term551227, term551227.getClass(), "jsType", null);
        setField(term551227, term551227.getClass(), "parent", null);
        setField(term551216, term551216.getClass(), "parent", term551227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term550934;
        args[1] = term551112;
        args[2] = term551204;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term550848, args);
        assertTrue(recursiveEquals(term550848, term551311));
        assertTrue(recursiveEquals(term550934, term551312));
        assertTrue(recursiveEquals(term551112, term551314));
        assertTrue(recursiveEquals(term551204, term551315));
        assertTrue(recursiveEquals(retValue, term551216));
    }

};



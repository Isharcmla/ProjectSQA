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

public class PeepholeFoldConstants_tryFoldAndOr_425870290253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41112;
     Object term41198;
     Object term41290;
     Object term41602;
     Object term41603;
     Object term41604;
     Object term41572;

    public PeepholeFoldConstants_tryFoldAndOr_425870290253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term41198, term41198.getClass(), "parent", null);
        setIntField(term41198, term41198.getClass(), "type", 0);
        term41290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term41602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term41602, term41602.getClass(), "currentTraversal", null);
        term41603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term41603, term41603.getClass(), "functionName", null);
        setBooleanField(term41603, term41603.getClass(), "itsNeedsActivation", false);
        setIntField(term41603, term41603.getClass(), "itsFunctionType", 0);
        setBooleanField(term41603, term41603.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term41603, term41603.getClass(), "encodedSourceStart", 0);
        setIntField(term41603, term41603.getClass(), "encodedSourceEnd", 0);
        setField(term41603, term41603.getClass(), "sourceName", null);
        setIntField(term41603, term41603.getClass(), "baseLineno", 0);
        setIntField(term41603, term41603.getClass(), "endLineno", 0);
        setField(term41603, term41603.getClass(), "functions", null);
        setField(term41603, term41603.getClass(), "regexps", null);
        setField(term41603, term41603.getClass(), "itsVariables", null);
        setField(term41603, term41603.getClass(), "itsConst", null);
        setField(term41603, term41603.getClass(), "itsVariableNames", null);
        setIntField(term41603, term41603.getClass(), "varStart", 0);
        setField(term41603, term41603.getClass(), "compilerData", null);
        setIntField(term41603, term41603.getClass(), "type", 0);
        setField(term41603, term41603.getClass(), "next", null);
        setField(term41603, term41603.getClass(), "first", null);
        setField(term41603, term41603.getClass(), "last", null);
        setField(term41603, term41603.getClass(), "propListHead", null);
        setIntField(term41603, term41603.getClass(), "sourcePosition", 0);
        setField(term41603, term41603.getClass(), "jsType", null);
        setField(term41603, term41603.getClass(), "parent", null);
        term41604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term41604, term41604.getClass(), "str", null);
        setIntField(term41604, term41604.getClass(), "type", 0);
        setField(term41604, term41604.getClass(), "next", null);
        setField(term41604, term41604.getClass(), "first", null);
        setField(term41604, term41604.getClass(), "last", null);
        setField(term41604, term41604.getClass(), "propListHead", null);
        setIntField(term41604, term41604.getClass(), "sourcePosition", 0);
        setField(term41604, term41604.getClass(), "jsType", null);
        setField(term41604, term41604.getClass(), "parent", null);
        term41572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term41572, term41572.getClass(), "functionName", null);
        setBooleanField(term41572, term41572.getClass(), "itsNeedsActivation", false);
        setIntField(term41572, term41572.getClass(), "itsFunctionType", 0);
        setBooleanField(term41572, term41572.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term41572, term41572.getClass(), "encodedSourceStart", 0);
        setIntField(term41572, term41572.getClass(), "encodedSourceEnd", 0);
        setField(term41572, term41572.getClass(), "sourceName", null);
        setIntField(term41572, term41572.getClass(), "baseLineno", 0);
        setIntField(term41572, term41572.getClass(), "endLineno", 0);
        setField(term41572, term41572.getClass(), "functions", null);
        setField(term41572, term41572.getClass(), "regexps", null);
        setField(term41572, term41572.getClass(), "itsVariables", null);
        setField(term41572, term41572.getClass(), "itsConst", null);
        setField(term41572, term41572.getClass(), "itsVariableNames", null);
        setIntField(term41572, term41572.getClass(), "varStart", 0);
        setField(term41572, term41572.getClass(), "compilerData", null);
        setIntField(term41572, term41572.getClass(), "type", 0);
        setField(term41572, term41572.getClass(), "next", null);
        setField(term41572, term41572.getClass(), "first", null);
        setField(term41572, term41572.getClass(), "last", null);
        setField(term41572, term41572.getClass(), "propListHead", null);
        setIntField(term41572, term41572.getClass(), "sourcePosition", 0);
        setField(term41572, term41572.getClass(), "jsType", null);
        setField(term41572, term41572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term41198;
        args[1] = term41290;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term41112, args);
        assertTrue(recursiveEquals(term41112, term41602));
        assertTrue(recursiveEquals(term41198, term41603));
        assertTrue(recursiveEquals(term41290, term41604));
        assertTrue(recursiveEquals(retValue, term41572));
    }

};



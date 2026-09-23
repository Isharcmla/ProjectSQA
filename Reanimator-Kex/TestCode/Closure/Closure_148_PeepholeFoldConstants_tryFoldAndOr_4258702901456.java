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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359792;
     Object term359878;
     Object term359970;
     Object term361378;
     Object term361379;
     Object term361380;
     Object term361339;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359792 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term359878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359878, term359878.getClass(), "parent", null);
        setIntField(term359878, term359878.getClass(), "type", 63);
        term359970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term359970, term359970.getClass(), "type", 63);
        term361378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term361378, term361378.getClass(), "currentTraversal", null);
        term361379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361379, term361379.getClass(), "functionName", null);
        setBooleanField(term361379, term361379.getClass(), "itsNeedsActivation", false);
        setIntField(term361379, term361379.getClass(), "itsFunctionType", 0);
        setBooleanField(term361379, term361379.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361379, term361379.getClass(), "encodedSourceStart", 0);
        setIntField(term361379, term361379.getClass(), "encodedSourceEnd", 0);
        setField(term361379, term361379.getClass(), "sourceName", null);
        setIntField(term361379, term361379.getClass(), "baseLineno", 0);
        setIntField(term361379, term361379.getClass(), "endLineno", 0);
        setField(term361379, term361379.getClass(), "functions", null);
        setField(term361379, term361379.getClass(), "regexps", null);
        setField(term361379, term361379.getClass(), "itsVariables", null);
        setField(term361379, term361379.getClass(), "itsConst", null);
        setField(term361379, term361379.getClass(), "itsVariableNames", null);
        setIntField(term361379, term361379.getClass(), "varStart", 0);
        setField(term361379, term361379.getClass(), "compilerData", null);
        setIntField(term361379, term361379.getClass(), "type", 63);
        setField(term361379, term361379.getClass(), "next", null);
        setField(term361379, term361379.getClass(), "first", null);
        setField(term361379, term361379.getClass(), "last", null);
        setField(term361379, term361379.getClass(), "propListHead", null);
        setIntField(term361379, term361379.getClass(), "sourcePosition", 0);
        setField(term361379, term361379.getClass(), "jsType", null);
        setField(term361379, term361379.getClass(), "parent", null);
        term361380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term361380, term361380.getClass(), "str", null);
        setIntField(term361380, term361380.getClass(), "type", 63);
        setField(term361380, term361380.getClass(), "next", null);
        setField(term361380, term361380.getClass(), "first", null);
        setField(term361380, term361380.getClass(), "last", null);
        setField(term361380, term361380.getClass(), "propListHead", null);
        setIntField(term361380, term361380.getClass(), "sourcePosition", 0);
        setField(term361380, term361380.getClass(), "jsType", null);
        setField(term361380, term361380.getClass(), "parent", null);
        term361339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term361339, term361339.getClass(), "functionName", null);
        setBooleanField(term361339, term361339.getClass(), "itsNeedsActivation", false);
        setIntField(term361339, term361339.getClass(), "itsFunctionType", 0);
        setBooleanField(term361339, term361339.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term361339, term361339.getClass(), "encodedSourceStart", 0);
        setIntField(term361339, term361339.getClass(), "encodedSourceEnd", 0);
        setField(term361339, term361339.getClass(), "sourceName", null);
        setIntField(term361339, term361339.getClass(), "baseLineno", 0);
        setIntField(term361339, term361339.getClass(), "endLineno", 0);
        setField(term361339, term361339.getClass(), "functions", null);
        setField(term361339, term361339.getClass(), "regexps", null);
        setField(term361339, term361339.getClass(), "itsVariables", null);
        setField(term361339, term361339.getClass(), "itsConst", null);
        setField(term361339, term361339.getClass(), "itsVariableNames", null);
        setIntField(term361339, term361339.getClass(), "varStart", 0);
        setField(term361339, term361339.getClass(), "compilerData", null);
        setIntField(term361339, term361339.getClass(), "type", 63);
        setField(term361339, term361339.getClass(), "next", null);
        setField(term361339, term361339.getClass(), "first", null);
        setField(term361339, term361339.getClass(), "last", null);
        setField(term361339, term361339.getClass(), "propListHead", null);
        setIntField(term361339, term361339.getClass(), "sourcePosition", 0);
        setField(term361339, term361339.getClass(), "jsType", null);
        setField(term361339, term361339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term359878;
        args[1] = term359970;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term359792, args);
        assertTrue(recursiveEquals(term359792, term361378));
        assertTrue(recursiveEquals(term359878, term361379));
        assertTrue(recursiveEquals(term359970, term361380));
        assertTrue(recursiveEquals(retValue, term361339));
    }

};



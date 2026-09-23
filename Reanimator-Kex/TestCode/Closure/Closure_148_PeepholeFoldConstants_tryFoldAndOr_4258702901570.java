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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395864;
     Object term395950;
     Object term396106;
     Object term396192;
     Object term396386;
     Object term396387;
     Object term396389;
     Object term396390;
     Object term396295;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395864 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term395950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term396020, term396020.getClass(), "type", 108);
        setField(term395950, term395950.getClass(), "parent", term396020);
        setIntField(term395950, term395950.getClass(), "type", 0);
        term396106 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term396106, term396106.getClass(), "type", 115);
        term396192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term396192, term396192.getClass(), "type", 63);
        term396386 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term396386, term396386.getClass(), "currentTraversal", null);
        term396387 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term396387, term396387.getClass(), "functionName", null);
        setBooleanField(term396387, term396387.getClass(), "itsNeedsActivation", false);
        setIntField(term396387, term396387.getClass(), "itsFunctionType", 0);
        setBooleanField(term396387, term396387.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396387, term396387.getClass(), "encodedSourceStart", 0);
        setIntField(term396387, term396387.getClass(), "encodedSourceEnd", 0);
        setField(term396387, term396387.getClass(), "sourceName", null);
        setIntField(term396387, term396387.getClass(), "baseLineno", 0);
        setIntField(term396387, term396387.getClass(), "endLineno", 0);
        setField(term396387, term396387.getClass(), "functions", null);
        setField(term396387, term396387.getClass(), "regexps", null);
        setField(term396387, term396387.getClass(), "itsVariables", null);
        setField(term396387, term396387.getClass(), "itsConst", null);
        setField(term396387, term396387.getClass(), "itsVariableNames", null);
        setIntField(term396387, term396387.getClass(), "varStart", 0);
        setField(term396387, term396387.getClass(), "compilerData", null);
        setIntField(term396387, term396387.getClass(), "type", 0);
        setField(term396387, term396387.getClass(), "next", null);
        setField(term396387, term396387.getClass(), "first", null);
        setField(term396387, term396387.getClass(), "last", null);
        setField(term396387, term396387.getClass(), "propListHead", null);
        setIntField(term396387, term396387.getClass(), "sourcePosition", 0);
        setField(term396387, term396387.getClass(), "jsType", null);
        setIntField(term396388, term396388.getClass(), "type", 108);
        setField(term396388, term396388.getClass(), "next", null);
        setField(term396388, term396388.getClass(), "first", null);
        setField(term396388, term396388.getClass(), "last", null);
        setField(term396388, term396388.getClass(), "propListHead", null);
        setIntField(term396388, term396388.getClass(), "sourcePosition", 0);
        setField(term396388, term396388.getClass(), "jsType", null);
        setField(term396388, term396388.getClass(), "parent", null);
        setField(term396387, term396387.getClass(), "parent", term396388);
        term396389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term396389, term396389.getClass(), "functionName", null);
        setBooleanField(term396389, term396389.getClass(), "itsNeedsActivation", false);
        setIntField(term396389, term396389.getClass(), "itsFunctionType", 0);
        setBooleanField(term396389, term396389.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396389, term396389.getClass(), "encodedSourceStart", 0);
        setIntField(term396389, term396389.getClass(), "encodedSourceEnd", 0);
        setField(term396389, term396389.getClass(), "sourceName", null);
        setIntField(term396389, term396389.getClass(), "baseLineno", 0);
        setIntField(term396389, term396389.getClass(), "endLineno", 0);
        setField(term396389, term396389.getClass(), "functions", null);
        setField(term396389, term396389.getClass(), "regexps", null);
        setField(term396389, term396389.getClass(), "itsVariables", null);
        setField(term396389, term396389.getClass(), "itsConst", null);
        setField(term396389, term396389.getClass(), "itsVariableNames", null);
        setIntField(term396389, term396389.getClass(), "varStart", 0);
        setField(term396389, term396389.getClass(), "compilerData", null);
        setIntField(term396389, term396389.getClass(), "type", 115);
        setField(term396389, term396389.getClass(), "next", null);
        setField(term396389, term396389.getClass(), "first", null);
        setField(term396389, term396389.getClass(), "last", null);
        setField(term396389, term396389.getClass(), "propListHead", null);
        setIntField(term396389, term396389.getClass(), "sourcePosition", 0);
        setField(term396389, term396389.getClass(), "jsType", null);
        setField(term396389, term396389.getClass(), "parent", null);
        term396390 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term396390, term396390.getClass(), "functionName", null);
        setBooleanField(term396390, term396390.getClass(), "itsNeedsActivation", false);
        setIntField(term396390, term396390.getClass(), "itsFunctionType", 0);
        setBooleanField(term396390, term396390.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396390, term396390.getClass(), "encodedSourceStart", 0);
        setIntField(term396390, term396390.getClass(), "encodedSourceEnd", 0);
        setField(term396390, term396390.getClass(), "sourceName", null);
        setIntField(term396390, term396390.getClass(), "baseLineno", 0);
        setIntField(term396390, term396390.getClass(), "endLineno", 0);
        setField(term396390, term396390.getClass(), "functions", null);
        setField(term396390, term396390.getClass(), "regexps", null);
        setField(term396390, term396390.getClass(), "itsVariables", null);
        setField(term396390, term396390.getClass(), "itsConst", null);
        setField(term396390, term396390.getClass(), "itsVariableNames", null);
        setIntField(term396390, term396390.getClass(), "varStart", 0);
        setField(term396390, term396390.getClass(), "compilerData", null);
        setIntField(term396390, term396390.getClass(), "type", 63);
        setField(term396390, term396390.getClass(), "next", null);
        setField(term396390, term396390.getClass(), "first", null);
        setField(term396390, term396390.getClass(), "last", null);
        setField(term396390, term396390.getClass(), "propListHead", null);
        setIntField(term396390, term396390.getClass(), "sourcePosition", 0);
        setField(term396390, term396390.getClass(), "jsType", null);
        setField(term396390, term396390.getClass(), "parent", null);
        term396295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term396306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term396295, term396295.getClass(), "functionName", null);
        setBooleanField(term396295, term396295.getClass(), "itsNeedsActivation", false);
        setIntField(term396295, term396295.getClass(), "itsFunctionType", 0);
        setBooleanField(term396295, term396295.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term396295, term396295.getClass(), "encodedSourceStart", 0);
        setIntField(term396295, term396295.getClass(), "encodedSourceEnd", 0);
        setField(term396295, term396295.getClass(), "sourceName", null);
        setIntField(term396295, term396295.getClass(), "baseLineno", 0);
        setIntField(term396295, term396295.getClass(), "endLineno", 0);
        setField(term396295, term396295.getClass(), "functions", null);
        setField(term396295, term396295.getClass(), "regexps", null);
        setField(term396295, term396295.getClass(), "itsVariables", null);
        setField(term396295, term396295.getClass(), "itsConst", null);
        setField(term396295, term396295.getClass(), "itsVariableNames", null);
        setIntField(term396295, term396295.getClass(), "varStart", 0);
        setField(term396295, term396295.getClass(), "compilerData", null);
        setIntField(term396295, term396295.getClass(), "type", 0);
        setField(term396295, term396295.getClass(), "next", null);
        setField(term396295, term396295.getClass(), "first", null);
        setField(term396295, term396295.getClass(), "last", null);
        setField(term396295, term396295.getClass(), "propListHead", null);
        setIntField(term396295, term396295.getClass(), "sourcePosition", 0);
        setField(term396295, term396295.getClass(), "jsType", null);
        setIntField(term396306, term396306.getClass(), "type", 108);
        setField(term396306, term396306.getClass(), "next", null);
        setField(term396306, term396306.getClass(), "first", null);
        setField(term396306, term396306.getClass(), "last", null);
        setField(term396306, term396306.getClass(), "propListHead", null);
        setIntField(term396306, term396306.getClass(), "sourcePosition", 0);
        setField(term396306, term396306.getClass(), "jsType", null);
        setField(term396306, term396306.getClass(), "parent", null);
        setField(term396295, term396295.getClass(), "parent", term396306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term395950;
        args[1] = term396106;
        args[2] = term396192;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term395864, args);
        assertTrue(recursiveEquals(term395864, term396386));
        assertTrue(recursiveEquals(term395950, term396387));
        assertTrue(recursiveEquals(term396106, term396389));
        assertTrue(recursiveEquals(term396192, term396390));
        assertTrue(recursiveEquals(retValue, term396295));
    }

};



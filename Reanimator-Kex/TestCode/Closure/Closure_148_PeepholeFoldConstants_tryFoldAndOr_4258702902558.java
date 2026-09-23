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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724137;
     Object term724223;
     Object term724379;
     Object term724465;
     Object term724560;
     Object term724561;
     Object term724563;
     Object term724564;
     Object term724469;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term724223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term724293, term724293.getClass(), "type", 108);
        setField(term724223, term724223.getClass(), "parent", term724293);
        setIntField(term724223, term724223.getClass(), "type", 0);
        term724379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term724379, term724379.getClass(), "type", 84);
        term724465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term724465, term724465.getClass(), "type", 63);
        term724560 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term724560, term724560.getClass(), "currentTraversal", null);
        term724561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term724561, term724561.getClass(), "functionName", null);
        setBooleanField(term724561, term724561.getClass(), "itsNeedsActivation", false);
        setIntField(term724561, term724561.getClass(), "itsFunctionType", 0);
        setBooleanField(term724561, term724561.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724561, term724561.getClass(), "encodedSourceStart", 0);
        setIntField(term724561, term724561.getClass(), "encodedSourceEnd", 0);
        setField(term724561, term724561.getClass(), "sourceName", null);
        setIntField(term724561, term724561.getClass(), "baseLineno", 0);
        setIntField(term724561, term724561.getClass(), "endLineno", 0);
        setField(term724561, term724561.getClass(), "functions", null);
        setField(term724561, term724561.getClass(), "regexps", null);
        setField(term724561, term724561.getClass(), "itsVariables", null);
        setField(term724561, term724561.getClass(), "itsConst", null);
        setField(term724561, term724561.getClass(), "itsVariableNames", null);
        setIntField(term724561, term724561.getClass(), "varStart", 0);
        setField(term724561, term724561.getClass(), "compilerData", null);
        setIntField(term724561, term724561.getClass(), "type", 0);
        setField(term724561, term724561.getClass(), "next", null);
        setField(term724561, term724561.getClass(), "first", null);
        setField(term724561, term724561.getClass(), "last", null);
        setField(term724561, term724561.getClass(), "propListHead", null);
        setIntField(term724561, term724561.getClass(), "sourcePosition", 0);
        setField(term724561, term724561.getClass(), "jsType", null);
        setIntField(term724562, term724562.getClass(), "type", 108);
        setField(term724562, term724562.getClass(), "next", null);
        setField(term724562, term724562.getClass(), "first", null);
        setField(term724562, term724562.getClass(), "last", null);
        setField(term724562, term724562.getClass(), "propListHead", null);
        setIntField(term724562, term724562.getClass(), "sourcePosition", 0);
        setField(term724562, term724562.getClass(), "jsType", null);
        setField(term724562, term724562.getClass(), "parent", null);
        setField(term724561, term724561.getClass(), "parent", term724562);
        term724563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term724563, term724563.getClass(), "functionName", null);
        setBooleanField(term724563, term724563.getClass(), "itsNeedsActivation", false);
        setIntField(term724563, term724563.getClass(), "itsFunctionType", 0);
        setBooleanField(term724563, term724563.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724563, term724563.getClass(), "encodedSourceStart", 0);
        setIntField(term724563, term724563.getClass(), "encodedSourceEnd", 0);
        setField(term724563, term724563.getClass(), "sourceName", null);
        setIntField(term724563, term724563.getClass(), "baseLineno", 0);
        setIntField(term724563, term724563.getClass(), "endLineno", 0);
        setField(term724563, term724563.getClass(), "functions", null);
        setField(term724563, term724563.getClass(), "regexps", null);
        setField(term724563, term724563.getClass(), "itsVariables", null);
        setField(term724563, term724563.getClass(), "itsConst", null);
        setField(term724563, term724563.getClass(), "itsVariableNames", null);
        setIntField(term724563, term724563.getClass(), "varStart", 0);
        setField(term724563, term724563.getClass(), "compilerData", null);
        setIntField(term724563, term724563.getClass(), "type", 84);
        setField(term724563, term724563.getClass(), "next", null);
        setField(term724563, term724563.getClass(), "first", null);
        setField(term724563, term724563.getClass(), "last", null);
        setField(term724563, term724563.getClass(), "propListHead", null);
        setIntField(term724563, term724563.getClass(), "sourcePosition", 0);
        setField(term724563, term724563.getClass(), "jsType", null);
        setField(term724563, term724563.getClass(), "parent", null);
        term724564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term724564, term724564.getClass(), "functionName", null);
        setBooleanField(term724564, term724564.getClass(), "itsNeedsActivation", false);
        setIntField(term724564, term724564.getClass(), "itsFunctionType", 0);
        setBooleanField(term724564, term724564.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724564, term724564.getClass(), "encodedSourceStart", 0);
        setIntField(term724564, term724564.getClass(), "encodedSourceEnd", 0);
        setField(term724564, term724564.getClass(), "sourceName", null);
        setIntField(term724564, term724564.getClass(), "baseLineno", 0);
        setIntField(term724564, term724564.getClass(), "endLineno", 0);
        setField(term724564, term724564.getClass(), "functions", null);
        setField(term724564, term724564.getClass(), "regexps", null);
        setField(term724564, term724564.getClass(), "itsVariables", null);
        setField(term724564, term724564.getClass(), "itsConst", null);
        setField(term724564, term724564.getClass(), "itsVariableNames", null);
        setIntField(term724564, term724564.getClass(), "varStart", 0);
        setField(term724564, term724564.getClass(), "compilerData", null);
        setIntField(term724564, term724564.getClass(), "type", 63);
        setField(term724564, term724564.getClass(), "next", null);
        setField(term724564, term724564.getClass(), "first", null);
        setField(term724564, term724564.getClass(), "last", null);
        setField(term724564, term724564.getClass(), "propListHead", null);
        setIntField(term724564, term724564.getClass(), "sourcePosition", 0);
        setField(term724564, term724564.getClass(), "jsType", null);
        setField(term724564, term724564.getClass(), "parent", null);
        term724469 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term724480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term724469, term724469.getClass(), "functionName", null);
        setBooleanField(term724469, term724469.getClass(), "itsNeedsActivation", false);
        setIntField(term724469, term724469.getClass(), "itsFunctionType", 0);
        setBooleanField(term724469, term724469.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term724469, term724469.getClass(), "encodedSourceStart", 0);
        setIntField(term724469, term724469.getClass(), "encodedSourceEnd", 0);
        setField(term724469, term724469.getClass(), "sourceName", null);
        setIntField(term724469, term724469.getClass(), "baseLineno", 0);
        setIntField(term724469, term724469.getClass(), "endLineno", 0);
        setField(term724469, term724469.getClass(), "functions", null);
        setField(term724469, term724469.getClass(), "regexps", null);
        setField(term724469, term724469.getClass(), "itsVariables", null);
        setField(term724469, term724469.getClass(), "itsConst", null);
        setField(term724469, term724469.getClass(), "itsVariableNames", null);
        setIntField(term724469, term724469.getClass(), "varStart", 0);
        setField(term724469, term724469.getClass(), "compilerData", null);
        setIntField(term724469, term724469.getClass(), "type", 0);
        setField(term724469, term724469.getClass(), "next", null);
        setField(term724469, term724469.getClass(), "first", null);
        setField(term724469, term724469.getClass(), "last", null);
        setField(term724469, term724469.getClass(), "propListHead", null);
        setIntField(term724469, term724469.getClass(), "sourcePosition", 0);
        setField(term724469, term724469.getClass(), "jsType", null);
        setIntField(term724480, term724480.getClass(), "type", 108);
        setField(term724480, term724480.getClass(), "next", null);
        setField(term724480, term724480.getClass(), "first", null);
        setField(term724480, term724480.getClass(), "last", null);
        setField(term724480, term724480.getClass(), "propListHead", null);
        setIntField(term724480, term724480.getClass(), "sourcePosition", 0);
        setField(term724480, term724480.getClass(), "jsType", null);
        setField(term724480, term724480.getClass(), "parent", null);
        setField(term724469, term724469.getClass(), "parent", term724480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term724223;
        args[1] = term724379;
        args[2] = term724465;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term724137, args);
        assertTrue(recursiveEquals(term724137, term724560));
        assertTrue(recursiveEquals(term724223, term724561));
        assertTrue(recursiveEquals(term724379, term724563));
        assertTrue(recursiveEquals(term724465, term724564));
        assertTrue(recursiveEquals(retValue, term724469));
    }

};



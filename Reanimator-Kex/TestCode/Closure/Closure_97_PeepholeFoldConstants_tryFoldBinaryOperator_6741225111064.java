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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330531;
     Object term330623;
     Object term331317;
     Object term331318;
     Object term331240;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term330623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330801 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term330715, term330715.getClass(), "next", term330801);
        setIntField(term330715, term330715.getClass(), "type", 0);
        setField(term330623, term330623.getClass(), "first", term330715);
        setIntField(term330623, term330623.getClass(), "type", 100);
        setField(term330623, term330623.getClass(), "parent", null);
        term331317 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term331317, term331317.getClass(), "currentTraversal", null);
        term331318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term331319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term331320 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term331318, term331318.getClass(), "str", null);
        setIntField(term331318, term331318.getClass(), "type", 100);
        setField(term331318, term331318.getClass(), "next", null);
        setField(term331319, term331319.getClass(), "str", null);
        setIntField(term331319, term331319.getClass(), "type", 0);
        setField(term331320, term331320.getClass(), "functionName", null);
        setBooleanField(term331320, term331320.getClass(), "itsNeedsActivation", false);
        setIntField(term331320, term331320.getClass(), "itsFunctionType", 0);
        setBooleanField(term331320, term331320.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term331320, term331320.getClass(), "encodedSourceStart", 0);
        setIntField(term331320, term331320.getClass(), "encodedSourceEnd", 0);
        setField(term331320, term331320.getClass(), "sourceName", null);
        setIntField(term331320, term331320.getClass(), "baseLineno", 0);
        setIntField(term331320, term331320.getClass(), "endLineno", 0);
        setField(term331320, term331320.getClass(), "functions", null);
        setField(term331320, term331320.getClass(), "regexps", null);
        setField(term331320, term331320.getClass(), "itsVariables", null);
        setField(term331320, term331320.getClass(), "itsConst", null);
        setField(term331320, term331320.getClass(), "itsVariableNames", null);
        setIntField(term331320, term331320.getClass(), "varStart", 0);
        setField(term331320, term331320.getClass(), "compilerData", null);
        setIntField(term331320, term331320.getClass(), "type", 0);
        setField(term331320, term331320.getClass(), "next", null);
        setField(term331320, term331320.getClass(), "first", null);
        setField(term331320, term331320.getClass(), "last", null);
        setField(term331320, term331320.getClass(), "propListHead", null);
        setIntField(term331320, term331320.getClass(), "sourcePosition", 0);
        setField(term331320, term331320.getClass(), "jsType", null);
        setField(term331320, term331320.getClass(), "parent", null);
        setField(term331319, term331319.getClass(), "next", term331320);
        setField(term331319, term331319.getClass(), "first", null);
        setField(term331319, term331319.getClass(), "last", null);
        setField(term331319, term331319.getClass(), "propListHead", null);
        setIntField(term331319, term331319.getClass(), "sourcePosition", 0);
        setField(term331319, term331319.getClass(), "jsType", null);
        setField(term331319, term331319.getClass(), "parent", null);
        setField(term331318, term331318.getClass(), "first", term331319);
        setField(term331318, term331318.getClass(), "last", null);
        setField(term331318, term331318.getClass(), "propListHead", null);
        setIntField(term331318, term331318.getClass(), "sourcePosition", 0);
        setField(term331318, term331318.getClass(), "jsType", null);
        setField(term331318, term331318.getClass(), "parent", null);
        term331240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term331242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term331244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term331240, term331240.getClass(), "str", null);
        setIntField(term331240, term331240.getClass(), "type", 100);
        setField(term331240, term331240.getClass(), "next", null);
        setField(term331242, term331242.getClass(), "str", null);
        setIntField(term331242, term331242.getClass(), "type", 0);
        setField(term331244, term331244.getClass(), "functionName", null);
        setBooleanField(term331244, term331244.getClass(), "itsNeedsActivation", false);
        setIntField(term331244, term331244.getClass(), "itsFunctionType", 0);
        setBooleanField(term331244, term331244.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term331244, term331244.getClass(), "encodedSourceStart", 0);
        setIntField(term331244, term331244.getClass(), "encodedSourceEnd", 0);
        setField(term331244, term331244.getClass(), "sourceName", null);
        setIntField(term331244, term331244.getClass(), "baseLineno", 0);
        setIntField(term331244, term331244.getClass(), "endLineno", 0);
        setField(term331244, term331244.getClass(), "functions", null);
        setField(term331244, term331244.getClass(), "regexps", null);
        setField(term331244, term331244.getClass(), "itsVariables", null);
        setField(term331244, term331244.getClass(), "itsConst", null);
        setField(term331244, term331244.getClass(), "itsVariableNames", null);
        setIntField(term331244, term331244.getClass(), "varStart", 0);
        setField(term331244, term331244.getClass(), "compilerData", null);
        setIntField(term331244, term331244.getClass(), "type", 0);
        setField(term331244, term331244.getClass(), "next", null);
        setField(term331244, term331244.getClass(), "first", null);
        setField(term331244, term331244.getClass(), "last", null);
        setField(term331244, term331244.getClass(), "propListHead", null);
        setIntField(term331244, term331244.getClass(), "sourcePosition", 0);
        setField(term331244, term331244.getClass(), "jsType", null);
        setField(term331244, term331244.getClass(), "parent", null);
        setField(term331242, term331242.getClass(), "next", term331244);
        setField(term331242, term331242.getClass(), "first", null);
        setField(term331242, term331242.getClass(), "last", null);
        setField(term331242, term331242.getClass(), "propListHead", null);
        setIntField(term331242, term331242.getClass(), "sourcePosition", 0);
        setField(term331242, term331242.getClass(), "jsType", null);
        setField(term331242, term331242.getClass(), "parent", null);
        setField(term331240, term331240.getClass(), "first", term331242);
        setField(term331240, term331240.getClass(), "last", null);
        setField(term331240, term331240.getClass(), "propListHead", null);
        setIntField(term331240, term331240.getClass(), "sourcePosition", 0);
        setField(term331240, term331240.getClass(), "jsType", null);
        setField(term331240, term331240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term330623;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term330531, args);
        assertTrue(recursiveEquals(term330531, term331317));
        assertTrue(recursiveEquals(term330623, term331318));
        assertTrue(recursiveEquals(retValue, term331240));
    }

};



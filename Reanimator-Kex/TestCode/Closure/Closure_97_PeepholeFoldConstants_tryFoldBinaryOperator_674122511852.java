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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243030;
     Object term243122;
     Object term243383;
     Object term243384;
     Object term243315;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term243122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243300 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term243214, term243214.getClass(), "next", term243300);
        setIntField(term243214, term243214.getClass(), "type", 14);
        setField(term243122, term243122.getClass(), "first", term243214);
        setIntField(term243122, term243122.getClass(), "type", 14);
        term243383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term243383, term243383.getClass(), "currentTraversal", null);
        term243384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243386 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term243384, term243384.getClass(), "str", null);
        setIntField(term243384, term243384.getClass(), "type", 14);
        setField(term243384, term243384.getClass(), "next", null);
        setField(term243385, term243385.getClass(), "str", null);
        setIntField(term243385, term243385.getClass(), "type", 14);
        setField(term243386, term243386.getClass(), "functionName", null);
        setBooleanField(term243386, term243386.getClass(), "itsNeedsActivation", false);
        setIntField(term243386, term243386.getClass(), "itsFunctionType", 0);
        setBooleanField(term243386, term243386.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243386, term243386.getClass(), "encodedSourceStart", 0);
        setIntField(term243386, term243386.getClass(), "encodedSourceEnd", 0);
        setField(term243386, term243386.getClass(), "sourceName", null);
        setIntField(term243386, term243386.getClass(), "baseLineno", 0);
        setIntField(term243386, term243386.getClass(), "endLineno", 0);
        setField(term243386, term243386.getClass(), "functions", null);
        setField(term243386, term243386.getClass(), "regexps", null);
        setField(term243386, term243386.getClass(), "itsVariables", null);
        setField(term243386, term243386.getClass(), "itsConst", null);
        setField(term243386, term243386.getClass(), "itsVariableNames", null);
        setIntField(term243386, term243386.getClass(), "varStart", 0);
        setField(term243386, term243386.getClass(), "compilerData", null);
        setIntField(term243386, term243386.getClass(), "type", 0);
        setField(term243386, term243386.getClass(), "next", null);
        setField(term243386, term243386.getClass(), "first", null);
        setField(term243386, term243386.getClass(), "last", null);
        setField(term243386, term243386.getClass(), "propListHead", null);
        setIntField(term243386, term243386.getClass(), "sourcePosition", 0);
        setField(term243386, term243386.getClass(), "jsType", null);
        setField(term243386, term243386.getClass(), "parent", null);
        setField(term243385, term243385.getClass(), "next", term243386);
        setField(term243385, term243385.getClass(), "first", null);
        setField(term243385, term243385.getClass(), "last", null);
        setField(term243385, term243385.getClass(), "propListHead", null);
        setIntField(term243385, term243385.getClass(), "sourcePosition", 0);
        setField(term243385, term243385.getClass(), "jsType", null);
        setField(term243385, term243385.getClass(), "parent", null);
        setField(term243384, term243384.getClass(), "first", term243385);
        setField(term243384, term243384.getClass(), "last", null);
        setField(term243384, term243384.getClass(), "propListHead", null);
        setIntField(term243384, term243384.getClass(), "sourcePosition", 0);
        setField(term243384, term243384.getClass(), "jsType", null);
        setField(term243384, term243384.getClass(), "parent", null);
        term243315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243317 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term243319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term243315, term243315.getClass(), "str", null);
        setIntField(term243315, term243315.getClass(), "type", 14);
        setField(term243315, term243315.getClass(), "next", null);
        setField(term243317, term243317.getClass(), "str", null);
        setIntField(term243317, term243317.getClass(), "type", 14);
        setField(term243319, term243319.getClass(), "functionName", null);
        setBooleanField(term243319, term243319.getClass(), "itsNeedsActivation", false);
        setIntField(term243319, term243319.getClass(), "itsFunctionType", 0);
        setBooleanField(term243319, term243319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term243319, term243319.getClass(), "encodedSourceStart", 0);
        setIntField(term243319, term243319.getClass(), "encodedSourceEnd", 0);
        setField(term243319, term243319.getClass(), "sourceName", null);
        setIntField(term243319, term243319.getClass(), "baseLineno", 0);
        setIntField(term243319, term243319.getClass(), "endLineno", 0);
        setField(term243319, term243319.getClass(), "functions", null);
        setField(term243319, term243319.getClass(), "regexps", null);
        setField(term243319, term243319.getClass(), "itsVariables", null);
        setField(term243319, term243319.getClass(), "itsConst", null);
        setField(term243319, term243319.getClass(), "itsVariableNames", null);
        setIntField(term243319, term243319.getClass(), "varStart", 0);
        setField(term243319, term243319.getClass(), "compilerData", null);
        setIntField(term243319, term243319.getClass(), "type", 0);
        setField(term243319, term243319.getClass(), "next", null);
        setField(term243319, term243319.getClass(), "first", null);
        setField(term243319, term243319.getClass(), "last", null);
        setField(term243319, term243319.getClass(), "propListHead", null);
        setIntField(term243319, term243319.getClass(), "sourcePosition", 0);
        setField(term243319, term243319.getClass(), "jsType", null);
        setField(term243319, term243319.getClass(), "parent", null);
        setField(term243317, term243317.getClass(), "next", term243319);
        setField(term243317, term243317.getClass(), "first", null);
        setField(term243317, term243317.getClass(), "last", null);
        setField(term243317, term243317.getClass(), "propListHead", null);
        setIntField(term243317, term243317.getClass(), "sourcePosition", 0);
        setField(term243317, term243317.getClass(), "jsType", null);
        setField(term243317, term243317.getClass(), "parent", null);
        setField(term243315, term243315.getClass(), "first", term243317);
        setField(term243315, term243315.getClass(), "last", null);
        setField(term243315, term243315.getClass(), "propListHead", null);
        setIntField(term243315, term243315.getClass(), "sourcePosition", 0);
        setField(term243315, term243315.getClass(), "jsType", null);
        setField(term243315, term243315.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term243122;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term243030, args);
        assertTrue(recursiveEquals(term243030, term243383));
        assertTrue(recursiveEquals(term243122, term243384));
        assertTrue(recursiveEquals(retValue, term243315));
    }

};



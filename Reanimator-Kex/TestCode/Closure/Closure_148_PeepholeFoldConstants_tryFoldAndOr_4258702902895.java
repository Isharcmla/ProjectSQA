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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844387;
     Object term844479;
     Object term844663;
     Object term844749;
     Object term845761;
     Object term845762;
     Object term845764;
     Object term845765;
     Object term845684;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term844479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term844571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term844571, term844571.getClass(), "type", 113);
        setField(term844479, term844479.getClass(), "parent", term844571);
        setIntField(term844479, term844479.getClass(), "type", 113);
        term844663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term844663, term844663.getClass(), "type", 0);
        term844749 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term844749, term844749.getClass(), "type", 44);
        term845761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term845761, term845761.getClass(), "currentTraversal", null);
        term845762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term845763 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term845762, term845762.getClass(), "number", 0.0);
        setIntField(term845762, term845762.getClass(), "type", 113);
        setField(term845762, term845762.getClass(), "next", null);
        setField(term845762, term845762.getClass(), "first", null);
        setField(term845762, term845762.getClass(), "last", null);
        setField(term845762, term845762.getClass(), "propListHead", null);
        setIntField(term845762, term845762.getClass(), "sourcePosition", 0);
        setField(term845762, term845762.getClass(), "jsType", null);
        setField(term845763, term845763.getClass(), "str", null);
        setIntField(term845763, term845763.getClass(), "type", 113);
        setField(term845763, term845763.getClass(), "next", null);
        setField(term845763, term845763.getClass(), "first", null);
        setField(term845763, term845763.getClass(), "last", null);
        setField(term845763, term845763.getClass(), "propListHead", null);
        setIntField(term845763, term845763.getClass(), "sourcePosition", 0);
        setField(term845763, term845763.getClass(), "jsType", null);
        setField(term845763, term845763.getClass(), "parent", null);
        setField(term845762, term845762.getClass(), "parent", term845763);
        term845764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term845764, term845764.getClass(), "str", null);
        setIntField(term845764, term845764.getClass(), "type", 0);
        setField(term845764, term845764.getClass(), "next", null);
        setField(term845764, term845764.getClass(), "first", null);
        setField(term845764, term845764.getClass(), "last", null);
        setField(term845764, term845764.getClass(), "propListHead", null);
        setIntField(term845764, term845764.getClass(), "sourcePosition", 0);
        setField(term845764, term845764.getClass(), "jsType", null);
        setField(term845764, term845764.getClass(), "parent", null);
        term845765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term845765, term845765.getClass(), "functionName", null);
        setBooleanField(term845765, term845765.getClass(), "itsNeedsActivation", false);
        setIntField(term845765, term845765.getClass(), "itsFunctionType", 0);
        setBooleanField(term845765, term845765.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term845765, term845765.getClass(), "encodedSourceStart", 0);
        setIntField(term845765, term845765.getClass(), "encodedSourceEnd", 0);
        setField(term845765, term845765.getClass(), "sourceName", null);
        setIntField(term845765, term845765.getClass(), "baseLineno", 0);
        setIntField(term845765, term845765.getClass(), "endLineno", 0);
        setField(term845765, term845765.getClass(), "functions", null);
        setField(term845765, term845765.getClass(), "regexps", null);
        setField(term845765, term845765.getClass(), "itsVariables", null);
        setField(term845765, term845765.getClass(), "itsConst", null);
        setField(term845765, term845765.getClass(), "itsVariableNames", null);
        setIntField(term845765, term845765.getClass(), "varStart", 0);
        setField(term845765, term845765.getClass(), "compilerData", null);
        setIntField(term845765, term845765.getClass(), "type", 44);
        setField(term845765, term845765.getClass(), "next", null);
        setField(term845765, term845765.getClass(), "first", null);
        setField(term845765, term845765.getClass(), "last", null);
        setField(term845765, term845765.getClass(), "propListHead", null);
        setIntField(term845765, term845765.getClass(), "sourcePosition", 0);
        setField(term845765, term845765.getClass(), "jsType", null);
        setField(term845765, term845765.getClass(), "parent", null);
        term845684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term845688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term845684, term845684.getClass(), "number", 0.0);
        setIntField(term845684, term845684.getClass(), "type", 113);
        setField(term845684, term845684.getClass(), "next", null);
        setField(term845684, term845684.getClass(), "first", null);
        setField(term845684, term845684.getClass(), "last", null);
        setField(term845684, term845684.getClass(), "propListHead", null);
        setIntField(term845684, term845684.getClass(), "sourcePosition", 0);
        setField(term845684, term845684.getClass(), "jsType", null);
        setField(term845688, term845688.getClass(), "str", null);
        setIntField(term845688, term845688.getClass(), "type", 113);
        setField(term845688, term845688.getClass(), "next", null);
        setField(term845688, term845688.getClass(), "first", null);
        setField(term845688, term845688.getClass(), "last", null);
        setField(term845688, term845688.getClass(), "propListHead", null);
        setIntField(term845688, term845688.getClass(), "sourcePosition", 0);
        setField(term845688, term845688.getClass(), "jsType", null);
        setField(term845688, term845688.getClass(), "parent", null);
        setField(term845684, term845684.getClass(), "parent", term845688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term844479;
        args[1] = term844663;
        args[2] = term844749;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term844387, args);
        assertTrue(recursiveEquals(term844387, term845761));
        assertTrue(recursiveEquals(term844479, term845762));
        assertTrue(recursiveEquals(term844663, term845764));
        assertTrue(recursiveEquals(term844749, term845765));
        assertTrue(recursiveEquals(retValue, term845684));
    }

};



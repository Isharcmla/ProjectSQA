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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604676;
     Object term604768;
     Object term604860;
     Object term604946;
     Object term605518;
     Object term605519;
     Object term605520;
     Object term605521;
     Object term605471;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604676 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term604768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term604768, term604768.getClass(), "parent", null);
        setIntField(term604768, term604768.getClass(), "type", 0);
        term604860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term604860, term604860.getClass(), "type", 0);
        term604946 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term605518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term605518, term605518.getClass(), "currentTraversal", null);
        term605519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term605519, term605519.getClass(), "str", null);
        setIntField(term605519, term605519.getClass(), "type", 0);
        setField(term605519, term605519.getClass(), "next", null);
        setField(term605519, term605519.getClass(), "first", null);
        setField(term605519, term605519.getClass(), "last", null);
        setField(term605519, term605519.getClass(), "propListHead", null);
        setIntField(term605519, term605519.getClass(), "sourcePosition", 0);
        setField(term605519, term605519.getClass(), "jsType", null);
        setField(term605519, term605519.getClass(), "parent", null);
        term605520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term605520, term605520.getClass(), "number", 0.0);
        setIntField(term605520, term605520.getClass(), "type", 0);
        setField(term605520, term605520.getClass(), "next", null);
        setField(term605520, term605520.getClass(), "first", null);
        setField(term605520, term605520.getClass(), "last", null);
        setField(term605520, term605520.getClass(), "propListHead", null);
        setIntField(term605520, term605520.getClass(), "sourcePosition", 0);
        setField(term605520, term605520.getClass(), "jsType", null);
        setField(term605520, term605520.getClass(), "parent", null);
        term605521 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term605521, term605521.getClass(), "functionName", null);
        setBooleanField(term605521, term605521.getClass(), "itsNeedsActivation", false);
        setIntField(term605521, term605521.getClass(), "itsFunctionType", 0);
        setBooleanField(term605521, term605521.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term605521, term605521.getClass(), "encodedSourceStart", 0);
        setIntField(term605521, term605521.getClass(), "encodedSourceEnd", 0);
        setField(term605521, term605521.getClass(), "sourceName", null);
        setIntField(term605521, term605521.getClass(), "baseLineno", 0);
        setIntField(term605521, term605521.getClass(), "endLineno", 0);
        setField(term605521, term605521.getClass(), "functions", null);
        setField(term605521, term605521.getClass(), "regexps", null);
        setField(term605521, term605521.getClass(), "itsVariables", null);
        setField(term605521, term605521.getClass(), "itsConst", null);
        setField(term605521, term605521.getClass(), "itsVariableNames", null);
        setIntField(term605521, term605521.getClass(), "varStart", 0);
        setField(term605521, term605521.getClass(), "compilerData", null);
        setIntField(term605521, term605521.getClass(), "type", 0);
        setField(term605521, term605521.getClass(), "next", null);
        setField(term605521, term605521.getClass(), "first", null);
        setField(term605521, term605521.getClass(), "last", null);
        setField(term605521, term605521.getClass(), "propListHead", null);
        setIntField(term605521, term605521.getClass(), "sourcePosition", 0);
        setField(term605521, term605521.getClass(), "jsType", null);
        setField(term605521, term605521.getClass(), "parent", null);
        term605471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term605471, term605471.getClass(), "str", null);
        setIntField(term605471, term605471.getClass(), "type", 0);
        setField(term605471, term605471.getClass(), "next", null);
        setField(term605471, term605471.getClass(), "first", null);
        setField(term605471, term605471.getClass(), "last", null);
        setField(term605471, term605471.getClass(), "propListHead", null);
        setIntField(term605471, term605471.getClass(), "sourcePosition", 0);
        setField(term605471, term605471.getClass(), "jsType", null);
        setField(term605471, term605471.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term604768;
        args[1] = term604860;
        args[2] = term604946;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term604676, args);
        assertTrue(recursiveEquals(term604676, term605518));
        assertTrue(recursiveEquals(term604768, term605519));
        assertTrue(recursiveEquals(term604860, term605520));
        assertTrue(recursiveEquals(term604946, term605521));
        assertTrue(recursiveEquals(retValue, term605471));
    }

};



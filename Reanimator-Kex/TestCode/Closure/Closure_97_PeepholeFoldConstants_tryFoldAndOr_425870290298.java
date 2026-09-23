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

public class PeepholeFoldConstants_tryFoldAndOr_425870290298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59711;
     Object term59803;
     Object term59895;
     Object term59981;
     Object term60068;
     Object term60069;
     Object term60070;
     Object term60071;
     Object term60020;

    public PeepholeFoldConstants_tryFoldAndOr_425870290298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59711 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term59803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term59803, term59803.getClass(), "parent", null);
        setIntField(term59803, term59803.getClass(), "type", 0);
        term59895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59895, term59895.getClass(), "type", 0);
        term59981 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term60068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term60068, term60068.getClass(), "currentTraversal", null);
        term60069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60069, term60069.getClass(), "number", 0.0);
        setIntField(term60069, term60069.getClass(), "type", 0);
        setField(term60069, term60069.getClass(), "next", null);
        setField(term60069, term60069.getClass(), "first", null);
        setField(term60069, term60069.getClass(), "last", null);
        setField(term60069, term60069.getClass(), "propListHead", null);
        setIntField(term60069, term60069.getClass(), "sourcePosition", 0);
        setField(term60069, term60069.getClass(), "jsType", null);
        setField(term60069, term60069.getClass(), "parent", null);
        term60070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60070, term60070.getClass(), "number", 0.0);
        setIntField(term60070, term60070.getClass(), "type", 0);
        setField(term60070, term60070.getClass(), "next", null);
        setField(term60070, term60070.getClass(), "first", null);
        setField(term60070, term60070.getClass(), "last", null);
        setField(term60070, term60070.getClass(), "propListHead", null);
        setIntField(term60070, term60070.getClass(), "sourcePosition", 0);
        setField(term60070, term60070.getClass(), "jsType", null);
        setField(term60070, term60070.getClass(), "parent", null);
        term60071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term60071, term60071.getClass(), "functionName", null);
        setBooleanField(term60071, term60071.getClass(), "itsNeedsActivation", false);
        setIntField(term60071, term60071.getClass(), "itsFunctionType", 0);
        setBooleanField(term60071, term60071.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term60071, term60071.getClass(), "encodedSourceStart", 0);
        setIntField(term60071, term60071.getClass(), "encodedSourceEnd", 0);
        setField(term60071, term60071.getClass(), "sourceName", null);
        setIntField(term60071, term60071.getClass(), "baseLineno", 0);
        setIntField(term60071, term60071.getClass(), "endLineno", 0);
        setField(term60071, term60071.getClass(), "functions", null);
        setField(term60071, term60071.getClass(), "regexps", null);
        setField(term60071, term60071.getClass(), "itsVariables", null);
        setField(term60071, term60071.getClass(), "itsConst", null);
        setField(term60071, term60071.getClass(), "itsVariableNames", null);
        setIntField(term60071, term60071.getClass(), "varStart", 0);
        setField(term60071, term60071.getClass(), "compilerData", null);
        setIntField(term60071, term60071.getClass(), "type", 0);
        setField(term60071, term60071.getClass(), "next", null);
        setField(term60071, term60071.getClass(), "first", null);
        setField(term60071, term60071.getClass(), "last", null);
        setField(term60071, term60071.getClass(), "propListHead", null);
        setIntField(term60071, term60071.getClass(), "sourcePosition", 0);
        setField(term60071, term60071.getClass(), "jsType", null);
        setField(term60071, term60071.getClass(), "parent", null);
        term60020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term60020, term60020.getClass(), "number", 0.0);
        setIntField(term60020, term60020.getClass(), "type", 0);
        setField(term60020, term60020.getClass(), "next", null);
        setField(term60020, term60020.getClass(), "first", null);
        setField(term60020, term60020.getClass(), "last", null);
        setField(term60020, term60020.getClass(), "propListHead", null);
        setIntField(term60020, term60020.getClass(), "sourcePosition", 0);
        setField(term60020, term60020.getClass(), "jsType", null);
        setField(term60020, term60020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term59803;
        args[1] = term59895;
        args[2] = term59981;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term59711, args);
        assertTrue(recursiveEquals(term59711, term60068));
        assertTrue(recursiveEquals(term59803, term60069));
        assertTrue(recursiveEquals(term59895, term60070));
        assertTrue(recursiveEquals(term59981, term60071));
        assertTrue(recursiveEquals(retValue, term60020));
    }

};



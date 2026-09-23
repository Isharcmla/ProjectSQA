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

public class PeepholeFoldConstants_tryFoldAdd_1749649931314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62967;
     Object term63059;
     Object term63145;
     Object term63237;
     Object term63386;
     Object term63387;
     Object term63388;
     Object term63389;
     Object term63352;

    public PeepholeFoldConstants_tryFoldAdd_1749649931314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62967 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term63059, term63059.getClass(), "type", 21);
        term63145 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term63145, term63145.getClass(), "type", 21);
        term63237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term63386 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63386, term63386.getClass(), "currentTraversal", null);
        term63387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63387, term63387.getClass(), "str", null);
        setIntField(term63387, term63387.getClass(), "type", 21);
        setField(term63387, term63387.getClass(), "next", null);
        setField(term63387, term63387.getClass(), "first", null);
        setField(term63387, term63387.getClass(), "last", null);
        setField(term63387, term63387.getClass(), "propListHead", null);
        setIntField(term63387, term63387.getClass(), "sourcePosition", 0);
        setField(term63387, term63387.getClass(), "jsType", null);
        setField(term63387, term63387.getClass(), "parent", null);
        term63388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term63388, term63388.getClass(), "functionName", null);
        setBooleanField(term63388, term63388.getClass(), "itsNeedsActivation", false);
        setIntField(term63388, term63388.getClass(), "itsFunctionType", 0);
        setBooleanField(term63388, term63388.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term63388, term63388.getClass(), "encodedSourceStart", 0);
        setIntField(term63388, term63388.getClass(), "encodedSourceEnd", 0);
        setField(term63388, term63388.getClass(), "sourceName", null);
        setIntField(term63388, term63388.getClass(), "baseLineno", 0);
        setIntField(term63388, term63388.getClass(), "endLineno", 0);
        setField(term63388, term63388.getClass(), "functions", null);
        setField(term63388, term63388.getClass(), "regexps", null);
        setField(term63388, term63388.getClass(), "itsVariables", null);
        setField(term63388, term63388.getClass(), "itsConst", null);
        setField(term63388, term63388.getClass(), "itsVariableNames", null);
        setIntField(term63388, term63388.getClass(), "varStart", 0);
        setField(term63388, term63388.getClass(), "compilerData", null);
        setIntField(term63388, term63388.getClass(), "type", 21);
        setField(term63388, term63388.getClass(), "next", null);
        setField(term63388, term63388.getClass(), "first", null);
        setField(term63388, term63388.getClass(), "last", null);
        setField(term63388, term63388.getClass(), "propListHead", null);
        setIntField(term63388, term63388.getClass(), "sourcePosition", 0);
        setField(term63388, term63388.getClass(), "jsType", null);
        setField(term63388, term63388.getClass(), "parent", null);
        term63389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63389, term63389.getClass(), "str", null);
        setIntField(term63389, term63389.getClass(), "type", 0);
        setField(term63389, term63389.getClass(), "next", null);
        setField(term63389, term63389.getClass(), "first", null);
        setField(term63389, term63389.getClass(), "last", null);
        setField(term63389, term63389.getClass(), "propListHead", null);
        setIntField(term63389, term63389.getClass(), "sourcePosition", 0);
        setField(term63389, term63389.getClass(), "jsType", null);
        setField(term63389, term63389.getClass(), "parent", null);
        term63352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63352, term63352.getClass(), "str", null);
        setIntField(term63352, term63352.getClass(), "type", 21);
        setField(term63352, term63352.getClass(), "next", null);
        setField(term63352, term63352.getClass(), "first", null);
        setField(term63352, term63352.getClass(), "last", null);
        setField(term63352, term63352.getClass(), "propListHead", null);
        setIntField(term63352, term63352.getClass(), "sourcePosition", 0);
        setField(term63352, term63352.getClass(), "jsType", null);
        setField(term63352, term63352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term63059;
        args[1] = term63145;
        args[2] = term63237;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term62967, args);
        assertTrue(recursiveEquals(term62967, term63386));
        assertTrue(recursiveEquals(term63059, term63387));
        assertTrue(recursiveEquals(term63145, term63388));
        assertTrue(recursiveEquals(term63237, term63389));
        assertTrue(recursiveEquals(retValue, term63352));
    }

};



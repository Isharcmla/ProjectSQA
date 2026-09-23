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

public class PeepholeFoldConstants_tryFoldComparison_848443179441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101575;
     Object term101667;
     Object term101759;
     Object term101845;
     Object term102324;
     Object term102325;
     Object term102326;
     Object term102327;
     Object term102296;

    public PeepholeFoldConstants_tryFoldComparison_848443179441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term101667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term101667, term101667.getClass(), "type", 16);
        term101759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term101759, term101759.getClass(), "type", 42);
        term101845 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term101845, term101845.getClass(), "type", 42);
        term102324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term102324, term102324.getClass(), "currentTraversal", null);
        term102325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term102325, term102325.getClass(), "str", null);
        setIntField(term102325, term102325.getClass(), "type", 42);
        setField(term102325, term102325.getClass(), "next", null);
        setField(term102325, term102325.getClass(), "first", null);
        setField(term102325, term102325.getClass(), "last", null);
        setField(term102325, term102325.getClass(), "propListHead", null);
        setIntField(term102325, term102325.getClass(), "sourcePosition", 0);
        setField(term102325, term102325.getClass(), "jsType", null);
        setField(term102325, term102325.getClass(), "parent", null);
        term102326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term102326, term102326.getClass(), "str", null);
        setIntField(term102326, term102326.getClass(), "type", 16);
        setField(term102326, term102326.getClass(), "next", null);
        setField(term102326, term102326.getClass(), "first", null);
        setField(term102326, term102326.getClass(), "last", null);
        setField(term102326, term102326.getClass(), "propListHead", null);
        setIntField(term102326, term102326.getClass(), "sourcePosition", 0);
        setField(term102326, term102326.getClass(), "jsType", null);
        setField(term102326, term102326.getClass(), "parent", null);
        term102327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102327, term102327.getClass(), "functionName", null);
        setBooleanField(term102327, term102327.getClass(), "itsNeedsActivation", false);
        setIntField(term102327, term102327.getClass(), "itsFunctionType", 0);
        setBooleanField(term102327, term102327.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term102327, term102327.getClass(), "encodedSourceStart", 0);
        setIntField(term102327, term102327.getClass(), "encodedSourceEnd", 0);
        setField(term102327, term102327.getClass(), "sourceName", null);
        setIntField(term102327, term102327.getClass(), "baseLineno", 0);
        setIntField(term102327, term102327.getClass(), "endLineno", 0);
        setField(term102327, term102327.getClass(), "functions", null);
        setField(term102327, term102327.getClass(), "regexps", null);
        setField(term102327, term102327.getClass(), "itsVariables", null);
        setField(term102327, term102327.getClass(), "itsConst", null);
        setField(term102327, term102327.getClass(), "itsVariableNames", null);
        setIntField(term102327, term102327.getClass(), "varStart", 0);
        setField(term102327, term102327.getClass(), "compilerData", null);
        setIntField(term102327, term102327.getClass(), "type", 42);
        setField(term102327, term102327.getClass(), "next", null);
        setField(term102327, term102327.getClass(), "first", null);
        setField(term102327, term102327.getClass(), "last", null);
        setField(term102327, term102327.getClass(), "propListHead", null);
        setIntField(term102327, term102327.getClass(), "sourcePosition", 0);
        setField(term102327, term102327.getClass(), "jsType", null);
        setField(term102327, term102327.getClass(), "parent", null);
        term102296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term102296, term102296.getClass(), "str", null);
        setIntField(term102296, term102296.getClass(), "type", 16);
        setField(term102296, term102296.getClass(), "next", null);
        setField(term102296, term102296.getClass(), "first", null);
        setField(term102296, term102296.getClass(), "last", null);
        setField(term102296, term102296.getClass(), "propListHead", null);
        setIntField(term102296, term102296.getClass(), "sourcePosition", 0);
        setField(term102296, term102296.getClass(), "jsType", null);
        setField(term102296, term102296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term101667;
        args[1] = term101759;
        args[2] = term101845;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term101575, args);
        assertTrue(recursiveEquals(term101575, term102324));
        assertTrue(recursiveEquals(term101667, term102325));
        assertTrue(recursiveEquals(term101759, term102326));
        assertTrue(recursiveEquals(term101845, term102327));
        assertTrue(recursiveEquals(retValue, term102296));
    }

};



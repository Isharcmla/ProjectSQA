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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490937;
     Object term491023;
     Object term491207;
     Object term491299;
     Object term491359;
     Object term491360;
     Object term491362;
     Object term491363;
     Object term491303;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term491023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term491115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491023, term491023.getClass(), "parent", term491115);
        setIntField(term491023, term491023.getClass(), "type", 0);
        term491207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term491207, term491207.getClass(), "type", 0);
        term491299 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term491299, term491299.getClass(), "type", 63);
        term491359 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term491359, term491359.getClass(), "currentTraversal", null);
        term491360 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term491361 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491360, term491360.getClass(), "functionName", null);
        setBooleanField(term491360, term491360.getClass(), "itsNeedsActivation", false);
        setIntField(term491360, term491360.getClass(), "itsFunctionType", 0);
        setBooleanField(term491360, term491360.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term491360, term491360.getClass(), "encodedSourceStart", 0);
        setIntField(term491360, term491360.getClass(), "encodedSourceEnd", 0);
        setField(term491360, term491360.getClass(), "sourceName", null);
        setIntField(term491360, term491360.getClass(), "baseLineno", 0);
        setIntField(term491360, term491360.getClass(), "endLineno", 0);
        setField(term491360, term491360.getClass(), "functions", null);
        setField(term491360, term491360.getClass(), "regexps", null);
        setField(term491360, term491360.getClass(), "itsVariables", null);
        setField(term491360, term491360.getClass(), "itsConst", null);
        setField(term491360, term491360.getClass(), "itsVariableNames", null);
        setIntField(term491360, term491360.getClass(), "varStart", 0);
        setField(term491360, term491360.getClass(), "compilerData", null);
        setIntField(term491360, term491360.getClass(), "type", 0);
        setField(term491360, term491360.getClass(), "next", null);
        setField(term491360, term491360.getClass(), "first", null);
        setField(term491360, term491360.getClass(), "last", null);
        setField(term491360, term491360.getClass(), "propListHead", null);
        setIntField(term491360, term491360.getClass(), "sourcePosition", 0);
        setField(term491360, term491360.getClass(), "jsType", null);
        setField(term491361, term491361.getClass(), "str", null);
        setIntField(term491361, term491361.getClass(), "type", 0);
        setField(term491361, term491361.getClass(), "next", null);
        setField(term491361, term491361.getClass(), "first", null);
        setField(term491361, term491361.getClass(), "last", null);
        setField(term491361, term491361.getClass(), "propListHead", null);
        setIntField(term491361, term491361.getClass(), "sourcePosition", 0);
        setField(term491361, term491361.getClass(), "jsType", null);
        setField(term491361, term491361.getClass(), "parent", null);
        setField(term491360, term491360.getClass(), "parent", term491361);
        term491362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491362, term491362.getClass(), "str", null);
        setIntField(term491362, term491362.getClass(), "type", 0);
        setField(term491362, term491362.getClass(), "next", null);
        setField(term491362, term491362.getClass(), "first", null);
        setField(term491362, term491362.getClass(), "last", null);
        setField(term491362, term491362.getClass(), "propListHead", null);
        setIntField(term491362, term491362.getClass(), "sourcePosition", 0);
        setField(term491362, term491362.getClass(), "jsType", null);
        setField(term491362, term491362.getClass(), "parent", null);
        term491363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term491363, term491363.getClass(), "number", 0.0);
        setIntField(term491363, term491363.getClass(), "type", 63);
        setField(term491363, term491363.getClass(), "next", null);
        setField(term491363, term491363.getClass(), "first", null);
        setField(term491363, term491363.getClass(), "last", null);
        setField(term491363, term491363.getClass(), "propListHead", null);
        setIntField(term491363, term491363.getClass(), "sourcePosition", 0);
        setField(term491363, term491363.getClass(), "jsType", null);
        setField(term491363, term491363.getClass(), "parent", null);
        term491303 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term491314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term491303, term491303.getClass(), "functionName", null);
        setBooleanField(term491303, term491303.getClass(), "itsNeedsActivation", false);
        setIntField(term491303, term491303.getClass(), "itsFunctionType", 0);
        setBooleanField(term491303, term491303.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term491303, term491303.getClass(), "encodedSourceStart", 0);
        setIntField(term491303, term491303.getClass(), "encodedSourceEnd", 0);
        setField(term491303, term491303.getClass(), "sourceName", null);
        setIntField(term491303, term491303.getClass(), "baseLineno", 0);
        setIntField(term491303, term491303.getClass(), "endLineno", 0);
        setField(term491303, term491303.getClass(), "functions", null);
        setField(term491303, term491303.getClass(), "regexps", null);
        setField(term491303, term491303.getClass(), "itsVariables", null);
        setField(term491303, term491303.getClass(), "itsConst", null);
        setField(term491303, term491303.getClass(), "itsVariableNames", null);
        setIntField(term491303, term491303.getClass(), "varStart", 0);
        setField(term491303, term491303.getClass(), "compilerData", null);
        setIntField(term491303, term491303.getClass(), "type", 0);
        setField(term491303, term491303.getClass(), "next", null);
        setField(term491303, term491303.getClass(), "first", null);
        setField(term491303, term491303.getClass(), "last", null);
        setField(term491303, term491303.getClass(), "propListHead", null);
        setIntField(term491303, term491303.getClass(), "sourcePosition", 0);
        setField(term491303, term491303.getClass(), "jsType", null);
        setField(term491314, term491314.getClass(), "str", null);
        setIntField(term491314, term491314.getClass(), "type", 0);
        setField(term491314, term491314.getClass(), "next", null);
        setField(term491314, term491314.getClass(), "first", null);
        setField(term491314, term491314.getClass(), "last", null);
        setField(term491314, term491314.getClass(), "propListHead", null);
        setIntField(term491314, term491314.getClass(), "sourcePosition", 0);
        setField(term491314, term491314.getClass(), "jsType", null);
        setField(term491314, term491314.getClass(), "parent", null);
        setField(term491303, term491303.getClass(), "parent", term491314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term491023;
        args[1] = term491207;
        args[2] = term491299;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term490937, args);
        assertTrue(recursiveEquals(term490937, term491359));
        assertTrue(recursiveEquals(term491023, term491360));
        assertTrue(recursiveEquals(term491207, term491362));
        assertTrue(recursiveEquals(term491299, term491363));
        assertTrue(recursiveEquals(retValue, term491303));
    }

};



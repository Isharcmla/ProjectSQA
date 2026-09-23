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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717564;
     Object term717650;
     Object term717834;
     Object term717926;
     Object term718414;
     Object term718415;
     Object term718417;
     Object term718418;
     Object term718334;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717564 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term717650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term717742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term717742, term717742.getClass(), "type", 114);
        setField(term717650, term717650.getClass(), "parent", term717742);
        setIntField(term717650, term717650.getClass(), "type", 0);
        term717834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term717834, term717834.getClass(), "type", 71);
        term717926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term717926, term717926.getClass(), "type", 44);
        term718414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term718414, term718414.getClass(), "currentTraversal", null);
        term718415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term718415, term718415.getClass(), "functionName", null);
        setBooleanField(term718415, term718415.getClass(), "itsNeedsActivation", false);
        setIntField(term718415, term718415.getClass(), "itsFunctionType", 0);
        setBooleanField(term718415, term718415.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718415, term718415.getClass(), "encodedSourceStart", 0);
        setIntField(term718415, term718415.getClass(), "encodedSourceEnd", 0);
        setField(term718415, term718415.getClass(), "sourceName", null);
        setIntField(term718415, term718415.getClass(), "baseLineno", 0);
        setIntField(term718415, term718415.getClass(), "endLineno", 0);
        setField(term718415, term718415.getClass(), "functions", null);
        setField(term718415, term718415.getClass(), "regexps", null);
        setField(term718415, term718415.getClass(), "itsVariables", null);
        setField(term718415, term718415.getClass(), "itsConst", null);
        setField(term718415, term718415.getClass(), "itsVariableNames", null);
        setIntField(term718415, term718415.getClass(), "varStart", 0);
        setField(term718415, term718415.getClass(), "compilerData", null);
        setIntField(term718415, term718415.getClass(), "type", 0);
        setField(term718415, term718415.getClass(), "next", null);
        setField(term718415, term718415.getClass(), "first", null);
        setField(term718415, term718415.getClass(), "last", null);
        setField(term718415, term718415.getClass(), "propListHead", null);
        setIntField(term718415, term718415.getClass(), "sourcePosition", 0);
        setField(term718415, term718415.getClass(), "jsType", null);
        setDoubleField(term718416, term718416.getClass(), "number", 0.0);
        setIntField(term718416, term718416.getClass(), "type", 114);
        setField(term718416, term718416.getClass(), "next", null);
        setField(term718416, term718416.getClass(), "first", null);
        setField(term718416, term718416.getClass(), "last", null);
        setField(term718416, term718416.getClass(), "propListHead", null);
        setIntField(term718416, term718416.getClass(), "sourcePosition", 0);
        setField(term718416, term718416.getClass(), "jsType", null);
        setField(term718416, term718416.getClass(), "parent", null);
        setField(term718415, term718415.getClass(), "parent", term718416);
        term718417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term718417, term718417.getClass(), "number", 0.0);
        setIntField(term718417, term718417.getClass(), "type", 71);
        setField(term718417, term718417.getClass(), "next", null);
        setField(term718417, term718417.getClass(), "first", null);
        setField(term718417, term718417.getClass(), "last", null);
        setField(term718417, term718417.getClass(), "propListHead", null);
        setIntField(term718417, term718417.getClass(), "sourcePosition", 0);
        setField(term718417, term718417.getClass(), "jsType", null);
        setField(term718417, term718417.getClass(), "parent", null);
        term718418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term718418, term718418.getClass(), "str", null);
        setIntField(term718418, term718418.getClass(), "type", 44);
        setField(term718418, term718418.getClass(), "next", null);
        setField(term718418, term718418.getClass(), "first", null);
        setField(term718418, term718418.getClass(), "last", null);
        setField(term718418, term718418.getClass(), "propListHead", null);
        setIntField(term718418, term718418.getClass(), "sourcePosition", 0);
        setField(term718418, term718418.getClass(), "jsType", null);
        setField(term718418, term718418.getClass(), "parent", null);
        term718334 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term718345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term718334, term718334.getClass(), "functionName", null);
        setBooleanField(term718334, term718334.getClass(), "itsNeedsActivation", false);
        setIntField(term718334, term718334.getClass(), "itsFunctionType", 0);
        setBooleanField(term718334, term718334.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term718334, term718334.getClass(), "encodedSourceStart", 0);
        setIntField(term718334, term718334.getClass(), "encodedSourceEnd", 0);
        setField(term718334, term718334.getClass(), "sourceName", null);
        setIntField(term718334, term718334.getClass(), "baseLineno", 0);
        setIntField(term718334, term718334.getClass(), "endLineno", 0);
        setField(term718334, term718334.getClass(), "functions", null);
        setField(term718334, term718334.getClass(), "regexps", null);
        setField(term718334, term718334.getClass(), "itsVariables", null);
        setField(term718334, term718334.getClass(), "itsConst", null);
        setField(term718334, term718334.getClass(), "itsVariableNames", null);
        setIntField(term718334, term718334.getClass(), "varStart", 0);
        setField(term718334, term718334.getClass(), "compilerData", null);
        setIntField(term718334, term718334.getClass(), "type", 0);
        setField(term718334, term718334.getClass(), "next", null);
        setField(term718334, term718334.getClass(), "first", null);
        setField(term718334, term718334.getClass(), "last", null);
        setField(term718334, term718334.getClass(), "propListHead", null);
        setIntField(term718334, term718334.getClass(), "sourcePosition", 0);
        setField(term718334, term718334.getClass(), "jsType", null);
        setDoubleField(term718345, term718345.getClass(), "number", 0.0);
        setIntField(term718345, term718345.getClass(), "type", 114);
        setField(term718345, term718345.getClass(), "next", null);
        setField(term718345, term718345.getClass(), "first", null);
        setField(term718345, term718345.getClass(), "last", null);
        setField(term718345, term718345.getClass(), "propListHead", null);
        setIntField(term718345, term718345.getClass(), "sourcePosition", 0);
        setField(term718345, term718345.getClass(), "jsType", null);
        setField(term718345, term718345.getClass(), "parent", null);
        setField(term718334, term718334.getClass(), "parent", term718345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term717650;
        args[1] = term717834;
        args[2] = term717926;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term717564, args);
        assertTrue(recursiveEquals(term717564, term718414));
        assertTrue(recursiveEquals(term717650, term718415));
        assertTrue(recursiveEquals(term717834, term718417));
        assertTrue(recursiveEquals(term717926, term718418));
        assertTrue(recursiveEquals(retValue, term718334));
    }

};



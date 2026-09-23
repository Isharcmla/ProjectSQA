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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550179;
     Object term550271;
     Object term551340;
     Object term551341;
     Object term551296;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550179 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term550271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term550453 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term550363, term550363.getClass(), "next", term550453);
        setIntField(term550363, term550363.getClass(), "type", 39);
        setField(term550271, term550271.getClass(), "first", term550363);
        setIntField(term550271, term550271.getClass(), "type", 24);
        term551340 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term551340, term551340.getClass(), "currentTraversal", null);
        term551341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551343 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term551341, term551341.getClass(), "str", null);
        setIntField(term551341, term551341.getClass(), "type", 24);
        setField(term551341, term551341.getClass(), "next", null);
        setField(term551342, term551342.getClass(), "str", null);
        setIntField(term551342, term551342.getClass(), "type", 39);
        setIntField(term551343, term551343.getClass(), "encodedSourceStart", 0);
        setIntField(term551343, term551343.getClass(), "encodedSourceEnd", 0);
        setField(term551343, term551343.getClass(), "sourceName", null);
        setIntField(term551343, term551343.getClass(), "baseLineno", 0);
        setIntField(term551343, term551343.getClass(), "endLineno", 0);
        setField(term551343, term551343.getClass(), "functions", null);
        setField(term551343, term551343.getClass(), "regexps", null);
        setField(term551343, term551343.getClass(), "itsVariables", null);
        setField(term551343, term551343.getClass(), "itsConst", null);
        setField(term551343, term551343.getClass(), "itsVariableNames", null);
        setIntField(term551343, term551343.getClass(), "varStart", 0);
        setField(term551343, term551343.getClass(), "compilerData", null);
        setIntField(term551343, term551343.getClass(), "type", 0);
        setField(term551343, term551343.getClass(), "next", null);
        setField(term551343, term551343.getClass(), "first", null);
        setField(term551343, term551343.getClass(), "last", null);
        setField(term551343, term551343.getClass(), "propListHead", null);
        setIntField(term551343, term551343.getClass(), "sourcePosition", 0);
        setField(term551343, term551343.getClass(), "jsType", null);
        setField(term551343, term551343.getClass(), "parent", null);
        setField(term551342, term551342.getClass(), "next", term551343);
        setField(term551342, term551342.getClass(), "first", null);
        setField(term551342, term551342.getClass(), "last", null);
        setField(term551342, term551342.getClass(), "propListHead", null);
        setIntField(term551342, term551342.getClass(), "sourcePosition", 0);
        setField(term551342, term551342.getClass(), "jsType", null);
        setField(term551342, term551342.getClass(), "parent", null);
        setField(term551341, term551341.getClass(), "first", term551342);
        setField(term551341, term551341.getClass(), "last", null);
        setField(term551341, term551341.getClass(), "propListHead", null);
        setIntField(term551341, term551341.getClass(), "sourcePosition", 0);
        setField(term551341, term551341.getClass(), "jsType", null);
        setField(term551341, term551341.getClass(), "parent", null);
        term551296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term551300 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term551296, term551296.getClass(), "str", null);
        setIntField(term551296, term551296.getClass(), "type", 24);
        setField(term551296, term551296.getClass(), "next", null);
        setField(term551298, term551298.getClass(), "str", null);
        setIntField(term551298, term551298.getClass(), "type", 39);
        setIntField(term551300, term551300.getClass(), "encodedSourceStart", 0);
        setIntField(term551300, term551300.getClass(), "encodedSourceEnd", 0);
        setField(term551300, term551300.getClass(), "sourceName", null);
        setIntField(term551300, term551300.getClass(), "baseLineno", 0);
        setIntField(term551300, term551300.getClass(), "endLineno", 0);
        setField(term551300, term551300.getClass(), "functions", null);
        setField(term551300, term551300.getClass(), "regexps", null);
        setField(term551300, term551300.getClass(), "itsVariables", null);
        setField(term551300, term551300.getClass(), "itsConst", null);
        setField(term551300, term551300.getClass(), "itsVariableNames", null);
        setIntField(term551300, term551300.getClass(), "varStart", 0);
        setField(term551300, term551300.getClass(), "compilerData", null);
        setIntField(term551300, term551300.getClass(), "type", 0);
        setField(term551300, term551300.getClass(), "next", null);
        setField(term551300, term551300.getClass(), "first", null);
        setField(term551300, term551300.getClass(), "last", null);
        setField(term551300, term551300.getClass(), "propListHead", null);
        setIntField(term551300, term551300.getClass(), "sourcePosition", 0);
        setField(term551300, term551300.getClass(), "jsType", null);
        setField(term551300, term551300.getClass(), "parent", null);
        setField(term551298, term551298.getClass(), "next", term551300);
        setField(term551298, term551298.getClass(), "first", null);
        setField(term551298, term551298.getClass(), "last", null);
        setField(term551298, term551298.getClass(), "propListHead", null);
        setIntField(term551298, term551298.getClass(), "sourcePosition", 0);
        setField(term551298, term551298.getClass(), "jsType", null);
        setField(term551298, term551298.getClass(), "parent", null);
        setField(term551296, term551296.getClass(), "first", term551298);
        setField(term551296, term551296.getClass(), "last", null);
        setField(term551296, term551296.getClass(), "propListHead", null);
        setIntField(term551296, term551296.getClass(), "sourcePosition", 0);
        setField(term551296, term551296.getClass(), "jsType", null);
        setField(term551296, term551296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term550271;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term550179, args);
        assertTrue(recursiveEquals(term550179, term551340));
        assertTrue(recursiveEquals(term550271, term551341));
        assertTrue(recursiveEquals(retValue, term551296));
    }

};



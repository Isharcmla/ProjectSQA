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

public class TypeCheck_isPropertyTest_657275882206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51359;
     Object term51429;
     Object term51448;
     Object term51449;

    public TypeCheck_isPropertyTest_657275882206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51359 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term51429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51429, term51429.getClass(), "parent", term51429);
        setIntField(term51429, term51429.getClass(), "type", 52);
        term51448 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term51448, term51448.getClass(), "compiler", null);
        setField(term51448, term51448.getClass(), "validator", null);
        setField(term51448, term51448.getClass(), "reverseInterpreter", null);
        setField(term51448, term51448.getClass(), "typeRegistry", null);
        setField(term51448, term51448.getClass(), "topScope", null);
        setField(term51448, term51448.getClass(), "scopeCreator", null);
        setField(term51448, term51448.getClass(), "reportMissingOverride", null);
        setField(term51448, term51448.getClass(), "reportUnknownTypes", null);
        setBooleanField(term51448, term51448.getClass(), "reportMissingProperties", false);
        setField(term51448, term51448.getClass(), "inferJSDocInfo", null);
        setIntField(term51448, term51448.getClass(), "typedCount", 0);
        setIntField(term51448, term51448.getClass(), "nullCount", 0);
        setIntField(term51448, term51448.getClass(), "unknownCount", 0);
        setBooleanField(term51448, term51448.getClass(), "inExterns", false);
        setIntField(term51448, term51448.getClass(), "noTypeCheckSection", 0);
        term51449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51449, term51449.getClass(), "type", 52);
        setField(term51449, term51449.getClass(), "next", null);
        setField(term51449, term51449.getClass(), "first", null);
        setField(term51449, term51449.getClass(), "last", null);
        setField(term51449, term51449.getClass(), "propListHead", null);
        setIntField(term51449, term51449.getClass(), "sourcePosition", 0);
        setField(term51449, term51449.getClass(), "jsType", null);
        setField(term51449, term51449.getClass(), "parent", term51449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51429;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term51359, args);
        assertTrue(recursiveEquals(term51359, term51448));
        assertTrue(recursiveEquals(term51429, term51449));
        assertTrue(recursiveEquals(retValue, true));
    }

};



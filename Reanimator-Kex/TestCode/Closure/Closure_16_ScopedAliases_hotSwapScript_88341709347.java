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

public class ScopedAliases_hotSwapScript_88341709347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235555;
     Object term235647;
     Object term236758;
     Object term236759;

    public ScopedAliases_hotSwapScript_88341709347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235555 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term235555, term235555.getClass(), "compiler", null);
        term235647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term235739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term235831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term235923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235647, term235647.getClass(), "type", 0);
        setField(term235647, term235647.getClass(), "parent", null);
        setField(term235831, term235831.getClass(), "next", null);
        setIntField(term235831, term235831.getClass(), "type", 37);
        setField(term235923, term235923.getClass(), "next", null);
        setIntField(term235923, term235923.getClass(), "type", 0);
        setField(term235923, term235923.getClass(), "first", null);
        setField(term235831, term235831.getClass(), "first", term235923);
        setField(term235739, term235739.getClass(), "next", term235831);
        setIntField(term235739, term235739.getClass(), "type", 0);
        setField(term236015, term236015.getClass(), "next", null);
        setIntField(term236015, term236015.getClass(), "type", 0);
        setField(term236015, term236015.getClass(), "first", null);
        setField(term235739, term235739.getClass(), "first", term236015);
        setField(term235647, term235647.getClass(), "first", term235739);
        term236758 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term236758, term236758.getClass(), "compiler", null);
        setField(term236758, term236758.getClass(), "preprocessorSymbolTable", null);
        setField(term236758, term236758.getClass(), "transformationHandler", null);
        term236759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term236759, term236759.getClass(), "number", 0.0);
        setIntField(term236759, term236759.getClass(), "type", 0);
        setField(term236759, term236759.getClass(), "next", null);
        setDoubleField(term236760, term236760.getClass(), "number", 0.0);
        setIntField(term236760, term236760.getClass(), "type", 0);
        setDoubleField(term236761, term236761.getClass(), "number", 0.0);
        setIntField(term236761, term236761.getClass(), "type", 37);
        setField(term236761, term236761.getClass(), "next", null);
        setDoubleField(term236762, term236762.getClass(), "number", 0.0);
        setIntField(term236762, term236762.getClass(), "type", 0);
        setField(term236762, term236762.getClass(), "next", null);
        setField(term236762, term236762.getClass(), "first", null);
        setField(term236762, term236762.getClass(), "last", null);
        setField(term236762, term236762.getClass(), "propListHead", null);
        setIntField(term236762, term236762.getClass(), "sourcePosition", 0);
        setField(term236762, term236762.getClass(), "jsType", null);
        setField(term236762, term236762.getClass(), "parent", null);
        setField(term236761, term236761.getClass(), "first", term236762);
        setField(term236761, term236761.getClass(), "last", null);
        setField(term236761, term236761.getClass(), "propListHead", null);
        setIntField(term236761, term236761.getClass(), "sourcePosition", 0);
        setField(term236761, term236761.getClass(), "jsType", null);
        setField(term236761, term236761.getClass(), "parent", null);
        setField(term236760, term236760.getClass(), "next", term236761);
        setDoubleField(term236763, term236763.getClass(), "number", 0.0);
        setIntField(term236763, term236763.getClass(), "type", 0);
        setField(term236763, term236763.getClass(), "next", null);
        setField(term236763, term236763.getClass(), "first", null);
        setField(term236763, term236763.getClass(), "last", null);
        setField(term236763, term236763.getClass(), "propListHead", null);
        setIntField(term236763, term236763.getClass(), "sourcePosition", 0);
        setField(term236763, term236763.getClass(), "jsType", null);
        setField(term236763, term236763.getClass(), "parent", null);
        setField(term236760, term236760.getClass(), "first", term236763);
        setField(term236760, term236760.getClass(), "last", null);
        setField(term236760, term236760.getClass(), "propListHead", null);
        setIntField(term236760, term236760.getClass(), "sourcePosition", 0);
        setField(term236760, term236760.getClass(), "jsType", null);
        setField(term236760, term236760.getClass(), "parent", null);
        setField(term236759, term236759.getClass(), "first", term236760);
        setField(term236759, term236759.getClass(), "last", null);
        setField(term236759, term236759.getClass(), "propListHead", null);
        setIntField(term236759, term236759.getClass(), "sourcePosition", 0);
        setField(term236759, term236759.getClass(), "jsType", null);
        setField(term236759, term236759.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term235647;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term235555, args);
        assertTrue(recursiveEquals(term235555, term236758));
        assertTrue(recursiveEquals(term235647, term236759));
    }

};



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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134466;
     Object term134558;
     Object term135048;
     Object term135049;
     Object term135021;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134466 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term134558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term134742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term134650, term134650.getClass(), "next", term134742);
        setField(term134558, term134558.getClass(), "first", term134650);
        setIntField(term134558, term134558.getClass(), "type", 23);
        term135048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term135048, term135048.getClass(), "currentTraversal", null);
        term135049 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term135049, term135049.getClass(), "str", null);
        setIntField(term135049, term135049.getClass(), "type", 23);
        setField(term135049, term135049.getClass(), "next", null);
        setField(term135050, term135050.getClass(), "str", null);
        setIntField(term135050, term135050.getClass(), "type", 0);
        setField(term135051, term135051.getClass(), "str", null);
        setIntField(term135051, term135051.getClass(), "type", 0);
        setField(term135051, term135051.getClass(), "next", null);
        setField(term135051, term135051.getClass(), "first", null);
        setField(term135051, term135051.getClass(), "last", null);
        setField(term135051, term135051.getClass(), "propListHead", null);
        setIntField(term135051, term135051.getClass(), "sourcePosition", 0);
        setField(term135051, term135051.getClass(), "jsType", null);
        setField(term135051, term135051.getClass(), "parent", null);
        setField(term135050, term135050.getClass(), "next", term135051);
        setField(term135050, term135050.getClass(), "first", null);
        setField(term135050, term135050.getClass(), "last", null);
        setField(term135050, term135050.getClass(), "propListHead", null);
        setIntField(term135050, term135050.getClass(), "sourcePosition", 0);
        setField(term135050, term135050.getClass(), "jsType", null);
        setField(term135050, term135050.getClass(), "parent", null);
        setField(term135049, term135049.getClass(), "first", term135050);
        setField(term135049, term135049.getClass(), "last", null);
        setField(term135049, term135049.getClass(), "propListHead", null);
        setIntField(term135049, term135049.getClass(), "sourcePosition", 0);
        setField(term135049, term135049.getClass(), "jsType", null);
        setField(term135049, term135049.getClass(), "parent", null);
        term135021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term135025 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term135021, term135021.getClass(), "str", null);
        setIntField(term135021, term135021.getClass(), "type", 23);
        setField(term135021, term135021.getClass(), "next", null);
        setField(term135023, term135023.getClass(), "str", null);
        setIntField(term135023, term135023.getClass(), "type", 0);
        setField(term135025, term135025.getClass(), "str", null);
        setIntField(term135025, term135025.getClass(), "type", 0);
        setField(term135025, term135025.getClass(), "next", null);
        setField(term135025, term135025.getClass(), "first", null);
        setField(term135025, term135025.getClass(), "last", null);
        setField(term135025, term135025.getClass(), "propListHead", null);
        setIntField(term135025, term135025.getClass(), "sourcePosition", 0);
        setField(term135025, term135025.getClass(), "jsType", null);
        setField(term135025, term135025.getClass(), "parent", null);
        setField(term135023, term135023.getClass(), "next", term135025);
        setField(term135023, term135023.getClass(), "first", null);
        setField(term135023, term135023.getClass(), "last", null);
        setField(term135023, term135023.getClass(), "propListHead", null);
        setIntField(term135023, term135023.getClass(), "sourcePosition", 0);
        setField(term135023, term135023.getClass(), "jsType", null);
        setField(term135023, term135023.getClass(), "parent", null);
        setField(term135021, term135021.getClass(), "first", term135023);
        setField(term135021, term135021.getClass(), "last", null);
        setField(term135021, term135021.getClass(), "propListHead", null);
        setIntField(term135021, term135021.getClass(), "sourcePosition", 0);
        setField(term135021, term135021.getClass(), "jsType", null);
        setField(term135021, term135021.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term134558;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term134466, args);
        assertTrue(recursiveEquals(term134466, term135048));
        assertTrue(recursiveEquals(term134558, term135049));
        assertTrue(recursiveEquals(retValue, term135021));
    }

};



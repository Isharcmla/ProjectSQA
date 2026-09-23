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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156881;
     Object term156973;
     Object term157279;
     Object term157280;
     Object term157248;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156881 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term156973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term157065, term157065.getClass(), "next", term157157);
        setField(term156973, term156973.getClass(), "first", term157065);
        setIntField(term156973, term156973.getClass(), "type", 33);
        term157279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term157279, term157279.getClass(), "currentTraversal", null);
        term157280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term157280, term157280.getClass(), "str", null);
        setIntField(term157280, term157280.getClass(), "type", 33);
        setField(term157280, term157280.getClass(), "next", null);
        setField(term157281, term157281.getClass(), "str", null);
        setIntField(term157281, term157281.getClass(), "type", 0);
        setField(term157282, term157282.getClass(), "str", null);
        setIntField(term157282, term157282.getClass(), "type", 0);
        setField(term157282, term157282.getClass(), "next", null);
        setField(term157282, term157282.getClass(), "first", null);
        setField(term157282, term157282.getClass(), "last", null);
        setField(term157282, term157282.getClass(), "propListHead", null);
        setIntField(term157282, term157282.getClass(), "sourcePosition", 0);
        setField(term157282, term157282.getClass(), "jsType", null);
        setField(term157282, term157282.getClass(), "parent", null);
        setField(term157281, term157281.getClass(), "next", term157282);
        setField(term157281, term157281.getClass(), "first", null);
        setField(term157281, term157281.getClass(), "last", null);
        setField(term157281, term157281.getClass(), "propListHead", null);
        setIntField(term157281, term157281.getClass(), "sourcePosition", 0);
        setField(term157281, term157281.getClass(), "jsType", null);
        setField(term157281, term157281.getClass(), "parent", null);
        setField(term157280, term157280.getClass(), "first", term157281);
        setField(term157280, term157280.getClass(), "last", null);
        setField(term157280, term157280.getClass(), "propListHead", null);
        setIntField(term157280, term157280.getClass(), "sourcePosition", 0);
        setField(term157280, term157280.getClass(), "jsType", null);
        setField(term157280, term157280.getClass(), "parent", null);
        term157248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term157248, term157248.getClass(), "str", null);
        setIntField(term157248, term157248.getClass(), "type", 33);
        setField(term157248, term157248.getClass(), "next", null);
        setField(term157250, term157250.getClass(), "str", null);
        setIntField(term157250, term157250.getClass(), "type", 0);
        setField(term157252, term157252.getClass(), "str", null);
        setIntField(term157252, term157252.getClass(), "type", 0);
        setField(term157252, term157252.getClass(), "next", null);
        setField(term157252, term157252.getClass(), "first", null);
        setField(term157252, term157252.getClass(), "last", null);
        setField(term157252, term157252.getClass(), "propListHead", null);
        setIntField(term157252, term157252.getClass(), "sourcePosition", 0);
        setField(term157252, term157252.getClass(), "jsType", null);
        setField(term157252, term157252.getClass(), "parent", null);
        setField(term157250, term157250.getClass(), "next", term157252);
        setField(term157250, term157250.getClass(), "first", null);
        setField(term157250, term157250.getClass(), "last", null);
        setField(term157250, term157250.getClass(), "propListHead", null);
        setIntField(term157250, term157250.getClass(), "sourcePosition", 0);
        setField(term157250, term157250.getClass(), "jsType", null);
        setField(term157250, term157250.getClass(), "parent", null);
        setField(term157248, term157248.getClass(), "first", term157250);
        setField(term157248, term157248.getClass(), "last", null);
        setField(term157248, term157248.getClass(), "propListHead", null);
        setIntField(term157248, term157248.getClass(), "sourcePosition", 0);
        setField(term157248, term157248.getClass(), "jsType", null);
        setField(term157248, term157248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156973;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term156881, args);
        assertTrue(recursiveEquals(term156881, term157279));
        assertTrue(recursiveEquals(term156973, term157280));
        assertTrue(recursiveEquals(retValue, term157248));
    }

};



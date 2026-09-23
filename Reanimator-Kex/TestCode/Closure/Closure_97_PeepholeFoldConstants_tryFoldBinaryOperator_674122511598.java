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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157004;
     Object term157096;
     Object term157327;
     Object term157328;
     Object term157288;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term157096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term157188, term157188.getClass(), "next", term157280);
        setIntField(term157188, term157188.getClass(), "type", 39);
        setField(term157096, term157096.getClass(), "first", term157188);
        setIntField(term157096, term157096.getClass(), "type", 9);
        term157327 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term157327, term157327.getClass(), "currentTraversal", null);
        term157328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term157328, term157328.getClass(), "number", 0.0);
        setIntField(term157328, term157328.getClass(), "type", 9);
        setField(term157328, term157328.getClass(), "next", null);
        setDoubleField(term157329, term157329.getClass(), "number", 0.0);
        setIntField(term157329, term157329.getClass(), "type", 39);
        setField(term157330, term157330.getClass(), "str", null);
        setIntField(term157330, term157330.getClass(), "type", 0);
        setField(term157330, term157330.getClass(), "next", null);
        setField(term157330, term157330.getClass(), "first", null);
        setField(term157330, term157330.getClass(), "last", null);
        setField(term157330, term157330.getClass(), "propListHead", null);
        setIntField(term157330, term157330.getClass(), "sourcePosition", 0);
        setField(term157330, term157330.getClass(), "jsType", null);
        setField(term157330, term157330.getClass(), "parent", null);
        setField(term157329, term157329.getClass(), "next", term157330);
        setField(term157329, term157329.getClass(), "first", null);
        setField(term157329, term157329.getClass(), "last", null);
        setField(term157329, term157329.getClass(), "propListHead", null);
        setIntField(term157329, term157329.getClass(), "sourcePosition", 0);
        setField(term157329, term157329.getClass(), "jsType", null);
        setField(term157329, term157329.getClass(), "parent", null);
        setField(term157328, term157328.getClass(), "first", term157329);
        setField(term157328, term157328.getClass(), "last", null);
        setField(term157328, term157328.getClass(), "propListHead", null);
        setIntField(term157328, term157328.getClass(), "sourcePosition", 0);
        setField(term157328, term157328.getClass(), "jsType", null);
        setField(term157328, term157328.getClass(), "parent", null);
        term157288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term157288, term157288.getClass(), "number", 0.0);
        setIntField(term157288, term157288.getClass(), "type", 9);
        setField(term157288, term157288.getClass(), "next", null);
        setDoubleField(term157291, term157291.getClass(), "number", 0.0);
        setIntField(term157291, term157291.getClass(), "type", 39);
        setField(term157294, term157294.getClass(), "str", null);
        setIntField(term157294, term157294.getClass(), "type", 0);
        setField(term157294, term157294.getClass(), "next", null);
        setField(term157294, term157294.getClass(), "first", null);
        setField(term157294, term157294.getClass(), "last", null);
        setField(term157294, term157294.getClass(), "propListHead", null);
        setIntField(term157294, term157294.getClass(), "sourcePosition", 0);
        setField(term157294, term157294.getClass(), "jsType", null);
        setField(term157294, term157294.getClass(), "parent", null);
        setField(term157291, term157291.getClass(), "next", term157294);
        setField(term157291, term157291.getClass(), "first", null);
        setField(term157291, term157291.getClass(), "last", null);
        setField(term157291, term157291.getClass(), "propListHead", null);
        setIntField(term157291, term157291.getClass(), "sourcePosition", 0);
        setField(term157291, term157291.getClass(), "jsType", null);
        setField(term157291, term157291.getClass(), "parent", null);
        setField(term157288, term157288.getClass(), "first", term157291);
        setField(term157288, term157288.getClass(), "last", null);
        setField(term157288, term157288.getClass(), "propListHead", null);
        setIntField(term157288, term157288.getClass(), "sourcePosition", 0);
        setField(term157288, term157288.getClass(), "jsType", null);
        setField(term157288, term157288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term157096;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term157004, args);
        assertTrue(recursiveEquals(term157004, term157327));
        assertTrue(recursiveEquals(term157096, term157328));
        assertTrue(recursiveEquals(retValue, term157288));
    }

};



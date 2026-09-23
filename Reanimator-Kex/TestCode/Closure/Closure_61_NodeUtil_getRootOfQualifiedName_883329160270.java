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
import java.lang.Object;

public class NodeUtil_getRootOfQualifiedName_883329160270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;

    public NodeUtil_getRootOfQualifiedName_883329160270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2573, term2573.getClass(), "type", -37129068);
        setIntField(term2575, term2575.getClass(), "type", 1594426218);
        setIntField(term2577, term2577.getClass(), "type", 0);
        setField(term2577, term2577.getClass(), "next", null);
        setField(term2577, term2577.getClass(), "first", null);
        setField(term2577, term2577.getClass(), "last", null);
        setField(term2577, term2577.getClass(), "propListHead", null);
        setIntField(term2577, term2577.getClass(), "sourcePosition", 0);
        setField(term2577, term2577.getClass(), "jsType", null);
        setField(term2577, term2577.getClass(), "parent", null);
        setField(term2575, term2575.getClass(), "next", term2577);
        setIntField(term2580, term2580.getClass(), "type", 0);
        setField(term2580, term2580.getClass(), "next", null);
        setField(term2580, term2580.getClass(), "first", null);
        setField(term2580, term2580.getClass(), "last", null);
        setField(term2580, term2580.getClass(), "propListHead", null);
        setIntField(term2580, term2580.getClass(), "sourcePosition", 0);
        setField(term2580, term2580.getClass(), "jsType", null);
        setField(term2580, term2580.getClass(), "parent", null);
        setField(term2575, term2575.getClass(), "first", term2580);
        setIntField(term2583, term2583.getClass(), "type", 0);
        setField(term2583, term2583.getClass(), "next", null);
        setField(term2583, term2583.getClass(), "first", null);
        setField(term2583, term2583.getClass(), "last", null);
        setField(term2583, term2583.getClass(), "propListHead", null);
        setIntField(term2583, term2583.getClass(), "sourcePosition", 0);
        setField(term2583, term2583.getClass(), "jsType", null);
        setField(term2583, term2583.getClass(), "parent", null);
        setField(term2575, term2575.getClass(), "last", term2583);
        setField(term2575, term2575.getClass(), "propListHead", null);
        setIntField(term2575, term2575.getClass(), "sourcePosition", 0);
        setField(term2575, term2575.getClass(), "jsType", null);
        setField(term2575, term2575.getClass(), "parent", null);
        setField(term2573, term2573.getClass(), "next", term2575);
        setIntField(term2587, term2587.getClass(), "type", 0);
        setField(term2587, term2587.getClass(), "next", null);
        setField(term2587, term2587.getClass(), "first", null);
        setField(term2587, term2587.getClass(), "last", null);
        setField(term2587, term2587.getClass(), "propListHead", null);
        setIntField(term2587, term2587.getClass(), "sourcePosition", 0);
        setField(term2587, term2587.getClass(), "jsType", null);
        setField(term2587, term2587.getClass(), "parent", null);
        setField(term2573, term2573.getClass(), "first", term2587);
        setIntField(term2590, term2590.getClass(), "type", 0);
        setField(term2590, term2590.getClass(), "next", null);
        setField(term2590, term2590.getClass(), "first", null);
        setField(term2590, term2590.getClass(), "last", null);
        setField(term2590, term2590.getClass(), "propListHead", null);
        setIntField(term2590, term2590.getClass(), "sourcePosition", 0);
        setField(term2590, term2590.getClass(), "jsType", null);
        setField(term2590, term2590.getClass(), "parent", null);
        setField(term2573, term2573.getClass(), "last", term2590);
        setField(term2573, term2573.getClass(), "propListHead", null);
        setIntField(term2573, term2573.getClass(), "sourcePosition", 0);
        setField(term2573, term2573.getClass(), "jsType", null);
        setField(term2573, term2573.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2573;
        try {
            callMethod(klass, "getRootOfQualifiedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



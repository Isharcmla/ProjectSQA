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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36443;
     Object term36535;
     Object term36971;
     Object term36972;
     Object term36948;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term36535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36535, term36535.getClass(), "type", 37);
        setField(term36535, term36535.getClass(), "first", term36627);
        term36971 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term36971, term36971.getClass(), "currentTraversal", null);
        term36972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36972, term36972.getClass(), "str", null);
        setIntField(term36972, term36972.getClass(), "type", 37);
        setField(term36972, term36972.getClass(), "next", null);
        setField(term36973, term36973.getClass(), "str", null);
        setIntField(term36973, term36973.getClass(), "type", 0);
        setField(term36973, term36973.getClass(), "next", null);
        setField(term36973, term36973.getClass(), "first", null);
        setField(term36973, term36973.getClass(), "last", null);
        setField(term36973, term36973.getClass(), "propListHead", null);
        setIntField(term36973, term36973.getClass(), "sourcePosition", 0);
        setField(term36973, term36973.getClass(), "jsType", null);
        setField(term36973, term36973.getClass(), "parent", null);
        setField(term36972, term36972.getClass(), "first", term36973);
        setField(term36972, term36972.getClass(), "last", null);
        setField(term36972, term36972.getClass(), "propListHead", null);
        setIntField(term36972, term36972.getClass(), "sourcePosition", 0);
        setField(term36972, term36972.getClass(), "jsType", null);
        setField(term36972, term36972.getClass(), "parent", null);
        term36948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term36950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36948, term36948.getClass(), "str", null);
        setIntField(term36948, term36948.getClass(), "type", 37);
        setField(term36948, term36948.getClass(), "next", null);
        setField(term36950, term36950.getClass(), "str", null);
        setIntField(term36950, term36950.getClass(), "type", 0);
        setField(term36950, term36950.getClass(), "next", null);
        setField(term36950, term36950.getClass(), "first", null);
        setField(term36950, term36950.getClass(), "last", null);
        setField(term36950, term36950.getClass(), "propListHead", null);
        setIntField(term36950, term36950.getClass(), "sourcePosition", 0);
        setField(term36950, term36950.getClass(), "jsType", null);
        setField(term36950, term36950.getClass(), "parent", null);
        setField(term36948, term36948.getClass(), "first", term36950);
        setField(term36948, term36948.getClass(), "last", null);
        setField(term36948, term36948.getClass(), "propListHead", null);
        setIntField(term36948, term36948.getClass(), "sourcePosition", 0);
        setField(term36948, term36948.getClass(), "jsType", null);
        setField(term36948, term36948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36535;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term36443, args);
        assertTrue(recursiveEquals(term36443, term36971));
        assertTrue(recursiveEquals(term36535, term36972));
        assertTrue(recursiveEquals(retValue, term36948));
    }

};



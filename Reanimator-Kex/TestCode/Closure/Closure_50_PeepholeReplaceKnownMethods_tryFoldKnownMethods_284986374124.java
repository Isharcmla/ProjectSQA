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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32098;
     Object term32190;
     Object term32208;
     Object term32209;
     Object term32191;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32098 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term32190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term32190, term32190.getClass(), "first", null);
        setIntField(term32190, term32190.getClass(), "type", 37);
        term32208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term32208, term32208.getClass(), "currentTraversal", null);
        term32209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term32209, term32209.getClass(), "number", 0.0);
        setIntField(term32209, term32209.getClass(), "type", 37);
        setField(term32209, term32209.getClass(), "next", null);
        setField(term32209, term32209.getClass(), "first", null);
        setField(term32209, term32209.getClass(), "last", null);
        setField(term32209, term32209.getClass(), "propListHead", null);
        setIntField(term32209, term32209.getClass(), "sourcePosition", 0);
        setField(term32209, term32209.getClass(), "jsType", null);
        setField(term32209, term32209.getClass(), "parent", null);
        term32191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term32191, term32191.getClass(), "number", 0.0);
        setIntField(term32191, term32191.getClass(), "type", 37);
        setField(term32191, term32191.getClass(), "next", null);
        setField(term32191, term32191.getClass(), "first", null);
        setField(term32191, term32191.getClass(), "last", null);
        setField(term32191, term32191.getClass(), "propListHead", null);
        setIntField(term32191, term32191.getClass(), "sourcePosition", 0);
        setField(term32191, term32191.getClass(), "jsType", null);
        setField(term32191, term32191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32190;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term32098, args);
        assertTrue(recursiveEquals(term32098, term32208));
        assertTrue(recursiveEquals(term32190, term32209));
        assertTrue(recursiveEquals(retValue, term32191));
    }

};



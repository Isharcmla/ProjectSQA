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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3546231;
     Object term3546323;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3546231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3546323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3546415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3546507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3546599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3546729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3546821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3546415, term3546415.getClass(), "type", 35);
        setIntField(term3546599, term3546599.getClass(), "type", 40);
        setField(term3546599, term3546599.getClass(), "str", "substr");
        setField(term3546507, term3546507.getClass(), "next", term3546599);
        setIntField(term3546507, term3546507.getClass(), "type", 40);
        setField(term3546507, term3546507.getClass(), "str", null);
        setField(term3546415, term3546415.getClass(), "first", term3546507);
        setIntField(term3546729, term3546729.getClass(), "type", 39);
        setDoubleField(term3546729, term3546729.getClass(), "number", 0.0);
        setIntField(term3546821, term3546821.getClass(), "type", 39);
        setField(term3546729, term3546729.getClass(), "next", term3546821);
        setField(term3546415, term3546415.getClass(), "next", term3546729);
        setField(term3546323, term3546323.getClass(), "first", term3546415);
        setIntField(term3546323, term3546323.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3546323;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3546231, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



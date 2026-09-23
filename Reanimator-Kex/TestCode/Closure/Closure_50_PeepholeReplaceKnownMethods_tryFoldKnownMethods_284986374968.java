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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3806695;
     Object term3806787;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3806695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3806787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3807063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3807225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3806879, term3806879.getClass(), "type", 35);
        setIntField(term3807063, term3807063.getClass(), "type", 40);
        setField(term3807063, term3807063.getClass(), "str", "indexOf");
        setField(term3806971, term3806971.getClass(), "next", term3807063);
        setIntField(term3806971, term3806971.getClass(), "type", 40);
        setField(term3806971, term3806971.getClass(), "str", "");
        setField(term3806879, term3806879.getClass(), "first", term3806971);
        setIntField(term3807225, term3807225.getClass(), "type", 41);
        setField(term3807225, term3807225.getClass(), "next", null);
        setField(term3806879, term3806879.getClass(), "next", term3807225);
        setField(term3806787, term3806787.getClass(), "first", term3806879);
        setIntField(term3806787, term3806787.getClass(), "type", 37);
        setField(term3806787, term3806787.getClass(), "parent", term3807063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3806787;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3806695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4444137;
     Object term4444223;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4444137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4444223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4444315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4444407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4444499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4444623 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4444223, term4444223.getClass(), "type", 37);
        setIntField(term4444315, term4444315.getClass(), "type", 35);
        setIntField(term4444499, term4444499.getClass(), "type", 40);
        setField(term4444499, term4444499.getClass(), "str", "lastIndexOf");
        setField(term4444407, term4444407.getClass(), "next", term4444499);
        setIntField(term4444407, term4444407.getClass(), "type", 40);
        setField(term4444315, term4444315.getClass(), "first", term4444407);
        setIntField(term4444623, term4444623.getClass(), "type", 39);
        setField(term4444315, term4444315.getClass(), "next", term4444623);
        setField(term4444223, term4444223.getClass(), "first", term4444315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4444223;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4444137, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



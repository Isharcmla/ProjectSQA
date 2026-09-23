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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2660219;
     Object term2660311;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2660219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2660311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2660403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2660495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2660587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2660311, term2660311.getClass(), "type", 37);
        setIntField(term2660403, term2660403.getClass(), "type", 35);
        setIntField(term2660587, term2660587.getClass(), "type", 40);
        setField(term2660495, term2660495.getClass(), "next", term2660587);
        setIntField(term2660495, term2660495.getClass(), "type", 40);
        setField(term2660403, term2660403.getClass(), "first", term2660495);
        setField(term2660311, term2660311.getClass(), "first", term2660403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2660311;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2660219, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



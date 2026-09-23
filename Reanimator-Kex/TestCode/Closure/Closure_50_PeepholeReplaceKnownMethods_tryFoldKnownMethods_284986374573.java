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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3531219;
     Object term3531311;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3531219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3531311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3531403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3531495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3531587 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3531717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3531403, term3531403.getClass(), "type", 35);
        setIntField(term3531587, term3531587.getClass(), "type", 40);
        setField(term3531587, term3531587.getClass(), "str", "charAt");
        setField(term3531495, term3531495.getClass(), "next", term3531587);
        setIntField(term3531495, term3531495.getClass(), "type", 40);
        setField(term3531403, term3531403.getClass(), "first", term3531495);
        setIntField(term3531717, term3531717.getClass(), "type", 39);
        setField(term3531403, term3531403.getClass(), "next", term3531717);
        setField(term3531311, term3531311.getClass(), "first", term3531403);
        setIntField(term3531311, term3531311.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3531311;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3531219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



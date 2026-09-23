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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2650354;
     Object term2650446;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2650354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2650446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2650538 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2650630 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2650722 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2650446, term2650446.getClass(), "type", 37);
        setIntField(term2650538, term2650538.getClass(), "type", 33);
        setIntField(term2650722, term2650722.getClass(), "type", 40);
        setField(term2650630, term2650630.getClass(), "next", term2650722);
        setIntField(term2650630, term2650630.getClass(), "type", 40);
        setField(term2650538, term2650538.getClass(), "first", term2650630);
        setField(term2650446, term2650446.getClass(), "first", term2650538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2650446;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2650354, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



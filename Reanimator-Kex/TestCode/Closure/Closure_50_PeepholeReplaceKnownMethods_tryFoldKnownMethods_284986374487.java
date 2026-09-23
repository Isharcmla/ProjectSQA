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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3473139;
     Object term3473231;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3473139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3473231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473323 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3473323, term3473323.getClass(), "type", 35);
        setField(term3473415, term3473415.getClass(), "next", term3473415);
        setIntField(term3473415, term3473415.getClass(), "type", 40);
        setField(term3473415, term3473415.getClass(), "str", "indexOf");
        setField(term3473323, term3473323.getClass(), "first", term3473415);
        setIntField(term3473545, term3473545.getClass(), "type", 44);
        setField(term3473323, term3473323.getClass(), "next", term3473545);
        setField(term3473231, term3473231.getClass(), "first", term3473323);
        setIntField(term3473231, term3473231.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3473231;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3473139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



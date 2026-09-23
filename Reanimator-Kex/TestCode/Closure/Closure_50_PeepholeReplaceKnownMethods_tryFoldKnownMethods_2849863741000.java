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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4204456;
     Object term4204548;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4204456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4204548 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4204640 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4204732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4204824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4204992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4204640, term4204640.getClass(), "type", 35);
        setIntField(term4204824, term4204824.getClass(), "type", 40);
        setField(term4204824, term4204824.getClass(), "str", "indexOf");
        setField(term4204732, term4204732.getClass(), "next", term4204824);
        setIntField(term4204732, term4204732.getClass(), "type", 40);
        setField(term4204732, term4204732.getClass(), "str", "");
        setField(term4204640, term4204640.getClass(), "first", term4204732);
        setIntField(term4204992, term4204992.getClass(), "type", 41);
        setField(term4204992, term4204992.getClass(), "next", null);
        setField(term4204640, term4204640.getClass(), "next", term4204992);
        setField(term4204548, term4204548.getClass(), "first", term4204640);
        setIntField(term4204548, term4204548.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4204548;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term4204456, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



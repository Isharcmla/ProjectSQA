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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3484799;
     Object term3484891;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3484799 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3484891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3485075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3485167 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3485297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3484983, term3484983.getClass(), "type", 35);
        setIntField(term3485167, term3485167.getClass(), "type", 40);
        setField(term3485167, term3485167.getClass(), "str", "indexOf");
        setField(term3485075, term3485075.getClass(), "next", term3485167);
        setIntField(term3485075, term3485075.getClass(), "type", 40);
        setField(term3484983, term3484983.getClass(), "first", term3485075);
        setIntField(term3485297, term3485297.getClass(), "type", 41);
        setField(term3484983, term3484983.getClass(), "next", term3485297);
        setField(term3484891, term3484891.getClass(), "first", term3484983);
        setIntField(term3484891, term3484891.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3484891;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3484799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



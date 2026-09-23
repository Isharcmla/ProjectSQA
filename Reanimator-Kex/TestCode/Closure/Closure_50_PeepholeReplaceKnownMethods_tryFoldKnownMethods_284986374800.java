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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3681054;
     Object term3681146;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3681054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3681146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3681238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3681330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3681422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3681552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3681238, term3681238.getClass(), "type", 35);
        setIntField(term3681422, term3681422.getClass(), "type", 40);
        setField(term3681422, term3681422.getClass(), "str", "indexOf");
        setField(term3681330, term3681330.getClass(), "next", term3681422);
        setIntField(term3681330, term3681330.getClass(), "type", 40);
        setField(term3681238, term3681238.getClass(), "first", term3681330);
        setIntField(term3681552, term3681552.getClass(), "type", 40);
        setField(term3681238, term3681238.getClass(), "next", term3681552);
        setField(term3681146, term3681146.getClass(), "first", term3681238);
        setIntField(term3681146, term3681146.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3681146;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3681054, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3712946;
     Object term3713038;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3712946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3713038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3713438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3713130, term3713130.getClass(), "type", 35);
        setIntField(term3713314, term3713314.getClass(), "type", 40);
        setField(term3713314, term3713314.getClass(), "str", "indexOf");
        setField(term3713222, term3713222.getClass(), "next", term3713314);
        setIntField(term3713222, term3713222.getClass(), "type", 40);
        setField(term3713130, term3713130.getClass(), "first", term3713222);
        setIntField(term3713438, term3713438.getClass(), "type", 40);
        setField(term3713130, term3713130.getClass(), "next", term3713438);
        setField(term3713038, term3713038.getClass(), "first", term3713130);
        setIntField(term3713038, term3713038.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3713038;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3712946, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



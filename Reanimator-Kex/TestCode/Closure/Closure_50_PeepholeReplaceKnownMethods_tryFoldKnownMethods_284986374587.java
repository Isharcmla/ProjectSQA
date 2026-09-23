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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3539003;
     Object term3539095;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3539003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3539095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3539187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3539279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3539371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3539501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3539187, term3539187.getClass(), "type", 35);
        setIntField(term3539371, term3539371.getClass(), "type", 40);
        setField(term3539371, term3539371.getClass(), "str", "indexOf");
        setField(term3539279, term3539279.getClass(), "next", term3539371);
        setIntField(term3539279, term3539279.getClass(), "type", 40);
        setField(term3539187, term3539187.getClass(), "first", term3539279);
        setIntField(term3539501, term3539501.getClass(), "type", 44);
        setField(term3539187, term3539187.getClass(), "next", term3539501);
        setField(term3539095, term3539095.getClass(), "first", term3539187);
        setIntField(term3539095, term3539095.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3539095;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3539003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



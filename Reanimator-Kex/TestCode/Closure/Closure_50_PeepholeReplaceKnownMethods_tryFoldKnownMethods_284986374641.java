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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3571172;
     Object term3571264;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3571172 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3571264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3571356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3571448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3571540 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3571664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3571356, term3571356.getClass(), "type", 35);
        setIntField(term3571540, term3571540.getClass(), "type", 40);
        setField(term3571540, term3571540.getClass(), "str", "indexOf");
        setField(term3571448, term3571448.getClass(), "next", term3571540);
        setIntField(term3571448, term3571448.getClass(), "type", 40);
        setField(term3571356, term3571356.getClass(), "first", term3571448);
        setIntField(term3571664, term3571664.getClass(), "type", 43);
        setField(term3571356, term3571356.getClass(), "next", term3571664);
        setField(term3571264, term3571264.getClass(), "first", term3571356);
        setIntField(term3571264, term3571264.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3571264;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3571172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



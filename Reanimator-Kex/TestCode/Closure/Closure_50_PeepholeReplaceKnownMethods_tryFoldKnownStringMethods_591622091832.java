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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3702115;
     Object term3702201;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3702115 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3702201 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3702293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3702385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3702493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3702201, term3702201.getClass(), "type", 37);
        setIntField(term3702293, term3702293.getClass(), "type", 35);
        setField(term3702385, term3702385.getClass(), "next", term3702385);
        setIntField(term3702385, term3702385.getClass(), "type", 40);
        setField(term3702385, term3702385.getClass(), "str", "indexOf");
        setField(term3702293, term3702293.getClass(), "first", term3702385);
        setIntField(term3702493, term3702493.getClass(), "type", 43);
        setField(term3702293, term3702293.getClass(), "next", term3702493);
        setField(term3702201, term3702201.getClass(), "first", term3702293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3702201;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3702115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



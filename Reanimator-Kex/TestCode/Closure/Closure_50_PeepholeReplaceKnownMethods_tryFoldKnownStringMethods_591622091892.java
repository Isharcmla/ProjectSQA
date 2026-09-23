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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3744455;
     Object term3744541;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3744455 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3744541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3744633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3744541, term3744541.getClass(), "type", 37);
        setIntField(term3744633, term3744633.getClass(), "type", 35);
        setField(term3744725, term3744725.getClass(), "next", term3744725);
        setIntField(term3744725, term3744725.getClass(), "type", 40);
        setField(term3744725, term3744725.getClass(), "str", "indexOf");
        setField(term3744633, term3744633.getClass(), "first", term3744725);
        setIntField(term3744833, term3744833.getClass(), "type", 40);
        setField(term3744633, term3744633.getClass(), "next", term3744833);
        setField(term3744541, term3744541.getClass(), "first", term3744633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3744541;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3744455, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



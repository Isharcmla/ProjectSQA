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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202541;
     Object term4202633;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202541 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4202633 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4202725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4202817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4202925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4202633, term4202633.getClass(), "type", 37);
        setIntField(term4202725, term4202725.getClass(), "type", 35);
        setField(term4202817, term4202817.getClass(), "next", term4202817);
        setIntField(term4202817, term4202817.getClass(), "type", 40);
        setField(term4202817, term4202817.getClass(), "str", "indexOf");
        setField(term4202725, term4202725.getClass(), "first", term4202817);
        setIntField(term4202925, term4202925.getClass(), "type", 40);
        setField(term4202725, term4202725.getClass(), "next", term4202925);
        setField(term4202633, term4202633.getClass(), "first", term4202725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4202633;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4202541, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



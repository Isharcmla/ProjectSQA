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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3660372;
     Object term3660458;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3660372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3660458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3660550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3660642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3660772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3660458, term3660458.getClass(), "type", 37);
        setIntField(term3660550, term3660550.getClass(), "type", 35);
        setField(term3660642, term3660642.getClass(), "next", term3660642);
        setIntField(term3660642, term3660642.getClass(), "type", 40);
        setField(term3660642, term3660642.getClass(), "str", "indexOf");
        setField(term3660550, term3660550.getClass(), "first", term3660642);
        setIntField(term3660772, term3660772.getClass(), "type", 39);
        setField(term3660550, term3660550.getClass(), "next", term3660772);
        setField(term3660458, term3660458.getClass(), "first", term3660550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3660458;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3660372, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



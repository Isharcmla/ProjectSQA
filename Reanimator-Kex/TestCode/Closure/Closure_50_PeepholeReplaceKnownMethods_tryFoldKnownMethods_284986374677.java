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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3595150;
     Object term3595242;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3595150 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3595242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3595334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3595426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3595518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3595642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3595334, term3595334.getClass(), "type", 35);
        setIntField(term3595518, term3595518.getClass(), "type", 40);
        setField(term3595518, term3595518.getClass(), "str", "substring");
        setField(term3595426, term3595426.getClass(), "next", term3595518);
        setIntField(term3595426, term3595426.getClass(), "type", 40);
        setField(term3595334, term3595334.getClass(), "first", term3595426);
        setIntField(term3595642, term3595642.getClass(), "type", 39);
        setField(term3595334, term3595334.getClass(), "next", term3595642);
        setField(term3595242, term3595242.getClass(), "first", term3595334);
        setIntField(term3595242, term3595242.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3595242;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3595150, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



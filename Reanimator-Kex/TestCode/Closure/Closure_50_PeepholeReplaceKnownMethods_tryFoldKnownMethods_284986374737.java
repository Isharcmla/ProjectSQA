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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3635087;
     Object term3635179;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3635087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3635179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3635271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3635363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3635455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3635579 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3635271, term3635271.getClass(), "type", 35);
        setIntField(term3635455, term3635455.getClass(), "type", 40);
        setField(term3635455, term3635455.getClass(), "str", "indexOf");
        setField(term3635363, term3635363.getClass(), "next", term3635455);
        setIntField(term3635363, term3635363.getClass(), "type", 40);
        setField(term3635271, term3635271.getClass(), "first", term3635363);
        setIntField(term3635579, term3635579.getClass(), "type", 44);
        setField(term3635271, term3635271.getClass(), "next", term3635579);
        setField(term3635179, term3635179.getClass(), "first", term3635271);
        setIntField(term3635179, term3635179.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3635179;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3635087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3492118;
     Object term3492210;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3492118 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3492210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3492302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3492394 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3492486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3492614 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3492302, term3492302.getClass(), "type", 35);
        setIntField(term3492486, term3492486.getClass(), "type", 40);
        setField(term3492486, term3492486.getClass(), "str", "substring");
        setField(term3492394, term3492394.getClass(), "next", term3492486);
        setIntField(term3492394, term3492394.getClass(), "type", 40);
        setField(term3492302, term3492302.getClass(), "first", term3492394);
        setIntField(term3492614, term3492614.getClass(), "type", 39);
        setField(term3492302, term3492302.getClass(), "next", term3492614);
        setField(term3492210, term3492210.getClass(), "first", term3492302);
        setIntField(term3492210, term3492210.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3492210;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3492118, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



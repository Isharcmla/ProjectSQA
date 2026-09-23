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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3487008;
     Object term3487100;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3487008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3487100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487284 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3487636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3487192, term3487192.getClass(), "type", 35);
        setIntField(term3487376, term3487376.getClass(), "type", 40);
        setField(term3487376, term3487376.getClass(), "str", "indexOf");
        setField(term3487284, term3487284.getClass(), "next", term3487376);
        setIntField(term3487284, term3487284.getClass(), "type", 40);
        setField(term3487284, term3487284.getClass(), "str", "");
        setField(term3487192, term3487192.getClass(), "first", term3487284);
        setIntField(term3487544, term3487544.getClass(), "type", 44);
        setField(term3487544, term3487544.getClass(), "next", null);
        setField(term3487192, term3487192.getClass(), "next", term3487544);
        setField(term3487100, term3487100.getClass(), "first", term3487192);
        setIntField(term3487100, term3487100.getClass(), "type", 37);
        setField(term3487100, term3487100.getClass(), "parent", term3487636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3487100;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3487008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



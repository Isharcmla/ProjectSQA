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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767351;
     Object term3767443;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3767443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3767535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3767627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3767719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3767843 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3767535, term3767535.getClass(), "type", 35);
        setIntField(term3767719, term3767719.getClass(), "type", 40);
        setField(term3767719, term3767719.getClass(), "str", "charAt");
        setField(term3767627, term3767627.getClass(), "next", term3767719);
        setIntField(term3767627, term3767627.getClass(), "type", 40);
        setField(term3767535, term3767535.getClass(), "first", term3767627);
        setIntField(term3767843, term3767843.getClass(), "type", 39);
        setField(term3767535, term3767535.getClass(), "next", term3767843);
        setField(term3767443, term3767443.getClass(), "first", term3767535);
        setIntField(term3767443, term3767443.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3767443;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3767351, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



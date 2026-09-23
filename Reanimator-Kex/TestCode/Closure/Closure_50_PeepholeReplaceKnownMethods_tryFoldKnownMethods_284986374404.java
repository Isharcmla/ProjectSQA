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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2658742;
     Object term2658834;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2658742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2658834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2658926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2659018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2659110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2658926, term2658926.getClass(), "type", 35);
        setIntField(term2659110, term2659110.getClass(), "type", 40);
        setField(term2659110, term2659110.getClass(), "str", "toUpperCase");
        setField(term2659018, term2659018.getClass(), "next", term2659110);
        setIntField(term2659018, term2659018.getClass(), "type", 40);
        setField(term2658926, term2658926.getClass(), "first", term2659018);
        setField(term2658926, term2658926.getClass(), "next", null);
        setField(term2658834, term2658834.getClass(), "first", term2658926);
        setIntField(term2658834, term2658834.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2658834;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term2658742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



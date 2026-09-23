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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3566742;
     Object term3566828;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3566742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3566828 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3566920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3567012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3567120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3566828, term3566828.getClass(), "type", 37);
        setIntField(term3566920, term3566920.getClass(), "type", 33);
        setField(term3567012, term3567012.getClass(), "next", term3567012);
        setIntField(term3567012, term3567012.getClass(), "type", 40);
        setField(term3567012, term3567012.getClass(), "str", "indexOf");
        setField(term3566920, term3566920.getClass(), "first", term3567012);
        setIntField(term3567120, term3567120.getClass(), "type", 39);
        setField(term3566920, term3566920.getClass(), "next", term3567120);
        setField(term3566828, term3566828.getClass(), "first", term3566920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3566828;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3566742, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



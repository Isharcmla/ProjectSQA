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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656022;
     Object term2656108;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2656022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2656108 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2656194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2656280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2656366 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2656108, term2656108.getClass(), "type", 37);
        setIntField(term2656194, term2656194.getClass(), "type", 33);
        setIntField(term2656366, term2656366.getClass(), "type", 40);
        setField(term2656280, term2656280.getClass(), "next", term2656366);
        setIntField(term2656280, term2656280.getClass(), "type", 40);
        setField(term2656194, term2656194.getClass(), "first", term2656280);
        setField(term2656108, term2656108.getClass(), "first", term2656194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2656108;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2656022, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



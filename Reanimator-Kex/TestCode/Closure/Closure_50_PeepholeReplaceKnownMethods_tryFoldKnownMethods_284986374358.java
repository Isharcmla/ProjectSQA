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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2638760;
     Object term2638846;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2638760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2638846 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2638932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2639018 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2638932, term2638932.getClass(), "type", 35);
        setField(term2639018, term2639018.getClass(), "next", term2639018);
        setIntField(term2639018, term2639018.getClass(), "type", 40);
        setField(term2638932, term2638932.getClass(), "first", term2639018);
        setField(term2638846, term2638846.getClass(), "first", term2638932);
        setIntField(term2638846, term2638846.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2638846;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term2638760, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



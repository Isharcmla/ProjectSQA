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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2653557;
     Object term2653643;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2653557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2653643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653901 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2653643, term2653643.getClass(), "type", 37);
        setIntField(term2653729, term2653729.getClass(), "type", 35);
        setIntField(term2653901, term2653901.getClass(), "type", 40);
        setField(term2653815, term2653815.getClass(), "next", term2653901);
        setIntField(term2653815, term2653815.getClass(), "type", 40);
        setField(term2653729, term2653729.getClass(), "first", term2653815);
        setField(term2653643, term2653643.getClass(), "first", term2653729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2653643;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2653557, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



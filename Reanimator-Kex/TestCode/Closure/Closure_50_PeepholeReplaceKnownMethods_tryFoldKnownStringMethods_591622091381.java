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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2647407;
     Object term2647499;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2647407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2647499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2647591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2647683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2647775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2647499, term2647499.getClass(), "type", 37);
        setIntField(term2647591, term2647591.getClass(), "type", 33);
        setIntField(term2647775, term2647775.getClass(), "type", 40);
        setField(term2647683, term2647683.getClass(), "next", term2647775);
        setIntField(term2647683, term2647683.getClass(), "type", 40);
        setField(term2647591, term2647591.getClass(), "first", term2647683);
        setField(term2647499, term2647499.getClass(), "first", term2647591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2647499;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2647407, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



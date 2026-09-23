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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2635540;
     Object term2635632;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2635540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2635632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2635908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2635632, term2635632.getClass(), "type", 37);
        setIntField(term2635724, term2635724.getClass(), "type", 35);
        setIntField(term2635908, term2635908.getClass(), "type", 40);
        setField(term2635816, term2635816.getClass(), "next", term2635908);
        setIntField(term2635816, term2635816.getClass(), "type", 40);
        setField(term2635724, term2635724.getClass(), "first", term2635816);
        setField(term2635632, term2635632.getClass(), "first", term2635724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2635632;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2635540, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



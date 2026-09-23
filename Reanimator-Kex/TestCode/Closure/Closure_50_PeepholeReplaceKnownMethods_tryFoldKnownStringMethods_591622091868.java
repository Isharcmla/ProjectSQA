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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723878;
     Object term3723970;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3723970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3724062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3724154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3724284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3723970, term3723970.getClass(), "type", 37);
        setIntField(term3724062, term3724062.getClass(), "type", 35);
        setField(term3724154, term3724154.getClass(), "next", term3724154);
        setIntField(term3724154, term3724154.getClass(), "type", 40);
        setField(term3724154, term3724154.getClass(), "str", "indexOf");
        setField(term3724062, term3724062.getClass(), "first", term3724154);
        setIntField(term3724284, term3724284.getClass(), "type", 40);
        setField(term3724062, term3724062.getClass(), "next", term3724284);
        setField(term3723970, term3723970.getClass(), "first", term3724062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3723970;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3723878, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



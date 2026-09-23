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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3592852;
     Object term3592944;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3592852 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3592944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3593036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3593128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3593220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3593350 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3593036, term3593036.getClass(), "type", 35);
        setIntField(term3593220, term3593220.getClass(), "type", 40);
        setField(term3593220, term3593220.getClass(), "str", "indexOf");
        setField(term3593128, term3593128.getClass(), "next", term3593220);
        setIntField(term3593128, term3593128.getClass(), "type", 40);
        setField(term3593036, term3593036.getClass(), "first", term3593128);
        setIntField(term3593350, term3593350.getClass(), "type", 39);
        setField(term3593036, term3593036.getClass(), "next", term3593350);
        setField(term3592944, term3592944.getClass(), "first", term3593036);
        setIntField(term3592944, term3592944.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3592944;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3592852, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



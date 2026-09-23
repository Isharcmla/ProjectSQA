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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4463547;
     Object term4463639;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4463547 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4463639 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4463731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4463823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4463915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4463985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4463639, term4463639.getClass(), "type", 37);
        setIntField(term4463731, term4463731.getClass(), "type", 35);
        setIntField(term4463915, term4463915.getClass(), "type", 40);
        setField(term4463915, term4463915.getClass(), "str", null);
        setField(term4463823, term4463823.getClass(), "next", term4463915);
        setIntField(term4463823, term4463823.getClass(), "type", 40);
        setField(term4463731, term4463731.getClass(), "first", term4463823);
        setIntField(term4463985, term4463985.getClass(), "type", 43);
        setField(term4463731, term4463731.getClass(), "next", term4463985);
        setField(term4463639, term4463639.getClass(), "first", term4463731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4463639;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4463547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



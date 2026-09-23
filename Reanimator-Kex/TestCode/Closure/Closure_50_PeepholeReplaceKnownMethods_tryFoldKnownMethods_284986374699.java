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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3608592;
     Object term3608684;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3608592 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3608684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3608960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3608776, term3608776.getClass(), "type", 35);
        setIntField(term3608960, term3608960.getClass(), "type", 40);
        setField(term3608960, term3608960.getClass(), "str", "lastIndexOf");
        setField(term3608868, term3608868.getClass(), "next", term3608960);
        setIntField(term3608868, term3608868.getClass(), "type", 40);
        setField(term3608776, term3608776.getClass(), "first", term3608868);
        setIntField(term3609090, term3609090.getClass(), "type", 44);
        setField(term3608776, term3608776.getClass(), "next", term3609090);
        setField(term3608684, term3608684.getClass(), "first", term3608776);
        setIntField(term3608684, term3608684.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3608684;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3608592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



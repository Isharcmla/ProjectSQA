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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3805865;
     Object term3805957;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3805865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3805957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806049 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3806395 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3806049, term3806049.getClass(), "type", 35);
        setIntField(term3806233, term3806233.getClass(), "type", 40);
        setField(term3806233, term3806233.getClass(), "str", "indexOf");
        setField(term3806141, term3806141.getClass(), "next", term3806233);
        setIntField(term3806141, term3806141.getClass(), "type", 40);
        setField(term3806141, term3806141.getClass(), "str", "");
        setField(term3806049, term3806049.getClass(), "first", term3806141);
        setIntField(term3806395, term3806395.getClass(), "type", 41);
        setField(term3806395, term3806395.getClass(), "next", null);
        setField(term3806049, term3806049.getClass(), "next", term3806395);
        setField(term3805957, term3805957.getClass(), "first", term3806049);
        setIntField(term3805957, term3805957.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3805957;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3805865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



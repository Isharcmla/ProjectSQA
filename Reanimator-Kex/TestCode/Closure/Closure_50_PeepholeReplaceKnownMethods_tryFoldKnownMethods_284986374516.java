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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3494191;
     Object term3494283;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3494191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3494283 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3494375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3494467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3494559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3494689 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3494375, term3494375.getClass(), "type", 35);
        setIntField(term3494559, term3494559.getClass(), "type", 40);
        setField(term3494559, term3494559.getClass(), "str", "lastIndexOf");
        setField(term3494467, term3494467.getClass(), "next", term3494559);
        setIntField(term3494467, term3494467.getClass(), "type", 40);
        setField(term3494467, term3494467.getClass(), "str", null);
        setField(term3494375, term3494375.getClass(), "first", term3494467);
        setIntField(term3494689, term3494689.getClass(), "type", 40);
        setField(term3494689, term3494689.getClass(), "next", null);
        setField(term3494689, term3494689.getClass(), "str", "");
        setField(term3494375, term3494375.getClass(), "next", term3494689);
        setField(term3494283, term3494283.getClass(), "first", term3494375);
        setIntField(term3494283, term3494283.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3494283;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3494191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



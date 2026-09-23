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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552524;
     Object term3552616;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3552524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3552616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3552892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3553016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3552708, term3552708.getClass(), "type", 35);
        setIntField(term3552892, term3552892.getClass(), "type", 40);
        setField(term3552892, term3552892.getClass(), "str", "lastIndexOf");
        setField(term3552800, term3552800.getClass(), "next", term3552892);
        setIntField(term3552800, term3552800.getClass(), "type", 40);
        setField(term3552708, term3552708.getClass(), "first", term3552800);
        setIntField(term3553016, term3553016.getClass(), "type", 41);
        setField(term3552708, term3552708.getClass(), "next", term3553016);
        setField(term3552616, term3552616.getClass(), "first", term3552708);
        setIntField(term3552616, term3552616.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3552616;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3552524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



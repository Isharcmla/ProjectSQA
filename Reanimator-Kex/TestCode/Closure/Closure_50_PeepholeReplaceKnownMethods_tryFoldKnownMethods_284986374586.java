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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3538247;
     Object term3538339;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3538247 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3538339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3538431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3538523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3538615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3538761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3538431, term3538431.getClass(), "type", 35);
        setIntField(term3538615, term3538615.getClass(), "type", 40);
        setField(term3538615, term3538615.getClass(), "str", "toUpperCase");
        setField(term3538523, term3538523.getClass(), "next", term3538615);
        setIntField(term3538523, term3538523.getClass(), "type", 40);
        setField(term3538523, term3538523.getClass(), "str", "");
        setField(term3538431, term3538431.getClass(), "first", term3538523);
        setField(term3538431, term3538431.getClass(), "next", null);
        setField(term3538339, term3538339.getClass(), "first", term3538431);
        setIntField(term3538339, term3538339.getClass(), "type", 37);
        setField(term3538339, term3538339.getClass(), "parent", term3538761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3538339;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3538247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



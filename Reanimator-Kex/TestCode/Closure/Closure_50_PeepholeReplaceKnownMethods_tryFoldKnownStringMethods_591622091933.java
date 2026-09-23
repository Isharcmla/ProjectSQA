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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3784470;
     Object term3784562;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3784470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3784562 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3784654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3784746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3784876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3784562, term3784562.getClass(), "type", 37);
        setIntField(term3784654, term3784654.getClass(), "type", 35);
        setField(term3784746, term3784746.getClass(), "next", term3784746);
        setIntField(term3784746, term3784746.getClass(), "type", 40);
        setField(term3784746, term3784746.getClass(), "str", "toLowerCase");
        setField(term3784654, term3784654.getClass(), "first", term3784746);
        setField(term3784654, term3784654.getClass(), "next", null);
        setField(term3784562, term3784562.getClass(), "first", term3784654);
        setField(term3784562, term3784562.getClass(), "parent", term3784876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3784562;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3784470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



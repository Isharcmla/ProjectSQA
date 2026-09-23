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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3622142;
     Object term3622234;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3622142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3622234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3622326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3622418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3622510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3622678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3622770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3622326, term3622326.getClass(), "type", 35);
        setIntField(term3622510, term3622510.getClass(), "type", 40);
        setField(term3622510, term3622510.getClass(), "str", "indexOf");
        setField(term3622418, term3622418.getClass(), "next", term3622510);
        setIntField(term3622418, term3622418.getClass(), "type", 40);
        setField(term3622418, term3622418.getClass(), "str", "");
        setField(term3622326, term3622326.getClass(), "first", term3622418);
        setIntField(term3622678, term3622678.getClass(), "type", 43);
        setField(term3622678, term3622678.getClass(), "next", null);
        setField(term3622326, term3622326.getClass(), "next", term3622678);
        setField(term3622234, term3622234.getClass(), "first", term3622326);
        setIntField(term3622234, term3622234.getClass(), "type", 37);
        setField(term3622234, term3622234.getClass(), "parent", term3622770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3622234;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3622142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



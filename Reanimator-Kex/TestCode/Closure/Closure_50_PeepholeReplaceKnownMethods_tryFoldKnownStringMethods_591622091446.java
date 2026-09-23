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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206678;
     Object term3206764;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3206678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3206764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3206856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3206948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3207040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3207110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3206764, term3206764.getClass(), "type", 37);
        setIntField(term3206856, term3206856.getClass(), "type", 35);
        setIntField(term3207040, term3207040.getClass(), "type", 40);
        setField(term3207040, term3207040.getClass(), "str", null);
        setField(term3206948, term3206948.getClass(), "next", term3207040);
        setIntField(term3206948, term3206948.getClass(), "type", 40);
        setField(term3206856, term3206856.getClass(), "first", term3206948);
        setIntField(term3207110, term3207110.getClass(), "type", 44);
        setField(term3206856, term3206856.getClass(), "next", term3207110);
        setField(term3206764, term3206764.getClass(), "first", term3206856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3206764;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3206678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



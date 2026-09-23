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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794973;
     Object term3795065;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3794973 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3795065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3795157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3795249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3795341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3795503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3795157, term3795157.getClass(), "type", 35);
        setIntField(term3795341, term3795341.getClass(), "type", 40);
        setField(term3795341, term3795341.getClass(), "str", "lastIndexOf");
        setField(term3795249, term3795249.getClass(), "next", term3795341);
        setIntField(term3795249, term3795249.getClass(), "type", 40);
        setField(term3795249, term3795249.getClass(), "str", "");
        setField(term3795157, term3795157.getClass(), "first", term3795249);
        setIntField(term3795503, term3795503.getClass(), "type", 43);
        setField(term3795503, term3795503.getClass(), "next", null);
        setField(term3795157, term3795157.getClass(), "next", term3795503);
        setField(term3795065, term3795065.getClass(), "first", term3795157);
        setIntField(term3795065, term3795065.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3795065;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3794973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



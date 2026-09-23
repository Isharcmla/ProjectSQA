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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3630411;
     Object term3630503;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3630411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3630503 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3630903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3630595, term3630595.getClass(), "type", 35);
        setIntField(term3630779, term3630779.getClass(), "type", 40);
        setField(term3630779, term3630779.getClass(), "str", "lastIndexOf");
        setField(term3630687, term3630687.getClass(), "next", term3630779);
        setIntField(term3630687, term3630687.getClass(), "type", 40);
        setField(term3630595, term3630595.getClass(), "first", term3630687);
        setIntField(term3630903, term3630903.getClass(), "type", 39);
        setField(term3630595, term3630595.getClass(), "next", term3630903);
        setField(term3630503, term3630503.getClass(), "first", term3630595);
        setIntField(term3630503, term3630503.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3630503;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3630411, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



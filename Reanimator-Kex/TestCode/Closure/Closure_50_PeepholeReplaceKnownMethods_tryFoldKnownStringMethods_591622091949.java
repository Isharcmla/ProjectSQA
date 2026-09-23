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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794138;
     Object term3794224;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3794138 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3794224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3794316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3794408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3794500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3794630 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3794224, term3794224.getClass(), "type", 37);
        setIntField(term3794316, term3794316.getClass(), "type", 35);
        setIntField(term3794500, term3794500.getClass(), "type", 40);
        setField(term3794500, term3794500.getClass(), "str", "lastIndexOf");
        setField(term3794408, term3794408.getClass(), "next", term3794500);
        setIntField(term3794408, term3794408.getClass(), "type", 40);
        setField(term3794316, term3794316.getClass(), "first", term3794408);
        setIntField(term3794630, term3794630.getClass(), "type", 44);
        setField(term3794316, term3794316.getClass(), "next", term3794630);
        setField(term3794224, term3794224.getClass(), "first", term3794316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3794224;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3794138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



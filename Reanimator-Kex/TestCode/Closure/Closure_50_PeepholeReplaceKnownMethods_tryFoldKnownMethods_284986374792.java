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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3676101;
     Object term3676193;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3676101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3676193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3676285 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3676377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3676507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3676285, term3676285.getClass(), "type", 35);
        setField(term3676377, term3676377.getClass(), "next", term3676377);
        setIntField(term3676377, term3676377.getClass(), "type", 40);
        setField(term3676377, term3676377.getClass(), "str", "lastIndexOf");
        setField(term3676285, term3676285.getClass(), "first", term3676377);
        setIntField(term3676507, term3676507.getClass(), "type", 40);
        setField(term3676285, term3676285.getClass(), "next", term3676507);
        setField(term3676193, term3676193.getClass(), "first", term3676285);
        setIntField(term3676193, term3676193.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3676193;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3676101, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



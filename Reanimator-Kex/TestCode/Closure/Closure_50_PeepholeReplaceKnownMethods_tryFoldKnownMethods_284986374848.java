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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3711678;
     Object term3711770;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3711678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3711770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3711862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3711954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3712084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3711862, term3711862.getClass(), "type", 35);
        setField(term3711954, term3711954.getClass(), "next", term3711954);
        setIntField(term3711954, term3711954.getClass(), "type", 40);
        setField(term3711954, term3711954.getClass(), "str", "indexOf");
        setField(term3711862, term3711862.getClass(), "first", term3711954);
        setIntField(term3712084, term3712084.getClass(), "type", 41);
        setField(term3711862, term3711862.getClass(), "next", term3712084);
        setField(term3711770, term3711770.getClass(), "first", term3711862);
        setIntField(term3711770, term3711770.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3711770;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3711678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



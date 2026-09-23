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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3643873;
     Object term3643965;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3643873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3643965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3644057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3644149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3644241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3644365 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3644057, term3644057.getClass(), "type", 35);
        setIntField(term3644241, term3644241.getClass(), "type", 40);
        setField(term3644241, term3644241.getClass(), "str", "indexOf");
        setField(term3644149, term3644149.getClass(), "next", term3644241);
        setIntField(term3644149, term3644149.getClass(), "type", 40);
        setField(term3644057, term3644057.getClass(), "first", term3644149);
        setIntField(term3644365, term3644365.getClass(), "type", 39);
        setField(term3644057, term3644057.getClass(), "next", term3644365);
        setField(term3643965, term3643965.getClass(), "first", term3644057);
        setIntField(term3643965, term3643965.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3643965;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3643873, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3581873;
     Object term3581965;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3581873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3581965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3582057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3582149 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3582241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3582403 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3582057, term3582057.getClass(), "type", 35);
        setIntField(term3582241, term3582241.getClass(), "type", 40);
        setField(term3582241, term3582241.getClass(), "str", "lastIndexOf");
        setField(term3582149, term3582149.getClass(), "next", term3582241);
        setIntField(term3582149, term3582149.getClass(), "type", 40);
        setField(term3582149, term3582149.getClass(), "str", "");
        setField(term3582057, term3582057.getClass(), "first", term3582149);
        setIntField(term3582403, term3582403.getClass(), "type", 41);
        setField(term3582403, term3582403.getClass(), "next", null);
        setField(term3582057, term3582057.getClass(), "next", term3582403);
        setField(term3581965, term3581965.getClass(), "first", term3582057);
        setIntField(term3581965, term3581965.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3581965;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3581873, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



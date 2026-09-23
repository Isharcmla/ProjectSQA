package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_init_95027287612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53436;
     Object term53927;
     Object term53928;

    public Node_init_95027287612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53519, term53519.getClass(), "type", 0);
        setField(term53519, term53519.getClass(), "parent", null);
        term53436 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term53927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53927, term53927.getClass(), "type", 0);
        setField(term53927, term53927.getClass(), "next", null);
        setField(term53927, term53927.getClass(), "first", null);
        setField(term53927, term53927.getClass(), "last", null);
        setField(term53927, term53927.getClass(), "propListHead", null);
        setIntField(term53927, term53927.getClass(), "sourcePosition", 0);
        setField(term53927, term53927.getClass(), "jsType", null);
        setField(term53927, term53927.getClass(), "parent", null);
        term53928 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = term53436;
        args[2] = 0;
        args[3] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53927));
        assertTrue(recursiveEquals(term53436, term53928));
    }

};



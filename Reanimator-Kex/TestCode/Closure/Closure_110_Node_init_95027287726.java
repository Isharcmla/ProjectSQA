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
import java.lang.Object;

public class Node_init_95027287726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72494;

    public Node_init_95027287726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72588, term72588.getClass(), "type", 0);
        setField(term72588, term72588.getClass(), "parent", null);
        setField(term72588, term72588.getClass(), "first", null);
        setField(term72588, term72588.getClass(), "last", null);
        term72494 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term72658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setElement(term72494, 0, term72658);
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
        args[1] = term72494;
        args[2] = 0;
        args[3] = 0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



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
import java.lang.Integer;

public class Node_init_2020536304214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;
     Object term285;
     Object term287;
     Object term9369;

    public Node_init_2020536304214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = new Integer(-663691365);
        term285 = new Integer(339854490);
        term287 = new Integer(-615654495);
        term9369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9369, term9369.getClass(), "type", -663691365);
        setField(term9369, term9369.getClass(), "next", null);
        setField(term9369, term9369.getClass(), "first", null);
        setField(term9369, term9369.getClass(), "last", null);
        setField(term9369, term9369.getClass(), "propListHead", null);
        setIntField(term9369, term9369.getClass(), "sourcePosition", -1);
        setField(term9369, term9369.getClass(), "jsType", null);
        setField(term9369, term9369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term283;
        args[1] = term285;
        args[2] = term287;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9369));
        assertTrue(recursiveEquals(term283, 339854490));
        assertTrue(recursiveEquals(term285, -615654495));
        assertTrue(recursiveEquals(term287, -663691365));
    }

};



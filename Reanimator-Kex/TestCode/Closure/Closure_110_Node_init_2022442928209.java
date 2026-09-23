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

public class Node_init_2022442928209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term7777;

    public Node_init_2022442928209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term7777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7777, term7777.getClass(), "type", 1162663216);
        setField(term7777, term7777.getClass(), "next", null);
        setField(term7777, term7777.getClass(), "first", null);
        setField(term7777, term7777.getClass(), "last", null);
        setField(term7777, term7777.getClass(), "propListHead", null);
        setIntField(term7777, term7777.getClass(), "sourcePosition", -1);
        setField(term7777, term7777.getClass(), "jsType", null);
        setField(term7777, term7777.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7777));
        assertTrue(recursiveEquals(term3, 1162663216));
    }

};



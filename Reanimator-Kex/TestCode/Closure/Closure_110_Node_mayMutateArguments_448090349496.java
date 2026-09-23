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

public class Node_mayMutateArguments_448090349496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39704;
     Object term39720;

    public Node_mayMutateArguments_448090349496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term39720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39720, term39720.getClass(), "number", 0.0);
        setIntField(term39720, term39720.getClass(), "type", 0);
        setField(term39720, term39720.getClass(), "next", null);
        setField(term39720, term39720.getClass(), "first", null);
        setField(term39720, term39720.getClass(), "last", null);
        setField(term39720, term39720.getClass(), "propListHead", null);
        setIntField(term39720, term39720.getClass(), "sourcePosition", 0);
        setField(term39720, term39720.getClass(), "jsType", null);
        setField(term39720, term39720.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mayMutateArguments", argTypes, term39704, args);
        assertTrue(recursiveEquals(term39704, term39720));
        assertTrue(recursiveEquals(retValue, true));
    }

};



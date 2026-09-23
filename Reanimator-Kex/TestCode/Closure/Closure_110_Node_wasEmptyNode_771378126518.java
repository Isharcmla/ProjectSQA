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

public class Node_wasEmptyNode_771378126518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41991;
     Object term42212;

    public Node_wasEmptyNode_771378126518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term42212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42212, term42212.getClass(), "number", 0.0);
        setIntField(term42212, term42212.getClass(), "type", 0);
        setField(term42212, term42212.getClass(), "next", null);
        setField(term42212, term42212.getClass(), "first", null);
        setField(term42212, term42212.getClass(), "last", null);
        setField(term42212, term42212.getClass(), "propListHead", null);
        setIntField(term42212, term42212.getClass(), "sourcePosition", 0);
        setField(term42212, term42212.getClass(), "jsType", null);
        setField(term42212, term42212.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wasEmptyNode", argTypes, term41991, args);
        assertTrue(recursiveEquals(term41991, term42212));
    }

};



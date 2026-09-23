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

public class Node_isOnlyModifiesThisCall_1342844914519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42088;
     Object term42227;

    public Node_isOnlyModifiesThisCall_1342844914519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term42227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42227, term42227.getClass(), "number", 0.0);
        setIntField(term42227, term42227.getClass(), "type", 0);
        setField(term42227, term42227.getClass(), "next", null);
        setField(term42227, term42227.getClass(), "first", null);
        setField(term42227, term42227.getClass(), "last", null);
        setField(term42227, term42227.getClass(), "propListHead", null);
        setIntField(term42227, term42227.getClass(), "sourcePosition", 0);
        setField(term42227, term42227.getClass(), "jsType", null);
        setField(term42227, term42227.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnlyModifiesThisCall", argTypes, term42088, args);
        assertTrue(recursiveEquals(term42088, term42227));
    }

};



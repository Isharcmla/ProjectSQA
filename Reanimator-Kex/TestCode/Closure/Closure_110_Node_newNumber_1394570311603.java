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

public class Node_newNumber_1394570311603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52688;

    public Node_newNumber_1394570311603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term52688, term52688.getClass(), "number", 0.0);
        setIntField(term52688, term52688.getClass(), "type", 39);
        setField(term52688, term52688.getClass(), "next", null);
        setField(term52688, term52688.getClass(), "first", null);
        setField(term52688, term52688.getClass(), "last", null);
        setField(term52688, term52688.getClass(), "propListHead", null);
        setIntField(term52688, term52688.getClass(), "sourcePosition", 0);
        setField(term52688, term52688.getClass(), "jsType", null);
        setField(term52688, term52688.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "newNumber", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term52688));
    }

};



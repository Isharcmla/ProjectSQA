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

public class Node_getBooleanProp_548985345596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51844;
     Object term51874;

    public Node_getBooleanProp_548985345596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term51874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51874, term51874.getClass(), "number", 0.0);
        setIntField(term51874, term51874.getClass(), "type", 0);
        setField(term51874, term51874.getClass(), "next", null);
        setField(term51874, term51874.getClass(), "first", null);
        setField(term51874, term51874.getClass(), "last", null);
        setField(term51874, term51874.getClass(), "propListHead", null);
        setIntField(term51874, term51874.getClass(), "sourcePosition", 0);
        setField(term51874, term51874.getClass(), "jsType", null);
        setField(term51874, term51874.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBooleanProp", argTypes, term51844, args);
        assertTrue(recursiveEquals(term51844, term51874));
        assertTrue(recursiveEquals(retValue, false));
    }

};



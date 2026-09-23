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

public class Node_removeChild_392226657588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50751;
     Object term50856;
     Object term51132;
     Object term51133;

    public Node_removeChild_392226657588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term50856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50751, term50751.getClass(), "first", term50856);
        term51132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51132, term51132.getClass(), "type", 0);
        setField(term51132, term51132.getClass(), "next", null);
        setField(term51132, term51132.getClass(), "first", null);
        setField(term51132, term51132.getClass(), "last", null);
        setField(term51132, term51132.getClass(), "propListHead", null);
        setIntField(term51132, term51132.getClass(), "sourcePosition", 0);
        setField(term51132, term51132.getClass(), "jsType", null);
        setField(term51132, term51132.getClass(), "parent", null);
        term51133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51133, term51133.getClass(), "type", 0);
        setField(term51133, term51133.getClass(), "next", null);
        setField(term51133, term51133.getClass(), "first", null);
        setField(term51133, term51133.getClass(), "last", null);
        setField(term51133, term51133.getClass(), "propListHead", null);
        setIntField(term51133, term51133.getClass(), "sourcePosition", 0);
        setField(term51133, term51133.getClass(), "jsType", null);
        setField(term51133, term51133.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50856;
        callMethod(klass, "removeChild", argTypes, term50751, args);
        assertTrue(recursiveEquals(term50751, term51132));
        assertTrue(recursiveEquals(term50856, term51133));
    }

};



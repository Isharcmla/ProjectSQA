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

public class Node_srcref_1529783239472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36873;
     Object term36965;
     Object term36984;
     Object term36985;
     Object term36973;

    public Node_srcref_1529783239472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term36965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term36984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36984, term36984.getClass(), "str", null);
        setIntField(term36984, term36984.getClass(), "type", 0);
        setField(term36984, term36984.getClass(), "next", null);
        setField(term36984, term36984.getClass(), "first", null);
        setField(term36984, term36984.getClass(), "last", null);
        setField(term36984, term36984.getClass(), "propListHead", null);
        setIntField(term36984, term36984.getClass(), "sourcePosition", 0);
        setField(term36984, term36984.getClass(), "jsType", null);
        setField(term36984, term36984.getClass(), "parent", null);
        term36985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36985, term36985.getClass(), "str", null);
        setIntField(term36985, term36985.getClass(), "type", 0);
        setField(term36985, term36985.getClass(), "next", null);
        setField(term36985, term36985.getClass(), "first", null);
        setField(term36985, term36985.getClass(), "last", null);
        setField(term36985, term36985.getClass(), "propListHead", null);
        setIntField(term36985, term36985.getClass(), "sourcePosition", 0);
        setField(term36985, term36985.getClass(), "jsType", null);
        setField(term36985, term36985.getClass(), "parent", null);
        term36973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36973, term36973.getClass(), "str", null);
        setIntField(term36973, term36973.getClass(), "type", 0);
        setField(term36973, term36973.getClass(), "next", null);
        setField(term36973, term36973.getClass(), "first", null);
        setField(term36973, term36973.getClass(), "last", null);
        setField(term36973, term36973.getClass(), "propListHead", null);
        setIntField(term36973, term36973.getClass(), "sourcePosition", 0);
        setField(term36973, term36973.getClass(), "jsType", null);
        setField(term36973, term36973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36965;
        Object retValue = callMethod(klass, "srcref", argTypes, term36873, args);
        assertTrue(recursiveEquals(term36873, term36984));
        assertTrue(recursiveEquals(term36965, term36985));
        assertTrue(recursiveEquals(retValue, term36973));
    }

};



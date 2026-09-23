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

public class Node_srcref_1529783239482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38181;
     Object term38273;
     Object term38302;
     Object term38303;
     Object term38290;

    public Node_srcref_1529783239482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term38273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term38302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38302, term38302.getClass(), "number", 0.0);
        setIntField(term38302, term38302.getClass(), "type", 0);
        setField(term38302, term38302.getClass(), "next", null);
        setField(term38302, term38302.getClass(), "first", null);
        setField(term38302, term38302.getClass(), "last", null);
        setField(term38302, term38302.getClass(), "propListHead", null);
        setIntField(term38302, term38302.getClass(), "sourcePosition", 0);
        setField(term38302, term38302.getClass(), "jsType", null);
        setField(term38302, term38302.getClass(), "parent", null);
        term38303 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38303, term38303.getClass(), "number", 0.0);
        setIntField(term38303, term38303.getClass(), "type", 0);
        setField(term38303, term38303.getClass(), "next", null);
        setField(term38303, term38303.getClass(), "first", null);
        setField(term38303, term38303.getClass(), "last", null);
        setField(term38303, term38303.getClass(), "propListHead", null);
        setIntField(term38303, term38303.getClass(), "sourcePosition", 0);
        setField(term38303, term38303.getClass(), "jsType", null);
        setField(term38303, term38303.getClass(), "parent", null);
        term38290 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38290, term38290.getClass(), "number", 0.0);
        setIntField(term38290, term38290.getClass(), "type", 0);
        setField(term38290, term38290.getClass(), "next", null);
        setField(term38290, term38290.getClass(), "first", null);
        setField(term38290, term38290.getClass(), "last", null);
        setField(term38290, term38290.getClass(), "propListHead", null);
        setIntField(term38290, term38290.getClass(), "sourcePosition", 0);
        setField(term38290, term38290.getClass(), "jsType", null);
        setField(term38290, term38290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38273;
        Object retValue = callMethod(klass, "srcref", argTypes, term38181, args);
        assertTrue(recursiveEquals(term38181, term38302));
        assertTrue(recursiveEquals(term38273, term38303));
        assertTrue(recursiveEquals(retValue, term38290));
    }

};



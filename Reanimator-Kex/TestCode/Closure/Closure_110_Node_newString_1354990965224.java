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

public class Node_newString_1354990965224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;
     Object term11783;

    public Node_newString_1354990965224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = new Integer(57189932);
        term11783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11783, term11783.getClass(), "str", "sjlJAEtRrb");
        setIntField(term11783, term11783.getClass(), "type", 57189932);
        setField(term11783, term11783.getClass(), "next", null);
        setField(term11783, term11783.getClass(), "first", null);
        setField(term11783, term11783.getClass(), "last", null);
        setField(term11783, term11783.getClass(), "propListHead", null);
        setIntField(term11783, term11783.getClass(), "sourcePosition", -1);
        setField(term11783, term11783.getClass(), "jsType", null);
        setField(term11783, term11783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term677;
        args[1] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "newString", argTypes, null, args);
        assertTrue(recursiveEquals(term677, 57189932));
        assertTrue(recursiveEquals(retValue, term11783));
    }

};



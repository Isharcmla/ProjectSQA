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

public class Node_newString_1489099059225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713;
     Object term715;
     Object term11850;

    public Node_newString_1489099059225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term713 = new Integer(1460722225);
        term715 = new Integer(1743224434);
        term11850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term11850, term11850.getClass(), "str", "MuLcgQHgqz");
        setIntField(term11850, term11850.getClass(), "type", 40);
        setField(term11850, term11850.getClass(), "next", null);
        setField(term11850, term11850.getClass(), "first", null);
        setField(term11850, term11850.getClass(), "last", null);
        setField(term11850, term11850.getClass(), "propListHead", null);
        setIntField(term11850, term11850.getClass(), "sourcePosition", 228794367);
        setField(term11850, term11850.getClass(), "jsType", null);
        setField(term11850, term11850.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = term713;
        args[2] = term715;
        Object retValue = callMethod(klass, "newString", argTypes, null, args);
        assertTrue(recursiveEquals(term713, 1743224434));
        assertTrue(recursiveEquals(term715, "MuLcgQHgqz"));
        assertTrue(recursiveEquals(retValue, term11850));
    }

};



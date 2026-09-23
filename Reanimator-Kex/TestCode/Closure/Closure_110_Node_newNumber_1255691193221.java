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
import java.lang.Double;

public class Node_newNumber_1255691193221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;
     Object term11704;

    public Node_newNumber_1255691193221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647 = new Double(0.13238746331190498);
        term11704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term11704, term11704.getClass(), "number", 0.13238746331190498);
        setIntField(term11704, term11704.getClass(), "type", 39);
        setField(term11704, term11704.getClass(), "next", null);
        setField(term11704, term11704.getClass(), "first", null);
        setField(term11704, term11704.getClass(), "last", null);
        setField(term11704, term11704.getClass(), "propListHead", null);
        setIntField(term11704, term11704.getClass(), "sourcePosition", -1);
        setField(term11704, term11704.getClass(), "jsType", null);
        setField(term11704, term11704.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term647;
        Object retValue = callMethod(klass, "newNumber", argTypes, null, args);
        assertTrue(recursiveEquals(term647, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, term11704));
    }

};



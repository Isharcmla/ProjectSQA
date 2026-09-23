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

public class Node_getLineno_2098521683498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39801;
     Object term39809;

    public Node_getLineno_2098521683498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39801, term39801.getClass(), "sourcePosition", -1);
        term39809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39809, term39809.getClass(), "type", 0);
        setField(term39809, term39809.getClass(), "next", null);
        setField(term39809, term39809.getClass(), "first", null);
        setField(term39809, term39809.getClass(), "last", null);
        setField(term39809, term39809.getClass(), "propListHead", null);
        setIntField(term39809, term39809.getClass(), "sourcePosition", -1);
        setField(term39809, term39809.getClass(), "jsType", null);
        setField(term39809, term39809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLineno", argTypes, term39801, args);
        assertTrue(recursiveEquals(term39801, term39809));
        assertTrue(recursiveEquals(retValue, -1));
    }

};



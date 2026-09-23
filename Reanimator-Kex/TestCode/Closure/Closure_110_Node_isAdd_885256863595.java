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

public class Node_isAdd_885256863595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51746;
     Object term51862;

    public Node_isAdd_885256863595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51746, term51746.getClass(), "type", 21);
        term51862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51862, term51862.getClass(), "type", 21);
        setField(term51862, term51862.getClass(), "next", null);
        setField(term51862, term51862.getClass(), "first", null);
        setField(term51862, term51862.getClass(), "last", null);
        setField(term51862, term51862.getClass(), "propListHead", null);
        setIntField(term51862, term51862.getClass(), "sourcePosition", 0);
        setField(term51862, term51862.getClass(), "jsType", null);
        setField(term51862, term51862.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAdd", argTypes, term51746, args);
        assertTrue(recursiveEquals(term51746, term51862));
        assertTrue(recursiveEquals(retValue, true));
    }

};



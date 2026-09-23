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

public class Node_hasChildren_892912065436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31021;
     Object term31027;

    public Node_hasChildren_892912065436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31021, term31021.getClass(), "first", null);
        term31027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31027, term31027.getClass(), "type", 0);
        setField(term31027, term31027.getClass(), "next", null);
        setField(term31027, term31027.getClass(), "first", null);
        setField(term31027, term31027.getClass(), "last", null);
        setField(term31027, term31027.getClass(), "propListHead", null);
        setIntField(term31027, term31027.getClass(), "sourcePosition", 0);
        setField(term31027, term31027.getClass(), "jsType", null);
        setField(term31027, term31027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasChildren", argTypes, term31021, args);
        assertTrue(recursiveEquals(term31021, term31027));
        assertTrue(recursiveEquals(retValue, false));
    }

};



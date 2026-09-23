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

public class Node_getDirectives_1774103868555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45934;
     Object term45960;

    public Node_getDirectives_1774103868555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term45960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term45960, term45960.getClass(), "number", 0.0);
        setIntField(term45960, term45960.getClass(), "type", 0);
        setField(term45960, term45960.getClass(), "next", null);
        setField(term45960, term45960.getClass(), "first", null);
        setField(term45960, term45960.getClass(), "last", null);
        setField(term45960, term45960.getClass(), "propListHead", null);
        setIntField(term45960, term45960.getClass(), "sourcePosition", 0);
        setField(term45960, term45960.getClass(), "jsType", null);
        setField(term45960, term45960.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDirectives", argTypes, term45934, args);
        assertTrue(recursiveEquals(term45934, term45960));
        assertTrue(recursiveEquals(retValue, null));
    }

};



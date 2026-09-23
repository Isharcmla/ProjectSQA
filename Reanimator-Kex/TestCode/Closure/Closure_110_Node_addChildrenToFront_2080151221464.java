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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_addChildrenToFront_2080151221464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35126;
     Object term35196;

    public Node_addChildrenToFront_2080151221464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term35196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35196, term35196.getClass(), "parent", null);
        setField(term35266, term35266.getClass(), "parent", null);
        setField(term35336, term35336.getClass(), "parent", term35406);
        setField(term35266, term35266.getClass(), "next", term35336);
        setField(term35196, term35196.getClass(), "next", term35266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35196;
        try {
            callMethod(klass, "addChildrenToFront", argTypes, term35126, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



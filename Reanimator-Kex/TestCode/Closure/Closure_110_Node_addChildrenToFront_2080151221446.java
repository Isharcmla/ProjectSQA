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

public class Node_addChildrenToFront_2080151221446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31975;
     Object term32045;

    public Node_addChildrenToFront_2080151221446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term32045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32045, term32045.getClass(), "parent", null);
        setField(term32115, term32115.getClass(), "parent", null);
        setField(term32185, term32185.getClass(), "parent", null);
        setField(term32255, term32255.getClass(), "parent", term32325);
        setField(term32185, term32185.getClass(), "next", term32255);
        setField(term32115, term32115.getClass(), "next", term32185);
        setField(term32045, term32045.getClass(), "next", term32115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32045;
        try {
            callMethod(klass, "addChildrenToFront", argTypes, term31975, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



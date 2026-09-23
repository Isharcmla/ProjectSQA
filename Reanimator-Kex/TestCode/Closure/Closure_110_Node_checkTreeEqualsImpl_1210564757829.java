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
import java.lang.Object;

public class Node_checkTreeEqualsImpl_1210564757829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95420;
     Object term95490;

    public Node_checkTreeEqualsImpl_1210564757829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95420, term95420.getClass(), "type", 0);
        setField(term95420, term95420.getClass(), "first", null);
        term95490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95490, term95490.getClass(), "type", 0);
        setField(term95490, term95490.getClass(), "first", term95560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term95490;
        callMethod(klass, "checkTreeEqualsImpl", argTypes, term95420, args);
    }

};



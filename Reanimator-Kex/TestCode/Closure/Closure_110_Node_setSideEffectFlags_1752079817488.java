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

public class Node_setSideEffectFlags_1752079817488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38971;
     Object term39073;
     Object term39164;
     Object term39165;

    public Node_setSideEffectFlags_1752079817488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38971, term38971.getClass(), "type", 37);
        term39073 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term39073, term39073.getClass(), "value", 0);
        term39164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39164, term39164.getClass(), "type", 37);
        setField(term39164, term39164.getClass(), "next", null);
        setField(term39164, term39164.getClass(), "first", null);
        setField(term39164, term39164.getClass(), "last", null);
        setField(term39164, term39164.getClass(), "propListHead", null);
        setIntField(term39164, term39164.getClass(), "sourcePosition", 0);
        setField(term39164, term39164.getClass(), "jsType", null);
        setField(term39164, term39164.getClass(), "parent", null);
        term39165 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term39165, term39165.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$SideEffectFlags");
        Object[] args = new Object[1];
        args[0] = term39073;
        callMethod(klass, "setSideEffectFlags", argTypes, term38971, args);
        assertTrue(recursiveEquals(term38971, term39164));
        assertTrue(recursiveEquals(term39073, term39165));
    }

};



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

public class Node_setSideEffectFlags_1752079817606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52789;
     Object term52891;
     Object term52982;
     Object term52983;

    public Node_setSideEffectFlags_1752079817606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52789, term52789.getClass(), "type", 30);
        term52891 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term52891, term52891.getClass(), "value", 0);
        term52982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52982, term52982.getClass(), "type", 30);
        setField(term52982, term52982.getClass(), "next", null);
        setField(term52982, term52982.getClass(), "first", null);
        setField(term52982, term52982.getClass(), "last", null);
        setField(term52982, term52982.getClass(), "propListHead", null);
        setIntField(term52982, term52982.getClass(), "sourcePosition", 0);
        setField(term52982, term52982.getClass(), "jsType", null);
        setField(term52982, term52982.getClass(), "parent", null);
        term52983 = newInstance(Class.forName("com.google.javascript.rhino.Node$SideEffectFlags"));
        setIntField(term52983, term52983.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$SideEffectFlags");
        Object[] args = new Object[1];
        args[0] = term52891;
        callMethod(klass, "setSideEffectFlags", argTypes, term52789, args);
        assertTrue(recursiveEquals(term52789, term52982));
        assertTrue(recursiveEquals(term52891, term52983));
    }

};



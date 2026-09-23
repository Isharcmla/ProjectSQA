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

public class Node_isThis_1369472464542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44412;
     Object term44419;

    public Node_isThis_1369472464542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44412, term44412.getClass(), "type", 42);
        term44419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44419, term44419.getClass(), "type", 42);
        setField(term44419, term44419.getClass(), "next", null);
        setField(term44419, term44419.getClass(), "first", null);
        setField(term44419, term44419.getClass(), "last", null);
        setField(term44419, term44419.getClass(), "propListHead", null);
        setIntField(term44419, term44419.getClass(), "sourcePosition", 0);
        setField(term44419, term44419.getClass(), "jsType", null);
        setField(term44419, term44419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isThis", argTypes, term44412, args);
        assertTrue(recursiveEquals(term44412, term44419));
        assertTrue(recursiveEquals(retValue, true));
    }

};



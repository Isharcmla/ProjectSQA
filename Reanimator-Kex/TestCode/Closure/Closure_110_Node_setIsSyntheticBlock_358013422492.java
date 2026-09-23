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
import java.lang.Object;

public class Node_setIsSyntheticBlock_358013422492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39279;
     Object term39402;

    public Node_setIsSyntheticBlock_358013422492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39381 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term39279, term39279.getClass(), "propListHead", term39381);
        term39402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39403 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term39402, term39402.getClass(), "type", 0);
        setField(term39402, term39402.getClass(), "next", null);
        setField(term39402, term39402.getClass(), "first", null);
        setField(term39402, term39402.getClass(), "last", null);
        setIntField(term39403, term39403.getClass(), "intValue", 0);
        setField(term39403, term39403.getClass(), "next", null);
        setIntField(term39403, term39403.getClass(), "propType", 0);
        setField(term39402, term39402.getClass(), "propListHead", term39403);
        setIntField(term39402, term39402.getClass(), "sourcePosition", 0);
        setField(term39402, term39402.getClass(), "jsType", null);
        setField(term39402, term39402.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "setIsSyntheticBlock", argTypes, term39279, args);
        assertTrue(recursiveEquals(term39279, term39402));
    }

};



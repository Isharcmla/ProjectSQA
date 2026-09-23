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

public class Node_putBooleanProp_1800850776456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34177;
     Object term34295;

    public Node_putBooleanProp_1800850776456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34279 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term34177, term34177.getClass(), "propListHead", term34279);
        term34295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34295, term34295.getClass(), "type", 0);
        setField(term34295, term34295.getClass(), "next", null);
        setField(term34295, term34295.getClass(), "first", null);
        setField(term34295, term34295.getClass(), "last", null);
        setField(term34295, term34295.getClass(), "propListHead", null);
        setIntField(term34295, term34295.getClass(), "sourcePosition", 0);
        setField(term34295, term34295.getClass(), "jsType", null);
        setField(term34295, term34295.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = false;
        callMethod(klass, "putBooleanProp", argTypes, term34177, args);
        assertTrue(recursiveEquals(term34177, term34295));
    }

};



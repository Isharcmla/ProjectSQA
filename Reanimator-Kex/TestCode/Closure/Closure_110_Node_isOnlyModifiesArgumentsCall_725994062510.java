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

public class Node_isOnlyModifiesArgumentsCall_725994062510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40934;
     Object term41421;

    public Node_isOnlyModifiesArgumentsCall_725994062510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41036 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term40934, term40934.getClass(), "propListHead", term41036);
        term41421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41422 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term41421, term41421.getClass(), "type", 0);
        setField(term41421, term41421.getClass(), "next", null);
        setField(term41421, term41421.getClass(), "first", null);
        setField(term41421, term41421.getClass(), "last", null);
        setIntField(term41422, term41422.getClass(), "intValue", 0);
        setField(term41422, term41422.getClass(), "next", null);
        setIntField(term41422, term41422.getClass(), "propType", 0);
        setField(term41421, term41421.getClass(), "propListHead", term41422);
        setIntField(term41421, term41421.getClass(), "sourcePosition", 0);
        setField(term41421, term41421.getClass(), "jsType", null);
        setField(term41421, term41421.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnlyModifiesArgumentsCall", argTypes, term40934, args);
        assertTrue(recursiveEquals(term40934, term41421));
    }

};



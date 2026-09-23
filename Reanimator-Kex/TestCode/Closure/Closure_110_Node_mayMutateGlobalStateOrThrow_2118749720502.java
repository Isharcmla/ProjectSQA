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

public class Node_mayMutateGlobalStateOrThrow_2118749720502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40089;
     Object term40126;

    public Node_mayMutateGlobalStateOrThrow_2118749720502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term40126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term40126, term40126.getClass(), "str", null);
        setIntField(term40126, term40126.getClass(), "type", 0);
        setField(term40126, term40126.getClass(), "next", null);
        setField(term40126, term40126.getClass(), "first", null);
        setField(term40126, term40126.getClass(), "last", null);
        setField(term40126, term40126.getClass(), "propListHead", null);
        setIntField(term40126, term40126.getClass(), "sourcePosition", 0);
        setField(term40126, term40126.getClass(), "jsType", null);
        setField(term40126, term40126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mayMutateGlobalStateOrThrow", argTypes, term40089, args);
        assertTrue(recursiveEquals(term40089, term40126));
        assertTrue(recursiveEquals(retValue, true));
    }

};



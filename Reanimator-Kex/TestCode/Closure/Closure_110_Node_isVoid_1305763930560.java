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

public class Node_isVoid_1305763930560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46326;
     Object term46935;

    public Node_isVoid_1305763930560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46326, term46326.getClass(), "type", 122);
        term46935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46935, term46935.getClass(), "type", 122);
        setField(term46935, term46935.getClass(), "next", null);
        setField(term46935, term46935.getClass(), "first", null);
        setField(term46935, term46935.getClass(), "last", null);
        setField(term46935, term46935.getClass(), "propListHead", null);
        setIntField(term46935, term46935.getClass(), "sourcePosition", 0);
        setField(term46935, term46935.getClass(), "jsType", null);
        setField(term46935, term46935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isVoid", argTypes, term46326, args);
        assertTrue(recursiveEquals(term46326, term46935));
        assertTrue(recursiveEquals(retValue, true));
    }

};



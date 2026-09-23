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

public class Node_getChangeTime_383734587478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37974;
     Object term37983;

    public Node_getChangeTime_383734587478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term37983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term37983, term37983.getClass(), "str", null);
        setIntField(term37983, term37983.getClass(), "type", 0);
        setField(term37983, term37983.getClass(), "next", null);
        setField(term37983, term37983.getClass(), "first", null);
        setField(term37983, term37983.getClass(), "last", null);
        setField(term37983, term37983.getClass(), "propListHead", null);
        setIntField(term37983, term37983.getClass(), "sourcePosition", 0);
        setField(term37983, term37983.getClass(), "jsType", null);
        setField(term37983, term37983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getChangeTime", argTypes, term37974, args);
        assertTrue(recursiveEquals(term37974, term37983));
        assertTrue(recursiveEquals(retValue, 0));
    }

};



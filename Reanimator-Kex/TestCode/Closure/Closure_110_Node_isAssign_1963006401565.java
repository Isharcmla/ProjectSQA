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

public class Node_isAssign_1963006401565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47389;
     Object term47918;

    public Node_isAssign_1963006401565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47389, term47389.getClass(), "type", 86);
        term47918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47918, term47918.getClass(), "type", 86);
        setField(term47918, term47918.getClass(), "next", null);
        setField(term47918, term47918.getClass(), "first", null);
        setField(term47918, term47918.getClass(), "last", null);
        setField(term47918, term47918.getClass(), "propListHead", null);
        setIntField(term47918, term47918.getClass(), "sourcePosition", 0);
        setField(term47918, term47918.getClass(), "jsType", null);
        setField(term47918, term47918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAssign", argTypes, term47389, args);
        assertTrue(recursiveEquals(term47389, term47918));
        assertTrue(recursiveEquals(retValue, true));
    }

};



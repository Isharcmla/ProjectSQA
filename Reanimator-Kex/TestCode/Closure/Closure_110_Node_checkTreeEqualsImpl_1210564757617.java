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

public class Node_checkTreeEqualsImpl_1210564757617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54142;
     Object term54502;
     Object term54503;

    public Node_checkTreeEqualsImpl_1210564757617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54142, term54142.getClass(), "type", 0);
        term54502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54502, term54502.getClass(), "type", 0);
        setField(term54502, term54502.getClass(), "next", null);
        setField(term54502, term54502.getClass(), "first", null);
        setField(term54502, term54502.getClass(), "last", null);
        setField(term54502, term54502.getClass(), "propListHead", null);
        setIntField(term54502, term54502.getClass(), "sourcePosition", 0);
        setField(term54502, term54502.getClass(), "jsType", null);
        setField(term54502, term54502.getClass(), "parent", null);
        term54503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54503, term54503.getClass(), "type", 0);
        setField(term54503, term54503.getClass(), "next", null);
        setField(term54503, term54503.getClass(), "first", null);
        setField(term54503, term54503.getClass(), "last", null);
        setField(term54503, term54503.getClass(), "propListHead", null);
        setIntField(term54503, term54503.getClass(), "sourcePosition", 0);
        setField(term54503, term54503.getClass(), "jsType", null);
        setField(term54503, term54503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54142;
        Object retValue = callMethod(klass, "checkTreeEqualsImpl", argTypes, term54142, args);
        assertTrue(recursiveEquals(term54142, term54502));
        assertTrue(recursiveEquals(term54142, term54503));
        assertTrue(recursiveEquals(retValue, null));
    }

};



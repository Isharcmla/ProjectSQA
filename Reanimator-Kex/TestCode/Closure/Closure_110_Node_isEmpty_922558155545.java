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

public class Node_isEmpty_922558155545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44500;
     Object term44604;

    public Node_isEmpty_922558155545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44500, term44500.getClass(), "type", 124);
        term44604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44604, term44604.getClass(), "type", 124);
        setField(term44604, term44604.getClass(), "next", null);
        setField(term44604, term44604.getClass(), "first", null);
        setField(term44604, term44604.getClass(), "last", null);
        setField(term44604, term44604.getClass(), "propListHead", null);
        setIntField(term44604, term44604.getClass(), "sourcePosition", 0);
        setField(term44604, term44604.getClass(), "jsType", null);
        setField(term44604, term44604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term44500, args);
        assertTrue(recursiveEquals(term44500, term44604));
        assertTrue(recursiveEquals(retValue, true));
    }

};



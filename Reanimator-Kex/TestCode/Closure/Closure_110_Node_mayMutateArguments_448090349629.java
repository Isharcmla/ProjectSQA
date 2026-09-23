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

public class Node_mayMutateArguments_448090349629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55543;
     Object term55890;

    public Node_mayMutateArguments_448090349629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55543 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term55890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55890, term55890.getClass(), "str", null);
        setIntField(term55890, term55890.getClass(), "type", 0);
        setField(term55890, term55890.getClass(), "next", null);
        setField(term55890, term55890.getClass(), "first", null);
        setField(term55890, term55890.getClass(), "last", null);
        setField(term55890, term55890.getClass(), "propListHead", null);
        setIntField(term55890, term55890.getClass(), "sourcePosition", 0);
        setField(term55890, term55890.getClass(), "jsType", null);
        setField(term55890, term55890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mayMutateArguments", argTypes, term55543, args);
        assertTrue(recursiveEquals(term55543, term55890));
        assertTrue(recursiveEquals(retValue, true));
    }

};



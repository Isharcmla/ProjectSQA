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

public class Node_setLength_1534426554486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38622;
     Object term38884;

    public Node_setLength_1534426554486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term38884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38884, term38884.getClass(), "str", null);
        setIntField(term38884, term38884.getClass(), "type", 0);
        setField(term38884, term38884.getClass(), "next", null);
        setField(term38884, term38884.getClass(), "first", null);
        setField(term38884, term38884.getClass(), "last", null);
        setField(term38884, term38884.getClass(), "propListHead", null);
        setIntField(term38884, term38884.getClass(), "sourcePosition", 0);
        setField(term38884, term38884.getClass(), "jsType", null);
        setField(term38884, term38884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setLength", argTypes, term38622, args);
        assertTrue(recursiveEquals(term38622, term38884));
    }

};



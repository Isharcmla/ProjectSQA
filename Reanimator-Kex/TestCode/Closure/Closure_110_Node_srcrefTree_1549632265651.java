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
import java.lang.Object;

public class Node_srcrefTree_1549632265651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58995;
     Object term59179;

    public Node_srcrefTree_1549632265651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term58995, term58995.getClass(), "propListHead", null);
        setIntField(term58995, term58995.getClass(), "sourcePosition", 0);
        setField(term59087, term59087.getClass(), "propListHead", null);
        setIntField(term59087, term59087.getClass(), "sourcePosition", 0);
        setField(term59087, term59087.getClass(), "first", term59087);
        setField(term58995, term58995.getClass(), "first", term59087);
        term59179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term59179, term59179.getClass(), "propListHead", null);
        setIntField(term59179, term59179.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term59179;
        callMethod(klass, "srcrefTree", argTypes, term58995, args);
    }

};



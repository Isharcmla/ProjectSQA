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

public class Node_srcrefTree_1549632265476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37608;
     Object term37700;
     Object term37876;
     Object term37877;
     Object term37863;

    public Node_srcrefTree_1549632265476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term37700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term37876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term37876, term37876.getClass(), "number", 0.0);
        setIntField(term37876, term37876.getClass(), "type", 0);
        setField(term37876, term37876.getClass(), "next", null);
        setField(term37876, term37876.getClass(), "first", null);
        setField(term37876, term37876.getClass(), "last", null);
        setField(term37876, term37876.getClass(), "propListHead", null);
        setIntField(term37876, term37876.getClass(), "sourcePosition", 0);
        setField(term37876, term37876.getClass(), "jsType", null);
        setField(term37876, term37876.getClass(), "parent", null);
        term37877 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term37877, term37877.getClass(), "number", 0.0);
        setIntField(term37877, term37877.getClass(), "type", 0);
        setField(term37877, term37877.getClass(), "next", null);
        setField(term37877, term37877.getClass(), "first", null);
        setField(term37877, term37877.getClass(), "last", null);
        setField(term37877, term37877.getClass(), "propListHead", null);
        setIntField(term37877, term37877.getClass(), "sourcePosition", 0);
        setField(term37877, term37877.getClass(), "jsType", null);
        setField(term37877, term37877.getClass(), "parent", null);
        term37863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term37863, term37863.getClass(), "number", 0.0);
        setIntField(term37863, term37863.getClass(), "type", 0);
        setField(term37863, term37863.getClass(), "next", null);
        setField(term37863, term37863.getClass(), "first", null);
        setField(term37863, term37863.getClass(), "last", null);
        setField(term37863, term37863.getClass(), "propListHead", null);
        setIntField(term37863, term37863.getClass(), "sourcePosition", 0);
        setField(term37863, term37863.getClass(), "jsType", null);
        setField(term37863, term37863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37700;
        Object retValue = callMethod(klass, "srcrefTree", argTypes, term37608, args);
        assertTrue(recursiveEquals(term37608, term37876));
        assertTrue(recursiveEquals(term37700, term37877));
        assertTrue(recursiveEquals(retValue, term37863));
    }

};



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
import java.lang.Object;

public class Node_copyInformationFromForTree_136952912454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33241;
     Object term33425;
     Object term34090;
     Object term34092;
     Object term34039;

    public Node_copyInformationFromForTree_136952912454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term33241, term33241.getClass(), "propListHead", null);
        setIntField(term33241, term33241.getClass(), "sourcePosition", 0);
        setField(term33241, term33241.getClass(), "first", term33333);
        term33425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term33425, term33425.getClass(), "propListHead", null);
        setIntField(term33425, term33425.getClass(), "sourcePosition", 0);
        term34090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34090, term34090.getClass(), "str", null);
        setIntField(term34090, term34090.getClass(), "type", 0);
        setField(term34090, term34090.getClass(), "next", null);
        setField(term34091, term34091.getClass(), "str", null);
        setIntField(term34091, term34091.getClass(), "type", 0);
        setField(term34091, term34091.getClass(), "next", null);
        setField(term34091, term34091.getClass(), "first", null);
        setField(term34091, term34091.getClass(), "last", null);
        setField(term34091, term34091.getClass(), "propListHead", null);
        setIntField(term34091, term34091.getClass(), "sourcePosition", 0);
        setField(term34091, term34091.getClass(), "jsType", null);
        setField(term34091, term34091.getClass(), "parent", null);
        setField(term34090, term34090.getClass(), "first", term34091);
        setField(term34090, term34090.getClass(), "last", null);
        setField(term34090, term34090.getClass(), "propListHead", null);
        setIntField(term34090, term34090.getClass(), "sourcePosition", 0);
        setField(term34090, term34090.getClass(), "jsType", null);
        setField(term34090, term34090.getClass(), "parent", null);
        term34092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34092, term34092.getClass(), "str", null);
        setIntField(term34092, term34092.getClass(), "type", 0);
        setField(term34092, term34092.getClass(), "next", null);
        setField(term34092, term34092.getClass(), "first", null);
        setField(term34092, term34092.getClass(), "last", null);
        setField(term34092, term34092.getClass(), "propListHead", null);
        setIntField(term34092, term34092.getClass(), "sourcePosition", 0);
        setField(term34092, term34092.getClass(), "jsType", null);
        setField(term34092, term34092.getClass(), "parent", null);
        term34039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term34041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term34039, term34039.getClass(), "str", null);
        setIntField(term34039, term34039.getClass(), "type", 0);
        setField(term34039, term34039.getClass(), "next", null);
        setField(term34041, term34041.getClass(), "str", null);
        setIntField(term34041, term34041.getClass(), "type", 0);
        setField(term34041, term34041.getClass(), "next", null);
        setField(term34041, term34041.getClass(), "first", null);
        setField(term34041, term34041.getClass(), "last", null);
        setField(term34041, term34041.getClass(), "propListHead", null);
        setIntField(term34041, term34041.getClass(), "sourcePosition", 0);
        setField(term34041, term34041.getClass(), "jsType", null);
        setField(term34041, term34041.getClass(), "parent", null);
        setField(term34039, term34039.getClass(), "first", term34041);
        setField(term34039, term34039.getClass(), "last", null);
        setField(term34039, term34039.getClass(), "propListHead", null);
        setIntField(term34039, term34039.getClass(), "sourcePosition", 0);
        setField(term34039, term34039.getClass(), "jsType", null);
        setField(term34039, term34039.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33425;
        Object retValue = callMethod(klass, "copyInformationFromForTree", argTypes, term33241, args);
        assertTrue(recursiveEquals(term33241, term34090));
        assertTrue(recursiveEquals(term33425, term34092));
        assertTrue(recursiveEquals(retValue, term34039));
    }

};



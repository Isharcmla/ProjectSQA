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

public class Node_setDirectives_2093488318569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47998;
     Object term48453;

    public Node_setDirectives_2093488318569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48100 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term47998, term47998.getClass(), "propListHead", term48100);
        term48453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48454 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term48453, term48453.getClass(), "type", 0);
        setField(term48453, term48453.getClass(), "next", null);
        setField(term48453, term48453.getClass(), "first", null);
        setField(term48453, term48453.getClass(), "last", null);
        setIntField(term48454, term48454.getClass(), "intValue", 0);
        setField(term48454, term48454.getClass(), "next", null);
        setIntField(term48454, term48454.getClass(), "propType", 0);
        setField(term48453, term48453.getClass(), "propListHead", term48454);
        setIntField(term48453, term48453.getClass(), "sourcePosition", 0);
        setField(term48453, term48453.getClass(), "jsType", null);
        setField(term48453, term48453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDirectives", argTypes, term47998, args);
        assertTrue(recursiveEquals(term47998, term48453));
    }

};



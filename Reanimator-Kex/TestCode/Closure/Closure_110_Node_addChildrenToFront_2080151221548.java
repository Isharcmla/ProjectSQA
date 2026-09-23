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

public class Node_addChildrenToFront_2080151221548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44695;
     Object term44765;
     Object term45120;
     Object term45123;

    public Node_addChildrenToFront_2080151221548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term44765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44765, term44765.getClass(), "parent", null);
        setField(term44835, term44835.getClass(), "parent", null);
        setField(term44835, term44835.getClass(), "next", null);
        setField(term44765, term44765.getClass(), "next", term44835);
        term45120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45120, term45120.getClass(), "type", 0);
        setField(term45120, term45120.getClass(), "next", null);
        setIntField(term45121, term45121.getClass(), "type", 0);
        setIntField(term45122, term45122.getClass(), "type", 0);
        setField(term45122, term45122.getClass(), "next", null);
        setField(term45122, term45122.getClass(), "first", null);
        setField(term45122, term45122.getClass(), "last", null);
        setField(term45122, term45122.getClass(), "propListHead", null);
        setIntField(term45122, term45122.getClass(), "sourcePosition", 0);
        setField(term45122, term45122.getClass(), "jsType", null);
        setField(term45122, term45122.getClass(), "parent", term45120);
        setField(term45121, term45121.getClass(), "next", term45122);
        setField(term45121, term45121.getClass(), "first", null);
        setField(term45121, term45121.getClass(), "last", null);
        setField(term45121, term45121.getClass(), "propListHead", null);
        setIntField(term45121, term45121.getClass(), "sourcePosition", 0);
        setField(term45121, term45121.getClass(), "jsType", null);
        setField(term45121, term45121.getClass(), "parent", term45120);
        setField(term45120, term45120.getClass(), "first", term45121);
        setField(term45120, term45120.getClass(), "last", term45122);
        setField(term45120, term45120.getClass(), "propListHead", null);
        setIntField(term45120, term45120.getClass(), "sourcePosition", 0);
        setField(term45120, term45120.getClass(), "jsType", null);
        setField(term45120, term45120.getClass(), "parent", null);
        term45123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45123, term45123.getClass(), "type", 0);
        setIntField(term45124, term45124.getClass(), "type", 0);
        setField(term45124, term45124.getClass(), "next", null);
        setField(term45124, term45124.getClass(), "first", null);
        setField(term45124, term45124.getClass(), "last", null);
        setField(term45124, term45124.getClass(), "propListHead", null);
        setIntField(term45124, term45124.getClass(), "sourcePosition", 0);
        setField(term45124, term45124.getClass(), "jsType", null);
        setIntField(term45125, term45125.getClass(), "type", 0);
        setField(term45125, term45125.getClass(), "next", null);
        setField(term45125, term45125.getClass(), "first", term45123);
        setField(term45125, term45125.getClass(), "last", term45124);
        setField(term45125, term45125.getClass(), "propListHead", null);
        setIntField(term45125, term45125.getClass(), "sourcePosition", 0);
        setField(term45125, term45125.getClass(), "jsType", null);
        setField(term45125, term45125.getClass(), "parent", null);
        setField(term45124, term45124.getClass(), "parent", term45125);
        setField(term45123, term45123.getClass(), "next", term45124);
        setField(term45123, term45123.getClass(), "first", null);
        setField(term45123, term45123.getClass(), "last", null);
        setField(term45123, term45123.getClass(), "propListHead", null);
        setIntField(term45123, term45123.getClass(), "sourcePosition", 0);
        setField(term45123, term45123.getClass(), "jsType", null);
        setField(term45123, term45123.getClass(), "parent", term45125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44765;
        callMethod(klass, "addChildrenToFront", argTypes, term44695, args);
        assertTrue(recursiveEquals(term44695, term45120));
        assertTrue(recursiveEquals(term44765, term45123));
    }

};



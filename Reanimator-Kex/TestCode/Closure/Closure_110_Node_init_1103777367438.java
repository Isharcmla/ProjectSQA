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

public class Node_init_1103777367438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31031;
     Object term31208;
     Object term31210;

    public Node_init_1103777367438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31123, term31123.getClass(), "type", 0);
        setField(term31123, term31123.getClass(), "parent", null);
        setField(term31123, term31123.getClass(), "first", null);
        setField(term31123, term31123.getClass(), "last", null);
        term31031 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term31193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setElement(term31031, 0, term31193);
        term31208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31208, term31208.getClass(), "type", 0);
        setField(term31208, term31208.getClass(), "next", null);
        setIntField(term31209, term31209.getClass(), "type", 0);
        setField(term31209, term31209.getClass(), "next", null);
        setField(term31209, term31209.getClass(), "first", null);
        setField(term31209, term31209.getClass(), "last", null);
        setField(term31209, term31209.getClass(), "propListHead", null);
        setIntField(term31209, term31209.getClass(), "sourcePosition", 0);
        setField(term31209, term31209.getClass(), "jsType", null);
        setField(term31209, term31209.getClass(), "parent", term31208);
        setField(term31208, term31208.getClass(), "first", term31209);
        setField(term31208, term31208.getClass(), "last", term31209);
        setField(term31208, term31208.getClass(), "propListHead", null);
        setIntField(term31208, term31208.getClass(), "sourcePosition", 0);
        setField(term31208, term31208.getClass(), "jsType", null);
        setField(term31208, term31208.getClass(), "parent", null);
        term31210 = (Object[]) newArray("com.google.javascript.rhino.Node", 1);
        Object term31211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31211, term31211.getClass(), "type", 0);
        setField(term31211, term31211.getClass(), "next", null);
        setField(term31211, term31211.getClass(), "first", null);
        setField(term31211, term31211.getClass(), "last", null);
        setField(term31211, term31211.getClass(), "propListHead", null);
        setIntField(term31211, term31211.getClass(), "sourcePosition", 0);
        setField(term31211, term31211.getClass(), "jsType", null);
        setIntField(term31212, term31212.getClass(), "type", 0);
        setField(term31212, term31212.getClass(), "next", null);
        setField(term31212, term31212.getClass(), "first", term31211);
        setField(term31212, term31212.getClass(), "last", term31211);
        setField(term31212, term31212.getClass(), "propListHead", null);
        setIntField(term31212, term31212.getClass(), "sourcePosition", 0);
        setField(term31212, term31212.getClass(), "jsType", null);
        setField(term31212, term31212.getClass(), "parent", null);
        setField(term31211, term31211.getClass(), "parent", term31212);
        setElement(term31210, 0, term31211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term31031;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31208));
        assertTrue(recursiveEquals(term31031, term31210));
    }

};



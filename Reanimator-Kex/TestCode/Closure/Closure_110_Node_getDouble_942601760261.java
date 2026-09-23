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

public class Node_getDouble_942601760261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2195;

    public Node_getDouble_942601760261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2195, term2195.getClass(), "type", 2073858334);
        setIntField(term2197, term2197.getClass(), "type", -1693535639);
        setIntField(term2199, term2199.getClass(), "type", 1344744036);
        setIntField(term2201, term2201.getClass(), "type", -98060427);
        setIntField(term2203, term2203.getClass(), "type", -1272268399);
        setField(term2203, term2203.getClass(), "next", null);
        setField(term2203, term2203.getClass(), "first", null);
        setField(term2203, term2203.getClass(), "last", null);
        setField(term2203, term2203.getClass(), "propListHead", null);
        setIntField(term2203, term2203.getClass(), "sourcePosition", 0);
        setField(term2203, term2203.getClass(), "jsType", null);
        setField(term2203, term2203.getClass(), "parent", null);
        setField(term2201, term2201.getClass(), "next", term2203);
        setIntField(term2206, term2206.getClass(), "type", 1120271104);
        setField(term2206, term2206.getClass(), "next", null);
        setField(term2206, term2206.getClass(), "first", null);
        setField(term2206, term2206.getClass(), "last", term2203);
        setField(term2206, term2206.getClass(), "propListHead", null);
        setIntField(term2206, term2206.getClass(), "sourcePosition", 0);
        setField(term2206, term2206.getClass(), "jsType", null);
        setField(term2206, term2206.getClass(), "parent", null);
        setField(term2201, term2201.getClass(), "first", term2206);
        setField(term2201, term2201.getClass(), "last", term2199);
        setField(term2201, term2201.getClass(), "propListHead", null);
        setIntField(term2201, term2201.getClass(), "sourcePosition", 0);
        setField(term2201, term2201.getClass(), "jsType", null);
        setField(term2201, term2201.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "next", term2201);
        setField(term2199, term2199.getClass(), "first", term2203);
        setIntField(term2210, term2210.getClass(), "type", 2136158480);
        setIntField(term2212, term2212.getClass(), "type", 2118747457);
        setField(term2212, term2212.getClass(), "next", null);
        setField(term2212, term2212.getClass(), "first", term2206);
        setField(term2212, term2212.getClass(), "last", term2201);
        setField(term2212, term2212.getClass(), "propListHead", null);
        setIntField(term2212, term2212.getClass(), "sourcePosition", 0);
        setField(term2212, term2212.getClass(), "jsType", null);
        setField(term2212, term2212.getClass(), "parent", null);
        setField(term2210, term2210.getClass(), "next", term2212);
        setField(term2210, term2210.getClass(), "first", term2197);
        setField(term2210, term2210.getClass(), "last", term2197);
        setField(term2210, term2210.getClass(), "propListHead", null);
        setIntField(term2210, term2210.getClass(), "sourcePosition", 0);
        setField(term2210, term2210.getClass(), "jsType", null);
        setField(term2210, term2210.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "last", term2210);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2197, term2197.getClass(), "next", term2199);
        setIntField(term2217, term2217.getClass(), "type", 1868344256);
        setField(term2217, term2217.getClass(), "next", term2210);
        setField(term2217, term2217.getClass(), "first", term2212);
        setField(term2217, term2217.getClass(), "last", term2195);
        setField(term2217, term2217.getClass(), "propListHead", null);
        setIntField(term2217, term2217.getClass(), "sourcePosition", 0);
        setField(term2217, term2217.getClass(), "jsType", null);
        setField(term2217, term2217.getClass(), "parent", null);
        setField(term2197, term2197.getClass(), "first", term2217);
        setField(term2197, term2197.getClass(), "last", term2217);
        setField(term2197, term2197.getClass(), "propListHead", null);
        setIntField(term2197, term2197.getClass(), "sourcePosition", 0);
        setField(term2197, term2197.getClass(), "jsType", null);
        setField(term2197, term2197.getClass(), "parent", null);
        setField(term2195, term2195.getClass(), "next", term2197);
        setField(term2195, term2195.getClass(), "first", term2201);
        setField(term2195, term2195.getClass(), "last", term2203);
        setField(term2195, term2195.getClass(), "propListHead", null);
        setIntField(term2195, term2195.getClass(), "sourcePosition", 0);
        setField(term2195, term2195.getClass(), "jsType", null);
        setField(term2195, term2195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getDouble", argTypes, term2195, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



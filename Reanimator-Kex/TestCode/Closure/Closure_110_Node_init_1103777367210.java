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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_1103777367210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;

    public Node_init_1103777367210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Integer(1484323161);
        term7 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7, term7.getClass(), "type", 391863371);
        setIntField(term9, term9.getClass(), "type", -1922583790);
        setIntField(term11, term11.getClass(), "type", -616727354);
        setIntField(term13, term13.getClass(), "type", -1955890973);
        setIntField(term15, term15.getClass(), "type", -2038273078);
        setField(term15, term15.getClass(), "next", null);
        setField(term15, term15.getClass(), "first", null);
        setField(term15, term15.getClass(), "last", null);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term18, term18.getClass(), "type", 1227103734);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", term15);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term18);
        setField(term13, term13.getClass(), "last", term11);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term11, term11.getClass(), "next", term13);
        setField(term11, term11.getClass(), "first", term15);
        setIntField(term22, term22.getClass(), "type", 1725571209);
        setIntField(term24, term24.getClass(), "type", -522618178);
        setField(term24, term24.getClass(), "next", null);
        setField(term24, term24.getClass(), "first", term18);
        setField(term24, term24.getClass(), "last", term13);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term22, term22.getClass(), "next", term24);
        setField(term22, term22.getClass(), "first", term9);
        setField(term22, term22.getClass(), "last", term9);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        setField(term11, term11.getClass(), "last", term22);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term9, term9.getClass(), "next", term11);
        setIntField(term29, term29.getClass(), "type", 1134449235);
        setField(term29, term29.getClass(), "next", term22);
        setField(term29, term29.getClass(), "first", term24);
        setField(term29, term29.getClass(), "last", term7);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        setField(term9, term9.getClass(), "first", term29);
        setField(term9, term9.getClass(), "last", term29);
        setField(term9, term9.getClass(), "propListHead", null);
        setIntField(term9, term9.getClass(), "sourcePosition", 0);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term7, term7.getClass(), "next", term9);
        setField(term7, term7.getClass(), "first", term13);
        setField(term7, term7.getClass(), "last", term15);
        setField(term7, term7.getClass(), "propListHead", null);
        setIntField(term7, term7.getClass(), "sourcePosition", 0);
        setField(term7, term7.getClass(), "jsType", null);
        setField(term7, term7.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isExecutedExactlyOnce_780789923305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4339;

    public NodeUtil_isExecutedExactlyOnce_780789923305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4339, term4339.getClass(), "type", -1551790945);
        setIntField(term4341, term4341.getClass(), "type", 2039538484);
        setIntField(term4343, term4343.getClass(), "type", 1235736068);
        setIntField(term4345, term4345.getClass(), "type", 329424176);
        setIntField(term4347, term4347.getClass(), "type", -1897199214);
        setField(term4347, term4347.getClass(), "next", null);
        setField(term4347, term4347.getClass(), "first", null);
        setField(term4347, term4347.getClass(), "last", null);
        setField(term4347, term4347.getClass(), "propListHead", null);
        setIntField(term4347, term4347.getClass(), "sourcePosition", 0);
        setField(term4347, term4347.getClass(), "jsType", null);
        setField(term4347, term4347.getClass(), "parent", null);
        setField(term4345, term4345.getClass(), "next", term4347);
        setIntField(term4350, term4350.getClass(), "type", -1016478729);
        setField(term4350, term4350.getClass(), "next", null);
        setField(term4350, term4350.getClass(), "first", null);
        setField(term4350, term4350.getClass(), "last", term4347);
        setField(term4350, term4350.getClass(), "propListHead", null);
        setIntField(term4350, term4350.getClass(), "sourcePosition", 0);
        setField(term4350, term4350.getClass(), "jsType", null);
        setField(term4350, term4350.getClass(), "parent", null);
        setField(term4345, term4345.getClass(), "first", term4350);
        setField(term4345, term4345.getClass(), "last", term4343);
        setField(term4345, term4345.getClass(), "propListHead", null);
        setIntField(term4345, term4345.getClass(), "sourcePosition", 0);
        setField(term4345, term4345.getClass(), "jsType", null);
        setField(term4345, term4345.getClass(), "parent", null);
        setField(term4343, term4343.getClass(), "next", term4345);
        setField(term4343, term4343.getClass(), "first", term4347);
        setIntField(term4354, term4354.getClass(), "type", 638046409);
        setIntField(term4356, term4356.getClass(), "type", 427274898);
        setField(term4356, term4356.getClass(), "next", null);
        setField(term4356, term4356.getClass(), "first", term4350);
        setField(term4356, term4356.getClass(), "last", term4345);
        setField(term4356, term4356.getClass(), "propListHead", null);
        setIntField(term4356, term4356.getClass(), "sourcePosition", 0);
        setField(term4356, term4356.getClass(), "jsType", null);
        setField(term4356, term4356.getClass(), "parent", null);
        setField(term4354, term4354.getClass(), "next", term4356);
        setField(term4354, term4354.getClass(), "first", term4341);
        setField(term4354, term4354.getClass(), "last", term4341);
        setField(term4354, term4354.getClass(), "propListHead", null);
        setIntField(term4354, term4354.getClass(), "sourcePosition", 0);
        setField(term4354, term4354.getClass(), "jsType", null);
        setField(term4354, term4354.getClass(), "parent", null);
        setField(term4343, term4343.getClass(), "last", term4354);
        setField(term4343, term4343.getClass(), "propListHead", null);
        setIntField(term4343, term4343.getClass(), "sourcePosition", 0);
        setField(term4343, term4343.getClass(), "jsType", null);
        setField(term4343, term4343.getClass(), "parent", null);
        setField(term4341, term4341.getClass(), "next", term4343);
        setIntField(term4361, term4361.getClass(), "type", -1654552020);
        setField(term4361, term4361.getClass(), "next", term4354);
        setField(term4361, term4361.getClass(), "first", term4356);
        setField(term4361, term4361.getClass(), "last", term4339);
        setField(term4361, term4361.getClass(), "propListHead", null);
        setIntField(term4361, term4361.getClass(), "sourcePosition", 0);
        setField(term4361, term4361.getClass(), "jsType", null);
        setField(term4361, term4361.getClass(), "parent", null);
        setField(term4341, term4341.getClass(), "first", term4361);
        setField(term4341, term4341.getClass(), "last", term4361);
        setField(term4341, term4341.getClass(), "propListHead", null);
        setIntField(term4341, term4341.getClass(), "sourcePosition", 0);
        setField(term4341, term4341.getClass(), "jsType", null);
        setField(term4341, term4341.getClass(), "parent", null);
        setField(term4339, term4339.getClass(), "next", term4341);
        setField(term4339, term4339.getClass(), "first", term4345);
        setField(term4339, term4339.getClass(), "last", term4347);
        setField(term4339, term4339.getClass(), "propListHead", null);
        setIntField(term4339, term4339.getClass(), "sourcePosition", 0);
        setField(term4339, term4339.getClass(), "jsType", null);
        setField(term4339, term4339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4339;
        try {
            callMethod(klass, "isExecutedExactlyOnce", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



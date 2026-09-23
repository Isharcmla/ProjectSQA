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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getCatchBlock_1684668872297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4341;

    public NodeUtil_getCatchBlock_1684668872297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4341, term4341.getClass(), "type", 2039815750);
        setIntField(term4343, term4343.getClass(), "type", 2079590265);
        setIntField(term4345, term4345.getClass(), "type", -435079567);
        setIntField(term4347, term4347.getClass(), "type", -1017617829);
        setIntField(term4349, term4349.getClass(), "type", 270928865);
        setField(term4349, term4349.getClass(), "next", null);
        setField(term4349, term4349.getClass(), "first", null);
        setField(term4349, term4349.getClass(), "last", null);
        setField(term4349, term4349.getClass(), "propListHead", null);
        setIntField(term4349, term4349.getClass(), "sourcePosition", 0);
        setField(term4349, term4349.getClass(), "jsType", null);
        setField(term4349, term4349.getClass(), "parent", null);
        setField(term4347, term4347.getClass(), "next", term4349);
        setIntField(term4352, term4352.getClass(), "type", -308526089);
        setField(term4352, term4352.getClass(), "next", null);
        setField(term4352, term4352.getClass(), "first", null);
        setField(term4352, term4352.getClass(), "last", term4349);
        setField(term4352, term4352.getClass(), "propListHead", null);
        setIntField(term4352, term4352.getClass(), "sourcePosition", 0);
        setField(term4352, term4352.getClass(), "jsType", null);
        setField(term4352, term4352.getClass(), "parent", null);
        setField(term4347, term4347.getClass(), "first", term4352);
        setField(term4347, term4347.getClass(), "last", term4345);
        setField(term4347, term4347.getClass(), "propListHead", null);
        setIntField(term4347, term4347.getClass(), "sourcePosition", 0);
        setField(term4347, term4347.getClass(), "jsType", null);
        setField(term4347, term4347.getClass(), "parent", null);
        setField(term4345, term4345.getClass(), "next", term4347);
        setField(term4345, term4345.getClass(), "first", term4349);
        setIntField(term4356, term4356.getClass(), "type", -1671982964);
        setIntField(term4358, term4358.getClass(), "type", 776218451);
        setField(term4358, term4358.getClass(), "next", null);
        setField(term4358, term4358.getClass(), "first", term4352);
        setField(term4358, term4358.getClass(), "last", term4347);
        setField(term4358, term4358.getClass(), "propListHead", null);
        setIntField(term4358, term4358.getClass(), "sourcePosition", 0);
        setField(term4358, term4358.getClass(), "jsType", null);
        setField(term4358, term4358.getClass(), "parent", null);
        setField(term4356, term4356.getClass(), "next", term4358);
        setField(term4356, term4356.getClass(), "first", term4343);
        setField(term4356, term4356.getClass(), "last", term4343);
        setField(term4356, term4356.getClass(), "propListHead", null);
        setIntField(term4356, term4356.getClass(), "sourcePosition", 0);
        setField(term4356, term4356.getClass(), "jsType", null);
        setField(term4356, term4356.getClass(), "parent", null);
        setField(term4345, term4345.getClass(), "last", term4356);
        setField(term4345, term4345.getClass(), "propListHead", null);
        setIntField(term4345, term4345.getClass(), "sourcePosition", 0);
        setField(term4345, term4345.getClass(), "jsType", null);
        setField(term4345, term4345.getClass(), "parent", null);
        setField(term4343, term4343.getClass(), "next", term4345);
        setIntField(term4363, term4363.getClass(), "type", -1362132929);
        setField(term4363, term4363.getClass(), "next", term4356);
        setField(term4363, term4363.getClass(), "first", term4358);
        setField(term4363, term4363.getClass(), "last", term4341);
        setField(term4363, term4363.getClass(), "propListHead", null);
        setIntField(term4363, term4363.getClass(), "sourcePosition", 0);
        setField(term4363, term4363.getClass(), "jsType", null);
        setField(term4363, term4363.getClass(), "parent", null);
        setField(term4343, term4343.getClass(), "first", term4363);
        setField(term4343, term4343.getClass(), "last", term4363);
        setField(term4343, term4343.getClass(), "propListHead", null);
        setIntField(term4343, term4343.getClass(), "sourcePosition", 0);
        setField(term4343, term4343.getClass(), "jsType", null);
        setField(term4343, term4343.getClass(), "parent", null);
        setField(term4341, term4341.getClass(), "next", term4343);
        setField(term4341, term4341.getClass(), "first", term4347);
        setField(term4341, term4341.getClass(), "last", term4349);
        setField(term4341, term4341.getClass(), "propListHead", null);
        setIntField(term4341, term4341.getClass(), "sourcePosition", 0);
        setField(term4341, term4341.getClass(), "jsType", null);
        setField(term4341, term4341.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4341;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



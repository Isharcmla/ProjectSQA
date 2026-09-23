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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_getNumberValue_42027968161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;
     Object term4435;

    public NodeUtil_getNumberValue_42027968161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108, term108.getClass(), "type", 2055867847);
        setIntField(term110, term110.getClass(), "type", -184153539);
        setIntField(term112, term112.getClass(), "type", 0);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", null);
        setField(term112, term112.getClass(), "last", null);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term110, term110.getClass(), "next", term112);
        setIntField(term115, term115.getClass(), "type", 0);
        setField(term115, term115.getClass(), "next", null);
        setField(term115, term115.getClass(), "first", null);
        setField(term115, term115.getClass(), "last", null);
        setField(term115, term115.getClass(), "propListHead", null);
        setIntField(term115, term115.getClass(), "sourcePosition", 0);
        setField(term115, term115.getClass(), "jsType", null);
        setField(term115, term115.getClass(), "parent", null);
        setField(term110, term110.getClass(), "first", term115);
        setIntField(term118, term118.getClass(), "type", 0);
        setField(term118, term118.getClass(), "next", null);
        setField(term118, term118.getClass(), "first", null);
        setField(term118, term118.getClass(), "last", null);
        setField(term118, term118.getClass(), "propListHead", null);
        setIntField(term118, term118.getClass(), "sourcePosition", 0);
        setField(term118, term118.getClass(), "jsType", null);
        setField(term118, term118.getClass(), "parent", null);
        setField(term110, term110.getClass(), "last", term118);
        setField(term110, term110.getClass(), "propListHead", null);
        setIntField(term110, term110.getClass(), "sourcePosition", 0);
        setField(term110, term110.getClass(), "jsType", null);
        setField(term110, term110.getClass(), "parent", null);
        setField(term108, term108.getClass(), "next", term110);
        setIntField(term122, term122.getClass(), "type", 0);
        setField(term122, term122.getClass(), "next", null);
        setField(term122, term122.getClass(), "first", null);
        setField(term122, term122.getClass(), "last", null);
        setField(term122, term122.getClass(), "propListHead", null);
        setIntField(term122, term122.getClass(), "sourcePosition", 0);
        setField(term122, term122.getClass(), "jsType", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term108, term108.getClass(), "first", term122);
        setIntField(term125, term125.getClass(), "type", 0);
        setField(term125, term125.getClass(), "next", null);
        setField(term125, term125.getClass(), "first", null);
        setField(term125, term125.getClass(), "last", null);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term108, term108.getClass(), "last", term125);
        setField(term108, term108.getClass(), "propListHead", null);
        setIntField(term108, term108.getClass(), "sourcePosition", 0);
        setField(term108, term108.getClass(), "jsType", null);
        setField(term108, term108.getClass(), "parent", null);
        term4435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4435, term4435.getClass(), "type", 2055867847);
        setIntField(term4436, term4436.getClass(), "type", -184153539);
        setIntField(term4437, term4437.getClass(), "type", 0);
        setField(term4437, term4437.getClass(), "next", null);
        setField(term4437, term4437.getClass(), "first", null);
        setField(term4437, term4437.getClass(), "last", null);
        setField(term4437, term4437.getClass(), "propListHead", null);
        setIntField(term4437, term4437.getClass(), "sourcePosition", 0);
        setField(term4437, term4437.getClass(), "jsType", null);
        setField(term4437, term4437.getClass(), "parent", null);
        setField(term4436, term4436.getClass(), "next", term4437);
        setIntField(term4438, term4438.getClass(), "type", 0);
        setField(term4438, term4438.getClass(), "next", null);
        setField(term4438, term4438.getClass(), "first", null);
        setField(term4438, term4438.getClass(), "last", null);
        setField(term4438, term4438.getClass(), "propListHead", null);
        setIntField(term4438, term4438.getClass(), "sourcePosition", 0);
        setField(term4438, term4438.getClass(), "jsType", null);
        setField(term4438, term4438.getClass(), "parent", null);
        setField(term4436, term4436.getClass(), "first", term4438);
        setIntField(term4439, term4439.getClass(), "type", 0);
        setField(term4439, term4439.getClass(), "next", null);
        setField(term4439, term4439.getClass(), "first", null);
        setField(term4439, term4439.getClass(), "last", null);
        setField(term4439, term4439.getClass(), "propListHead", null);
        setIntField(term4439, term4439.getClass(), "sourcePosition", 0);
        setField(term4439, term4439.getClass(), "jsType", null);
        setField(term4439, term4439.getClass(), "parent", null);
        setField(term4436, term4436.getClass(), "last", term4439);
        setField(term4436, term4436.getClass(), "propListHead", null);
        setIntField(term4436, term4436.getClass(), "sourcePosition", 0);
        setField(term4436, term4436.getClass(), "jsType", null);
        setField(term4436, term4436.getClass(), "parent", null);
        setField(term4435, term4435.getClass(), "next", term4436);
        setIntField(term4440, term4440.getClass(), "type", 0);
        setField(term4440, term4440.getClass(), "next", null);
        setField(term4440, term4440.getClass(), "first", null);
        setField(term4440, term4440.getClass(), "last", null);
        setField(term4440, term4440.getClass(), "propListHead", null);
        setIntField(term4440, term4440.getClass(), "sourcePosition", 0);
        setField(term4440, term4440.getClass(), "jsType", null);
        setField(term4440, term4440.getClass(), "parent", null);
        setField(term4435, term4435.getClass(), "first", term4440);
        setIntField(term4441, term4441.getClass(), "type", 0);
        setField(term4441, term4441.getClass(), "next", null);
        setField(term4441, term4441.getClass(), "first", null);
        setField(term4441, term4441.getClass(), "last", null);
        setField(term4441, term4441.getClass(), "propListHead", null);
        setIntField(term4441, term4441.getClass(), "sourcePosition", 0);
        setField(term4441, term4441.getClass(), "jsType", null);
        setField(term4441, term4441.getClass(), "parent", null);
        setField(term4435, term4435.getClass(), "last", term4441);
        setField(term4435, term4435.getClass(), "propListHead", null);
        setIntField(term4435, term4435.getClass(), "sourcePosition", 0);
        setField(term4435, term4435.getClass(), "jsType", null);
        setField(term4435, term4435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term108;
        Object retValue = callMethod(klass, "getNumberValue", argTypes, null, args);
        assertTrue(recursiveEquals(term108, term4435));
        assertTrue(recursiveEquals(retValue, null));
    }

};



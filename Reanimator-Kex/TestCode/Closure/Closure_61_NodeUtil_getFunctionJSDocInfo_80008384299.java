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
import java.lang.Object;

public class NodeUtil_getFunctionJSDocInfo_80008384299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3409;

    public NodeUtil_getFunctionJSDocInfo_80008384299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3409, term3409.getClass(), "type", 1854694585);
        setIntField(term3411, term3411.getClass(), "type", 212698793);
        setIntField(term3413, term3413.getClass(), "type", 0);
        setField(term3413, term3413.getClass(), "next", null);
        setField(term3413, term3413.getClass(), "first", null);
        setField(term3413, term3413.getClass(), "last", null);
        setField(term3413, term3413.getClass(), "propListHead", null);
        setIntField(term3413, term3413.getClass(), "sourcePosition", 0);
        setField(term3413, term3413.getClass(), "jsType", null);
        setField(term3413, term3413.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "next", term3413);
        setIntField(term3416, term3416.getClass(), "type", 0);
        setField(term3416, term3416.getClass(), "next", null);
        setField(term3416, term3416.getClass(), "first", null);
        setField(term3416, term3416.getClass(), "last", null);
        setField(term3416, term3416.getClass(), "propListHead", null);
        setIntField(term3416, term3416.getClass(), "sourcePosition", 0);
        setField(term3416, term3416.getClass(), "jsType", null);
        setField(term3416, term3416.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "first", term3416);
        setIntField(term3419, term3419.getClass(), "type", 0);
        setField(term3419, term3419.getClass(), "next", null);
        setField(term3419, term3419.getClass(), "first", null);
        setField(term3419, term3419.getClass(), "last", null);
        setField(term3419, term3419.getClass(), "propListHead", null);
        setIntField(term3419, term3419.getClass(), "sourcePosition", 0);
        setField(term3419, term3419.getClass(), "jsType", null);
        setField(term3419, term3419.getClass(), "parent", null);
        setField(term3411, term3411.getClass(), "last", term3419);
        setField(term3411, term3411.getClass(), "propListHead", null);
        setIntField(term3411, term3411.getClass(), "sourcePosition", 0);
        setField(term3411, term3411.getClass(), "jsType", null);
        setField(term3411, term3411.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "next", term3411);
        setIntField(term3423, term3423.getClass(), "type", 0);
        setField(term3423, term3423.getClass(), "next", null);
        setField(term3423, term3423.getClass(), "first", null);
        setField(term3423, term3423.getClass(), "last", null);
        setField(term3423, term3423.getClass(), "propListHead", null);
        setIntField(term3423, term3423.getClass(), "sourcePosition", 0);
        setField(term3423, term3423.getClass(), "jsType", null);
        setField(term3423, term3423.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "first", term3423);
        setIntField(term3426, term3426.getClass(), "type", 0);
        setField(term3426, term3426.getClass(), "next", null);
        setField(term3426, term3426.getClass(), "first", null);
        setField(term3426, term3426.getClass(), "last", null);
        setField(term3426, term3426.getClass(), "propListHead", null);
        setIntField(term3426, term3426.getClass(), "sourcePosition", 0);
        setField(term3426, term3426.getClass(), "jsType", null);
        setField(term3426, term3426.getClass(), "parent", null);
        setField(term3409, term3409.getClass(), "last", term3426);
        setField(term3409, term3409.getClass(), "propListHead", null);
        setIntField(term3409, term3409.getClass(), "sourcePosition", 0);
        setField(term3409, term3409.getClass(), "jsType", null);
        setField(term3409, term3409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3409;
        try {
            callMethod(klass, "getFunctionJSDocInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



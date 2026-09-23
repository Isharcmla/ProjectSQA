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

public class NodeUtil_getCatchBlock_1684668872293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3262;

    public NodeUtil_getCatchBlock_1684668872293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3262, term3262.getClass(), "type", -165487736);
        setIntField(term3264, term3264.getClass(), "type", 703799187);
        setIntField(term3266, term3266.getClass(), "type", 0);
        setField(term3266, term3266.getClass(), "next", null);
        setField(term3266, term3266.getClass(), "first", null);
        setField(term3266, term3266.getClass(), "last", null);
        setField(term3266, term3266.getClass(), "propListHead", null);
        setIntField(term3266, term3266.getClass(), "sourcePosition", 0);
        setField(term3266, term3266.getClass(), "jsType", null);
        setField(term3266, term3266.getClass(), "parent", null);
        setField(term3264, term3264.getClass(), "next", term3266);
        setIntField(term3269, term3269.getClass(), "type", 0);
        setField(term3269, term3269.getClass(), "next", null);
        setField(term3269, term3269.getClass(), "first", null);
        setField(term3269, term3269.getClass(), "last", null);
        setField(term3269, term3269.getClass(), "propListHead", null);
        setIntField(term3269, term3269.getClass(), "sourcePosition", 0);
        setField(term3269, term3269.getClass(), "jsType", null);
        setField(term3269, term3269.getClass(), "parent", null);
        setField(term3264, term3264.getClass(), "first", term3269);
        setIntField(term3272, term3272.getClass(), "type", 0);
        setField(term3272, term3272.getClass(), "next", null);
        setField(term3272, term3272.getClass(), "first", null);
        setField(term3272, term3272.getClass(), "last", null);
        setField(term3272, term3272.getClass(), "propListHead", null);
        setIntField(term3272, term3272.getClass(), "sourcePosition", 0);
        setField(term3272, term3272.getClass(), "jsType", null);
        setField(term3272, term3272.getClass(), "parent", null);
        setField(term3264, term3264.getClass(), "last", term3272);
        setField(term3264, term3264.getClass(), "propListHead", null);
        setIntField(term3264, term3264.getClass(), "sourcePosition", 0);
        setField(term3264, term3264.getClass(), "jsType", null);
        setField(term3264, term3264.getClass(), "parent", null);
        setField(term3262, term3262.getClass(), "next", term3264);
        setIntField(term3276, term3276.getClass(), "type", 0);
        setField(term3276, term3276.getClass(), "next", null);
        setField(term3276, term3276.getClass(), "first", null);
        setField(term3276, term3276.getClass(), "last", null);
        setField(term3276, term3276.getClass(), "propListHead", null);
        setIntField(term3276, term3276.getClass(), "sourcePosition", 0);
        setField(term3276, term3276.getClass(), "jsType", null);
        setField(term3276, term3276.getClass(), "parent", null);
        setField(term3262, term3262.getClass(), "first", term3276);
        setIntField(term3279, term3279.getClass(), "type", 0);
        setField(term3279, term3279.getClass(), "next", null);
        setField(term3279, term3279.getClass(), "first", null);
        setField(term3279, term3279.getClass(), "last", null);
        setField(term3279, term3279.getClass(), "propListHead", null);
        setIntField(term3279, term3279.getClass(), "sourcePosition", 0);
        setField(term3279, term3279.getClass(), "jsType", null);
        setField(term3279, term3279.getClass(), "parent", null);
        setField(term3262, term3262.getClass(), "last", term3279);
        setField(term3262, term3262.getClass(), "propListHead", null);
        setIntField(term3262, term3262.getClass(), "sourcePosition", 0);
        setField(term3262, term3262.getClass(), "jsType", null);
        setField(term3262, term3262.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3262;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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

public class NodeUtil_hasCatchHandler_1686917870298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4368;

    public NodeUtil_hasCatchHandler_1686917870298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4368, term4368.getClass(), "type", 1267740164);
        setIntField(term4370, term4370.getClass(), "type", 1363887997);
        setIntField(term4372, term4372.getClass(), "type", -1744763945);
        setIntField(term4374, term4374.getClass(), "type", 852281447);
        setIntField(term4376, term4376.getClass(), "type", 1248430530);
        setField(term4376, term4376.getClass(), "next", null);
        setField(term4376, term4376.getClass(), "first", null);
        setField(term4376, term4376.getClass(), "last", null);
        setField(term4376, term4376.getClass(), "propListHead", null);
        setIntField(term4376, term4376.getClass(), "sourcePosition", 0);
        setField(term4376, term4376.getClass(), "jsType", null);
        setField(term4376, term4376.getClass(), "parent", null);
        setField(term4374, term4374.getClass(), "next", term4376);
        setIntField(term4379, term4379.getClass(), "type", -1911828505);
        setField(term4379, term4379.getClass(), "next", null);
        setField(term4379, term4379.getClass(), "first", null);
        setField(term4379, term4379.getClass(), "last", term4376);
        setField(term4379, term4379.getClass(), "propListHead", null);
        setIntField(term4379, term4379.getClass(), "sourcePosition", 0);
        setField(term4379, term4379.getClass(), "jsType", null);
        setField(term4379, term4379.getClass(), "parent", null);
        setField(term4374, term4374.getClass(), "first", term4379);
        setField(term4374, term4374.getClass(), "last", term4372);
        setField(term4374, term4374.getClass(), "propListHead", null);
        setIntField(term4374, term4374.getClass(), "sourcePosition", 0);
        setField(term4374, term4374.getClass(), "jsType", null);
        setField(term4374, term4374.getClass(), "parent", null);
        setField(term4372, term4372.getClass(), "next", term4374);
        setField(term4372, term4372.getClass(), "first", term4376);
        setIntField(term4383, term4383.getClass(), "type", 823179298);
        setIntField(term4385, term4385.getClass(), "type", 1174484848);
        setField(term4385, term4385.getClass(), "next", null);
        setField(term4385, term4385.getClass(), "first", term4379);
        setField(term4385, term4385.getClass(), "last", term4374);
        setField(term4385, term4385.getClass(), "propListHead", null);
        setIntField(term4385, term4385.getClass(), "sourcePosition", 0);
        setField(term4385, term4385.getClass(), "jsType", null);
        setField(term4385, term4385.getClass(), "parent", null);
        setField(term4383, term4383.getClass(), "next", term4385);
        setField(term4383, term4383.getClass(), "first", term4370);
        setField(term4383, term4383.getClass(), "last", term4370);
        setField(term4383, term4383.getClass(), "propListHead", null);
        setIntField(term4383, term4383.getClass(), "sourcePosition", 0);
        setField(term4383, term4383.getClass(), "jsType", null);
        setField(term4383, term4383.getClass(), "parent", null);
        setField(term4372, term4372.getClass(), "last", term4383);
        setField(term4372, term4372.getClass(), "propListHead", null);
        setIntField(term4372, term4372.getClass(), "sourcePosition", 0);
        setField(term4372, term4372.getClass(), "jsType", null);
        setField(term4372, term4372.getClass(), "parent", null);
        setField(term4370, term4370.getClass(), "next", term4372);
        setIntField(term4390, term4390.getClass(), "type", 939889496);
        setField(term4390, term4390.getClass(), "next", term4383);
        setField(term4390, term4390.getClass(), "first", term4385);
        setField(term4390, term4390.getClass(), "last", term4368);
        setField(term4390, term4390.getClass(), "propListHead", null);
        setIntField(term4390, term4390.getClass(), "sourcePosition", 0);
        setField(term4390, term4390.getClass(), "jsType", null);
        setField(term4390, term4390.getClass(), "parent", null);
        setField(term4370, term4370.getClass(), "first", term4390);
        setField(term4370, term4370.getClass(), "last", term4390);
        setField(term4370, term4370.getClass(), "propListHead", null);
        setIntField(term4370, term4370.getClass(), "sourcePosition", 0);
        setField(term4370, term4370.getClass(), "jsType", null);
        setField(term4370, term4370.getClass(), "parent", null);
        setField(term4368, term4368.getClass(), "next", term4370);
        setField(term4368, term4368.getClass(), "first", term4374);
        setField(term4368, term4368.getClass(), "last", term4376);
        setField(term4368, term4368.getClass(), "propListHead", null);
        setIntField(term4368, term4368.getClass(), "sourcePosition", 0);
        setField(term4368, term4368.getClass(), "jsType", null);
        setField(term4368, term4368.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4368;
        try {
            callMethod(klass, "hasCatchHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



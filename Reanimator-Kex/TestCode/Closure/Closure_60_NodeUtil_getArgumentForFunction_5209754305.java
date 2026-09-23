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
import java.lang.Integer;

public class NodeUtil_getArgumentForFunction_5209754305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3538;
     Object term3559;

    public NodeUtil_getArgumentForFunction_5209754305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3538, term3538.getClass(), "type", 694989162);
        setIntField(term3540, term3540.getClass(), "type", -288126597);
        setIntField(term3542, term3542.getClass(), "type", 0);
        setField(term3542, term3542.getClass(), "next", null);
        setField(term3542, term3542.getClass(), "first", null);
        setField(term3542, term3542.getClass(), "last", null);
        setField(term3542, term3542.getClass(), "propListHead", null);
        setIntField(term3542, term3542.getClass(), "sourcePosition", 0);
        setField(term3542, term3542.getClass(), "jsType", null);
        setField(term3542, term3542.getClass(), "parent", null);
        setField(term3540, term3540.getClass(), "next", term3542);
        setIntField(term3545, term3545.getClass(), "type", 0);
        setField(term3545, term3545.getClass(), "next", null);
        setField(term3545, term3545.getClass(), "first", null);
        setField(term3545, term3545.getClass(), "last", null);
        setField(term3545, term3545.getClass(), "propListHead", null);
        setIntField(term3545, term3545.getClass(), "sourcePosition", 0);
        setField(term3545, term3545.getClass(), "jsType", null);
        setField(term3545, term3545.getClass(), "parent", null);
        setField(term3540, term3540.getClass(), "first", term3545);
        setIntField(term3548, term3548.getClass(), "type", 0);
        setField(term3548, term3548.getClass(), "next", null);
        setField(term3548, term3548.getClass(), "first", null);
        setField(term3548, term3548.getClass(), "last", null);
        setField(term3548, term3548.getClass(), "propListHead", null);
        setIntField(term3548, term3548.getClass(), "sourcePosition", 0);
        setField(term3548, term3548.getClass(), "jsType", null);
        setField(term3548, term3548.getClass(), "parent", null);
        setField(term3540, term3540.getClass(), "last", term3548);
        setField(term3540, term3540.getClass(), "propListHead", null);
        setIntField(term3540, term3540.getClass(), "sourcePosition", 0);
        setField(term3540, term3540.getClass(), "jsType", null);
        setField(term3540, term3540.getClass(), "parent", null);
        setField(term3538, term3538.getClass(), "next", term3540);
        setIntField(term3552, term3552.getClass(), "type", 0);
        setField(term3552, term3552.getClass(), "next", null);
        setField(term3552, term3552.getClass(), "first", null);
        setField(term3552, term3552.getClass(), "last", null);
        setField(term3552, term3552.getClass(), "propListHead", null);
        setIntField(term3552, term3552.getClass(), "sourcePosition", 0);
        setField(term3552, term3552.getClass(), "jsType", null);
        setField(term3552, term3552.getClass(), "parent", null);
        setField(term3538, term3538.getClass(), "first", term3552);
        setIntField(term3555, term3555.getClass(), "type", 0);
        setField(term3555, term3555.getClass(), "next", null);
        setField(term3555, term3555.getClass(), "first", null);
        setField(term3555, term3555.getClass(), "last", null);
        setField(term3555, term3555.getClass(), "propListHead", null);
        setIntField(term3555, term3555.getClass(), "sourcePosition", 0);
        setField(term3555, term3555.getClass(), "jsType", null);
        setField(term3555, term3555.getClass(), "parent", null);
        setField(term3538, term3538.getClass(), "last", term3555);
        setField(term3538, term3538.getClass(), "propListHead", null);
        setIntField(term3538, term3538.getClass(), "sourcePosition", 0);
        setField(term3538, term3538.getClass(), "jsType", null);
        setField(term3538, term3538.getClass(), "parent", null);
        term3559 = new Integer(1358117317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3538;
        args[1] = term3559;
        try {
            callMethod(klass, "getArgumentForFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



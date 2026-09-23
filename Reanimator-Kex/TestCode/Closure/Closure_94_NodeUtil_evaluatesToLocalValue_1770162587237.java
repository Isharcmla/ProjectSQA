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

public class NodeUtil_evaluatesToLocalValue_1770162587237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3599;

    public NodeUtil_evaluatesToLocalValue_1770162587237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3599, term3599.getClass(), "type", 1084102599);
        setIntField(term3601, term3601.getClass(), "type", 2039538484);
        setIntField(term3603, term3603.getClass(), "type", 0);
        setField(term3603, term3603.getClass(), "next", null);
        setField(term3603, term3603.getClass(), "first", null);
        setField(term3603, term3603.getClass(), "last", null);
        setField(term3603, term3603.getClass(), "propListHead", null);
        setIntField(term3603, term3603.getClass(), "sourcePosition", 0);
        setField(term3603, term3603.getClass(), "jsType", null);
        setField(term3603, term3603.getClass(), "parent", null);
        setField(term3601, term3601.getClass(), "next", term3603);
        setIntField(term3606, term3606.getClass(), "type", 0);
        setField(term3606, term3606.getClass(), "next", null);
        setField(term3606, term3606.getClass(), "first", null);
        setField(term3606, term3606.getClass(), "last", null);
        setField(term3606, term3606.getClass(), "propListHead", null);
        setIntField(term3606, term3606.getClass(), "sourcePosition", 0);
        setField(term3606, term3606.getClass(), "jsType", null);
        setField(term3606, term3606.getClass(), "parent", null);
        setField(term3601, term3601.getClass(), "first", term3606);
        setIntField(term3609, term3609.getClass(), "type", 0);
        setField(term3609, term3609.getClass(), "next", null);
        setField(term3609, term3609.getClass(), "first", null);
        setField(term3609, term3609.getClass(), "last", null);
        setField(term3609, term3609.getClass(), "propListHead", null);
        setIntField(term3609, term3609.getClass(), "sourcePosition", 0);
        setField(term3609, term3609.getClass(), "jsType", null);
        setField(term3609, term3609.getClass(), "parent", null);
        setField(term3601, term3601.getClass(), "last", term3609);
        setField(term3612, term3612.getClass(), "next", null);
        setIntField(term3612, term3612.getClass(), "type", 0);
        setIntField(term3612, term3612.getClass(), "intValue", 0);
        setField(term3612, term3612.getClass(), "objectValue", null);
        setField(term3601, term3601.getClass(), "propListHead", term3612);
        setIntField(term3601, term3601.getClass(), "sourcePosition", -1897199214);
        setField(term3601, term3601.getClass(), "jsType", null);
        setField(term3601, term3601.getClass(), "parent", null);
        setField(term3599, term3599.getClass(), "next", term3601);
        setIntField(term3616, term3616.getClass(), "type", 0);
        setField(term3616, term3616.getClass(), "next", null);
        setField(term3616, term3616.getClass(), "first", null);
        setField(term3616, term3616.getClass(), "last", null);
        setField(term3616, term3616.getClass(), "propListHead", null);
        setIntField(term3616, term3616.getClass(), "sourcePosition", 0);
        setField(term3616, term3616.getClass(), "jsType", null);
        setField(term3616, term3616.getClass(), "parent", null);
        setField(term3599, term3599.getClass(), "first", term3616);
        setIntField(term3619, term3619.getClass(), "type", 0);
        setField(term3619, term3619.getClass(), "next", null);
        setField(term3619, term3619.getClass(), "first", null);
        setField(term3619, term3619.getClass(), "last", null);
        setField(term3619, term3619.getClass(), "propListHead", null);
        setIntField(term3619, term3619.getClass(), "sourcePosition", 0);
        setField(term3619, term3619.getClass(), "jsType", null);
        setField(term3619, term3619.getClass(), "parent", null);
        setField(term3599, term3599.getClass(), "last", term3619);
        setField(term3622, term3622.getClass(), "next", null);
        setIntField(term3622, term3622.getClass(), "type", 0);
        setIntField(term3622, term3622.getClass(), "intValue", 0);
        setField(term3622, term3622.getClass(), "objectValue", null);
        setField(term3599, term3599.getClass(), "propListHead", term3622);
        setIntField(term3599, term3599.getClass(), "sourcePosition", -1016478729);
        setField(term3599, term3599.getClass(), "jsType", null);
        setField(term3599, term3599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term3599;
        args[1] = null;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



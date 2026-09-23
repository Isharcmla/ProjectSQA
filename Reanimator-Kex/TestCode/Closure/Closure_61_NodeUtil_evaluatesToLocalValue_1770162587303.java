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

public class NodeUtil_evaluatesToLocalValue_1770162587303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3494;

    public NodeUtil_evaluatesToLocalValue_1770162587303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3494, term3494.getClass(), "type", 155423433);
        setIntField(term3496, term3496.getClass(), "type", -945759470);
        setIntField(term3498, term3498.getClass(), "type", 0);
        setField(term3498, term3498.getClass(), "next", null);
        setField(term3498, term3498.getClass(), "first", null);
        setField(term3498, term3498.getClass(), "last", null);
        setField(term3498, term3498.getClass(), "propListHead", null);
        setIntField(term3498, term3498.getClass(), "sourcePosition", 0);
        setField(term3498, term3498.getClass(), "jsType", null);
        setField(term3498, term3498.getClass(), "parent", null);
        setField(term3496, term3496.getClass(), "next", term3498);
        setIntField(term3501, term3501.getClass(), "type", 0);
        setField(term3501, term3501.getClass(), "next", null);
        setField(term3501, term3501.getClass(), "first", null);
        setField(term3501, term3501.getClass(), "last", null);
        setField(term3501, term3501.getClass(), "propListHead", null);
        setIntField(term3501, term3501.getClass(), "sourcePosition", 0);
        setField(term3501, term3501.getClass(), "jsType", null);
        setField(term3501, term3501.getClass(), "parent", null);
        setField(term3496, term3496.getClass(), "first", term3501);
        setIntField(term3504, term3504.getClass(), "type", 0);
        setField(term3504, term3504.getClass(), "next", null);
        setField(term3504, term3504.getClass(), "first", null);
        setField(term3504, term3504.getClass(), "last", null);
        setField(term3504, term3504.getClass(), "propListHead", null);
        setIntField(term3504, term3504.getClass(), "sourcePosition", 0);
        setField(term3504, term3504.getClass(), "jsType", null);
        setField(term3504, term3504.getClass(), "parent", null);
        setField(term3496, term3496.getClass(), "last", term3504);
        setField(term3496, term3496.getClass(), "propListHead", null);
        setIntField(term3496, term3496.getClass(), "sourcePosition", 0);
        setField(term3496, term3496.getClass(), "jsType", null);
        setField(term3496, term3496.getClass(), "parent", null);
        setField(term3494, term3494.getClass(), "next", term3496);
        setIntField(term3508, term3508.getClass(), "type", 0);
        setField(term3508, term3508.getClass(), "next", null);
        setField(term3508, term3508.getClass(), "first", null);
        setField(term3508, term3508.getClass(), "last", null);
        setField(term3508, term3508.getClass(), "propListHead", null);
        setIntField(term3508, term3508.getClass(), "sourcePosition", 0);
        setField(term3508, term3508.getClass(), "jsType", null);
        setField(term3508, term3508.getClass(), "parent", null);
        setField(term3494, term3494.getClass(), "first", term3508);
        setIntField(term3511, term3511.getClass(), "type", 0);
        setField(term3511, term3511.getClass(), "next", null);
        setField(term3511, term3511.getClass(), "first", null);
        setField(term3511, term3511.getClass(), "last", null);
        setField(term3511, term3511.getClass(), "propListHead", null);
        setIntField(term3511, term3511.getClass(), "sourcePosition", 0);
        setField(term3511, term3511.getClass(), "jsType", null);
        setField(term3511, term3511.getClass(), "parent", null);
        setField(term3494, term3494.getClass(), "last", term3511);
        setField(term3494, term3494.getClass(), "propListHead", null);
        setIntField(term3494, term3494.getClass(), "sourcePosition", 0);
        setField(term3494, term3494.getClass(), "jsType", null);
        setField(term3494, term3494.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term3494;
        args[1] = null;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



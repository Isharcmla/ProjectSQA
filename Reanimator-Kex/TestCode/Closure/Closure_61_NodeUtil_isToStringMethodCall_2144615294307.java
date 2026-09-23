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

public class NodeUtil_isToStringMethodCall_2144615294307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3584;
     Object term25652;

    public NodeUtil_isToStringMethodCall_2144615294307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3584, term3584.getClass(), "type", 954234820);
        setIntField(term3586, term3586.getClass(), "type", -1854929057);
        setIntField(term3588, term3588.getClass(), "type", 0);
        setField(term3588, term3588.getClass(), "next", null);
        setField(term3588, term3588.getClass(), "first", null);
        setField(term3588, term3588.getClass(), "last", null);
        setField(term3588, term3588.getClass(), "propListHead", null);
        setIntField(term3588, term3588.getClass(), "sourcePosition", 0);
        setField(term3588, term3588.getClass(), "jsType", null);
        setField(term3588, term3588.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "next", term3588);
        setIntField(term3591, term3591.getClass(), "type", 0);
        setField(term3591, term3591.getClass(), "next", null);
        setField(term3591, term3591.getClass(), "first", null);
        setField(term3591, term3591.getClass(), "last", null);
        setField(term3591, term3591.getClass(), "propListHead", null);
        setIntField(term3591, term3591.getClass(), "sourcePosition", 0);
        setField(term3591, term3591.getClass(), "jsType", null);
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "first", term3591);
        setIntField(term3594, term3594.getClass(), "type", 0);
        setField(term3594, term3594.getClass(), "next", null);
        setField(term3594, term3594.getClass(), "first", null);
        setField(term3594, term3594.getClass(), "last", null);
        setField(term3594, term3594.getClass(), "propListHead", null);
        setIntField(term3594, term3594.getClass(), "sourcePosition", 0);
        setField(term3594, term3594.getClass(), "jsType", null);
        setField(term3594, term3594.getClass(), "parent", null);
        setField(term3586, term3586.getClass(), "last", term3594);
        setField(term3586, term3586.getClass(), "propListHead", null);
        setIntField(term3586, term3586.getClass(), "sourcePosition", 0);
        setField(term3586, term3586.getClass(), "jsType", null);
        setField(term3586, term3586.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "next", term3586);
        setIntField(term3598, term3598.getClass(), "type", 0);
        setField(term3598, term3598.getClass(), "next", null);
        setField(term3598, term3598.getClass(), "first", null);
        setField(term3598, term3598.getClass(), "last", null);
        setField(term3598, term3598.getClass(), "propListHead", null);
        setIntField(term3598, term3598.getClass(), "sourcePosition", 0);
        setField(term3598, term3598.getClass(), "jsType", null);
        setField(term3598, term3598.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "first", term3598);
        setIntField(term3601, term3601.getClass(), "type", 0);
        setField(term3601, term3601.getClass(), "next", null);
        setField(term3601, term3601.getClass(), "first", null);
        setField(term3601, term3601.getClass(), "last", null);
        setField(term3601, term3601.getClass(), "propListHead", null);
        setIntField(term3601, term3601.getClass(), "sourcePosition", 0);
        setField(term3601, term3601.getClass(), "jsType", null);
        setField(term3601, term3601.getClass(), "parent", null);
        setField(term3584, term3584.getClass(), "last", term3601);
        setField(term3584, term3584.getClass(), "propListHead", null);
        setIntField(term3584, term3584.getClass(), "sourcePosition", 0);
        setField(term3584, term3584.getClass(), "jsType", null);
        setField(term3584, term3584.getClass(), "parent", null);
        term25652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25652, term25652.getClass(), "type", 954234820);
        setIntField(term25653, term25653.getClass(), "type", -1854929057);
        setIntField(term25654, term25654.getClass(), "type", 0);
        setField(term25654, term25654.getClass(), "next", null);
        setField(term25654, term25654.getClass(), "first", null);
        setField(term25654, term25654.getClass(), "last", null);
        setField(term25654, term25654.getClass(), "propListHead", null);
        setIntField(term25654, term25654.getClass(), "sourcePosition", 0);
        setField(term25654, term25654.getClass(), "jsType", null);
        setField(term25654, term25654.getClass(), "parent", null);
        setField(term25653, term25653.getClass(), "next", term25654);
        setIntField(term25655, term25655.getClass(), "type", 0);
        setField(term25655, term25655.getClass(), "next", null);
        setField(term25655, term25655.getClass(), "first", null);
        setField(term25655, term25655.getClass(), "last", null);
        setField(term25655, term25655.getClass(), "propListHead", null);
        setIntField(term25655, term25655.getClass(), "sourcePosition", 0);
        setField(term25655, term25655.getClass(), "jsType", null);
        setField(term25655, term25655.getClass(), "parent", null);
        setField(term25653, term25653.getClass(), "first", term25655);
        setIntField(term25656, term25656.getClass(), "type", 0);
        setField(term25656, term25656.getClass(), "next", null);
        setField(term25656, term25656.getClass(), "first", null);
        setField(term25656, term25656.getClass(), "last", null);
        setField(term25656, term25656.getClass(), "propListHead", null);
        setIntField(term25656, term25656.getClass(), "sourcePosition", 0);
        setField(term25656, term25656.getClass(), "jsType", null);
        setField(term25656, term25656.getClass(), "parent", null);
        setField(term25653, term25653.getClass(), "last", term25656);
        setField(term25653, term25653.getClass(), "propListHead", null);
        setIntField(term25653, term25653.getClass(), "sourcePosition", 0);
        setField(term25653, term25653.getClass(), "jsType", null);
        setField(term25653, term25653.getClass(), "parent", null);
        setField(term25652, term25652.getClass(), "next", term25653);
        setIntField(term25657, term25657.getClass(), "type", 0);
        setField(term25657, term25657.getClass(), "next", null);
        setField(term25657, term25657.getClass(), "first", null);
        setField(term25657, term25657.getClass(), "last", null);
        setField(term25657, term25657.getClass(), "propListHead", null);
        setIntField(term25657, term25657.getClass(), "sourcePosition", 0);
        setField(term25657, term25657.getClass(), "jsType", null);
        setField(term25657, term25657.getClass(), "parent", null);
        setField(term25652, term25652.getClass(), "first", term25657);
        setIntField(term25658, term25658.getClass(), "type", 0);
        setField(term25658, term25658.getClass(), "next", null);
        setField(term25658, term25658.getClass(), "first", null);
        setField(term25658, term25658.getClass(), "last", null);
        setField(term25658, term25658.getClass(), "propListHead", null);
        setIntField(term25658, term25658.getClass(), "sourcePosition", 0);
        setField(term25658, term25658.getClass(), "jsType", null);
        setField(term25658, term25658.getClass(), "parent", null);
        setField(term25652, term25652.getClass(), "last", term25658);
        setField(term25652, term25652.getClass(), "propListHead", null);
        setIntField(term25652, term25652.getClass(), "sourcePosition", 0);
        setField(term25652, term25652.getClass(), "jsType", null);
        setField(term25652, term25652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3584;
        Object retValue = callMethod(klass, "isToStringMethodCall", argTypes, null, args);
        assertTrue(recursiveEquals(term3584, term25652));
        assertTrue(recursiveEquals(retValue, false));
    }

};



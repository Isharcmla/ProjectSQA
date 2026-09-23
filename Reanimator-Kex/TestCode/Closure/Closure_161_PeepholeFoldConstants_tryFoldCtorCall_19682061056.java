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
import java.util.ArrayDeque;

public class PeepholeFoldConstants_tryFoldCtorCall_19682061056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2559;
     Object term2615;

    public PeepholeFoldConstants_tryFoldCtorCall_19682061056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2573 = new ArrayDeque();
        Object term2579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2579, term2579.getClass(), "type", 0);
        setField(term2579, term2579.getClass(), "next", null);
        setField(term2579, term2579.getClass(), "first", null);
        setField(term2579, term2579.getClass(), "last", null);
        setField(term2579, term2579.getClass(), "propListHead", null);
        setIntField(term2579, term2579.getClass(), "sourcePosition", 0);
        setField(term2579, term2579.getClass(), "jsType", null);
        setField(term2579, term2579.getClass(), "parent", null);
        Object term2582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2582, term2582.getClass(), "type", 0);
        setField(term2582, term2582.getClass(), "next", null);
        setField(term2582, term2582.getClass(), "first", null);
        setField(term2582, term2582.getClass(), "last", null);
        setField(term2582, term2582.getClass(), "propListHead", null);
        setIntField(term2582, term2582.getClass(), "sourcePosition", 0);
        setField(term2582, term2582.getClass(), "jsType", null);
        setField(term2582, term2582.getClass(), "parent", null);
        Object term2585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2585, term2585.getClass(), "type", 0);
        setField(term2585, term2585.getClass(), "next", null);
        setField(term2585, term2585.getClass(), "first", null);
        setField(term2585, term2585.getClass(), "last", null);
        setField(term2585, term2585.getClass(), "propListHead", null);
        setIntField(term2585, term2585.getClass(), "sourcePosition", 0);
        setField(term2585, term2585.getClass(), "jsType", null);
        setField(term2585, term2585.getClass(), "parent", null);
        Object term2588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2588, term2588.getClass(), "type", 0);
        setField(term2588, term2588.getClass(), "next", null);
        setField(term2588, term2588.getClass(), "first", null);
        setField(term2588, term2588.getClass(), "last", null);
        setField(term2588, term2588.getClass(), "propListHead", null);
        setIntField(term2588, term2588.getClass(), "sourcePosition", 0);
        setField(term2588, term2588.getClass(), "jsType", null);
        setField(term2588, term2588.getClass(), "parent", null);
        Object term2591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2591, term2591.getClass(), "type", 0);
        setField(term2591, term2591.getClass(), "next", null);
        setField(term2591, term2591.getClass(), "first", null);
        setField(term2591, term2591.getClass(), "last", null);
        setField(term2591, term2591.getClass(), "propListHead", null);
        setIntField(term2591, term2591.getClass(), "sourcePosition", 0);
        setField(term2591, term2591.getClass(), "jsType", null);
        setField(term2591, term2591.getClass(), "parent", null);
        Object term2594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2594, term2594.getClass(), "type", 0);
        setField(term2594, term2594.getClass(), "next", null);
        setField(term2594, term2594.getClass(), "first", null);
        setField(term2594, term2594.getClass(), "last", null);
        setField(term2594, term2594.getClass(), "propListHead", null);
        setIntField(term2594, term2594.getClass(), "sourcePosition", 0);
        setField(term2594, term2594.getClass(), "jsType", null);
        setField(term2594, term2594.getClass(), "parent", null);
        ArrayDeque term2577 = new ArrayDeque();
        ((ArrayDeque) term2577).add(term2579);
        ((ArrayDeque) term2577).add(term2582);
        ((ArrayDeque) term2577).add(term2585);
        ((ArrayDeque) term2577).add(term2588);
        ((ArrayDeque) term2577).add(term2591);
        ((ArrayDeque) term2577).add(term2594);
        ArrayDeque term2599 = new ArrayDeque();
        term2559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term2560 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term2561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2560, term2560.getClass(), "compiler", null);
        setField(term2560, term2560.getClass(), "callback", null);
        setIntField(term2561, term2561.getClass(), "type", -1626451656);
        setIntField(term2563, term2563.getClass(), "type", 0);
        setField(term2563, term2563.getClass(), "next", null);
        setField(term2563, term2563.getClass(), "first", null);
        setField(term2563, term2563.getClass(), "last", null);
        setField(term2563, term2563.getClass(), "propListHead", null);
        setIntField(term2563, term2563.getClass(), "sourcePosition", 0);
        setField(term2563, term2563.getClass(), "jsType", null);
        setField(term2563, term2563.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "next", term2563);
        setIntField(term2566, term2566.getClass(), "type", 0);
        setField(term2566, term2566.getClass(), "next", null);
        setField(term2566, term2566.getClass(), "first", null);
        setField(term2566, term2566.getClass(), "last", null);
        setField(term2566, term2566.getClass(), "propListHead", null);
        setIntField(term2566, term2566.getClass(), "sourcePosition", 0);
        setField(term2566, term2566.getClass(), "jsType", null);
        setField(term2566, term2566.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "first", term2566);
        setIntField(term2569, term2569.getClass(), "type", 0);
        setField(term2569, term2569.getClass(), "next", null);
        setField(term2569, term2569.getClass(), "first", null);
        setField(term2569, term2569.getClass(), "last", null);
        setField(term2569, term2569.getClass(), "propListHead", null);
        setIntField(term2569, term2569.getClass(), "sourcePosition", 0);
        setField(term2569, term2569.getClass(), "jsType", null);
        setField(term2569, term2569.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "last", term2569);
        setField(term2561, term2561.getClass(), "propListHead", null);
        setIntField(term2561, term2561.getClass(), "sourcePosition", 0);
        setField(term2561, term2561.getClass(), "jsType", null);
        setField(term2561, term2561.getClass(), "parent", null);
        setField(term2560, term2560.getClass(), "curNode", term2561);
        setField(term2560, term2560.getClass(), "scopes", term2573);
        setField(term2560, term2560.getClass(), "scopeRoots", term2577);
        setField(term2560, term2560.getClass(), "cfgs", term2599);
        setField(term2560, term2560.getClass(), "sourceName", "xOEqzGAmDU");
        setField(term2560, term2560.getClass(), "scopeCreator", null);
        setField(term2560, term2560.getClass(), "scopeCallback", null);
        setField(term2559, term2559.getClass(), "currentTraversal", term2560);
        term2615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2615, term2615.getClass(), "type", 1801052257);
        setIntField(term2617, term2617.getClass(), "type", -1674430871);
        setIntField(term2619, term2619.getClass(), "type", 0);
        setField(term2619, term2619.getClass(), "next", null);
        setField(term2619, term2619.getClass(), "first", null);
        setField(term2619, term2619.getClass(), "last", null);
        setField(term2619, term2619.getClass(), "propListHead", null);
        setIntField(term2619, term2619.getClass(), "sourcePosition", 0);
        setField(term2619, term2619.getClass(), "jsType", null);
        setField(term2619, term2619.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "next", term2619);
        setIntField(term2622, term2622.getClass(), "type", 0);
        setField(term2622, term2622.getClass(), "next", null);
        setField(term2622, term2622.getClass(), "first", null);
        setField(term2622, term2622.getClass(), "last", null);
        setField(term2622, term2622.getClass(), "propListHead", null);
        setIntField(term2622, term2622.getClass(), "sourcePosition", 0);
        setField(term2622, term2622.getClass(), "jsType", null);
        setField(term2622, term2622.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "first", term2622);
        setIntField(term2625, term2625.getClass(), "type", 0);
        setField(term2625, term2625.getClass(), "next", null);
        setField(term2625, term2625.getClass(), "first", null);
        setField(term2625, term2625.getClass(), "last", null);
        setField(term2625, term2625.getClass(), "propListHead", null);
        setIntField(term2625, term2625.getClass(), "sourcePosition", 0);
        setField(term2625, term2625.getClass(), "jsType", null);
        setField(term2625, term2625.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "last", term2625);
        setField(term2617, term2617.getClass(), "propListHead", null);
        setIntField(term2617, term2617.getClass(), "sourcePosition", 0);
        setField(term2617, term2617.getClass(), "jsType", null);
        setField(term2617, term2617.getClass(), "parent", null);
        setField(term2615, term2615.getClass(), "next", term2617);
        setIntField(term2629, term2629.getClass(), "type", 0);
        setField(term2629, term2629.getClass(), "next", null);
        setField(term2629, term2629.getClass(), "first", null);
        setField(term2629, term2629.getClass(), "last", null);
        setField(term2629, term2629.getClass(), "propListHead", null);
        setIntField(term2629, term2629.getClass(), "sourcePosition", 0);
        setField(term2629, term2629.getClass(), "jsType", null);
        setField(term2629, term2629.getClass(), "parent", null);
        setField(term2615, term2615.getClass(), "first", term2629);
        setIntField(term2632, term2632.getClass(), "type", 0);
        setField(term2632, term2632.getClass(), "next", null);
        setField(term2632, term2632.getClass(), "first", null);
        setField(term2632, term2632.getClass(), "last", null);
        setField(term2632, term2632.getClass(), "propListHead", null);
        setIntField(term2632, term2632.getClass(), "sourcePosition", 0);
        setField(term2632, term2632.getClass(), "jsType", null);
        setField(term2632, term2632.getClass(), "parent", null);
        setField(term2615, term2615.getClass(), "last", term2632);
        setField(term2615, term2615.getClass(), "propListHead", null);
        setIntField(term2615, term2615.getClass(), "sourcePosition", 0);
        setField(term2615, term2615.getClass(), "jsType", null);
        setField(term2615, term2615.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2615;
        try {
            callMethod(klass, "tryFoldCtorCall", argTypes, term2559, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



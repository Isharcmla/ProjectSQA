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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_containsType_951752563251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2570;
     Object term2597;

    public NodeUtil_containsType_951752563251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2570, term2570.getClass(), "type", -1747711865);
        setIntField(term2572, term2572.getClass(), "type", 682812715);
        setIntField(term2574, term2574.getClass(), "type", -1092883950);
        setIntField(term2576, term2576.getClass(), "type", 950385621);
        setIntField(term2578, term2578.getClass(), "type", -232352320);
        setField(term2578, term2578.getClass(), "next", null);
        setField(term2578, term2578.getClass(), "first", null);
        setField(term2578, term2578.getClass(), "last", null);
        setField(term2578, term2578.getClass(), "propListHead", null);
        setIntField(term2578, term2578.getClass(), "sourcePosition", 0);
        setField(term2578, term2578.getClass(), "jsType", null);
        setField(term2578, term2578.getClass(), "parent", null);
        setField(term2576, term2576.getClass(), "next", term2578);
        setIntField(term2581, term2581.getClass(), "type", -232333014);
        setField(term2581, term2581.getClass(), "next", null);
        setField(term2581, term2581.getClass(), "first", null);
        setField(term2581, term2581.getClass(), "last", term2578);
        setField(term2581, term2581.getClass(), "propListHead", null);
        setIntField(term2581, term2581.getClass(), "sourcePosition", 0);
        setField(term2581, term2581.getClass(), "jsType", null);
        setField(term2581, term2581.getClass(), "parent", null);
        setField(term2576, term2576.getClass(), "first", term2581);
        setField(term2576, term2576.getClass(), "last", term2574);
        setField(term2576, term2576.getClass(), "propListHead", null);
        setIntField(term2576, term2576.getClass(), "sourcePosition", 0);
        setField(term2576, term2576.getClass(), "jsType", null);
        setField(term2576, term2576.getClass(), "parent", null);
        setField(term2574, term2574.getClass(), "next", term2576);
        setField(term2574, term2574.getClass(), "first", term2578);
        setIntField(term2585, term2585.getClass(), "type", -1602072035);
        setIntField(term2587, term2587.getClass(), "type", 1902624392);
        setField(term2587, term2587.getClass(), "next", null);
        setField(term2587, term2587.getClass(), "first", term2581);
        setField(term2587, term2587.getClass(), "last", term2576);
        setField(term2587, term2587.getClass(), "propListHead", null);
        setIntField(term2587, term2587.getClass(), "sourcePosition", 0);
        setField(term2587, term2587.getClass(), "jsType", null);
        setField(term2587, term2587.getClass(), "parent", null);
        setField(term2585, term2585.getClass(), "next", term2587);
        setField(term2585, term2585.getClass(), "first", term2572);
        setField(term2585, term2585.getClass(), "last", term2572);
        setField(term2585, term2585.getClass(), "propListHead", null);
        setIntField(term2585, term2585.getClass(), "sourcePosition", 0);
        setField(term2585, term2585.getClass(), "jsType", null);
        setField(term2585, term2585.getClass(), "parent", null);
        setField(term2574, term2574.getClass(), "last", term2585);
        setField(term2574, term2574.getClass(), "propListHead", null);
        setIntField(term2574, term2574.getClass(), "sourcePosition", 0);
        setField(term2574, term2574.getClass(), "jsType", null);
        setField(term2574, term2574.getClass(), "parent", null);
        setField(term2572, term2572.getClass(), "next", term2574);
        setIntField(term2592, term2592.getClass(), "type", 904607217);
        setField(term2592, term2592.getClass(), "next", term2585);
        setField(term2592, term2592.getClass(), "first", term2587);
        setField(term2592, term2592.getClass(), "last", term2570);
        setField(term2592, term2592.getClass(), "propListHead", null);
        setIntField(term2592, term2592.getClass(), "sourcePosition", 0);
        setField(term2592, term2592.getClass(), "jsType", null);
        setField(term2592, term2592.getClass(), "parent", null);
        setField(term2572, term2572.getClass(), "first", term2592);
        setField(term2572, term2572.getClass(), "last", term2592);
        setField(term2572, term2572.getClass(), "propListHead", null);
        setIntField(term2572, term2572.getClass(), "sourcePosition", 0);
        setField(term2572, term2572.getClass(), "jsType", null);
        setField(term2572, term2572.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "next", term2572);
        setField(term2570, term2570.getClass(), "first", term2576);
        setField(term2570, term2570.getClass(), "last", term2578);
        setField(term2570, term2570.getClass(), "propListHead", null);
        setIntField(term2570, term2570.getClass(), "sourcePosition", 0);
        setField(term2570, term2570.getClass(), "jsType", null);
        setField(term2570, term2570.getClass(), "parent", null);
        term2597 = new Integer(434914590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2570;
        args[1] = term2597;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_toStringTreeImpl_1317251895269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2483;

    public Node_toStringTreeImpl_1317251895269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2483, term2483.getClass(), "type", 797015478);
        setIntField(term2485, term2485.getClass(), "type", 717574276);
        setIntField(term2487, term2487.getClass(), "type", 1795369860);
        setIntField(term2489, term2489.getClass(), "type", -570164389);
        setIntField(term2491, term2491.getClass(), "type", 43200329);
        setField(term2491, term2491.getClass(), "next", null);
        setField(term2491, term2491.getClass(), "first", null);
        setField(term2491, term2491.getClass(), "last", null);
        setField(term2491, term2491.getClass(), "propListHead", null);
        setIntField(term2491, term2491.getClass(), "sourcePosition", 0);
        setField(term2491, term2491.getClass(), "jsType", null);
        setField(term2491, term2491.getClass(), "parent", null);
        setField(term2489, term2489.getClass(), "next", term2491);
        setIntField(term2494, term2494.getClass(), "type", 998679955);
        setField(term2494, term2494.getClass(), "next", null);
        setField(term2494, term2494.getClass(), "first", null);
        setField(term2494, term2494.getClass(), "last", term2491);
        setField(term2494, term2494.getClass(), "propListHead", null);
        setIntField(term2494, term2494.getClass(), "sourcePosition", 0);
        setField(term2494, term2494.getClass(), "jsType", null);
        setField(term2494, term2494.getClass(), "parent", null);
        setField(term2489, term2489.getClass(), "first", term2494);
        setField(term2489, term2489.getClass(), "last", term2487);
        setField(term2489, term2489.getClass(), "propListHead", null);
        setIntField(term2489, term2489.getClass(), "sourcePosition", 0);
        setField(term2489, term2489.getClass(), "jsType", null);
        setField(term2489, term2489.getClass(), "parent", null);
        setField(term2487, term2487.getClass(), "next", term2489);
        setField(term2487, term2487.getClass(), "first", term2491);
        setIntField(term2498, term2498.getClass(), "type", 1389452261);
        setIntField(term2500, term2500.getClass(), "type", 1615957955);
        setField(term2500, term2500.getClass(), "next", null);
        setField(term2500, term2500.getClass(), "first", term2494);
        setField(term2500, term2500.getClass(), "last", term2489);
        setField(term2500, term2500.getClass(), "propListHead", null);
        setIntField(term2500, term2500.getClass(), "sourcePosition", 0);
        setField(term2500, term2500.getClass(), "jsType", null);
        setField(term2500, term2500.getClass(), "parent", null);
        setField(term2498, term2498.getClass(), "next", term2500);
        setField(term2498, term2498.getClass(), "first", term2485);
        setField(term2498, term2498.getClass(), "last", term2485);
        setField(term2498, term2498.getClass(), "propListHead", null);
        setIntField(term2498, term2498.getClass(), "sourcePosition", 0);
        setField(term2498, term2498.getClass(), "jsType", null);
        setField(term2498, term2498.getClass(), "parent", null);
        setField(term2487, term2487.getClass(), "last", term2498);
        setField(term2487, term2487.getClass(), "propListHead", null);
        setIntField(term2487, term2487.getClass(), "sourcePosition", 0);
        setField(term2487, term2487.getClass(), "jsType", null);
        setField(term2487, term2487.getClass(), "parent", null);
        setField(term2485, term2485.getClass(), "next", term2487);
        setIntField(term2505, term2505.getClass(), "type", 1779370220);
        setField(term2505, term2505.getClass(), "next", term2498);
        setField(term2505, term2505.getClass(), "first", term2500);
        setField(term2505, term2505.getClass(), "last", term2483);
        setField(term2505, term2505.getClass(), "propListHead", null);
        setIntField(term2505, term2505.getClass(), "sourcePosition", 0);
        setField(term2505, term2505.getClass(), "jsType", null);
        setField(term2505, term2505.getClass(), "parent", null);
        setField(term2485, term2485.getClass(), "first", term2505);
        setField(term2485, term2485.getClass(), "last", term2505);
        setField(term2485, term2485.getClass(), "propListHead", null);
        setIntField(term2485, term2485.getClass(), "sourcePosition", 0);
        setField(term2485, term2485.getClass(), "jsType", null);
        setField(term2485, term2485.getClass(), "parent", null);
        setField(term2483, term2483.getClass(), "next", term2485);
        setField(term2483, term2483.getClass(), "first", term2489);
        setField(term2483, term2483.getClass(), "last", term2491);
        setField(term2483, term2483.getClass(), "propListHead", null);
        setIntField(term2483, term2483.getClass(), "sourcePosition", 0);
        setField(term2483, term2483.getClass(), "jsType", null);
        setField(term2483, term2483.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStringTreeImpl", argTypes, term2483, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


